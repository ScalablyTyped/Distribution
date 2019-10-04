package typings.faviconsDashWebpackDashPlugin.faviconsDashWebpackDashPluginMod

import typings.favicons.faviconsMod.Configuration
import typings.faviconsDashWebpackDashPlugin.Anon_Options
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var devMode: js.UndefOr[Mode] = js.undefined
  var favicons: js.UndefOr[Partial[Configuration]] = js.undefined
  var inject: js.UndefOr[
    Boolean | (js.Function1[
      /* htmlPlugin */ typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginMod.^  with Anon_Options, 
      Boolean
    ])
  ] = js.undefined
  var logo: String
  var mode: js.UndefOr[Mode] = js.undefined
  var outputPath: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var publicPath: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    logo: String,
    cache: js.UndefOr[Boolean] = js.undefined,
    devMode: Mode = null,
    favicons: Partial[Configuration] = null,
    inject: Boolean | (js.Function1[
      /* htmlPlugin */ typings.htmlDashWebpackDashPlugin.htmlDashWebpackDashPluginMod.^  with Anon_Options, 
      Boolean
    ]) = null,
    mode: Mode = null,
    outputPath: String = null,
    prefix: String = null,
    publicPath: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(logo = logo)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (devMode != null) __obj.updateDynamic("devMode")(devMode)
    if (favicons != null) __obj.updateDynamic("favicons")(favicons)
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath)
    __obj.asInstanceOf[Options]
  }
}

