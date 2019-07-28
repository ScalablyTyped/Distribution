package typings.fullcalendar.eventSourceMod

import typings.fullcalendar.fullcalendarNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventSource", "Default")
@js.native
class Default protected ()
  extends typings.fullcalendar.classMod.default {
  def this(calendar: js.Any) = this()
  var allDayDefault: Boolean = js.native
  @JSName("applyProps")
  var applyProps_Original: js.Function1[/* rawProps */ js.Any, _] = js.native
  var backgroundColor: String = js.native
  var borderColor: String = js.native
  var calendar: typings.fullcalendar.calendarMod.default = js.native
  var className: js.Array[String] = js.native
  var color: String = js.native
  var constraint: js.Any = js.native
  var durationEditable: Boolean = js.native
  var editable: Boolean = js.native
  var eventDataTransform: js.Any = js.native
  var id: String = js.native
  @JSName("isStandardProp")
  var isStandardProp_Original: js.Function1[/* propName */ js.Any, _] = js.native
  var overlap: Boolean = js.native
  var rendering: String | Null = js.native
  var startEditable: Boolean = js.native
  var textColor: String = js.native
  var uid: String = js.native
  def applyManualStandardProps(rawProps: js.Any): Boolean = js.native
  def applyProps(rawProps: js.Any): js.Any = js.native
  def fetch(start: js.Any, end: js.Any, timezone: js.Any): Unit = js.native
  def getPrimitive(otherSource: js.Any): Unit = js.native
  def isStandardProp(propName: js.Any): js.Any = js.native
  def parseEventDef(rawInput: js.Any): js.Any = js.native
  def parseEventDefs(rawEventDefs: js.Any): js.Array[_] = js.native
  def removeAllEventDefs(): Unit = js.native
  def removeEventDefsById(eventDefId: js.Any): Unit = js.native
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
  var uuid: Double = js.native
  def normalizeId(id: js.Any): String = js.native
  def parse(rawInput: js.Any, calendar: js.Any): `false` | Default = js.native
}

/* static members */
@JSImport("fullcalendar/EventSource", JSImport.Default)
@js.native
object default extends js.Object {
  var copyVerbatimStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.copyVerbatimStandardProps */ js.Any = js.native
  var defineStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.defineStandardProps */ js.Any = js.native
  var uuid: Double = js.native
  def normalizeId(id: js.Any): String = js.native
  def parse(rawInput: js.Any, calendar: js.Any): `false` | Default = js.native
}

