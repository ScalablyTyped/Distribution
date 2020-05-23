package typings.expressWechatAccess.mod

import typings.expressWechatAccess.anon.AccessTokenUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-wechat-access", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: AccessTokenUrl): WeMiddleware = js.native
  def apply(options: AccessTokenUrl, errorHandler: js.Function1[/* e */ js.Any, _]): WeMiddleware = js.native
}

