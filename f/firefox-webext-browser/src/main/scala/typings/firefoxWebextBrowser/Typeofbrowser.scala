package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofbrowser extends js.Object {
  /** Not allowed in: Content scripts, Devtools pages */
  val _manifest: js.Any
  /**
    * Monitor extension activity
    *
    * Permissions: `activityLog`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val activityLog: TypeofactivityLog
  /**
    * Permissions: `alarms`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val alarms: Typeofalarms
  /**
    * Use the `browser.bookmarks` API to create, organize, and otherwise manipulate bookmarks. Also see Override Pages,
    * which you can use to create a custom Bookmark Manager page.
    *
    * Permissions: `bookmarks`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val bookmarks: Typeofbookmarks
  /**
    * Use browser actions to put icons in the main browser toolbar, to the right of the address bar. In addition to its
    * icon, a browser action can also have a tooltip, a badge, and a popup.
    *
    * Manifest keys: `browser_action`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val browserAction: TypeofbrowserAction
  /**
    * Use the `browser.browserSettings` API to control global settings of the browser.
    *
    * Permissions: `browserSettings`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val browserSettings: TypeofbrowserSettings
  /**
    * Use the `browser.browsingData` API to remove browsing data from a user's local profile.
    *
    * Permissions: `browsingData`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val browsingData: TypeofbrowsingData
  /**
    * This API provides the ability detect the captive portal state of the users connection.
    *
    * Permissions: `captivePortal`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val captivePortal: TypeofcaptivePortal
  /**
    * Offers the ability to write to the clipboard. Reading is not supported because the clipboard can already be read
    * through the standard web platform APIs.
    *
    * Permissions: `clipboardWrite`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val clipboard: Typeofclipboard
  /**
    * Use the commands API to add keyboard shortcuts that trigger actions in your extension, for example, an action to
    * open the browser action or send a command to the xtension.
    *
    * Manifest keys: `commands`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val commands: Typeofcommands
  /** Not allowed in: Content scripts, Devtools pages */
  val contentScripts: TypeofcontentScripts
  /**
    * Use the browser.contextMenus API to add items to the browser's context menu. You can choose what types of objects
    * your context menu additions apply to, such as images, hyperlinks, and pages.
    *
    * Permissions: `contextMenus`
    */
  val contextMenus: TypeofcontextMenus
  /**
    * Use the `browser.contextualIdentities` API to query and modify contextual identity, also called as containers.
    *
    * Permissions: `contextualIdentities`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val contextualIdentities: TypeofcontextualIdentities
  /**
    * Use the `browser.cookies` API to query and modify cookies, and to be notified when they change.
    *
    * Permissions: `cookies`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val cookies: Typeofcookies
  /**
    * Manifest keys: `devtools_page`
    *
    * Allowed in: Devtools pages only
    */
  val devtools: Typeofdevtools
  /**
    * Asynchronous DNS API
    *
    * Permissions: `dns`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val dns: Typeofdns
  /**
    * Permissions: `downloads`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val downloads: Typeofdownloads
  /**
    * The `browser.events` namespace contains common types used by APIs dispatching events to notify you when something
    * interesting happens.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val events: js.Any
  /** Not allowed in: Content scripts, Devtools pages */
  val experiments: js.Any
  /**
    * The `browser.extension` API has utilities that can be used by any extension page. It includes support for exchanging
    * messages between an extension and its content scripts or between extensions, as described in detail in Message
    * Passing.
    */
  val extension: Typeofextension
  /**
    * The `browser.extensionTypes` API contains type declarations for WebExtensions.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val extensionTypes: js.Any
  /**
    * Use the `browser.find` API to interact with the browser's `Find` interface.
    *
    * Permissions: `find`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val find: Typeoffind
  /**
    * Exposes the browser's profiler.
    *
    * Permissions: `geckoProfiler`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val geckoProfiler: TypeofgeckoProfiler
  /**
    * Use the `browser.history` API to interact with the browser's record of visited pages. You can add, remove, and query
    * for URLs in the browser's history. To override the history page with your own version, see Override Pages.
    *
    * Permissions: `history`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val history: Typeofhistory
  /**
    * Use the `browser.i18n` infrastructure to implement internationalization across your whole app or extension.
    */
  val i18n: Typeofi18n
  /**
    * Use the browser.identity API to get OAuth2 access tokens.
    *
    * Permissions: `identity`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val identity: Typeofidentity
  /**
    * Use the `browser.idle` API to detect when the machine's idle state changes.
    *
    * Permissions: `idle`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val idle: Typeofidle
  /**
    * The `browser.management` API provides ways to manage the list of extensions that are installed and running.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val management: Typeofmanagement
  /**
    * Use the browser.menus API to add items to the browser's menus. You can choose what types of objects your context
    * menu additions apply to, such as images, hyperlinks, and pages.
    *
    * Permissions: `menus`, `menus`
    */
  val menus: Typeofmenus
  /**
    * This API provides the ability to determine the status of and detect changes in the network connection. This API can
    * only be used in privileged extensions.
    *
    * Permissions: `networkStatus`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val networkStatus: TypeofnetworkStatus
  /**
    * Normandy Study API
    *
    * Permissions: `normandyAddonStudy`
    */
  val normandyAddonStudy: TypeofnormandyAddonStudy
  /**
    * Permissions: `notifications`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val notifications: Typeofnotifications
  /**
    * The omnibox API allows you to register a keyword with Firefox's address bar.
    *
    * Manifest keys: `omnibox`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val omnibox: Typeofomnibox
  /**
    * Use the `browser.pageAction` API to put icons inside the address bar. Page actions represent actions that can be
    * taken on the current page, but that aren't applicable to all pages.
    *
    * Manifest keys: `page_action`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val pageAction: TypeofpageAction
  /**
    * Manifest keys: `optional_permissions`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val permissions: Typeofpermissions
  /**
    * PKCS#11 module management API
    *
    * Permissions: `pkcs11`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val pkcs11: Typeofpkcs11
  /**
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val privacy: Typeofprivacy
  /**
    * Use the browser.proxy API to register proxy scripts in Firefox. Proxy scripts in Firefox are proxy auto-config files
    * with extra contextual information and support for additional return types.
    *
    * Permissions: `proxy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val proxy: Typeofproxy
  /**
    * Use the `browser.runtime` API to retrieve the background page, return details about the manifest, and listen for and
    * respond to events in the app or extension lifecycle. You can also use this API to convert the relative path of URLs
    * to fully-qualified URLs.
    *
    * Allowed in: Proxy scripts
    */
  val runtime: Typeofruntime
  /**
    * Use browser.search to interact with search engines.
    *
    * Permissions: `search`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val search: Typeofsearch
  /**
    * Use the `browser.sessions` API to query and restore tabs and windows from a browsing session.
    *
    * Permissions: `sessions`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val sessions: Typeofsessions
  /**
    * Use sidebar actions to add a sidebar to Firefox.
    *
    * Manifest keys: `sidebar_action`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val sidebarAction: TypeofsidebarAction
  /**
    * Use the `browser.storage` API to store, retrieve, and track changes to user data.
    *
    * Permissions: `storage`
    */
  val storage: Typeofstorage
  /**
    * Use the `browser.tabs` API to interact with the browser's tab system. You can use this API to create, modify, and
    * rearrange tabs in the browser.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val tabs: Typeoftabs
  /**
    * Use the `browser.telemetry` API to send telemetry data to the Mozilla Telemetry service. Restricted to Mozilla
    * privileged webextensions.
    *
    * Permissions: `telemetry`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val telemetry: Typeoftelemetry
  /**
    * The theme API allows customizing of visual elements of the browser.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val theme: Typeoftheme
  /**
    * Use the browser.topSites API to access the top sites that are displayed on the new tab page.
    *
    * Permissions: `topSites`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val topSites: TypeoftopSites
  /**
    * Contains types used by other schemas.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val types: js.Any
  /**
    * Use the `browser.urlbar` API to experiment with new features in the URLBar. Restricted to Mozilla privileged
    * WebExtensions.
    *
    * Permissions: `urlbar`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val urlbar: Typeofurlbar
  /**
    * Manifest keys: `user_scripts`, `user_scripts`
    *
    * Not allowed in: Devtools pages
    */
  val userScripts: TypeofuserScripts
  /**
    * Use the `browser.webNavigation` API to receive notifications about the status of navigation requests in-flight.
    *
    * Permissions: `webNavigation`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val webNavigation: TypeofwebNavigation
  /**
    * Use the `browser.webRequest` API to observe and analyze traffic and to intercept, block, or modify requests
    * in-flight.
    *
    * Permissions: `webRequest`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val webRequest: TypeofwebRequest
  /**
    * Use the `browser.windows` API to interact with browser windows. You can use this API to create, modify, and
    * rearrange windows in the browser.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val windows: Typeofwindows
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
    contextualIdentities: TypeofcontextualIdentities,
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
}

