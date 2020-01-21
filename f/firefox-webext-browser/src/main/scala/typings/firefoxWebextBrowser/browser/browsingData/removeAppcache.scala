package typings.firefoxWebextBrowser.browser.browsingData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.browsingData.removeAppcache")
@js.native
object removeAppcache extends js.Object {
  /**
    * Clears websites' appcache data.
    * @deprecated Unsupported on Firefox at this time.
    */
  def apply(options: RemovalOptions): js.Promise[Unit] = js.native
}

