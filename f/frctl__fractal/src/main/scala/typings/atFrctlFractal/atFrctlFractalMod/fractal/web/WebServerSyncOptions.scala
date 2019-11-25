package typings.atFrctlFractal.atFrctlFractalMod.fractal.web

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebServerSyncOptions extends js.Object {
  var browser: js.UndefOr[js.Array[String]] = js.undefined
  @JSName("notify")
  var notify_FWebServerSyncOptions: js.UndefOr[Boolean] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
}

object WebServerSyncOptions {
  @scala.inline
  def apply(
    browser: js.Array[String] = null,
    notify: js.UndefOr[Boolean] = js.undefined,
    open: js.UndefOr[Boolean] = js.undefined
  ): WebServerSyncOptions = {
    val __obj = js.Dynamic.literal()
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (!js.isUndefined(notify)) __obj.updateDynamic("notify")(notify.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebServerSyncOptions]
  }
}

