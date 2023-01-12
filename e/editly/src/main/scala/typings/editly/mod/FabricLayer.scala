package typings.editly.mod

import typings.editly.editlyStrings.fabric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FabricLayer
  extends StObject
     with BaseLayer
     with Layer {
  
  /**
  		 * Custom JavaScript function.
  		 */
  def func(args: CustomFabricFunctionArgs): OptionalPromise[CustomFunctionCallbacks]
  /**
  		 * Custom JavaScript function.
  		 */
  @JSName("func")
  var func_Original: CustomFabricFunction
  
  /**
  		 * Layer type.
  		 */
  @JSName("type")
  var type_FabricLayer: fabric
}
object FabricLayer {
  
  inline def apply(func: /* args */ CustomFabricFunctionArgs => OptionalPromise[CustomFunctionCallbacks]): FabricLayer = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction1(func))
    __obj.updateDynamic("type")("fabric")
    __obj.asInstanceOf[FabricLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FabricLayer] (val x: Self) extends AnyVal {
    
    inline def setFunc(value: /* args */ CustomFabricFunctionArgs => OptionalPromise[CustomFunctionCallbacks]): Self = StObject.set(x, "func", js.Any.fromFunction1(value))
    
    inline def setType(value: fabric): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
