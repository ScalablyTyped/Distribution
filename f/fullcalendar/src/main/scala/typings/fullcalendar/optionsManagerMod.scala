package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/OptionsManager", JSImport.Namespace)
@js.native
object optionsManagerMod extends js.Object {
  @js.native
  class Default protected ()
    extends typings.fullcalendar.modelMod.default {
    def this(_calendar: js.Any, overrides: js.Any) = this()
    var _calendar: js.Any = js.native
    var dirDefaults: js.Any = js.native
    var dynamicOverrides: js.Any = js.native
    var localeDefaults: js.Any = js.native
    var overrides: js.Any = js.native
    def add(newOptionHash: js.Any): Unit = js.native
    def compute(): Unit = js.native
    def recordOverrides(newOptionHash: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends Default {
    def this(_calendar: js.Any, overrides: js.Any) = this()
  }
  
}

