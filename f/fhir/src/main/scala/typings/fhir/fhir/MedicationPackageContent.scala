package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What is  in the package
  */
trait MedicationPackageContent extends BackboneElement {
  /**
    * Quantity present in the package
    */
  var amount: js.UndefOr[Quantity] = js.undefined
  /**
    * The item in the package
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * The item in the package
    */
  var itemReference: js.UndefOr[Reference] = js.undefined
}

object MedicationPackageContent {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    amount: Quantity = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    itemCodeableConcept: CodeableConcept = null,
    itemReference: Reference = null,
    modifierExtension: js.Array[Extension] = null
  ): MedicationPackageContent = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (amount != null) __obj.updateDynamic("amount")(amount)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemCodeableConcept != null) __obj.updateDynamic("itemCodeableConcept")(itemCodeableConcept)
    if (itemReference != null) __obj.updateDynamic("itemReference")(itemReference)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[MedicationPackageContent]
  }
}

