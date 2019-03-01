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
    firefoxDashWebextDashBrowserLib.Anon_Page | firefoxDashWebextDashBrowserLib.Anon_Persistent
  ] = js.undefined
  var browser_action: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_BrowserstyleDefaultarea] = js.undefined
  var browser_specific_settings: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Gecko] = js.undefined
  var chrome_settings_overrides: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Homepage] = js.undefined
  var chrome_url_overrides: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Bookmarks] = js.undefined
  var commands: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_DescriptionSuggestedkey] = js.undefined
  var content_scripts: js.UndefOr[js.Array[ContentScript]] = js.undefined
  var content_security_policy: js.UndefOr[java.lang.String] = js.undefined
  var default_locale: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var developer: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_NameUrl] = js.undefined
  var devtools_page: js.UndefOr[ExtensionURL] = js.undefined
  var experiment_apis: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.experimentsNs.ExperimentAPI] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var homepage_url: js.UndefOr[java.lang.String] = js.undefined
  var icons: js.UndefOr[org.scalablytyped.runtime.NumberDictionary[java.lang.String]] = js.undefined
  var incognito: js.UndefOr[_WebExtensionManifestIncognito] = js.undefined
  var manifest_version: scala.Double
  var minimum_chrome_version: js.UndefOr[java.lang.String] = js.undefined
  var minimum_opera_version: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var omnibox: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Keyword] = js.undefined
  var optional_permissions: js.UndefOr[js.Array[OptionalPermissionOrOrigin]] = js.undefined
  var options_ui: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Browserstyle] = js.undefined
  var page_action: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_BrowserstyleDefaulticon] = js.undefined
  var permissions: js.UndefOr[js.Array[PermissionOrOrigin]] = js.undefined
  /** A list of protocol handler definitions. */
  var protocol_handlers: js.UndefOr[js.Array[ProtocolHandler]] = js.undefined
  var short_name: js.UndefOr[java.lang.String] = js.undefined
  var sidebar_action: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_BrowserstyleDefaulticonDefaultpanel] = js.undefined
  var theme_experiment: js.UndefOr[ThemeExperiment] = js.undefined
  var user_scripts: js.UndefOr[firefoxDashWebextDashBrowserLib.Anon_Apiscript] = js.undefined
  var version: java.lang.String
  var web_accessible_resources: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object WebExtensionManifest {
  @scala.inline
  def apply(
    manifest_version: scala.Double,
    name: java.lang.String,
    version: java.lang.String,
    applications: firefoxDashWebextDashBrowserLib.Anon_Gecko = null,
    author: java.lang.String = null,
    background: firefoxDashWebextDashBrowserLib.Anon_Page | firefoxDashWebextDashBrowserLib.Anon_Persistent = null,
    browser_action: firefoxDashWebextDashBrowserLib.Anon_BrowserstyleDefaultarea = null,
    browser_specific_settings: firefoxDashWebextDashBrowserLib.Anon_Gecko = null,
    chrome_settings_overrides: firefoxDashWebextDashBrowserLib.Anon_Homepage = null,
    chrome_url_overrides: firefoxDashWebextDashBrowserLib.Anon_Bookmarks = null,
    commands: firefoxDashWebextDashBrowserLib.Anon_DescriptionSuggestedkey = null,
    content_scripts: js.Array[ContentScript] = null,
    content_security_policy: java.lang.String = null,
    default_locale: java.lang.String = null,
    description: java.lang.String = null,
    developer: firefoxDashWebextDashBrowserLib.Anon_NameUrl = null,
    devtools_page: ExtensionURL = null,
    experiment_apis: firefoxDashWebextDashBrowserLib.browserNs.experimentsNs.ExperimentAPI = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    homepage_url: java.lang.String = null,
    icons: org.scalablytyped.runtime.NumberDictionary[java.lang.String] = null,
    incognito: _WebExtensionManifestIncognito = null,
    minimum_chrome_version: java.lang.String = null,
    minimum_opera_version: java.lang.String = null,
    omnibox: firefoxDashWebextDashBrowserLib.Anon_Keyword = null,
    optional_permissions: js.Array[OptionalPermissionOrOrigin] = null,
    options_ui: firefoxDashWebextDashBrowserLib.Anon_Browserstyle = null,
    page_action: firefoxDashWebextDashBrowserLib.Anon_BrowserstyleDefaulticon = null,
    permissions: js.Array[PermissionOrOrigin] = null,
    protocol_handlers: js.Array[ProtocolHandler] = null,
    short_name: java.lang.String = null,
    sidebar_action: firefoxDashWebextDashBrowserLib.Anon_BrowserstyleDefaulticonDefaultpanel = null,
    theme_experiment: ThemeExperiment = null,
    user_scripts: firefoxDashWebextDashBrowserLib.Anon_Apiscript = null,
    web_accessible_resources: js.Array[java.lang.String] = null
  ): WebExtensionManifest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("manifest_version")(manifest_version)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    if (applications != null) __obj.updateDynamic("applications")(applications)
    if (author != null) __obj.updateDynamic("author")(author)
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (browser_action != null) __obj.updateDynamic("browser_action")(browser_action)
    if (browser_specific_settings != null) __obj.updateDynamic("browser_specific_settings")(browser_specific_settings)
    if (chrome_settings_overrides != null) __obj.updateDynamic("chrome_settings_overrides")(chrome_settings_overrides)
    if (chrome_url_overrides != null) __obj.updateDynamic("chrome_url_overrides")(chrome_url_overrides)
    if (commands != null) __obj.updateDynamic("commands")(commands)
    if (content_scripts != null) __obj.updateDynamic("content_scripts")(content_scripts)
    if (content_security_policy != null) __obj.updateDynamic("content_security_policy")(content_security_policy)
    if (default_locale != null) __obj.updateDynamic("default_locale")(default_locale)
    if (description != null) __obj.updateDynamic("description")(description)
    if (developer != null) __obj.updateDynamic("developer")(developer)
    if (devtools_page != null) __obj.updateDynamic("devtools_page")(devtools_page)
    if (experiment_apis != null) __obj.updateDynamic("experiment_apis")(experiment_apis)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (homepage_url != null) __obj.updateDynamic("homepage_url")(homepage_url)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (incognito != null) __obj.updateDynamic("incognito")(incognito)
    if (minimum_chrome_version != null) __obj.updateDynamic("minimum_chrome_version")(minimum_chrome_version)
    if (minimum_opera_version != null) __obj.updateDynamic("minimum_opera_version")(minimum_opera_version)
    if (omnibox != null) __obj.updateDynamic("omnibox")(omnibox)
    if (optional_permissions != null) __obj.updateDynamic("optional_permissions")(optional_permissions)
    if (options_ui != null) __obj.updateDynamic("options_ui")(options_ui)
    if (page_action != null) __obj.updateDynamic("page_action")(page_action)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    if (protocol_handlers != null) __obj.updateDynamic("protocol_handlers")(protocol_handlers)
    if (short_name != null) __obj.updateDynamic("short_name")(short_name)
    if (sidebar_action != null) __obj.updateDynamic("sidebar_action")(sidebar_action)
    if (theme_experiment != null) __obj.updateDynamic("theme_experiment")(theme_experiment)
    if (user_scripts != null) __obj.updateDynamic("user_scripts")(user_scripts)
    if (web_accessible_resources != null) __obj.updateDynamic("web_accessible_resources")(web_accessible_resources)
    __obj.asInstanceOf[WebExtensionManifest]
  }
}

