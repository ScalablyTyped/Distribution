package typings.firefoxDashWebextDashBrowser.browser._manifest

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxDashWebextDashBrowser.Anon_Basepath
import typings.firefoxDashWebextDashBrowser.Anon_Chromeresources
import typings.firefoxDashWebextDashBrowser.Anon_Gecko
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a WebExtension language pack manifest.json file */
trait WebExtensionLangpackManifest extends js.Object {
  var applications: js.UndefOr[Anon_Gecko] = js.undefined
  var author: js.UndefOr[String] = js.undefined
  var browser_specific_settings: js.UndefOr[Anon_Gecko] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var homepage_url: js.UndefOr[String] = js.undefined
  var langpack_id: String
  var languages: StringDictionary[Anon_Chromeresources]
  var manifest_version: Double
  var name: String
  var short_name: js.UndefOr[String] = js.undefined
  var sources: js.UndefOr[StringDictionary[Anon_Basepath]] = js.undefined
  var version: String
}

object WebExtensionLangpackManifest {
  @scala.inline
  def apply(
    langpack_id: String,
    languages: StringDictionary[Anon_Chromeresources],
    manifest_version: Double,
    name: String,
    version: String,
    applications: Anon_Gecko = null,
    author: String = null,
    browser_specific_settings: Anon_Gecko = null,
    description: String = null,
    homepage_url: String = null,
    short_name: String = null,
    sources: StringDictionary[Anon_Basepath] = null
  ): WebExtensionLangpackManifest = {
    val __obj = js.Dynamic.literal(langpack_id = langpack_id, languages = languages, manifest_version = manifest_version, name = name, version = version)
    if (applications != null) __obj.updateDynamic("applications")(applications)
    if (author != null) __obj.updateDynamic("author")(author)
    if (browser_specific_settings != null) __obj.updateDynamic("browser_specific_settings")(browser_specific_settings)
    if (description != null) __obj.updateDynamic("description")(description)
    if (homepage_url != null) __obj.updateDynamic("homepage_url")(homepage_url)
    if (short_name != null) __obj.updateDynamic("short_name")(short_name)
    if (sources != null) __obj.updateDynamic("sources")(sources)
    __obj.asInstanceOf[WebExtensionLangpackManifest]
  }
}

