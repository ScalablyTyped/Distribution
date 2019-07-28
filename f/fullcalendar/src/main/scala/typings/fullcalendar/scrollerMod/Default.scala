package typings.fullcalendar.scrollerMod

import typings.fullcalendar.srcTypesJqueryDashHooksMod.Global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/Scroller", "Default")
@js.native
class Default ()
  extends typings.fullcalendar.classMod.default {
  def this(options: js.Any) = this()
  var el: js.Any = js.native
  var overflowX: js.Any = js.native
  var overflowY: js.Any = js.native
  var scrollEl: js.Any = js.native
  def applyOverflow(): Unit = js.native
  def clear(): Unit = js.native
  def destroy(): Unit = js.native
  def getClientHeight(): js.Any = js.native
  def getClientWidth(): js.Any = js.native
  def getScrollTop(): js.Any = js.native
  def getScrollbarWidths(): js.Any = js.native
  def lockOverflow(scrollbarWidths: js.Any): Unit = js.native
  def render(): Unit = js.native
  def renderEl(): JQuery = js.native
  def setHeight(height: js.Any): Unit = js.native
  def setScrollTop(top: js.Any): Unit = js.native
}

@JSImport("fullcalendar/Scroller", JSImport.Default)
@js.native
class default () extends Default {
  def this(options: js.Any) = this()
}

