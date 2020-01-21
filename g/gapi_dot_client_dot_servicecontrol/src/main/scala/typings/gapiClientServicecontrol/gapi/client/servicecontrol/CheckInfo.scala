package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckInfo extends js.Object {
  /** Consumer info of this check. */
  var consumerInfo: js.UndefOr[ConsumerInfo] = js.undefined
  /**
    * A list of fields and label keys that are ignored by the server.
    * The client doesn't need to send them for following requests to improve
    * performance and allow better aggregation.
    */
  var unusedArguments: js.UndefOr[js.Array[String]] = js.undefined
}

object CheckInfo {
  @scala.inline
  def apply(consumerInfo: ConsumerInfo = null, unusedArguments: js.Array[String] = null): CheckInfo = {
    val __obj = js.Dynamic.literal()
    if (consumerInfo != null) __obj.updateDynamic("consumerInfo")(consumerInfo.asInstanceOf[js.Any])
    if (unusedArguments != null) __obj.updateDynamic("unusedArguments")(unusedArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckInfo]
  }
}

