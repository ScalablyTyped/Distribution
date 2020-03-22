package typings.faviconsWebpackPlugin

import typings.favicons.PartialandroidbooleanIcon
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.`black-translucent`
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.`minimal-ui`
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.any
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.black
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.browser
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.default
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.fullscreen
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.landscape
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.natural
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.portrait
import typings.faviconsWebpackPlugin.faviconsWebpackPluginStrings.standalone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<favicons.favicons.Configuration> */
trait PartialConfiguration extends js.Object {
  var appDescription: js.UndefOr[String] = js.undefined
  var appName: js.UndefOr[String] = js.undefined
  var appShortName: js.UndefOr[String] = js.undefined
  var appleStatusBarStyle: js.UndefOr[`black-translucent` | default | black] = js.undefined
  var background: js.UndefOr[String] = js.undefined
  var developerName: js.UndefOr[String] = js.undefined
  var developerURL: js.UndefOr[String] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var display: js.UndefOr[fullscreen | standalone | `minimal-ui` | browser] = js.undefined
  var icons: js.UndefOr[PartialandroidbooleanIcon] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var loadManifestWithCredentials: js.UndefOr[Boolean] = js.undefined
  var logging: js.UndefOr[Boolean] = js.undefined
  var manifestRelativePaths: js.UndefOr[Boolean] = js.undefined
  var orientation: js.UndefOr[any | natural | portrait | landscape] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var pipeHTML: js.UndefOr[Boolean] = js.undefined
  var pixel_art: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var start_url: js.UndefOr[String] = js.undefined
  var theme_color: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object PartialConfiguration {
  @scala.inline
  def apply(
    appDescription: String = null,
    appName: String = null,
    appShortName: String = null,
    appleStatusBarStyle: `black-translucent` | default | black = null,
    background: String = null,
    developerName: String = null,
    developerURL: String = null,
    dir: String = null,
    display: fullscreen | standalone | `minimal-ui` | browser = null,
    icons: PartialandroidbooleanIcon = null,
    lang: String = null,
    loadManifestWithCredentials: js.UndefOr[Boolean] = js.undefined,
    logging: js.UndefOr[Boolean] = js.undefined,
    manifestRelativePaths: js.UndefOr[Boolean] = js.undefined,
    orientation: any | natural | portrait | landscape = null,
    path: String = null,
    pipeHTML: js.UndefOr[Boolean] = js.undefined,
    pixel_art: js.UndefOr[Boolean] = js.undefined,
    scope: String = null,
    start_url: String = null,
    theme_color: String = null,
    version: String = null
  ): PartialConfiguration = {
    val __obj = js.Dynamic.literal()
    if (appDescription != null) __obj.updateDynamic("appDescription")(appDescription.asInstanceOf[js.Any])
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (appShortName != null) __obj.updateDynamic("appShortName")(appShortName.asInstanceOf[js.Any])
    if (appleStatusBarStyle != null) __obj.updateDynamic("appleStatusBarStyle")(appleStatusBarStyle.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (developerName != null) __obj.updateDynamic("developerName")(developerName.asInstanceOf[js.Any])
    if (developerURL != null) __obj.updateDynamic("developerURL")(developerURL.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(loadManifestWithCredentials)) __obj.updateDynamic("loadManifestWithCredentials")(loadManifestWithCredentials.asInstanceOf[js.Any])
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (!js.isUndefined(manifestRelativePaths)) __obj.updateDynamic("manifestRelativePaths")(manifestRelativePaths.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(pipeHTML)) __obj.updateDynamic("pipeHTML")(pipeHTML.asInstanceOf[js.Any])
    if (!js.isUndefined(pixel_art)) __obj.updateDynamic("pixel_art")(pixel_art.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (start_url != null) __obj.updateDynamic("start_url")(start_url.asInstanceOf[js.Any])
    if (theme_color != null) __obj.updateDynamic("theme_color")(theme_color.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConfiguration]
  }
}

