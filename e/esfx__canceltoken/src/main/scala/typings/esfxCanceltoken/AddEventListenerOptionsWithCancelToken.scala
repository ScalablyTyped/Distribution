package typings.esfxCanceltoken

import typings.esfxCanceltoken.mod.CancelToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<std.AddEventListenerOptions, 'signal'> */
trait AddEventListenerOptionsWithCancelToken extends StObject {
  
  var capture: js.UndefOr[Boolean] = js.undefined
  
  var once: js.UndefOr[Boolean] = js.undefined
  
  var passive: js.UndefOr[Boolean] = js.undefined
  
  var signal: js.UndefOr[CancelToken] = js.undefined
}
object AddEventListenerOptionsWithCancelToken {
  
  inline def apply(): AddEventListenerOptionsWithCancelToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddEventListenerOptionsWithCancelToken]
  }
  
  extension [Self <: AddEventListenerOptionsWithCancelToken](x: Self) {
    
    inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
    
    inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
    
    inline def setSignal(value: CancelToken): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
