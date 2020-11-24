package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sample for analysis
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Specimen extends DomainResource {
  
  /**
    * Contains extended information for property 'receivedTime'.
    */
  var _receivedTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Identifier assigned by the lab
    */
  var accessionIdentifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Collection details
    */
  var collection: js.UndefOr[SpecimenCollection] = js.native
  
  /**
    * Direct container of specimen (tube/slide, etc.)
    */
  var container: js.UndefOr[js.Array[SpecimenContainer]] = js.native
  
  /**
    * External Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Comments
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * Specimen from which this specimen originated
    */
  var parent: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Processing and processing step details
    */
  var processing: js.UndefOr[js.Array[SpecimenProcessing]] = js.native
  
  /**
    * The time when specimen was received for processing
    */
  var receivedTime: js.UndefOr[dateTime] = js.native
  
  /**
    * Why the specimen was collected
    */
  var request: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * available | unavailable | unsatisfactory | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  
  /**
    * Where the specimen came from. This may be from the patient(s) or from the environment or a device
    */
  var subject: Reference = js.native
  
  /**
    * Kind of material that forms the specimen
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}
object Specimen {
  
  @scala.inline
  def apply(subject: Reference): Specimen = {
    val __obj = js.Dynamic.literal(subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Specimen]
  }
  
  @scala.inline
  implicit class SpecimenOps[Self <: Specimen] (val x: Self) extends AnyVal {
    
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
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_receivedTime(value: Element): Self = this.set("_receivedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_receivedTime: Self = this.set("_receivedTime", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setAccessionIdentifier(value: Identifier): Self = this.set("accessionIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessionIdentifier: Self = this.set("accessionIdentifier", js.undefined)
    
    @scala.inline
    def setCollection(value: SpecimenCollection): Self = this.set("collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollection: Self = this.set("collection", js.undefined)
    
    @scala.inline
    def setContainerVarargs(value: SpecimenContainer*): Self = this.set("container", js.Array(value :_*))
    
    @scala.inline
    def setContainer(value: js.Array[SpecimenContainer]): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    
    @scala.inline
    def setParentVarargs(value: Reference*): Self = this.set("parent", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: js.Array[Reference]): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setProcessingVarargs(value: SpecimenProcessing*): Self = this.set("processing", js.Array(value :_*))
    
    @scala.inline
    def setProcessing(value: js.Array[SpecimenProcessing]): Self = this.set("processing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessing: Self = this.set("processing", js.undefined)
    
    @scala.inline
    def setReceivedTime(value: dateTime): Self = this.set("receivedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceivedTime: Self = this.set("receivedTime", js.undefined)
    
    @scala.inline
    def setRequestVarargs(value: Reference*): Self = this.set("request", js.Array(value :_*))
    
    @scala.inline
    def setRequest(value: js.Array[Reference]): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
