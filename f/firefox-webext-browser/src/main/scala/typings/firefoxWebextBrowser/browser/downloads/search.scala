package typings.firefoxWebextBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.downloads.search")
@js.native
object search extends js.Object {
  /**
    * Find DownloadItems. Set `query` to the empty object to get all DownloadItems. To get a specific DownloadItem,
    * set only the `id` field.
    */
  def apply(query: DownloadQuery): js.Promise[js.Array[DownloadItem]] = js.native
}

