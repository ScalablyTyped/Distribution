package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains types of the recurrence range.
  */
trait ASPxClientRecurrenceRange extends js.Object {
  /**
    * A recurring appointment will end after the date specified by the SetEnd method.
    * Value: The "EndByDate" string.
    */
  var EndByDate: java.lang.String
  /**
    * A recurring appointment will not have an end date, i.e. infinite recurrence
    * Value: The "NoEndDate" string.
    */
  var NoEndDate: java.lang.String
  /**
    * A recurring appointment will end after its recurrence count exceeds the value specified by the SetOccurrenceCount method.
    * Value: The "OccurrenceCount" string.
    */
  var OccurrenceCount: java.lang.String
}

object ASPxClientRecurrenceRange {
  @scala.inline
  def apply(EndByDate: java.lang.String, NoEndDate: java.lang.String, OccurrenceCount: java.lang.String): ASPxClientRecurrenceRange = {
    val __obj = js.Dynamic.literal(EndByDate = EndByDate, NoEndDate = NoEndDate, OccurrenceCount = OccurrenceCount)
  
    __obj.asInstanceOf[ASPxClientRecurrenceRange]
  }
}

