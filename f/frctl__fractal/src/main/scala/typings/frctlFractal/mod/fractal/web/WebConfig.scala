package typings.frctlFractal.mod.fractal.web

import typings.frctlFractal.mod.WebTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebConfig extends js.Object {
  var builder: js.UndefOr[WebBuilderConfig] = js.undefined
  @JSName("builder.concurrency")
  var builderDotconcurrency: js.UndefOr[Double] = js.undefined
  @JSName("builder.dest")
  var builderDotdest: js.UndefOr[String] = js.undefined
  @JSName("builder.ext")
  var builderDotext: js.UndefOr[String] = js.undefined
  @JSName("builder.theme")
  var builderDottheme: js.UndefOr[WebTheme | String] = js.undefined
  @JSName("builder.urls")
  var builderDoturls: js.UndefOr[WebBuilderUrls] = js.undefined
  @JSName("builder.urls.ext")
  var builderDoturlsDotext: js.UndefOr[String] = js.undefined
  var server: js.UndefOr[WebServerConfig] = js.undefined
  @JSName("server.port")
  var serverDotport: js.UndefOr[Double] = js.undefined
  @JSName("server.sync")
  var serverDotsync: js.UndefOr[Boolean] = js.undefined
  @JSName("server.syncOptions")
  var serverDotsyncOptions: js.UndefOr[WebServerSyncOptions] = js.undefined
  @JSName("server.syncOptions.browser")
  var serverDotsyncOptionsDotbrowser: js.UndefOr[js.Array[String]] = js.undefined
  @JSName("server.syncOptions.notify")
  var serverDotsyncOptionsDotnotify: js.UndefOr[Boolean] = js.undefined
  @JSName("server.syncOptions.open")
  var serverDotsyncOptionsDotopen: js.UndefOr[Boolean] = js.undefined
  @JSName("server.theme")
  var serverDottheme: js.UndefOr[WebTheme | String] = js.undefined
  @JSName("server.watch")
  var serverDotwatch: js.UndefOr[Boolean] = js.undefined
  var static: js.UndefOr[WebStaticConfig] = js.undefined
  @JSName("static.mount")
  var staticDotmount: js.UndefOr[String] = js.undefined
  @JSName("static.path")
  var staticDotpath: js.UndefOr[String] = js.undefined
}

object WebConfig {
  @scala.inline
  def apply(
    builder: WebBuilderConfig = null,
    builderDotconcurrency: js.UndefOr[Double] = js.undefined,
    builderDotdest: String = null,
    builderDotext: String = null,
    builderDottheme: WebTheme | String = null,
    builderDoturls: WebBuilderUrls = null,
    builderDoturlsDotext: String = null,
    server: WebServerConfig = null,
    serverDotport: js.UndefOr[Double] = js.undefined,
    serverDotsync: js.UndefOr[Boolean] = js.undefined,
    serverDotsyncOptions: WebServerSyncOptions = null,
    serverDotsyncOptionsDotbrowser: js.Array[String] = null,
    serverDotsyncOptionsDotnotify: js.UndefOr[Boolean] = js.undefined,
    serverDotsyncOptionsDotopen: js.UndefOr[Boolean] = js.undefined,
    serverDottheme: WebTheme | String = null,
    serverDotwatch: js.UndefOr[Boolean] = js.undefined,
    static: WebStaticConfig = null,
    staticDotmount: String = null,
    staticDotpath: String = null
  ): WebConfig = {
    val __obj = js.Dynamic.literal()
    if (builder != null) __obj.updateDynamic("builder")(builder.asInstanceOf[js.Any])
    if (!js.isUndefined(builderDotconcurrency)) __obj.updateDynamic("builder.concurrency")(builderDotconcurrency.get.asInstanceOf[js.Any])
    if (builderDotdest != null) __obj.updateDynamic("builder.dest")(builderDotdest.asInstanceOf[js.Any])
    if (builderDotext != null) __obj.updateDynamic("builder.ext")(builderDotext.asInstanceOf[js.Any])
    if (builderDottheme != null) __obj.updateDynamic("builder.theme")(builderDottheme.asInstanceOf[js.Any])
    if (builderDoturls != null) __obj.updateDynamic("builder.urls")(builderDoturls.asInstanceOf[js.Any])
    if (builderDoturlsDotext != null) __obj.updateDynamic("builder.urls.ext")(builderDoturlsDotext.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (!js.isUndefined(serverDotport)) __obj.updateDynamic("server.port")(serverDotport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverDotsync)) __obj.updateDynamic("server.sync")(serverDotsync.get.asInstanceOf[js.Any])
    if (serverDotsyncOptions != null) __obj.updateDynamic("server.syncOptions")(serverDotsyncOptions.asInstanceOf[js.Any])
    if (serverDotsyncOptionsDotbrowser != null) __obj.updateDynamic("server.syncOptions.browser")(serverDotsyncOptionsDotbrowser.asInstanceOf[js.Any])
    if (!js.isUndefined(serverDotsyncOptionsDotnotify)) __obj.updateDynamic("server.syncOptions.notify")(serverDotsyncOptionsDotnotify.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverDotsyncOptionsDotopen)) __obj.updateDynamic("server.syncOptions.open")(serverDotsyncOptionsDotopen.get.asInstanceOf[js.Any])
    if (serverDottheme != null) __obj.updateDynamic("server.theme")(serverDottheme.asInstanceOf[js.Any])
    if (!js.isUndefined(serverDotwatch)) __obj.updateDynamic("server.watch")(serverDotwatch.get.asInstanceOf[js.Any])
    if (static != null) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    if (staticDotmount != null) __obj.updateDynamic("static.mount")(staticDotmount.asInstanceOf[js.Any])
    if (staticDotpath != null) __obj.updateDynamic("static.path")(staticDotpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebConfig]
  }
}

