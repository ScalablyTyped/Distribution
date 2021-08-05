package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassBody
  extends StObject
     with BaseNode
     with Node {
  
  var body: js.Array[MethodDefinition]
  
  @JSName("type")
  var type_ClassBody: typings.estree.estreeStrings.ClassBody
}
object ClassBody {
  
  inline def apply(body: js.Array[MethodDefinition]): ClassBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassBody")
    __obj.asInstanceOf[ClassBody]
  }
  
  extension [Self <: ClassBody](x: Self) {
    
    inline def setBody(value: js.Array[MethodDefinition]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: MethodDefinition*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    inline def setType(value: typings.estree.estreeStrings.ClassBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
