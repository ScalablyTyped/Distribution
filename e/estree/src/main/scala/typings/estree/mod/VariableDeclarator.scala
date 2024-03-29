package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableDeclarator
  extends StObject
     with BaseNode {
  
  var id: Pattern
  
  var init: js.UndefOr[Expression | Null] = js.undefined
  
  @JSName("type")
  var type_VariableDeclarator: typings.estree.estreeStrings.VariableDeclarator
}
object VariableDeclarator {
  
  inline def apply(id: Pattern): VariableDeclarator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclarator")
    __obj.asInstanceOf[VariableDeclarator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VariableDeclarator] (val x: Self) extends AnyVal {
    
    inline def setId(value: Pattern): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInit(value: Expression): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitNull: Self = StObject.set(x, "init", null)
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setType(value: typings.estree.estreeStrings.VariableDeclarator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
