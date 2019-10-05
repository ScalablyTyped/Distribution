package typings.firefoxDashWebextDashBrowser.browser.downloads

import typings.firefoxDashWebextDashBrowser.Anon_Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.downloads.getFileIcon")
@js.native
object getFileIcon extends js.Object {
  /**
    * Retrieve an icon for the specified download. For new downloads, file icons are available after the onCreated
    * event has been received. The image returned by this function while a download is in progress may be different
    * from the image returned after the download is complete. Icon retrieval is done by querying the underlying
    * operating system or toolkit depending on the platform. The icon that is returned will therefore depend on a
    * number of factors including state of the download, platform, registered file types and visual theme. If a file
    * icon cannot be determined, browser.extension.lastError will contain an error message.
    * @param downloadId The identifier for the download.
    */
  def apply(downloadId: Double): js.Promise[String] = js.native
  def apply(downloadId: Double, options: Anon_Size): js.Promise[String] = js.native
}

