package typings.electronDashPublish.outProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-publish/out/progress", "ProgressCallback")
@js.native
class ProgressCallback protected () extends js.Object {
  def this(progressBar: ProgressBar) = this()
  var nextUpdate: js.Any = js.native
  val progressBar: js.Any = js.native
  var start: js.Any = js.native
  def update(transferred: Double, total: Double): Unit = js.native
}

