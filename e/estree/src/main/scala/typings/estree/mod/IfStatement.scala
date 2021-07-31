package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfStatement
  extends StObject
     with BaseNode
     with Statement {
  
  var alternate: js.UndefOr[Statement | Null] = js.undefined
  
  var consequent: Statement
  
  var test: Expression
  
  @JSName("type")
  var type_IfStatement: typings.estree.estreeStrings.IfStatement
}
object IfStatement {
  
  @scala.inline
  def apply(consequent: Statement, test: Expression): IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[IfStatement]
  }
  
  @scala.inline
  implicit class IfStatementMutableBuilder[Self <: IfStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternate(value: Statement): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateNull: Self = StObject.set(x, "alternate", null)
    
    @scala.inline
    def setAlternateUndefined: Self = StObject.set(x, "alternate", js.undefined)
    
    @scala.inline
    def setConsequent(value: Statement): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.IfStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
