package typings.fhir.r4Mod

import typings.fhir.fhirStrings.celsius
import typings.fhir.fhirStrings.farenheit
import typings.fhir.fhirStrings.kelvin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiologicallyDerivedProductStorage
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _scale: js.UndefOr[Element] = js.undefined
  
  /**
    * Description of storage.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Storage timeperiod.
    */
  var duration: js.UndefOr[Period] = js.undefined
  
  /**
    * Temperature scale used.
    */
  var scale: js.UndefOr[farenheit | celsius | kelvin] = js.undefined
  
  /**
    * Storage temperature.
    */
  var temperature: js.UndefOr[Double] = js.undefined
}
object BiologicallyDerivedProductStorage {
  
  inline def apply(): BiologicallyDerivedProductStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BiologicallyDerivedProductStorage]
  }
  
  extension [Self <: BiologicallyDerivedProductStorage](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDuration(value: Period): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setScale(value: farenheit | celsius | kelvin): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setTemperature(value: Double): Self = StObject.set(x, "temperature", value.asInstanceOf[js.Any])
    
    inline def setTemperatureUndefined: Self = StObject.set(x, "temperature", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_scale(value: Element): Self = StObject.set(x, "_scale", value.asInstanceOf[js.Any])
    
    inline def set_scaleUndefined: Self = StObject.set(x, "_scale", js.undefined)
  }
}
