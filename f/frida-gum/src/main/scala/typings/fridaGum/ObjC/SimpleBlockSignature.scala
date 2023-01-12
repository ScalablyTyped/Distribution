package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleBlockSignature
  extends StObject
     with BlockSignature {
  
  /**
    * Argument types.
    */
  var argTypes: js.Array[String]
  
  /**
    * Return type.
    */
  var retType: String
}
object SimpleBlockSignature {
  
  inline def apply(argTypes: js.Array[String], retType: String): SimpleBlockSignature = {
    val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], retType = retType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleBlockSignature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimpleBlockSignature] (val x: Self) extends AnyVal {
    
    inline def setArgTypes(value: js.Array[String]): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
    
    inline def setArgTypesVarargs(value: String*): Self = StObject.set(x, "argTypes", js.Array(value*))
    
    inline def setRetType(value: String): Self = StObject.set(x, "retType", value.asInstanceOf[js.Any])
  }
}
