package typings
package fullcalendarLib.eventdefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventDef", "Default")
@js.native
abstract class Default protected () extends js.Object {
  def this(source: js.Any) = this()
  var applyProps: js.Function1[/* rawProps */ js.Any, _] = js.native
  var backgroundColor: js.Any = js.native
  var borderColor: js.Any = js.native
  var className: js.Any = js.native
  var color: js.Any = js.native
  var constraint: js.Any = js.native
  var durationEditable: js.Any = js.native
  var editable: js.Any = js.native
  var id: js.Any = js.native
  var isStandardProp: js.Function1[/* propName */ js.Any, _] = js.native
  var miscProps: js.Any = js.native
  var overlap: js.Any = js.native
  var rawId: js.Any = js.native
  var rendering: js.Any = js.native
  var source: js.Any = js.native
  var startEditable: js.Any = js.native
  var textColor: js.Any = js.native
  var title: js.Any = js.native
  var uid: js.Any = js.native
  var url: js.Any = js.native
  def applyManualStandardProps(rawProps: js.Any): scala.Boolean = js.native
  def applyMiscProps(rawProps: js.Any): scala.Unit = js.native
  def buildInstances(unzonedRange: js.Any): js.Any = js.native
  def getConstraint(): js.Any = js.native
  def getOverlap(): js.Any = js.native
  def getRendering(): js.Any = js.native
  def hasBgRendering(): scala.Boolean = js.native
  def hasInverseRendering(): scala.Boolean = js.native
  def isAllDay(): js.Any = js.native
  def isDurationExplicitlyEditable(): js.Any = js.native
  def isExplicitlyEditable(): js.Any = js.native
  def isStartExplicitlyEditable(): js.Any = js.native
  def toLegacy(): js.Any = js.native
}

@JSImport("fullcalendar/EventDef", JSImport.Default)
@js.native
abstract class default protected () extends Default {
  def this(source: js.Any) = this()
}

/* static members */
@JSImport("fullcalendar/EventDef", "Default")
@js.native
object Default extends js.Object {
  var copyVerbatimStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.copyVerbatimStandardProps */ js.Any = js.native
  var defineStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.defineStandardProps */ js.Any = js.native
  var uuid: scala.Double = js.native
  def generateId(): java.lang.String = js.native
  def normalizeId(id: js.Any): java.lang.String = js.native
  def parse(rawInput: js.Any, source: js.Any): js.Any = js.native
}

/* static members */
@JSImport("fullcalendar/EventDef", JSImport.Default)
@js.native
object default extends js.Object {
  var copyVerbatimStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.copyVerbatimStandardProps */ js.Any = js.native
  var defineStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.defineStandardProps */ js.Any = js.native
  var uuid: scala.Double = js.native
  def generateId(): java.lang.String = js.native
  def normalizeId(id: js.Any): java.lang.String = js.native
  def parse(rawInput: js.Any, source: js.Any): js.Any = js.native
}

