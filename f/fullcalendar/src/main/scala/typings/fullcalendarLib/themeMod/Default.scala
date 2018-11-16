package typings
package fullcalendarLib.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/Theme", "Default")
@js.native
class Default protected () extends js.Object {
  def this(optionsManager: js.Any) = this()
  var baseIconClass: java.lang.String = js.native
  var classes: js.Any = js.native
  var iconClasses: js.Any = js.native
  var iconOverrideCustomButtonOption: js.Any = js.native
  var iconOverrideOption: js.Any = js.native
  var iconOverridePrefix: java.lang.String = js.native
  var optionsManager: js.Any = js.native
  def applyIconOverridePrefix(className: js.Any): js.Any = js.native
  def getClass(key: js.Any): js.Any = js.native
  def getCustomButtonIconClass(customButtonProps: js.Any): java.lang.String = js.native
  def getIconClass(buttonName: js.Any): java.lang.String = js.native
  def processIconOverride(): scala.Unit = js.native
  def setIconOverride(iconOverrideHash: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/Theme", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(optionsManager: js.Any) = this()
}

