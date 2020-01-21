package typings.firefoxWebextBrowser.browser.browsingData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.browsingData.removeDownloads")
@js.native
object removeDownloads extends js.Object {
  /** Clears the browser's list of downloaded files (_not_ the downloaded files themselves). */
  def apply(options: RemovalOptions): js.Promise[Unit] = js.native
}

