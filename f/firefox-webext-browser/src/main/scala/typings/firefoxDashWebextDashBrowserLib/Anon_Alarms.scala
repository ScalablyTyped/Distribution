package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alarms extends js.Object {
  /**
    * Permissions: `alarms`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val alarmsNs: Anon_AlarmInfo
  /**
    * Use the `browser.bookmarks` API to create, organize, and otherwise manipulate bookmarks. Also see Override Pages,
    * which you can use to create a custom Bookmark Manager page.
    *
    * Permissions: `bookmarks`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val bookmarksNs: Anon_Bookmark
  /**
    * Use browser actions to put icons in the main browser toolbar, to the right of the address bar. In addition to its
    * icon, a browser action can also have a tooltip, a badge, and a popup.
    *
    * Manifest keys: `browser_action`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val browserActionNs: Anon_DetailsDisable
  /**
    * Use the `browser.browserSettings` API to control global settings of the browser.
    *
    * Permissions: `browserSettings`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val browserSettingsNs: Anon_AllowPopupsForUserEvents
  /**
    * Use the `browser.browsingData` API to remove browsing data from a user's local profile.
    *
    * Permissions: `browsingData`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val browsingDataNs: Anon_DataToRemove
  /**
    * Offers the ability to write to the clipboard. Reading is not supported because the clipboard can already be read
    * through the standard web platform APIs.
    *
    * Permissions: `clipboardWrite`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val clipboardNs: Anon_ImageData
  /**
    * Use the commands API to add keyboard shortcuts that trigger actions in your extension, for example, an action to
    * open the browser action or send a command to the xtension.
    *
    * Manifest keys: `commands`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val commandsNs: Anon_Command
  /** Not allowed in: Content scripts, Devtools pages */
  val contentScriptsNs: Anon_ContentScriptOptions
  /**
    * Use the browser.contextMenus API to add items to the browser's context menu. You can choose what types of objects
    * your context menu additions apply to, such as images, hyperlinks, and pages.
    *
    * Permissions: `contextMenus`
    */
  val contextMenusNs: Anon_ACTIONMENUTOPLEVELLIMIT
  /**
    * Use the `browser.contextualIdentities` API to query and modify contextual identity, also called as containers.
    *
    * Permissions: `contextualIdentities`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val contextualIdentitiesNs: Anon_ChangeInfo
  /**
    * Use the `browser.cookies` API to query and modify cookies, and to be notified when they change.
    *
    * Permissions: `cookies`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val cookiesNs: Anon_ChangeInfoDetails
  /**
    * Manifest keys: `devtools_page`
    *
    * Allowed in: Devtools pages only
    */
  val devtoolsNs: Anon_InspectedWindow
  /**
    * Asynchronous DNS API
    *
    * Permissions: `dns`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val dnsNs: Anon_Flags
  /**
    * Permissions: `downloads`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val downloadsNs: Anon_AcceptDanger
  /**
    * The `browser.events` namespace contains common types used by APIs dispatching events to notify you when something
    * interesting happens.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val eventsNs: js.Any
  /** Not allowed in: Content scripts, Devtools pages */
  val experimentsNs: js.Any
  /**
    * The `browser.extension` API has utilities that can be used by any extension page. It includes support for exchanging
    * messages between an extension and its content scripts or between extensions, as described in detail in Message
    * Passing.
    */
  val extensionNs: Anon_Data
  /**
    * The `browser.extensionTypes` API contains type declarations for WebExtensions.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val extensionTypesNs: js.Any
  /**
    * Use the `browser.find` API to interact with the browser's `Find` interface.
    *
    * Permissions: `find`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val findNs: Anon_Find
  /**
    * Exposes the browser's profiler.
    *
    * Permissions: `geckoProfiler`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val geckoProfilerNs: Anon_BreakpadId
  /**
    * Use the `browser.history` API to interact with the browser's record of visited pages. You can add, remove, and query
    * for URLs in the browser's history. To override the history page with your own version, see Override Pages.
    *
    * Permissions: `history`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val historyNs: Anon_AddUrl
  /**
    * Use the `browser.i18n` infrastructure to implement internationalization across your whole app or extension.
    */
  val i18nNs: Anon_DetectLanguage
  /**
    * Use the browser.identity API to get OAuth2 access tokens.
    *
    * Permissions: `identity`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val identityNs: Anon_AccountDetails
  /**
    * Use the `browser.idle` API to detect when the machine's idle state changes.
    *
    * Permissions: `idle`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val idleNs: Anon_DetectionIntervalInSeconds
  /**
    * The `browser.management` API provides ways to manage the list of extensions that are installed and running.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val managementNs: Anon_Enabled
  /**
    * Use the browser.menus API to add items to the browser's menus. You can choose what types of objects your context
    * menu additions apply to, such as images, hyperlinks, and pages.
    *
    * Permissions: `menus`, `menus`
    */
  val menusNs: Anon_ACTIONMENUTOPLEVELLIMITCallback
  /**
    * Permissions: `notifications`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val notificationsNs: Anon_ButtonIndex
  /**
    * The omnibox API allows you to register a keyword with Firefox's address bar.
    *
    * Manifest keys: `omnibox`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val omniboxNs: Anon_Disposition
  /**
    * Use the `browser.pageAction` API to put icons inside the address bar. Page actions represent actions that can be
    * taken on the current page, but that aren't applicable to all pages.
    *
    * Manifest keys: `page_action`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val pageActionNs: Anon_DetailsGetPopup
  /**
    * Manifest keys: `optional_permissions`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val permissionsNs: Anon_Contains
  /**
    * PKCS#11 module management API
    *
    * Permissions: `pkcs11`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val pkcs11Ns: Anon_FlagsGetModuleSlots
  /**
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val privacyNs: Anon_Network
  /**
    * Use the browser.proxy API to register proxy scripts in Firefox. Proxy scripts in Firefox are proxy auto-config files
    * with extra contextual information and support for additional return types.
    *
    * Permissions: `proxy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val proxyNs: Anon_Details
  /**
    * Use the `browser.runtime` API to retrieve the background page, return details about the manifest, and listen for and
    * respond to events in the app or extension lifecycle. You can also use this API to convert the relative path of URLs
    * to fully-qualified URLs.
    *
    * Allowed in: Proxy scripts
    */
  val runtimeNs: Anon_Application
  /**
    * Use browser.search to interact with search engines.
    *
    * Permissions: `search`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val searchNs: Anon_GetSearch
  /**
    * Use the `browser.sessions` API to query and restore tabs and windows from a browsing session.
    *
    * Permissions: `sessions`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val sessionsNs: Anon_Callback
  /**
    * Use sidebar actions to add a sidebar to Firefox.
    *
    * Manifest keys: `sidebar_action`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val sidebarActionNs: Anon_Close
  /**
    * Use the `browser.storage` API to store, retrieve, and track changes to user data.
    *
    * Permissions: `storage`
    */
  val storageNs: Anon_AreaName
  /**
    * Use the `browser.tabs` API to interact with the browser's tab system. You can use this API to create, modify, and
    * rearrange tabs in the browser.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val tabsNs: Anon_ActiveInfo
  /**
    * Use the `browser.telemetry` API to send telemetry data to the Mozilla Telemetry service. Restricted to Mozilla
    * privileged webextensions.
    *
    * Permissions: `telemetry`, `mozillaAddons`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val telemetryNs: Anon_CanUpload
  /**
    * The theme API allows customizing of visual elements of the browser.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val themeNs: Anon_DetailsGetCurrent
  /**
    * Use the browser.topSites API to access the top sites that are displayed on the new tab page.
    *
    * Permissions: `topSites`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val topSitesNs: Anon_Get
  /**
    * Contains types used by other schemas.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val typesNs: js.Any
  /** Not allowed in: Content scripts, Devtools pages */
  val underscoreManifestNs: js.Any
  /**
    * Manifest keys: `user_scripts`, `user_scripts`
    *
    * Not allowed in: Devtools pages
    */
  val userScriptsNs: Anon_OnBeforeScript
  /**
    * Use the `browser.webNavigation` API to receive notifications about the status of navigation requests in-flight.
    *
    * Permissions: `webNavigation`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val webNavigationNs: Anon_DetailsGetAllFrames
  /**
    * Use the `browser.webRequest` API to observe and analyze traffic and to intercept, block, or modify requests
    * in-flight.
    *
    * Permissions: `webRequest`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val webRequestNs: Anon_DetailsFilterResponseData
  /**
    * Use the `browser.windows` API to interact with browser windows. You can use this API to create, modify, and
    * rearrange windows in the browser.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val windowsNs: Anon_CreateCreateData
}

object Anon_Alarms {
  @scala.inline
  def apply(
    alarmsNs: Anon_AlarmInfo,
    bookmarksNs: Anon_Bookmark,
    browserActionNs: Anon_DetailsDisable,
    browserSettingsNs: Anon_AllowPopupsForUserEvents,
    browsingDataNs: Anon_DataToRemove,
    clipboardNs: Anon_ImageData,
    commandsNs: Anon_Command,
    contentScriptsNs: Anon_ContentScriptOptions,
    contextMenusNs: Anon_ACTIONMENUTOPLEVELLIMIT,
    contextualIdentitiesNs: Anon_ChangeInfo,
    cookiesNs: Anon_ChangeInfoDetails,
    devtoolsNs: Anon_InspectedWindow,
    dnsNs: Anon_Flags,
    downloadsNs: Anon_AcceptDanger,
    eventsNs: js.Any,
    experimentsNs: js.Any,
    extensionNs: Anon_Data,
    extensionTypesNs: js.Any,
    findNs: Anon_Find,
    geckoProfilerNs: Anon_BreakpadId,
    historyNs: Anon_AddUrl,
    i18nNs: Anon_DetectLanguage,
    identityNs: Anon_AccountDetails,
    idleNs: Anon_DetectionIntervalInSeconds,
    managementNs: Anon_Enabled,
    menusNs: Anon_ACTIONMENUTOPLEVELLIMITCallback,
    notificationsNs: Anon_ButtonIndex,
    omniboxNs: Anon_Disposition,
    pageActionNs: Anon_DetailsGetPopup,
    permissionsNs: Anon_Contains,
    pkcs11Ns: Anon_FlagsGetModuleSlots,
    privacyNs: Anon_Network,
    proxyNs: Anon_Details,
    runtimeNs: Anon_Application,
    searchNs: Anon_GetSearch,
    sessionsNs: Anon_Callback,
    sidebarActionNs: Anon_Close,
    storageNs: Anon_AreaName,
    tabsNs: Anon_ActiveInfo,
    telemetryNs: Anon_CanUpload,
    themeNs: Anon_DetailsGetCurrent,
    topSitesNs: Anon_Get,
    typesNs: js.Any,
    underscoreManifestNs: js.Any,
    userScriptsNs: Anon_OnBeforeScript,
    webNavigationNs: Anon_DetailsGetAllFrames,
    webRequestNs: Anon_DetailsFilterResponseData,
    windowsNs: Anon_CreateCreateData
  ): Anon_Alarms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alarmsNs")(alarmsNs)
    __obj.updateDynamic("bookmarksNs")(bookmarksNs)
    __obj.updateDynamic("browserActionNs")(browserActionNs)
    __obj.updateDynamic("browserSettingsNs")(browserSettingsNs)
    __obj.updateDynamic("browsingDataNs")(browsingDataNs)
    __obj.updateDynamic("clipboardNs")(clipboardNs)
    __obj.updateDynamic("commandsNs")(commandsNs)
    __obj.updateDynamic("contentScriptsNs")(contentScriptsNs)
    __obj.updateDynamic("contextMenusNs")(contextMenusNs)
    __obj.updateDynamic("contextualIdentitiesNs")(contextualIdentitiesNs)
    __obj.updateDynamic("cookiesNs")(cookiesNs)
    __obj.updateDynamic("devtoolsNs")(devtoolsNs)
    __obj.updateDynamic("dnsNs")(dnsNs)
    __obj.updateDynamic("downloadsNs")(downloadsNs)
    __obj.updateDynamic("eventsNs")(eventsNs)
    __obj.updateDynamic("experimentsNs")(experimentsNs)
    __obj.updateDynamic("extensionNs")(extensionNs)
    __obj.updateDynamic("extensionTypesNs")(extensionTypesNs)
    __obj.updateDynamic("findNs")(findNs)
    __obj.updateDynamic("geckoProfilerNs")(geckoProfilerNs)
    __obj.updateDynamic("historyNs")(historyNs)
    __obj.updateDynamic("i18nNs")(i18nNs)
    __obj.updateDynamic("identityNs")(identityNs)
    __obj.updateDynamic("idleNs")(idleNs)
    __obj.updateDynamic("managementNs")(managementNs)
    __obj.updateDynamic("menusNs")(menusNs)
    __obj.updateDynamic("notificationsNs")(notificationsNs)
    __obj.updateDynamic("omniboxNs")(omniboxNs)
    __obj.updateDynamic("pageActionNs")(pageActionNs)
    __obj.updateDynamic("permissionsNs")(permissionsNs)
    __obj.updateDynamic("pkcs11Ns")(pkcs11Ns)
    __obj.updateDynamic("privacyNs")(privacyNs)
    __obj.updateDynamic("proxyNs")(proxyNs)
    __obj.updateDynamic("runtimeNs")(runtimeNs)
    __obj.updateDynamic("searchNs")(searchNs)
    __obj.updateDynamic("sessionsNs")(sessionsNs)
    __obj.updateDynamic("sidebarActionNs")(sidebarActionNs)
    __obj.updateDynamic("storageNs")(storageNs)
    __obj.updateDynamic("tabsNs")(tabsNs)
    __obj.updateDynamic("telemetryNs")(telemetryNs)
    __obj.updateDynamic("themeNs")(themeNs)
    __obj.updateDynamic("topSitesNs")(topSitesNs)
    __obj.updateDynamic("typesNs")(typesNs)
    __obj.updateDynamic("underscoreManifestNs")(underscoreManifestNs)
    __obj.updateDynamic("userScriptsNs")(userScriptsNs)
    __obj.updateDynamic("webNavigationNs")(webNavigationNs)
    __obj.updateDynamic("webRequestNs")(webRequestNs)
    __obj.updateDynamic("windowsNs")(windowsNs)
    __obj.asInstanceOf[Anon_Alarms]
  }
}

