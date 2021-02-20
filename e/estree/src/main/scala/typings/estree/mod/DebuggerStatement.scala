package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebuggerStatement
  extends BaseNode
     with Statement {
  
  @JSName("type")
  var type_DebuggerStatement: typings.estree.estreeStrings.DebuggerStatement = js.native
}
object DebuggerStatement {
  
  @scala.inline
  def apply(`type`: typings.estree.estreeStrings.DebuggerStatement): DebuggerStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebuggerStatement]
  }
  
  @scala.inline
  implicit class DebuggerStatementMutableBuilder[Self <: DebuggerStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.DebuggerStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
