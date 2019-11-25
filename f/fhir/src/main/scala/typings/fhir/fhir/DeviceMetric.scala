package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Measurement, calculation or setting capability of a medical device
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait DeviceMetric extends DomainResource {
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
  def apply(
    category: code,
    identifier: Identifier,
    `type`: CodeableConcept,
    _category: Element = null,
    _color: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _operationalStatus: Element = null,
    _resourceType: Element = null,
    calibration: js.Array[DeviceMetricCalibration] = null,
    color: code = null,
    contained: js.Array[Resource] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    measurementPeriod: Timing = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    operationalStatus: code = null,
    parent: Reference = null,
    resourceType: code = null,
    source: Reference = null,
    text: Narrative = null,
    unit: CodeableConcept = null
  ): DeviceMetric = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_category != null) __obj.updateDynamic("_category")(_category.asInstanceOf[js.Any])
    if (_color != null) __obj.updateDynamic("_color")(_color.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_operationalStatus != null) __obj.updateDynamic("_operationalStatus")(_operationalStatus.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (calibration != null) __obj.updateDynamic("calibration")(calibration.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (measurementPeriod != null) __obj.updateDynamic("measurementPeriod")(measurementPeriod.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (operationalStatus != null) __obj.updateDynamic("operationalStatus")(operationalStatus.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMetric]
  }
}

