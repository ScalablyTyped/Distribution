package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinueStatement
  extends StObject
     with BaseNode
     with Statement {
  
  var label: js.UndefOr[Identifier | Null] = js.undefined
  
  @JSName("type")
  var type_ContinueStatement: typings.estree.estreeStrings.ContinueStatement
}
object ContinueStatement {
  
  inline def apply(): ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[ContinueStatement]
  }
  
  extension [Self <: ContinueStatement](x: Self) {
    
    inline def setLabel(value: Identifier): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setType(value: typings.estree.estreeStrings.ContinueStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
