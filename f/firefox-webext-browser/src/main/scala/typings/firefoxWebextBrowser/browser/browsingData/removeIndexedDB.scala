package typings.firefoxWebextBrowser.browser.browsingData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.browsingData.removeIndexedDB")
@js.native
object removeIndexedDB extends js.Object {
  /**
    * Clears websites' IndexedDB data.
    * @deprecated Unsupported on Firefox at this time.
    */
  def apply(options: RemovalOptions): js.Promise[Unit] = js.native
}

