package typings.firefoxDashWebextDashBrowser.browser.downloads

import typings.firefoxDashWebextDashBrowser.Anon_Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.downloads.download")
@js.native
object download extends js.Object {
  /* downloads functions */
  /**
    * Download a URL. If the URL uses the HTTP[S] protocol, then the request will include all cookies currently set
    * for its hostname. If both `filename` and `saveAs` are specified, then the Save As dialog will be displayed,
    * pre-populated with the specified `filename`. If the download started successfully, `callback` will be called
    * with the new DownloadItem's `downloadId`. If there was an error starting the download, then `callback` will be
    * called with `downloadId=undefined` and browser.extension.lastError will contain a descriptive string. The error
    * strings are not guaranteed to remain backwards compatible between releases. You must not parse it.
    * @param options What to download and how.
    */
  def apply(options: Anon_Body): js.Promise[Double] = js.native
}

