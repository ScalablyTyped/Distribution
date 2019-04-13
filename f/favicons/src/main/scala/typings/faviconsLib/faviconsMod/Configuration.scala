package typings
package faviconsLib.faviconsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  /** Your application's description @default null */
  var appDescription: java.lang.String | scala.Null
  /** Your application's name @default null */
  var appName: java.lang.String | scala.Null
  /** Background colour for flattened icons @default "#fff" */
  var background: java.lang.String
  /** Your (or your developer's) name @default null */
  var developerName: java.lang.String | scala.Null
  /** Your (or your developer's) URL @default null */
  var developerURL: java.lang.String | scala.Null
  /** Primary text direction for name, short_name, and description @default "auto" */
  var dir: java.lang.String
  /** Preferred display mode: "fullscreen", "standalone", "minimal-ui" or "browser" @default "standalone" */
  var display: faviconsLib.faviconsLibStrings.fullscreen | faviconsLib.faviconsLibStrings.standalone | faviconsLib.faviconsLibStrings.`minimal-ui` | faviconsLib.faviconsLibStrings.browser
  /**
    * Platform Options:
    * - offset - offset in percentage
    * - background:
    *   * false - use default
    *   * true - force use default, e.g. set background for Android icons
    *   * color - set background for the specified icons
    */
  var icons: stdLib.Partial[faviconsLib.Anon_Android]
  /** Primary language for name and short_name @default "en-US */
  var lang: java.lang.String
  /** Print logs to console? @default false */
  var logging: scala.Boolean
  /** Default orientation: "any", "natural", "portrait" or "landscape" @default "any" */
  var orientation: faviconsLib.faviconsLibStrings.any | faviconsLib.faviconsLibStrings.natural | faviconsLib.faviconsLibStrings.portrait | faviconsLib.faviconsLibStrings.landscape
  /** Path for overriding default icons path @default "/" */
  var path: java.lang.String
  /** Use nearest neighbor resampling to preserve hard edges on pixel art @default false */
  var pixel_art: scala.Boolean
  /** Start URL when launching the application from a device @default "/?homescreen=1" */
  var start_url: java.lang.String
  /** Theme color user for example in Android's task switcher @default "#fff" */
  var theme_color: java.lang.String
  /** Your application's version string @default "1.0" */
  var version: java.lang.String
}

object Configuration {
  @scala.inline
  def apply(
    background: java.lang.String,
    dir: java.lang.String,
    display: faviconsLib.faviconsLibStrings.fullscreen | faviconsLib.faviconsLibStrings.standalone | faviconsLib.faviconsLibStrings.`minimal-ui` | faviconsLib.faviconsLibStrings.browser,
    icons: stdLib.Partial[faviconsLib.Anon_Android],
    lang: java.lang.String,
    logging: scala.Boolean,
    orientation: faviconsLib.faviconsLibStrings.any | faviconsLib.faviconsLibStrings.natural | faviconsLib.faviconsLibStrings.portrait | faviconsLib.faviconsLibStrings.landscape,
    path: java.lang.String,
    pixel_art: scala.Boolean,
    start_url: java.lang.String,
    theme_color: java.lang.String,
    version: java.lang.String,
    appDescription: java.lang.String = null,
    appName: java.lang.String = null,
    developerName: java.lang.String = null,
    developerURL: java.lang.String = null
  ): Configuration = {
    val __obj = js.Dynamic.literal(background = background, dir = dir, display = display.asInstanceOf[js.Any], icons = icons, lang = lang, logging = logging, orientation = orientation.asInstanceOf[js.Any], path = path, pixel_art = pixel_art, start_url = start_url, theme_color = theme_color, version = version)
    if (appDescription != null) __obj.updateDynamic("appDescription")(appDescription)
    if (appName != null) __obj.updateDynamic("appName")(appName)
    if (developerName != null) __obj.updateDynamic("developerName")(developerName)
    if (developerURL != null) __obj.updateDynamic("developerURL")(developerURL)
    __obj.asInstanceOf[Configuration]
  }
}

