package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about packaged medications
  */
trait MedicationPackage extends BackboneElement {
  /**
    * Identifies a single production run
    */
  var batch: js.UndefOr[js.Array[MedicationPackageBatch]] = js.undefined
  /**
    * E.g. box, vial, blister-pack
    */
  var container: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * What is  in the package
    */
  var content: js.UndefOr[js.Array[MedicationPackageContent]] = js.undefined
}

object MedicationPackage {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    batch: js.Array[MedicationPackageBatch] = null,
    container: CodeableConcept = null,
    content: js.Array[MedicationPackageContent] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): MedicationPackage = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (batch != null) __obj.updateDynamic("batch")(batch)
    if (container != null) __obj.updateDynamic("container")(container)
    if (content != null) __obj.updateDynamic("content")(content)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[MedicationPackage]
  }
}

