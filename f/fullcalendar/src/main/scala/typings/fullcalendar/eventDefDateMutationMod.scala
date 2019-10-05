package typings.fullcalendar

import typings.fullcalendar.eventDefDateMutationMod.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventDefDateMutation", JSImport.Namespace)
@js.native
object eventDefDateMutationMod extends js.Object {
  @js.native
  class Default () extends js.Object {
    var clearEnd: Boolean = js.native
    var dateDelta: js.Any = js.native
    var endDelta: js.Any = js.native
    var forceAllDay: Boolean = js.native
    var forceTimed: Boolean = js.native
    var startDelta: js.Any = js.native
    def buildNewDateProfile(eventDateProfile: js.Any, calendar: js.Any): typings.fullcalendar.eventDateProfileMod.default = js.native
    def isEmpty(): Boolean = js.native
    def setDateDelta(dateDelta: js.Any): Unit = js.native
    def setEndDelta(endDelta: js.Any): Unit = js.native
    def setStartDelta(startDelta: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends Default
  
  /* static members */
  @js.native
  object Default extends js.Object {
    def createFromDiff(dateProfile0: js.Any, dateProfile1: js.Any, largeUnit: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def createFromDiff(dateProfile0: js.Any, dateProfile1: js.Any, largeUnit: js.Any): js.Any = js.native
  }
  
}

