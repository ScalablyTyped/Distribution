package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Constraints on fulfillment tasks
  */
@js.native
trait TaskRestriction extends BackboneElement {
  
  /**
    * Contains extended information for property 'repetitions'.
    */
  var _repetitions: js.UndefOr[Element] = js.native
  
  /**
    * When fulfillment sought
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * For whom is fulfillment sought?
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * How many times to repeat
    */
  var repetitions: js.UndefOr[positiveInt] = js.native
}
object TaskRestriction {
  
  @scala.inline
  def apply(): TaskRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRestriction]
  }
  
  @scala.inline
  implicit class TaskRestrictionOps[Self <: TaskRestriction] (val x: Self) extends AnyVal {
    
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
    def set_repetitions(value: Element): Self = this.set("_repetitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_repetitions: Self = this.set("_repetitions", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setRecipientVarargs(value: Reference*): Self = this.set("recipient", js.Array(value :_*))
    
    @scala.inline
    def setRecipient(value: js.Array[Reference]): Self = this.set("recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipient: Self = this.set("recipient", js.undefined)
    
    @scala.inline
    def setRepetitions(value: positiveInt): Self = this.set("repetitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepetitions: Self = this.set("repetitions", js.undefined)
  }
}
