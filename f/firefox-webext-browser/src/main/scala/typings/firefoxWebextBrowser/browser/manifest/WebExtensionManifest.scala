package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.anon.Extensionpages
import typings.firefoxWebextBrowser.anon.Matches
import typings.firefoxWebextBrowser.anon.Page
import typings.firefoxWebextBrowser.anon.Persistent
import typings.firefoxWebextBrowser.anon.Serviceworker
import typings.firefoxWebextBrowser.browser.experiments.ExperimentAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a WebExtension manifest.json file */
trait WebExtensionManifest extends StObject {
  
  /** Needs at least manifest version 3. */
  var action: js.UndefOr[ActionManifest] = js.undefined
  
  var applications: js.UndefOr[WebExtensionManifestApplications] = js.undefined
  
  var author: js.UndefOr[String] = js.undefined
  
  var background: js.UndefOr[Page | Persistent | Serviceworker] = js.undefined
  
  /** Not supported on manifest versions above 2. */
  var browser_action: js.UndefOr[ActionManifest] = js.undefined
  
  var browser_specific_settings: js.UndefOr[WebExtensionManifestBrowserSpecificSettings] = js.undefined
  
  var chrome_settings_overrides: js.UndefOr[WebExtensionManifestChromeSettingsOverrides] = js.undefined
  
  var chrome_url_overrides: js.UndefOr[WebExtensionManifestChromeUrlOverrides] = js.undefined
  
  var commands: js.UndefOr[StringDictionary[WebExtensionManifestCommands]] = js.undefined
  
  var content_scripts: js.UndefOr[js.Array[ContentScript]] = js.undefined
  
  var content_security_policy: js.UndefOr[String | Extensionpages] = js.undefined
  
  var default_locale: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var developer: js.UndefOr[WebExtensionManifestDeveloper] = js.undefined
  
  var devtools_page: js.UndefOr[ExtensionURL] = js.undefined
  
  var experiment_apis: js.UndefOr[StringDictionary[ExperimentAPI]] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var homepage_url: js.UndefOr[String] = js.undefined
  
  /** Needs at least manifest version 3. */
  var host_permissions: js.UndefOr[js.Array[MatchPattern]] = js.undefined
  
  var icons: js.UndefOr[WebExtensionManifestIcons] = js.undefined
  
  var incognito: js.UndefOr[WebExtensionManifestIncognito] = js.undefined
  
  var l10n_resources: js.UndefOr[js.Array[String]] = js.undefined
  
  var manifest_version: Double
  
  var minimum_chrome_version: js.UndefOr[String] = js.undefined
  
  var minimum_opera_version: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var omnibox: js.UndefOr[WebExtensionManifestOmnibox] = js.undefined
  
  var optional_permissions: js.UndefOr[js.Array[OptionalPermissionOrOrigin]] = js.undefined
  
  var options_ui: js.UndefOr[WebExtensionManifestOptionsUi] = js.undefined
  
  var page_action: js.UndefOr[WebExtensionManifestPageAction] = js.undefined
  
  var permissions: js.UndefOr[js.Array[Permission | PermissionOrOrigin]] = js.undefined
  
  /** A list of protocol handler definitions. */
  var protocol_handlers: js.UndefOr[js.Array[ProtocolHandler]] = js.undefined
  
  var short_name: js.UndefOr[String] = js.undefined
  
  var sidebar_action: js.UndefOr[WebExtensionManifestSidebarAction] = js.undefined
  
  var telemetry: js.UndefOr[WebExtensionManifestTelemetry] = js.undefined
  
  var theme_experiment: js.UndefOr[ThemeExperiment] = js.undefined
  
  var user_scripts: js.UndefOr[WebExtensionManifestUserScripts] = js.undefined
  
  var version: String
  
  var web_accessible_resources: js.UndefOr[js.Array[Matches | String]] = js.undefined
}
object WebExtensionManifest {
  
  inline def apply(manifest_version: Double, name: String, version: String): WebExtensionManifest = {
    val __obj = js.Dynamic.literal(manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifest]
  }
  
  extension [Self <: WebExtensionManifest](x: Self) {
    
    inline def setAction(value: ActionManifest): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setApplications(value: WebExtensionManifestApplications): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setBackground(value: Page | Persistent | Serviceworker): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBrowser_action(value: ActionManifest): Self = StObject.set(x, "browser_action", value.asInstanceOf[js.Any])
    
    inline def setBrowser_actionUndefined: Self = StObject.set(x, "browser_action", js.undefined)
    
    inline def setBrowser_specific_settings(value: WebExtensionManifestBrowserSpecificSettings): Self = StObject.set(x, "browser_specific_settings", value.asInstanceOf[js.Any])
    
    inline def setBrowser_specific_settingsUndefined: Self = StObject.set(x, "browser_specific_settings", js.undefined)
    
    inline def setChrome_settings_overrides(value: WebExtensionManifestChromeSettingsOverrides): Self = StObject.set(x, "chrome_settings_overrides", value.asInstanceOf[js.Any])
    
    inline def setChrome_settings_overridesUndefined: Self = StObject.set(x, "chrome_settings_overrides", js.undefined)
    
    inline def setChrome_url_overrides(value: WebExtensionManifestChromeUrlOverrides): Self = StObject.set(x, "chrome_url_overrides", value.asInstanceOf[js.Any])
    
    inline def setChrome_url_overridesUndefined: Self = StObject.set(x, "chrome_url_overrides", js.undefined)
    
    inline def setCommands(value: StringDictionary[WebExtensionManifestCommands]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setContent_scripts(value: js.Array[ContentScript]): Self = StObject.set(x, "content_scripts", value.asInstanceOf[js.Any])
    
    inline def setContent_scriptsUndefined: Self = StObject.set(x, "content_scripts", js.undefined)
    
    inline def setContent_scriptsVarargs(value: ContentScript*): Self = StObject.set(x, "content_scripts", js.Array(value*))
    
    inline def setContent_security_policy(value: String | Extensionpages): Self = StObject.set(x, "content_security_policy", value.asInstanceOf[js.Any])
    
    inline def setContent_security_policyUndefined: Self = StObject.set(x, "content_security_policy", js.undefined)
    
    inline def setDefault_locale(value: String): Self = StObject.set(x, "default_locale", value.asInstanceOf[js.Any])
    
    inline def setDefault_localeUndefined: Self = StObject.set(x, "default_locale", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDeveloper(value: WebExtensionManifestDeveloper): Self = StObject.set(x, "developer", value.asInstanceOf[js.Any])
    
    inline def setDeveloperUndefined: Self = StObject.set(x, "developer", js.undefined)
    
    inline def setDevtools_page(value: ExtensionURL): Self = StObject.set(x, "devtools_page", value.asInstanceOf[js.Any])
    
    inline def setDevtools_pageUndefined: Self = StObject.set(x, "devtools_page", js.undefined)
    
    inline def setExperiment_apis(value: StringDictionary[ExperimentAPI]): Self = StObject.set(x, "experiment_apis", value.asInstanceOf[js.Any])
    
    inline def setExperiment_apisUndefined: Self = StObject.set(x, "experiment_apis", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHomepage_url(value: String): Self = StObject.set(x, "homepage_url", value.asInstanceOf[js.Any])
    
    inline def setHomepage_urlUndefined: Self = StObject.set(x, "homepage_url", js.undefined)
    
    inline def setHost_permissions(value: js.Array[MatchPattern]): Self = StObject.set(x, "host_permissions", value.asInstanceOf[js.Any])
    
    inline def setHost_permissionsUndefined: Self = StObject.set(x, "host_permissions", js.undefined)
    
    inline def setHost_permissionsVarargs(value: MatchPattern*): Self = StObject.set(x, "host_permissions", js.Array(value*))
    
    inline def setIcons(value: WebExtensionManifestIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setIncognito(value: WebExtensionManifestIncognito): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
    
    inline def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
    
    inline def setL10n_resources(value: js.Array[String]): Self = StObject.set(x, "l10n_resources", value.asInstanceOf[js.Any])
    
    inline def setL10n_resourcesUndefined: Self = StObject.set(x, "l10n_resources", js.undefined)
    
    inline def setL10n_resourcesVarargs(value: String*): Self = StObject.set(x, "l10n_resources", js.Array(value*))
    
    inline def setManifest_version(value: Double): Self = StObject.set(x, "manifest_version", value.asInstanceOf[js.Any])
    
    inline def setMinimum_chrome_version(value: String): Self = StObject.set(x, "minimum_chrome_version", value.asInstanceOf[js.Any])
    
    inline def setMinimum_chrome_versionUndefined: Self = StObject.set(x, "minimum_chrome_version", js.undefined)
    
    inline def setMinimum_opera_version(value: String): Self = StObject.set(x, "minimum_opera_version", value.asInstanceOf[js.Any])
    
    inline def setMinimum_opera_versionUndefined: Self = StObject.set(x, "minimum_opera_version", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOmnibox(value: WebExtensionManifestOmnibox): Self = StObject.set(x, "omnibox", value.asInstanceOf[js.Any])
    
    inline def setOmniboxUndefined: Self = StObject.set(x, "omnibox", js.undefined)
    
    inline def setOptional_permissions(value: js.Array[OptionalPermissionOrOrigin]): Self = StObject.set(x, "optional_permissions", value.asInstanceOf[js.Any])
    
    inline def setOptional_permissionsUndefined: Self = StObject.set(x, "optional_permissions", js.undefined)
    
    inline def setOptional_permissionsVarargs(value: OptionalPermissionOrOrigin*): Self = StObject.set(x, "optional_permissions", js.Array(value*))
    
    inline def setOptions_ui(value: WebExtensionManifestOptionsUi): Self = StObject.set(x, "options_ui", value.asInstanceOf[js.Any])
    
    inline def setOptions_uiUndefined: Self = StObject.set(x, "options_ui", js.undefined)
    
    inline def setPage_action(value: WebExtensionManifestPageAction): Self = StObject.set(x, "page_action", value.asInstanceOf[js.Any])
    
    inline def setPage_actionUndefined: Self = StObject.set(x, "page_action", js.undefined)
    
    inline def setPermissions(value: js.Array[Permission | PermissionOrOrigin]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: (Permission | PermissionOrOrigin)*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setProtocol_handlers(value: js.Array[ProtocolHandler]): Self = StObject.set(x, "protocol_handlers", value.asInstanceOf[js.Any])
    
    inline def setProtocol_handlersUndefined: Self = StObject.set(x, "protocol_handlers", js.undefined)
    
    inline def setProtocol_handlersVarargs(value: ProtocolHandler*): Self = StObject.set(x, "protocol_handlers", js.Array(value*))
    
    inline def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    
    inline def setShort_nameUndefined: Self = StObject.set(x, "short_name", js.undefined)
    
    inline def setSidebar_action(value: WebExtensionManifestSidebarAction): Self = StObject.set(x, "sidebar_action", value.asInstanceOf[js.Any])
    
    inline def setSidebar_actionUndefined: Self = StObject.set(x, "sidebar_action", js.undefined)
    
    inline def setTelemetry(value: WebExtensionManifestTelemetry): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
    
    inline def setTelemetryUndefined: Self = StObject.set(x, "telemetry", js.undefined)
    
    inline def setTheme_experiment(value: ThemeExperiment): Self = StObject.set(x, "theme_experiment", value.asInstanceOf[js.Any])
    
    inline def setTheme_experimentUndefined: Self = StObject.set(x, "theme_experiment", js.undefined)
    
    inline def setUser_scripts(value: WebExtensionManifestUserScripts): Self = StObject.set(x, "user_scripts", value.asInstanceOf[js.Any])
    
    inline def setUser_scriptsUndefined: Self = StObject.set(x, "user_scripts", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setWeb_accessible_resources(value: js.Array[Matches | String]): Self = StObject.set(x, "web_accessible_resources", value.asInstanceOf[js.Any])
    
    inline def setWeb_accessible_resourcesUndefined: Self = StObject.set(x, "web_accessible_resources", js.undefined)
    
    inline def setWeb_accessible_resourcesVarargs(value: (Matches | String)*): Self = StObject.set(x, "web_accessible_resources", js.Array(value*))
  }
}
