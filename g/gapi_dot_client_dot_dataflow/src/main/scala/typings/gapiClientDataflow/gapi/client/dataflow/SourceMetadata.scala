package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMetadata extends js.Object {
  /**
    * An estimate of the total size (in bytes) of the data that would be
    * read from this source.  This estimate is in terms of external storage
    * size, before any decompression or other processing done by the reader.
    */
  var estimatedSizeBytes: js.UndefOr[String] = js.undefined
  /**
    * Specifies that the size of this source is known to be infinite
    * (this is a streaming source).
    */
  var infinite: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether this source is known to produce key/value pairs with
    * the (encoded) keys in lexicographically sorted order.
    */
  var producesSortedKeys: js.UndefOr[Boolean] = js.undefined
}

object SourceMetadata {
  @scala.inline
  def apply(
    estimatedSizeBytes: String = null,
    infinite: js.UndefOr[Boolean] = js.undefined,
    producesSortedKeys: js.UndefOr[Boolean] = js.undefined
  ): SourceMetadata = {
    val __obj = js.Dynamic.literal()
    if (estimatedSizeBytes != null) __obj.updateDynamic("estimatedSizeBytes")(estimatedSizeBytes.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(producesSortedKeys)) __obj.updateDynamic("producesSortedKeys")(producesSortedKeys.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMetadata]
  }
}

