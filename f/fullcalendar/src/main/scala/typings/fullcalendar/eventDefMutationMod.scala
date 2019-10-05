package typings.fullcalendar

import typings.fullcalendar.eventDefMutationMod.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EventDefMutation", JSImport.Namespace)
@js.native
object eventDefMutationMod extends js.Object {
  @js.native
  class Default () extends js.Object {
    var className: js.Any = js.native
    var dateMutation: js.Any = js.native
    var eventDefId: js.Any = js.native
    var miscProps: js.Any = js.native
    var verbatimStandardProps: js.Any = js.native
    def isEmpty(): Boolean = js.native
    def mutateSingle(eventDef: js.Any): js.Function0[Unit] = js.native
    def setDateMutation(dateMutation: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends Default
  
  /* static members */
  @js.native
  object Default extends js.Object {
    def createFromRawProps(eventInstance: js.Any, rawProps: js.Any, largeUnit: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def createFromRawProps(eventInstance: js.Any, rawProps: js.Any, largeUnit: js.Any): js.Any = js.native
  }
  
}

