package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinueStatement
  extends BaseNode
     with Statement {
  
  var label: js.UndefOr[Identifier | Null] = js.native
  
  @JSName("type")
  var type_ContinueStatement: typings.estree.estreeStrings.ContinueStatement = js.native
}
object ContinueStatement {
  
  @scala.inline
  def apply(`type`: typings.estree.estreeStrings.ContinueStatement): ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueStatement]
  }
  
  @scala.inline
  implicit class ContinueStatementMutableBuilder[Self <: ContinueStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: Identifier): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNull: Self = StObject.set(x, "label", null)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ContinueStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
