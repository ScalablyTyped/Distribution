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

@js.native
trait Configuration extends js.Object {
  /** Your application's description @default null */
  var appDescription: String | Null = js.native
  /** Your application's name @default null */
  var appName: String | Null = js.native
  /** Your application's short_name. If not set, `appName` will be used @default null */
  var appShortName: String | Null = js.native
  /** Style for Apple status bar @default 'black-translucent' */
  var appleStatusBarStyle: `black-translucent` | default | black = js.native
  /** Background colour for flattened icons @default '#fff' */
  var background: String = js.native
  /** Your (or your developer's) name @default null */
  var developerName: String | Null = js.native
  /** Your (or your developer's) URL @default null */
  var developerURL: String | Null = js.native
  /** Primary text direction for name, short_name, and description @default 'auto' */
  var dir: String = js.native
  /** Preferred display mode: 'fullscreen', 'standalone', 'minimal-ui' or 'browser' @default 'standalone' */
  var display: fullscreen | standalone | `minimal-ui` | browser = js.native
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
  var icons: PartialandroidbooleanIcon = js.native
  /** Primary language for name and short_name @default 'en-US' */
  var lang: String = js.native
  /** Browsers don't send cookies when fetching a manifest, enable this to fix that @default false */
  var loadManifestWithCredentials: Boolean = js.native
  /** Print logs to console? @default false */
  var logging: Boolean = js.native
  /** Determines whether to set relative paths in manifests @default false */
  var manifestRelativePaths: Boolean = js.native
  /** Default orientation: 'any', 'natural', 'portrait' or 'landscape' @default 'any' */
  var orientation: any | natural | portrait | landscape = js.native
  /** Path for overriding default icons path @default '/' */
  var path: String = js.native
  /** Determines whether to allow piping html as a file @default false */
  var pipeHTML: Boolean = js.native
  /** Use nearest neighbor resampling to preserve hard edges on pixel art @default false */
  var pixel_art: Boolean = js.native
  /** Set of URLs that the browser considers within your app @default null */
  var scope: String = js.native
  /** Start URL when launching the application from a device @default '/?homescreen=1' */
  var start_url: String = js.native
  /** Theme color user for example in Android's task switcher @default '#fff' */
  var theme_color: String = js.native
  /** Your application's version string @default '1.0' */
  var version: String = js.native
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
    version: String
  ): Configuration = {
    val __obj = js.Dynamic.literal(appleStatusBarStyle = appleStatusBarStyle.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], loadManifestWithCredentials = loadManifestWithCredentials.asInstanceOf[js.Any], logging = logging.asInstanceOf[js.Any], manifestRelativePaths = manifestRelativePaths.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pipeHTML = pipeHTML.asInstanceOf[js.Any], pixel_art = pixel_art.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], start_url = start_url.asInstanceOf[js.Any], theme_color = theme_color.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppleStatusBarStyle(value: `black-translucent` | default | black): Self = this.set("appleStatusBarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay(value: fullscreen | standalone | `minimal-ui` | browser): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcons(value: PartialandroidbooleanIcon): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadManifestWithCredentials(value: Boolean): Self = this.set("loadManifestWithCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogging(value: Boolean): Self = this.set("logging", value.asInstanceOf[js.Any])
    @scala.inline
    def setManifestRelativePaths(value: Boolean): Self = this.set("manifestRelativePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: any | natural | portrait | landscape): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPipeHTML(value: Boolean): Self = this.set("pipeHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixel_art(value: Boolean): Self = this.set("pixel_art", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart_url(value: String): Self = this.set("start_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setTheme_color(value: String): Self = this.set("theme_color", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppDescription(value: String): Self = this.set("appDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppDescriptionNull: Self = this.set("appDescription", null)
    @scala.inline
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppNameNull: Self = this.set("appName", null)
    @scala.inline
    def setAppShortName(value: String): Self = this.set("appShortName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppShortNameNull: Self = this.set("appShortName", null)
    @scala.inline
    def setDeveloperName(value: String): Self = this.set("developerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeveloperNameNull: Self = this.set("developerName", null)
    @scala.inline
    def setDeveloperURL(value: String): Self = this.set("developerURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeveloperURLNull: Self = this.set("developerURL", null)
  }
  
}

