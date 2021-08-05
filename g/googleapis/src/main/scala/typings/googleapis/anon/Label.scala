package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  var label: js.UndefOr[String] = js.undefined
  
  var temperature: js.UndefOr[Double] = js.undefined
}
object Label {
  
  inline def apply(): Label = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setTemperature(value: Double): Self = StObject.set(x, "temperature", value.asInstanceOf[js.Any])
    
    inline def setTemperatureUndefined: Self = StObject.set(x, "temperature", js.undefined)
  }
}
