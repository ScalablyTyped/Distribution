package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class CarePlanActivityDetailMutableBuilder[Self <: CarePlanActivityDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setDailyAmount(value: Quantity): Self = StObject.set(x, "dailyAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyAmountUndefined: Self = StObject.set(x, "dailyAmount", js.undefined)
    
    @scala.inline
    def setDefinition(value: Reference): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setGoal(value: js.Array[Reference]): Self = StObject.set(x, "goal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalUndefined: Self = StObject.set(x, "goal", js.undefined)
    
    @scala.inline
    def setGoalVarargs(value: Reference*): Self = StObject.set(x, "goal", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setPerformer(value: js.Array[Reference]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    @scala.inline
    def setPerformerVarargs(value: Reference*): Self = StObject.set(x, "performer", js.Array(value :_*))
    
    @scala.inline
    def setProductCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "productCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCodeableConceptUndefined: Self = StObject.set(x, "productCodeableConcept", js.undefined)
    
    @scala.inline
    def setProductReference(value: Reference): Self = StObject.set(x, "productReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductReferenceUndefined: Self = StObject.set(x, "productReference", js.undefined)
    
    @scala.inline
    def setProhibited(value: Boolean): Self = StObject.set(x, "prohibited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProhibitedUndefined: Self = StObject.set(x, "prohibited", js.undefined)
    
    @scala.inline
    def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    @scala.inline
    def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value :_*))
    
    @scala.inline
    def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    @scala.inline
    def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value :_*))
    
    @scala.inline
    def setScheduledPeriod(value: Period): Self = StObject.set(x, "scheduledPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledPeriodUndefined: Self = StObject.set(x, "scheduledPeriod", js.undefined)
    
    @scala.inline
    def setScheduledString(value: String): Self = StObject.set(x, "scheduledString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledStringUndefined: Self = StObject.set(x, "scheduledString", js.undefined)
    
    @scala.inline
    def setScheduledTiming(value: Timing): Self = StObject.set(x, "scheduledTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledTimingUndefined: Self = StObject.set(x, "scheduledTiming", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_prohibited(value: Element): Self = StObject.set(x, "_prohibited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_prohibitedUndefined: Self = StObject.set(x, "_prohibited", js.undefined)
    
    @scala.inline
    def set_scheduledString(value: Element): Self = StObject.set(x, "_scheduledString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_scheduledStringUndefined: Self = StObject.set(x, "_scheduledString", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusReason(value: Element): Self = StObject.set(x, "_statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusReasonUndefined: Self = StObject.set(x, "_statusReason", js.undefined)
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
