package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabeledStatement
  extends StObject
     with BaseNode
     with Statement {
  
  var body: Statement
  
  var label: Identifier
  
  @JSName("type")
  var type_LabeledStatement: typings.estree.estreeStrings.LabeledStatement
}
object LabeledStatement {
  
  @scala.inline
  def apply(body: Statement, label: Identifier): LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LabeledStatement")
    __obj.asInstanceOf[LabeledStatement]
  }
  
  @scala.inline
  implicit class LabeledStatementMutableBuilder[Self <: LabeledStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Identifier): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.LabeledStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
