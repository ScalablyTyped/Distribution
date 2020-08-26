package typings.faviconsWebpackPlugin.anon

import typings.favicons.anon.PartialandroidbooleanIcon
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
@js.native
trait PartialConfiguration extends js.Object {
  var appDescription: js.UndefOr[String | Null] = js.native
  var appName: js.UndefOr[String | Null] = js.native
  var appShortName: js.UndefOr[String | Null] = js.native
  var appleStatusBarStyle: js.UndefOr[`black-translucent` | default | black] = js.native
  var background: js.UndefOr[String] = js.native
  var developerName: js.UndefOr[String | Null] = js.native
  var developerURL: js.UndefOr[String | Null] = js.native
  var dir: js.UndefOr[String] = js.native
  var display: js.UndefOr[fullscreen | standalone | `minimal-ui` | browser] = js.native
  var icons: js.UndefOr[PartialandroidbooleanIcon] = js.native
  var lang: js.UndefOr[String] = js.native
  var loadManifestWithCredentials: js.UndefOr[Boolean] = js.native
  var logging: js.UndefOr[Boolean] = js.native
  var manifestRelativePaths: js.UndefOr[Boolean] = js.native
  var orientation: js.UndefOr[any | natural | portrait | landscape] = js.native
  var path: js.UndefOr[String] = js.native
  var pipeHTML: js.UndefOr[Boolean] = js.native
  var pixel_art: js.UndefOr[Boolean] = js.native
  var scope: js.UndefOr[String] = js.native
  var start_url: js.UndefOr[String] = js.native
  var theme_color: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object PartialConfiguration {
  @scala.inline
  def apply(): PartialConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfiguration]
  }
  @scala.inline
  implicit class PartialConfigurationOps[Self <: PartialConfiguration] (val x: Self) extends AnyVal {
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
    def setAppDescription(value: String): Self = this.set("appDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppDescription: Self = this.set("appDescription", js.undefined)
    @scala.inline
    def setAppDescriptionNull: Self = this.set("appDescription", null)
    @scala.inline
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppName: Self = this.set("appName", js.undefined)
    @scala.inline
    def setAppNameNull: Self = this.set("appName", null)
    @scala.inline
    def setAppShortName(value: String): Self = this.set("appShortName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppShortName: Self = this.set("appShortName", js.undefined)
    @scala.inline
    def setAppShortNameNull: Self = this.set("appShortName", null)
    @scala.inline
    def setAppleStatusBarStyle(value: `black-translucent` | default | black): Self = this.set("appleStatusBarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppleStatusBarStyle: Self = this.set("appleStatusBarStyle", js.undefined)
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setDeveloperName(value: String): Self = this.set("developerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloperName: Self = this.set("developerName", js.undefined)
    @scala.inline
    def setDeveloperNameNull: Self = this.set("developerName", null)
    @scala.inline
    def setDeveloperURL(value: String): Self = this.set("developerURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloperURL: Self = this.set("developerURL", js.undefined)
    @scala.inline
    def setDeveloperURLNull: Self = this.set("developerURL", null)
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setDisplay(value: fullscreen | standalone | `minimal-ui` | browser): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setIcons(value: PartialandroidbooleanIcon): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setLoadManifestWithCredentials(value: Boolean): Self = this.set("loadManifestWithCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadManifestWithCredentials: Self = this.set("loadManifestWithCredentials", js.undefined)
    @scala.inline
    def setLogging(value: Boolean): Self = this.set("logging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    @scala.inline
    def setManifestRelativePaths(value: Boolean): Self = this.set("manifestRelativePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifestRelativePaths: Self = this.set("manifestRelativePaths", js.undefined)
    @scala.inline
    def setOrientation(value: any | natural | portrait | landscape): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPipeHTML(value: Boolean): Self = this.set("pipeHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipeHTML: Self = this.set("pipeHTML", js.undefined)
    @scala.inline
    def setPixel_art(value: Boolean): Self = this.set("pixel_art", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixel_art: Self = this.set("pixel_art", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setStart_url(value: String): Self = this.set("start_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_url: Self = this.set("start_url", js.undefined)
    @scala.inline
    def setTheme_color(value: String): Self = this.set("theme_color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme_color: Self = this.set("theme_color", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

