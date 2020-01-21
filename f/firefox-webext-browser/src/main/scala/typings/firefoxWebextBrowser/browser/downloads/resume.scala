package typings.firefoxWebextBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.downloads.resume")
@js.native
object resume extends js.Object {
  /**
    * Resume a paused download. If the request was successful the download is in progress and unpaused. Otherwise
    * browser.extension.lastError contains an error message. The request will fail if the download is not active.
    * @param downloadId The id of the download to resume.
    */
  def apply(downloadId: Double): js.Promise[Unit] = js.native
}

