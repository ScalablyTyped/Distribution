package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.calculation
import typings.fhir.fhirStrings.measurement
import typings.fhir.fhirStrings.off
import typings.fhir.fhirStrings.on
import typings.fhir.fhirStrings.setting
import typings.fhir.fhirStrings.standby
import typings.fhir.fhirStrings.unspecified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceMetric
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _category: js.UndefOr[Element] = js.undefined
  
  var _color: js.UndefOr[Element] = js.undefined
  
  var _operationalStatus: js.UndefOr[Element] = js.undefined
  
  /**
    * Describes the calibrations that have been performed or that are required to be performed.
    */
  var calibration: js.UndefOr[js.Array[DeviceMetricCalibration]] = js.undefined
  
  /**
    * Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.
    */
  var category: measurement | setting | calculation | unspecified
  
  /**
    * The preferred color associated with the metric (e.g., display color). This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth; the metrics are displayed in different characteristic colors, such as HR in blue, BP in green, and PR and SpO2 in magenta.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Note if this is not the top level device - also know as the source device, it may be referenced in the device.parent element.
    */
  var device: Reference
  
  /**
    * For identifiers assigned to a device by the device or gateway software, the `system` element of the identifier should be set to any identifier of the device.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The frequency at which the metric is taken or recorded. Devices measure metrics at a wide range of frequencies; for example, an ECG might sample measurements in the millisecond range, while an NIBP might trigger only once an hour. Less often, the measurementFrequency may be based on a unit other than time, such as distance (e.g. for a measuring wheel). The update period may be different than the measurement frequency, if the device does not update the published observed value with the same frequency as it was measured.
    */
  var measurementFrequency: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Indicates current operational state of the device. For example: On, Off, Standby, etc.
    */
  var operationalStatus: js.UndefOr[on | off | standby | `entered-in-error`] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_DeviceMetric: typings.fhir.fhirStrings.DeviceMetric
  
  /**
    * DeviceMetric.type can be referred to either IEEE 11073-10101 or LOINC.
    */
  var `type`: CodeableConcept
  
  /**
    * DeviceMetric.unit can refer to either UCUM or preferable a RTMMS coding system.
    */
  var unit: js.UndefOr[CodeableConcept] = js.undefined
}
object DeviceMetric {
  
  inline def apply(
    category: measurement | setting | calculation | unspecified,
    device: Reference,
    `type`: CodeableConcept
  ): DeviceMetric = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], resourceType = "DeviceMetric")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceMetric] (val x: Self) extends AnyVal {
    
    inline def setCalibration(value: js.Array[DeviceMetricCalibration]): Self = StObject.set(x, "calibration", value.asInstanceOf[js.Any])
    
    inline def setCalibrationUndefined: Self = StObject.set(x, "calibration", js.undefined)
    
    inline def setCalibrationVarargs(value: DeviceMetricCalibration*): Self = StObject.set(x, "calibration", js.Array(value*))
    
    inline def setCategory(value: measurement | setting | calculation | unspecified): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setMeasurementFrequency(value: Quantity): Self = StObject.set(x, "measurementFrequency", value.asInstanceOf[js.Any])
    
    inline def setMeasurementFrequencyUndefined: Self = StObject.set(x, "measurementFrequency", js.undefined)
    
    inline def setOperationalStatus(value: on | off | standby | `entered-in-error`): Self = StObject.set(x, "operationalStatus", value.asInstanceOf[js.Any])
    
    inline def setOperationalStatusUndefined: Self = StObject.set(x, "operationalStatus", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.DeviceMetric): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: CodeableConcept): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def set_category(value: Element): Self = StObject.set(x, "_category", value.asInstanceOf[js.Any])
    
    inline def set_categoryUndefined: Self = StObject.set(x, "_category", js.undefined)
    
    inline def set_color(value: Element): Self = StObject.set(x, "_color", value.asInstanceOf[js.Any])
    
    inline def set_colorUndefined: Self = StObject.set(x, "_color", js.undefined)
    
    inline def set_operationalStatus(value: Element): Self = StObject.set(x, "_operationalStatus", value.asInstanceOf[js.Any])
    
    inline def set_operationalStatusUndefined: Self = StObject.set(x, "_operationalStatus", js.undefined)
  }
}
