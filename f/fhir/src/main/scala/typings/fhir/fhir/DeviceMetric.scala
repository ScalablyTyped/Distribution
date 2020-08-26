package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Measurement, calculation or setting capability of a medical device
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait DeviceMetric extends DomainResource {
  /**
    * Contains extended information for property 'category'.
    */
  var _category: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'color'.
    */
  var _color: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'operationalStatus'.
    */
  var _operationalStatus: js.UndefOr[Element] = js.native
  /**
    * Describes the calibrations that have been performed or that are required to be performed
    */
  var calibration: js.UndefOr[js.Array[DeviceMetricCalibration]] = js.native
  /**
    * measurement | setting | calculation | unspecified
    */
  var category: code = js.native
  /**
    * black | red | green | yellow | blue | magenta | cyan | white
    */
  var color: js.UndefOr[code] = js.native
  /**
    * Unique identifier of this DeviceMetric
    */
  var identifier: Identifier = js.native
  /**
    * Describes the measurement repetition time
    */
  var measurementPeriod: js.UndefOr[Timing] = js.native
  /**
    * on | off | standby | entered-in-error
    */
  var operationalStatus: js.UndefOr[code] = js.native
  /**
    * Describes the link to the parent DeviceComponent
    */
  var parent: js.UndefOr[Reference] = js.native
  /**
    * Describes the link to the source Device
    */
  var source: js.UndefOr[Reference] = js.native
  /**
    * Identity of metric, for example Heart Rate or PEEP Setting
    */
  var `type`: CodeableConcept = js.native
  /**
    * Unit of Measure for the Metric
    */
  var unit: js.UndefOr[CodeableConcept] = js.native
}

object DeviceMetric {
  @scala.inline
  def apply(category: code, identifier: Identifier, `type`: CodeableConcept): DeviceMetric = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMetric]
  }
  @scala.inline
  implicit class DeviceMetricOps[Self <: DeviceMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCategory(value: code): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def set_category(value: Element): Self = this.set("_category", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_category: Self = this.set("_category", js.undefined)
    @scala.inline
    def set_color(value: Element): Self = this.set("_color", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_color: Self = this.set("_color", js.undefined)
    @scala.inline
    def set_operationalStatus(value: Element): Self = this.set("_operationalStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_operationalStatus: Self = this.set("_operationalStatus", js.undefined)
    @scala.inline
    def setCalibrationVarargs(value: DeviceMetricCalibration*): Self = this.set("calibration", js.Array(value :_*))
    @scala.inline
    def setCalibration(value: js.Array[DeviceMetricCalibration]): Self = this.set("calibration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalibration: Self = this.set("calibration", js.undefined)
    @scala.inline
    def setColor(value: code): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setMeasurementPeriod(value: Timing): Self = this.set("measurementPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasurementPeriod: Self = this.set("measurementPeriod", js.undefined)
    @scala.inline
    def setOperationalStatus(value: code): Self = this.set("operationalStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationalStatus: Self = this.set("operationalStatus", js.undefined)
    @scala.inline
    def setParent(value: Reference): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setSource(value: Reference): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setUnit(value: CodeableConcept): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
  
}

