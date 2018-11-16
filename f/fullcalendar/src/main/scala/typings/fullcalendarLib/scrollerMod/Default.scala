package typings
package fullcalendarLib.scrollerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/Scroller", "Default")
@js.native
class Default ()
  extends fullcalendarLib.classMod.default {
  def this(options: js.Any) = this()
  var el: js.Any = js.native
  var overflowX: js.Any = js.native
  var overflowY: js.Any = js.native
  var scrollEl: js.Any = js.native
  def applyOverflow(): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def getClientHeight(): js.Any = js.native
  def getClientWidth(): js.Any = js.native
  def getScrollTop(): js.Any = js.native
  def getScrollbarWidths(): js.Any = js.native
  def lockOverflow(scrollbarWidths: js.Any): scala.Unit = js.native
  def render(): scala.Unit = js.native
  def renderEl(): fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery = js.native
  def setHeight(height: js.Any): scala.Unit = js.native
  def setScrollTop(top: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/Scroller", JSImport.Default)
@js.native
class default () extends Default {
  def this(options: js.Any) = this()
}

