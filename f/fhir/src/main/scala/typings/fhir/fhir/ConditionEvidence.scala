package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Supporting evidence
  */
@js.native
trait ConditionEvidence extends BackboneElement {
  
  /**
    * Manifestation/symptom
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Supporting information found elsewhere
    */
  var detail: js.UndefOr[js.Array[Reference]] = js.native
}
object ConditionEvidence {
  
  @scala.inline
  def apply(): ConditionEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionEvidence]
  }
  
  @scala.inline
  implicit class ConditionEvidenceMutableBuilder[Self <: ConditionEvidence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "code", js.Array(value :_*))
    
    @scala.inline
    def setDetail(value: js.Array[Reference]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setDetailVarargs(value: Reference*): Self = StObject.set(x, "detail", js.Array(value :_*))
  }
}
