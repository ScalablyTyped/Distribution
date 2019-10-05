package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of values bounded by low and high
  */
trait Range extends Element {
  /**
    * High limit
    */
  var high: js.UndefOr[Quantity] = js.undefined
  /**
    * Low limit
    */
  var low: js.UndefOr[Quantity] = js.undefined
}

object Range {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    high: Quantity = null,
    id: String = null,
    low: Quantity = null
  ): Range = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (high != null) __obj.updateDynamic("high")(high)
    if (id != null) __obj.updateDynamic("id")(id)
    if (low != null) __obj.updateDynamic("low")(low)
    __obj.asInstanceOf[Range]
  }
}

