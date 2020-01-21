package typings.firefoxWebextBrowser.browser.browsingData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.browsingData.removeWebSQL")
@js.native
object removeWebSQL extends js.Object {
  /**
    * Clears websites' WebSQL data.
    * @deprecated Unsupported on Firefox at this time.
    */
  def apply(options: RemovalOptions): js.Promise[Unit] = js.native
}

