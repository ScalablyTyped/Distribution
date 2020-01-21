package typings.firefoxWebextBrowser.browser.downloads

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* downloads events */
/** This event fires with the DownloadItem object when a download begins. */
@JSGlobal("browser.downloads.onCreated")
@js.native
object onCreated
  extends TopLevel[WebExtEvent[js.Function1[/* downloadItem */ DownloadItem, Unit]]]

