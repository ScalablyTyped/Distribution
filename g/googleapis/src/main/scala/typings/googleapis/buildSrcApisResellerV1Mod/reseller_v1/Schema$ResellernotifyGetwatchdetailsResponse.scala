package typings.googleapis.buildSrcApisResellerV1Mod.reseller_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for resellernotify getwatchdetails response.
  */
@js.native
trait Schema$ResellernotifyGetwatchdetailsResponse extends js.Object {
  /**
    * List of registered service accounts.
    */
  var serviceAccountEmailAddresses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Topic name of the PubSub
    */
  var topicName: js.UndefOr[String] = js.native
}

object Schema$ResellernotifyGetwatchdetailsResponse {
  @scala.inline
  def apply(serviceAccountEmailAddresses: js.Array[String] = null, topicName: String = null): Schema$ResellernotifyGetwatchdetailsResponse = {
    val __obj = js.Dynamic.literal()
    if (serviceAccountEmailAddresses != null) __obj.updateDynamic("serviceAccountEmailAddresses")(serviceAccountEmailAddresses.asInstanceOf[js.Any])
    if (topicName != null) __obj.updateDynamic("topicName")(topicName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResellernotifyGetwatchdetailsResponse]
  }
}

