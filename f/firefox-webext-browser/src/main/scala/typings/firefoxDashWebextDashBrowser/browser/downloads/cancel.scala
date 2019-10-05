package typings.firefoxDashWebextDashBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.downloads.cancel")
@js.native
object cancel extends js.Object {
  /**
    * Cancel a download. When `callback` is run, the download is cancelled, completed, interrupted or doesn't exist
    * anymore.
    * @param downloadId The id of the download to cancel.
    */
  def apply(downloadId: Double): js.Promise[Unit] = js.native
}

