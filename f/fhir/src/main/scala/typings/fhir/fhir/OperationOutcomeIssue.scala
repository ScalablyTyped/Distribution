package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single issue associated with the action
  */
trait OperationOutcomeIssue extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'diagnostics'.
    */
  var _diagnostics: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'expression'.
    */
  var _expression: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'location'.
    */
  var _location: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'severity'.
    */
  var _severity: js.UndefOr[Element] = js.undefined
  /**
    * Error or warning code
    */
  var code: typings.fhir.fhir.code
  /**
    * Additional details about the error
    */
  var details: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Additional diagnostic information about the issue
    */
  var diagnostics: js.UndefOr[String] = js.undefined
  /**
    * FHIRPath of element(s) related to issue
    */
  var expression: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Path of element(s) related to issue
    */
  var location: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * fatal | error | warning | information
    */
  var severity: code
}

object OperationOutcomeIssue {
  @scala.inline
  def apply(
    code: code,
    severity: code,
    _code: Element = null,
    _diagnostics: Element = null,
    _expression: js.Array[Element] = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _location: js.Array[Element] = null,
    _severity: Element = null,
    details: CodeableConcept = null,
    diagnostics: String = null,
    expression: js.Array[String] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    location: js.Array[String] = null,
    modifierExtension: js.Array[Extension] = null
  ): OperationOutcomeIssue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    if (_code != null) __obj.updateDynamic("_code")(_code.asInstanceOf[js.Any])
    if (_diagnostics != null) __obj.updateDynamic("_diagnostics")(_diagnostics.asInstanceOf[js.Any])
    if (_expression != null) __obj.updateDynamic("_expression")(_expression.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_location != null) __obj.updateDynamic("_location")(_location.asInstanceOf[js.Any])
    if (_severity != null) __obj.updateDynamic("_severity")(_severity.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (diagnostics != null) __obj.updateDynamic("diagnostics")(diagnostics.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationOutcomeIssue]
  }
}

