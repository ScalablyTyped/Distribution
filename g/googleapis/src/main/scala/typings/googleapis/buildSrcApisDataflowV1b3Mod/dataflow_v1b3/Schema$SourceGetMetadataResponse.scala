package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of a SourceGetMetadataOperation.
  */
@js.native
trait Schema$SourceGetMetadataResponse extends js.Object {
  /**
    * The computed metadata.
    */
  var metadata: js.UndefOr[Schema$SourceMetadata] = js.native
}

object Schema$SourceGetMetadataResponse {
  @scala.inline
  def apply(metadata: Schema$SourceMetadata = null): Schema$SourceGetMetadataResponse = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SourceGetMetadataResponse]
  }
}

