package typings.esquery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericLiteral
  extends StObject
     with LiteralAtom
     with Literal {
  
  @JSName("value")
  var value_NumericLiteral: Double
}
object NumericLiteral {
  
  inline def apply(value: Double): NumericLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("literal")
    __obj.asInstanceOf[NumericLiteral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumericLiteral] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
