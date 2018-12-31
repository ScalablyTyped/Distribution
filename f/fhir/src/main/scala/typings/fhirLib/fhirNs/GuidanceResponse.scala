package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The formal response to a guidance request
  */
trait GuidanceResponse extends DomainResource {
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'requestId'.
    */
  var _requestId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Encounter or Episode during which the response was returned
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * Additional required data
    */
  var dataRequirement: js.UndefOr[js.Array[DataRequirement]] = js.undefined
  /**
    * Messages resulting from the evaluation of the artifact or artifacts
    */
  var evaluationMessage: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * A reference to a knowledge module
    */
  var module: Reference
  /**
    * Additional notes about the response
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * When the guidance response was processed
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * The output parameters of the evaluation, if any
    */
  var outputParameters: js.UndefOr[Reference] = js.undefined
  /**
    * Device returning the guidance
    */
  var performer: js.UndefOr[Reference] = js.undefined
  /**
    * Reason for the response
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Reason for the response
    */
  var reasonReference: js.UndefOr[Reference] = js.undefined
  /**
    * The id of the request associated with this response, if any
    */
  var requestId: js.UndefOr[id] = js.undefined
  /**
    * Proposed actions, if any
    */
  var result: js.UndefOr[Reference] = js.undefined
  /**
    * success | data-requested | data-required | in-progress | failure | entered-in-error
    */
  var status: code
  /**
    * Patient the request was performed for
    */
  var subject: js.UndefOr[Reference] = js.undefined
}

