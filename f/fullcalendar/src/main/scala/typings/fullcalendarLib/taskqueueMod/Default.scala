package typings
package fullcalendarLib.taskqueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/TaskQueue", "Default")
@js.native
class Default () extends js.Object {
  var hasHandlers: js.Function1[/* type */ js.Any, _] = js.native
  var isPaused: scala.Boolean = js.native
  var isRunning: scala.Boolean = js.native
  var off: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  var on: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  var one: js.Function2[/* types */ js.Any, /* handler */ js.Any, _] = js.native
  var q: js.Any = js.native
  var trigger: js.Function2[/* types */ js.Any, /* repeated */js.Any, _] = js.native
  var triggerWith: js.Function3[/* types */ js.Any, /* context */ js.Any, /* args */ js.Any, _] = js.native
  def canRunNext(): js.Any = js.native
  def getIsIdle(): scala.Boolean = js.native
  def pause(): scala.Unit = js.native
  def queue(args: js.Any*): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def runRemaining(): scala.Unit = js.native
  def runTask(task: js.Any): js.Any = js.native
  def tryStart(): scala.Unit = js.native
}

@JSImport("fullcalendar/TaskQueue", JSImport.Default)
@js.native
class default () extends Default

