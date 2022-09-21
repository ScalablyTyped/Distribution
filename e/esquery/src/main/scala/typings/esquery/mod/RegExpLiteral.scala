package typings.esquery.mod

import typings.esquery.esqueryStrings.regexp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegExpLiteral
  extends StObject
     with Atom {
  
  @JSName("type")
  var type_RegExpLiteral: regexp
  
  var value: js.RegExp
}
object RegExpLiteral {
  
  inline def apply(value: js.RegExp): RegExpLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("regexp")
    __obj.asInstanceOf[RegExpLiteral]
  }
  
  extension [Self <: RegExpLiteral](x: Self) {
    
    inline def setType(value: regexp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.RegExp): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
