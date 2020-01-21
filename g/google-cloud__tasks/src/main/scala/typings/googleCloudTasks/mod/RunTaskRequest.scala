package typings.googleCloudTasks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunTaskRequest extends js.Object {
  var responseView: js.UndefOr[View] = js.undefined
}

object RunTaskRequest {
  @scala.inline
  def apply(responseView: View = null): RunTaskRequest = {
    val __obj = js.Dynamic.literal()
    if (responseView != null) __obj.updateDynamic("responseView")(responseView.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunTaskRequest]
  }
}

