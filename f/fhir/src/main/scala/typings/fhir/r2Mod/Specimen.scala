package typings.fhir.r2Mod

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
    * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in tray in rack is not addressed here.
    */
  var container: js.UndefOr[js.Array[SpecimenContainer]] = js.undefined
  
  /**
    * Id for specimen.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Reference to the parent (source) specimen which is used when the specimen was either derived from or a component of another specimen.
    */
  var parent: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Time when specimen was received for processing or testing.
    */
  var receivedTime: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Specimen: typings.fhir.fhirStrings.Specimen
  
  /**
    * The availability of the specimen.
    */
  var status: js.UndefOr[available | unavailable_ | unsatisfactory | `entered-in-error`] = js.undefined
  
  /**
    * Must know the subject context.
    */
  var subject: Reference
  
  /**
    * Details concerning treatment and processing steps for the specimen.
    */
  var treatment: js.UndefOr[js.Array[SpecimenTreatment]] = js.undefined
  
  /**
    * The kind of material that forms the specimen.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object Specimen {
  
  inline def apply(subject: Reference): Specimen = {
    val __obj = js.Dynamic.literal(resourceType = "Specimen", subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Specimen]
  }
  
  extension [Self <: Specimen](x: Self) {
    
    inline def setAccessionIdentifier(value: Identifier): Self = StObject.set(x, "accessionIdentifier", value.asInstanceOf[js.Any])
    
    inline def setAccessionIdentifierUndefined: Self = StObject.set(x, "accessionIdentifier", js.undefined)
    
    inline def setCollection(value: SpecimenCollection): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    inline def setContainer(value: js.Array[SpecimenContainer]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setContainerVarargs(value: SpecimenContainer*): Self = StObject.set(x, "container", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setParent(value: js.Array[Reference]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setParentVarargs(value: Reference*): Self = StObject.set(x, "parent", js.Array(value*))
    
    inline def setReceivedTime(value: String): Self = StObject.set(x, "receivedTime", value.asInstanceOf[js.Any])
    
    inline def setReceivedTimeUndefined: Self = StObject.set(x, "receivedTime", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Specimen): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: available | unavailable_ | unsatisfactory | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTreatment(value: js.Array[SpecimenTreatment]): Self = StObject.set(x, "treatment", value.asInstanceOf[js.Any])
    
    inline def setTreatmentUndefined: Self = StObject.set(x, "treatment", js.undefined)
    
    inline def setTreatmentVarargs(value: SpecimenTreatment*): Self = StObject.set(x, "treatment", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_receivedTime(value: Element): Self = StObject.set(x, "_receivedTime", value.asInstanceOf[js.Any])
    
    inline def set_receivedTimeUndefined: Self = StObject.set(x, "_receivedTime", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
