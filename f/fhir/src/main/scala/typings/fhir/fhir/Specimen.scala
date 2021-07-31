package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sample for analysis
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Specimen
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'receivedTime'.
    */
  var _receivedTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Identifier assigned by the lab
    */
  var accessionIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Collection details
    */
  var collection: js.UndefOr[SpecimenCollection] = js.undefined
  
  /**
    * Direct container of specimen (tube/slide, etc.)
    */
  var container: js.UndefOr[js.Array[SpecimenContainer]] = js.undefined
  
  /**
    * External Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Comments
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Specimen from which this specimen originated
    */
  var parent: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Processing and processing step details
    */
  var processing: js.UndefOr[js.Array[SpecimenProcessing]] = js.undefined
  
  /**
    * The time when specimen was received for processing
    */
  var receivedTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Why the specimen was collected
    */
  var request: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * available | unavailable | unsatisfactory | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  
  /**
    * Where the specimen came from. This may be from the patient(s) or from the environment or a device
    */
  var subject: Reference
  
  /**
    * Kind of material that forms the specimen
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object Specimen {
  
  @scala.inline
  def apply(subject: Reference): Specimen = {
    val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Specimen]
  }
  
  @scala.inline
  implicit class SpecimenMutableBuilder[Self <: Specimen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessionIdentifier(value: Identifier): Self = StObject.set(x, "accessionIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessionIdentifierUndefined: Self = StObject.set(x, "accessionIdentifier", js.undefined)
    
    @scala.inline
    def setCollection(value: SpecimenCollection): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    @scala.inline
    def setContainer(value: js.Array[SpecimenContainer]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setContainerVarargs(value: SpecimenContainer*): Self = StObject.set(x, "container", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: js.Array[Reference]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setParentVarargs(value: Reference*): Self = StObject.set(x, "parent", js.Array(value :_*))
    
    @scala.inline
    def setProcessing(value: js.Array[SpecimenProcessing]): Self = StObject.set(x, "processing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingUndefined: Self = StObject.set(x, "processing", js.undefined)
    
    @scala.inline
    def setProcessingVarargs(value: SpecimenProcessing*): Self = StObject.set(x, "processing", js.Array(value :_*))
    
    @scala.inline
    def setReceivedTime(value: dateTime): Self = StObject.set(x, "receivedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceivedTimeUndefined: Self = StObject.set(x, "receivedTime", js.undefined)
    
    @scala.inline
    def setRequest(value: js.Array[Reference]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setRequestVarargs(value: Reference*): Self = StObject.set(x, "request", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def set_receivedTime(value: Element): Self = StObject.set(x, "_receivedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_receivedTimeUndefined: Self = StObject.set(x, "_receivedTime", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
