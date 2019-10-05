package typings.fullcalendar

import typings.fullcalendar.singleEventDefMod.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/SingleEventDef", JSImport.Namespace)
@js.native
object singleEventDefMod extends js.Object {
  @js.native
  class Default ()
    extends typings.fullcalendar.eventDefMod.default {
    var dateProfile: js.Any = js.native
    def buildInstance(): typings.fullcalendar.eventInstanceMod.default = js.native
    def buildInstances(): js.Array[typings.fullcalendar.eventInstanceMod.default] = js.native
    def rezone(): Unit = js.native
  }
  
  @js.native
  class default () extends Default
  
}

