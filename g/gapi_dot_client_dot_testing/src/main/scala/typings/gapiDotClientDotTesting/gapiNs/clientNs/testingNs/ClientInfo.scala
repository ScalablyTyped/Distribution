package typings.gapiDotClientDotTesting.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientInfo extends js.Object {
  /** The list of detailed information about client. */
  var clientInfoDetails: js.UndefOr[js.Array[ClientInfoDetail]] = js.undefined
  /**
    * Client name, such as gcloud.
    * Required
    */
  var name: js.UndefOr[String] = js.undefined
}

object ClientInfo {
  @scala.inline
  def apply(clientInfoDetails: js.Array[ClientInfoDetail] = null, name: String = null): ClientInfo = {
    val __obj = js.Dynamic.literal()
    if (clientInfoDetails != null) __obj.updateDynamic("clientInfoDetails")(clientInfoDetails)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ClientInfo]
  }
}

