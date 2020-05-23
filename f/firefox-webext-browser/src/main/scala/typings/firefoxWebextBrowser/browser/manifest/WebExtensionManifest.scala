package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.anon.Apiscript
import typings.firefoxWebextBrowser.anon.Bookmarks
import typings.firefoxWebextBrowser.anon.Browserstyle
import typings.firefoxWebextBrowser.anon.Defaultarea
import typings.firefoxWebextBrowser.anon.Defaulticon
import typings.firefoxWebextBrowser.anon.Defaultpanel
import typings.firefoxWebextBrowser.anon.Edge
import typings.firefoxWebextBrowser.anon.Gecko
import typings.firefoxWebextBrowser.anon.Homepage
import typings.firefoxWebextBrowser.anon.Keyword
import typings.firefoxWebextBrowser.anon.NameUrl
import typings.firefoxWebextBrowser.anon.Page
import typings.firefoxWebextBrowser.anon.Persistent
import typings.firefoxWebextBrowser.anon.Suggestedkey
import typings.firefoxWebextBrowser.browser.experiments.ExperimentAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a WebExtension manifest.json file */
trait WebExtensionManifest extends js.Object {
  var applications: js.UndefOr[Gecko] = js.undefined
  var author: js.UndefOr[String] = js.undefined
  var background: js.UndefOr[Page | Persistent] = js.undefined
  var browser_action: js.UndefOr[Defaultarea] = js.undefined
  var browser_specific_settings: js.UndefOr[Edge] = js.undefined
  var chrome_settings_overrides: js.UndefOr[Homepage] = js.undefined
  var chrome_url_overrides: js.UndefOr[Bookmarks] = js.undefined
  var commands: js.UndefOr[StringDictionary[Suggestedkey]] = js.undefined
  var content_scripts: js.UndefOr[js.Array[ContentScript]] = js.undefined
  var content_security_policy: js.UndefOr[String] = js.undefined
  var default_locale: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var developer: js.UndefOr[NameUrl] = js.undefined
  var devtools_page: js.UndefOr[ExtensionURL] = js.undefined
  var experiment_apis: js.UndefOr[StringDictionary[ExperimentAPI]] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var homepage_url: js.UndefOr[String] = js.undefined
  var icons: js.UndefOr[NumberDictionary[ExtensionFileUrl]] = js.undefined
  var incognito: js.UndefOr[WebExtensionManifestIncognito] = js.undefined
  var manifest_version: Double
  var minimum_chrome_version: js.UndefOr[String] = js.undefined
  var minimum_opera_version: js.UndefOr[String] = js.undefined
  var name: String
  var omnibox: js.UndefOr[Keyword] = js.undefined
  var optional_permissions: js.UndefOr[js.Array[OptionalPermissionOrOrigin]] = js.undefined
  var options_ui: js.UndefOr[Browserstyle] = js.undefined
  var page_action: js.UndefOr[Defaulticon] = js.undefined
  var permissions: js.UndefOr[js.Array[PermissionOrOrigin]] = js.undefined
  /** A list of protocol handler definitions. */
  var protocol_handlers: js.UndefOr[js.Array[ProtocolHandler]] = js.undefined
  var short_name: js.UndefOr[String] = js.undefined
  var sidebar_action: js.UndefOr[Defaultpanel] = js.undefined
  var theme_experiment: js.UndefOr[ThemeExperiment] = js.undefined
  var user_scripts: js.UndefOr[Apiscript] = js.undefined
  var version: String
  var web_accessible_resources: js.UndefOr[js.Array[String]] = js.undefined
}

object WebExtensionManifest {
  @scala.inline
  def apply(
    manifest_version: Double,
    name: String,
    version: String,
    applications: Gecko = null,
    author: String = null,
    background: Page | Persistent = null,
    browser_action: Defaultarea = null,
    browser_specific_settings: Edge = null,
    chrome_settings_overrides: Homepage = null,
    chrome_url_overrides: Bookmarks = null,
    commands: StringDictionary[Suggestedkey] = null,
    content_scripts: js.Array[ContentScript] = null,
    content_security_policy: String = null,
    default_locale: String = null,
    description: String = null,
    developer: NameUrl = null,
    devtools_page: ExtensionURL = null,
    experiment_apis: StringDictionary[ExperimentAPI] = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    homepage_url: String = null,
    icons: NumberDictionary[ExtensionFileUrl] = null,
    incognito: WebExtensionManifestIncognito = null,
    minimum_chrome_version: String = null,
    minimum_opera_version: String = null,
    omnibox: Keyword = null,
    optional_permissions: js.Array[OptionalPermissionOrOrigin] = null,
    options_ui: Browserstyle = null,
    page_action: Defaulticon = null,
    permissions: js.Array[PermissionOrOrigin] = null,
    protocol_handlers: js.Array[ProtocolHandler] = null,
    short_name: String = null,
    sidebar_action: Defaultpanel = null,
    theme_experiment: ThemeExperiment = null,
    user_scripts: Apiscript = null,
    web_accessible_resources: js.Array[String] = null
  ): WebExtensionManifest = {
    val __obj = js.Dynamic.literal(manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (applications != null) __obj.updateDynamic("applications")(applications.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (browser_action != null) __obj.updateDynamic("browser_action")(browser_action.asInstanceOf[js.Any])
    if (browser_specific_settings != null) __obj.updateDynamic("browser_specific_settings")(browser_specific_settings.asInstanceOf[js.Any])
    if (chrome_settings_overrides != null) __obj.updateDynamic("chrome_settings_overrides")(chrome_settings_overrides.asInstanceOf[js.Any])
    if (chrome_url_overrides != null) __obj.updateDynamic("chrome_url_overrides")(chrome_url_overrides.asInstanceOf[js.Any])
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (content_scripts != null) __obj.updateDynamic("content_scripts")(content_scripts.asInstanceOf[js.Any])
    if (content_security_policy != null) __obj.updateDynamic("content_security_policy")(content_security_policy.asInstanceOf[js.Any])
    if (default_locale != null) __obj.updateDynamic("default_locale")(default_locale.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (developer != null) __obj.updateDynamic("developer")(developer.asInstanceOf[js.Any])
    if (devtools_page != null) __obj.updateDynamic("devtools_page")(devtools_page.asInstanceOf[js.Any])
    if (experiment_apis != null) __obj.updateDynamic("experiment_apis")(experiment_apis.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (homepage_url != null) __obj.updateDynamic("homepage_url")(homepage_url.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (incognito != null) __obj.updateDynamic("incognito")(incognito.asInstanceOf[js.Any])
    if (minimum_chrome_version != null) __obj.updateDynamic("minimum_chrome_version")(minimum_chrome_version.asInstanceOf[js.Any])
    if (minimum_opera_version != null) __obj.updateDynamic("minimum_opera_version")(minimum_opera_version.asInstanceOf[js.Any])
    if (omnibox != null) __obj.updateDynamic("omnibox")(omnibox.asInstanceOf[js.Any])
    if (optional_permissions != null) __obj.updateDynamic("optional_permissions")(optional_permissions.asInstanceOf[js.Any])
    if (options_ui != null) __obj.updateDynamic("options_ui")(options_ui.asInstanceOf[js.Any])
    if (page_action != null) __obj.updateDynamic("page_action")(page_action.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (protocol_handlers != null) __obj.updateDynamic("protocol_handlers")(protocol_handlers.asInstanceOf[js.Any])
    if (short_name != null) __obj.updateDynamic("short_name")(short_name.asInstanceOf[js.Any])
    if (sidebar_action != null) __obj.updateDynamic("sidebar_action")(sidebar_action.asInstanceOf[js.Any])
    if (theme_experiment != null) __obj.updateDynamic("theme_experiment")(theme_experiment.asInstanceOf[js.Any])
    if (user_scripts != null) __obj.updateDynamic("user_scripts")(user_scripts.asInstanceOf[js.Any])
    if (web_accessible_resources != null) __obj.updateDynamic("web_accessible_resources")(web_accessible_resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifest]
  }
}

