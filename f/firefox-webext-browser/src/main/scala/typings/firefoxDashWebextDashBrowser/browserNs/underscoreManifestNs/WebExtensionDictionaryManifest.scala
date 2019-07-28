package typings.firefoxDashWebextDashBrowser.browserNs.underscoreManifestNs

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxDashWebextDashBrowser.Anon_Gecko
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a WebExtension dictionary manifest.json file */
trait WebExtensionDictionaryManifest extends js.Object {
  var applications: js.UndefOr[Anon_Gecko] = js.undefined
  var author: js.UndefOr[String] = js.undefined
  var browser_specific_settings: js.UndefOr[Anon_Gecko] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var dictionaries: StringDictionary[String]
  var homepage_url: js.UndefOr[String] = js.undefined
  var manifest_version: Double
  var name: String
  var short_name: js.UndefOr[String] = js.undefined
  var version: String
}

object WebExtensionDictionaryManifest {
  @scala.inline
  def apply(
    dictionaries: StringDictionary[String],
    manifest_version: Double,
    name: String,
    version: String,
    applications: Anon_Gecko = null,
    author: String = null,
    browser_specific_settings: Anon_Gecko = null,
    description: String = null,
    homepage_url: String = null,
    short_name: String = null
  ): WebExtensionDictionaryManifest = {
    val __obj = js.Dynamic.literal(dictionaries = dictionaries, manifest_version = manifest_version, name = name, version = version)
    if (applications != null) __obj.updateDynamic("applications")(applications)
    if (author != null) __obj.updateDynamic("author")(author)
    if (browser_specific_settings != null) __obj.updateDynamic("browser_specific_settings")(browser_specific_settings)
    if (description != null) __obj.updateDynamic("description")(description)
    if (homepage_url != null) __obj.updateDynamic("homepage_url")(homepage_url)
    if (short_name != null) __obj.updateDynamic("short_name")(short_name)
    __obj.asInstanceOf[WebExtensionDictionaryManifest]
  }
}

