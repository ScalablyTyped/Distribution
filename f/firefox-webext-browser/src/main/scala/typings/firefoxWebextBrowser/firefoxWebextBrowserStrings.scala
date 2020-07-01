package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.activityLog.UndefinedType
import typings.firefoxWebextBrowser.browser.activityLog.UndefinedViewType
import typings.firefoxWebextBrowser.browser.bookmarks.BookmarkTreeNodeType
import typings.firefoxWebextBrowser.browser.browserSettings.ContextMenuMouseEvent
import typings.firefoxWebextBrowser.browser.browserSettings.ImageAnimationBehavior
import typings.firefoxWebextBrowser.browser.captivePortal.Status
import typings.firefoxWebextBrowser.browser.captivePortal.UndefinedState
import typings.firefoxWebextBrowser.browser.clipboard.SetImageData
import typings.firefoxWebextBrowser.browser.contextMenus.ContextType
import typings.firefoxWebextBrowser.browser.contextMenus.ItemType
import typings.firefoxWebextBrowser.browser.contextMenus.OnClickDataModifiers
import typings.firefoxWebextBrowser.browser.contextMenus.OverrideContextContext
import typings.firefoxWebextBrowser.browser.cookies.OnChangedCause
import typings.firefoxWebextBrowser.browser.cookies.SameSiteStatus
import typings.firefoxWebextBrowser.browser.dns._ResolveFlags
import typings.firefoxWebextBrowser.browser.downloads.DangerType
import typings.firefoxWebextBrowser.browser.downloads.DownloadMethod
import typings.firefoxWebextBrowser.browser.downloads.FilenameConflictAction
import typings.firefoxWebextBrowser.browser.downloads.InterruptReason
import typings.firefoxWebextBrowser.browser.downloads.State
import typings.firefoxWebextBrowser.browser.experiments.APIChildScope
import typings.firefoxWebextBrowser.browser.experiments.APIParentScope
import typings.firefoxWebextBrowser.browser.extension.ViewType
import typings.firefoxWebextBrowser.browser.extensionTypes.CSSOrigin
import typings.firefoxWebextBrowser.browser.extensionTypes.ImageFormat
import typings.firefoxWebextBrowser.browser.extensionTypes.RunAt
import typings.firefoxWebextBrowser.browser.geckoProfiler.ProfilerFeature
import typings.firefoxWebextBrowser.browser.idle.IdleState
import typings.firefoxWebextBrowser.browser.management.ExtensionDisabledReason
import typings.firefoxWebextBrowser.browser.management.ExtensionInstallType
import typings.firefoxWebextBrowser.browser.management.ExtensionType
import typings.firefoxWebextBrowser.browser.manifest.ProtocolHandlerProtocol
import typings.firefoxWebextBrowser.browser.manifest.ThemeTypeAdditionalBackgroundsAlignment
import typings.firefoxWebextBrowser.browser.manifest.ThemeTypeAdditionalBackgroundsTiling
import typings.firefoxWebextBrowser.browser.manifest.WebExtensionManifestBrowserActionDefaultArea
import typings.firefoxWebextBrowser.browser.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition
import typings.firefoxWebextBrowser.browser.manifest.WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
import typings.firefoxWebextBrowser.browser.manifest.WebExtensionManifestIncognito
import typings.firefoxWebextBrowser.browser.manifest._OptionalPermission
import typings.firefoxWebextBrowser.browser.manifest._OptionalPermissionNoPrompt
import typings.firefoxWebextBrowser.browser.manifest._PermissionNoPrompt
import typings.firefoxWebextBrowser.browser.networkStatus.NetworkLinkInfoStatus
import typings.firefoxWebextBrowser.browser.networkStatus.NetworkLinkInfoType
import typings.firefoxWebextBrowser.browser.notifications.PermissionLevel
import typings.firefoxWebextBrowser.browser.notifications.TemplateType
import typings.firefoxWebextBrowser.browser.omnibox.DescriptionStyleType
import typings.firefoxWebextBrowser.browser.omnibox.OnInputEnteredDisposition
import typings.firefoxWebextBrowser.browser.privacy.network.IPHandlingPolicy
import typings.firefoxWebextBrowser.browser.privacy.network.TlsVersionRestrictionConfigMaximum
import typings.firefoxWebextBrowser.browser.privacy.network.TlsVersionRestrictionConfigMinimum
import typings.firefoxWebextBrowser.browser.privacy.websites.CookieConfigBehavior
import typings.firefoxWebextBrowser.browser.privacy.websites.TrackingProtectionModeOption
import typings.firefoxWebextBrowser.browser.proxy.ProxyConfigProxyType
import typings.firefoxWebextBrowser.browser.runtime.OnInstalledReason
import typings.firefoxWebextBrowser.browser.runtime.OnRestartRequiredReason
import typings.firefoxWebextBrowser.browser.runtime.PlatformArch
import typings.firefoxWebextBrowser.browser.runtime.PlatformOs
import typings.firefoxWebextBrowser.browser.runtime.RequestUpdateCheckStatus
import typings.firefoxWebextBrowser.browser.tabs.MutedInfoReason
import typings.firefoxWebextBrowser.browser.tabs.QueryScreen
import typings.firefoxWebextBrowser.browser.tabs.TabStatus
import typings.firefoxWebextBrowser.browser.tabs.UpdatePropertyName
import typings.firefoxWebextBrowser.browser.tabs.ZoomSettingsMode
import typings.firefoxWebextBrowser.browser.tabs.ZoomSettingsScope
import typings.firefoxWebextBrowser.browser.telemetry.ScalarType
import typings.firefoxWebextBrowser.browser.topSites.MostVisitedURLType
import typings.firefoxWebextBrowser.browser.types.LevelOfControl
import typings.firefoxWebextBrowser.browser.types.SettingScope
import typings.firefoxWebextBrowser.browser.urlbar.EngagementState
import typings.firefoxWebextBrowser.browser.urlbar.ResultType
import typings.firefoxWebextBrowser.browser.urlbar.SourceType
import typings.firefoxWebextBrowser.browser.webNavigation.TransitionQualifier
import typings.firefoxWebextBrowser.browser.webNavigation.TransitionType
import typings.firefoxWebextBrowser.browser.webRequest.CertificateTransparencyStatus
import typings.firefoxWebextBrowser.browser.webRequest.OnAuthRequiredOptions
import typings.firefoxWebextBrowser.browser.webRequest.OnBeforeRequestOptions
import typings.firefoxWebextBrowser.browser.webRequest.OnBeforeSendHeadersOptions
import typings.firefoxWebextBrowser.browser.webRequest.OnHeadersReceivedOptions
import typings.firefoxWebextBrowser.browser.webRequest.ResourceType
import typings.firefoxWebextBrowser.browser.webRequest.SecurityInfoProtocolVersion
import typings.firefoxWebextBrowser.browser.webRequest.SecurityInfoState
import typings.firefoxWebextBrowser.browser.webRequest.UrlClassificationFlags
import typings.firefoxWebextBrowser.browser.windows.CreateType
import typings.firefoxWebextBrowser.browser.windows.WindowState
import typings.firefoxWebextBrowser.browser.windows.WindowType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object firefoxWebextBrowserStrings {
  @js.native
  sealed trait `2g` extends NetworkLinkInfoType
  
  @js.native
  sealed trait `3g` extends NetworkLinkInfoType
  
  @js.native
  sealed trait `4g` extends NetworkLinkInfoType
  
  @js.native
  sealed trait Alt
    extends OnClickDataModifiers
       with typings.firefoxWebextBrowser.browser.menus.OnClickDataModifiers
       with typings.firefoxWebextBrowser.browser.pageAction.OnClickDataModifiers
       with typings.firefoxWebextBrowser.browser.browserAction.OnClickDataModifiers
  
  @js.native
  sealed trait Application extends QueryScreen
  
  @js.native
  sealed trait CRASH extends InterruptReason
  
  @js.native
  sealed trait Command
    extends OnClickDataModifiers
       with typings.firefoxWebextBrowser.browser.menus.OnClickDataModifiers
       with typings.firefoxWebextBrowser.browser.pageAction.OnClickDataModifiers
       with typings.firefoxWebextBrowser.browser.browserAction.OnClickDataModifiers
  
  @js.native
  sealed trait Ctrl
    extends OnClickDataModifiers
       with typings.firefoxWebextBrowser.browser.menus.OnClickDataModifiers
       with typings.firefoxWebextBrowser.browser.pageAction.OnClickDataModifiers
       with typings.firefoxWebextBrowser.browser.browserAction.OnClickDataModifiers
  
  @js.native
  sealed trait FILE_ACCESS_DENIED extends InterruptReason
  
  @js.native
  sealed trait FILE_BLOCKED extends InterruptReason
  
  @js.native
  sealed trait FILE_FAILED extends InterruptReason
  
  @js.native
  sealed trait FILE_NAME_TOO_LONG extends InterruptReason
  
  @js.native
  sealed trait FILE_NO_SPACE extends InterruptReason
  
  @js.native
  sealed trait FILE_SECURITY_CHECK_FAILED extends InterruptReason
  
  @js.native
  sealed trait FILE_TOO_LARGE extends InterruptReason
  
  @js.native
  sealed trait FILE_TOO_SHORT extends InterruptReason
  
  @js.native
  sealed trait FILE_TRANSIENT_ERROR extends InterruptReason
  
  @js.native
  sealed trait FILE_VIRUS_INFECTED extends InterruptReason
  
  @js.native
  sealed trait GET extends DownloadMethod
  
  @js.native
  sealed trait Lessthansignall_urlsGreaterthansign extends js.Object
  
  @js.native
  sealed trait MacCtrl
    extends OnClickDataModifiers
       with typings.firefoxWebextBrowser.browser.menus.OnClickDataModifiers
       with typings.firefoxWebextBrowser.browser.pageAction.OnClickDataModifiers
       with typings.firefoxWebextBrowser.browser.browserAction.OnClickDataModifiers
  
  @js.native
  sealed trait NETWORK_DISCONNECTED extends InterruptReason
  
  @js.native
  sealed trait NETWORK_FAILED extends InterruptReason
  
  @js.native
  sealed trait NETWORK_INVALID_REQUEST extends InterruptReason
  
  @js.native
  sealed trait NETWORK_SERVER_DOWN extends InterruptReason
  
  @js.native
  sealed trait NETWORK_TIMEOUT extends InterruptReason
  
  @js.native
  sealed trait POST extends DownloadMethod
  
  @js.native
  sealed trait SERVER_BAD_CONTENT extends InterruptReason
  
  @js.native
  sealed trait SERVER_CERT_PROBLEM extends InterruptReason
  
  @js.native
  sealed trait SERVER_FAILED extends InterruptReason
  
  @js.native
  sealed trait SERVER_FORBIDDEN extends InterruptReason
  
  @js.native
  sealed trait SERVER_NO_RANGE extends InterruptReason
  
  @js.native
  sealed trait SERVER_UNAUTHORIZED extends InterruptReason
  
  @js.native
  sealed trait Screen extends QueryScreen
  
  @js.native
  sealed trait Shift
    extends OnClickDataModifiers
       with typings.firefoxWebextBrowser.browser.menus.OnClickDataModifiers
       with typings.firefoxWebextBrowser.browser.pageAction.OnClickDataModifiers
       with typings.firefoxWebextBrowser.browser.browserAction.OnClickDataModifiers
  
  @js.native
  sealed trait TLSv1
    extends SecurityInfoProtocolVersion
       with TlsVersionRestrictionConfigMaximum
       with TlsVersionRestrictionConfigMinimum
  
  @js.native
  sealed trait TLSv1Dot1
    extends SecurityInfoProtocolVersion
       with TlsVersionRestrictionConfigMaximum
       with TlsVersionRestrictionConfigMinimum
  
  @js.native
  sealed trait TLSv1Dot2
    extends SecurityInfoProtocolVersion
       with TlsVersionRestrictionConfigMaximum
       with TlsVersionRestrictionConfigMinimum
  
  @js.native
  sealed trait TLSv1Dot3
    extends SecurityInfoProtocolVersion
       with TlsVersionRestrictionConfigMaximum
       with TlsVersionRestrictionConfigMinimum
  
  @js.native
  sealed trait USER_CANCELED extends InterruptReason
  
  @js.native
  sealed trait USER_SHUTDOWN extends InterruptReason
  
  @js.native
  sealed trait Window extends QueryScreen
  
  @js.native
  sealed trait _empty extends js.Object
  
  @js.native
  sealed trait abandonment extends EngagementState
  
  @js.native
  sealed trait accepted extends DangerType
  
  @js.native
  sealed trait active extends IdleState
  
  @js.native
  sealed trait activeTab extends _OptionalPermissionNoPrompt
  
  @js.native
  sealed trait activityLog extends _PermissionNoPrompt
  
  @js.native
  sealed trait addon_child extends APIChildScope
  
  @js.native
  sealed trait addon_parent extends APIParentScope
  
  @js.native
  sealed trait alarms extends _PermissionNoPrompt
  
  @js.native
  sealed trait all
    extends ContextType
       with typings.firefoxWebextBrowser.browser.menus.ContextType
  
  @js.native
  sealed trait allow_all extends CookieConfigBehavior
  
  @js.native
  sealed trait allow_name_collisions extends _ResolveFlags
  
  @js.native
  sealed trait allow_visited extends CookieConfigBehavior
  
  @js.native
  sealed trait always extends TrackingProtectionModeOption
  
  @js.native
  sealed trait android extends PlatformOs
  
  @js.native
  sealed trait any_basic_tracking extends UrlClassificationFlags
  
  @js.native
  sealed trait any_social_tracking extends UrlClassificationFlags
  
  @js.native
  sealed trait any_strict_tracking extends UrlClassificationFlags
  
  @js.native
  sealed trait api_call extends UndefinedType
  
  @js.native
  sealed trait api_event extends UndefinedType
  
  @js.native
  sealed trait app
    extends WindowType
       with typings.firefoxWebextBrowser.browser.tabs.WindowType
  
  @js.native
  sealed trait app_update extends OnRestartRequiredReason
  
  @js.native
  sealed trait arm extends PlatformArch
  
  @js.native
  sealed trait asyncBlocking extends OnAuthRequiredOptions
  
  @js.native
  sealed trait attention extends UpdatePropertyName
  
  @js.native
  sealed trait audible extends UpdatePropertyName
  
  @js.native
  sealed trait audio
    extends ContextType
       with typings.firefoxWebextBrowser.browser.menus.ContextType
  
  @js.native
  sealed trait author extends CSSOrigin
  
  @js.native
  sealed trait autoConfig extends ProxyConfigProxyType
  
  @js.native
  sealed trait autoDetect extends ProxyConfigProxyType
  
  @js.native
  sealed trait auto_bookmark
    extends TransitionType
       with typings.firefoxWebextBrowser.browser.history.TransitionType
  
  @js.native
  sealed trait auto_subframe
    extends TransitionType
       with typings.firefoxWebextBrowser.browser.history.TransitionType
  
  @js.native
  sealed trait auto_toplevel
    extends typings.firefoxWebextBrowser.browser.history.TransitionType
  
  @js.native
  sealed trait automatic extends ZoomSettingsMode
  
  @js.native
  sealed trait background extends UndefinedViewType
  
  @js.native
  sealed trait basic extends TemplateType
  
  @js.native
  sealed trait beacon extends ResourceType
  
  @js.native
  sealed trait bitcoin extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait blocking
    extends OnAuthRequiredOptions
       with OnBeforeRequestOptions
       with OnBeforeSendHeadersOptions
       with OnHeadersReceivedOptions
  
  @js.native
  sealed trait bookmark
    extends BookmarkTreeNodeType
       with ContextType
       with typings.firefoxWebextBrowser.browser.menus.ContextType
       with OverrideContextContext
       with typings.firefoxWebextBrowser.browser.menus.OverrideContextContext
  
  @js.native
  sealed trait bookmarks
    extends SourceType
       with _OptionalPermission
  
  @js.native
  sealed trait boolean extends ScalarType
  
  @js.native
  sealed trait bottom extends ThemeTypeAdditionalBackgroundsAlignment
  
  @js.native
  sealed trait broken extends SecurityInfoState
  
  @js.native
  sealed trait browserSettings extends _OptionalPermission
  
  @js.native
  sealed trait browser_action
    extends ContextType
       with typings.firefoxWebextBrowser.browser.menus.ContextType
  
  @js.native
  sealed trait browser_update extends OnInstalledReason
  
  @js.native
  sealed trait browsingData extends _OptionalPermission
  
  @js.native
  sealed trait bypass_cache extends _ResolveFlags
  
  @js.native
  sealed trait canonical_name extends _ResolveFlags
  
  @js.native
  sealed trait captive extends Status
  
  @js.native
  sealed trait captivePortal extends _PermissionNoPrompt
  
  @js.native
  sealed trait capture extends MutedInfoReason
  
  @js.native
  sealed trait center extends ThemeTypeAdditionalBackgroundsAlignment
  
  @js.native
  sealed trait `center bottom` extends ThemeTypeAdditionalBackgroundsAlignment
  
  @js.native
  sealed trait `center center` extends ThemeTypeAdditionalBackgroundsAlignment
  
  @js.native
  sealed trait `center top` extends ThemeTypeAdditionalBackgroundsAlignment
  
  @js.native
  sealed trait checkbox
    extends ItemType
       with typings.firefoxWebextBrowser.browser.menus.ItemType
  
  @js.native
  sealed trait cipher extends js.Object
  
  @js.native
  sealed trait clear extends Status
  
  @js.native
  sealed trait client_redirect extends TransitionQualifier
  
  @js.native
  sealed trait clipboardRead extends _OptionalPermission
  
  @js.native
  sealed trait clipboardWrite extends _OptionalPermission
  
  @js.native
  sealed trait complete
    extends State
       with TabStatus
  
  @js.native
  sealed trait content extends DangerType
  
  @js.native
  sealed trait content_child extends APIChildScope
  
  @js.native
  sealed trait content_parent extends APIParentScope
  
  @js.native
  sealed trait content_script extends UndefinedType
  
  @js.native
  sealed trait contextMenus extends _PermissionNoPrompt
  
  @js.native
  sealed trait contextmenu extends WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  
  @js.native
  sealed trait contextualIdentities extends _PermissionNoPrompt
  
  @js.native
  sealed trait controllable_by_this_extension extends LevelOfControl
  
  @js.native
  sealed trait controlled_by_other_extensions extends LevelOfControl
  
  @js.native
  sealed trait controlled_by_this_extension extends LevelOfControl
  
  @js.native
  sealed trait cookies extends _OptionalPermissionNoPrompt
  
  @js.native
  sealed trait count extends ScalarType
  
  @js.native
  sealed trait cros extends PlatformOs
  
  @js.native
  sealed trait cryptomining extends UrlClassificationFlags
  
  @js.native
  sealed trait cryptomining_content extends UrlClassificationFlags
  
  @js.native
  sealed trait csp_report extends ResourceType
  
  @js.native
  sealed trait currentTab extends OnInputEnteredDisposition
  
  @js.native
  sealed trait dat extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait default extends IPHandlingPolicy
  
  @js.native
  sealed trait default_public_and_private_interfaces extends IPHandlingPolicy
  
  @js.native
  sealed trait default_public_interface_only extends IPHandlingPolicy
  
  @js.native
  sealed trait denied extends PermissionLevel
  
  @js.native
  sealed trait detached_panel extends CreateType
  
  @js.native
  sealed trait development extends ExtensionInstallType
  
  @js.native
  sealed trait devtools
    extends WindowType
       with typings.firefoxWebextBrowser.browser.tabs.WindowType
       with _OptionalPermission
  
  @js.native
  sealed trait devtools_child extends APIChildScope
  
  @js.native
  sealed trait devtools_page extends UndefinedViewType
  
  @js.native
  sealed trait devtools_panel extends UndefinedViewType
  
  @js.native
  sealed trait devtools_parent extends APIParentScope
  
  @js.native
  sealed trait dim extends DescriptionStyleType
  
  @js.native
  sealed trait disable_ipv4 extends _ResolveFlags
  
  @js.native
  sealed trait disable_ipv6 extends _ResolveFlags
  
  @js.native
  sealed trait disable_non_proxied_udp extends IPHandlingPolicy
  
  @js.native
  sealed trait disable_trr extends _ResolveFlags
  
  @js.native
  sealed trait disabled extends ZoomSettingsMode
  
  @js.native
  sealed trait discard extends EngagementState
  
  @js.native
  sealed trait discarded extends UpdatePropertyName
  
  @js.native
  sealed trait dns extends _PermissionNoPrompt
  
  @js.native
  sealed trait docked extends WindowState
  
  @js.native
  sealed trait document_end extends RunAt
  
  @js.native
  sealed trait document_idle extends RunAt
  
  @js.native
  sealed trait document_start extends RunAt
  
  @js.native
  sealed trait down extends NetworkLinkInfoStatus
  
  @js.native
  sealed trait downloads extends _OptionalPermission
  
  @js.native
  sealed trait downloadsDotopen extends _OptionalPermission
  
  @js.native
  sealed trait dweb extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait editable
    extends ContextType
       with typings.firefoxWebextBrowser.browser.menus.ContextType
  
  @js.native
  sealed trait engagement extends EngagementState
  
  @js.native
  sealed trait ethernet extends NetworkLinkInfoType
  
  @js.native
  sealed trait evicted extends OnChangedCause
  
  @js.native
  sealed trait expired extends OnChangedCause
  
  @js.native
  sealed trait expired_overwrite extends OnChangedCause
  
  @js.native
  sealed trait explicit extends OnChangedCause
  
  @js.native
  sealed trait extension
    extends ExtensionType
       with MutedInfoReason
  
  @js.native
  sealed trait favIconUrl extends UpdatePropertyName
  
  @js.native
  sealed trait file extends DangerType
  
  @js.native
  sealed trait fileio extends ProfilerFeature
  
  @js.native
  sealed trait fileioall extends ProfilerFeature
  
  @js.native
  sealed trait find extends _OptionalPermission
  
  @js.native
  sealed trait fingerprinting extends UrlClassificationFlags
  
  @js.native
  sealed trait fingerprinting_content extends UrlClassificationFlags
  
  @js.native
  sealed trait folder extends BookmarkTreeNodeType
  
  @js.native
  sealed trait font extends ResourceType
  
  @js.native
  sealed trait form_submit
    extends TransitionType
       with typings.firefoxWebextBrowser.browser.history.TransitionType
  
  @js.native
  sealed trait forward_back extends TransitionQualifier
  
  @js.native
  sealed trait frame
    extends ContextType
       with typings.firefoxWebextBrowser.browser.menus.ContextType
  
  @js.native
  sealed trait from_address_bar extends TransitionQualifier
  
  @js.native
  sealed trait fullscreen extends WindowState
  
  @js.native
  sealed trait geckoProfiler extends _PermissionNoPrompt
  
  @js.native
  sealed trait generated
    extends TransitionType
       with typings.firefoxWebextBrowser.browser.history.TransitionType
  
  @js.native
  sealed trait geo extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait geolocation extends _OptionalPermission
  
  @js.native
  sealed trait gopher extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait granted extends PermissionLevel
  
  @js.native
  sealed trait hidden extends UpdatePropertyName
  
  @js.native
  sealed trait history
    extends SourceType
       with _OptionalPermission
  
  @js.native
  sealed trait homepage extends WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  
  @js.native
  sealed trait host extends DangerType
  
  @js.native
  sealed trait identity extends _PermissionNoPrompt
  
  @js.native
  sealed trait idle
    extends IdleState
       with _OptionalPermissionNoPrompt
  
  @js.native
  sealed trait im extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait image
    extends ContextType
       with typings.firefoxWebextBrowser.browser.menus.ContextType
       with ResourceType
       with TemplateType
  
  @js.native
  sealed trait imageset extends ResourceType
  
  @js.native
  sealed trait in_progress extends State
  
  @js.native
  sealed trait inactive extends js.Object
  
  @js.native
  sealed trait incognito_persistent extends SettingScope
  
  @js.native
  sealed trait incognito_session_only extends SettingScope
  
  @js.native
  sealed trait insecure extends SecurityInfoState
  
  @js.native
  sealed trait install extends OnInstalledReason
  
  @js.native
  sealed trait interrupted extends State
  
  @js.native
  sealed trait ipcmessages extends ProfilerFeature
  
  @js.native
  sealed trait ipfs extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait ipns extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait irc extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait ircs extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait isArticle extends UpdatePropertyName
  
  @js.native
  sealed trait java_ extends ProfilerFeature
  
  @js.native
  sealed trait jpeg
    extends ImageFormat
       with SetImageData
  
  @js.native
  sealed trait js_ extends ProfilerFeature
  
  @js.native
  sealed trait jsallocations extends ProfilerFeature
  
  @js.native
  sealed trait jstracer extends ProfilerFeature
  
  @js.native
  sealed trait keyword
    extends TransitionType
       with typings.firefoxWebextBrowser.browser.history.TransitionType
       with WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  
  @js.native
  sealed trait keyword_generated
    extends TransitionType
       with typings.firefoxWebextBrowser.browser.history.TransitionType
  
  @js.native
  sealed trait launcher
    extends ContextType
       with typings.firefoxWebextBrowser.browser.menus.ContextType
  
  @js.native
  sealed trait lax extends SameSiteStatus
  
  @js.native
  sealed trait leaf extends ProfilerFeature
  
  @js.native
  sealed trait left extends ThemeTypeAdditionalBackgroundsAlignment
  
  @js.native
  sealed trait `left bottom` extends ThemeTypeAdditionalBackgroundsAlignment
  
  @js.native
  sealed trait `left center` extends ThemeTypeAdditionalBackgroundsAlignment
  
  @js.native
  sealed trait `left top` extends ThemeTypeAdditionalBackgroundsAlignment
  
  @js.native
  sealed trait link
    extends ContextType
       with typings.firefoxWebextBrowser.browser.menus.ContextType
       with TransitionType
       with typings.firefoxWebextBrowser.browser.history.TransitionType
  
  @js.native
  sealed trait linux extends PlatformOs
  
  @js.native
  sealed trait list extends TemplateType
  
  @js.native
  sealed trait loading extends TabStatus
  
  @js.native
  sealed trait local extends SourceType
  
  @js.native
  sealed trait locked_portal extends UndefinedState
  
  @js.native
  sealed trait mac extends PlatformOs
  
  @js.native
  sealed trait magnet extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait mailto extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait main_frame extends ResourceType
  
  @js.native
  sealed trait mainthreadio extends ProfilerFeature
  
  @js.native
  sealed trait managed extends js.Object
  
  @js.native
  sealed trait management extends _OptionalPermission
  
  @js.native
  sealed trait manual
    extends ProxyConfigProxyType
       with ZoomSettingsMode
  
  @js.native
  sealed trait manual_subframe
    extends TransitionType
       with typings.firefoxWebextBrowser.browser.history.TransitionType
  
  @js.native
  sealed trait `match` extends DescriptionStyleType
  
  @js.native
  sealed trait maximized extends WindowState
  
  @js.native
  sealed trait media extends ResourceType
  
  @js.native
  sealed trait menupanel extends WebExtensionManifestBrowserActionDefaultArea
  
  @js.native
  sealed trait menus extends _PermissionNoPrompt
  
  @js.native
  sealed trait menusDotoverrideContext extends _OptionalPermissionNoPrompt
  
  @js.native
  sealed trait minimized extends WindowState
  
  @js.native
  sealed trait mms extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait mousedown extends ContextMenuMouseEvent
  
  @js.native
  sealed trait mouseup extends ContextMenuMouseEvent
  
  @js.native
  sealed trait mozillaAddons extends _PermissionNoPrompt
  
  @js.native
  sealed trait mutedInfo extends UpdatePropertyName
  
  @js.native
  sealed trait nativeMessaging extends js.Object
  
  @js.native
  sealed trait nativeallocations extends ProfilerFeature
  
  @js.native
  sealed trait navbar extends WebExtensionManifestBrowserActionDefaultArea
  
  @js.native
  sealed trait network extends SourceType
  
  @js.native
  sealed trait networkStatus extends _PermissionNoPrompt
  
  @js.native
  sealed trait never extends TrackingProtectionModeOption
  
  @js.native
  sealed trait newBackgroundTab extends OnInputEnteredDisposition
  
  @js.native
  sealed trait newForegroundTab extends OnInputEnteredDisposition
  
  @js.native
  sealed trait news extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait newtab extends WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  
  @js.native
  sealed trait nntp extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait `no-repeat` extends ThemeTypeAdditionalBackgroundsTiling
  
  @js.native
  sealed trait no_restriction extends SameSiteStatus
  
  @js.native
  sealed trait no_update extends RequestUpdateCheckStatus
  
  @js.native
  sealed trait noiostacks extends ProfilerFeature
  
  @js.native
  sealed trait none
    extends ImageAnimationBehavior
       with ProxyConfigProxyType
  
  @js.native
  sealed trait normal
    extends CreateType
       with ExtensionInstallType
       with ImageAnimationBehavior
       with ItemType
       with typings.firefoxWebextBrowser.browser.menus.ItemType
       with WindowState
       with WindowType
       with typings.firefoxWebextBrowser.browser.tabs.WindowType
  
  @js.native
  sealed trait normandyAddonStudy extends _PermissionNoPrompt
  
  @js.native
  sealed trait nostacksampling extends ProfilerFeature
  
  @js.native
  sealed trait not_allowed extends WebExtensionManifestIncognito
  
  @js.native
  sealed trait not_applicable extends CertificateTransparencyStatus
  
  @js.native
  sealed trait not_captive extends UndefinedState
  
  @js.native
  sealed trait not_controllable extends LevelOfControl
  
  @js.native
  sealed trait notifications extends _OptionalPermission
  
  @js.native
  sealed trait `object` extends ResourceType
  
  @js.native
  sealed trait object_subrequest extends ResourceType
  
  @js.native
  sealed trait offline extends _ResolveFlags
  
  @js.native
  sealed trait once extends ImageAnimationBehavior
  
  @js.native
  sealed trait openbsd extends PlatformOs
  
  @js.native
  sealed trait os_update extends OnRestartRequiredReason
  
  @js.native
  sealed trait other
    extends ExtensionInstallType
       with ResourceType
  
  @js.native
  sealed trait overwrite
    extends FilenameConflictAction
       with OnChangedCause
  
  @js.native
  sealed trait page
    extends ContextType
       with typings.firefoxWebextBrowser.browser.menus.ContextType
  
  @js.native
  sealed trait page_action
    extends ContextType
       with typings.firefoxWebextBrowser.browser.menus.ContextType
  
  @js.native
  sealed trait panel
    extends CreateType
       with WindowType
       with typings.firefoxWebextBrowser.browser.tabs.WindowType
  
  @js.native
  sealed trait password
    extends ContextType
       with typings.firefoxWebextBrowser.browser.menus.ContextType
  
  @js.native
  sealed trait `per-origin` extends ZoomSettingsScope
  
  @js.native
  sealed trait `per-tab` extends ZoomSettingsScope
  
  @js.native
  sealed trait periodic extends OnRestartRequiredReason
  
  @js.native
  sealed trait permissions_increase extends ExtensionDisabledReason
  
  @js.native
  sealed trait personaltoolbar extends WebExtensionManifestBrowserActionDefaultArea
  
  @js.native
  sealed trait ping extends ResourceType
  
  @js.native
  sealed trait pinned extends UpdatePropertyName
  
  @js.native
  sealed trait pkcs11 extends _OptionalPermission
  
  @js.native
  sealed trait png
    extends ImageFormat
       with SetImageData
  
  @js.native
  sealed trait policy_compliant extends CertificateTransparencyStatus
  
  @js.native
  sealed trait policy_not_diverse_scts extends CertificateTransparencyStatus
  
  @js.native
  sealed trait policy_not_enough_scts extends CertificateTransparencyStatus
  
  @js.native
  sealed trait popup
    extends CreateType
       with UndefinedViewType
       with ViewType
       with WindowType
       with typings.firefoxWebextBrowser.browser.tabs.WindowType
  
  @js.native
  sealed trait pref extends WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition
  
  @js.native
  sealed trait preferencereads extends ProfilerFeature
  
  @js.native
  sealed trait priority_low extends _ResolveFlags
  
  @js.native
  sealed trait priority_medium extends _ResolveFlags
  
  @js.native
  sealed trait privacy extends _OptionalPermission
  
  @js.native
  sealed trait private_browsing extends TrackingProtectionModeOption
  
  @js.native
  sealed trait progress extends TemplateType
  
  @js.native
  sealed trait prompt extends FilenameConflictAction
  
  @js.native
  sealed trait proxy extends _OptionalPermission
  
  @js.native
  sealed trait proxy_only extends IPHandlingPolicy
  
  @js.native
  sealed trait purpose extends WebExtensionManifestChromeSettingsOverridesSearchProviderParamsCondition
  
  @js.native
  sealed trait radio
    extends ItemType
       with typings.firefoxWebextBrowser.browser.menus.ItemType
  
  @js.native
  sealed trait regular extends SettingScope
  
  @js.native
  sealed trait regular_only extends SettingScope
  
  @js.native
  sealed trait reject_all extends CookieConfigBehavior
  
  @js.native
  sealed trait reject_third_party extends CookieConfigBehavior
  
  @js.native
  sealed trait reject_trackers extends CookieConfigBehavior
  
  @js.native
  sealed trait reject_trackers_and_partition_foreign extends CookieConfigBehavior
  
  @js.native
  sealed trait reload
    extends TransitionType
       with typings.firefoxWebextBrowser.browser.history.TransitionType
  
  @js.native
  sealed trait remote_tab extends ResultType
  
  @js.native
  sealed trait repeat extends ThemeTypeAdditionalBackgroundsTiling
  
  @js.native
  sealed trait `repeat-x` extends ThemeTypeAdditionalBackgroundsTiling
  
  @js.native
  sealed trait `repeat-y` extends ThemeTypeAdditionalBackgroundsTiling
  
  @js.native
  sealed trait requestBody extends OnBeforeRequestOptions
  
  @js.native
  sealed trait requestHeaders extends OnBeforeSendHeadersOptions
  
  @js.native
  sealed trait responseHeaders
    extends OnAuthRequiredOptions
       with OnHeadersReceivedOptions
  
  @js.native
  sealed trait responsiveness extends ProfilerFeature
  
  @js.native
  sealed trait restricting extends js.Object
  
  @js.native
  sealed trait right extends ThemeTypeAdditionalBackgroundsAlignment
  
  @js.native
  sealed trait `right bottom` extends ThemeTypeAdditionalBackgroundsAlignment
  
  @js.native
  sealed trait `right center` extends ThemeTypeAdditionalBackgroundsAlignment
  
  @js.native
  sealed trait `right top` extends ThemeTypeAdditionalBackgroundsAlignment
  
  @js.native
  sealed trait safe extends DangerType
  
  @js.native
  sealed trait screenshots extends ProfilerFeature
  
  @js.native
  sealed trait script extends ResourceType
  
  @js.native
  sealed trait search
    extends MostVisitedURLType
       with ResultType
       with SourceType
       with _OptionalPermissionNoPrompt
  
  @js.native
  sealed trait searchbar extends WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose
  
  @js.native
  sealed trait secure extends SecurityInfoState
  
  @js.native
  sealed trait selection
    extends ContextType
       with typings.firefoxWebextBrowser.browser.menus.ContextType
  
  @js.native
  sealed trait separator
    extends BookmarkTreeNodeType
       with ItemType
       with typings.firefoxWebextBrowser.browser.menus.ItemType
  
  @js.native
  sealed trait seqstyle extends ProfilerFeature
  
  @js.native
  sealed trait server_redirect extends TransitionQualifier
  
  @js.native
  sealed trait sessions extends _OptionalPermission
  
  @js.native
  sealed trait sharingState extends UpdatePropertyName
  
  @js.native
  sealed trait sidebar
    extends UndefinedViewType
       with ViewType
  
  @js.native
  sealed trait sideload extends ExtensionInstallType
  
  @js.native
  sealed trait sip extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait sms extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait smsto extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait spanning extends WebExtensionManifestIncognito
  
  @js.native
  sealed trait speculate extends _ResolveFlags
  
  @js.native
  sealed trait speculative extends ResourceType
  
  @js.native
  sealed trait ssb extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait ssh extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait stackwalk extends ProfilerFeature
  
  @js.native
  sealed trait start extends EngagementState
  
  @js.native
  sealed trait start_page extends TransitionType
  
  @js.native
  sealed trait startup extends js.Object
  
  @js.native
  sealed trait status extends UpdatePropertyName
  
  @js.native
  sealed trait stdio extends js.Object
  
  @js.native
  sealed trait storage extends _PermissionNoPrompt
  
  @js.native
  sealed trait strict extends SameSiteStatus
  
  @js.native
  sealed trait string extends ScalarType
  
  @js.native
  sealed trait stylesheet extends ResourceType
  
  @js.native
  sealed trait sub_frame extends ResourceType
  
  @js.native
  sealed trait system extends ProxyConfigProxyType
  
  @js.native
  sealed trait tab
    extends ContextType
       with typings.firefoxWebextBrowser.browser.menus.ContextType
       with OverrideContextContext
       with typings.firefoxWebextBrowser.browser.menus.OverrideContextContext
       with ResultType
       with UndefinedViewType
       with ViewType
  
  @js.native
  sealed trait tabHide extends _OptionalPermission
  
  @js.native
  sealed trait tabs
    extends SourceType
       with _OptionalPermission
  
  @js.native
  sealed trait tabstrip extends WebExtensionManifestBrowserActionDefaultArea
  
  @js.native
  sealed trait tasktracer extends ProfilerFeature
  
  @js.native
  sealed trait tel extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait telemetry extends _PermissionNoPrompt
  
  @js.native
  sealed trait theme
    extends ExtensionType
       with _PermissionNoPrompt
  
  @js.native
  sealed trait threads extends ProfilerFeature
  
  @js.native
  sealed trait throttled extends RequestUpdateCheckStatus
  
  @js.native
  sealed trait tip extends ResultType
  
  @js.native
  sealed trait title extends UpdatePropertyName
  
  @js.native
  sealed trait tools_menu
    extends typings.firefoxWebextBrowser.browser.menus.ContextType
  
  @js.native
  sealed trait top extends ThemeTypeAdditionalBackgroundsAlignment
  
  @js.native
  sealed trait topSites extends _OptionalPermission
  
  @js.native
  sealed trait tracking extends UrlClassificationFlags
  
  @js.native
  sealed trait tracking_ad extends UrlClassificationFlags
  
  @js.native
  sealed trait tracking_analytics extends UrlClassificationFlags
  
  @js.native
  sealed trait tracking_content extends UrlClassificationFlags
  
  @js.native
  sealed trait tracking_social extends UrlClassificationFlags
  
  @js.native
  sealed trait typed
    extends TransitionType
       with typings.firefoxWebextBrowser.browser.history.TransitionType
  
  @js.native
  sealed trait uncommon extends DangerType
  
  @js.native
  sealed trait uniquify extends FilenameConflictAction
  
  @js.native
  sealed trait unknown
    extends ExtensionDisabledReason
       with NetworkLinkInfoStatus
       with NetworkLinkInfoType
       with SecurityInfoProtocolVersion
       with TlsVersionRestrictionConfigMaximum
       with TlsVersionRestrictionConfigMinimum
       with UndefinedState
  
  @js.native
  sealed trait unlimitedStorage extends _PermissionNoPrompt
  
  @js.native
  sealed trait unlocked_portal extends UndefinedState
  
  @js.native
  sealed trait unwanted extends DangerType
  
  @js.native
  sealed trait up extends NetworkLinkInfoStatus
  
  @js.native
  sealed trait update extends OnInstalledReason
  
  @js.native
  sealed trait update_available extends RequestUpdateCheckStatus
  
  @js.native
  sealed trait url
    extends DangerType
       with DescriptionStyleType
       with MostVisitedURLType
       with ResultType
  
  @js.native
  sealed trait urlbar extends _PermissionNoPrompt
  
  @js.native
  sealed trait urn extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait usb extends NetworkLinkInfoType
  
  @js.native
  sealed trait user
    extends CSSOrigin
       with MutedInfoReason
  
  @js.native
  sealed trait user_script extends UndefinedType
  
  @js.native
  sealed trait video
    extends ContextType
       with typings.firefoxWebextBrowser.browser.menus.ContextType
  
  @js.native
  sealed trait weak extends SecurityInfoState
  
  @js.native
  sealed trait webNavigation extends _OptionalPermission
  
  @js.native
  sealed trait webRequest extends _OptionalPermissionNoPrompt
  
  @js.native
  sealed trait webRequestBlocking extends _OptionalPermissionNoPrompt
  
  @js.native
  sealed trait web_manifest extends ResourceType
  
  @js.native
  sealed trait webcal extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait websocket extends ResourceType
  
  @js.native
  sealed trait wifi extends NetworkLinkInfoType
  
  @js.native
  sealed trait wimax extends NetworkLinkInfoType
  
  @js.native
  sealed trait win extends PlatformOs
  
  @js.native
  sealed trait windowLength extends js.Object
  
  @js.native
  sealed trait wtai extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait `x86-32` extends PlatformArch
  
  @js.native
  sealed trait `x86-64` extends PlatformArch
  
  @js.native
  sealed trait xml_dtd extends ResourceType
  
  @js.native
  sealed trait xmlhttprequest extends ResourceType
  
  @js.native
  sealed trait xmpp extends ProtocolHandlerProtocol
  
  @js.native
  sealed trait xslt extends ResourceType
  
  @scala.inline
  def `2g`: `2g` = "2g".asInstanceOf[`2g`]
  @scala.inline
  def `3g`: `3g` = "3g".asInstanceOf[`3g`]
  @scala.inline
  def `4g`: `4g` = "4g".asInstanceOf[`4g`]
  @scala.inline
  def Alt: Alt = "Alt".asInstanceOf[Alt]
  @scala.inline
  def Application: Application = "Application".asInstanceOf[Application]
  @scala.inline
  def CRASH: CRASH = "CRASH".asInstanceOf[CRASH]
  @scala.inline
  def Command: Command = "Command".asInstanceOf[Command]
  @scala.inline
  def Ctrl: Ctrl = "Ctrl".asInstanceOf[Ctrl]
  @scala.inline
  def FILE_ACCESS_DENIED: FILE_ACCESS_DENIED = "FILE_ACCESS_DENIED".asInstanceOf[FILE_ACCESS_DENIED]
  @scala.inline
  def FILE_BLOCKED: FILE_BLOCKED = "FILE_BLOCKED".asInstanceOf[FILE_BLOCKED]
  @scala.inline
  def FILE_FAILED: FILE_FAILED = "FILE_FAILED".asInstanceOf[FILE_FAILED]
  @scala.inline
  def FILE_NAME_TOO_LONG: FILE_NAME_TOO_LONG = "FILE_NAME_TOO_LONG".asInstanceOf[FILE_NAME_TOO_LONG]
  @scala.inline
  def FILE_NO_SPACE: FILE_NO_SPACE = "FILE_NO_SPACE".asInstanceOf[FILE_NO_SPACE]
  @scala.inline
  def FILE_SECURITY_CHECK_FAILED: FILE_SECURITY_CHECK_FAILED = "FILE_SECURITY_CHECK_FAILED".asInstanceOf[FILE_SECURITY_CHECK_FAILED]
  @scala.inline
  def FILE_TOO_LARGE: FILE_TOO_LARGE = "FILE_TOO_LARGE".asInstanceOf[FILE_TOO_LARGE]
  @scala.inline
  def FILE_TOO_SHORT: FILE_TOO_SHORT = "FILE_TOO_SHORT".asInstanceOf[FILE_TOO_SHORT]
  @scala.inline
  def FILE_TRANSIENT_ERROR: FILE_TRANSIENT_ERROR = "FILE_TRANSIENT_ERROR".asInstanceOf[FILE_TRANSIENT_ERROR]
  @scala.inline
  def FILE_VIRUS_INFECTED: FILE_VIRUS_INFECTED = "FILE_VIRUS_INFECTED".asInstanceOf[FILE_VIRUS_INFECTED]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def Lessthansignall_urlsGreaterthansign: Lessthansignall_urlsGreaterthansign = "<all_urls>".asInstanceOf[Lessthansignall_urlsGreaterthansign]
  @scala.inline
  def MacCtrl: MacCtrl = "MacCtrl".asInstanceOf[MacCtrl]
  @scala.inline
  def NETWORK_DISCONNECTED: NETWORK_DISCONNECTED = "NETWORK_DISCONNECTED".asInstanceOf[NETWORK_DISCONNECTED]
  @scala.inline
  def NETWORK_FAILED: NETWORK_FAILED = "NETWORK_FAILED".asInstanceOf[NETWORK_FAILED]
  @scala.inline
  def NETWORK_INVALID_REQUEST: NETWORK_INVALID_REQUEST = "NETWORK_INVALID_REQUEST".asInstanceOf[NETWORK_INVALID_REQUEST]
  @scala.inline
  def NETWORK_SERVER_DOWN: NETWORK_SERVER_DOWN = "NETWORK_SERVER_DOWN".asInstanceOf[NETWORK_SERVER_DOWN]
  @scala.inline
  def NETWORK_TIMEOUT: NETWORK_TIMEOUT = "NETWORK_TIMEOUT".asInstanceOf[NETWORK_TIMEOUT]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def SERVER_BAD_CONTENT: SERVER_BAD_CONTENT = "SERVER_BAD_CONTENT".asInstanceOf[SERVER_BAD_CONTENT]
  @scala.inline
  def SERVER_CERT_PROBLEM: SERVER_CERT_PROBLEM = "SERVER_CERT_PROBLEM".asInstanceOf[SERVER_CERT_PROBLEM]
  @scala.inline
  def SERVER_FAILED: SERVER_FAILED = "SERVER_FAILED".asInstanceOf[SERVER_FAILED]
  @scala.inline
  def SERVER_FORBIDDEN: SERVER_FORBIDDEN = "SERVER_FORBIDDEN".asInstanceOf[SERVER_FORBIDDEN]
  @scala.inline
  def SERVER_NO_RANGE: SERVER_NO_RANGE = "SERVER_NO_RANGE".asInstanceOf[SERVER_NO_RANGE]
  @scala.inline
  def SERVER_UNAUTHORIZED: SERVER_UNAUTHORIZED = "SERVER_UNAUTHORIZED".asInstanceOf[SERVER_UNAUTHORIZED]
  @scala.inline
  def Screen: Screen = "Screen".asInstanceOf[Screen]
  @scala.inline
  def Shift: Shift = "Shift".asInstanceOf[Shift]
  @scala.inline
  def TLSv1: TLSv1 = "TLSv1".asInstanceOf[TLSv1]
  @scala.inline
  def TLSv1Dot1: TLSv1Dot1 = "TLSv1.1".asInstanceOf[TLSv1Dot1]
  @scala.inline
  def TLSv1Dot2: TLSv1Dot2 = "TLSv1.2".asInstanceOf[TLSv1Dot2]
  @scala.inline
  def TLSv1Dot3: TLSv1Dot3 = "TLSv1.3".asInstanceOf[TLSv1Dot3]
  @scala.inline
  def USER_CANCELED: USER_CANCELED = "USER_CANCELED".asInstanceOf[USER_CANCELED]
  @scala.inline
  def USER_SHUTDOWN: USER_SHUTDOWN = "USER_SHUTDOWN".asInstanceOf[USER_SHUTDOWN]
  @scala.inline
  def Window: Window = "Window".asInstanceOf[Window]
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  @scala.inline
  def abandonment: abandonment = "abandonment".asInstanceOf[abandonment]
  @scala.inline
  def accepted: accepted = "accepted".asInstanceOf[accepted]
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  @scala.inline
  def activeTab: activeTab = "activeTab".asInstanceOf[activeTab]
  @scala.inline
  def activityLog: activityLog = "activityLog".asInstanceOf[activityLog]
  @scala.inline
  def addon_child: addon_child = "addon_child".asInstanceOf[addon_child]
  @scala.inline
  def addon_parent: addon_parent = "addon_parent".asInstanceOf[addon_parent]
  @scala.inline
  def alarms: alarms = "alarms".asInstanceOf[alarms]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def allow_all: allow_all = "allow_all".asInstanceOf[allow_all]
  @scala.inline
  def allow_name_collisions: allow_name_collisions = "allow_name_collisions".asInstanceOf[allow_name_collisions]
  @scala.inline
  def allow_visited: allow_visited = "allow_visited".asInstanceOf[allow_visited]
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  @scala.inline
  def android: android = "android".asInstanceOf[android]
  @scala.inline
  def any_basic_tracking: any_basic_tracking = "any_basic_tracking".asInstanceOf[any_basic_tracking]
  @scala.inline
  def any_social_tracking: any_social_tracking = "any_social_tracking".asInstanceOf[any_social_tracking]
  @scala.inline
  def any_strict_tracking: any_strict_tracking = "any_strict_tracking".asInstanceOf[any_strict_tracking]
  @scala.inline
  def api_call: api_call = "api_call".asInstanceOf[api_call]
  @scala.inline
  def api_event: api_event = "api_event".asInstanceOf[api_event]
  @scala.inline
  def app: app = "app".asInstanceOf[app]
  @scala.inline
  def app_update: app_update = "app_update".asInstanceOf[app_update]
  @scala.inline
  def arm: arm = "arm".asInstanceOf[arm]
  @scala.inline
  def asyncBlocking: asyncBlocking = "asyncBlocking".asInstanceOf[asyncBlocking]
  @scala.inline
  def attention: attention = "attention".asInstanceOf[attention]
  @scala.inline
  def audible: audible = "audible".asInstanceOf[audible]
  @scala.inline
  def audio: audio = "audio".asInstanceOf[audio]
  @scala.inline
  def author: author = "author".asInstanceOf[author]
  @scala.inline
  def autoConfig: autoConfig = "autoConfig".asInstanceOf[autoConfig]
  @scala.inline
  def autoDetect: autoDetect = "autoDetect".asInstanceOf[autoDetect]
  @scala.inline
  def auto_bookmark: auto_bookmark = "auto_bookmark".asInstanceOf[auto_bookmark]
  @scala.inline
  def auto_subframe: auto_subframe = "auto_subframe".asInstanceOf[auto_subframe]
  @scala.inline
  def auto_toplevel: auto_toplevel = "auto_toplevel".asInstanceOf[auto_toplevel]
  @scala.inline
  def automatic: automatic = "automatic".asInstanceOf[automatic]
  @scala.inline
  def background: background = "background".asInstanceOf[background]
  @scala.inline
  def basic: basic = "basic".asInstanceOf[basic]
  @scala.inline
  def beacon: beacon = "beacon".asInstanceOf[beacon]
  @scala.inline
  def bitcoin: bitcoin = "bitcoin".asInstanceOf[bitcoin]
  @scala.inline
  def blocking: blocking = "blocking".asInstanceOf[blocking]
  @scala.inline
  def bookmark: bookmark = "bookmark".asInstanceOf[bookmark]
  @scala.inline
  def bookmarks: bookmarks = "bookmarks".asInstanceOf[bookmarks]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def broken: broken = "broken".asInstanceOf[broken]
  @scala.inline
  def browserSettings: browserSettings = "browserSettings".asInstanceOf[browserSettings]
  @scala.inline
  def browser_action: browser_action = "browser_action".asInstanceOf[browser_action]
  @scala.inline
  def browser_update: browser_update = "browser_update".asInstanceOf[browser_update]
  @scala.inline
  def browsingData: browsingData = "browsingData".asInstanceOf[browsingData]
  @scala.inline
  def bypass_cache: bypass_cache = "bypass_cache".asInstanceOf[bypass_cache]
  @scala.inline
  def canonical_name: canonical_name = "canonical_name".asInstanceOf[canonical_name]
  @scala.inline
  def captive: captive = "captive".asInstanceOf[captive]
  @scala.inline
  def captivePortal: captivePortal = "captivePortal".asInstanceOf[captivePortal]
  @scala.inline
  def capture: capture = "capture".asInstanceOf[capture]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def `center bottom`: `center bottom` = ("center bottom").asInstanceOf[`center bottom`]
  @scala.inline
  def `center center`: `center center` = ("center center").asInstanceOf[`center center`]
  @scala.inline
  def `center top`: `center top` = ("center top").asInstanceOf[`center top`]
  @scala.inline
  def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  @scala.inline
  def cipher: cipher = "cipher".asInstanceOf[cipher]
  @scala.inline
  def clear: clear = "clear".asInstanceOf[clear]
  @scala.inline
  def client_redirect: client_redirect = "client_redirect".asInstanceOf[client_redirect]
  @scala.inline
  def clipboardRead: clipboardRead = "clipboardRead".asInstanceOf[clipboardRead]
  @scala.inline
  def clipboardWrite: clipboardWrite = "clipboardWrite".asInstanceOf[clipboardWrite]
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  @scala.inline
  def content: content = "content".asInstanceOf[content]
  @scala.inline
  def content_child: content_child = "content_child".asInstanceOf[content_child]
  @scala.inline
  def content_parent: content_parent = "content_parent".asInstanceOf[content_parent]
  @scala.inline
  def content_script: content_script = "content_script".asInstanceOf[content_script]
  @scala.inline
  def contextMenus: contextMenus = "contextMenus".asInstanceOf[contextMenus]
  @scala.inline
  def contextmenu: contextmenu = "contextmenu".asInstanceOf[contextmenu]
  @scala.inline
  def contextualIdentities: contextualIdentities = "contextualIdentities".asInstanceOf[contextualIdentities]
  @scala.inline
  def controllable_by_this_extension: controllable_by_this_extension = "controllable_by_this_extension".asInstanceOf[controllable_by_this_extension]
  @scala.inline
  def controlled_by_other_extensions: controlled_by_other_extensions = "controlled_by_other_extensions".asInstanceOf[controlled_by_other_extensions]
  @scala.inline
  def controlled_by_this_extension: controlled_by_this_extension = "controlled_by_this_extension".asInstanceOf[controlled_by_this_extension]
  @scala.inline
  def cookies: cookies = "cookies".asInstanceOf[cookies]
  @scala.inline
  def count: count = "count".asInstanceOf[count]
  @scala.inline
  def cros: cros = "cros".asInstanceOf[cros]
  @scala.inline
  def cryptomining: cryptomining = "cryptomining".asInstanceOf[cryptomining]
  @scala.inline
  def cryptomining_content: cryptomining_content = "cryptomining_content".asInstanceOf[cryptomining_content]
  @scala.inline
  def csp_report: csp_report = "csp_report".asInstanceOf[csp_report]
  @scala.inline
  def currentTab: currentTab = "currentTab".asInstanceOf[currentTab]
  @scala.inline
  def dat: dat = "dat".asInstanceOf[dat]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def default_public_and_private_interfaces: default_public_and_private_interfaces = "default_public_and_private_interfaces".asInstanceOf[default_public_and_private_interfaces]
  @scala.inline
  def default_public_interface_only: default_public_interface_only = "default_public_interface_only".asInstanceOf[default_public_interface_only]
  @scala.inline
  def denied: denied = "denied".asInstanceOf[denied]
  @scala.inline
  def detached_panel: detached_panel = "detached_panel".asInstanceOf[detached_panel]
  @scala.inline
  def development: development = "development".asInstanceOf[development]
  @scala.inline
  def devtools: devtools = "devtools".asInstanceOf[devtools]
  @scala.inline
  def devtools_child: devtools_child = "devtools_child".asInstanceOf[devtools_child]
  @scala.inline
  def devtools_page: devtools_page = "devtools_page".asInstanceOf[devtools_page]
  @scala.inline
  def devtools_panel: devtools_panel = "devtools_panel".asInstanceOf[devtools_panel]
  @scala.inline
  def devtools_parent: devtools_parent = "devtools_parent".asInstanceOf[devtools_parent]
  @scala.inline
  def dim: dim = "dim".asInstanceOf[dim]
  @scala.inline
  def disable_ipv4: disable_ipv4 = "disable_ipv4".asInstanceOf[disable_ipv4]
  @scala.inline
  def disable_ipv6: disable_ipv6 = "disable_ipv6".asInstanceOf[disable_ipv6]
  @scala.inline
  def disable_non_proxied_udp: disable_non_proxied_udp = "disable_non_proxied_udp".asInstanceOf[disable_non_proxied_udp]
  @scala.inline
  def disable_trr: disable_trr = "disable_trr".asInstanceOf[disable_trr]
  @scala.inline
  def disabled: disabled = "disabled".asInstanceOf[disabled]
  @scala.inline
  def discard: discard = "discard".asInstanceOf[discard]
  @scala.inline
  def discarded: discarded = "discarded".asInstanceOf[discarded]
  @scala.inline
  def dns: dns = "dns".asInstanceOf[dns]
  @scala.inline
  def docked: docked = "docked".asInstanceOf[docked]
  @scala.inline
  def document_end: document_end = "document_end".asInstanceOf[document_end]
  @scala.inline
  def document_idle: document_idle = "document_idle".asInstanceOf[document_idle]
  @scala.inline
  def document_start: document_start = "document_start".asInstanceOf[document_start]
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  @scala.inline
  def downloads: downloads = "downloads".asInstanceOf[downloads]
  @scala.inline
  def downloadsDotopen: downloadsDotopen = "downloads.open".asInstanceOf[downloadsDotopen]
  @scala.inline
  def dweb: dweb = "dweb".asInstanceOf[dweb]
  @scala.inline
  def editable: editable = "editable".asInstanceOf[editable]
  @scala.inline
  def engagement: engagement = "engagement".asInstanceOf[engagement]
  @scala.inline
  def ethernet: ethernet = "ethernet".asInstanceOf[ethernet]
  @scala.inline
  def evicted: evicted = "evicted".asInstanceOf[evicted]
  @scala.inline
  def expired: expired = "expired".asInstanceOf[expired]
  @scala.inline
  def expired_overwrite: expired_overwrite = "expired_overwrite".asInstanceOf[expired_overwrite]
  @scala.inline
  def explicit: explicit = "explicit".asInstanceOf[explicit]
  @scala.inline
  def extension: extension = "extension".asInstanceOf[extension]
  @scala.inline
  def favIconUrl: favIconUrl = "favIconUrl".asInstanceOf[favIconUrl]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def fileio: fileio = "fileio".asInstanceOf[fileio]
  @scala.inline
  def fileioall: fileioall = "fileioall".asInstanceOf[fileioall]
  @scala.inline
  def find: find = "find".asInstanceOf[find]
  @scala.inline
  def fingerprinting: fingerprinting = "fingerprinting".asInstanceOf[fingerprinting]
  @scala.inline
  def fingerprinting_content: fingerprinting_content = "fingerprinting_content".asInstanceOf[fingerprinting_content]
  @scala.inline
  def folder: folder = "folder".asInstanceOf[folder]
  @scala.inline
  def font: font = "font".asInstanceOf[font]
  @scala.inline
  def form_submit: form_submit = "form_submit".asInstanceOf[form_submit]
  @scala.inline
  def forward_back: forward_back = "forward_back".asInstanceOf[forward_back]
  @scala.inline
  def frame: frame = "frame".asInstanceOf[frame]
  @scala.inline
  def from_address_bar: from_address_bar = "from_address_bar".asInstanceOf[from_address_bar]
  @scala.inline
  def fullscreen: fullscreen = "fullscreen".asInstanceOf[fullscreen]
  @scala.inline
  def geckoProfiler: geckoProfiler = "geckoProfiler".asInstanceOf[geckoProfiler]
  @scala.inline
  def generated: generated = "generated".asInstanceOf[generated]
  @scala.inline
  def geo: geo = "geo".asInstanceOf[geo]
  @scala.inline
  def geolocation: geolocation = "geolocation".asInstanceOf[geolocation]
  @scala.inline
  def gopher: gopher = "gopher".asInstanceOf[gopher]
  @scala.inline
  def granted: granted = "granted".asInstanceOf[granted]
  @scala.inline
  def hidden: hidden = "hidden".asInstanceOf[hidden]
  @scala.inline
  def history: history = "history".asInstanceOf[history]
  @scala.inline
  def homepage: homepage = "homepage".asInstanceOf[homepage]
  @scala.inline
  def host: host = "host".asInstanceOf[host]
  @scala.inline
  def identity: identity = "identity".asInstanceOf[identity]
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  @scala.inline
  def im: im = "im".asInstanceOf[im]
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  @scala.inline
  def imageset: imageset = "imageset".asInstanceOf[imageset]
  @scala.inline
  def in_progress: in_progress = "in_progress".asInstanceOf[in_progress]
  @scala.inline
  def inactive: inactive = "inactive".asInstanceOf[inactive]
  @scala.inline
  def incognito_persistent: incognito_persistent = "incognito_persistent".asInstanceOf[incognito_persistent]
  @scala.inline
  def incognito_session_only: incognito_session_only = "incognito_session_only".asInstanceOf[incognito_session_only]
  @scala.inline
  def insecure: insecure = "insecure".asInstanceOf[insecure]
  @scala.inline
  def install: install = "install".asInstanceOf[install]
  @scala.inline
  def interrupted: interrupted = "interrupted".asInstanceOf[interrupted]
  @scala.inline
  def ipcmessages: ipcmessages = "ipcmessages".asInstanceOf[ipcmessages]
  @scala.inline
  def ipfs: ipfs = "ipfs".asInstanceOf[ipfs]
  @scala.inline
  def ipns: ipns = "ipns".asInstanceOf[ipns]
  @scala.inline
  def irc: irc = "irc".asInstanceOf[irc]
  @scala.inline
  def ircs: ircs = "ircs".asInstanceOf[ircs]
  @scala.inline
  def isArticle: isArticle = "isArticle".asInstanceOf[isArticle]
  @scala.inline
  def java_ : java_ = "java".asInstanceOf[java_]
  @scala.inline
  def jpeg: jpeg = "jpeg".asInstanceOf[jpeg]
  @scala.inline
  def js_ : js_ = "js".asInstanceOf[js_]
  @scala.inline
  def jsallocations: jsallocations = "jsallocations".asInstanceOf[jsallocations]
  @scala.inline
  def jstracer: jstracer = "jstracer".asInstanceOf[jstracer]
  @scala.inline
  def keyword: keyword = "keyword".asInstanceOf[keyword]
  @scala.inline
  def keyword_generated: keyword_generated = "keyword_generated".asInstanceOf[keyword_generated]
  @scala.inline
  def launcher: launcher = "launcher".asInstanceOf[launcher]
  @scala.inline
  def lax: lax = "lax".asInstanceOf[lax]
  @scala.inline
  def leaf: leaf = "leaf".asInstanceOf[leaf]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def `left bottom`: `left bottom` = ("left bottom").asInstanceOf[`left bottom`]
  @scala.inline
  def `left center`: `left center` = ("left center").asInstanceOf[`left center`]
  @scala.inline
  def `left top`: `left top` = ("left top").asInstanceOf[`left top`]
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  @scala.inline
  def linux: linux = "linux".asInstanceOf[linux]
  @scala.inline
  def list: list = "list".asInstanceOf[list]
  @scala.inline
  def loading: loading = "loading".asInstanceOf[loading]
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  @scala.inline
  def locked_portal: locked_portal = "locked_portal".asInstanceOf[locked_portal]
  @scala.inline
  def mac: mac = "mac".asInstanceOf[mac]
  @scala.inline
  def magnet: magnet = "magnet".asInstanceOf[magnet]
  @scala.inline
  def mailto: mailto = "mailto".asInstanceOf[mailto]
  @scala.inline
  def main_frame: main_frame = "main_frame".asInstanceOf[main_frame]
  @scala.inline
  def mainthreadio: mainthreadio = "mainthreadio".asInstanceOf[mainthreadio]
  @scala.inline
  def managed: managed = "managed".asInstanceOf[managed]
  @scala.inline
  def management: management = "management".asInstanceOf[management]
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  @scala.inline
  def manual_subframe: manual_subframe = "manual_subframe".asInstanceOf[manual_subframe]
  @scala.inline
  def `match`: `match` = "match".asInstanceOf[`match`]
  @scala.inline
  def maximized: maximized = "maximized".asInstanceOf[maximized]
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  @scala.inline
  def menupanel: menupanel = "menupanel".asInstanceOf[menupanel]
  @scala.inline
  def menus: menus = "menus".asInstanceOf[menus]
  @scala.inline
  def menusDotoverrideContext: menusDotoverrideContext = "menus.overrideContext".asInstanceOf[menusDotoverrideContext]
  @scala.inline
  def minimized: minimized = "minimized".asInstanceOf[minimized]
  @scala.inline
  def mms: mms = "mms".asInstanceOf[mms]
  @scala.inline
  def mousedown: mousedown = "mousedown".asInstanceOf[mousedown]
  @scala.inline
  def mouseup: mouseup = "mouseup".asInstanceOf[mouseup]
  @scala.inline
  def mozillaAddons: mozillaAddons = "mozillaAddons".asInstanceOf[mozillaAddons]
  @scala.inline
  def mutedInfo: mutedInfo = "mutedInfo".asInstanceOf[mutedInfo]
  @scala.inline
  def nativeMessaging: nativeMessaging = "nativeMessaging".asInstanceOf[nativeMessaging]
  @scala.inline
  def nativeallocations: nativeallocations = "nativeallocations".asInstanceOf[nativeallocations]
  @scala.inline
  def navbar: navbar = "navbar".asInstanceOf[navbar]
  @scala.inline
  def network: network = "network".asInstanceOf[network]
  @scala.inline
  def networkStatus: networkStatus = "networkStatus".asInstanceOf[networkStatus]
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  @scala.inline
  def newBackgroundTab: newBackgroundTab = "newBackgroundTab".asInstanceOf[newBackgroundTab]
  @scala.inline
  def newForegroundTab: newForegroundTab = "newForegroundTab".asInstanceOf[newForegroundTab]
  @scala.inline
  def news: news = "news".asInstanceOf[news]
  @scala.inline
  def newtab: newtab = "newtab".asInstanceOf[newtab]
  @scala.inline
  def nntp: nntp = "nntp".asInstanceOf[nntp]
  @scala.inline
  def `no-repeat`: `no-repeat` = "no-repeat".asInstanceOf[`no-repeat`]
  @scala.inline
  def no_restriction: no_restriction = "no_restriction".asInstanceOf[no_restriction]
  @scala.inline
  def no_update: no_update = "no_update".asInstanceOf[no_update]
  @scala.inline
  def noiostacks: noiostacks = "noiostacks".asInstanceOf[noiostacks]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  @scala.inline
  def normandyAddonStudy: normandyAddonStudy = "normandyAddonStudy".asInstanceOf[normandyAddonStudy]
  @scala.inline
  def nostacksampling: nostacksampling = "nostacksampling".asInstanceOf[nostacksampling]
  @scala.inline
  def not_allowed: not_allowed = "not_allowed".asInstanceOf[not_allowed]
  @scala.inline
  def not_applicable: not_applicable = "not_applicable".asInstanceOf[not_applicable]
  @scala.inline
  def not_captive: not_captive = "not_captive".asInstanceOf[not_captive]
  @scala.inline
  def not_controllable: not_controllable = "not_controllable".asInstanceOf[not_controllable]
  @scala.inline
  def notifications: notifications = "notifications".asInstanceOf[notifications]
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  @scala.inline
  def object_subrequest: object_subrequest = "object_subrequest".asInstanceOf[object_subrequest]
  @scala.inline
  def offline: offline = "offline".asInstanceOf[offline]
  @scala.inline
  def once: once = "once".asInstanceOf[once]
  @scala.inline
  def openbsd: openbsd = "openbsd".asInstanceOf[openbsd]
  @scala.inline
  def os_update: os_update = "os_update".asInstanceOf[os_update]
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  @scala.inline
  def overwrite: overwrite = "overwrite".asInstanceOf[overwrite]
  @scala.inline
  def page: page = "page".asInstanceOf[page]
  @scala.inline
  def page_action: page_action = "page_action".asInstanceOf[page_action]
  @scala.inline
  def panel: panel = "panel".asInstanceOf[panel]
  @scala.inline
  def password: password = "password".asInstanceOf[password]
  @scala.inline
  def `per-origin`: `per-origin` = "per-origin".asInstanceOf[`per-origin`]
  @scala.inline
  def `per-tab`: `per-tab` = "per-tab".asInstanceOf[`per-tab`]
  @scala.inline
  def periodic: periodic = "periodic".asInstanceOf[periodic]
  @scala.inline
  def permissions_increase: permissions_increase = "permissions_increase".asInstanceOf[permissions_increase]
  @scala.inline
  def personaltoolbar: personaltoolbar = "personaltoolbar".asInstanceOf[personaltoolbar]
  @scala.inline
  def ping: ping = "ping".asInstanceOf[ping]
  @scala.inline
  def pinned: pinned = "pinned".asInstanceOf[pinned]
  @scala.inline
  def pkcs11: pkcs11 = "pkcs11".asInstanceOf[pkcs11]
  @scala.inline
  def png: png = "png".asInstanceOf[png]
  @scala.inline
  def policy_compliant: policy_compliant = "policy_compliant".asInstanceOf[policy_compliant]
  @scala.inline
  def policy_not_diverse_scts: policy_not_diverse_scts = "policy_not_diverse_scts".asInstanceOf[policy_not_diverse_scts]
  @scala.inline
  def policy_not_enough_scts: policy_not_enough_scts = "policy_not_enough_scts".asInstanceOf[policy_not_enough_scts]
  @scala.inline
  def popup: popup = "popup".asInstanceOf[popup]
  @scala.inline
  def pref: pref = "pref".asInstanceOf[pref]
  @scala.inline
  def preferencereads: preferencereads = "preferencereads".asInstanceOf[preferencereads]
  @scala.inline
  def priority_low: priority_low = "priority_low".asInstanceOf[priority_low]
  @scala.inline
  def priority_medium: priority_medium = "priority_medium".asInstanceOf[priority_medium]
  @scala.inline
  def privacy: privacy = "privacy".asInstanceOf[privacy]
  @scala.inline
  def private_browsing: private_browsing = "private_browsing".asInstanceOf[private_browsing]
  @scala.inline
  def progress: progress = "progress".asInstanceOf[progress]
  @scala.inline
  def prompt: prompt = "prompt".asInstanceOf[prompt]
  @scala.inline
  def proxy: proxy = "proxy".asInstanceOf[proxy]
  @scala.inline
  def proxy_only: proxy_only = "proxy_only".asInstanceOf[proxy_only]
  @scala.inline
  def purpose: purpose = "purpose".asInstanceOf[purpose]
  @scala.inline
  def radio: radio = "radio".asInstanceOf[radio]
  @scala.inline
  def regular: regular = "regular".asInstanceOf[regular]
  @scala.inline
  def regular_only: regular_only = "regular_only".asInstanceOf[regular_only]
  @scala.inline
  def reject_all: reject_all = "reject_all".asInstanceOf[reject_all]
  @scala.inline
  def reject_third_party: reject_third_party = "reject_third_party".asInstanceOf[reject_third_party]
  @scala.inline
  def reject_trackers: reject_trackers = "reject_trackers".asInstanceOf[reject_trackers]
  @scala.inline
  def reject_trackers_and_partition_foreign: reject_trackers_and_partition_foreign = "reject_trackers_and_partition_foreign".asInstanceOf[reject_trackers_and_partition_foreign]
  @scala.inline
  def reload: reload = "reload".asInstanceOf[reload]
  @scala.inline
  def remote_tab: remote_tab = "remote_tab".asInstanceOf[remote_tab]
  @scala.inline
  def repeat: repeat = "repeat".asInstanceOf[repeat]
  @scala.inline
  def `repeat-x`: `repeat-x` = "repeat-x".asInstanceOf[`repeat-x`]
  @scala.inline
  def `repeat-y`: `repeat-y` = "repeat-y".asInstanceOf[`repeat-y`]
  @scala.inline
  def requestBody: requestBody = "requestBody".asInstanceOf[requestBody]
  @scala.inline
  def requestHeaders: requestHeaders = "requestHeaders".asInstanceOf[requestHeaders]
  @scala.inline
  def responseHeaders: responseHeaders = "responseHeaders".asInstanceOf[responseHeaders]
  @scala.inline
  def responsiveness: responsiveness = "responsiveness".asInstanceOf[responsiveness]
  @scala.inline
  def restricting: restricting = "restricting".asInstanceOf[restricting]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def `right bottom`: `right bottom` = ("right bottom").asInstanceOf[`right bottom`]
  @scala.inline
  def `right center`: `right center` = ("right center").asInstanceOf[`right center`]
  @scala.inline
  def `right top`: `right top` = ("right top").asInstanceOf[`right top`]
  @scala.inline
  def safe: safe = "safe".asInstanceOf[safe]
  @scala.inline
  def screenshots: screenshots = "screenshots".asInstanceOf[screenshots]
  @scala.inline
  def script: script = "script".asInstanceOf[script]
  @scala.inline
  def search: search = "search".asInstanceOf[search]
  @scala.inline
  def searchbar: searchbar = "searchbar".asInstanceOf[searchbar]
  @scala.inline
  def secure: secure = "secure".asInstanceOf[secure]
  @scala.inline
  def selection: selection = "selection".asInstanceOf[selection]
  @scala.inline
  def separator: separator = "separator".asInstanceOf[separator]
  @scala.inline
  def seqstyle: seqstyle = "seqstyle".asInstanceOf[seqstyle]
  @scala.inline
  def server_redirect: server_redirect = "server_redirect".asInstanceOf[server_redirect]
  @scala.inline
  def sessions: sessions = "sessions".asInstanceOf[sessions]
  @scala.inline
  def sharingState: sharingState = "sharingState".asInstanceOf[sharingState]
  @scala.inline
  def sidebar: sidebar = "sidebar".asInstanceOf[sidebar]
  @scala.inline
  def sideload: sideload = "sideload".asInstanceOf[sideload]
  @scala.inline
  def sip: sip = "sip".asInstanceOf[sip]
  @scala.inline
  def sms: sms = "sms".asInstanceOf[sms]
  @scala.inline
  def smsto: smsto = "smsto".asInstanceOf[smsto]
  @scala.inline
  def spanning: spanning = "spanning".asInstanceOf[spanning]
  @scala.inline
  def speculate: speculate = "speculate".asInstanceOf[speculate]
  @scala.inline
  def speculative: speculative = "speculative".asInstanceOf[speculative]
  @scala.inline
  def ssb: ssb = "ssb".asInstanceOf[ssb]
  @scala.inline
  def ssh: ssh = "ssh".asInstanceOf[ssh]
  @scala.inline
  def stackwalk: stackwalk = "stackwalk".asInstanceOf[stackwalk]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def start_page: start_page = "start_page".asInstanceOf[start_page]
  @scala.inline
  def startup: startup = "startup".asInstanceOf[startup]
  @scala.inline
  def status: status = "status".asInstanceOf[status]
  @scala.inline
  def stdio: stdio = "stdio".asInstanceOf[stdio]
  @scala.inline
  def storage: storage = "storage".asInstanceOf[storage]
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def stylesheet: stylesheet = "stylesheet".asInstanceOf[stylesheet]
  @scala.inline
  def sub_frame: sub_frame = "sub_frame".asInstanceOf[sub_frame]
  @scala.inline
  def system: system = "system".asInstanceOf[system]
  @scala.inline
  def tab: tab = "tab".asInstanceOf[tab]
  @scala.inline
  def tabHide: tabHide = "tabHide".asInstanceOf[tabHide]
  @scala.inline
  def tabs: tabs = "tabs".asInstanceOf[tabs]
  @scala.inline
  def tabstrip: tabstrip = "tabstrip".asInstanceOf[tabstrip]
  @scala.inline
  def tasktracer: tasktracer = "tasktracer".asInstanceOf[tasktracer]
  @scala.inline
  def tel: tel = "tel".asInstanceOf[tel]
  @scala.inline
  def telemetry: telemetry = "telemetry".asInstanceOf[telemetry]
  @scala.inline
  def theme: theme = "theme".asInstanceOf[theme]
  @scala.inline
  def threads: threads = "threads".asInstanceOf[threads]
  @scala.inline
  def throttled: throttled = "throttled".asInstanceOf[throttled]
  @scala.inline
  def tip: tip = "tip".asInstanceOf[tip]
  @scala.inline
  def title: title = "title".asInstanceOf[title]
  @scala.inline
  def tools_menu: tools_menu = "tools_menu".asInstanceOf[tools_menu]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def topSites: topSites = "topSites".asInstanceOf[topSites]
  @scala.inline
  def tracking: tracking = "tracking".asInstanceOf[tracking]
  @scala.inline
  def tracking_ad: tracking_ad = "tracking_ad".asInstanceOf[tracking_ad]
  @scala.inline
  def tracking_analytics: tracking_analytics = "tracking_analytics".asInstanceOf[tracking_analytics]
  @scala.inline
  def tracking_content: tracking_content = "tracking_content".asInstanceOf[tracking_content]
  @scala.inline
  def tracking_social: tracking_social = "tracking_social".asInstanceOf[tracking_social]
  @scala.inline
  def typed: typed = "typed".asInstanceOf[typed]
  @scala.inline
  def uncommon: uncommon = "uncommon".asInstanceOf[uncommon]
  @scala.inline
  def uniquify: uniquify = "uniquify".asInstanceOf[uniquify]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  @scala.inline
  def unlimitedStorage: unlimitedStorage = "unlimitedStorage".asInstanceOf[unlimitedStorage]
  @scala.inline
  def unlocked_portal: unlocked_portal = "unlocked_portal".asInstanceOf[unlocked_portal]
  @scala.inline
  def unwanted: unwanted = "unwanted".asInstanceOf[unwanted]
  @scala.inline
  def up: up = "up".asInstanceOf[up]
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  @scala.inline
  def update_available: update_available = "update_available".asInstanceOf[update_available]
  @scala.inline
  def url: url = "url".asInstanceOf[url]
  @scala.inline
  def urlbar: urlbar = "urlbar".asInstanceOf[urlbar]
  @scala.inline
  def urn: urn = "urn".asInstanceOf[urn]
  @scala.inline
  def usb: usb = "usb".asInstanceOf[usb]
  @scala.inline
  def user: user = "user".asInstanceOf[user]
  @scala.inline
  def user_script: user_script = "user_script".asInstanceOf[user_script]
  @scala.inline
  def video: video = "video".asInstanceOf[video]
  @scala.inline
  def weak: weak = "weak".asInstanceOf[weak]
  @scala.inline
  def webNavigation: webNavigation = "webNavigation".asInstanceOf[webNavigation]
  @scala.inline
  def webRequest: webRequest = "webRequest".asInstanceOf[webRequest]
  @scala.inline
  def webRequestBlocking: webRequestBlocking = "webRequestBlocking".asInstanceOf[webRequestBlocking]
  @scala.inline
  def web_manifest: web_manifest = "web_manifest".asInstanceOf[web_manifest]
  @scala.inline
  def webcal: webcal = "webcal".asInstanceOf[webcal]
  @scala.inline
  def websocket: websocket = "websocket".asInstanceOf[websocket]
  @scala.inline
  def wifi: wifi = "wifi".asInstanceOf[wifi]
  @scala.inline
  def wimax: wimax = "wimax".asInstanceOf[wimax]
  @scala.inline
  def win: win = "win".asInstanceOf[win]
  @scala.inline
  def windowLength: windowLength = "windowLength".asInstanceOf[windowLength]
  @scala.inline
  def wtai: wtai = "wtai".asInstanceOf[wtai]
  @scala.inline
  def `x86-32`: `x86-32` = "x86-32".asInstanceOf[`x86-32`]
  @scala.inline
  def `x86-64`: `x86-64` = "x86-64".asInstanceOf[`x86-64`]
  @scala.inline
  def xml_dtd: xml_dtd = "xml_dtd".asInstanceOf[xml_dtd]
  @scala.inline
  def xmlhttprequest: xmlhttprequest = "xmlhttprequest".asInstanceOf[xmlhttprequest]
  @scala.inline
  def xmpp: xmpp = "xmpp".asInstanceOf[xmpp]
  @scala.inline
  def xslt: xslt = "xslt".asInstanceOf[xslt]
}

