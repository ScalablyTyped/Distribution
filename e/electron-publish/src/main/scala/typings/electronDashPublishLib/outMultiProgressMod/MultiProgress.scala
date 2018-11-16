package typings
package electronDashPublishLib.outMultiProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-publish/out/multiProgress", "MultiProgress")
@js.native
class MultiProgress () extends js.Object {
  var allocateLines: js.Any = js.native
  var barCount: js.Any = js.native
  var cursor: js.Any = js.native
  var isLogListenerAdded: js.Any = js.native
  var moveCursor: js.Any = js.native
  val stream: js.Any = js.native
  var totalLines: js.Any = js.native
  def createBar(format: java.lang.String, options: js.Any): electronDashPublishLib.outProgressMod.ProgressBar = js.native
  def terminate(): scala.Unit = js.native
}

