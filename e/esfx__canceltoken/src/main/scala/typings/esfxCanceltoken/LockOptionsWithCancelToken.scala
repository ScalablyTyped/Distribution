package typings.esfxCanceltoken

import typings.esfxCanceltoken.mod.CancelToken
import typings.std.LockMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<std.LockOptions, 'signal'> */
trait LockOptionsWithCancelToken extends StObject {
  
  var ifAvailable: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[LockMode] = js.undefined
  
  var signal: js.UndefOr[CancelToken] = js.undefined
  
  var steal: js.UndefOr[Boolean] = js.undefined
}
object LockOptionsWithCancelToken {
  
  inline def apply(): LockOptionsWithCancelToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LockOptionsWithCancelToken]
  }
  
  extension [Self <: LockOptionsWithCancelToken](x: Self) {
    
    inline def setIfAvailable(value: Boolean): Self = StObject.set(x, "ifAvailable", value.asInstanceOf[js.Any])
    
    inline def setIfAvailableUndefined: Self = StObject.set(x, "ifAvailable", js.undefined)
    
    inline def setMode(value: LockMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSignal(value: CancelToken): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSteal(value: Boolean): Self = StObject.set(x, "steal", value.asInstanceOf[js.Any])
    
    inline def setStealUndefined: Self = StObject.set(x, "steal", js.undefined)
  }
}
