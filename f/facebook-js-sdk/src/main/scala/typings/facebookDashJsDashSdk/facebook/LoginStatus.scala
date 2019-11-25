package typings.facebookDashJsDashSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authorization_expired
  - typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.connected
  - typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.not_authorized
  - typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.unknown
*/
trait LoginStatus extends js.Object

object LoginStatus {
  @scala.inline
  def authorization_expired: typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authorization_expired = this.cast("authorization_expired")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.connected = this.cast("connected")
  @scala.inline
  def not_authorized: typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.not_authorized = this.cast("not_authorized")
  @scala.inline
  def unknown: typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.unknown = this.cast("unknown")
}

