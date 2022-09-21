package typings.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cardinal extends StObject {
  
  var cardinal: js.Array[String]
  
  var ordinal: js.Array[String]
}
object Cardinal {
  
  inline def apply(cardinal: js.Array[String], ordinal: js.Array[String]): Cardinal = {
    val __obj = js.Dynamic.literal(cardinal = cardinal.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cardinal]
  }
  
  extension [Self <: Cardinal](x: Self) {
    
    inline def setCardinal(value: js.Array[String]): Self = StObject.set(x, "cardinal", value.asInstanceOf[js.Any])
    
    inline def setCardinalVarargs(value: String*): Self = StObject.set(x, "cardinal", js.Array(value*))
    
    inline def setOrdinal(value: js.Array[String]): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setOrdinalVarargs(value: String*): Self = StObject.set(x, "ordinal", js.Array(value*))
  }
}
