package typings.editly.mod

import typings.fabric.mod.fabric.Canvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomFunctionCallbacks extends StObject {
  
  var onClose: js.UndefOr[OnCloseCallback] = js.undefined
  
  def onRender(progress: Double, canvas: Canvas): OptionalPromise[Unit]
  @JSName("onRender")
  var onRender_Original: OnRenderCallback
}
object CustomFunctionCallbacks {
  
  inline def apply(onRender: (/* progress */ Double, /* canvas */ Canvas) => OptionalPromise[Unit]): CustomFunctionCallbacks = {
    val __obj = js.Dynamic.literal(onRender = js.Any.fromFunction2(onRender))
    __obj.asInstanceOf[CustomFunctionCallbacks]
  }
  
  extension [Self <: CustomFunctionCallbacks](x: Self) {
    
    inline def setOnClose(value: () => OptionalPromise[Unit]): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnRender(value: (/* progress */ Double, /* canvas */ Canvas) => OptionalPromise[Unit]): Self = StObject.set(x, "onRender", js.Any.fromFunction2(value))
  }
}
