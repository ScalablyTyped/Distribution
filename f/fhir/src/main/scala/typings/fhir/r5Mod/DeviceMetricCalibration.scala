package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`calibration-required`
import typings.fhir.fhirStrings.`not-calibrated`
import typings.fhir.fhirStrings.`two-point`
import typings.fhir.fhirStrings.calibrated
import typings.fhir.fhirStrings.gain
import typings.fhir.fhirStrings.offset
import typings.fhir.fhirStrings.unspecified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceMetricCalibration
  extends StObject
     with BackboneElement {
  
  var _state: js.UndefOr[Element] = js.undefined
  
  var _time: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Describes the state of the calibration.
    */
  var state: js.UndefOr[`not-calibrated` | `calibration-required` | calibrated | unspecified] = js.undefined
  
  /**
    * Describes the time last calibration has been performed.
    */
  var time: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the type of the calibration method.
    */
  var `type`: js.UndefOr[unspecified | offset | gain | `two-point`] = js.undefined
}
object DeviceMetricCalibration {
  
  inline def apply(): DeviceMetricCalibration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMetricCalibration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceMetricCalibration] (val x: Self) extends AnyVal {
    
    inline def setState(value: `not-calibrated` | `calibration-required` | calibrated | unspecified): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setType(value: unspecified | offset | gain | `two-point`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_state(value: Element): Self = StObject.set(x, "_state", value.asInstanceOf[js.Any])
    
    inline def set_stateUndefined: Self = StObject.set(x, "_state", js.undefined)
    
    inline def set_time(value: Element): Self = StObject.set(x, "_time", value.asInstanceOf[js.Any])
    
    inline def set_timeUndefined: Self = StObject.set(x, "_time", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
