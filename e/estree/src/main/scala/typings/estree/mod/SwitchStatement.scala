package typings.estree.mod

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
  implicit class SwitchStatementOps[Self <: SwitchStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCasesVarargs(value: SwitchCase*): Self = this.set("cases", js.Array(value :_*))
    
    @scala.inline
    def setCases(value: js.Array[SwitchCase]): Self = this.set("cases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscriminant(value: Expression): Self = this.set("discriminant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.SwitchStatement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
