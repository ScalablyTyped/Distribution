package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchStatement
  extends StObject
     with BaseNode
     with Statement {
  
  var cases: js.Array[SwitchCase]
  
  var discriminant: Expression
  
  @JSName("type")
  var type_SwitchStatement: typings.estree.estreeStrings.SwitchStatement
}
object SwitchStatement {
  
  inline def apply(cases: js.Array[SwitchCase], discriminant: Expression): SwitchStatement = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SwitchStatement")
    __obj.asInstanceOf[SwitchStatement]
  }
  
  extension [Self <: SwitchStatement](x: Self) {
    
    inline def setCases(value: js.Array[SwitchCase]): Self = StObject.set(x, "cases", value.asInstanceOf[js.Any])
    
    inline def setCasesVarargs(value: SwitchCase*): Self = StObject.set(x, "cases", js.Array(value*))
    
    inline def setDiscriminant(value: Expression): Self = StObject.set(x, "discriminant", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.SwitchStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
