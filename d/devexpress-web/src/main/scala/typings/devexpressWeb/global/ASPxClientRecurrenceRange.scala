package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains types of the recurrence range.
  */
@JSGlobal("ASPxClientRecurrenceRange")
@js.native
class ASPxClientRecurrenceRange ()
  extends StObject
     with typings.devexpressWeb.ASPxClientRecurrenceRange {
  
  /**
    * A recurring appointment will end after the date specified by the ASPxClientRecurrenceInfo.SetEnd method.
    */
  /* CompleteClass */
  var EndByDate: String = js.native
  
  /**
    * A recurring appointment will not have an end date, i.e. infinite recurrence
    */
  /* CompleteClass */
  var NoEndDate: String = js.native
  
  /**
    * A recurring appointment will end after its recurrence count exceeds the value specified by the ASPxClientRecurrenceInfo.SetOccurrenceCount method.
    */
  /* CompleteClass */
  var OccurrenceCount: String = js.native
}
