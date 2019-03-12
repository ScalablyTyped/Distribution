package typings
package fullcalendarLib.renderQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/RenderQueue", "Default")
@js.native
class Default protected ()
  extends fullcalendarLib.taskQueueMod.default {
  def this(waitsByNamespace: js.Any) = this()
  var waitId: js.Any = js.native
  var waitNamespace: js.Any = js.native
  var waitsByNamespace: js.Any = js.native
  def clearWait(): scala.Unit = js.native
  def compoundTask(newTask: js.Any): scala.Boolean = js.native
  def delayWait(waitMs: js.Any): scala.Unit = js.native
  def queue(taskFunc: js.Any, namespace: js.Any, `type`: js.Any): scala.Unit = js.native
  def spawnWait(waitMs: js.Any): scala.Unit = js.native
  def startWait(namespace: js.Any, waitMs: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/RenderQueue", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(waitsByNamespace: js.Any) = this()
}

