package typings.fullcalendar.renderQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/RenderQueue", "Default")
@js.native
class Default protected ()
  extends typings.fullcalendar.taskQueueMod.default {
  def this(waitsByNamespace: js.Any) = this()
  var waitId: js.Any = js.native
  var waitNamespace: js.Any = js.native
  var waitsByNamespace: js.Any = js.native
  def clearWait(): Unit = js.native
  def compoundTask(newTask: js.Any): Boolean = js.native
  def delayWait(waitMs: js.Any): Unit = js.native
  def queue(taskFunc: js.Any, namespace: js.Any, `type`: js.Any): Unit = js.native
  def spawnWait(waitMs: js.Any): Unit = js.native
  def startWait(namespace: js.Any, waitMs: js.Any): Unit = js.native
}

@JSImport("fullcalendar/RenderQueue", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(waitsByNamespace: js.Any) = this()
}

