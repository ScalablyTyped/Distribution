package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMetadata extends js.Object {
  /**
    * An estimate of the total size (in bytes) of the data that would be
    * read from this source.  This estimate is in terms of external storage
    * size, before any decompression or other processing done by the reader.
    */
  var estimatedSizeBytes: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies that the size of this source is known to be infinite
    * (this is a streaming source).
    */
  var infinite: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether this source is known to produce key/value pairs with
    * the (encoded) keys in lexicographically sorted order.
    */
  var producesSortedKeys: js.UndefOr[scala.Boolean] = js.undefined
}

