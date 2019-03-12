package typings
package atGoogleDashCloudCommonLib.buildSrcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MakeAuthenticatedRequestOptions extends js.Object {
  @JSName("onAuthenticated")
  var onAuthenticated_Original: OnAuthenticatedCallback = js.native
  def onAuthenticated(): scala.Unit = js.native
  def onAuthenticated(err: scala.Null, reqOpts: DecorateRequestOptions): scala.Unit = js.native
  def onAuthenticated(err: stdLib.Error): scala.Unit = js.native
  def onAuthenticated(err: stdLib.Error, reqOpts: DecorateRequestOptions): scala.Unit = js.native
}

