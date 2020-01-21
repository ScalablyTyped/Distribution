package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllocateInfo extends js.Object {
  /**
    * A list of label keys that were unused by the server in processing the
    * request. Thus, for similar requests repeated in a certain future time
    * window, the caller can choose to ignore these labels in the requests
    * to achieve better client-side cache hits and quota aggregation.
    */
  var unusedArguments: js.UndefOr[js.Array[String]] = js.undefined
}

object AllocateInfo {
  @scala.inline
  def apply(unusedArguments: js.Array[String] = null): AllocateInfo = {
    val __obj = js.Dynamic.literal()
    if (unusedArguments != null) __obj.updateDynamic("unusedArguments")(unusedArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateInfo]
  }
}

