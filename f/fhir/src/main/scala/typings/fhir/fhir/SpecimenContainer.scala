package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Direct container of specimen (tube/slide, etc.)
  */
@js.native
trait SpecimenContainer extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Additive associated with container
    */
  var additiveCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  /**
    * Additive associated with container
    */
  var additiveReference: js.UndefOr[Reference] = js.native
  /**
    * Container volume or size
    */
  var capacity: js.UndefOr[Quantity] = js.native
  /**
    * Textual description of the container
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Id for the container
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Quantity of specimen within container
    */
  var specimenQuantity: js.UndefOr[Quantity] = js.native
  /**
    * Kind of container directly associated with specimen
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}

object SpecimenContainer {
  @scala.inline
  def apply(): SpecimenContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecimenContainer]
  }
  @scala.inline
  implicit class SpecimenContainerOps[Self <: SpecimenContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def setAdditiveCodeableConcept(value: CodeableConcept): Self = this.set("additiveCodeableConcept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditiveCodeableConcept: Self = this.set("additiveCodeableConcept", js.undefined)
    @scala.inline
    def setAdditiveReference(value: Reference): Self = this.set("additiveReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditiveReference: Self = this.set("additiveReference", js.undefined)
    @scala.inline
    def setCapacity(value: Quantity): Self = this.set("capacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacity: Self = this.set("capacity", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setSpecimenQuantity(value: Quantity): Self = this.set("specimenQuantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecimenQuantity: Self = this.set("specimenQuantity", js.undefined)
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

