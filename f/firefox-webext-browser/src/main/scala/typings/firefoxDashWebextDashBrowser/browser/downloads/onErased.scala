package typings.firefoxDashWebextDashBrowser.browser.downloads

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fires with the `downloadId` when a download is erased from history.
  * @param downloadId The `id` of the DownloadItem that was erased.
  */
@JSGlobal("browser.downloads.onErased")
@js.native
object onErased
  extends TopLevel[WebExtEvent[js.Function1[/* downloadId */ Double, Unit]]]

