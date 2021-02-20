package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreakStatement
  extends BaseNode
     with Statement {
  
  var label: js.UndefOr[Identifier | Null] = js.native
  
  @JSName("type")
  var type_BreakStatement: typings.estree.estreeStrings.BreakStatement = js.native
}
object BreakStatement {
  
  @scala.inline
  def apply(`type`: typings.estree.estreeStrings.BreakStatement): BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakStatement]
  }
  
  @scala.inline
  implicit class BreakStatementMutableBuilder[Self <: BreakStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: Identifier): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNull: Self = StObject.set(x, "label", null)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.BreakStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
