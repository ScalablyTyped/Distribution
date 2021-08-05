package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the SchedulerViewType object.
  */
trait ASPxSchedulerViewType extends StObject {
  
  /**
    * Gets a string representation equivalent to the SchedulerViewType.Agenda enumeration for use in client scripts.
    */
  var Agenda: String
  
  /**
    * Gets a string representation equivalent of SchedulerViewType.Day enumeration for use in client scripts.
    */
  var Day: String
  
  /**
    * Gets a string representation equivalent of SchedulerViewType.FullWeek enumeration for use in client scripts.
    */
  var FullWeek: String
  
  /**
    * Gets a string representation equivalent of SchedulerViewType.Month enumeration for use in client scripts.
    */
  var Month: String
  
  /**
    * Gets a string representation equivalent of SchedulerViewType.Timeline enumeration for use in client scripts.
    */
  var Timeline: String
  
  /**
    * Gets a string representation equivalent of SchedulerViewType.Week enumeration for use in client scripts.
    */
  var Week: String
  
  /**
    * Gets a string representation equivalent of SchedulerViewType.WorkWeek enumeration for use in client scripts.
    */
  var WorkWeek: String
}
object ASPxSchedulerViewType {
  
  inline def apply(
    Agenda: String,
    Day: String,
    FullWeek: String,
    Month: String,
    Timeline: String,
    Week: String,
    WorkWeek: String
  ): ASPxSchedulerViewType = {
    val __obj = js.Dynamic.literal(Agenda = Agenda.asInstanceOf[js.Any], Day = Day.asInstanceOf[js.Any], FullWeek = FullWeek.asInstanceOf[js.Any], Month = Month.asInstanceOf[js.Any], Timeline = Timeline.asInstanceOf[js.Any], Week = Week.asInstanceOf[js.Any], WorkWeek = WorkWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxSchedulerViewType]
  }
  
  extension [Self <: ASPxSchedulerViewType](x: Self) {
    
    inline def setAgenda(value: String): Self = StObject.set(x, "Agenda", value.asInstanceOf[js.Any])
    
    inline def setDay(value: String): Self = StObject.set(x, "Day", value.asInstanceOf[js.Any])
    
    inline def setFullWeek(value: String): Self = StObject.set(x, "FullWeek", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: String): Self = StObject.set(x, "Month", value.asInstanceOf[js.Any])
    
    inline def setTimeline(value: String): Self = StObject.set(x, "Timeline", value.asInstanceOf[js.Any])
    
    inline def setWeek(value: String): Self = StObject.set(x, "Week", value.asInstanceOf[js.Any])
    
    inline def setWorkWeek(value: String): Self = StObject.set(x, "WorkWeek", value.asInstanceOf[js.Any])
  }
}
