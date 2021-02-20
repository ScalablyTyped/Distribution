package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.anon.Contentscripts
import typings.firefoxWebextBrowser.anon.Page
import typings.firefoxWebextBrowser.anon.Persistent
import typings.firefoxWebextBrowser.anon.Serviceworker
import typings.firefoxWebextBrowser.browser.experiments.ExperimentAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a WebExtension manifest.json file */
@js.native
trait WebExtensionManifest extends StObject {
  
  var applications: js.UndefOr[WebExtensionManifestApplications] = js.native
  
  var author: js.UndefOr[String] = js.native
  
  var background: js.UndefOr[Page | Persistent | Serviceworker] = js.native
  
  var browser_action: js.UndefOr[WebExtensionManifestBrowserAction] = js.native
  
  var browser_specific_settings: js.UndefOr[WebExtensionManifestBrowserSpecificSettings] = js.native
  
  var chrome_settings_overrides: js.UndefOr[WebExtensionManifestChromeSettingsOverrides] = js.native
  
  var chrome_url_overrides: js.UndefOr[WebExtensionManifestChromeUrlOverrides] = js.native
  
  var commands: js.UndefOr[StringDictionary[WebExtensionManifestCommands]] = js.native
  
  var content_scripts: js.UndefOr[js.Array[ContentScript]] = js.native
  
  var content_security_policy: js.UndefOr[String | Contentscripts] = js.native
  
  var default_locale: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var developer: js.UndefOr[WebExtensionManifestDeveloper] = js.native
  
  var devtools_page: js.UndefOr[ExtensionURL] = js.native
  
  var experiment_apis: js.UndefOr[StringDictionary[ExperimentAPI]] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var homepage_url: js.UndefOr[String] = js.native
  
  var icons: js.UndefOr[WebExtensionManifestIcons] = js.native
  
  var incognito: js.UndefOr[WebExtensionManifestIncognito] = js.native
  
  var l10n_resources: js.UndefOr[js.Array[String]] = js.native
  
  var manifest_version: Double = js.native
  
  var minimum_chrome_version: js.UndefOr[String] = js.native
  
  var minimum_opera_version: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var omnibox: js.UndefOr[WebExtensionManifestOmnibox] = js.native
  
  var optional_permissions: js.UndefOr[js.Array[OptionalPermissionOrOrigin]] = js.native
  
  var options_ui: js.UndefOr[WebExtensionManifestOptionsUi] = js.native
  
  var page_action: js.UndefOr[WebExtensionManifestPageAction] = js.native
  
  var permissions: js.UndefOr[js.Array[PermissionOrOrigin]] = js.native
  
  /** A list of protocol handler definitions. */
  var protocol_handlers: js.UndefOr[js.Array[ProtocolHandler]] = js.native
  
  var short_name: js.UndefOr[String] = js.native
  
  var sidebar_action: js.UndefOr[WebExtensionManifestSidebarAction] = js.native
  
  var telemetry: js.UndefOr[WebExtensionManifestTelemetry] = js.native
  
  var theme_experiment: js.UndefOr[ThemeExperiment] = js.native
  
  var user_scripts: js.UndefOr[WebExtensionManifestUserScripts] = js.native
  
  var version: String = js.native
  
  var web_accessible_resources: js.UndefOr[js.Array[String]] = js.native
}
object WebExtensionManifest {
  
  @scala.inline
  def apply(manifest_version: Double, name: String, version: String): WebExtensionManifest = {
    val __obj = js.Dynamic.literal(manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifest]
  }
  
  @scala.inline
  implicit class WebExtensionManifestMutableBuilder[Self <: WebExtensionManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplications(value: WebExtensionManifestApplications): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setBackground(value: Page | Persistent | Serviceworker): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBrowser_action(value: WebExtensionManifestBrowserAction): Self = StObject.set(x, "browser_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser_actionUndefined: Self = StObject.set(x, "browser_action", js.undefined)
    
    @scala.inline
    def setBrowser_specific_settings(value: WebExtensionManifestBrowserSpecificSettings): Self = StObject.set(x, "browser_specific_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowser_specific_settingsUndefined: Self = StObject.set(x, "browser_specific_settings", js.undefined)
    
    @scala.inline
    def setChrome_settings_overrides(value: WebExtensionManifestChromeSettingsOverrides): Self = StObject.set(x, "chrome_settings_overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChrome_settings_overridesUndefined: Self = StObject.set(x, "chrome_settings_overrides", js.undefined)
    
    @scala.inline
    def setChrome_url_overrides(value: WebExtensionManifestChromeUrlOverrides): Self = StObject.set(x, "chrome_url_overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChrome_url_overridesUndefined: Self = StObject.set(x, "chrome_url_overrides", js.undefined)
    
    @scala.inline
    def setCommands(value: StringDictionary[WebExtensionManifestCommands]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    @scala.inline
    def setContent_scripts(value: js.Array[ContentScript]): Self = StObject.set(x, "content_scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_scriptsUndefined: Self = StObject.set(x, "content_scripts", js.undefined)
    
    @scala.inline
    def setContent_scriptsVarargs(value: ContentScript*): Self = StObject.set(x, "content_scripts", js.Array(value :_*))
    
    @scala.inline
    def setContent_security_policy(value: String | Contentscripts): Self = StObject.set(x, "content_security_policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_security_policyUndefined: Self = StObject.set(x, "content_security_policy", js.undefined)
    
    @scala.inline
    def setDefault_locale(value: String): Self = StObject.set(x, "default_locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_localeUndefined: Self = StObject.set(x, "default_locale", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDeveloper(value: WebExtensionManifestDeveloper): Self = StObject.set(x, "developer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperUndefined: Self = StObject.set(x, "developer", js.undefined)
    
    @scala.inline
    def setDevtools_page(value: ExtensionURL): Self = StObject.set(x, "devtools_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevtools_pageUndefined: Self = StObject.set(x, "devtools_page", js.undefined)
    
    @scala.inline
    def setExperiment_apis(value: StringDictionary[ExperimentAPI]): Self = StObject.set(x, "experiment_apis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperiment_apisUndefined: Self = StObject.set(x, "experiment_apis", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setHomepage_url(value: String): Self = StObject.set(x, "homepage_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomepage_urlUndefined: Self = StObject.set(x, "homepage_url", js.undefined)
    
    @scala.inline
    def setIcons(value: WebExtensionManifestIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setIncognito(value: WebExtensionManifestIncognito): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
    
    @scala.inline
    def setL10n_resources(value: js.Array[String]): Self = StObject.set(x, "l10n_resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL10n_resourcesUndefined: Self = StObject.set(x, "l10n_resources", js.undefined)
    
    @scala.inline
    def setL10n_resourcesVarargs(value: String*): Self = StObject.set(x, "l10n_resources", js.Array(value :_*))
    
    @scala.inline
    def setManifest_version(value: Double): Self = StObject.set(x, "manifest_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum_chrome_version(value: String): Self = StObject.set(x, "minimum_chrome_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum_chrome_versionUndefined: Self = StObject.set(x, "minimum_chrome_version", js.undefined)
    
    @scala.inline
    def setMinimum_opera_version(value: String): Self = StObject.set(x, "minimum_opera_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum_opera_versionUndefined: Self = StObject.set(x, "minimum_opera_version", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmnibox(value: WebExtensionManifestOmnibox): Self = StObject.set(x, "omnibox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmniboxUndefined: Self = StObject.set(x, "omnibox", js.undefined)
    
    @scala.inline
    def setOptional_permissions(value: js.Array[OptionalPermissionOrOrigin]): Self = StObject.set(x, "optional_permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional_permissionsUndefined: Self = StObject.set(x, "optional_permissions", js.undefined)
    
    @scala.inline
    def setOptional_permissionsVarargs(value: OptionalPermissionOrOrigin*): Self = StObject.set(x, "optional_permissions", js.Array(value :_*))
    
    @scala.inline
    def setOptions_ui(value: WebExtensionManifestOptionsUi): Self = StObject.set(x, "options_ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions_uiUndefined: Self = StObject.set(x, "options_ui", js.undefined)
    
    @scala.inline
    def setPage_action(value: WebExtensionManifestPageAction): Self = StObject.set(x, "page_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_actionUndefined: Self = StObject.set(x, "page_action", js.undefined)
    
    @scala.inline
    def setPermissions(value: js.Array[PermissionOrOrigin]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: PermissionOrOrigin*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setProtocol_handlers(value: js.Array[ProtocolHandler]): Self = StObject.set(x, "protocol_handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol_handlersUndefined: Self = StObject.set(x, "protocol_handlers", js.undefined)
    
    @scala.inline
    def setProtocol_handlersVarargs(value: ProtocolHandler*): Self = StObject.set(x, "protocol_handlers", js.Array(value :_*))
    
    @scala.inline
    def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_nameUndefined: Self = StObject.set(x, "short_name", js.undefined)
    
    @scala.inline
    def setSidebar_action(value: WebExtensionManifestSidebarAction): Self = StObject.set(x, "sidebar_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidebar_actionUndefined: Self = StObject.set(x, "sidebar_action", js.undefined)
    
    @scala.inline
    def setTelemetry(value: WebExtensionManifestTelemetry): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelemetryUndefined: Self = StObject.set(x, "telemetry", js.undefined)
    
    @scala.inline
    def setTheme_experiment(value: ThemeExperiment): Self = StObject.set(x, "theme_experiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme_experimentUndefined: Self = StObject.set(x, "theme_experiment", js.undefined)
    
    @scala.inline
    def setUser_scripts(value: WebExtensionManifestUserScripts): Self = StObject.set(x, "user_scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_scriptsUndefined: Self = StObject.set(x, "user_scripts", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeb_accessible_resources(value: js.Array[String]): Self = StObject.set(x, "web_accessible_resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeb_accessible_resourcesUndefined: Self = StObject.set(x, "web_accessible_resources", js.undefined)
    
    @scala.inline
    def setWeb_accessible_resourcesVarargs(value: String*): Self = StObject.set(x, "web_accessible_resources", js.Array(value :_*))
  }
}
