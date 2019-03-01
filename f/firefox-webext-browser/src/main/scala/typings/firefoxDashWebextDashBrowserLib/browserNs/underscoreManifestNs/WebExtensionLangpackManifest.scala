package typings
package firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a WebExtension language pack manifest.json file */
trait WebExtensionLangpackManifest extends js.Object {
  var applications: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Gecko] = js.undefined
  var author: js.UndefOr[java.lang.String] = js.undefined
  var browser_specific_settings: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Gecko] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var homepage_url: js.UndefOr[java.lang.String] = js.undefined
  var langpack_id: java.lang.String
  var languages: org.scalablytyped.runtime.StringDictionary[firefoxDashWebextDashBrowserLib.Anon_Chromeresources]
  var manifest_version: scala.Double
  var name: java.lang.String
  var short_name: js.UndefOr[java.lang.String] = js.undefined
  var sources: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[firefoxDashWebextDashBrowserLib.Anon_Basepath]
  ] = js.undefined
  var version: java.lang.String
}

object WebExtensionLangpackManifest {
  @scala.inline
  def apply(
    langpack_id: java.lang.String,
    languages: org.scalablytyped.runtime.StringDictionary[firefoxDashWebextDashBrowserLib.Anon_Chromeresources],
    manifest_version: scala.Double,
    name: java.lang.String,
    version: java.lang.String,
    applications: firefoxDashWebextDashBrowserLib.Anon_Gecko = null,
    author: java.lang.String = null,
    browser_specific_settings: firefoxDashWebextDashBrowserLib.Anon_Gecko = null,
    description: java.lang.String = null,
    homepage_url: java.lang.String = null,
    short_name: java.lang.String = null,
    sources: org.scalablytyped.runtime.StringDictionary[firefoxDashWebextDashBrowserLib.Anon_Basepath] = null
  ): WebExtensionLangpackManifest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("langpack_id")(langpack_id)
    __obj.updateDynamic("languages")(languages)
    __obj.updateDynamic("manifest_version")(manifest_version)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
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

