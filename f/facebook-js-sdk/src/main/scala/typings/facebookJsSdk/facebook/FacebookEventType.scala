package typings.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.facebookJsSdk.facebookJsSdkStrings.authDotauthResponseChange
  - typings.facebookJsSdk.facebookJsSdkStrings.authDotlogout
  - typings.facebookJsSdk.facebookJsSdkStrings.authDotlogin
  - typings.facebookJsSdk.facebookJsSdkStrings.authDotstatusChange
  - typings.facebookJsSdk.facebookJsSdkStrings.xfbmlDotrender
*/
trait FacebookEventType extends js.Object

object FacebookEventType {
  @scala.inline
  def authDotauthResponseChange: typings.facebookJsSdk.facebookJsSdkStrings.authDotauthResponseChange = this.cast("auth.authResponseChange")
  @scala.inline
  def authDotlogin: typings.facebookJsSdk.facebookJsSdkStrings.authDotlogin = this.cast("auth.login")
  @scala.inline
  def authDotlogout: typings.facebookJsSdk.facebookJsSdkStrings.authDotlogout = this.cast("auth.logout")
  @scala.inline
  def authDotstatusChange: typings.facebookJsSdk.facebookJsSdkStrings.authDotstatusChange = this.cast("auth.statusChange")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def xfbmlDotrender: typings.facebookJsSdk.facebookJsSdkStrings.xfbmlDotrender = this.cast("xfbml.render")
}

