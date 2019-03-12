package typings
package fullcalendarLib.optionsManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/OptionsManager", "Default")
@js.native
class Default protected ()
  extends fullcalendarLib.modelMod.default {
  def this(_calendar: js.Any, overrides: js.Any) = this()
  var _calendar: js.Any = js.native
  var dirDefaults: js.Any = js.native
  var dynamicOverrides: js.Any = js.native
  var localeDefaults: js.Any = js.native
  var overrides: js.Any = js.native
  def add(newOptionHash: js.Any): scala.Unit = js.native
  def compute(): scala.Unit = js.native
  def recordOverrides(newOptionHash: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/OptionsManager", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(_calendar: js.Any, overrides: js.Any) = this()
}

