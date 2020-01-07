package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to compute the SourceMetadata of a Source.
  */
@js.native
trait Schema$SourceGetMetadataRequest extends js.Object {
  /**
    * Specification of the source whose metadata should be computed.
    */
  var source: js.UndefOr[Schema$Source] = js.native
}

object Schema$SourceGetMetadataRequest {
  @scala.inline
  def apply(source: Schema$Source = null): Schema$SourceGetMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SourceGetMetadataRequest]
  }
}

