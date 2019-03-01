package typings
package firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a WebExtension dictionary manifest.json file */
trait WebExtensionDictionaryManifest extends js.Object {
  var applications: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Gecko] = js.undefined
  var author: js.UndefOr[java.lang.String] = js.undefined
  var browser_specific_settings: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Gecko] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var dictionaries: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var homepage_url: js.UndefOr[java.lang.String] = js.undefined
  var manifest_version: scala.Double
  var name: java.lang.String
  var short_name: js.UndefOr[java.lang.String] = js.undefined
  var version: java.lang.String
}

object WebExtensionDictionaryManifest {
  @scala.inline
  def apply(
    dictionaries: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    manifest_version: scala.Double,
    name: java.lang.String,
    version: java.lang.String,
    applications: firefoxDashWebextDashBrowserLib.Anon_Gecko = null,
    author: java.lang.String = null,
    browser_specific_settings: firefoxDashWebextDashBrowserLib.Anon_Gecko = null,
    description: java.lang.String = null,
    homepage_url: java.lang.String = null,
    short_name: java.lang.String = null
  ): WebExtensionDictionaryManifest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dictionaries")(dictionaries)
    __obj.updateDynamic("manifest_version")(manifest_version)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    if (applications != null) __obj.updateDynamic("applications")(applications)
    if (author != null) __obj.updateDynamic("author")(author)
    if (browser_specific_settings != null) __obj.updateDynamic("browser_specific_settings")(browser_specific_settings)
    if (description != null) __obj.updateDynamic("description")(description)
    if (homepage_url != null) __obj.updateDynamic("homepage_url")(homepage_url)
    if (short_name != null) __obj.updateDynamic("short_name")(short_name)
    __obj.asInstanceOf[WebExtensionDictionaryManifest]
  }
}

