package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Qualifications obtained by training and certification
  */
trait PractitionerQualification extends BackboneElement {
  /**
    * Coded representation of the qualification
    */
  var code: CodeableConcept
  /**
    * An identifier for this qualification for the practitioner
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Organization that regulates and issues the qualification
    */
  var issuer: js.UndefOr[Reference] = js.undefined
  /**
    * Period during which the qualification is valid
    */
  var period: js.UndefOr[Period] = js.undefined
}

object PractitionerQualification {
  @scala.inline
  def apply(
    code: CodeableConcept,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    identifier: js.Array[Identifier] = null,
    issuer: Reference = null,
    modifierExtension: js.Array[Extension] = null,
    period: Period = null
  ): PractitionerQualification = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    __obj.asInstanceOf[PractitionerQualification]
  }
}

