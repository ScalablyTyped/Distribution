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
trait WebExtensionLangpackManifest extends js.Object {
  var applications: js.UndefOr[Gecko] = js.undefined
  var author: js.UndefOr[String] = js.undefined
  var browser_specific_settings: js.UndefOr[Edge] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var homepage_url: js.UndefOr[String] = js.undefined
  var langpack_id: String
  var languages: StringDictionary[Chromeresources]
  var manifest_version: Double
  var name: String
  var short_name: js.UndefOr[String] = js.undefined
  var sources: js.UndefOr[StringDictionary[Basepath]] = js.undefined
  var version: String
}

object WebExtensionLangpackManifest {
  @scala.inline
  def apply(
    langpack_id: String,
    languages: StringDictionary[Chromeresources],
    manifest_version: Double,
    name: String,
    version: String,
    applications: Gecko = null,
    author: String = null,
    browser_specific_settings: Edge = null,
    description: String = null,
    homepage_url: String = null,
    short_name: String = null,
    sources: StringDictionary[Basepath] = null
  ): WebExtensionLangpackManifest = {
    val __obj = js.Dynamic.literal(langpack_id = langpack_id.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (applications != null) __obj.updateDynamic("applications")(applications.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (browser_specific_settings != null) __obj.updateDynamic("browser_specific_settings")(browser_specific_settings.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (homepage_url != null) __obj.updateDynamic("homepage_url")(homepage_url.asInstanceOf[js.Any])
    if (short_name != null) __obj.updateDynamic("short_name")(short_name.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionLangpackManifest]
  }
}

