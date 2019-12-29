package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/Theme", JSImport.Namespace)
@js.native
object themeMod extends js.Object {
  @js.native
  class Default protected () extends js.Object {
    def this(optionsManager: js.Any) = this()
    var baseIconClass: String = js.native
    var classes: js.Any = js.native
    var iconClasses: js.Any = js.native
    var iconOverrideCustomButtonOption: js.Any = js.native
    var iconOverrideOption: js.Any = js.native
    var iconOverridePrefix: String = js.native
    var optionsManager: js.Any = js.native
    def applyIconOverridePrefix(className: js.Any): js.Any = js.native
    def getClass(key: js.Any): js.Any = js.native
    def getCustomButtonIconClass(customButtonProps: js.Any): String = js.native
    def getIconClass(buttonName: js.Any): String = js.native
    def processIconOverride(): Unit = js.native
    def setIconOverride(iconOverrideHash: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends Default {
    def this(optionsManager: js.Any) = this()
  }
  
}

