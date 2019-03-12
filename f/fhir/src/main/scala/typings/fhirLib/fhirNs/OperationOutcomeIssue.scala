package typings
package fhirLib.fhirNs

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
  var code: fhirLib.fhirNs.code
  /**
    * Additional details about the error
    */
  var details: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Additional diagnostic information about the issue
    */
  var diagnostics: js.UndefOr[java.lang.String] = js.undefined
  /**
    * FHIRPath of element(s) related to issue
    */
  var expression: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Path of element(s) related to issue
    */
  var location: js.UndefOr[js.Array[java.lang.String]] = js.undefined
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
    diagnostics: java.lang.String = null,
    expression: js.Array[java.lang.String] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    location: js.Array[java.lang.String] = null,
    modifierExtension: js.Array[Extension] = null
  ): OperationOutcomeIssue = {
    val __obj = js.Dynamic.literal(code = code, severity = severity)
    if (_code != null) __obj.updateDynamic("_code")(_code)
    if (_diagnostics != null) __obj.updateDynamic("_diagnostics")(_diagnostics)
    if (_expression != null) __obj.updateDynamic("_expression")(_expression)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_location != null) __obj.updateDynamic("_location")(_location)
    if (_severity != null) __obj.updateDynamic("_severity")(_severity)
    if (details != null) __obj.updateDynamic("details")(details)
    if (diagnostics != null) __obj.updateDynamic("diagnostics")(diagnostics)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (location != null) __obj.updateDynamic("location")(location)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[OperationOutcomeIssue]
  }
}

