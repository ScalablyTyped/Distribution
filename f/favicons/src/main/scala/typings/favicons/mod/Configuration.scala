package typings.favicons.mod

import typings.favicons.anon.PartialandroidbooleanIcon
import typings.favicons.faviconsStrings.`black-translucent`
import typings.favicons.faviconsStrings.`minimal-ui`
import typings.favicons.faviconsStrings.any
import typings.favicons.faviconsStrings.black
import typings.favicons.faviconsStrings.browser
import typings.favicons.faviconsStrings.default
import typings.favicons.faviconsStrings.fullscreen
import typings.favicons.faviconsStrings.landscape
import typings.favicons.faviconsStrings.natural
import typings.favicons.faviconsStrings.portrait
import typings.favicons.faviconsStrings.standalone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  /** Your application's description @default null */
  var appDescription: String | Null
  /** Your application's name @default null */
  var appName: String | Null
  /** Your application's short_name. If not set, `appName` will be used @default null */
  var appShortName: String | Null
  /** Style for Apple status bar @default 'black-translucent' */
  var appleStatusBarStyle: `black-translucent` | default | black
  /** Background colour for flattened icons @default '#fff' */
  var background: String
  /** Your (or your developer's) name @default null */
  var developerName: String | Null
  /** Your (or your developer's) URL @default null */
  var developerURL: String | Null
  /** Primary text direction for name, short_name, and description @default 'auto' */
  var dir: String
  /** Preferred display mode: 'fullscreen', 'standalone', 'minimal-ui' or 'browser' @default 'standalone' */
  var display: fullscreen | standalone | `minimal-ui` | browser
  /**
    * Platform Options:
    * - offset - offset in percentage
    * - background:
    *   * false - use default
    *   * true - force use default, e.g. set background for Android icons
    *   * color - set background for the specified icons
    * - mask - apply mask in order to create circle icon (applied by default for firefox)
    * - overlayGlow - apply glow effect after mask has been applied (applied by default for firefox)
    * - overlayShadow - apply drop shadow after mask has been applied
    */
  var icons: PartialandroidbooleanIcon
  /** Primary language for name and short_name @default 'en-US' */
  var lang: String
  /** Browsers don't send cookies when fetching a manifest, enable this to fix that @default false */
  var loadManifestWithCredentials: Boolean
  /** Print logs to console? @default false */
  var logging: Boolean
  /** Determines whether to set relative paths in manifests @default false */
  var manifestRelativePaths: Boolean
  /** Default orientation: 'any', 'natural', 'portrait' or 'landscape' @default 'any' */
  var orientation: any | natural | portrait | landscape
  /** Path for overriding default icons path @default '/' */
  var path: String
  /** Determines whether to allow piping html as a file @default false */
  var pipeHTML: Boolean
  /** Use nearest neighbor resampling to preserve hard edges on pixel art @default false */
  var pixel_art: Boolean
  /** Set of URLs that the browser considers within your app @default null */
  var scope: String
  /** Start URL when launching the application from a device @default '/?homescreen=1' */
  var start_url: String
  /** Theme color user for example in Android's task switcher @default '#fff' */
  var theme_color: String
  /** Your application's version string @default '1.0' */
  var version: String
}

object Configuration {
  @scala.inline
  def apply(
    appleStatusBarStyle: `black-translucent` | default | black,
    background: String,
    dir: String,
    display: fullscreen | standalone | `minimal-ui` | browser,
    icons: PartialandroidbooleanIcon,
    lang: String,
    loadManifestWithCredentials: Boolean,
    logging: Boolean,
    manifestRelativePaths: Boolean,
    orientation: any | natural | portrait | landscape,
    path: String,
    pipeHTML: Boolean,
    pixel_art: Boolean,
    scope: String,
    start_url: String,
    theme_color: String,
    version: String,
    appDescription: String = null,
    appName: String = null,
    appShortName: String = null,
    developerName: String = null,
    developerURL: String = null
  ): Configuration = {
    val __obj = js.Dynamic.literal(appleStatusBarStyle = appleStatusBarStyle.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], loadManifestWithCredentials = loadManifestWithCredentials.asInstanceOf[js.Any], logging = logging.asInstanceOf[js.Any], manifestRelativePaths = manifestRelativePaths.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pipeHTML = pipeHTML.asInstanceOf[js.Any], pixel_art = pixel_art.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], start_url = start_url.asInstanceOf[js.Any], theme_color = theme_color.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], appDescription = appDescription.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], appShortName = appShortName.asInstanceOf[js.Any], developerName = developerName.asInstanceOf[js.Any], developerURL = developerURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

