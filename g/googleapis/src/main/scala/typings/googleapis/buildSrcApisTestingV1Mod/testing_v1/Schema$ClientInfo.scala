package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the client which invoked the test.
  */
@js.native
trait Schema$ClientInfo extends js.Object {
  /**
    * The list of detailed information about client.
    */
  var clientInfoDetails: js.UndefOr[js.Array[Schema$ClientInfoDetail]] = js.native
  /**
    * Required. Client name, such as gcloud.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$ClientInfo {
  @scala.inline
  def apply(clientInfoDetails: js.Array[Schema$ClientInfoDetail] = null, name: String = null): Schema$ClientInfo = {
    val __obj = js.Dynamic.literal()
    if (clientInfoDetails != null) __obj.updateDynamic("clientInfoDetails")(clientInfoDetails.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ClientInfo]
  }
}

