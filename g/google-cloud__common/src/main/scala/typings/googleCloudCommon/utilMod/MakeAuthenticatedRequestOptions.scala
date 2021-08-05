package typings.googleCloudCommon.utilMod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MakeAuthenticatedRequestOptions extends StObject {
  
  def onAuthenticated(): Unit
  def onAuthenticated(err: Null, reqOpts: DecorateRequestOptions): Unit
  def onAuthenticated(err: Error): Unit
  def onAuthenticated(err: Error, reqOpts: DecorateRequestOptions): Unit
  @JSName("onAuthenticated")
  var onAuthenticated_Original: OnAuthenticatedCallback
}
object MakeAuthenticatedRequestOptions {
  
  inline def apply(
    onAuthenticated: (/* err */ Error | Null, /* reqOpts */ js.UndefOr[DecorateRequestOptions]) => Unit
  ): MakeAuthenticatedRequestOptions = {
    val __obj = js.Dynamic.literal(onAuthenticated = js.Any.fromFunction2(onAuthenticated))
    __obj.asInstanceOf[MakeAuthenticatedRequestOptions]
  }
  
  extension [Self <: MakeAuthenticatedRequestOptions](x: Self) {
    
    inline def setOnAuthenticated(value: (/* err */ Error | Null, /* reqOpts */ js.UndefOr[DecorateRequestOptions]) => Unit): Self = StObject.set(x, "onAuthenticated", js.Any.fromFunction2(value))
  }
}
