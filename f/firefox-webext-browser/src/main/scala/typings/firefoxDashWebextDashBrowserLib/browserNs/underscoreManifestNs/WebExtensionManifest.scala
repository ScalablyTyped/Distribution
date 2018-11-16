package typings
package firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a WebExtension manifest.json file */

trait WebExtensionManifest extends js.Object {
  var applications: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Gecko] = js.undefined
  var author: js.UndefOr[java.lang.String] = js.undefined
  var background: js.UndefOr[
    firefoxDashWebextDashBrowserLib.Anon_Persistent | firefoxDashWebextDashBrowserLib.Anon_PersistentScripts
  ] = js.undefined
  var browser_action: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Defaultarea] = js.undefined
  var browser_specific_settings: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Gecko] = js.undefined
  var chrome_settings_overrides: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Homepage] = js.undefined
  var chrome_url_overrides: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Bookmarks] = js.undefined
  var commands: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Suggestedkey] = js.undefined
  var content_scripts: js.UndefOr[js.Array[ContentScript]] = js.undefined
  var content_security_policy: js.UndefOr[java.lang.String] = js.undefined
  var default_locale: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var developer: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_UrlName] = js.undefined
  var devtools_page: js.UndefOr[ExtensionURL] = js.undefined
  var experiment_apis: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.experimentsNs.ExperimentAPI] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var homepage_url: js.UndefOr[java.lang.String] = js.undefined
  var icons: js.UndefOr[ScalablyTyped.runtime.NumberDictionary[java.lang.String]] = js.undefined
  var incognito: js.UndefOr[_WebExtensionManifestIncognito] = js.undefined
  var manifest_version: scala.Double
  var minimum_chrome_version: js.UndefOr[java.lang.String] = js.undefined
  var minimum_opera_version: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var omnibox: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Keyword] = js.undefined
  var optional_permissions: js.UndefOr[js.Array[OptionalPermissionOrOrigin]] = js.undefined
  var options_ui: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Openintab] = js.undefined
  var page_action: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_DefaulttitleHidematches] = js.undefined
  var permissions: js.UndefOr[js.Array[PermissionOrOrigin]] = js.undefined
  /** A list of protocol handler definitions. */
  var protocol_handlers: js.UndefOr[js.Array[ProtocolHandler]] = js.undefined
  var short_name: js.UndefOr[java.lang.String] = js.undefined
  var sidebar_action: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Defaulttitle] = js.undefined
  var theme_experiment: js.UndefOr[ThemeExperiment] = js.undefined
  var version: java.lang.String
  var web_accessible_resources: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

