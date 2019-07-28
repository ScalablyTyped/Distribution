package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofbrowser extends js.Object {
  /**
    * Permissions: `alarms`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val alarmsNs: Typeofalarms
  /**
    * Use the `browser.bookmarks` API to create, organize, and otherwise manipulate bookmarks. Also see Override Pages,
    * which you can use to create a custom Bookmark Manager page.
    *
    * Permissions: `bookmarks`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val bookmarksNs: Typeofbookmarks
  /**
    * Use browser actions to put icons in the main browser toolbar, to the right of the address bar. In addition to its
    * icon, a browser action can also have a tooltip, a badge, and a popup.
    *
    * Manifest keys: `browser_action`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val browserActionNs: TypeofbrowserAction
  /**
    * Use the `browser.browserSettings` API to control global settings of the browser.
    *
    * Permissions: `browserSettings`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val browserSettingsNs: TypeofbrowserSettings
  /**
    * Use the `browser.browsingData` API to remove browsing data from a user's local profile.
    *
    * Permissions: `browsingData`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val browsingDataNs: TypeofbrowsingData
  /**
    * Offers the ability to write to the clipboard. Reading is not supported because the clipboard can already be read
    * through the standard web platform APIs.
    *
    * Permissions: `clipboardWrite`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val clipboardNs: Typeofclipboard
  /**
    * Use the commands API to add keyboard shortcuts that trigger actions in your extension, for example, an action to
    * open the browser action or send a command to the xtension.
    *
    * Manifest keys: `commands`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val commandsNs: Typeofcommands
  /** Not allowed in: Content scripts, Devtools pages */
  val contentScriptsNs: TypeofcontentScripts
  /**
    * Use the browser.contextMenus API to add items to the browser's context menu. You can choose what types of objects
    * your context menu additions apply to, such as images, hyperlinks, and pages.
    *
    * Permissions: `contextMenus`
    */
  val contextMenusNs: TypeofcontextMenus
  /**
    * Use the `browser.contextualIdentities` API to query and modify contextual identity, also called as containers.
    *
    * Permissions: `contextualIdentities`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val contextualIdentitiesNs: TypeofcontextualIdentities
  /**
    * Use the `browser.cookies` API to query and modify cookies, and to be notified when they change.
    *
    * Permissions: `cookies`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val cookiesNs: Typeofcookies
  /**
    * Manifest keys: `devtools_page`
    *
    * Allowed in: Devtools pages only
    */
  val devtoolsNs: Typeofdevtools
  /**
    * Asynchronous DNS API
    *
    * Permissions: `dns`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val dnsNs: Typeofdns
  /**
    * Permissions: `downloads`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val downloadsNs: Typeofdownloads
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
  val extensionNs: Typeofextension
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
  val findNs: Typeoffind
  /**
    * Exposes the browser's profiler.
    *
    * Permissions: `geckoProfiler`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val geckoProfilerNs: TypeofgeckoProfiler
  /**
    * Use the `browser.history` API to interact with the browser's record of visited pages. You can add, remove, and query
    * for URLs in the browser's history. To override the history page with your own version, see Override Pages.
    *
    * Permissions: `history`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val historyNs: Typeofhistory
  /**
    * Use the `browser.i18n` infrastructure to implement internationalization across your whole app or extension.
    */
  val i18nNs: Typeofi18n
  /**
    * Use the browser.identity API to get OAuth2 access tokens.
    *
    * Permissions: `identity`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val identityNs: Typeofidentity
  /**
    * Use the `browser.idle` API to detect when the machine's idle state changes.
    *
    * Permissions: `idle`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val idleNs: Typeofidle
  /**
    * The `browser.management` API provides ways to manage the list of extensions that are installed and running.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val managementNs: Typeofmanagement
  /**
    * Use the browser.menus API to add items to the browser's menus. You can choose what types of objects your context
    * menu additions apply to, such as images, hyperlinks, and pages.
    *
    * Permissions: `menus`, `menus`
    */
  val menusNs: Typeofmenus
  /**
    * Permissions: `notifications`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val notificationsNs: Typeofnotifications
  /**
    * The omnibox API allows you to register a keyword with Firefox's address bar.
    *
    * Manifest keys: `omnibox`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val omniboxNs: Typeofomnibox
  /**
    * Use the `browser.pageAction` API to put icons inside the address bar. Page actions represent actions that can be
    * taken on the current page, but that aren't applicable to all pages.
    *
    * Manifest keys: `page_action`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val pageActionNs: TypeofpageAction
  /**
    * Manifest keys: `optional_permissions`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val permissionsNs: Typeofpermissions
  /**
    * PKCS#11 module management API
    *
    * Permissions: `pkcs11`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val pkcs11Ns: Typeofpkcs11
  /**
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val privacyNs: Typeofprivacy
  /**
    * Use the browser.proxy API to register proxy scripts in Firefox. Proxy scripts in Firefox are proxy auto-config files
    * with extra contextual information and support for additional return types.
    *
    * Permissions: `proxy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val proxyNs: Typeofproxy
  /**
    * Use the `browser.runtime` API to retrieve the background page, return details about the manifest, and listen for and
    * respond to events in the app or extension lifecycle. You can also use this API to convert the relative path of URLs
    * to fully-qualified URLs.
    *
    * Allowed in: Proxy scripts
    */
  val runtimeNs: Typeofruntime
  /**
    * Use browser.search to interact with search engines.
    *
    * Permissions: `search`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val searchNs: Typeofsearch
  /**
    * Use the `browser.sessions` API to query and restore tabs and windows from a browsing session.
    *
    * Permissions: `sessions`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val sessionsNs: Typeofsessions
  /**
    * Use sidebar actions to add a sidebar to Firefox.
    *
    * Manifest keys: `sidebar_action`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val sidebarActionNs: TypeofsidebarAction
  /**
    * Use the `browser.storage` API to store, retrieve, and track changes to user data.
    *
    * Permissions: `storage`
    */
  val storageNs: Typeofstorage
  /**
    * Use the `browser.tabs` API to interact with the browser's tab system. You can use this API to create, modify, and
    * rearrange tabs in the browser.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val tabsNs: Typeoftabs
  /**
    * Use the `browser.telemetry` API to send telemetry data to the Mozilla Telemetry service. Restricted to Mozilla
    * privileged webextensions.
    *
    * Permissions: `telemetry`, `mozillaAddons`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val telemetryNs: Typeoftelemetry
  /**
    * The theme API allows customizing of visual elements of the browser.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val themeNs: Typeoftheme
  /**
    * Use the browser.topSites API to access the top sites that are displayed on the new tab page.
    *
    * Permissions: `topSites`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val topSitesNs: TypeoftopSites
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
  val userScriptsNs: TypeofuserScripts
  /**
    * Use the `browser.webNavigation` API to receive notifications about the status of navigation requests in-flight.
    *
    * Permissions: `webNavigation`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val webNavigationNs: TypeofwebNavigation
  /**
    * Use the `browser.webRequest` API to observe and analyze traffic and to intercept, block, or modify requests
    * in-flight.
    *
    * Permissions: `webRequest`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val webRequestNs: TypeofwebRequest
  /**
    * Use the `browser.windows` API to interact with browser windows. You can use this API to create, modify, and
    * rearrange windows in the browser.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val windowsNs: Typeofwindows
}

object Typeofbrowser {
  @scala.inline
  def apply(
    alarmsNs: Typeofalarms,
    bookmarksNs: Typeofbookmarks,
    browserActionNs: TypeofbrowserAction,
    browserSettingsNs: TypeofbrowserSettings,
    browsingDataNs: TypeofbrowsingData,
    clipboardNs: Typeofclipboard,
    commandsNs: Typeofcommands,
    contentScriptsNs: TypeofcontentScripts,
    contextMenusNs: TypeofcontextMenus,
    contextualIdentitiesNs: TypeofcontextualIdentities,
    cookiesNs: Typeofcookies,
    devtoolsNs: Typeofdevtools,
    dnsNs: Typeofdns,
    downloadsNs: Typeofdownloads,
    eventsNs: js.Any,
    experimentsNs: js.Any,
    extensionNs: Typeofextension,
    extensionTypesNs: js.Any,
    findNs: Typeoffind,
    geckoProfilerNs: TypeofgeckoProfiler,
    historyNs: Typeofhistory,
    i18nNs: Typeofi18n,
    identityNs: Typeofidentity,
    idleNs: Typeofidle,
    managementNs: Typeofmanagement,
    menusNs: Typeofmenus,
    notificationsNs: Typeofnotifications,
    omniboxNs: Typeofomnibox,
    pageActionNs: TypeofpageAction,
    permissionsNs: Typeofpermissions,
    pkcs11Ns: Typeofpkcs11,
    privacyNs: Typeofprivacy,
    proxyNs: Typeofproxy,
    runtimeNs: Typeofruntime,
    searchNs: Typeofsearch,
    sessionsNs: Typeofsessions,
    sidebarActionNs: TypeofsidebarAction,
    storageNs: Typeofstorage,
    tabsNs: Typeoftabs,
    telemetryNs: Typeoftelemetry,
    themeNs: Typeoftheme,
    topSitesNs: TypeoftopSites,
    typesNs: js.Any,
    underscoreManifestNs: js.Any,
    userScriptsNs: TypeofuserScripts,
    webNavigationNs: TypeofwebNavigation,
    webRequestNs: TypeofwebRequest,
    windowsNs: Typeofwindows
  ): Typeofbrowser = {
    val __obj = js.Dynamic.literal(alarmsNs = alarmsNs, bookmarksNs = bookmarksNs, browserActionNs = browserActionNs, browserSettingsNs = browserSettingsNs, browsingDataNs = browsingDataNs, clipboardNs = clipboardNs, commandsNs = commandsNs, contentScriptsNs = contentScriptsNs, contextMenusNs = contextMenusNs, contextualIdentitiesNs = contextualIdentitiesNs, cookiesNs = cookiesNs, devtoolsNs = devtoolsNs, dnsNs = dnsNs, downloadsNs = downloadsNs, eventsNs = eventsNs, experimentsNs = experimentsNs, extensionNs = extensionNs, extensionTypesNs = extensionTypesNs, findNs = findNs, geckoProfilerNs = geckoProfilerNs, historyNs = historyNs, i18nNs = i18nNs, identityNs = identityNs, idleNs = idleNs, managementNs = managementNs, menusNs = menusNs, notificationsNs = notificationsNs, omniboxNs = omniboxNs, pageActionNs = pageActionNs, permissionsNs = permissionsNs, pkcs11Ns = pkcs11Ns, privacyNs = privacyNs, proxyNs = proxyNs, runtimeNs = runtimeNs, searchNs = searchNs, sessionsNs = sessionsNs, sidebarActionNs = sidebarActionNs, storageNs = storageNs, tabsNs = tabsNs, telemetryNs = telemetryNs, themeNs = themeNs, topSitesNs = topSitesNs, typesNs = typesNs, underscoreManifestNs = underscoreManifestNs, userScriptsNs = userScriptsNs, webNavigationNs = webNavigationNs, webRequestNs = webRequestNs, windowsNs = windowsNs)
  
    __obj.asInstanceOf[Typeofbrowser]
  }
}

