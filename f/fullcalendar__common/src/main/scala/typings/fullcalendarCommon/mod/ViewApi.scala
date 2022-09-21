package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "ViewApi")
@js.native
open class ViewApi protected () extends StObject {
  def this(`type`: String, getCurrentData: js.Function0[CalendarData], dateEnv: DateEnv) = this()
  
  def activeEnd: js.Date = js.native
  
  def activeStart: js.Date = js.native
  
  def calendar: CalendarApi = js.native
  
  def currentEnd: js.Date = js.native
  
  def currentStart: js.Date = js.native
  
  /* private */ var dateEnv: Any = js.native
  
  /* private */ var getCurrentData: Any = js.native
  
  def getOption(name: String): Any = js.native
  
  def title: String = js.native
  
  var `type`: String = js.native
}
