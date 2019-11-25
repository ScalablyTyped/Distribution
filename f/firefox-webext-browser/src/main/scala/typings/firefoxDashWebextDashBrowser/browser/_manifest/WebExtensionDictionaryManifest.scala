package typings.firefoxDashWebextDashBrowser.browser._manifest

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxDashWebextDashBrowser.Anon_Edge
import typings.firefoxDashWebextDashBrowser.Anon_Gecko
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a WebExtension dictionary manifest.json file */
trait WebExtensionDictionaryManifest extends js.Object {
  var applications: js.UndefOr[Anon_Gecko] = js.undefined
  var author: js.UndefOr[String] = js.undefined
  var browser_specific_settings: js.UndefOr[Anon_Edge] = js.undefined
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
    browser_specific_settings: Anon_Edge = null,
    description: String = null,
    homepage_url: String = null,
    short_name: String = null
  ): WebExtensionDictionaryManifest = {
    val __obj = js.Dynamic.literal(dictionaries = dictionaries.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (applications != null) __obj.updateDynamic("applications")(applications.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (browser_specific_settings != null) __obj.updateDynamic("browser_specific_settings")(browser_specific_settings.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (homepage_url != null) __obj.updateDynamic("homepage_url")(homepage_url.asInstanceOf[js.Any])
    if (short_name != null) __obj.updateDynamic("short_name")(short_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionDictionaryManifest]
  }
}

