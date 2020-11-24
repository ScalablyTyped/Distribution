package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains types of the recurrence range.
  */
@js.native
trait ASPxClientRecurrenceRange extends js.Object {
  
  /**
    * A recurring appointment will end after the date specified by the ASPxClientRecurrenceInfo.SetEnd method.
    */
  var EndByDate: String = js.native
  
  /**
    * A recurring appointment will not have an end date, i.e. infinite recurrence
    */
  var NoEndDate: String = js.native
  
  /**
    * A recurring appointment will end after its recurrence count exceeds the value specified by the ASPxClientRecurrenceInfo.SetOccurrenceCount method.
    */
  var OccurrenceCount: String = js.native
}
object ASPxClientRecurrenceRange {
  
  @scala.inline
  def apply(EndByDate: String, NoEndDate: String, OccurrenceCount: String): ASPxClientRecurrenceRange = {
    val __obj = js.Dynamic.literal(EndByDate = EndByDate.asInstanceOf[js.Any], NoEndDate = NoEndDate.asInstanceOf[js.Any], OccurrenceCount = OccurrenceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRecurrenceRange]
  }
  
  @scala.inline
  implicit class ASPxClientRecurrenceRangeOps[Self <: ASPxClientRecurrenceRange] (val x: Self) extends AnyVal {
    
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
    def setEndByDate(value: String): Self = this.set("EndByDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoEndDate(value: String): Self = this.set("NoEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrenceCount(value: String): Self = this.set("OccurrenceCount", value.asInstanceOf[js.Any])
  }
}
