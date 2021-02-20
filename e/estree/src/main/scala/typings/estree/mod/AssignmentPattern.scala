package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignmentPattern
  extends BaseNode
     with Pattern {
  
  var left: Pattern = js.native
  
  var right: Expression = js.native
  
  @JSName("type")
  var type_AssignmentPattern: typings.estree.estreeStrings.AssignmentPattern = js.native
}
object AssignmentPattern {
  
  @scala.inline
  def apply(left: Pattern, right: Expression, `type`: typings.estree.estreeStrings.AssignmentPattern): AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentPattern]
  }
  
  @scala.inline
  implicit class AssignmentPatternMutableBuilder[Self <: AssignmentPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Pattern): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.AssignmentPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
