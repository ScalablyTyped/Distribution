package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object providing access to an ASPxClientRecurrenceControlBase control's editor values.
  */
@JSGlobal("DefaultRecurrenceRuleValuesAccessor")
@js.native
class DefaultRecurrenceRuleValuesAccessor protected ()
  extends StObject
     with typings.devexpressWeb.DefaultRecurrenceRuleValuesAccessor {
  /**
    * Initializes a new instance of the DefaultRecurrenceRuleValuesAccessor object. For internal use only.
    */
  def this(recurrenceControl: typings.devexpressWeb.ASPxClientRecurrenceControlBase) = this()
  
  /**
    * Gets the number of the month's day in which the appointment is scheduled.
    */
  /* CompleteClass */
  override def GetDayNumber(): Double = js.native
  
  /**
    * Gets or sets the month's number.
    */
  /* CompleteClass */
  override def GetMonth(): Double = js.native
  
  /**
    * Get the frequency with which the appointment occurs with respect to the appointment's recurrence type.
    */
  /* CompleteClass */
  override def GetPeriodicity(): Double = js.native
  
  /**
    * Gets the days of the week on which a weekly recurrent appointment is scheduled.
    */
  /* CompleteClass */
  override def GetWeekDays(): typings.devexpressWeb.ASPxClientWeekDays = js.native
  
  /**
    * Gets the number of the week in a month when an appointment is scheduled.
    */
  /* CompleteClass */
  override def GetWeekOfMonth(): typings.devexpressWeb.ASPxClientWeekOfMonth = js.native
}
