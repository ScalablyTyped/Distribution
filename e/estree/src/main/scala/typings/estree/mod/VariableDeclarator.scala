package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableDeclarator
  extends StObject
     with BaseNode
     with Node {
  
  var id: Pattern
  
  var init: js.UndefOr[Expression | Null] = js.undefined
  
  @JSName("type")
  var type_VariableDeclarator: typings.estree.estreeStrings.VariableDeclarator
}
object VariableDeclarator {
  
  @scala.inline
  def apply(id: Pattern): VariableDeclarator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclarator")
    __obj.asInstanceOf[VariableDeclarator]
  }
  
  @scala.inline
  implicit class VariableDeclaratorMutableBuilder[Self <: VariableDeclarator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Pattern): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: Expression): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitNull: Self = StObject.set(x, "init", null)
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.VariableDeclarator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
