package typings.fullcalendar

import typings.fullcalendar.fullcalendarMod.EventSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/plugins/gcal/GcalEventSource", JSImport.Namespace)
@js.native
object pluginsGcalGcalEventSourceMod extends js.Object {
  @js.native
  class Default () extends EventSource {
    var ajaxSettings: js.Any = js.native
    var googleCalendarApiKey: js.Any = js.native
    var googleCalendarError: js.Any = js.native
    var googleCalendarId: js.Any = js.native
    def applyMiscProps(rawProps: js.Any): Unit = js.native
    def buildRequestParams(start: js.Any, end: js.Any, timezone: js.Any): js.Any = js.native
    def buildUrl(): String = js.native
    def gcalItemToRawEventDef(item: js.Any, gcalTimezone: js.Any): Anon_Description = js.native
    def gcalItemsToRawEventDefs(items: js.Any, gcalTimezone: js.Any): js.Any = js.native
    def getPrimitive(): js.Any = js.native
    def reportError(message: js.Any): Unit = js.native
    def reportError(message: js.Any, apiErrorObjs: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends Default
  
  /* static members */
  @js.native
  object Default extends js.Object {
    var API_BASE: String = js.native
    def parse(rawInput: js.Any, calendar: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var API_BASE: String = js.native
    def parse(rawInput: js.Any, calendar: js.Any): js.Any = js.native
  }
  
}

