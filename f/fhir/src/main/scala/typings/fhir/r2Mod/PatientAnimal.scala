package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatientAnimal
  extends StObject
     with BackboneElement {
  
  /**
    * May need to know the specific kind within the species.
    */
  var breed: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Gender status can affect housing and animal behavior.
    */
  var genderStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Need to know what kind of animal.
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
