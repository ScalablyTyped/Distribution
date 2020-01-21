package typings.electronPublish

import typings.electronPublish.progressMod.ProgressBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-publish/out/multiProgress", JSImport.Namespace)
@js.native
object multiProgressMod extends js.Object {
  @js.native
  class MultiProgress () extends js.Object {
    var allocateLines: js.Any = js.native
    var barCount: js.Any = js.native
    var cursor: js.Any = js.native
    var isLogListenerAdded: js.Any = js.native
    var moveCursor: js.Any = js.native
    val stream: js.Any = js.native
    var totalLines: js.Any = js.native
    def createBar(format: String, options: js.Any): ProgressBar = js.native
    def terminate(): Unit = js.native
  }
  
}

