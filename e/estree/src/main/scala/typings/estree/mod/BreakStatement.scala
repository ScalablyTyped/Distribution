package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakStatement
  extends StObject
     with BaseNode
     with Statement {
  
  var label: js.UndefOr[Identifier | Null] = js.undefined
  
  @JSName("type")
  var type_BreakStatement: typings.estree.estreeStrings.BreakStatement
}
object BreakStatement {
  
  inline def apply(): BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[BreakStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BreakStatement] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: Identifier): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setType(value: typings.estree.estreeStrings.BreakStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
