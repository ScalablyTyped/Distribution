package typings.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccesibilityLabel extends StObject {
  
  var accesibilityLabel: String
  
  var value: Double
}
object AccesibilityLabel {
  
  inline def apply(accesibilityLabel: String, value: Double): AccesibilityLabel = {
    val __obj = js.Dynamic.literal(accesibilityLabel = accesibilityLabel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccesibilityLabel]
  }
  
  extension [Self <: AccesibilityLabel](x: Self) {
    
    inline def setAccesibilityLabel(value: String): Self = StObject.set(x, "accesibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
