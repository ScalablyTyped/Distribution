package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebuggerStatement
  extends StObject
     with BaseNode
     with Statement {
  
  @JSName("type")
  var type_DebuggerStatement: typings.estree.estreeStrings.DebuggerStatement
}
object DebuggerStatement {
  
  inline def apply(): DebuggerStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DebuggerStatement")
    __obj.asInstanceOf[DebuggerStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DebuggerStatement] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.estree.estreeStrings.DebuggerStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
