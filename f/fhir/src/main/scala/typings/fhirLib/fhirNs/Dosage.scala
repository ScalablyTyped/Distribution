package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * How the medication is/was taken or should be taken
  */
trait Dosage extends Element {
  /**
    * Contains extended information for property 'asNeededBoolean'.
    */
  var _asNeededBoolean: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'patientInstruction'.
    */
  var _patientInstruction: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  /**
    * Supplemental instruction - e.g. "with meals"
    */
  var additionalInstruction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Take "as needed" (for x)
    */
  var asNeededBoolean: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Take "as needed" (for x)
    */
  var asNeededCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Amount of medication per dose
    */
  var doseQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Amount of medication per dose
    */
  var doseRange: js.UndefOr[Range] = js.undefined
  /**
    * Upper limit on medication per administration
    */
  var maxDosePerAdministration: js.UndefOr[Quantity] = js.undefined
  /**
    * Upper limit on medication per lifetime of the patient
    */
  var maxDosePerLifetime: js.UndefOr[Quantity] = js.undefined
  /**
    * Upper limit on medication per unit of time
    */
  var maxDosePerPeriod: js.UndefOr[Ratio] = js.undefined
  /**
    * Technique for administering medication
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Patient or consumer oriented instructions
    */
  var patientInstruction: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Amount of medication per unit of time
    */
  var rateQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Amount of medication per unit of time
    */
  var rateRange: js.UndefOr[Range] = js.undefined
  /**
    * Amount of medication per unit of time
    */
  var rateRatio: js.UndefOr[Ratio] = js.undefined
  /**
    * How drug should enter body
    */
  var route: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * The order of the dosage instructions
    */
  var sequence: js.UndefOr[integer] = js.undefined
  /**
    * Body site to administer to
    */
  var site: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Free text dosage instructions e.g. SIG
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When medication should be administered
    */
  var timing: js.UndefOr[Timing] = js.undefined
}

