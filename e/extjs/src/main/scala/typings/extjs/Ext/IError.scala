package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IError extends StObject {
  
  /** [Property] (Boolean) */
  var ignore: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  @JSName("notify")
  var notify_FIError: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Provides a custom string representation of the error object
    * @returns String The error message. If raised from within the Ext 4 class system, the error message will also include the raising class and method names, if available.
    */
  @JSName("toString")
  var toString_FIError: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}
object IError {
  
  inline def apply(): IError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IError]
  }
  
  extension [Self <: IError](x: Self) {
    
    inline def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    inline def setNotify_Undefined: Self = StObject.set(x, "notify", js.undefined)
    
    inline def setToString_(value: () => java.lang.String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
    
    inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
  }
}
