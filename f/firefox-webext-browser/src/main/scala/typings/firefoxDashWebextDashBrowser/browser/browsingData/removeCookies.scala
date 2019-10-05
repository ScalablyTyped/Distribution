package typings.firefoxDashWebextDashBrowser.browser.browsingData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.browsingData.removeCookies")
@js.native
object removeCookies extends js.Object {
  /** Clears the browser's cookies and server-bound certificates modified within a particular timeframe. */
  def apply(options: RemovalOptions): js.Promise[Unit] = js.native
}

