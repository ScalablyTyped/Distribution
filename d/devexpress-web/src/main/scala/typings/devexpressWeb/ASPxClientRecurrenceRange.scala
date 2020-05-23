package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains types of the recurrence range.
  */
trait ASPxClientRecurrenceRange extends js.Object {
  /**
    * A recurring appointment will end after the date specified by the ASPxClientRecurrenceInfo.SetEnd method.
    */
  var EndByDate: String
  /**
    * A recurring appointment will not have an end date, i.e. infinite recurrence
    */
  var NoEndDate: String
  /**
    * A recurring appointment will end after its recurrence count exceeds the value specified by the ASPxClientRecurrenceInfo.SetOccurrenceCount method.
    */
  var OccurrenceCount: String
}

object ASPxClientRecurrenceRange {
  @scala.inline
  def apply(EndByDate: String, NoEndDate: String, OccurrenceCount: String): ASPxClientRecurrenceRange = {
    val __obj = js.Dynamic.literal(EndByDate = EndByDate.asInstanceOf[js.Any], NoEndDate = NoEndDate.asInstanceOf[js.Any], OccurrenceCount = OccurrenceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRecurrenceRange]
  }
}

