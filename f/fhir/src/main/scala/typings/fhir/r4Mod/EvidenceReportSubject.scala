package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceReportSubject
  extends StObject
     with BackboneElement {
  
  /**
    * Characteristic.
    */
  var characteristic: js.UndefOr[js.Array[EvidenceReportSubjectCharacteristic]] = js.undefined
  
  /**
    * Used for general notes and annotations not coded elsewhere.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
}
object EvidenceReportSubject {
  
  inline def apply(): EvidenceReportSubject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvidenceReportSubject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EvidenceReportSubject] (val x: Self) extends AnyVal {
    
    inline def setCharacteristic(value: js.Array[EvidenceReportSubjectCharacteristic]): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicUndefined: Self = StObject.set(x, "characteristic", js.undefined)
    
    inline def setCharacteristicVarargs(value: EvidenceReportSubjectCharacteristic*): Self = StObject.set(x, "characteristic", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
  }
}
