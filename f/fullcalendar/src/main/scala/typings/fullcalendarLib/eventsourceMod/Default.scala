package typings
package fullcalendarLib.eventsourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventSource", "Default")
@js.native
class Default protected ()
  extends fullcalendarLib.classMod.default {
  def this(calendar: js.Any) = this()
  var allDayDefault: scala.Boolean = js.native
  var applyProps: js.Function1[/* rawProps */ js.Any, _] = js.native
  var backgroundColor: java.lang.String = js.native
  var borderColor: java.lang.String = js.native
  var calendar: fullcalendarLib.calendarMod.default = js.native
  var className: js.Array[java.lang.String] = js.native
  var color: java.lang.String = js.native
  var constraint: js.Any = js.native
  var durationEditable: scala.Boolean = js.native
  var editable: scala.Boolean = js.native
  var eventDataTransform: js.Any = js.native
  var id: java.lang.String = js.native
  var isStandardProp: js.Function1[/* propName */ js.Any, _] = js.native
  var overlap: scala.Boolean = js.native
  var rendering: java.lang.String | scala.Null = js.native
  var startEditable: scala.Boolean = js.native
  var textColor: java.lang.String = js.native
  var uid: java.lang.String = js.native
  def applyManualStandardProps(rawProps: js.Any): scala.Boolean = js.native
  def fetch(start: js.Any, end: js.Any, timezone: js.Any): scala.Unit = js.native
  def getPrimitive(otherSource: js.Any): scala.Unit = js.native
  def parseEventDef(rawInput: js.Any): js.Any = js.native
  def parseEventDefs(rawEventDefs: js.Any): js.Array[_] = js.native
  def removeAllEventDefs(): scala.Unit = js.native
  def removeEventDefsById(eventDefId: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/EventSource", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(calendar: js.Any) = this()
}

/* static members */
@JSImport("fullcalendar/EventSource", "Default")
@js.native
object Default extends js.Object {
  var copyVerbatimStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.copyVerbatimStandardProps */ js.Any = js.native
  var defineStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.defineStandardProps */ js.Any = js.native
  var uuid: scala.Double = js.native
  def normalizeId(id: js.Any): java.lang.String = js.native
  def parse(rawInput: js.Any, calendar: js.Any): fullcalendarLib.fullcalendarLibNumbers.`false` | fullcalendarLib.eventsourceMod.Default = js.native
}

/* static members */
@JSImport("fullcalendar/EventSource", JSImport.Default)
@js.native
object default extends js.Object {
  var copyVerbatimStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.copyVerbatimStandardProps */ js.Any = js.native
  var defineStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.defineStandardProps */ js.Any = js.native
  var uuid: scala.Double = js.native
  def normalizeId(id: js.Any): java.lang.String = js.native
  def parse(rawInput: js.Any, calendar: js.Any): fullcalendarLib.fullcalendarLibNumbers.`false` | fullcalendarLib.eventsourceMod.Default = js.native
}

