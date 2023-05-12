package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskRestriction
  extends StObject
     with BackboneElement {
  
  /**
    * This is distinct from Task.executionPeriod. ExecutionPeriod indicates when the task needs to be initiated, while Task.restriction.period specifies the subset of the overall authorization that this period covers. For example, a MedicationRequest with an overall effective period of 1 year might have a Task whose restriction.period is 2 months (i.e. satisfy 2 months of medication therapy), while the execution period might be 'between now and 5 days from now' - i.e. If you say yes to this, then you're agreeing to supply medication for that 2 month period within the next 5 days.
    * Note that period.high is the due date representing the time by which the task should be completed.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * For requests that are targeted to more than one potential recipient/target, to identify who is fulfillment is sought for.
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Indicates the number of times the requested action should occur.
    */
  var repetitions: js.UndefOr[Double] = js.undefined
}
object TaskRestriction {
  
  inline def apply(): TaskRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRestriction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskRestriction] (val x: Self) extends AnyVal {
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setRecipient(value: js.Array[Reference]): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    inline def setRecipientVarargs(value: Reference*): Self = StObject.set(x, "recipient", js.Array(value*))
    
    inline def setRepetitions(value: Double): Self = StObject.set(x, "repetitions", value.asInstanceOf[js.Any])
    
    inline def setRepetitionsUndefined: Self = StObject.set(x, "repetitions", js.undefined)
  }
}
