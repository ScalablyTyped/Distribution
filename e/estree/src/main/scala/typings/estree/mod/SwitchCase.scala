package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchCase
  extends BaseNode
     with Node {
  
  var consequent: js.Array[Statement] = js.native
  
  var test: js.UndefOr[Expression | Null] = js.native
  
  @JSName("type")
  var type_SwitchCase: typings.estree.estreeStrings.SwitchCase = js.native
}
object SwitchCase {
  
  @scala.inline
  def apply(consequent: js.Array[Statement], `type`: typings.estree.estreeStrings.SwitchCase): SwitchCase = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchCase]
  }
  
  @scala.inline
  implicit class SwitchCaseMutableBuilder[Self <: SwitchCase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsequent(value: js.Array[Statement]): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsequentVarargs(value: Statement*): Self = StObject.set(x, "consequent", js.Array(value :_*))
    
    @scala.inline
    def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestNull: Self = StObject.set(x, "test", null)
    
    @scala.inline
    def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.SwitchCase): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
