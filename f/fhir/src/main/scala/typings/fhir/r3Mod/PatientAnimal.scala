package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatientAnimal
  extends StObject
     with BackboneElement {
  
  /**
    * Breed MAY be used to provide further taxonomic or non-taxonomic classification.  It may involve local or proprietary designation--such as commercial strain--and/or additional information such as production type.
    */
  var breed: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Indicates the current state of the animal's reproductive organs.
    */
  var genderStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * If the patient is non-human, at least a species SHALL be specified. Species SHALL be a widely recognised taxonomic classification.  It may or may not be Linnaean taxonomy and may or may not be at the level of species. If the level is finer than species--such as a breed code--the code system used SHALL allow inference of the species.  (The common example is that the word "Hereford" does not allow inference of the species Bos taurus, because there is a Hereford pig breed, but the SNOMED CT code for "Hereford Cattle Breed" does.).
    */
  var species: CodeableConcept
}
object PatientAnimal {
  
  inline def apply(species: CodeableConcept): PatientAnimal = {
    val __obj = js.Dynamic.literal(species = species.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatientAnimal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatientAnimal] (val x: Self) extends AnyVal {
    
    inline def setBreed(value: CodeableConcept): Self = StObject.set(x, "breed", value.asInstanceOf[js.Any])
    
    inline def setBreedUndefined: Self = StObject.set(x, "breed", js.undefined)
    
    inline def setGenderStatus(value: CodeableConcept): Self = StObject.set(x, "genderStatus", value.asInstanceOf[js.Any])
    
    inline def setGenderStatusUndefined: Self = StObject.set(x, "genderStatus", js.undefined)
    
    inline def setSpecies(value: CodeableConcept): Self = StObject.set(x, "species", value.asInstanceOf[js.Any])
  }
}
