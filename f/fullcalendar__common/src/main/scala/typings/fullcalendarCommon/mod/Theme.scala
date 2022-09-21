package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "Theme")
@js.native
open class Theme protected () extends StObject {
  def this(calendarOptions: CalendarOptionsRefined) = this()
  
  def applyIconOverridePrefix(className: Any): Any = js.native
  
  var baseIconClass: String = js.native
  
  var classes: Any = js.native
  
  def getClass(key: Any): Any = js.native
  
  def getCustomButtonIconClass(customButtonProps: Any): String = js.native
  
  def getIconClass(buttonName: Any): String = js.native
  def getIconClass(buttonName: Any, isRtl: Boolean): String = js.native
  
  var iconClasses: Any = js.native
  
  var iconOverrideCustomButtonOption: Any = js.native
  
  var iconOverrideOption: Any = js.native
  
  var iconOverridePrefix: String = js.native
  
  var rtlIconClasses: Any = js.native
  
  def setIconOverride(iconOverrideHash: Any): Unit = js.native
}
