package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Item containing charge code(s) associated with the provision of healthcare provider products
  */
trait ChargeItem extends DomainResource {
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'enteredDate'.
    */
  var _enteredDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'factorOverride'.
    */
  var _factorOverride: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'overrideReason'.
    */
  var _overrideReason: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Account to place this charge
    */
  var account: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Anatomical location, if relevant
    */
  var bodysite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * A code that identifies the charge, like a billing code
    */
  var code: CodeableConcept
  /**
    * Encounter / Episode associated with event
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * Defining information about the code of this charge item
    */
  var definition: js.UndefOr[js.Array[uri]] = js.undefined
  /**
    * Date the charge item was entered
    */
  var enteredDate: js.UndefOr[dateTime] = js.undefined
  /**
    * Individual who was entering
    */
  var enterer: js.UndefOr[Reference] = js.undefined
  /**
    * Factor overriding the associated rules
    */
  var factorOverride: js.UndefOr[decimal] = js.undefined
  /**
    * Business Identifier for item
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Comments made about the ChargeItem
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * When the charged service was applied
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * When the charged service was applied
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  /**
    * When the charged service was applied
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  /**
    * Reason for overriding the list price/factor
    */
  var overrideReason: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Part of referenced ChargeItem
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Who performed charged service
    */
  var participant: js.UndefOr[js.Array[ChargeItemParticipant]] = js.undefined
  /**
    * Organization providing the charged sevice
    */
  var performingOrganization: js.UndefOr[Reference] = js.undefined
  /**
    * Price overriding the associated rules
    */
  var priceOverride: js.UndefOr[Money] = js.undefined
  /**
    * Quantity of which the charge item has been serviced
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Why was the charged  service rendered?
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Organization requesting the charged service
    */
  var requestingOrganization: js.UndefOr[Reference] = js.undefined
  /**
    * Which rendered service is being charged?
    */
  var service: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * planned | billable | not-billable | aborted | billed | entered-in-error | unknown
    */
  var status: code
  /**
    * Individual service was done for/to
    */
  var subject: Reference
  /**
    * Further information supporting the this charge
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.undefined
}

