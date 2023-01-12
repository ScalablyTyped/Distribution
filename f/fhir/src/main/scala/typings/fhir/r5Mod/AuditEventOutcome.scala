package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditEventOutcome
  extends StObject
     with BackboneElement {
  
  /**
    * In some cases a "success" may be partial, for example, an incomplete or interrupted transfer of a radiological study. For the purpose of establishing accountability, these distinctions are not relevant.
    */
  var code: Coding
  
  /**
    * A human readable description of the error issue SHOULD be placed in details.text.
    */
  var detail: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object AuditEventOutcome {
  
  inline def apply(code: Coding): AuditEventOutcome = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditEventOutcome]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditEventOutcome] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Coding): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: js.Array[CodeableConcept]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: CodeableConcept*): Self = StObject.set(x, "detail", js.Array(value*))
  }
}
