package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableDeclarator
  extends BaseNode
     with Node {
  
  var id: Pattern = js.native
  
  var init: js.UndefOr[Expression | Null] = js.native
  
  @JSName("type")
  var type_VariableDeclarator: typings.estree.estreeStrings.VariableDeclarator = js.native
}
object VariableDeclarator {
  
  @scala.inline
  def apply(id: Pattern, `type`: typings.estree.estreeStrings.VariableDeclarator): VariableDeclarator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
