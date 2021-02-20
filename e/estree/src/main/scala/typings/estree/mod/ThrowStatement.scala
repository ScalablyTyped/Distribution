package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThrowStatement
  extends BaseNode
     with Statement {
  
  var argument: Expression = js.native
  
  @JSName("type")
  var type_ThrowStatement: typings.estree.estreeStrings.ThrowStatement = js.native
}
object ThrowStatement {
  
  @scala.inline
  def apply(argument: Expression, `type`: typings.estree.estreeStrings.ThrowStatement): ThrowStatement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrowStatement]
  }
  
  @scala.inline
  implicit class ThrowStatementMutableBuilder[Self <: ThrowStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ThrowStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
