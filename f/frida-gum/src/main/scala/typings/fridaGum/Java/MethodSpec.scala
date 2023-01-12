package typings.fridaGum.Java

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodSpec extends StObject {
  
  /**
    * Argument types. Defaults to `[]` if omitted.
    */
  var argumentTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Implementation.
    */
  def implementation(params: Any*): Any
  /**
    * Implementation.
    */
  @JSName("implementation")
  var implementation_Original: MethodImplementation[js.Object]
  
  /**
    * Return type. Defaults to `void` if omitted.
    */
  var returnType: js.UndefOr[String] = js.undefined
}
object MethodSpec {
  
  inline def apply(implementation: MethodImplementation[js.Object]): MethodSpec = {
    val __obj = js.Dynamic.literal(implementation = implementation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MethodSpec] (val x: Self) extends AnyVal {
    
    inline def setArgumentTypes(value: js.Array[String]): Self = StObject.set(x, "argumentTypes", value.asInstanceOf[js.Any])
    
    inline def setArgumentTypesUndefined: Self = StObject.set(x, "argumentTypes", js.undefined)
    
    inline def setArgumentTypesVarargs(value: String*): Self = StObject.set(x, "argumentTypes", js.Array(value*))
    
    inline def setImplementation(value: MethodImplementation[js.Object]): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    inline def setReturnType(value: String): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
  }
}
