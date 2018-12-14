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
    org.scalablytyped.runtime.StringDictionary[firefoxDashWebextDashBrowserLib.Anon_Paths]
  ] = js.undefined
  var version: java.lang.String
}

