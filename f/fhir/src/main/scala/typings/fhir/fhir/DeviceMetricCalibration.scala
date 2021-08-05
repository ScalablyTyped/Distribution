package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the calibrations that have been performed or that are required to be performed
  */
trait DeviceMetricCalibration
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'state'.
    */
  var _state: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'time'.
    */
  var _time: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * not-calibrated | calibration-required | calibrated | unspecified
    */
  var state: js.UndefOr[code] = js.undefined
  
  /**
    * Describes the time last calibration has been performed
    */
  var time: js.UndefOr[instant] = js.undefined
  
  /**
    * unspecified | offset | gain | two-point
    */
  var `type`: js.UndefOr[code] = js.undefined
}
object DeviceMetricCalibration {
  
  inline def apply(): DeviceMetricCalibration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMetricCalibration]
  }
  
  extension [Self <: DeviceMetricCalibration](x: Self) {
    
    inline def setState(value: code): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTime(value: instant): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_state(value: Element): Self = StObject.set(x, "_state", value.asInstanceOf[js.Any])
    
    inline def set_stateUndefined: Self = StObject.set(x, "_state", js.undefined)
    
    inline def set_time(value: Element): Self = StObject.set(x, "_time", value.asInstanceOf[js.Any])
    
    inline def set_timeUndefined: Self = StObject.set(x, "_time", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
