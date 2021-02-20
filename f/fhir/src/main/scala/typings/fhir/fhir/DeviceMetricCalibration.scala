package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the calibrations that have been performed or that are required to be performed
  */
@js.native
trait DeviceMetricCalibration extends BackboneElement {
  
  /**
    * Contains extended information for property 'state'.
    */
  var _state: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'time'.
    */
  var _time: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * not-calibrated | calibration-required | calibrated | unspecified
    */
  var state: js.UndefOr[code] = js.native
  
  /**
    * Describes the time last calibration has been performed
    */
  var time: js.UndefOr[instant] = js.native
  
  /**
    * unspecified | offset | gain | two-point
    */
  var `type`: js.UndefOr[code] = js.native
}
object DeviceMetricCalibration {
  
  @scala.inline
  def apply(): DeviceMetricCalibration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMetricCalibration]
  }
  
  @scala.inline
  implicit class DeviceMetricCalibrationMutableBuilder[Self <: DeviceMetricCalibration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: code): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTime(value: instant): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def set_state(value: Element): Self = StObject.set(x, "_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_stateUndefined: Self = StObject.set(x, "_state", js.undefined)
    
    @scala.inline
    def set_time(value: Element): Self = StObject.set(x, "_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_timeUndefined: Self = StObject.set(x, "_time", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
