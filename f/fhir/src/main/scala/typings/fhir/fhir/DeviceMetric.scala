package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Measurement, calculation or setting capability of a medical device
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait DeviceMetric
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'category'.
    */
  var _category: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'color'.
    */
  var _color: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'operationalStatus'.
    */
  var _operationalStatus: js.UndefOr[Element] = js.undefined
  
  /**
    * Describes the calibrations that have been performed or that are required to be performed
    */
  var calibration: js.UndefOr[js.Array[DeviceMetricCalibration]] = js.undefined
  
  /**
    * measurement | setting | calculation | unspecified
    */
  var category: code
  
  /**
    * black | red | green | yellow | blue | magenta | cyan | white
    */
  var color: js.UndefOr[code] = js.undefined
  
  /**
    * Unique identifier of this DeviceMetric
    */
  var identifier: Identifier
  
  /**
    * Describes the measurement repetition time
    */
  var measurementPeriod: js.UndefOr[Timing] = js.undefined
  
  /**
    * on | off | standby | entered-in-error
    */
  var operationalStatus: js.UndefOr[code] = js.undefined
  
  /**
    * Describes the link to the parent DeviceComponent
    */
  var parent: js.UndefOr[Reference] = js.undefined
  
  /**
    * Describes the link to the source Device
    */
  var source: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identity of metric, for example Heart Rate or PEEP Setting
    */
  var `type`: CodeableConcept
  
  /**
    * Unit of Measure for the Metric
    */
  var unit: js.UndefOr[CodeableConcept] = js.undefined
}
object DeviceMetric {
  
  @scala.inline
  def apply(category: code, identifier: Identifier, `type`: CodeableConcept): DeviceMetric = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMetric]
  }
  
  @scala.inline
  implicit class DeviceMetricMutableBuilder[Self <: DeviceMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalibration(value: js.Array[DeviceMetricCalibration]): Self = StObject.set(x, "calibration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalibrationUndefined: Self = StObject.set(x, "calibration", js.undefined)
    
    @scala.inline
    def setCalibrationVarargs(value: DeviceMetricCalibration*): Self = StObject.set(x, "calibration", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: code): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: code): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurementPeriod(value: Timing): Self = StObject.set(x, "measurementPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurementPeriodUndefined: Self = StObject.set(x, "measurementPeriod", js.undefined)
    
    @scala.inline
    def setOperationalStatus(value: code): Self = StObject.set(x, "operationalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationalStatusUndefined: Self = StObject.set(x, "operationalStatus", js.undefined)
    
    @scala.inline
    def setParent(value: Reference): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setSource(value: Reference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: CodeableConcept): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def set_category(value: Element): Self = StObject.set(x, "_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_categoryUndefined: Self = StObject.set(x, "_category", js.undefined)
    
    @scala.inline
    def set_color(value: Element): Self = StObject.set(x, "_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_colorUndefined: Self = StObject.set(x, "_color", js.undefined)
    
    @scala.inline
    def set_operationalStatus(value: Element): Self = StObject.set(x, "_operationalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_operationalStatusUndefined: Self = StObject.set(x, "_operationalStatus", js.undefined)
  }
}
