package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stratification results
  */
trait MeasureReportGroupStratifier extends BackboneElement {
  /**
    * What stratifier of the group
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Stratum results, one for each unique value in the stratifier
    */
  var stratum: js.UndefOr[js.Array[MeasureReportGroupStratifierStratum]] = js.undefined
}

object MeasureReportGroupStratifier {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    identifier: Identifier = null,
    modifierExtension: js.Array[Extension] = null,
    stratum: js.Array[MeasureReportGroupStratifierStratum] = null
  ): MeasureReportGroupStratifier = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (stratum != null) __obj.updateDynamic("stratum")(stratum)
    __obj.asInstanceOf[MeasureReportGroupStratifier]
  }
}

