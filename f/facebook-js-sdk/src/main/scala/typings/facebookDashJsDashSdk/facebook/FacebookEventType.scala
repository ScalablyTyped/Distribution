package typings.facebookDashJsDashSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDOTauthResponseChange
  - typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDOTlogout
  - typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDOTlogin
  - typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDOTstatusChange
  - typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.xfbmlDOTrender
*/
trait FacebookEventType extends js.Object

object FacebookEventType {
  @scala.inline
  def authDOTauthResponseChange: typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDOTauthResponseChange = this.cast("auth.authResponseChange")
  @scala.inline
  def authDOTlogin: typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDOTlogin = this.cast("auth.login")
  @scala.inline
  def authDOTlogout: typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDOTlogout = this.cast("auth.logout")
  @scala.inline
  def authDOTstatusChange: typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDOTstatusChange = this.cast("auth.statusChange")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xfbmlDOTrender: typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.xfbmlDOTrender = this.cast("xfbml.render")
}

