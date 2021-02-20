package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeFunctionOptions extends StObject {
  
  var abi: js.UndefOr[NativeABI] = js.native
  
  var exceptions: js.UndefOr[ExceptionsBehavior] = js.native
  
  var scheduling: js.UndefOr[SchedulingBehavior] = js.native
  
  var traps: js.UndefOr[CodeTraps] = js.native
}
object NativeFunctionOptions {
  
  @scala.inline
  def apply(): NativeFunctionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeFunctionOptions]
  }
  
  @scala.inline
  implicit class NativeFunctionOptionsMutableBuilder[Self <: NativeFunctionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbi(value: NativeABI): Self = StObject.set(x, "abi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbiUndefined: Self = StObject.set(x, "abi", js.undefined)
    
    @scala.inline
    def setExceptions(value: ExceptionsBehavior): Self = StObject.set(x, "exceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionsUndefined: Self = StObject.set(x, "exceptions", js.undefined)
    
    @scala.inline
    def setScheduling(value: SchedulingBehavior): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
    
    @scala.inline
    def setTraps(value: CodeTraps): Self = StObject.set(x, "traps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrapsUndefined: Self = StObject.set(x, "traps", js.undefined)
  }
}
