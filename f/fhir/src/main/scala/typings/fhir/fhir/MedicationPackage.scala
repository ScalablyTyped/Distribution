package typings.fhir.fhir

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
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): MedicationPackage = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (batch != null) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationPackage]
  }
}

