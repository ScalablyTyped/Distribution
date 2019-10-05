package typings.firefoxDashWebextDashBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.downloads.pause")
@js.native
object pause extends js.Object {
  /**
    * Pause the download. If the request was successful the download is in a paused state. Otherwise
    * browser.extension.lastError contains an error message. The request will fail if the download is not active.
    * @param downloadId The id of the download to pause.
    */
  def apply(downloadId: Double): js.Promise[Unit] = js.native
}

