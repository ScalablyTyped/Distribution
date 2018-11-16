package typings
package fullcalendarLib.modelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/Model", "Default")
@js.native
class Default ()
  extends fullcalendarLib.classMod.default {
  var _globalWatchArgs: js.Any = js.native
  var _props: js.Any = js.native
  var _watchers: js.Any = js.native
  var hasHandlers: js.Function1[/* type */ js.Any, _] = js.native
  var listenTo: js.Function3[/* other */ js.Any, /* arg */ js.Any, /* callback */ js.UndefOr[js.Any], _] = js.native
  var off: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  var on: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  var one: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  var stopListeningTo: js.Function2[/* other */ js.Any, /* eventName */ js.UndefOr[js.Any], _] = js.native
  var trigger: js.Function2[/* types */ js.Any, /* repeated */js.Any, _] = js.native
  var triggerWith: js.Function3[/* types */ js.Any, /* context */ js.Any, /* args */ js.Any, _] = js.native
  def _watchDeps(depList: js.Any, startFunc: js.Any, stopFunc: js.Any): fullcalendarLib.Anon_Flash = js.native
  def applyGlobalWatchers(): scala.Unit = js.native
  def constructed(): scala.Unit = js.native
  def flash(name: js.Any): scala.Unit = js.native
  def get(name: js.Any): js.Any = js.native
  def has(name: js.Any): scala.Boolean = js.native
  def reset(newProps: js.Any): scala.Unit = js.native
  def set(name: js.Any, `val`: js.Any): scala.Unit = js.native
  def setProps(newProps: js.Any): scala.Unit = js.native
  def unset(name: js.Any): scala.Unit = js.native
  def unwatch(name: js.Any): scala.Unit = js.native
  def watch(name: js.Any, depList: js.Any, startFunc: js.Any): scala.Unit = js.native
  def watch(name: js.Any, depList: js.Any, startFunc: js.Any, stopFunc: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/Model", JSImport.Default)
@js.native
class default () extends Default

@JSImport("fullcalendar/Model", "Default")
@js.native
object Default extends js.Object {
  def watch(name: js.Any, args: js.Any*): scala.Unit = js.native
}

@JSImport("fullcalendar/Model", JSImport.Default)
@js.native
object default extends js.Object {
  def watch(name: js.Any, args: js.Any*): scala.Unit = js.native
}

