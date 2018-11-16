package typings
package fullcalendarLib.globalemitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/GlobalEmitter", "Default")
@js.native
class Default () extends js.Object {
  var hasHandlers: js.Function1[/* type */ js.Any, _] = js.native
  var isTouching: scala.Boolean = js.native
  var listenTo: js.Function3[/* other */ js.Any, /* arg */ js.Any, /* callback */ js.UndefOr[js.Any], _] = js.native
  var mouseIgnoreDepth: scala.Double = js.native
  var off: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  var on: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  var one: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  var stopListeningTo: js.Function2[/* other */ js.Any, /* eventName */ js.UndefOr[js.Any], _] = js.native
  var trigger: js.Function2[/* types */ js.Any, /* repeated */js.Any, _] = js.native
  var triggerWith: js.Function3[/* types */ js.Any, /* context */ js.Any, /* args */ js.Any, _] = js.native
  def bind(): scala.Unit = js.native
  def handleClick(ev: js.Any): scala.Unit = js.native
  def handleContextMenu(ev: js.Any): scala.Unit = js.native
  def handleMouseDown(ev: js.Any): scala.Unit = js.native
  def handleMouseMove(ev: js.Any): scala.Unit = js.native
  def handleMouseUp(ev: js.Any): scala.Unit = js.native
  def handleScroll(ev: js.Any): scala.Unit = js.native
  def handleScrollProxy(ev: stdLib.Event): scala.Unit = js.native
  def handleSelectStart(ev: js.Any): scala.Unit = js.native
  def handleTouchCancel(ev: js.Any): scala.Unit = js.native
  def handleTouchEnd(ev: js.Any): scala.Unit = js.native
  def handleTouchMove(ev: js.Any): scala.Unit = js.native
  def handleTouchMoveProxy(ev: stdLib.Event): scala.Unit = js.native
  def handleTouchStart(ev: js.Any): scala.Unit = js.native
  def shouldIgnoreMouse(): scala.Boolean = js.native
  def startTouchMouseIgnore(): scala.Unit = js.native
  def stopTouch(ev: js.Any): scala.Unit = js.native
  def stopTouch(ev: js.Any, skipMouseIgnore: scala.Boolean): scala.Unit = js.native
  def unbind(): scala.Unit = js.native
}

@JSImport("fullcalendar/GlobalEmitter", JSImport.Default)
@js.native
class default () extends Default

@JSImport("fullcalendar/GlobalEmitter", "Default")
@js.native
object Default extends js.Object {
  def get(): js.Any = js.native
  def needed(): scala.Unit = js.native
  def unneeded(): scala.Unit = js.native
}

@JSImport("fullcalendar/GlobalEmitter", JSImport.Default)
@js.native
object default extends js.Object {
  def get(): js.Any = js.native
  def needed(): scala.Unit = js.native
  def unneeded(): scala.Unit = js.native
}

