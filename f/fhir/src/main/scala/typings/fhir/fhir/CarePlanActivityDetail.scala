package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In-line definition of activity
  */
@js.native
trait CarePlanActivityDetail extends BackboneElement {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'prohibited'.
    */
  var _prohibited: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'scheduledString'.
    */
  var _scheduledString: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'statusReason'.
    */
  var _statusReason: js.UndefOr[Element] = js.native
  
  /**
    * diet | drug | encounter | observation | procedure | supply | other
    */
  var category: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Detail type of activity
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * How to consume/day?
    */
  var dailyAmount: js.UndefOr[Quantity] = js.native
  
  /**
    * Protocol or definition
    */
  var definition: js.UndefOr[Reference] = js.native
  
  /**
    * Extra info describing activity to perform
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Goals this activity relates to
    */
  var goal: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Where it should happen
    */
  var location: js.UndefOr[Reference] = js.native
  
  /**
    * Who will be responsible?
    */
  var performer: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * What is to be administered/supplied
    */
  var productCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * What is to be administered/supplied
    */
  var productReference: js.UndefOr[Reference] = js.native
  
  /**
    * Do NOT do
    */
  var prohibited: js.UndefOr[Boolean] = js.native
  
  /**
    * How much to administer/supply/consume
    */
  var quantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Why activity should be done or why activity was prohibited
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Condition triggering need for activity
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * When activity is to occur
    */
  var scheduledPeriod: js.UndefOr[Period] = js.native
  
  /**
    * When activity is to occur
    */
  var scheduledString: js.UndefOr[String] = js.native
  
  /**
    * When activity is to occur
    */
  var scheduledTiming: js.UndefOr[Timing] = js.native
  
  /**
    * not-started | scheduled | in-progress | on-hold | completed | cancelled | unknown
    */
  var status: code = js.native
  
  /**
    * Reason for current status
    */
  var statusReason: js.UndefOr[String] = js.native
}
object CarePlanActivityDetail {
  
  @scala.inline
  def apply(status: code): CarePlanActivityDetail = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarePlanActivityDetail]
  }
  
  @scala.inline
  implicit class CarePlanActivityDetailOps[Self <: CarePlanActivityDetail] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def set_prohibited(value: Element): Self = this.set("_prohibited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_prohibited: Self = this.set("_prohibited", js.undefined)
    
    @scala.inline
    def set_scheduledString(value: Element): Self = this.set("_scheduledString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_scheduledString: Self = this.set("_scheduledString", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def set_statusReason(value: Element): Self = this.set("_statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_statusReason: Self = this.set("_statusReason", js.undefined)
    
    @scala.inline
    def setCategory(value: CodeableConcept): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setDailyAmount(value: Quantity): Self = this.set("dailyAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDailyAmount: Self = this.set("dailyAmount", js.undefined)
    
    @scala.inline
    def setDefinition(value: Reference): Self = this.set("definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setGoalVarargs(value: Reference*): Self = this.set("goal", js.Array(value :_*))
    
    @scala.inline
    def setGoal(value: js.Array[Reference]): Self = this.set("goal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoal: Self = this.set("goal", js.undefined)
    
    @scala.inline
    def setLocation(value: Reference): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setPerformerVarargs(value: Reference*): Self = this.set("performer", js.Array(value :_*))
    
    @scala.inline
    def setPerformer(value: js.Array[Reference]): Self = this.set("performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformer: Self = this.set("performer", js.undefined)
    
    @scala.inline
    def setProductCodeableConcept(value: CodeableConcept): Self = this.set("productCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductCodeableConcept: Self = this.set("productCodeableConcept", js.undefined)
    
    @scala.inline
    def setProductReference(value: Reference): Self = this.set("productReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductReference: Self = this.set("productReference", js.undefined)
    
    @scala.inline
    def setProhibited(value: Boolean): Self = this.set("prohibited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProhibited: Self = this.set("prohibited", js.undefined)
    
    @scala.inline
    def setQuantity(value: Quantity): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setReasonCodeVarargs(value: CodeableConcept*): Self = this.set("reasonCode", js.Array(value :_*))
    
    @scala.inline
    def setReasonCode(value: js.Array[CodeableConcept]): Self = this.set("reasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonCode: Self = this.set("reasonCode", js.undefined)
    
    @scala.inline
    def setReasonReferenceVarargs(value: Reference*): Self = this.set("reasonReference", js.Array(value :_*))
    
    @scala.inline
    def setReasonReference(value: js.Array[Reference]): Self = this.set("reasonReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonReference: Self = this.set("reasonReference", js.undefined)
    
    @scala.inline
    def setScheduledPeriod(value: Period): Self = this.set("scheduledPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledPeriod: Self = this.set("scheduledPeriod", js.undefined)
    
    @scala.inline
    def setScheduledString(value: String): Self = this.set("scheduledString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledString: Self = this.set("scheduledString", js.undefined)
    
    @scala.inline
    def setScheduledTiming(value: Timing): Self = this.set("scheduledTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledTiming: Self = this.set("scheduledTiming", js.undefined)
    
    @scala.inline
    def setStatusReason(value: String): Self = this.set("statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusReason: Self = this.set("statusReason", js.undefined)
  }
}
