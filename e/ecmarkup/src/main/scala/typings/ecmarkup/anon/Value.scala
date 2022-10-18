package typings.ecmarkup.anon

import typings.ecmarkup.libExprParserMod.Seq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var name: String
  
  var value: Seq
}
object Value {
  
  inline def apply(name: String, value: Seq): Value = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Seq): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
