package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecimenDefinition
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _timeAspect: js.UndefOr[Element] = js.undefined
  
  /**
    * The action to be performed for collecting the specimen.
    */
  var collection: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A business identifier associated with the kind of specimen.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Preparation of the patient for specimen collection.
    */
  var patientPreparation: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_SpecimenDefinition: typings.fhir.fhirStrings.SpecimenDefinition
  
  /**
    * Time aspect of specimen collection (duration or offset).
    */
  var timeAspect: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of material to be collected.
    */
  var typeCollected: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Specimen conditioned in a container as expected by the testing laboratory.
    */
  var typeTested: js.UndefOr[js.Array[SpecimenDefinitionTypeTested]] = js.undefined
}
object SpecimenDefinition {
  
  inline def apply(): SpecimenDefinition = {
    val __obj = js.Dynamic.literal(resourceType = "SpecimenDefinition")
    __obj.asInstanceOf[SpecimenDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecimenDefinition] (val x: Self) extends AnyVal {
    
    inline def setCollection(value: js.Array[CodeableConcept]): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    inline def setCollectionVarargs(value: CodeableConcept*): Self = StObject.set(x, "collection", js.Array(value*))
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setPatientPreparation(value: js.Array[CodeableConcept]): Self = StObject.set(x, "patientPreparation", value.asInstanceOf[js.Any])
    
    inline def setPatientPreparationUndefined: Self = StObject.set(x, "patientPreparation", js.undefined)
    
    inline def setPatientPreparationVarargs(value: CodeableConcept*): Self = StObject.set(x, "patientPreparation", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.SpecimenDefinition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setTimeAspect(value: String): Self = StObject.set(x, "timeAspect", value.asInstanceOf[js.Any])
    
    inline def setTimeAspectUndefined: Self = StObject.set(x, "timeAspect", js.undefined)
    
    inline def setTypeCollected(value: CodeableConcept): Self = StObject.set(x, "typeCollected", value.asInstanceOf[js.Any])
    
    inline def setTypeCollectedUndefined: Self = StObject.set(x, "typeCollected", js.undefined)
    
    inline def setTypeTested(value: js.Array[SpecimenDefinitionTypeTested]): Self = StObject.set(x, "typeTested", value.asInstanceOf[js.Any])
    
    inline def setTypeTestedUndefined: Self = StObject.set(x, "typeTested", js.undefined)
    
    inline def setTypeTestedVarargs(value: SpecimenDefinitionTypeTested*): Self = StObject.set(x, "typeTested", js.Array(value*))
    
    inline def set_timeAspect(value: Element): Self = StObject.set(x, "_timeAspect", value.asInstanceOf[js.Any])
    
    inline def set_timeAspectUndefined: Self = StObject.set(x, "_timeAspect", js.undefined)
  }
}
