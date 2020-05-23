package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains types of the recurrence range.
  */
@JSGlobal("ASPxClientRecurrenceRange")
@js.native
class ASPxClientRecurrenceRange ()
  extends typings.devexpressWeb.ASPxClientRecurrenceRange {
  /**
    * A recurring appointment will end after the date specified by the ASPxClientRecurrenceInfo.SetEnd method.
    */
  /* CompleteClass */
  override var EndByDate: String = js.native
  /**
    * A recurring appointment will not have an end date, i.e. infinite recurrence
    */
  /* CompleteClass */
  override var NoEndDate: String = js.native
  /**
    * A recurring appointment will end after its recurrence count exceeds the value specified by the ASPxClientRecurrenceInfo.SetOccurrenceCount method.
    */
  /* CompleteClass */
  override var OccurrenceCount: String = js.native
}

