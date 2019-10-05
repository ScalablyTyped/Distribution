package typings.fullcalendar

import typings.fullcalendar.eventDefMod.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventDef", JSImport.Namespace)
@js.native
object eventDefMod extends js.Object {
  @js.native
  abstract class Default protected () extends js.Object {
    def this(source: js.Any) = this()
    @JSName("applyProps")
    var applyProps_Original: js.Function1[/* rawProps */ js.Any, _] = js.native
    var backgroundColor: js.Any = js.native
    var borderColor: js.Any = js.native
    var className: js.Any = js.native
    var color: js.Any = js.native
    var constraint: js.Any = js.native
    var durationEditable: js.Any = js.native
    var editable: js.Any = js.native
    var id: js.Any = js.native
    @JSName("isStandardProp")
    var isStandardProp_Original: js.Function1[/* propName */ js.Any, _] = js.native
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
    def applyManualStandardProps(rawProps: js.Any): Boolean = js.native
    def applyMiscProps(rawProps: js.Any): Unit = js.native
    def applyProps(rawProps: js.Any): js.Any = js.native
    def buildInstances(unzonedRange: js.Any): js.Any = js.native
    def getConstraint(): js.Any = js.native
    def getOverlap(): js.Any = js.native
    def getRendering(): js.Any = js.native
    def hasBgRendering(): Boolean = js.native
    def hasInverseRendering(): Boolean = js.native
    def isAllDay(): js.Any = js.native
    def isDurationExplicitlyEditable(): js.Any = js.native
    def isExplicitlyEditable(): js.Any = js.native
    def isStandardProp(propName: js.Any): js.Any = js.native
    def isStartExplicitlyEditable(): js.Any = js.native
    def toLegacy(): js.Any = js.native
  }
  
  @js.native
  abstract class default protected () extends Default {
    def this(source: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object Default extends js.Object {
    var copyVerbatimStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.copyVerbatimStandardProps */ js.Any = js.native
    var defineStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.defineStandardProps */ js.Any = js.native
    var uuid: Double = js.native
    def generateId(): String = js.native
    def normalizeId(id: js.Any): String = js.native
    def parse(rawInput: js.Any, source: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var copyVerbatimStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.copyVerbatimStandardProps */ js.Any = js.native
    var defineStandardProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParsableModelMixin.defineStandardProps */ js.Any = js.native
    var uuid: Double = js.native
    def generateId(): String = js.native
    def normalizeId(id: js.Any): String = js.native
    def parse(rawInput: js.Any, source: js.Any): js.Any = js.native
  }
  
}

