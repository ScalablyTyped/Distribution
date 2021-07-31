package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForStatement
  extends StObject
     with BaseNode
     with Statement {
  
  var body: Statement
  
  var init: js.UndefOr[VariableDeclaration | Expression | Null] = js.undefined
  
  var test: js.UndefOr[Expression | Null] = js.undefined
  
  @JSName("type")
  var type_ForStatement: typings.estree.estreeStrings.ForStatement
  
  var update: js.UndefOr[Expression | Null] = js.undefined
}
object ForStatement {
  
  @scala.inline
  def apply(body: Statement): ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[ForStatement]
  }
  
  @scala.inline
  implicit class ForStatementMutableBuilder[Self <: ForStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(value: VariableDeclaration | Expression): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitNull: Self = StObject.set(x, "init", null)
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    @scala.inline
    def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestNull: Self = StObject.set(x, "test", null)
    
    @scala.inline
    def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ForStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: Expression): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateNull: Self = StObject.set(x, "update", null)
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
