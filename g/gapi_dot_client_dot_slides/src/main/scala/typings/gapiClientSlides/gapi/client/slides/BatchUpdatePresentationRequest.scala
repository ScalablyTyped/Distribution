package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdatePresentationRequest extends js.Object {
  /** A list of updates to apply to the presentation. */
  var requests: js.UndefOr[js.Array[Request]] = js.undefined
  /** Provides control over how write requests are executed. */
  var writeControl: js.UndefOr[WriteControl] = js.undefined
}

object BatchUpdatePresentationRequest {
  @scala.inline
  def apply(requests: js.Array[Request] = null, writeControl: WriteControl = null): BatchUpdatePresentationRequest = {
    val __obj = js.Dynamic.literal()
    if (requests != null) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    if (writeControl != null) __obj.updateDynamic("writeControl")(writeControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdatePresentationRequest]
  }
}

