package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignmentPattern
  extends StObject
     with BaseNode
     with Pattern {
  
  var left: Pattern
  
  var right: Expression
  
  @JSName("type")
  var type_AssignmentPattern: typings.estree.estreeStrings.AssignmentPattern
}
object AssignmentPattern {
  
  @scala.inline
  def apply(left: Pattern, right: Expression): AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPattern")
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
