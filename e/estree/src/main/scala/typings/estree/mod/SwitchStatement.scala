package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchStatement
  extends BaseNode
     with Statement {
  
  var cases: js.Array[SwitchCase] = js.native
  
  var discriminant: Expression = js.native
  
  @JSName("type")
  var type_SwitchStatement: typings.estree.estreeStrings.SwitchStatement = js.native
}
object SwitchStatement {
  
  @scala.inline
  def apply(
    cases: js.Array[SwitchCase],
    discriminant: Expression,
    `type`: typings.estree.estreeStrings.SwitchStatement
  ): SwitchStatement = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchStatement]
  }
  
  @scala.inline
  implicit class SwitchStatementMutableBuilder[Self <: SwitchStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCases(value: js.Array[SwitchCase]): Self = StObject.set(x, "cases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCasesVarargs(value: SwitchCase*): Self = StObject.set(x, "cases", js.Array(value :_*))
    
    @scala.inline
    def setDiscriminant(value: Expression): Self = StObject.set(x, "discriminant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.SwitchStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
