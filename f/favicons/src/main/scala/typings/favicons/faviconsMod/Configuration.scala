package typings.favicons.faviconsMod

import typings.favicons.Anon_Android
import typings.favicons.faviconsStrings.`minimal-ui`
import typings.favicons.faviconsStrings.any
import typings.favicons.faviconsStrings.browser
import typings.favicons.faviconsStrings.fullscreen
import typings.favicons.faviconsStrings.landscape
import typings.favicons.faviconsStrings.natural
import typings.favicons.faviconsStrings.portrait
import typings.favicons.faviconsStrings.standalone
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  /** Your application's description @default null */
  var appDescription: String | Null
  /** Your application's name @default null */
  var appName: String | Null
  /** Background colour for flattened icons @default "#fff" */
  var background: String
  /** Your (or your developer's) name @default null */
  var developerName: String | Null
  /** Your (or your developer's) URL @default null */
  var developerURL: String | Null
  /** Primary text direction for name, short_name, and description @default "auto" */
  var dir: String
  /** Preferred display mode: "fullscreen", "standalone", "minimal-ui" or "browser" @default "standalone" */
  var display: fullscreen | standalone | `minimal-ui` | browser
  /**
    * Platform Options:
    * - offset - offset in percentage
    * - background:
    *   * false - use default
    *   * true - force use default, e.g. set background for Android icons
    *   * color - set background for the specified icons
    */
  var icons: Partial[Anon_Android]
  /** Primary language for name and short_name @default "en-US */
  var lang: String
  /** Print logs to console? @default false */
  var logging: Boolean
  /** Default orientation: "any", "natural", "portrait" or "landscape" @default "any" */
  var orientation: any | natural | portrait | landscape
  /** Path for overriding default icons path @default "/" */
  var path: String
  /** Use nearest neighbor resampling to preserve hard edges on pixel art @default false */
  var pixel_art: Boolean
  /** Start URL when launching the application from a device @default "/?homescreen=1" */
  var start_url: String
  /** Theme color user for example in Android's task switcher @default "#fff" */
  var theme_color: String
  /** Your application's version string @default "1.0" */
  var version: String
}

object Configuration {
  @scala.inline
  def apply(
    background: String,
    dir: String,
    display: fullscreen | standalone | `minimal-ui` | browser,
    icons: Partial[Anon_Android],
    lang: String,
    logging: Boolean,
    orientation: any | natural | portrait | landscape,
    path: String,
    pixel_art: Boolean,
    start_url: String,
    theme_color: String,
    version: String,
    appDescription: String = null,
    appName: String = null,
    developerName: String = null,
    developerURL: String = null
  ): Configuration = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], logging = logging.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pixel_art = pixel_art.asInstanceOf[js.Any], start_url = start_url.asInstanceOf[js.Any], theme_color = theme_color.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (appDescription != null) __obj.updateDynamic("appDescription")(appDescription.asInstanceOf[js.Any])
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (developerName != null) __obj.updateDynamic("developerName")(developerName.asInstanceOf[js.Any])
    if (developerURL != null) __obj.updateDynamic("developerURL")(developerURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

