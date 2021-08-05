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
  
  inline def apply(body: Statement): ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[ForStatement]
  }
  
  extension [Self <: ForStatement](x: Self) {
    
    inline def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setInit(value: VariableDeclaration | Expression): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitNull: Self = StObject.set(x, "init", null)
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestNull: Self = StObject.set(x, "test", null)
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setType(value: typings.estree.estreeStrings.ForStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: Expression): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateNull: Self = StObject.set(x, "update", null)
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
