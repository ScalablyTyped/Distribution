package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofbrowser extends js.Object {
  /** Not allowed in: Content scripts, Devtools pages */
  val _manifest: js.Any = js.native
  /**
    * Monitor extension activity
    *
    * Permissions: `activityLog`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val activityLog: TypeofactivityLog = js.native
  /**
    * Permissions: `alarms`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val alarms: Typeofalarms = js.native
  /**
    * Use the `browser.bookmarks` API to create, organize, and otherwise manipulate bookmarks. Also see Override Pages,
    * which you can use to create a custom Bookmark Manager page.
    *
    * Permissions: `bookmarks`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val bookmarks: Typeofbookmarks = js.native
  /**
    * Use browser actions to put icons in the main browser toolbar, to the right of the address bar. In addition to its
    * icon, a browser action can also have a tooltip, a badge, and a popup.
    *
    * Manifest keys: `browser_action`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val browserAction: TypeofbrowserAction = js.native
  /**
    * Use the `browser.browserSettings` API to control global settings of the browser.
    *
    * Permissions: `browserSettings`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val browserSettings: TypeofbrowserSettings = js.native
  /**
    * Use the `browser.browsingData` API to remove browsing data from a user's local profile.
    *
    * Permissions: `browsingData`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val browsingData: TypeofbrowsingData = js.native
  /**
    * This API provides the ability detect the captive portal state of the users connection.
    *
    * Permissions: `captivePortal`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val captivePortal: TypeofcaptivePortal = js.native
  /**
    * Offers the ability to write to the clipboard. Reading is not supported because the clipboard can already be read
    * through the standard web platform APIs.
    *
    * Permissions: `clipboardWrite`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val clipboard: Typeofclipboard = js.native
  /**
    * Use the commands API to add keyboard shortcuts that trigger actions in your extension, for example, an action to
    * open the browser action or send a command to the xtension.
    *
    * Manifest keys: `commands`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val commands: Typeofcommands = js.native
  /** Not allowed in: Content scripts, Devtools pages */
  val contentScripts: TypeofcontentScripts = js.native
  /**
    * Use the browser.contextMenus API to add items to the browser's context menu. You can choose what types of objects
    * your context menu additions apply to, such as images, hyperlinks, and pages.
    *
    * Permissions: `contextMenus`
    */
  val contextMenus: TypeofcontextMenus = js.native
  /**
    * Use the `browser.contextualIdentities` API to query and modify contextual identity, also called as containers.
    *
    * Permissions: `contextualIdentities`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val contextualIdentities: TypeofcontextualIdentitie = js.native
  /**
    * Use the `browser.cookies` API to query and modify cookies, and to be notified when they change.
    *
    * Permissions: `cookies`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val cookies: Typeofcookies = js.native
  /**
    * Manifest keys: `devtools_page`
    *
    * Allowed in: Devtools pages only
    */
  val devtools: Typeofdevtools = js.native
  /**
    * Asynchronous DNS API
    *
    * Permissions: `dns`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val dns: Typeofdns = js.native
  /**
    * Permissions: `downloads`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val downloads: Typeofdownloads = js.native
  /**
    * The `browser.events` namespace contains common types used by APIs dispatching events to notify you when something
    * interesting happens.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val events: js.Any = js.native
  /** Not allowed in: Content scripts, Devtools pages */
  val experiments: js.Any = js.native
  /**
    * The `browser.extension` API has utilities that can be used by any extension page. It includes support for exchanging
    * messages between an extension and its content scripts or between extensions, as described in detail in Message
    * Passing.
    */
  val extension: Typeofextension = js.native
  /**
    * The `browser.extensionTypes` API contains type declarations for WebExtensions.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val extensionTypes: js.Any = js.native
  /**
    * Use the `browser.find` API to interact with the browser's `Find` interface.
    *
    * Permissions: `find`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val find: Typeoffind = js.native
  /**
    * Exposes the browser's profiler.
    *
    * Permissions: `geckoProfiler`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val geckoProfiler: TypeofgeckoProfiler = js.native
  /**
    * Use the `browser.history` API to interact with the browser's record of visited pages. You can add, remove, and query
    * for URLs in the browser's history. To override the history page with your own version, see Override Pages.
    *
    * Permissions: `history`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val history: Typeofhistory = js.native
  /**
    * Use the `browser.i18n` infrastructure to implement internationalization across your whole app or extension.
    */
  val i18n: Typeofi18n = js.native
  /**
    * Use the browser.identity API to get OAuth2 access tokens.
    *
    * Permissions: `identity`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val identity: Typeofidentity = js.native
  /**
    * Use the `browser.idle` API to detect when the machine's idle state changes.
    *
    * Permissions: `idle`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val idle: Typeofidle = js.native
  /**
    * The `browser.management` API provides ways to manage the list of extensions that are installed and running.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val management: Typeofmanagement = js.native
  /**
    * Use the browser.menus API to add items to the browser's menus. You can choose what types of objects your context
    * menu additions apply to, such as images, hyperlinks, and pages.
    *
    * Permissions: `menus`, `menus`
    */
  val menus: Typeofmenus = js.native
  /**
    * This API provides the ability to determine the status of and detect changes in the network connection. This API can
    * only be used in privileged extensions.
    *
    * Permissions: `networkStatus`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val networkStatus: TypeofnetworkStatus = js.native
  /**
    * Normandy Study API
    *
    * Permissions: `normandyAddonStudy`
    */
  val normandyAddonStudy: TypeofnormandyAddonStudy = js.native
  /**
    * Permissions: `notifications`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val notifications: Typeofnotifications = js.native
  /**
    * The omnibox API allows you to register a keyword with Firefox's address bar.
    *
    * Manifest keys: `omnibox`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val omnibox: Typeofomnibox = js.native
  /**
    * Use the `browser.pageAction` API to put icons inside the address bar. Page actions represent actions that can be
    * taken on the current page, but that aren't applicable to all pages.
    *
    * Manifest keys: `page_action`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val pageAction: TypeofpageAction = js.native
  /**
    * Manifest keys: `optional_permissions`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val permissions: Typeofpermissions = js.native
  /**
    * PKCS#11 module management API
    *
    * Permissions: `pkcs11`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val pkcs11: Typeofpkcs11 = js.native
  /**
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val privacy: Typeofprivacy = js.native
  /**
    * Provides access to global proxy settings for Firefox and proxy event listeners to handle dynamic proxy
    * implementations.
    *
    * Permissions: `proxy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val proxy: Typeofproxy = js.native
  /**
    * Use the `browser.runtime` API to retrieve the background page, return details about the manifest, and listen for and
    * respond to events in the app or extension lifecycle. You can also use this API to convert the relative path of URLs
    * to fully-qualified URLs.
    */
  val runtime: Typeofruntime = js.native
  /**
    * Use browser.search to interact with search engines.
    *
    * Permissions: `search`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val search: Typeofsearch = js.native
  /**
    * Use the `browser.sessions` API to query and restore tabs and windows from a browsing session.
    *
    * Permissions: `sessions`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val sessions: Typeofsessions = js.native
  /**
    * Use sidebar actions to add a sidebar to Firefox.
    *
    * Manifest keys: `sidebar_action`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val sidebarAction: TypeofsidebarAction = js.native
  /**
    * Use the `browser.storage` API to store, retrieve, and track changes to user data.
    *
    * Permissions: `storage`
    */
  val storage: Typeofstorage = js.native
  /**
    * Use the `browser.tabs` API to interact with the browser's tab system. You can use this API to create, modify, and
    * rearrange tabs in the browser.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val tabs: Typeoftabs = js.native
  /**
    * Use the `browser.telemetry` API to send telemetry data to the Mozilla Telemetry service. Restricted to Mozilla
    * privileged webextensions.
    *
    * Permissions: `telemetry`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val telemetry: Typeoftelemetry = js.native
  /**
    * The theme API allows customizing of visual elements of the browser.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val theme: Typeoftheme = js.native
  /**
    * Use the browser.topSites API to access the top sites that are displayed on the new tab page.
    *
    * Permissions: `topSites`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val topSites: TypeoftopSites = js.native
  /**
    * Contains types used by other schemas.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val types: js.Any = js.native
  /**
    * Use the `browser.urlbar` API to experiment with new features in the URLBar. Restricted to Mozilla privileged
    * WebExtensions.
    *
    * Permissions: `urlbar`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val urlbar: Typeofurlbar = js.native
  /**
    * Manifest keys: `user_scripts`, `user_scripts`
    *
    * Not allowed in: Devtools pages
    */
  val userScripts: TypeofuserScripts = js.native
  /**
    * Use the `browser.webNavigation` API to receive notifications about the status of navigation requests in-flight.
    *
    * Permissions: `webNavigation`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val webNavigation: TypeofwebNavigation = js.native
  /**
    * Use the `browser.webRequest` API to observe and analyze traffic and to intercept, block, or modify requests
    * in-flight.
    *
    * Permissions: `webRequest`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val webRequest: TypeofwebRequest = js.native
  /**
    * Use the `browser.windows` API to interact with browser windows. You can use this API to create, modify, and
    * rearrange windows in the browser.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val windows: Typeofwindows = js.native
}

object Typeofbrowser {
  @scala.inline
  def apply(
    _manifest: js.Any,
    activityLog: TypeofactivityLog,
    alarms: Typeofalarms,
    bookmarks: Typeofbookmarks,
    browserAction: TypeofbrowserAction,
    browserSettings: TypeofbrowserSettings,
    browsingData: TypeofbrowsingData,
    captivePortal: TypeofcaptivePortal,
    clipboard: Typeofclipboard,
    commands: Typeofcommands,
    contentScripts: TypeofcontentScripts,
    contextMenus: TypeofcontextMenus,
    contextualIdentities: TypeofcontextualIdentitie,
    cookies: Typeofcookies,
    devtools: Typeofdevtools,
    dns: Typeofdns,
    downloads: Typeofdownloads,
    events: js.Any,
    experiments: js.Any,
    extension: Typeofextension,
    extensionTypes: js.Any,
    find: Typeoffind,
    geckoProfiler: TypeofgeckoProfiler,
    history: Typeofhistory,
    i18n: Typeofi18n,
    identity: Typeofidentity,
    idle: Typeofidle,
    management: Typeofmanagement,
    menus: Typeofmenus,
    networkStatus: TypeofnetworkStatus,
    normandyAddonStudy: TypeofnormandyAddonStudy,
    notifications: Typeofnotifications,
    omnibox: Typeofomnibox,
    pageAction: TypeofpageAction,
    permissions: Typeofpermissions,
    pkcs11: Typeofpkcs11,
    privacy: Typeofprivacy,
    proxy: Typeofproxy,
    runtime: Typeofruntime,
    search: Typeofsearch,
    sessions: Typeofsessions,
    sidebarAction: TypeofsidebarAction,
    storage: Typeofstorage,
    tabs: Typeoftabs,
    telemetry: Typeoftelemetry,
    theme: Typeoftheme,
    topSites: TypeoftopSites,
    types: js.Any,
    urlbar: Typeofurlbar,
    userScripts: TypeofuserScripts,
    webNavigation: TypeofwebNavigation,
    webRequest: TypeofwebRequest,
    windows: Typeofwindows
  ): Typeofbrowser = {
    val __obj = js.Dynamic.literal(_manifest = _manifest.asInstanceOf[js.Any], activityLog = activityLog.asInstanceOf[js.Any], alarms = alarms.asInstanceOf[js.Any], bookmarks = bookmarks.asInstanceOf[js.Any], browserAction = browserAction.asInstanceOf[js.Any], browserSettings = browserSettings.asInstanceOf[js.Any], browsingData = browsingData.asInstanceOf[js.Any], captivePortal = captivePortal.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], contentScripts = contentScripts.asInstanceOf[js.Any], contextMenus = contextMenus.asInstanceOf[js.Any], contextualIdentities = contextualIdentities.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], devtools = devtools.asInstanceOf[js.Any], dns = dns.asInstanceOf[js.Any], downloads = downloads.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], experiments = experiments.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], extensionTypes = extensionTypes.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], geckoProfiler = geckoProfiler.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], management = management.asInstanceOf[js.Any], menus = menus.asInstanceOf[js.Any], networkStatus = networkStatus.asInstanceOf[js.Any], normandyAddonStudy = normandyAddonStudy.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], omnibox = omnibox.asInstanceOf[js.Any], pageAction = pageAction.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], pkcs11 = pkcs11.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any], sidebarAction = sidebarAction.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], telemetry = telemetry.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], topSites = topSites.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], urlbar = urlbar.asInstanceOf[js.Any], userScripts = userScripts.asInstanceOf[js.Any], webNavigation = webNavigation.asInstanceOf[js.Any], webRequest = webRequest.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofbrowser]
  }
  @scala.inline
  implicit class TypeofbrowserOps[Self <: Typeofbrowser] (val x: Self) extends AnyVal {
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
    def set_manifest(value: js.Any): Self = this.set("_manifest", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivityLog(value: TypeofactivityLog): Self = this.set("activityLog", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlarms(value: Typeofalarms): Self = this.set("alarms", value.asInstanceOf[js.Any])
    @scala.inline
    def setBookmarks(value: Typeofbookmarks): Self = this.set("bookmarks", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowserAction(value: TypeofbrowserAction): Self = this.set("browserAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowserSettings(value: TypeofbrowserSettings): Self = this.set("browserSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowsingData(value: TypeofbrowsingData): Self = this.set("browsingData", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaptivePortal(value: TypeofcaptivePortal): Self = this.set("captivePortal", value.asInstanceOf[js.Any])
    @scala.inline
    def setClipboard(value: Typeofclipboard): Self = this.set("clipboard", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommands(value: Typeofcommands): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentScripts(value: TypeofcontentScripts): Self = this.set("contentScripts", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextMenus(value: TypeofcontextMenus): Self = this.set("contextMenus", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextualIdentities(value: TypeofcontextualIdentitie): Self = this.set("contextualIdentities", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookies(value: Typeofcookies): Self = this.set("cookies", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevtools(value: Typeofdevtools): Self = this.set("devtools", value.asInstanceOf[js.Any])
    @scala.inline
    def setDns(value: Typeofdns): Self = this.set("dns", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloads(value: Typeofdownloads): Self = this.set("downloads", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvents(value: js.Any): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setExperiments(value: js.Any): Self = this.set("experiments", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtension(value: Typeofextension): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensionTypes(value: js.Any): Self = this.set("extensionTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setFind(value: Typeoffind): Self = this.set("find", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeckoProfiler(value: TypeofgeckoProfiler): Self = this.set("geckoProfiler", value.asInstanceOf[js.Any])
    @scala.inline
    def setHistory(value: Typeofhistory): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def setI18n(value: Typeofi18n): Self = this.set("i18n", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentity(value: Typeofidentity): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdle(value: Typeofidle): Self = this.set("idle", value.asInstanceOf[js.Any])
    @scala.inline
    def setManagement(value: Typeofmanagement): Self = this.set("management", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenus(value: Typeofmenus): Self = this.set("menus", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkStatus(value: TypeofnetworkStatus): Self = this.set("networkStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormandyAddonStudy(value: TypeofnormandyAddonStudy): Self = this.set("normandyAddonStudy", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotifications(value: Typeofnotifications): Self = this.set("notifications", value.asInstanceOf[js.Any])
    @scala.inline
    def setOmnibox(value: Typeofomnibox): Self = this.set("omnibox", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageAction(value: TypeofpageAction): Self = this.set("pageAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissions(value: Typeofpermissions): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setPkcs11(value: Typeofpkcs11): Self = this.set("pkcs11", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivacy(value: Typeofprivacy): Self = this.set("privacy", value.asInstanceOf[js.Any])
    @scala.inline
    def setProxy(value: Typeofproxy): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntime(value: Typeofruntime): Self = this.set("runtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearch(value: Typeofsearch): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessions(value: Typeofsessions): Self = this.set("sessions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSidebarAction(value: TypeofsidebarAction): Self = this.set("sidebarAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorage(value: Typeofstorage): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabs(value: Typeoftabs): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTelemetry(value: Typeoftelemetry): Self = this.set("telemetry", value.asInstanceOf[js.Any])
    @scala.inline
    def setTheme(value: Typeoftheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopSites(value: TypeoftopSites): Self = this.set("topSites", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypes(value: js.Any): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrlbar(value: Typeofurlbar): Self = this.set("urlbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserScripts(value: TypeofuserScripts): Self = this.set("userScripts", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebNavigation(value: TypeofwebNavigation): Self = this.set("webNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebRequest(value: TypeofwebRequest): Self = this.set("webRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindows(value: Typeofwindows): Self = this.set("windows", value.asInstanceOf[js.Any])
  }
  
}

