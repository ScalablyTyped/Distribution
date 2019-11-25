package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What other data should be reported with the measure
  */
trait MeasureSupplementalData extends BackboneElement {
  /**
    * Contains extended information for property 'criteria'.
    */
  var _criteria: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.undefined
  /**
    * Expression describing additional data to be reported
    */
  var criteria: js.UndefOr[String] = js.undefined
  /**
    * Identifier, unique within the measure
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Path to the supplemental data element
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * supplemental-data | risk-adjustment-factor
    */
  var usage: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

object MeasureSupplementalData {
  @scala.inline
  def apply(
    _criteria: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _path: Element = null,
    criteria: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    identifier: Identifier = null,
    modifierExtension: js.Array[Extension] = null,
    path: String = null,
    usage: js.Array[CodeableConcept] = null
  ): MeasureSupplementalData = {
    val __obj = js.Dynamic.literal()
    if (_criteria != null) __obj.updateDynamic("_criteria")(_criteria.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_path != null) __obj.updateDynamic("_path")(_path.asInstanceOf[js.Any])
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureSupplementalData]
  }
}

