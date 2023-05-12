package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventImpl
  extends StObject
     with EventApi {
  
  var _context: CalendarContext = js.native
  
  var _def: EventDef = js.native
  
  var _instance: EventInstance | Null = js.native
  
  @JSName("allDay")
  def allDay_MEventImpl: Boolean = js.native
  
  @JSName("allow")
  def allow_MEventImpl: AllowFunc = js.native
  
  @JSName("backgroundColor")
  def backgroundColor_MEventImpl: String = js.native
  
  @JSName("borderColor")
  def borderColor_MEventImpl: String = js.native
  
  @JSName("classNames")
  def classNames_MEventImpl: js.Array[String] = js.native
  
  @JSName("constraint")
  def constraint_MEventImpl: String | EventStore = js.native
  
  @JSName("display")
  def display_MEventImpl: String = js.native
  
  @JSName("durationEditable")
  def durationEditable_MEventImpl: Boolean = js.native
  
  @JSName("endStr")
  def endStr_MEventImpl: String = js.native
  
  @JSName("end")
  def end_MEventImpl: js.Date | Null = js.native
  
  @JSName("extendedProps")
  def extendedProps_MEventImpl: Dictionary = js.native
  
  @JSName("groupId")
  def groupId_MEventImpl: String = js.native
  
  @JSName("id")
  def id_MEventImpl: String = js.native
  
  def mutate(mutation: EventMutation): Unit = js.native
  
  @JSName("overlap")
  def overlap_MEventImpl: Boolean = js.native
  
  @JSName("source")
  def source_MEventImpl: EventSourceImpl | Null = js.native
  
  @JSName("startEditable")
  def startEditable_MEventImpl: Boolean = js.native
  
  @JSName("startStr")
  def startStr_MEventImpl: String = js.native
  
  @JSName("start")
  def start_MEventImpl: js.Date | Null = js.native
  
  @JSName("textColor")
  def textColor_MEventImpl: String = js.native
  
  @JSName("title")
  def title_MEventImpl: String = js.native
  
  @JSName("url")
  def url_MEventImpl: String = js.native
}
