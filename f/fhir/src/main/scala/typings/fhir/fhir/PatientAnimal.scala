package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This patient is known to be an animal (non-human)
  */
@js.native
trait PatientAnimal extends BackboneElement {
  
  /**
    * E.g. Poodle, Angus
    */
  var breed: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * E.g. Neutered, Intact
    */
  var genderStatus: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * E.g. Dog, Cow
    */
  var species: CodeableConcept = js.native
}
object PatientAnimal {
  
  @scala.inline
  def apply(species: CodeableConcept): PatientAnimal = {
    val __obj = js.Dynamic.literal(species = species.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatientAnimal]
  }
  
  @scala.inline
  implicit class PatientAnimalOps[Self <: PatientAnimal] (val x: Self) extends AnyVal {
    
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
    def setSpecies(value: CodeableConcept): Self = this.set("species", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreed(value: CodeableConcept): Self = this.set("breed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreed: Self = this.set("breed", js.undefined)
    
    @scala.inline
    def setGenderStatus(value: CodeableConcept): Self = this.set("genderStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenderStatus: Self = this.set("genderStatus", js.undefined)
  }
}
