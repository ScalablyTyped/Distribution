package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleMethodSpec[I]
  extends StObject
     with MethodSpec[I] {
  
  /**
    * Argument types.
    */
  var argTypes: js.Array[String]
  
  /**
    * Implementation.
    */
  var implementation: I
  
  /**
    * Return type.
    */
  var retType: String
}
object SimpleMethodSpec {
  
  inline def apply[I](argTypes: js.Array[String], implementation: I, retType: String): SimpleMethodSpec[I] = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleMethodSpec[I]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimpleMethodSpec[?], I] (val x: Self & SimpleMethodSpec[I]) extends AnyVal {
    
    inline def setArgTypes(value: js.Array[String]): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
    
    inline def setArgTypesVarargs(value: String*): Self = StObject.set(x, "argTypes", js.Array(value*))
    
    inline def setImplementation(value: I): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    inline def setRetType(value: String): Self = StObject.set(x, "retType", value.asInstanceOf[js.Any])
  }
}
