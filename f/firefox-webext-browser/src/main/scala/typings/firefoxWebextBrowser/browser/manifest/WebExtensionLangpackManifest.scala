package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.anon.Basepath
import typings.firefoxWebextBrowser.anon.Chromeresources
import typings.firefoxWebextBrowser.anon.Edge
import typings.firefoxWebextBrowser.anon.Gecko
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a WebExtension language pack manifest.json file */
@js.native
trait WebExtensionLangpackManifest extends js.Object {
  var applications: js.UndefOr[Gecko] = js.native
  var author: js.UndefOr[String] = js.native
  var browser_specific_settings: js.UndefOr[Edge] = js.native
  var description: js.UndefOr[String] = js.native
  var homepage_url: js.UndefOr[String] = js.native
  var langpack_id: String = js.native
  var languages: StringDictionary[Chromeresources] = js.native
  var manifest_version: Double = js.native
  var name: String = js.native
  var short_name: js.UndefOr[String] = js.native
  var sources: js.UndefOr[StringDictionary[Basepath]] = js.native
  var version: String = js.native
}

object WebExtensionLangpackManifest {
  @scala.inline
  def apply(
    langpack_id: String,
    languages: StringDictionary[Chromeresources],
    manifest_version: Double,
    name: String,
    version: String
  ): WebExtensionLangpackManifest = {
    val __obj = js.Dynamic.literal(langpack_id = langpack_id.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionLangpackManifest]
  }
  @scala.inline
  implicit class WebExtensionLangpackManifestOps[Self <: WebExtensionLangpackManifest] (val x: Self) extends AnyVal {
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
    def setLangpack_id(value: String): Self = this.set("langpack_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguages(value: StringDictionary[Chromeresources]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def setManifest_version(value: Double): Self = this.set("manifest_version", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplications(value: Gecko): Self = this.set("applications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplications: Self = this.set("applications", js.undefined)
    @scala.inline
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setBrowser_specific_settings(value: Edge): Self = this.set("browser_specific_settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowser_specific_settings: Self = this.set("browser_specific_settings", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setHomepage_url(value: String): Self = this.set("homepage_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomepage_url: Self = this.set("homepage_url", js.undefined)
    @scala.inline
    def setShort_name(value: String): Self = this.set("short_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShort_name: Self = this.set("short_name", js.undefined)
    @scala.inline
    def setSources(value: StringDictionary[Basepath]): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
  }
  
}

