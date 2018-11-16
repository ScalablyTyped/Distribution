package typings
package electronDashPublishLib.outProgressMod

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
  def update(transferred: scala.Double, total: scala.Double): scala.Unit = js.native
}

