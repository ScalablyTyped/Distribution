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
  var code: code
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

