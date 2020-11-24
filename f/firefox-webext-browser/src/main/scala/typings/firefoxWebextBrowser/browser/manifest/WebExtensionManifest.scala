package typings.firefoxWebextBrowser.browser.manifest

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.anon.Contentscripts
import typings.firefoxWebextBrowser.anon.Page
import typings.firefoxWebextBrowser.anon.Persistent
import typings.firefoxWebextBrowser.anon.Serviceworker
import typings.firefoxWebextBrowser.browser.experiments.ExperimentAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a WebExtension manifest.json file */
@js.native
trait WebExtensionManifest extends js.Object {
  
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
  implicit class WebExtensionManifestOps[Self <: WebExtensionManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setManifest_version(value: Double): Self = this.set("manifest_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplications(value: WebExtensionManifestApplications): Self = this.set("applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplications: Self = this.set("applications", js.undefined)
    
    @scala.inline
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    
    @scala.inline
    def setBackground(value: Page | Persistent | Serviceworker): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBrowser_action(value: WebExtensionManifestBrowserAction): Self = this.set("browser_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser_action: Self = this.set("browser_action", js.undefined)
    
    @scala.inline
    def setBrowser_specific_settings(value: WebExtensionManifestBrowserSpecificSettings): Self = this.set("browser_specific_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser_specific_settings: Self = this.set("browser_specific_settings", js.undefined)
    
    @scala.inline
    def setChrome_settings_overrides(value: WebExtensionManifestChromeSettingsOverrides): Self = this.set("chrome_settings_overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChrome_settings_overrides: Self = this.set("chrome_settings_overrides", js.undefined)
    
    @scala.inline
    def setChrome_url_overrides(value: WebExtensionManifestChromeUrlOverrides): Self = this.set("chrome_url_overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChrome_url_overrides: Self = this.set("chrome_url_overrides", js.undefined)
    
    @scala.inline
    def setCommands(value: StringDictionary[WebExtensionManifestCommands]): Self = this.set("commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
    
    @scala.inline
    def setContent_scriptsVarargs(value: ContentScript*): Self = this.set("content_scripts", js.Array(value :_*))
    
    @scala.inline
    def setContent_scripts(value: js.Array[ContentScript]): Self = this.set("content_scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent_scripts: Self = this.set("content_scripts", js.undefined)
    
    @scala.inline
    def setContent_security_policy(value: String | Contentscripts): Self = this.set("content_security_policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent_security_policy: Self = this.set("content_security_policy", js.undefined)
    
    @scala.inline
    def setDefault_locale(value: String): Self = this.set("default_locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault_locale: Self = this.set("default_locale", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDeveloper(value: WebExtensionManifestDeveloper): Self = this.set("developer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeveloper: Self = this.set("developer", js.undefined)
    
    @scala.inline
    def setDevtools_page(value: ExtensionURL): Self = this.set("devtools_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevtools_page: Self = this.set("devtools_page", js.undefined)
    
    @scala.inline
    def setExperiment_apis(value: StringDictionary[ExperimentAPI]): Self = this.set("experiment_apis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperiment_apis: Self = this.set("experiment_apis", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setHomepage_url(value: String): Self = this.set("homepage_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomepage_url: Self = this.set("homepage_url", js.undefined)
    
    @scala.inline
    def setIcons(value: WebExtensionManifestIcons): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setIncognito(value: WebExtensionManifestIncognito): Self = this.set("incognito", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncognito: Self = this.set("incognito", js.undefined)
    
    @scala.inline
    def setL10n_resourcesVarargs(value: String*): Self = this.set("l10n_resources", js.Array(value :_*))
    
    @scala.inline
    def setL10n_resources(value: js.Array[String]): Self = this.set("l10n_resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteL10n_resources: Self = this.set("l10n_resources", js.undefined)
    
    @scala.inline
    def setMinimum_chrome_version(value: String): Self = this.set("minimum_chrome_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimum_chrome_version: Self = this.set("minimum_chrome_version", js.undefined)
    
    @scala.inline
    def setMinimum_opera_version(value: String): Self = this.set("minimum_opera_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimum_opera_version: Self = this.set("minimum_opera_version", js.undefined)
    
    @scala.inline
    def setOmnibox(value: WebExtensionManifestOmnibox): Self = this.set("omnibox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmnibox: Self = this.set("omnibox", js.undefined)
    
    @scala.inline
    def setOptional_permissionsVarargs(value: OptionalPermissionOrOrigin*): Self = this.set("optional_permissions", js.Array(value :_*))
    
    @scala.inline
    def setOptional_permissions(value: js.Array[OptionalPermissionOrOrigin]): Self = this.set("optional_permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional_permissions: Self = this.set("optional_permissions", js.undefined)
    
    @scala.inline
    def setOptions_ui(value: WebExtensionManifestOptionsUi): Self = this.set("options_ui", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions_ui: Self = this.set("options_ui", js.undefined)
    
    @scala.inline
    def setPage_action(value: WebExtensionManifestPageAction): Self = this.set("page_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage_action: Self = this.set("page_action", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: PermissionOrOrigin*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[PermissionOrOrigin]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setProtocol_handlersVarargs(value: ProtocolHandler*): Self = this.set("protocol_handlers", js.Array(value :_*))
    
    @scala.inline
    def setProtocol_handlers(value: js.Array[ProtocolHandler]): Self = this.set("protocol_handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol_handlers: Self = this.set("protocol_handlers", js.undefined)
    
    @scala.inline
    def setShort_name(value: String): Self = this.set("short_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShort_name: Self = this.set("short_name", js.undefined)
    
    @scala.inline
    def setSidebar_action(value: WebExtensionManifestSidebarAction): Self = this.set("sidebar_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSidebar_action: Self = this.set("sidebar_action", js.undefined)
    
    @scala.inline
    def setTelemetry(value: WebExtensionManifestTelemetry): Self = this.set("telemetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelemetry: Self = this.set("telemetry", js.undefined)
    
    @scala.inline
    def setTheme_experiment(value: ThemeExperiment): Self = this.set("theme_experiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme_experiment: Self = this.set("theme_experiment", js.undefined)
    
    @scala.inline
    def setUser_scripts(value: WebExtensionManifestUserScripts): Self = this.set("user_scripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_scripts: Self = this.set("user_scripts", js.undefined)
    
    @scala.inline
    def setWeb_accessible_resourcesVarargs(value: String*): Self = this.set("web_accessible_resources", js.Array(value :_*))
    
    @scala.inline
    def setWeb_accessible_resources(value: js.Array[String]): Self = this.set("web_accessible_resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeb_accessible_resources: Self = this.set("web_accessible_resources", js.undefined)
  }
}
