package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of a Medication
  */
trait Medication extends DomainResource {
  /**
    * Contains extended information for property 'isBrand'.
    */
  var _isBrand: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'isOverTheCounter'.
    */
  var _isOverTheCounter: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Codes that identify this medication
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * powder | tablets | capsule +
    */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Picture of the medication
    */
  var image: js.UndefOr[js.Array[Attachment]] = js.undefined
  /**
    * Active or inactive ingredient
    */
  var ingredient: js.UndefOr[js.Array[MedicationIngredient]] = js.undefined
  /**
    * True if a brand
    */
  var isBrand: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * True if medication does not require a prescription
    */
  var isOverTheCounter: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Manufacturer of the item
    */
  var manufacturer: js.UndefOr[Reference] = js.undefined
  /**
    * Details about packaged medications
    */
  var `package`: js.UndefOr[MedicationPackage] = js.undefined
  /**
    * active | inactive | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
}

