package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.NotPrimaryMainFrame
  - typings.devtoolsProtocol.devtoolsProtocolStrings.BackForwardCacheDisabled
  - typings.devtoolsProtocol.devtoolsProtocolStrings.RelatedActiveContentsExist
  - typings.devtoolsProtocol.devtoolsProtocolStrings.HTTPStatusNotOK
  - typings.devtoolsProtocol.devtoolsProtocolStrings.SchemeNotHTTPOrHTTPS
  - typings.devtoolsProtocol.devtoolsProtocolStrings.Loading
  - typings.devtoolsProtocol.devtoolsProtocolStrings.WasGrantedMediaAccess
  - typings.devtoolsProtocol.devtoolsProtocolStrings.DisableForRenderFrameHostCalled
  - typings.devtoolsProtocol.devtoolsProtocolStrings.DomainNotAllowed
  - typings.devtoolsProtocol.devtoolsProtocolStrings.HTTPMethodNotGET
  - typings.devtoolsProtocol.devtoolsProtocolStrings.SubframeIsNavigating
  - typings.devtoolsProtocol.devtoolsProtocolStrings.Timeout
  - typings.devtoolsProtocol.devtoolsProtocolStrings.CacheLimit
  - typings.devtoolsProtocol.devtoolsProtocolStrings.JavaScriptExecution
  - typings.devtoolsProtocol.devtoolsProtocolStrings.RendererProcessKilled
  - typings.devtoolsProtocol.devtoolsProtocolStrings.RendererProcessCrashed
  - typings.devtoolsProtocol.devtoolsProtocolStrings.SchedulerTrackedFeatureUsed
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ConflictingBrowsingInstance
  - typings.devtoolsProtocol.devtoolsProtocolStrings.CacheFlushed
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ServiceWorkerVersionActivation
  - typings.devtoolsProtocol.devtoolsProtocolStrings.SessionRestored
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ServiceWorkerPostMessage
  - typings.devtoolsProtocol.devtoolsProtocolStrings.EnteredBackForwardCacheBeforeServiceWorkerHostAdded
  - typings.devtoolsProtocol.devtoolsProtocolStrings.RenderFrameHostReused_SameSite
  - typings.devtoolsProtocol.devtoolsProtocolStrings.RenderFrameHostReused_CrossSite
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ServiceWorkerClaim
  - typings.devtoolsProtocol.devtoolsProtocolStrings.IgnoreEventAndEvict
  - typings.devtoolsProtocol.devtoolsProtocolStrings.HaveInnerContents
  - typings.devtoolsProtocol.devtoolsProtocolStrings.TimeoutPuttingInCache
  - typings.devtoolsProtocol.devtoolsProtocolStrings.BackForwardCacheDisabledByLowMemory
  - typings.devtoolsProtocol.devtoolsProtocolStrings.BackForwardCacheDisabledByCommandLine
  - typings.devtoolsProtocol.devtoolsProtocolStrings.NetworkRequestDatapipeDrainedAsBytesConsumer
  - typings.devtoolsProtocol.devtoolsProtocolStrings.NetworkRequestRedirected
  - typings.devtoolsProtocol.devtoolsProtocolStrings.NetworkRequestTimeout
  - typings.devtoolsProtocol.devtoolsProtocolStrings.NetworkExceedsBufferLimit
  - typings.devtoolsProtocol.devtoolsProtocolStrings.NavigationCancelledWhileRestoring
  - typings.devtoolsProtocol.devtoolsProtocolStrings.NotMostRecentNavigationEntry
  - typings.devtoolsProtocol.devtoolsProtocolStrings.BackForwardCacheDisabledForPrerender
  - typings.devtoolsProtocol.devtoolsProtocolStrings.UserAgentOverrideDiffers
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ForegroundCacheLimit
  - typings.devtoolsProtocol.devtoolsProtocolStrings.BrowsingInstanceNotSwapped
  - typings.devtoolsProtocol.devtoolsProtocolStrings.BackForwardCacheDisabledForDelegate
  - typings.devtoolsProtocol.devtoolsProtocolStrings.UnloadHandlerExistsInMainFrame
  - typings.devtoolsProtocol.devtoolsProtocolStrings.UnloadHandlerExistsInSubFrame
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ServiceWorkerUnregistration
  - typings.devtoolsProtocol.devtoolsProtocolStrings.CacheControlNoStore
  - typings.devtoolsProtocol.devtoolsProtocolStrings.CacheControlNoStoreCookieModified
  - typings.devtoolsProtocol.devtoolsProtocolStrings.CacheControlNoStoreHTTPOnlyCookieModified
  - typings.devtoolsProtocol.devtoolsProtocolStrings.NoResponseHead
  - typings.devtoolsProtocol.devtoolsProtocolStrings.Unknown
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ActivationNavigationsDisallowedForBug1234857
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ErrorDocument
  - typings.devtoolsProtocol.devtoolsProtocolStrings.FencedFramesEmbedder
  - typings.devtoolsProtocol.devtoolsProtocolStrings.CookieDisabled
  - typings.devtoolsProtocol.devtoolsProtocolStrings.WebSocket
  - typings.devtoolsProtocol.devtoolsProtocolStrings.WebTransport
  - typings.devtoolsProtocol.devtoolsProtocolStrings.WebRTC
  - typings.devtoolsProtocol.devtoolsProtocolStrings.MainResourceHasCacheControlNoStore
  - typings.devtoolsProtocol.devtoolsProtocolStrings.MainResourceHasCacheControlNoCache
  - typings.devtoolsProtocol.devtoolsProtocolStrings.SubresourceHasCacheControlNoStore
  - typings.devtoolsProtocol.devtoolsProtocolStrings.SubresourceHasCacheControlNoCache
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ContainsPlugins
  - typings.devtoolsProtocol.devtoolsProtocolStrings.DocumentLoaded
  - typings.devtoolsProtocol.devtoolsProtocolStrings.DedicatedWorkerOrWorklet
  - typings.devtoolsProtocol.devtoolsProtocolStrings.OutstandingNetworkRequestOthers
  - typings.devtoolsProtocol.devtoolsProtocolStrings.OutstandingIndexedDBTransaction
  - typings.devtoolsProtocol.devtoolsProtocolStrings.RequestedMIDIPermission
  - typings.devtoolsProtocol.devtoolsProtocolStrings.RequestedAudioCapturePermission
  - typings.devtoolsProtocol.devtoolsProtocolStrings.RequestedVideoCapturePermission
  - typings.devtoolsProtocol.devtoolsProtocolStrings.RequestedBackForwardCacheBlockedSensors
  - typings.devtoolsProtocol.devtoolsProtocolStrings.RequestedBackgroundWorkPermission
  - typings.devtoolsProtocol.devtoolsProtocolStrings.BroadcastChannel
  - typings.devtoolsProtocol.devtoolsProtocolStrings.IndexedDBConnection
  - typings.devtoolsProtocol.devtoolsProtocolStrings.WebXR
  - typings.devtoolsProtocol.devtoolsProtocolStrings.SharedWorker
  - typings.devtoolsProtocol.devtoolsProtocolStrings.WebLocks
  - typings.devtoolsProtocol.devtoolsProtocolStrings.WebHID
  - typings.devtoolsProtocol.devtoolsProtocolStrings.WebShare
  - typings.devtoolsProtocol.devtoolsProtocolStrings.RequestedStorageAccessGrant
  - typings.devtoolsProtocol.devtoolsProtocolStrings.WebNfc
  - typings.devtoolsProtocol.devtoolsProtocolStrings.OutstandingNetworkRequestFetch
  - typings.devtoolsProtocol.devtoolsProtocolStrings.OutstandingNetworkRequestXHR
  - typings.devtoolsProtocol.devtoolsProtocolStrings.AppBanner
  - typings.devtoolsProtocol.devtoolsProtocolStrings.Printing
  - typings.devtoolsProtocol.devtoolsProtocolStrings.WebDatabase
  - typings.devtoolsProtocol.devtoolsProtocolStrings.PictureInPicture
  - typings.devtoolsProtocol.devtoolsProtocolStrings.Portal
  - typings.devtoolsProtocol.devtoolsProtocolStrings.SpeechRecognizer
  - typings.devtoolsProtocol.devtoolsProtocolStrings.IdleManager
  - typings.devtoolsProtocol.devtoolsProtocolStrings.PaymentManager
  - typings.devtoolsProtocol.devtoolsProtocolStrings.SpeechSynthesis
  - typings.devtoolsProtocol.devtoolsProtocolStrings.KeyboardLock
  - typings.devtoolsProtocol.devtoolsProtocolStrings.WebOTPService
  - typings.devtoolsProtocol.devtoolsProtocolStrings.OutstandingNetworkRequestDirectSocket
  - typings.devtoolsProtocol.devtoolsProtocolStrings.InjectedJavascript
  - typings.devtoolsProtocol.devtoolsProtocolStrings.InjectedStyleSheet
  - typings.devtoolsProtocol.devtoolsProtocolStrings.KeepaliveRequest
  - typings.devtoolsProtocol.devtoolsProtocolStrings.IndexedDBEvent
  - typings.devtoolsProtocol.devtoolsProtocolStrings.Dummy
  - typings.devtoolsProtocol.devtoolsProtocolStrings.JsNetworkRequestReceivedCacheControlNoStoreResource
  - typings.devtoolsProtocol.devtoolsProtocolStrings.WebRTCSticky
  - typings.devtoolsProtocol.devtoolsProtocolStrings.WebTransportSticky
  - typings.devtoolsProtocol.devtoolsProtocolStrings.WebSocketSticky
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ContentSecurityHandler
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ContentWebAuthenticationAPI
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ContentFileChooser
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ContentSerial
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ContentFileSystemAccess
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ContentMediaDevicesDispatcherHost
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ContentWebBluetooth
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ContentWebUSB
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ContentMediaSessionService
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ContentScreenReader
  - typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderPopupBlockerTabHelper
  - typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderSafeBrowsingTriggeredPopupBlocker
  - typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderSafeBrowsingThreatDetails
  - typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderAppBannerManager
  - typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderDomDistillerViewerSource
  - typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderDomDistillerSelfDeletingRequestDelegate
  - typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderOomInterventionTabHelper
  - typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderOfflinePage
  - typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderChromePasswordManagerClientBindCredentialManager
  - typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderPermissionRequestManager
  - typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderModalDialog
  - typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderExtensions
  - typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderExtensionMessaging
  - typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderExtensionMessagingForOpenPort
  - typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderExtensionSentMessageToCachedFrame
*/
trait BackForwardCacheNotRestoredReason extends StObject
object BackForwardCacheNotRestoredReason {
  
  inline def ActivationNavigationsDisallowedForBug1234857: typings.devtoolsProtocol.devtoolsProtocolStrings.ActivationNavigationsDisallowedForBug1234857 = "ActivationNavigationsDisallowedForBug1234857".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ActivationNavigationsDisallowedForBug1234857]
  
  inline def AppBanner: typings.devtoolsProtocol.devtoolsProtocolStrings.AppBanner = "AppBanner".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.AppBanner]
  
  inline def BackForwardCacheDisabled: typings.devtoolsProtocol.devtoolsProtocolStrings.BackForwardCacheDisabled = "BackForwardCacheDisabled".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.BackForwardCacheDisabled]
  
  inline def BackForwardCacheDisabledByCommandLine: typings.devtoolsProtocol.devtoolsProtocolStrings.BackForwardCacheDisabledByCommandLine = "BackForwardCacheDisabledByCommandLine".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.BackForwardCacheDisabledByCommandLine]
  
  inline def BackForwardCacheDisabledByLowMemory: typings.devtoolsProtocol.devtoolsProtocolStrings.BackForwardCacheDisabledByLowMemory = "BackForwardCacheDisabledByLowMemory".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.BackForwardCacheDisabledByLowMemory]
  
  inline def BackForwardCacheDisabledForDelegate: typings.devtoolsProtocol.devtoolsProtocolStrings.BackForwardCacheDisabledForDelegate = "BackForwardCacheDisabledForDelegate".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.BackForwardCacheDisabledForDelegate]
  
  inline def BackForwardCacheDisabledForPrerender: typings.devtoolsProtocol.devtoolsProtocolStrings.BackForwardCacheDisabledForPrerender = "BackForwardCacheDisabledForPrerender".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.BackForwardCacheDisabledForPrerender]
  
  inline def BroadcastChannel: typings.devtoolsProtocol.devtoolsProtocolStrings.BroadcastChannel = "BroadcastChannel".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.BroadcastChannel]
  
  inline def BrowsingInstanceNotSwapped: typings.devtoolsProtocol.devtoolsProtocolStrings.BrowsingInstanceNotSwapped = "BrowsingInstanceNotSwapped".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.BrowsingInstanceNotSwapped]
  
  inline def CacheControlNoStore: typings.devtoolsProtocol.devtoolsProtocolStrings.CacheControlNoStore = "CacheControlNoStore".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.CacheControlNoStore]
  
  inline def CacheControlNoStoreCookieModified: typings.devtoolsProtocol.devtoolsProtocolStrings.CacheControlNoStoreCookieModified = "CacheControlNoStoreCookieModified".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.CacheControlNoStoreCookieModified]
  
  inline def CacheControlNoStoreHTTPOnlyCookieModified: typings.devtoolsProtocol.devtoolsProtocolStrings.CacheControlNoStoreHTTPOnlyCookieModified = "CacheControlNoStoreHTTPOnlyCookieModified".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.CacheControlNoStoreHTTPOnlyCookieModified]
  
  inline def CacheFlushed: typings.devtoolsProtocol.devtoolsProtocolStrings.CacheFlushed = "CacheFlushed".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.CacheFlushed]
  
  inline def CacheLimit: typings.devtoolsProtocol.devtoolsProtocolStrings.CacheLimit = "CacheLimit".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.CacheLimit]
  
  inline def ConflictingBrowsingInstance: typings.devtoolsProtocol.devtoolsProtocolStrings.ConflictingBrowsingInstance = "ConflictingBrowsingInstance".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ConflictingBrowsingInstance]
  
  inline def ContainsPlugins: typings.devtoolsProtocol.devtoolsProtocolStrings.ContainsPlugins = "ContainsPlugins".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ContainsPlugins]
  
  inline def ContentFileChooser: typings.devtoolsProtocol.devtoolsProtocolStrings.ContentFileChooser = "ContentFileChooser".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ContentFileChooser]
  
  inline def ContentFileSystemAccess: typings.devtoolsProtocol.devtoolsProtocolStrings.ContentFileSystemAccess = "ContentFileSystemAccess".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ContentFileSystemAccess]
  
  inline def ContentMediaDevicesDispatcherHost: typings.devtoolsProtocol.devtoolsProtocolStrings.ContentMediaDevicesDispatcherHost = "ContentMediaDevicesDispatcherHost".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ContentMediaDevicesDispatcherHost]
  
  inline def ContentMediaSessionService: typings.devtoolsProtocol.devtoolsProtocolStrings.ContentMediaSessionService = "ContentMediaSessionService".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ContentMediaSessionService]
  
  inline def ContentScreenReader: typings.devtoolsProtocol.devtoolsProtocolStrings.ContentScreenReader = "ContentScreenReader".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ContentScreenReader]
  
  inline def ContentSecurityHandler: typings.devtoolsProtocol.devtoolsProtocolStrings.ContentSecurityHandler = "ContentSecurityHandler".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ContentSecurityHandler]
  
  inline def ContentSerial: typings.devtoolsProtocol.devtoolsProtocolStrings.ContentSerial = "ContentSerial".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ContentSerial]
  
  inline def ContentWebAuthenticationAPI: typings.devtoolsProtocol.devtoolsProtocolStrings.ContentWebAuthenticationAPI = "ContentWebAuthenticationAPI".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ContentWebAuthenticationAPI]
  
  inline def ContentWebBluetooth: typings.devtoolsProtocol.devtoolsProtocolStrings.ContentWebBluetooth = "ContentWebBluetooth".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ContentWebBluetooth]
  
  inline def ContentWebUSB: typings.devtoolsProtocol.devtoolsProtocolStrings.ContentWebUSB = "ContentWebUSB".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ContentWebUSB]
  
  inline def CookieDisabled: typings.devtoolsProtocol.devtoolsProtocolStrings.CookieDisabled = "CookieDisabled".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.CookieDisabled]
  
  inline def DedicatedWorkerOrWorklet: typings.devtoolsProtocol.devtoolsProtocolStrings.DedicatedWorkerOrWorklet = "DedicatedWorkerOrWorklet".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.DedicatedWorkerOrWorklet]
  
  inline def DisableForRenderFrameHostCalled: typings.devtoolsProtocol.devtoolsProtocolStrings.DisableForRenderFrameHostCalled = "DisableForRenderFrameHostCalled".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.DisableForRenderFrameHostCalled]
  
  inline def DocumentLoaded: typings.devtoolsProtocol.devtoolsProtocolStrings.DocumentLoaded = "DocumentLoaded".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.DocumentLoaded]
  
  inline def DomainNotAllowed: typings.devtoolsProtocol.devtoolsProtocolStrings.DomainNotAllowed = "DomainNotAllowed".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.DomainNotAllowed]
  
  inline def Dummy: typings.devtoolsProtocol.devtoolsProtocolStrings.Dummy = "Dummy".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.Dummy]
  
  inline def EmbedderAppBannerManager: typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderAppBannerManager = "EmbedderAppBannerManager".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderAppBannerManager]
  
  inline def EmbedderChromePasswordManagerClientBindCredentialManager: typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderChromePasswordManagerClientBindCredentialManager = "EmbedderChromePasswordManagerClientBindCredentialManager".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderChromePasswordManagerClientBindCredentialManager]
  
  inline def EmbedderDomDistillerSelfDeletingRequestDelegate: typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderDomDistillerSelfDeletingRequestDelegate = "EmbedderDomDistillerSelfDeletingRequestDelegate".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderDomDistillerSelfDeletingRequestDelegate]
  
  inline def EmbedderDomDistillerViewerSource: typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderDomDistillerViewerSource = "EmbedderDomDistillerViewerSource".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderDomDistillerViewerSource]
  
  inline def EmbedderExtensionMessaging: typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderExtensionMessaging = "EmbedderExtensionMessaging".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderExtensionMessaging]
  
  inline def EmbedderExtensionMessagingForOpenPort: typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderExtensionMessagingForOpenPort = "EmbedderExtensionMessagingForOpenPort".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderExtensionMessagingForOpenPort]
  
  inline def EmbedderExtensionSentMessageToCachedFrame: typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderExtensionSentMessageToCachedFrame = "EmbedderExtensionSentMessageToCachedFrame".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderExtensionSentMessageToCachedFrame]
  
  inline def EmbedderExtensions: typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderExtensions = "EmbedderExtensions".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderExtensions]
  
  inline def EmbedderModalDialog: typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderModalDialog = "EmbedderModalDialog".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderModalDialog]
  
  inline def EmbedderOfflinePage: typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderOfflinePage = "EmbedderOfflinePage".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderOfflinePage]
  
  inline def EmbedderOomInterventionTabHelper: typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderOomInterventionTabHelper = "EmbedderOomInterventionTabHelper".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderOomInterventionTabHelper]
  
  inline def EmbedderPermissionRequestManager: typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderPermissionRequestManager = "EmbedderPermissionRequestManager".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderPermissionRequestManager]
  
  inline def EmbedderPopupBlockerTabHelper: typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderPopupBlockerTabHelper = "EmbedderPopupBlockerTabHelper".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderPopupBlockerTabHelper]
  
  inline def EmbedderSafeBrowsingThreatDetails: typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderSafeBrowsingThreatDetails = "EmbedderSafeBrowsingThreatDetails".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderSafeBrowsingThreatDetails]
  
  inline def EmbedderSafeBrowsingTriggeredPopupBlocker: typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderSafeBrowsingTriggeredPopupBlocker = "EmbedderSafeBrowsingTriggeredPopupBlocker".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderSafeBrowsingTriggeredPopupBlocker]
  
  inline def EnteredBackForwardCacheBeforeServiceWorkerHostAdded: typings.devtoolsProtocol.devtoolsProtocolStrings.EnteredBackForwardCacheBeforeServiceWorkerHostAdded = "EnteredBackForwardCacheBeforeServiceWorkerHostAdded".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.EnteredBackForwardCacheBeforeServiceWorkerHostAdded]
  
  inline def ErrorDocument: typings.devtoolsProtocol.devtoolsProtocolStrings.ErrorDocument = "ErrorDocument".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ErrorDocument]
  
  inline def FencedFramesEmbedder: typings.devtoolsProtocol.devtoolsProtocolStrings.FencedFramesEmbedder = "FencedFramesEmbedder".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.FencedFramesEmbedder]
  
  inline def ForegroundCacheLimit: typings.devtoolsProtocol.devtoolsProtocolStrings.ForegroundCacheLimit = "ForegroundCacheLimit".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ForegroundCacheLimit]
  
  inline def HTTPMethodNotGET: typings.devtoolsProtocol.devtoolsProtocolStrings.HTTPMethodNotGET = "HTTPMethodNotGET".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.HTTPMethodNotGET]
  
  inline def HTTPStatusNotOK: typings.devtoolsProtocol.devtoolsProtocolStrings.HTTPStatusNotOK = "HTTPStatusNotOK".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.HTTPStatusNotOK]
  
  inline def HaveInnerContents: typings.devtoolsProtocol.devtoolsProtocolStrings.HaveInnerContents = "HaveInnerContents".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.HaveInnerContents]
  
  inline def IdleManager: typings.devtoolsProtocol.devtoolsProtocolStrings.IdleManager = "IdleManager".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.IdleManager]
  
  inline def IgnoreEventAndEvict: typings.devtoolsProtocol.devtoolsProtocolStrings.IgnoreEventAndEvict = "IgnoreEventAndEvict".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.IgnoreEventAndEvict]
  
  inline def IndexedDBConnection: typings.devtoolsProtocol.devtoolsProtocolStrings.IndexedDBConnection = "IndexedDBConnection".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.IndexedDBConnection]
  
  inline def IndexedDBEvent: typings.devtoolsProtocol.devtoolsProtocolStrings.IndexedDBEvent = "IndexedDBEvent".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.IndexedDBEvent]
  
  inline def InjectedJavascript: typings.devtoolsProtocol.devtoolsProtocolStrings.InjectedJavascript = "InjectedJavascript".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.InjectedJavascript]
  
  inline def InjectedStyleSheet: typings.devtoolsProtocol.devtoolsProtocolStrings.InjectedStyleSheet = "InjectedStyleSheet".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.InjectedStyleSheet]
  
  inline def JavaScriptExecution: typings.devtoolsProtocol.devtoolsProtocolStrings.JavaScriptExecution = "JavaScriptExecution".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.JavaScriptExecution]
  
  inline def JsNetworkRequestReceivedCacheControlNoStoreResource: typings.devtoolsProtocol.devtoolsProtocolStrings.JsNetworkRequestReceivedCacheControlNoStoreResource = "JsNetworkRequestReceivedCacheControlNoStoreResource".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.JsNetworkRequestReceivedCacheControlNoStoreResource]
  
  inline def KeepaliveRequest: typings.devtoolsProtocol.devtoolsProtocolStrings.KeepaliveRequest = "KeepaliveRequest".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.KeepaliveRequest]
  
  inline def KeyboardLock: typings.devtoolsProtocol.devtoolsProtocolStrings.KeyboardLock = "KeyboardLock".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.KeyboardLock]
  
  inline def Loading: typings.devtoolsProtocol.devtoolsProtocolStrings.Loading = "Loading".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.Loading]
  
  inline def MainResourceHasCacheControlNoCache: typings.devtoolsProtocol.devtoolsProtocolStrings.MainResourceHasCacheControlNoCache = "MainResourceHasCacheControlNoCache".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.MainResourceHasCacheControlNoCache]
  
  inline def MainResourceHasCacheControlNoStore: typings.devtoolsProtocol.devtoolsProtocolStrings.MainResourceHasCacheControlNoStore = "MainResourceHasCacheControlNoStore".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.MainResourceHasCacheControlNoStore]
  
  inline def NavigationCancelledWhileRestoring: typings.devtoolsProtocol.devtoolsProtocolStrings.NavigationCancelledWhileRestoring = "NavigationCancelledWhileRestoring".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.NavigationCancelledWhileRestoring]
  
  inline def NetworkExceedsBufferLimit: typings.devtoolsProtocol.devtoolsProtocolStrings.NetworkExceedsBufferLimit = "NetworkExceedsBufferLimit".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.NetworkExceedsBufferLimit]
  
  inline def NetworkRequestDatapipeDrainedAsBytesConsumer: typings.devtoolsProtocol.devtoolsProtocolStrings.NetworkRequestDatapipeDrainedAsBytesConsumer = "NetworkRequestDatapipeDrainedAsBytesConsumer".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.NetworkRequestDatapipeDrainedAsBytesConsumer]
  
  inline def NetworkRequestRedirected: typings.devtoolsProtocol.devtoolsProtocolStrings.NetworkRequestRedirected = "NetworkRequestRedirected".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.NetworkRequestRedirected]
  
  inline def NetworkRequestTimeout: typings.devtoolsProtocol.devtoolsProtocolStrings.NetworkRequestTimeout = "NetworkRequestTimeout".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.NetworkRequestTimeout]
  
  inline def NoResponseHead: typings.devtoolsProtocol.devtoolsProtocolStrings.NoResponseHead = "NoResponseHead".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.NoResponseHead]
  
  inline def NotMostRecentNavigationEntry: typings.devtoolsProtocol.devtoolsProtocolStrings.NotMostRecentNavigationEntry = "NotMostRecentNavigationEntry".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.NotMostRecentNavigationEntry]
  
  inline def NotPrimaryMainFrame: typings.devtoolsProtocol.devtoolsProtocolStrings.NotPrimaryMainFrame = "NotPrimaryMainFrame".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.NotPrimaryMainFrame]
  
  inline def OutstandingIndexedDBTransaction: typings.devtoolsProtocol.devtoolsProtocolStrings.OutstandingIndexedDBTransaction = "OutstandingIndexedDBTransaction".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.OutstandingIndexedDBTransaction]
  
  inline def OutstandingNetworkRequestDirectSocket: typings.devtoolsProtocol.devtoolsProtocolStrings.OutstandingNetworkRequestDirectSocket = "OutstandingNetworkRequestDirectSocket".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.OutstandingNetworkRequestDirectSocket]
  
  inline def OutstandingNetworkRequestFetch: typings.devtoolsProtocol.devtoolsProtocolStrings.OutstandingNetworkRequestFetch = "OutstandingNetworkRequestFetch".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.OutstandingNetworkRequestFetch]
  
  inline def OutstandingNetworkRequestOthers: typings.devtoolsProtocol.devtoolsProtocolStrings.OutstandingNetworkRequestOthers = "OutstandingNetworkRequestOthers".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.OutstandingNetworkRequestOthers]
  
  inline def OutstandingNetworkRequestXHR: typings.devtoolsProtocol.devtoolsProtocolStrings.OutstandingNetworkRequestXHR = "OutstandingNetworkRequestXHR".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.OutstandingNetworkRequestXHR]
  
  inline def PaymentManager: typings.devtoolsProtocol.devtoolsProtocolStrings.PaymentManager = "PaymentManager".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.PaymentManager]
  
  inline def PictureInPicture: typings.devtoolsProtocol.devtoolsProtocolStrings.PictureInPicture = "PictureInPicture".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.PictureInPicture]
  
  inline def Portal: typings.devtoolsProtocol.devtoolsProtocolStrings.Portal = "Portal".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.Portal]
  
  inline def Printing: typings.devtoolsProtocol.devtoolsProtocolStrings.Printing = "Printing".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.Printing]
  
  inline def RelatedActiveContentsExist: typings.devtoolsProtocol.devtoolsProtocolStrings.RelatedActiveContentsExist = "RelatedActiveContentsExist".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.RelatedActiveContentsExist]
  
  inline def RenderFrameHostReused_CrossSite: typings.devtoolsProtocol.devtoolsProtocolStrings.RenderFrameHostReused_CrossSite = "RenderFrameHostReused_CrossSite".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.RenderFrameHostReused_CrossSite]
  
  inline def RenderFrameHostReused_SameSite: typings.devtoolsProtocol.devtoolsProtocolStrings.RenderFrameHostReused_SameSite = "RenderFrameHostReused_SameSite".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.RenderFrameHostReused_SameSite]
  
  inline def RendererProcessCrashed: typings.devtoolsProtocol.devtoolsProtocolStrings.RendererProcessCrashed = "RendererProcessCrashed".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.RendererProcessCrashed]
  
  inline def RendererProcessKilled: typings.devtoolsProtocol.devtoolsProtocolStrings.RendererProcessKilled = "RendererProcessKilled".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.RendererProcessKilled]
  
  inline def RequestedAudioCapturePermission: typings.devtoolsProtocol.devtoolsProtocolStrings.RequestedAudioCapturePermission = "RequestedAudioCapturePermission".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.RequestedAudioCapturePermission]
  
  inline def RequestedBackForwardCacheBlockedSensors: typings.devtoolsProtocol.devtoolsProtocolStrings.RequestedBackForwardCacheBlockedSensors = "RequestedBackForwardCacheBlockedSensors".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.RequestedBackForwardCacheBlockedSensors]
  
  inline def RequestedBackgroundWorkPermission: typings.devtoolsProtocol.devtoolsProtocolStrings.RequestedBackgroundWorkPermission = "RequestedBackgroundWorkPermission".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.RequestedBackgroundWorkPermission]
  
  inline def RequestedMIDIPermission: typings.devtoolsProtocol.devtoolsProtocolStrings.RequestedMIDIPermission = "RequestedMIDIPermission".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.RequestedMIDIPermission]
  
  inline def RequestedStorageAccessGrant: typings.devtoolsProtocol.devtoolsProtocolStrings.RequestedStorageAccessGrant = "RequestedStorageAccessGrant".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.RequestedStorageAccessGrant]
  
  inline def RequestedVideoCapturePermission: typings.devtoolsProtocol.devtoolsProtocolStrings.RequestedVideoCapturePermission = "RequestedVideoCapturePermission".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.RequestedVideoCapturePermission]
  
  inline def SchedulerTrackedFeatureUsed: typings.devtoolsProtocol.devtoolsProtocolStrings.SchedulerTrackedFeatureUsed = "SchedulerTrackedFeatureUsed".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.SchedulerTrackedFeatureUsed]
  
  inline def SchemeNotHTTPOrHTTPS: typings.devtoolsProtocol.devtoolsProtocolStrings.SchemeNotHTTPOrHTTPS = "SchemeNotHTTPOrHTTPS".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.SchemeNotHTTPOrHTTPS]
  
  inline def ServiceWorkerClaim: typings.devtoolsProtocol.devtoolsProtocolStrings.ServiceWorkerClaim = "ServiceWorkerClaim".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ServiceWorkerClaim]
  
  inline def ServiceWorkerPostMessage: typings.devtoolsProtocol.devtoolsProtocolStrings.ServiceWorkerPostMessage = "ServiceWorkerPostMessage".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ServiceWorkerPostMessage]
  
  inline def ServiceWorkerUnregistration: typings.devtoolsProtocol.devtoolsProtocolStrings.ServiceWorkerUnregistration = "ServiceWorkerUnregistration".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ServiceWorkerUnregistration]
  
  inline def ServiceWorkerVersionActivation: typings.devtoolsProtocol.devtoolsProtocolStrings.ServiceWorkerVersionActivation = "ServiceWorkerVersionActivation".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ServiceWorkerVersionActivation]
  
  inline def SessionRestored: typings.devtoolsProtocol.devtoolsProtocolStrings.SessionRestored = "SessionRestored".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.SessionRestored]
  
  inline def SharedWorker: typings.devtoolsProtocol.devtoolsProtocolStrings.SharedWorker = "SharedWorker".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.SharedWorker]
  
  inline def SpeechRecognizer: typings.devtoolsProtocol.devtoolsProtocolStrings.SpeechRecognizer = "SpeechRecognizer".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.SpeechRecognizer]
  
  inline def SpeechSynthesis: typings.devtoolsProtocol.devtoolsProtocolStrings.SpeechSynthesis = "SpeechSynthesis".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.SpeechSynthesis]
  
  inline def SubframeIsNavigating: typings.devtoolsProtocol.devtoolsProtocolStrings.SubframeIsNavigating = "SubframeIsNavigating".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.SubframeIsNavigating]
  
  inline def SubresourceHasCacheControlNoCache: typings.devtoolsProtocol.devtoolsProtocolStrings.SubresourceHasCacheControlNoCache = "SubresourceHasCacheControlNoCache".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.SubresourceHasCacheControlNoCache]
  
  inline def SubresourceHasCacheControlNoStore: typings.devtoolsProtocol.devtoolsProtocolStrings.SubresourceHasCacheControlNoStore = "SubresourceHasCacheControlNoStore".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.SubresourceHasCacheControlNoStore]
  
  inline def Timeout: typings.devtoolsProtocol.devtoolsProtocolStrings.Timeout = "Timeout".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.Timeout]
  
  inline def TimeoutPuttingInCache: typings.devtoolsProtocol.devtoolsProtocolStrings.TimeoutPuttingInCache = "TimeoutPuttingInCache".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.TimeoutPuttingInCache]
  
  inline def Unknown: typings.devtoolsProtocol.devtoolsProtocolStrings.Unknown = "Unknown".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.Unknown]
  
  inline def UnloadHandlerExistsInMainFrame: typings.devtoolsProtocol.devtoolsProtocolStrings.UnloadHandlerExistsInMainFrame = "UnloadHandlerExistsInMainFrame".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.UnloadHandlerExistsInMainFrame]
  
  inline def UnloadHandlerExistsInSubFrame: typings.devtoolsProtocol.devtoolsProtocolStrings.UnloadHandlerExistsInSubFrame = "UnloadHandlerExistsInSubFrame".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.UnloadHandlerExistsInSubFrame]
  
  inline def UserAgentOverrideDiffers: typings.devtoolsProtocol.devtoolsProtocolStrings.UserAgentOverrideDiffers = "UserAgentOverrideDiffers".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.UserAgentOverrideDiffers]
  
  inline def WasGrantedMediaAccess: typings.devtoolsProtocol.devtoolsProtocolStrings.WasGrantedMediaAccess = "WasGrantedMediaAccess".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.WasGrantedMediaAccess]
  
  inline def WebDatabase: typings.devtoolsProtocol.devtoolsProtocolStrings.WebDatabase = "WebDatabase".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.WebDatabase]
  
  inline def WebHID: typings.devtoolsProtocol.devtoolsProtocolStrings.WebHID = "WebHID".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.WebHID]
  
  inline def WebLocks: typings.devtoolsProtocol.devtoolsProtocolStrings.WebLocks = "WebLocks".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.WebLocks]
  
  inline def WebNfc: typings.devtoolsProtocol.devtoolsProtocolStrings.WebNfc = "WebNfc".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.WebNfc]
  
  inline def WebOTPService: typings.devtoolsProtocol.devtoolsProtocolStrings.WebOTPService = "WebOTPService".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.WebOTPService]
  
  inline def WebRTC: typings.devtoolsProtocol.devtoolsProtocolStrings.WebRTC = "WebRTC".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.WebRTC]
  
  inline def WebRTCSticky: typings.devtoolsProtocol.devtoolsProtocolStrings.WebRTCSticky = "WebRTCSticky".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.WebRTCSticky]
  
  inline def WebShare: typings.devtoolsProtocol.devtoolsProtocolStrings.WebShare = "WebShare".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.WebShare]
  
  inline def WebSocket: typings.devtoolsProtocol.devtoolsProtocolStrings.WebSocket = "WebSocket".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.WebSocket]
  
  inline def WebSocketSticky: typings.devtoolsProtocol.devtoolsProtocolStrings.WebSocketSticky = "WebSocketSticky".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.WebSocketSticky]
  
  inline def WebTransport: typings.devtoolsProtocol.devtoolsProtocolStrings.WebTransport = "WebTransport".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.WebTransport]
  
  inline def WebTransportSticky: typings.devtoolsProtocol.devtoolsProtocolStrings.WebTransportSticky = "WebTransportSticky".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.WebTransportSticky]
  
  inline def WebXR: typings.devtoolsProtocol.devtoolsProtocolStrings.WebXR = "WebXR".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.WebXR]
}
