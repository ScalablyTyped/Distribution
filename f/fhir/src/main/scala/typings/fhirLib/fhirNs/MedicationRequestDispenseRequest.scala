package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Medication supply authorization
  */
trait MedicationRequestDispenseRequest extends BackboneElement {
  /**
    * Contains extended information for property 'numberOfRepeatsAllowed'.
    */
  var _numberOfRepeatsAllowed: js.UndefOr[Element] = js.undefined
  /**
    * Number of days supply per dispense
    */
  var expectedSupplyDuration: js.UndefOr[Duration] = js.undefined
  /**
    * Number of refills authorized
    */
  var numberOfRepeatsAllowed: js.UndefOr[positiveInt] = js.undefined
  /**
    * Intended dispenser
    */
  var performer: js.UndefOr[Reference] = js.undefined
  /**
    * Amount of medication to supply per dispense
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Time period supply is authorized for
    */
  var validityPeriod: js.UndefOr[Period] = js.undefined
}

