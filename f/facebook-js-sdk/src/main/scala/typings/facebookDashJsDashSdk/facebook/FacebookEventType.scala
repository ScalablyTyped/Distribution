package typings.facebookDashJsDashSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDotauthResponseChange
  - typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDotlogout
  - typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDotlogin
  - typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDotstatusChange
  - typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.xfbmlDotrender
*/
trait FacebookEventType extends js.Object

object FacebookEventType {
  @scala.inline
  def authDotauthResponseChange: typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDotauthResponseChange = this.cast("auth.authResponseChange")
  @scala.inline
  def authDotlogin: typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDotlogin = this.cast("auth.login")
  @scala.inline
  def authDotlogout: typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDotlogout = this.cast("auth.logout")
  @scala.inline
  def authDotstatusChange: typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.authDotstatusChange = this.cast("auth.statusChange")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xfbmlDotrender: typings.facebookDashJsDashSdk.facebookDashJsDashSdkStrings.xfbmlDotrender = this.cast("xfbml.render")
}

