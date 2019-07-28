package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ratio of two Quantity values - a numerator and a denominator
  */
trait Ratio extends Element {
  /**
    * Denominator value
    */
  var denominator: js.UndefOr[Quantity] = js.undefined
  /**
    * Numerator value
    */
  var numerator: js.UndefOr[Quantity] = js.undefined
}

object Ratio {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    denominator: Quantity = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    numerator: Quantity = null
  ): Ratio = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (denominator != null) __obj.updateDynamic("denominator")(denominator)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (numerator != null) __obj.updateDynamic("numerator")(numerator)
    __obj.asInstanceOf[Ratio]
  }
}

