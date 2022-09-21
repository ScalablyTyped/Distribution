package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyStructure
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _active: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * This element is labeled as a modifier because it may be used to mark that the resource was created in error.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This description could include any visual markings used to orientate the viewer e.g. external reference points, special sutures, ink markings.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier for this instance of the anatomical structure.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Image or images used to identify a location.
    */
  var image: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /**
    * The anatomical location or region of the specimen, lesion, or body structure.
    */
  var location: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Qualifier to refine the anatomical location.  These include qualifiers for laterality, relative location, directionality, number, and plane.
    */
  var locationQualifier: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The minimum cardinality of 0 supports the use case of specifying a location without defining a morphology.
    */
  var morphology: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The person to which the body site belongs.
    */
  var patient: Reference
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_BodyStructure: typings.fhir.fhirStrings.BodyStructure
}
object BodyStructure {
  
  inline def apply(patient: Reference): BodyStructure = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "BodyStructure")
    __obj.asInstanceOf[BodyStructure]
  }
  
  extension [Self <: BodyStructure](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setImage(value: js.Array[Attachment]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setImageVarargs(value: Attachment*): Self = StObject.set(x, "image", js.Array(value*))
    
    inline def setLocation(value: CodeableConcept): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationQualifier(value: js.Array[CodeableConcept]): Self = StObject.set(x, "locationQualifier", value.asInstanceOf[js.Any])
    
    inline def setLocationQualifierUndefined: Self = StObject.set(x, "locationQualifier", js.undefined)
    
    inline def setLocationQualifierVarargs(value: CodeableConcept*): Self = StObject.set(x, "locationQualifier", js.Array(value*))
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMorphology(value: CodeableConcept): Self = StObject.set(x, "morphology", value.asInstanceOf[js.Any])
    
    inline def setMorphologyUndefined: Self = StObject.set(x, "morphology", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: typings.fhir.fhirStrings.BodyStructure): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    inline def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
