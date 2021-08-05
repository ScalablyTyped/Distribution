package typings.esquery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Literals
//
trait StringLiteral
  extends StObject
     with LiteralAtom
     with Literal {
  
  @JSName("value")
  var value_StringLiteral: String
}
object StringLiteral {
  
  inline def apply(value: String): StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("literal")
    __obj.asInstanceOf[StringLiteral]
  }
  
  extension [Self <: StringLiteral](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
