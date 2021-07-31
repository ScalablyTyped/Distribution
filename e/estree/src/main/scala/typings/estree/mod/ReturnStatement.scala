package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnStatement
  extends StObject
     with BaseNode
     with Statement {
  
  var argument: js.UndefOr[Expression | Null] = js.undefined
  
  @JSName("type")
  var type_ReturnStatement: typings.estree.estreeStrings.ReturnStatement
}
object ReturnStatement {
  
  @scala.inline
  def apply(): ReturnStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[ReturnStatement]
  }
  
  @scala.inline
  implicit class ReturnStatementMutableBuilder[Self <: ReturnStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentNull: Self = StObject.set(x, "argument", null)
    
    @scala.inline
    def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ReturnStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
