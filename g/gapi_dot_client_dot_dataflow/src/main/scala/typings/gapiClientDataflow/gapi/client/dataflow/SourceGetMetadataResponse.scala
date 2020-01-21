package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceGetMetadataResponse extends js.Object {
  /** The computed metadata. */
  var metadata: js.UndefOr[SourceMetadata] = js.undefined
}

object SourceGetMetadataResponse {
  @scala.inline
  def apply(metadata: SourceMetadata = null): SourceGetMetadataResponse = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceGetMetadataResponse]
  }
}

