package typings.fullcalendar.taskQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/TaskQueue", "Default")
@js.native
class Default () extends js.Object {
  @JSName("hasHandlers")
  var hasHandlers_Original: js.Function1[/* type */ js.Any, _] = js.native
  var isPaused: Boolean = js.native
  var isRunning: Boolean = js.native
  @JSName("off")
  var off_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  @JSName("on")
  var on_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  @JSName("one")
  var one_Original: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  var q: js.Any = js.native
  @JSName("triggerWith")
  var triggerWith_Original: js.Function3[/* types */ js.Any, /* context */ js.Any, /* args */ js.Any, _] = js.native
  @JSName("trigger")
  var trigger_Original: js.Function2[/* types */ js.Any, /* repeated */ js.Any, _] = js.native
  def canRunNext(): js.Any = js.native
  def getIsIdle(): Boolean = js.native
  def hasHandlers(`type`: js.Any): js.Any = js.native
  def off(types: js.Any, handler: js.Any): js.Any = js.native
  def on(types: js.Any, handler: js.Any): js.Any = js.native
  def one(types: js.Any, handler: js.Any): js.Any = js.native
  def pause(): Unit = js.native
  def queue(args: js.Any*): Unit = js.native
  def resume(): Unit = js.native
  def runRemaining(): Unit = js.native
  def runTask(task: js.Any): js.Any = js.native
  def trigger(types: js.Any, args: js.Any*): js.Any = js.native
  def triggerWith(types: js.Any, context: js.Any, args: js.Any): js.Any = js.native
  def tryStart(): Unit = js.native
}

@JSImport("fullcalendar/TaskQueue", JSImport.Default)
@js.native
class default () extends Default

