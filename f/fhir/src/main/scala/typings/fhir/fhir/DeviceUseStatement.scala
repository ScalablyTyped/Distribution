package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Record of use of a device
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait DeviceUseStatement extends DomainResource {
  
  /**
    * Contains extended information for property 'recordedOn'.
    */
  var _recordedOn: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'timingDateTime'.
    */
  var _timingDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Target body site
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Reference to device used
    */
  var device: Reference = js.native
  
  /**
    * External identifier for this record
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Why device was used
    */
  var indication: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Addition details (comments, instructions)
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * When statement was recorded
    */
  var recordedOn: js.UndefOr[dateTime] = js.native
  
  /**
    * Who made the statement
    */
  var source: js.UndefOr[Reference] = js.native
  
  /**
    * active | completed | entered-in-error +
    */
  var status: code = js.native
  
  /**
    * Patient using device
    */
  var subject: Reference = js.native
  
  /**
    * How often  the device was used
    */
  var timingDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * How often  the device was used
    */
  var timingPeriod: js.UndefOr[Period] = js.native
  
  /**
    * How often  the device was used
    */
  var timingTiming: js.UndefOr[Timing] = js.native
  
  /**
    * Period device was used
    */
  var whenUsed: js.UndefOr[Period] = js.native
}
object DeviceUseStatement {
  
  @scala.inline
  def apply(device: Reference, status: code, subject: Reference): DeviceUseStatement = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceUseStatement]
  }
  
  @scala.inline
  implicit class DeviceUseStatementOps[Self <: DeviceUseStatement] (val x: Self) extends AnyVal {
    
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
    def setDevice(value: Reference): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_recordedOn(value: Element): Self = this.set("_recordedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_recordedOn: Self = this.set("_recordedOn", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def set_timingDateTime(value: Element): Self = this.set("_timingDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_timingDateTime: Self = this.set("_timingDateTime", js.undefined)
    
    @scala.inline
    def setBodySite(value: CodeableConcept): Self = this.set("bodySite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodySite: Self = this.set("bodySite", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setIndicationVarargs(value: CodeableConcept*): Self = this.set("indication", js.Array(value :_*))
    
    @scala.inline
    def setIndication(value: js.Array[CodeableConcept]): Self = this.set("indication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndication: Self = this.set("indication", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    
    @scala.inline
    def setRecordedOn(value: dateTime): Self = this.set("recordedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordedOn: Self = this.set("recordedOn", js.undefined)
    
    @scala.inline
    def setSource(value: Reference): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setTimingDateTime(value: dateTime): Self = this.set("timingDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimingDateTime: Self = this.set("timingDateTime", js.undefined)
    
    @scala.inline
    def setTimingPeriod(value: Period): Self = this.set("timingPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimingPeriod: Self = this.set("timingPeriod", js.undefined)
    
    @scala.inline
    def setTimingTiming(value: Timing): Self = this.set("timingTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimingTiming: Self = this.set("timingTiming", js.undefined)
    
    @scala.inline
    def setWhenUsed(value: Period): Self = this.set("whenUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhenUsed: Self = this.set("whenUsed", js.undefined)
  }
}
