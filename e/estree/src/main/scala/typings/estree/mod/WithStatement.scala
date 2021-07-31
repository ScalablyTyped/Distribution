package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithStatement
  extends StObject
     with BaseNode
     with Statement {
  
  var body: Statement
  
  var `object`: Expression
  
  @JSName("type")
  var type_WithStatement: typings.estree.estreeStrings.WithStatement
}
object WithStatement {
  
  @scala.inline
  def apply(body: Statement, `object`: Expression): WithStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WithStatement")
    __obj.asInstanceOf[WithStatement]
  }
  
  @scala.inline
  implicit class WithStatementMutableBuilder[Self <: WithStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: Expression): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.WithStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
