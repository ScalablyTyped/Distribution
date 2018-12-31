package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of how medication was taken
  */
trait MedicationAdministrationDosage extends BackboneElement {
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  /**
    * Amount of medication per dose
    */
  var dose: js.UndefOr[Quantity] = js.undefined
  /**
    * How drug was administered
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Dose quantity per unit of time
    */
  var rateQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Dose quantity per unit of time
    */
  var rateRatio: js.UndefOr[Ratio] = js.undefined
  /**
    * Path of substance into body
    */
  var route: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Body site administered to
    */
  var site: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Free text dosage instructions e.g. SIG
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

