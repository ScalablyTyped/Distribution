package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectedIssueEvidence
  extends StObject
     with BackboneElement {
  
  /**
    * A manifestation that led to the recording of this detected issue.
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Links to resources that constitute evidence for the detected issue such as a GuidanceResponse or MeasureReport.
    */
  var detail: js.UndefOr[js.Array[Reference]] = js.undefined
}
object DetectedIssueEvidence {
  
  inline def apply(): DetectedIssueEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedIssueEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectedIssueEvidence] (val x: Self) extends AnyVal {
    
    inline def setCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setDetail(value: js.Array[Reference]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: Reference*): Self = StObject.set(x, "detail", js.Array(value*))
  }
}
