package typings.fullcalendar.gcalEventSourceMod

import typings.fullcalendar.AnonDescription
import typings.fullcalendar.mod.EventSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/plugins/gcal/GcalEventSource", "Default")
@js.native
class Default_ () extends EventSource {
  var ajaxSettings: js.Any = js.native
  var googleCalendarApiKey: js.Any = js.native
  var googleCalendarError: js.Any = js.native
  var googleCalendarId: js.Any = js.native
  def applyMiscProps(rawProps: js.Any): Unit = js.native
  def buildRequestParams(start: js.Any, end: js.Any, timezone: js.Any): js.Any = js.native
  def buildUrl(): String = js.native
  def gcalItemToRawEventDef(item: js.Any, gcalTimezone: js.Any): AnonDescription = js.native
  def gcalItemsToRawEventDefs(items: js.Any, gcalTimezone: js.Any): js.Any = js.native
  def getPrimitive(): js.Any = js.native
  def reportError(message: js.Any): Unit = js.native
  def reportError(message: js.Any, apiErrorObjs: js.Any): Unit = js.native
}

/* static members */
@JSImport("fullcalendar/plugins/gcal/GcalEventSource", "Default")
@js.native
object Default_ extends js.Object {
  var API_BASE: String = js.native
  def parse(rawInput: js.Any, calendar: js.Any): js.Any = js.native
}

