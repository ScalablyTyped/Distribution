package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Record of use of a device
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait DeviceUseStatement
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'recordedOn'.
    */
  var _recordedOn: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'timingDateTime'.
    */
  var _timingDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Target body site
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Reference to device used
    */
  var device: Reference
  
  /**
    * External identifier for this record
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Why device was used
    */
  var indication: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Addition details (comments, instructions)
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * When statement was recorded
    */
  var recordedOn: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Who made the statement
    */
  var source: js.UndefOr[Reference] = js.undefined
  
  /**
    * active | completed | entered-in-error +
    */
  var status: code
  
  /**
    * Patient using device
    */
  var subject: Reference
  
  /**
    * How often  the device was used
    */
  var timingDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * How often  the device was used
    */
  var timingPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * How often  the device was used
    */
  var timingTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * Period device was used
    */
  var whenUsed: js.UndefOr[Period] = js.undefined
}
object DeviceUseStatement {
  
  inline def apply(device: Reference, status: code, subject: Reference): DeviceUseStatement = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceUseStatement]
  }
  
  extension [Self <: DeviceUseStatement](x: Self) {
    
    inline def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setIndication(value: js.Array[CodeableConcept]): Self = StObject.set(x, "indication", value.asInstanceOf[js.Any])
    
    inline def setIndicationUndefined: Self = StObject.set(x, "indication", js.undefined)
    
    inline def setIndicationVarargs(value: CodeableConcept*): Self = StObject.set(x, "indication", js.Array(value :_*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    inline def setRecordedOn(value: dateTime): Self = StObject.set(x, "recordedOn", value.asInstanceOf[js.Any])
    
    inline def setRecordedOnUndefined: Self = StObject.set(x, "recordedOn", js.undefined)
    
    inline def setSource(value: Reference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTimingDateTime(value: dateTime): Self = StObject.set(x, "timingDateTime", value.asInstanceOf[js.Any])
    
    inline def setTimingDateTimeUndefined: Self = StObject.set(x, "timingDateTime", js.undefined)
    
    inline def setTimingPeriod(value: Period): Self = StObject.set(x, "timingPeriod", value.asInstanceOf[js.Any])
    
    inline def setTimingPeriodUndefined: Self = StObject.set(x, "timingPeriod", js.undefined)
    
    inline def setTimingTiming(value: Timing): Self = StObject.set(x, "timingTiming", value.asInstanceOf[js.Any])
    
    inline def setTimingTimingUndefined: Self = StObject.set(x, "timingTiming", js.undefined)
    
    inline def setWhenUsed(value: Period): Self = StObject.set(x, "whenUsed", value.asInstanceOf[js.Any])
    
    inline def setWhenUsedUndefined: Self = StObject.set(x, "whenUsed", js.undefined)
    
    inline def set_recordedOn(value: Element): Self = StObject.set(x, "_recordedOn", value.asInstanceOf[js.Any])
    
    inline def set_recordedOnUndefined: Self = StObject.set(x, "_recordedOn", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_timingDateTime(value: Element): Self = StObject.set(x, "_timingDateTime", value.asInstanceOf[js.Any])
    
    inline def set_timingDateTimeUndefined: Self = StObject.set(x, "_timingDateTime", js.undefined)
  }
}
