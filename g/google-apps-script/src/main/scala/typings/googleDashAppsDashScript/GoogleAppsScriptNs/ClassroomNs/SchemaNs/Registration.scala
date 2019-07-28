package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registration extends js.Object {
  var cloudPubsubTopic: js.UndefOr[CloudPubsubTopic] = js.undefined
  var expiryTime: js.UndefOr[String] = js.undefined
  var feed: js.UndefOr[Feed] = js.undefined
  var registrationId: js.UndefOr[String] = js.undefined
}

object Registration {
  @scala.inline
  def apply(
    cloudPubsubTopic: CloudPubsubTopic = null,
    expiryTime: String = null,
    feed: Feed = null,
    registrationId: String = null
  ): Registration = {
    val __obj = js.Dynamic.literal()
    if (cloudPubsubTopic != null) __obj.updateDynamic("cloudPubsubTopic")(cloudPubsubTopic)
    if (expiryTime != null) __obj.updateDynamic("expiryTime")(expiryTime)
    if (feed != null) __obj.updateDynamic("feed")(feed)
    if (registrationId != null) __obj.updateDynamic("registrationId")(registrationId)
    __obj.asInstanceOf[Registration]
  }
}

