package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeFunctionOptions extends StObject {
  
  var abi: js.UndefOr[NativeABI] = js.undefined
  
  var exceptions: js.UndefOr[ExceptionsBehavior] = js.undefined
  
  var scheduling: js.UndefOr[SchedulingBehavior] = js.undefined
  
  var traps: js.UndefOr[CodeTraps] = js.undefined
}
object NativeFunctionOptions {
  
  inline def apply(): NativeFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeFunctionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeFunctionOptions] (val x: Self) extends AnyVal {
    
    inline def setAbi(value: NativeABI): Self = StObject.set(x, "abi", value.asInstanceOf[js.Any])
    
    inline def setAbiUndefined: Self = StObject.set(x, "abi", js.undefined)
    
    inline def setExceptions(value: ExceptionsBehavior): Self = StObject.set(x, "exceptions", value.asInstanceOf[js.Any])
    
    inline def setExceptionsUndefined: Self = StObject.set(x, "exceptions", js.undefined)
    
    inline def setScheduling(value: SchedulingBehavior): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
    
    inline def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
    
    inline def setTraps(value: CodeTraps): Self = StObject.set(x, "traps", value.asInstanceOf[js.Any])
    
    inline def setTrapsUndefined: Self = StObject.set(x, "traps", js.undefined)
  }
}
