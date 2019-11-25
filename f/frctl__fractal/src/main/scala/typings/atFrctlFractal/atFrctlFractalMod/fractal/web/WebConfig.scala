package typings.atFrctlFractal.atFrctlFractalMod.fractal.web

import typings.atFrctlFractal.atFrctlFractalMod.WebTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebConfig extends js.Object {
  var builder: js.UndefOr[WebBuilderConfig] = js.undefined
  var `builder.concurrency`: js.UndefOr[Double] = js.undefined
  var `builder.dest`: js.UndefOr[String] = js.undefined
  var `builder.ext`: js.UndefOr[String] = js.undefined
  var `builder.theme`: js.UndefOr[WebTheme | String] = js.undefined
  var `builder.urls`: js.UndefOr[WebBuilderUrls] = js.undefined
  var `builder.urls.ext`: js.UndefOr[String] = js.undefined
  var server: js.UndefOr[WebServerConfig] = js.undefined
  var `server.port`: js.UndefOr[Double] = js.undefined
  var `server.sync`: js.UndefOr[Boolean] = js.undefined
  var `server.syncOptions`: js.UndefOr[WebServerSyncOptions] = js.undefined
  var `server.syncOptions.browser`: js.UndefOr[js.Array[String]] = js.undefined
  var `server.syncOptions.notify`: js.UndefOr[Boolean] = js.undefined
  var `server.syncOptions.open`: js.UndefOr[Boolean] = js.undefined
  var `server.theme`: js.UndefOr[WebTheme | String] = js.undefined
  var `server.watch`: js.UndefOr[Boolean] = js.undefined
  var static: js.UndefOr[WebStaticConfig] = js.undefined
  var `static.mount`: js.UndefOr[String] = js.undefined
  var `static.path`: js.UndefOr[String] = js.undefined
}

object WebConfig {
  @scala.inline
  def apply(
    builder: WebBuilderConfig = null,
    `builder.concurrency`: Int | Double = null,
    `builder.dest`: String = null,
    `builder.ext`: String = null,
    `builder.theme`: WebTheme | String = null,
    `builder.urls`: WebBuilderUrls = null,
    `builder.urls.ext`: String = null,
    server: WebServerConfig = null,
    `server.port`: Int | Double = null,
    `server.sync`: js.UndefOr[Boolean] = js.undefined,
    `server.syncOptions`: WebServerSyncOptions = null,
    `server.syncOptions.browser`: js.Array[String] = null,
    `server.syncOptions.notify`: js.UndefOr[Boolean] = js.undefined,
    `server.syncOptions.open`: js.UndefOr[Boolean] = js.undefined,
    `server.theme`: WebTheme | String = null,
    `server.watch`: js.UndefOr[Boolean] = js.undefined,
    static: WebStaticConfig = null,
    `static.mount`: String = null,
    `static.path`: String = null
  ): WebConfig = {
    val __obj = js.Dynamic.literal()
    if (builder != null) __obj.updateDynamic("builder")(builder.asInstanceOf[js.Any])
    if (`builder.concurrency` != null) __obj.updateDynamic("builder.concurrency")(`builder.concurrency`.asInstanceOf[js.Any])
    if (`builder.dest` != null) __obj.updateDynamic("builder.dest")(`builder.dest`.asInstanceOf[js.Any])
    if (`builder.ext` != null) __obj.updateDynamic("builder.ext")(`builder.ext`.asInstanceOf[js.Any])
    if (`builder.theme` != null) __obj.updateDynamic("builder.theme")(`builder.theme`.asInstanceOf[js.Any])
    if (`builder.urls` != null) __obj.updateDynamic("builder.urls")(`builder.urls`.asInstanceOf[js.Any])
    if (`builder.urls.ext` != null) __obj.updateDynamic("builder.urls.ext")(`builder.urls.ext`.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (`server.port` != null) __obj.updateDynamic("server.port")(`server.port`.asInstanceOf[js.Any])
    if (!js.isUndefined(`server.sync`)) __obj.updateDynamic("server.sync")(`server.sync`.asInstanceOf[js.Any])
    if (`server.syncOptions` != null) __obj.updateDynamic("server.syncOptions")(`server.syncOptions`.asInstanceOf[js.Any])
    if (`server.syncOptions.browser` != null) __obj.updateDynamic("server.syncOptions.browser")(`server.syncOptions.browser`.asInstanceOf[js.Any])
    if (!js.isUndefined(`server.syncOptions.notify`)) __obj.updateDynamic("server.syncOptions.notify")(`server.syncOptions.notify`.asInstanceOf[js.Any])
    if (!js.isUndefined(`server.syncOptions.open`)) __obj.updateDynamic("server.syncOptions.open")(`server.syncOptions.open`.asInstanceOf[js.Any])
    if (`server.theme` != null) __obj.updateDynamic("server.theme")(`server.theme`.asInstanceOf[js.Any])
    if (!js.isUndefined(`server.watch`)) __obj.updateDynamic("server.watch")(`server.watch`.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (`static.mount` != null) __obj.updateDynamic("static.mount")(`static.mount`.asInstanceOf[js.Any])
    if (`static.path` != null) __obj.updateDynamic("static.path")(`static.path`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebConfig]
  }
}

