package typings.gapiDotClientDotGames

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Apnsdevicetoken extends js.Object {
  /** Device token supplied by an iOS system call to register for remote notifications. Encode this field as web-safe base64. */
  var apns_device_token: js.UndefOr[String] = js.undefined
  /** Indicates whether this token should be used for the production or sandbox APNS server. */
  var apns_environment: js.UndefOr[String] = js.undefined
}

object Anon_Apnsdevicetoken {
  @scala.inline
  def apply(apns_device_token: String = null, apns_environment: String = null): Anon_Apnsdevicetoken = {
    val __obj = js.Dynamic.literal()
    if (apns_device_token != null) __obj.updateDynamic("apns_device_token")(apns_device_token.asInstanceOf[js.Any])
    if (apns_environment != null) __obj.updateDynamic("apns_environment")(apns_environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Apnsdevicetoken]
  }
}

