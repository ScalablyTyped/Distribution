package typings.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.facebookJsSdk.facebookJsSdkStrings.authorization_expired
  - typings.facebookJsSdk.facebookJsSdkStrings.connected
  - typings.facebookJsSdk.facebookJsSdkStrings.not_authorized
  - typings.facebookJsSdk.facebookJsSdkStrings.unknown
*/
trait LoginStatus extends js.Object

object LoginStatus {
  @scala.inline
  def authorization_expired: typings.facebookJsSdk.facebookJsSdkStrings.authorization_expired = this.cast("authorization_expired")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typings.facebookJsSdk.facebookJsSdkStrings.connected = this.cast("connected")
  @scala.inline
  def not_authorized: typings.facebookJsSdk.facebookJsSdkStrings.not_authorized = this.cast("not_authorized")
  @scala.inline
  def unknown: typings.facebookJsSdk.facebookJsSdkStrings.unknown = this.cast("unknown")
}

