package typings.faviconsWebpackPlugin.mod

import typings.faviconsWebpackPlugin.anon.PartialConfiguration
import typings.faviconsWebpackPlugin.anon.optionsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var devMode: js.UndefOr[Mode] = js.undefined
  var favicons: js.UndefOr[PartialConfiguration] = js.undefined
  var inject: js.UndefOr[Boolean | (js.Function1[/* htmlPlugin */ optionsOptions, Boolean])] = js.undefined
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
    favicons: PartialConfiguration = null,
    inject: Boolean | (js.Function1[/* htmlPlugin */ optionsOptions, Boolean]) = null,
    mode: Mode = null,
    outputPath: String = null,
    prefix: String = null,
    publicPath: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(logo = logo.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (devMode != null) __obj.updateDynamic("devMode")(devMode.asInstanceOf[js.Any])
    if (favicons != null) __obj.updateDynamic("favicons")(favicons.asInstanceOf[js.Any])
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (outputPath != null) __obj.updateDynamic("outputPath")(outputPath.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

