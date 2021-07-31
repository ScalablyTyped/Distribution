package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyStatement
  extends StObject
     with BaseNode
     with Statement {
  
  @JSName("type")
  var type_EmptyStatement: typings.estree.estreeStrings.EmptyStatement
}
object EmptyStatement {
  
  @scala.inline
  def apply(): EmptyStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EmptyStatement")
    __obj.asInstanceOf[EmptyStatement]
  }
  
  @scala.inline
  implicit class EmptyStatementMutableBuilder[Self <: EmptyStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.EmptyStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
