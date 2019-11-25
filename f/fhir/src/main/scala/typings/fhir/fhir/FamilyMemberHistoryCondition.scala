package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Condition that the related person had
  */
trait FamilyMemberHistoryCondition extends BackboneElement {
  /**
    * Contains extended information for property 'onsetString'.
    */
  var _onsetString: js.UndefOr[Element] = js.undefined
  /**
    * Condition suffered by relation
    */
  var code: CodeableConcept
  /**
    * Extra information about condition
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * When condition first manifested
    */
  var onsetAge: js.UndefOr[Age] = js.undefined
  /**
    * When condition first manifested
    */
  var onsetPeriod: js.UndefOr[Period] = js.undefined
  /**
    * When condition first manifested
    */
  var onsetRange: js.UndefOr[Range] = js.undefined
  /**
    * When condition first manifested
    */
  var onsetString: js.UndefOr[String] = js.undefined
  /**
    * deceased | permanent disability | etc.
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
}

object FamilyMemberHistoryCondition {
  @scala.inline
  def apply(
    code: CodeableConcept,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _onsetString: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    onsetAge: Age = null,
    onsetPeriod: Period = null,
    onsetRange: Range = null,
    onsetString: String = null,
    outcome: CodeableConcept = null
  ): FamilyMemberHistoryCondition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_onsetString != null) __obj.updateDynamic("_onsetString")(_onsetString.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (onsetAge != null) __obj.updateDynamic("onsetAge")(onsetAge.asInstanceOf[js.Any])
    if (onsetPeriod != null) __obj.updateDynamic("onsetPeriod")(onsetPeriod.asInstanceOf[js.Any])
    if (onsetRange != null) __obj.updateDynamic("onsetRange")(onsetRange.asInstanceOf[js.Any])
    if (onsetString != null) __obj.updateDynamic("onsetString")(onsetString.asInstanceOf[js.Any])
    if (outcome != null) __obj.updateDynamic("outcome")(outcome.asInstanceOf[js.Any])
    __obj.asInstanceOf[FamilyMemberHistoryCondition]
  }
}

