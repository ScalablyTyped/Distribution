package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A series of measurements taken by a device
  */
trait SampledData extends Element {
  /**
    * Contains extended information for property 'data'.
    */
  var _data: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'dimensions'.
    */
  var _dimensions: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'factor'.
    */
  var _factor: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'lowerLimit'.
    */
  var _lowerLimit: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'period'.
    */
  var _period: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'upperLimit'.
    */
  var _upperLimit: js.UndefOr[Element] = js.undefined
  /**
    * Decimal values with spaces, or "E" | "U" | "L"
    */
  var data: String
  /**
    * Number of sample points at each time point
    */
  var dimensions: positiveInt
  /**
    * Multiply data by this before adding to origin
    */
  var factor: js.UndefOr[decimal] = js.undefined
  /**
    * Lower limit of detection
    */
  var lowerLimit: js.UndefOr[decimal] = js.undefined
  /**
    * Zero value and units
    */
  var origin: Quantity
  /**
    * Number of milliseconds between samples
    */
  var period: decimal
  /**
    * Upper limit of detection
    */
  var upperLimit: js.UndefOr[decimal] = js.undefined
}

object SampledData {
  @scala.inline
  def apply(
    data: String,
    dimensions: positiveInt,
    origin: Quantity,
    period: decimal,
    _data: Element = null,
    _dimensions: Element = null,
    _factor: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _lowerLimit: Element = null,
    _period: Element = null,
    _upperLimit: Element = null,
    extension: js.Array[Extension] = null,
    factor: Int | Double = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    lowerLimit: Int | Double = null,
    upperLimit: Int | Double = null
  ): SampledData = {
    val __obj = js.Dynamic.literal(data = data, dimensions = dimensions, origin = origin, period = period)
    if (_data != null) __obj.updateDynamic("_data")(_data)
    if (_dimensions != null) __obj.updateDynamic("_dimensions")(_dimensions)
    if (_factor != null) __obj.updateDynamic("_factor")(_factor)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_lowerLimit != null) __obj.updateDynamic("_lowerLimit")(_lowerLimit)
    if (_period != null) __obj.updateDynamic("_period")(_period)
    if (_upperLimit != null) __obj.updateDynamic("_upperLimit")(_upperLimit)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lowerLimit != null) __obj.updateDynamic("lowerLimit")(lowerLimit.asInstanceOf[js.Any])
    if (upperLimit != null) __obj.updateDynamic("upperLimit")(upperLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampledData]
  }
}

