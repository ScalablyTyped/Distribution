package typings.expressWechatAccess.mod

import typings.expressWechatAccess.AnonAccessTokenUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-wechat-access", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: AnonAccessTokenUrl): WeMiddleware = js.native
  def apply(options: AnonAccessTokenUrl, errorHandler: js.Function1[/* e */ js.Any, _]): WeMiddleware = js.native
}

