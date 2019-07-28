package typings.fullcalendar.modelMod

import typings.fullcalendar.Anon_Flash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/Model", "Default")
@js.native
class Default ()
  extends typings.fullcalendar.classMod.default {
  var _globalWatchArgs: js.Any = js.native
  var _props: js.Any = js.native
  var _watchers: js.Any = js.native
  @JSName("hasHandlers")
  var hasHandlers_Original: js.Function1[/* type */ js.Any, _] = js.native
  @JSName("listenTo")
  var listenTo_Original: js.Function3[/* other */ js.Any, /* arg */ js.Any, /* callback */ js.UndefOr[js.Any], _] = js.native
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
  def _watchDeps(depList: js.Any, startFunc: js.Any, stopFunc: js.Any): Anon_Flash = js.native
  def applyGlobalWatchers(): Unit = js.native
  def constructed(): Unit = js.native
  def flash(name: js.Any): Unit = js.native
  def get(name: js.Any): js.Any = js.native
  def has(name: js.Any): Boolean = js.native
  def hasHandlers(`type`: js.Any): js.Any = js.native
  def listenTo(other: js.Any, arg: js.Any): js.Any = js.native
  def listenTo(other: js.Any, arg: js.Any, callback: js.Any): js.Any = js.native
  def off(types: js.Any, handler: js.Any): js.Any = js.native
  def on(types: js.Any, handler: js.Any): js.Any = js.native
  def one(types: js.Any, handler: js.Any): js.Any = js.native
  def reset(newProps: js.Any): Unit = js.native
  def set(name: js.Any, `val`: js.Any): Unit = js.native
  def setProps(newProps: js.Any): Unit = js.native
  def stopListeningTo(other: js.Any): js.Any = js.native
  def stopListeningTo(other: js.Any, eventName: js.Any): js.Any = js.native
  def trigger(types: js.Any, args: js.Any*): js.Any = js.native
  def triggerWith(types: js.Any, context: js.Any, args: js.Any): js.Any = js.native
  def unset(name: js.Any): Unit = js.native
  def unwatch(name: js.Any): Unit = js.native
  def watch(name: js.Any, depList: js.Any, startFunc: js.Any): Unit = js.native
  def watch(name: js.Any, depList: js.Any, startFunc: js.Any, stopFunc: js.Any): Unit = js.native
}

@JSImport("fullcalendar/Model", JSImport.Default)
@js.native
class default () extends Default

/* static members */
@JSImport("fullcalendar/Model", "Default")
@js.native
object Default extends js.Object {
  def watch(name: js.Any, args: js.Any*): Unit = js.native
}

/* static members */
@JSImport("fullcalendar/Model", JSImport.Default)
@js.native
object default extends js.Object {
  def watch(name: js.Any, args: js.Any*): Unit = js.native
}

