package typings
package fullcalendarLib.pluginsGcalGcalEventSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/plugins/gcal/GcalEventSource", "Default")
@js.native
class Default ()
  extends fullcalendarLib.fullcalendarMod.EventSource {
  var ajaxSettings: js.Any = js.native
  var googleCalendarApiKey: js.Any = js.native
  var googleCalendarError: js.Any = js.native
  var googleCalendarId: js.Any = js.native
  def applyMiscProps(rawProps: js.Any): scala.Unit = js.native
  def buildRequestParams(start: js.Any, end: js.Any, timezone: js.Any): js.Any = js.native
  def buildUrl(): java.lang.String = js.native
  def gcalItemToRawEventDef(item: js.Any, gcalTimezone: js.Any): fullcalendarLib.Anon_Description = js.native
  def gcalItemsToRawEventDefs(items: js.Any, gcalTimezone: js.Any): js.Any = js.native
  def getPrimitive(): js.Any = js.native
  def reportError(message: js.Any): scala.Unit = js.native
  def reportError(message: js.Any, apiErrorObjs: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/plugins/gcal/GcalEventSource", JSImport.Default)
@js.native
class default () extends Default

@JSImport("fullcalendar/plugins/gcal/GcalEventSource", "Default")
@js.native
object Default extends js.Object {
  var API_BASE: java.lang.String = js.native
  def parse(rawInput: js.Any, calendar: js.Any): js.Any = js.native
}

@JSImport("fullcalendar/plugins/gcal/GcalEventSource", JSImport.Default)
@js.native
object default extends js.Object {
  var API_BASE: java.lang.String = js.native
  def parse(rawInput: js.Any, calendar: js.Any): js.Any = js.native
}

