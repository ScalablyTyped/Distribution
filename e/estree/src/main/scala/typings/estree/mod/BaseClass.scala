package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseClass
  extends StObject
     with BaseNode {
  
  var body: ClassBody
  
  var superClass: js.UndefOr[Expression | Null] = js.undefined
}
object BaseClass {
  
  inline def apply(body: ClassBody, `type`: String): BaseClass = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseClass]
  }
  
  extension [Self <: BaseClass](x: Self) {
    
    inline def setBody(value: ClassBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setSuperClass(value: Expression): Self = StObject.set(x, "superClass", value.asInstanceOf[js.Any])
    
    inline def setSuperClassNull: Self = StObject.set(x, "superClass", null)
    
    inline def setSuperClassUndefined: Self = StObject.set(x, "superClass", js.undefined)
  }
}
