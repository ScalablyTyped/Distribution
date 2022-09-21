package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.available
import typings.fhir.fhirStrings.unavailable_
import typings.fhir.fhirStrings.unsatisfactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Specimen
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _receivedTime: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The identifier assigned by the lab when accessioning specimen(s). This is not necessarily the same as the specimen identifier, depending on local lab procedures.
    */
  var accessionIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Details concerning the specimen collection.
    */
  var collection: js.UndefOr[SpecimenCollection] = js.undefined
  
  /**
    * Specimen condition is an observation made about the specimen.  It's a point-in-time assessment.  It can be used to assess its quality or appropriateness for a specific test.
    */
  var condition: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
    */
  var container: js.UndefOr[js.Array[SpecimenContainer]] = js.undefined
  
  /**
    * Id for specimen.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * To communicate any details or issues about the specimen or during the specimen collection. (for example: broken vial, sent with patient, frozen).
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * The parent specimen could be the source from which the current specimen is derived by some processing step (e.g. an aliquot or isolate or extracted nucleic acids from clinical samples) or one of many specimens that were combined to create a pooled sample.
    */
  var parent: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Details concerning processing and processing steps for the specimen.
    */
  var processing: js.UndefOr[js.Array[SpecimenProcessing]] = js.undefined
  
  /**
    * Time when specimen is received by the testing laboratory for processing or testing.
    */
  var receivedTime: js.UndefOr[String] = js.undefined
  
  /**
    * The request may be explicit or implied such with a ServiceRequest that requires a blood draw.
    */
  var request: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Specimen: typings.fhir.fhirStrings.Specimen
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: js.UndefOr[available | unavailable_ | unsatisfactory | `entered-in-error`] = js.undefined
  
  /**
    * Where the specimen came from. This may be from patient(s), from a location (e.g., the source of an environmental sample), or a sampling of a substance, a biologically-derived product, or a device.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * The type can change the way that a specimen is handled and drives what kind of analyses can properly be performed on the specimen. It is frequently used in diagnostic work flow decision making systems.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object Specimen {
  
  inline def apply(): Specimen = {
    val __obj = js.Dynamic.literal(resourceType = "Specimen")
    __obj.asInstanceOf[Specimen]
  }
  
  extension [Self <: Specimen](x: Self) {
    
    inline def setAccessionIdentifier(value: Identifier): Self = StObject.set(x, "accessionIdentifier", value.asInstanceOf[js.Any])
    
    inline def setAccessionIdentifierUndefined: Self = StObject.set(x, "accessionIdentifier", js.undefined)
    
    inline def setCollection(value: SpecimenCollection): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    inline def setCondition(value: js.Array[CodeableConcept]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setConditionVarargs(value: CodeableConcept*): Self = StObject.set(x, "condition", js.Array(value*))
    
    inline def setContainer(value: js.Array[SpecimenContainer]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setContainerVarargs(value: SpecimenContainer*): Self = StObject.set(x, "container", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setParent(value: js.Array[Reference]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setParentVarargs(value: Reference*): Self = StObject.set(x, "parent", js.Array(value*))
    
    inline def setProcessing(value: js.Array[SpecimenProcessing]): Self = StObject.set(x, "processing", value.asInstanceOf[js.Any])
    
    inline def setProcessingUndefined: Self = StObject.set(x, "processing", js.undefined)
    
    inline def setProcessingVarargs(value: SpecimenProcessing*): Self = StObject.set(x, "processing", js.Array(value*))
    
    inline def setReceivedTime(value: String): Self = StObject.set(x, "receivedTime", value.asInstanceOf[js.Any])
    
    inline def setReceivedTimeUndefined: Self = StObject.set(x, "receivedTime", js.undefined)
    
    inline def setRequest(value: js.Array[Reference]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRequestVarargs(value: Reference*): Self = StObject.set(x, "request", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Specimen): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: available | unavailable_ | unsatisfactory | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_receivedTime(value: Element): Self = StObject.set(x, "_receivedTime", value.asInstanceOf[js.Any])
    
    inline def set_receivedTimeUndefined: Self = StObject.set(x, "_receivedTime", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
