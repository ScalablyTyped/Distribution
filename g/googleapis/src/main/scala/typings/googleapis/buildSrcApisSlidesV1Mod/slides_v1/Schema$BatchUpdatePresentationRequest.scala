package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for PresentationsService.BatchUpdatePresentation.
  */
@js.native
trait Schema$BatchUpdatePresentationRequest extends js.Object {
  /**
    * A list of updates to apply to the presentation.
    */
  var requests: js.UndefOr[js.Array[Schema$Request]] = js.native
  /**
    * Provides control over how write requests are executed.
    */
  var writeControl: js.UndefOr[Schema$WriteControl] = js.native
}

object Schema$BatchUpdatePresentationRequest {
  @scala.inline
  def apply(requests: js.Array[Schema$Request] = null, writeControl: Schema$WriteControl = null): Schema$BatchUpdatePresentationRequest = {
    val __obj = js.Dynamic.literal()
    if (requests != null) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    if (writeControl != null) __obj.updateDynamic("writeControl")(writeControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchUpdatePresentationRequest]
  }
}

