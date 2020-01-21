package typings.gapiClientTesting.gapi.client.testing

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
    if (clientInfoDetails != null) __obj.updateDynamic("clientInfoDetails")(clientInfoDetails.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientInfo]
  }
}

