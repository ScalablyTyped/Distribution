package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stage/grade, usually assessed formally
  */
@js.native
trait ConditionStage extends BackboneElement {
  
  /**
    * Formal record of assessment
    */
  var assessment: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Simple summary (disease specific)
    */
  var summary: js.UndefOr[CodeableConcept] = js.native
}
object ConditionStage {
  
  @scala.inline
  def apply(): ConditionStage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionStage]
  }
  
  @scala.inline
  implicit class ConditionStageOps[Self <: ConditionStage] (val x: Self) extends AnyVal {
    
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
    def setAssessmentVarargs(value: Reference*): Self = this.set("assessment", js.Array(value :_*))
    
    @scala.inline
    def setAssessment(value: js.Array[Reference]): Self = this.set("assessment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssessment: Self = this.set("assessment", js.undefined)
    
    @scala.inline
    def setSummary(value: CodeableConcept): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
}
