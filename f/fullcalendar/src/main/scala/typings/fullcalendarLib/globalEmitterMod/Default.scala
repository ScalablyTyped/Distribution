package typings
package fullcalendarLib.globalEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/GlobalEmitter", "Default")
@js.native
class Default () extends js.Object {
  @JSName("hasHandlers")
  var hasHandlers_Original: js.Function1[/* type */ js.Any, _] = js.native
  var isTouching: scala.Boolean = js.native
  @JSName("listenTo")
  var listenTo_Original: js.Function3[/* other */ js.Any, /* arg */ js.Any, /* callback */ js.UndefOr[js.Any], _] = js.native
  var mouseIgnoreDepth: scala.Double = js.native
  @JSName("off")
  var off_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  @JSName("on")
  var on_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  @JSName("one")
  var one_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  @JSName("stopListeningTo")
  var stopListeningTo_Original: js.Function2[/* other */ js.Any, /* eventName */ js.UndefOr[js.Any], _] = js.native
  @JSName("triggerWith")
  var triggerWith_Original: js.Function3[/* types */ js.Any, /* context */ js.Any, /* args */ js.Any, _] = js.native
  @JSName("trigger")
  var trigger_Original: js.Function2[/* types */ js.Any, /* repeated */ js.Any, _] = js.native
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
  def hasHandlers(`type`: js.Any): js.Any = js.native
  def listenTo(other: js.Any, arg: js.Any): js.Any = js.native
  def listenTo(other: js.Any, arg: js.Any, callback: js.Any): js.Any = js.native
  def off(types: js.Any, handler: js.Any): js.Any = js.native
  def on(types: js.Any, handler: js.Any): js.Any = js.native
  def one(types: js.Any, handler: js.Any): js.Any = js.native
  def shouldIgnoreMouse(): scala.Boolean = js.native
  def startTouchMouseIgnore(): scala.Unit = js.native
  def stopListeningTo(other: js.Any): js.Any = js.native
  def stopListeningTo(other: js.Any, eventName: js.Any): js.Any = js.native
  def stopTouch(ev: js.Any): scala.Unit = js.native
  def stopTouch(ev: js.Any, skipMouseIgnore: scala.Boolean): scala.Unit = js.native
  def trigger(types: js.Any, args: js.Any*): js.Any = js.native
  def triggerWith(types: js.Any, context: js.Any, args: js.Any): js.Any = js.native
  def unbind(): scala.Unit = js.native
}

@JSImport("fullcalendar/GlobalEmitter", JSImport.Default)
@js.native
class default () extends Default

/* static members */
@JSImport("fullcalendar/GlobalEmitter", "Default")
@js.native
object Default extends js.Object {
  def get(): js.Any = js.native
  def needed(): scala.Unit = js.native
  def unneeded(): scala.Unit = js.native
}

/* static members */
@JSImport("fullcalendar/GlobalEmitter", JSImport.Default)
@js.native
object default extends js.Object {
  def get(): js.Any = js.native
  def needed(): scala.Unit = js.native
  def unneeded(): scala.Unit = js.native
}

