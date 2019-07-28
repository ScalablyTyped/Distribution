package typings.atGoogleDashCloudCommon.buildSrcUtilMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MakeAuthenticatedRequestOptions extends js.Object {
  @JSName("onAuthenticated")
  var onAuthenticated_Original: OnAuthenticatedCallback = js.native
  def onAuthenticated(): Unit = js.native
  def onAuthenticated(err: Null, reqOpts: DecorateRequestOptions): Unit = js.native
  def onAuthenticated(err: Error): Unit = js.native
  def onAuthenticated(err: Error, reqOpts: DecorateRequestOptions): Unit = js.native
}

