package typings.googleCloudCommon.utilMod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MakeAuthenticatedRequestOptions extends StObject {
  
  def onAuthenticated(): Unit = js.native
  def onAuthenticated(err: Null, reqOpts: DecorateRequestOptions): Unit = js.native
  def onAuthenticated(err: Error): Unit = js.native
  def onAuthenticated(err: Error, reqOpts: DecorateRequestOptions): Unit = js.native
  @JSName("onAuthenticated")
  var onAuthenticated_Original: OnAuthenticatedCallback = js.native
}
