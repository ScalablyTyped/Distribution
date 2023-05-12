package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceDefinitionCode
  extends StObject
     with BackboneElement {
  
  var _statusDate: js.UndefOr[Element] = js.undefined
  
  /**
    * The specific code.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Any comment can be provided in this field, if necessary.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Supporting literature.
    */
  var source: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Status of the code assignment, for example 'provisional', 'approved'.
    */
  var status: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The date at which the code status was changed as part of the terminology maintenance.
    */
  var statusDate: js.UndefOr[String] = js.undefined
}
object SubstanceDefinitionCode {
  
  inline def apply(): SubstanceDefinitionCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceDefinitionCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceDefinitionCode] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setSource(value: js.Array[Reference]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: Reference*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setStatus(value: CodeableConcept): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusDate(value: String): Self = StObject.set(x, "statusDate", value.asInstanceOf[js.Any])
    
    inline def setStatusDateUndefined: Self = StObject.set(x, "statusDate", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def set_statusDate(value: Element): Self = StObject.set(x, "_statusDate", value.asInstanceOf[js.Any])
    
    inline def set_statusDateUndefined: Self = StObject.set(x, "_statusDate", js.undefined)
  }
}
