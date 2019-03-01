package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What dates/date ranges are expected
  */
trait DataRequirementDateFilter extends Element {
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueDateTime'.
    */
  var _valueDateTime: js.UndefOr[Element] = js.undefined
  /**
    * The date-valued attribute of the filter
    */
  var path: java.lang.String
  /**
    * The value of the filter, as a Period, DateTime, or Duration value
    */
  var valueDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * The value of the filter, as a Period, DateTime, or Duration value
    */
  var valueDuration: js.UndefOr[Duration] = js.undefined
  /**
    * The value of the filter, as a Period, DateTime, or Duration value
    */
  var valuePeriod: js.UndefOr[Period] = js.undefined
}

object DataRequirementDateFilter {
  @scala.inline
  def apply(
    path: java.lang.String,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _path: Element = null,
    _valueDateTime: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    valueDateTime: dateTime = null,
    valueDuration: Duration = null,
    valuePeriod: Period = null
  ): DataRequirementDateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_path != null) __obj.updateDynamic("_path")(_path)
    if (_valueDateTime != null) __obj.updateDynamic("_valueDateTime")(_valueDateTime)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (valueDateTime != null) __obj.updateDynamic("valueDateTime")(valueDateTime)
    if (valueDuration != null) __obj.updateDynamic("valueDuration")(valueDuration)
    if (valuePeriod != null) __obj.updateDynamic("valuePeriod")(valuePeriod)
    __obj.asInstanceOf[DataRequirementDateFilter]
  }
}

