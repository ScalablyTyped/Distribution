package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WhileStatement
  extends StObject
     with BaseNode
     with Statement {
  
  var body: Statement
  
  var test: Expression
  
  @JSName("type")
  var type_WhileStatement: typings.estree.estreeStrings.WhileStatement
}
object WhileStatement {
  
  inline def apply(body: Statement, test: Expression): WhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[WhileStatement]
  }
  
  extension [Self <: WhileStatement](x: Self) {
    
    inline def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.WhileStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
