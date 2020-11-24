package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional rule -  addition or removal of permissions
  */
@js.native
trait ConsentExcept extends BackboneElement {
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Actions controlled by this exception
    */
  var action: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Who|what controlled by this exception (or group, by role)
    */
  var actor: js.UndefOr[js.Array[ConsentExceptActor]] = js.native
  
  /**
    * e.g. Resource Type, Profile, or CDA etc
    */
  var `class`: js.UndefOr[js.Array[Coding]] = js.native
  
  /**
    * e.g. LOINC or SNOMED CT code, etc in the content
    */
  var code: js.UndefOr[js.Array[Coding]] = js.native
  
  /**
    * Data controlled by this exception
    */
  var data: js.UndefOr[js.Array[ConsentExceptData]] = js.native
  
  /**
    * Timeframe for data controlled by this exception
    */
  var dataPeriod: js.UndefOr[Period] = js.native
  
  /**
    * Timeframe for this exception
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * Context of activities covered by this exception
    */
  var purpose: js.UndefOr[js.Array[Coding]] = js.native
  
  /**
    * Security Labels that define affected resources
    */
  var securityLabel: js.UndefOr[js.Array[Coding]] = js.native
  
  /**
    * deny | permit
    */
  var `type`: code = js.native
}
object ConsentExcept {
  
  @scala.inline
  def apply(`type`: code): ConsentExcept = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsentExcept]
  }
  
  @scala.inline
  implicit class ConsentExceptOps[Self <: ConsentExcept] (val x: Self) extends AnyVal {
    
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
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    
    @scala.inline
    def setActionVarargs(value: CodeableConcept*): Self = this.set("action", js.Array(value :_*))
    
    @scala.inline
    def setAction(value: js.Array[CodeableConcept]): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setActorVarargs(value: ConsentExceptActor*): Self = this.set("actor", js.Array(value :_*))
    
    @scala.inline
    def setActor(value: js.Array[ConsentExceptActor]): Self = this.set("actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActor: Self = this.set("actor", js.undefined)
    
    @scala.inline
    def setClassVarargs(value: Coding*): Self = this.set("class", js.Array(value :_*))
    
    @scala.inline
    def setClass(value: js.Array[Coding]): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setCodeVarargs(value: Coding*): Self = this.set("code", js.Array(value :_*))
    
    @scala.inline
    def setCode(value: js.Array[Coding]): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: ConsentExceptData*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[ConsentExceptData]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataPeriod(value: Period): Self = this.set("dataPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataPeriod: Self = this.set("dataPeriod", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setPurposeVarargs(value: Coding*): Self = this.set("purpose", js.Array(value :_*))
    
    @scala.inline
    def setPurpose(value: js.Array[Coding]): Self = this.set("purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurpose: Self = this.set("purpose", js.undefined)
    
    @scala.inline
    def setSecurityLabelVarargs(value: Coding*): Self = this.set("securityLabel", js.Array(value :_*))
    
    @scala.inline
    def setSecurityLabel(value: js.Array[Coding]): Self = this.set("securityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityLabel: Self = this.set("securityLabel", js.undefined)
  }
}
