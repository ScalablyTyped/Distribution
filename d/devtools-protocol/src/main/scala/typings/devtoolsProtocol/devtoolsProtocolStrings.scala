package typings.devtoolsProtocol

import typings.devtoolsProtocol.mod.Protocol.Accessibility.AXPropertyName
import typings.devtoolsProtocol.mod.Protocol.Accessibility.AXValueNativeSourceType
import typings.devtoolsProtocol.mod.Protocol.Accessibility.AXValueSourceType
import typings.devtoolsProtocol.mod.Protocol.Accessibility.AXValueType
import typings.devtoolsProtocol.mod.Protocol.Animation.AnimationType
import typings.devtoolsProtocol.mod.Protocol.Audits.AttributionReportingIssueType
import typings.devtoolsProtocol.mod.Protocol.Audits.BlockedByResponseReason
import typings.devtoolsProtocol.mod.Protocol.Audits.ClientHintIssueReason
import typings.devtoolsProtocol.mod.Protocol.Audits.ContentSecurityPolicyViolationType
import typings.devtoolsProtocol.mod.Protocol.Audits.CookieExclusionReason
import typings.devtoolsProtocol.mod.Protocol.Audits.CookieOperation
import typings.devtoolsProtocol.mod.Protocol.Audits.CookieWarningReason
import typings.devtoolsProtocol.mod.Protocol.Audits.DeprecationIssueType
import typings.devtoolsProtocol.mod.Protocol.Audits.FederatedAuthRequestIssueReason
import typings.devtoolsProtocol.mod.Protocol.Audits.GetEncodedResponseRequestEncoding
import typings.devtoolsProtocol.mod.Protocol.Audits.HeavyAdReason
import typings.devtoolsProtocol.mod.Protocol.Audits.HeavyAdResolutionStatus
import typings.devtoolsProtocol.mod.Protocol.Audits.InspectorIssueCode
import typings.devtoolsProtocol.mod.Protocol.Audits.MixedContentResolutionStatus
import typings.devtoolsProtocol.mod.Protocol.Audits.MixedContentResourceType
import typings.devtoolsProtocol.mod.Protocol.Audits.SharedArrayBufferIssueType
import typings.devtoolsProtocol.mod.Protocol.Audits.TwaQualityEnforcementViolationType
import typings.devtoolsProtocol.mod.Protocol.BackgroundService.ServiceName
import typings.devtoolsProtocol.mod.Protocol.Browser.BrowserCommandId
import typings.devtoolsProtocol.mod.Protocol.Browser.PermissionSetting
import typings.devtoolsProtocol.mod.Protocol.Browser.PermissionType
import typings.devtoolsProtocol.mod.Protocol.Browser.SetDownloadBehaviorRequestBehavior
import typings.devtoolsProtocol.mod.Protocol.Browser.WindowState
import typings.devtoolsProtocol.mod.Protocol.CSS.CSSMediaSource
import typings.devtoolsProtocol.mod.Protocol.CSS.StyleSheetOrigin
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.CachedResponseType
import typings.devtoolsProtocol.mod.Protocol.Console.ConsoleMessageLevel
import typings.devtoolsProtocol.mod.Protocol.Console.ConsoleMessageSource
import typings.devtoolsProtocol.mod.Protocol.DOM.CompatibilityMode
import typings.devtoolsProtocol.mod.Protocol.DOM.EnableRequestIncludeWhitespace
import typings.devtoolsProtocol.mod.Protocol.DOM.PseudoType
import typings.devtoolsProtocol.mod.Protocol.DOM.ShadowRootType
import typings.devtoolsProtocol.mod.Protocol.DOMDebugger.CSPViolationType
import typings.devtoolsProtocol.mod.Protocol.DOMDebugger.DOMBreakpointType
import typings.devtoolsProtocol.mod.Protocol.Debugger.BreakLocationType
import typings.devtoolsProtocol.mod.Protocol.Debugger.ContinueToLocationRequestTargetCallFrames
import typings.devtoolsProtocol.mod.Protocol.Debugger.DebugSymbolsType
import typings.devtoolsProtocol.mod.Protocol.Debugger.PausedEventReason
import typings.devtoolsProtocol.mod.Protocol.Debugger.ScopeType
import typings.devtoolsProtocol.mod.Protocol.Debugger.ScriptLanguage
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetInstrumentationBreakpointRequestInstrumentation
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetPauseOnExceptionsRequestState
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetScriptSourceResponseStatus
import typings.devtoolsProtocol.mod.Protocol.Emulation.DisabledImageType
import typings.devtoolsProtocol.mod.Protocol.Emulation.DisplayFeatureOrientation
import typings.devtoolsProtocol.mod.Protocol.Emulation.ScreenOrientationType
import typings.devtoolsProtocol.mod.Protocol.Emulation.SetEmitTouchEventsForMouseRequestConfiguration
import typings.devtoolsProtocol.mod.Protocol.Emulation.SetEmulatedVisionDeficiencyRequestType
import typings.devtoolsProtocol.mod.Protocol.Emulation.VirtualTimePolicy
import typings.devtoolsProtocol.mod.Protocol.Fetch.RequestStage
import typings.devtoolsProtocol.mod.Protocol.HeadlessExperimental.ScreenshotParamsFormat
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.KeyPathType
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.KeyType
import typings.devtoolsProtocol.mod.Protocol.Input.DispatchDragEventRequestType
import typings.devtoolsProtocol.mod.Protocol.Input.DispatchKeyEventRequestType
import typings.devtoolsProtocol.mod.Protocol.Input.DispatchMouseEventRequestPointerType
import typings.devtoolsProtocol.mod.Protocol.Input.DispatchMouseEventRequestType
import typings.devtoolsProtocol.mod.Protocol.Input.DispatchTouchEventRequestType
import typings.devtoolsProtocol.mod.Protocol.Input.EmulateTouchFromMouseEventRequestType
import typings.devtoolsProtocol.mod.Protocol.Input.GestureSourceType
import typings.devtoolsProtocol.mod.Protocol.Input.MouseButton
import typings.devtoolsProtocol.mod.Protocol.LayerTree.ScrollRectType
import typings.devtoolsProtocol.mod.Protocol.Log.LogEntryLevel
import typings.devtoolsProtocol.mod.Protocol.Log.LogEntrySource
import typings.devtoolsProtocol.mod.Protocol.Log.ViolationSettingName
import typings.devtoolsProtocol.mod.Protocol.Media.PlayerMessageLevel
import typings.devtoolsProtocol.mod.Protocol.Memory.PressureLevel
import typings.devtoolsProtocol.mod.Protocol.Network.AlternateProtocolUsage
import typings.devtoolsProtocol.mod.Protocol.Network.AuthChallengeResponseResponse
import typings.devtoolsProtocol.mod.Protocol.Network.AuthChallengeSource
import typings.devtoolsProtocol.mod.Protocol.Network.BlockedReason
import typings.devtoolsProtocol.mod.Protocol.Network.CertificateTransparencyCompliance
import typings.devtoolsProtocol.mod.Protocol.Network.ConnectionType
import typings.devtoolsProtocol.mod.Protocol.Network.ContentEncoding
import typings.devtoolsProtocol.mod.Protocol.Network.CookieBlockedReason
import typings.devtoolsProtocol.mod.Protocol.Network.CookiePriority
import typings.devtoolsProtocol.mod.Protocol.Network.CookieSameSite
import typings.devtoolsProtocol.mod.Protocol.Network.CookieSourceScheme
import typings.devtoolsProtocol.mod.Protocol.Network.CorsError
import typings.devtoolsProtocol.mod.Protocol.Network.CrossOriginEmbedderPolicyValue
import typings.devtoolsProtocol.mod.Protocol.Network.CrossOriginOpenerPolicyValue
import typings.devtoolsProtocol.mod.Protocol.Network.ErrorReason
import typings.devtoolsProtocol.mod.Protocol.Network.IPAddressSpace
import typings.devtoolsProtocol.mod.Protocol.Network.InitiatorType
import typings.devtoolsProtocol.mod.Protocol.Network.InterceptionStage
import typings.devtoolsProtocol.mod.Protocol.Network.PrivateNetworkRequestPolicy
import typings.devtoolsProtocol.mod.Protocol.Network.ReportStatus
import typings.devtoolsProtocol.mod.Protocol.Network.RequestReferrerPolicy
import typings.devtoolsProtocol.mod.Protocol.Network.ResourcePriority
import typings.devtoolsProtocol.mod.Protocol.Network.ResourceType
import typings.devtoolsProtocol.mod.Protocol.Network.ServiceWorkerResponseSource
import typings.devtoolsProtocol.mod.Protocol.Network.SetCookieBlockedReason
import typings.devtoolsProtocol.mod.Protocol.Network.SignedExchangeErrorField
import typings.devtoolsProtocol.mod.Protocol.Network.TrustTokenOperationDoneEventStatus
import typings.devtoolsProtocol.mod.Protocol.Network.TrustTokenOperationType
import typings.devtoolsProtocol.mod.Protocol.Network.TrustTokenParamsRefreshPolicy
import typings.devtoolsProtocol.mod.Protocol.Overlay.ColorFormat
import typings.devtoolsProtocol.mod.Protocol.Overlay.ContrastAlgorithm
import typings.devtoolsProtocol.mod.Protocol.Overlay.InspectMode
import typings.devtoolsProtocol.mod.Protocol.Overlay.LineStylePattern
import typings.devtoolsProtocol.mod.Protocol.Page.AdFrameExplanation
import typings.devtoolsProtocol.mod.Protocol.Page.AdFrameType
import typings.devtoolsProtocol.mod.Protocol.Page.BackForwardCacheNotRestoredReason
import typings.devtoolsProtocol.mod.Protocol.Page.BackForwardCacheNotRestoredReasonType
import typings.devtoolsProtocol.mod.Protocol.Page.CaptureScreenshotRequestFormat
import typings.devtoolsProtocol.mod.Protocol.Page.ClientNavigationDisposition
import typings.devtoolsProtocol.mod.Protocol.Page.ClientNavigationReason
import typings.devtoolsProtocol.mod.Protocol.Page.CrossOriginIsolatedContextType
import typings.devtoolsProtocol.mod.Protocol.Page.DialogType
import typings.devtoolsProtocol.mod.Protocol.Page.DownloadProgressEventState
import typings.devtoolsProtocol.mod.Protocol.Page.FileChooserOpenedEventMode
import typings.devtoolsProtocol.mod.Protocol.Page.FrameDetachedEventReason
import typings.devtoolsProtocol.mod.Protocol.Page.GatedAPIFeatures
import typings.devtoolsProtocol.mod.Protocol.Page.NavigationType
import typings.devtoolsProtocol.mod.Protocol.Page.OriginTrialStatus
import typings.devtoolsProtocol.mod.Protocol.Page.OriginTrialTokenStatus
import typings.devtoolsProtocol.mod.Protocol.Page.OriginTrialUsageRestriction
import typings.devtoolsProtocol.mod.Protocol.Page.PermissionsPolicyBlockReason
import typings.devtoolsProtocol.mod.Protocol.Page.PermissionsPolicyFeature
import typings.devtoolsProtocol.mod.Protocol.Page.PrerenderFinalStatus
import typings.devtoolsProtocol.mod.Protocol.Page.PrintToPDFRequestTransferMode
import typings.devtoolsProtocol.mod.Protocol.Page.ReferrerPolicy
import typings.devtoolsProtocol.mod.Protocol.Page.SecureContextType
import typings.devtoolsProtocol.mod.Protocol.Page.SetSPCTransactionModeRequestMode
import typings.devtoolsProtocol.mod.Protocol.Page.SetTouchEmulationEnabledRequestConfiguration
import typings.devtoolsProtocol.mod.Protocol.Page.SetWebLifecycleStateRequestState
import typings.devtoolsProtocol.mod.Protocol.Page.StartScreencastRequestFormat
import typings.devtoolsProtocol.mod.Protocol.Page.TransitionType
import typings.devtoolsProtocol.mod.Protocol.Performance.EnableRequestTimeDomain
import typings.devtoolsProtocol.mod.Protocol.Performance.SetTimeDomainRequestTimeDomain
import typings.devtoolsProtocol.mod.Protocol.Runtime.ConsoleAPICalledEventType
import typings.devtoolsProtocol.mod.Protocol.Runtime.ObjectPreviewSubtype
import typings.devtoolsProtocol.mod.Protocol.Runtime.ObjectPreviewType
import typings.devtoolsProtocol.mod.Protocol.Runtime.PropertyPreviewSubtype
import typings.devtoolsProtocol.mod.Protocol.Runtime.PropertyPreviewType
import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectSubtype
import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectType
import typings.devtoolsProtocol.mod.Protocol.Runtime.WebDriverValueType
import typings.devtoolsProtocol.mod.Protocol.Security.CertificateErrorAction
import typings.devtoolsProtocol.mod.Protocol.Security.MixedContentType
import typings.devtoolsProtocol.mod.Protocol.Security.SafetyTipStatus
import typings.devtoolsProtocol.mod.Protocol.Security.SecurityState
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.ServiceWorkerVersionRunningStatus
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.ServiceWorkerVersionStatus
import typings.devtoolsProtocol.mod.Protocol.Storage.InterestGroupAccessType
import typings.devtoolsProtocol.mod.Protocol.Storage.StorageType
import typings.devtoolsProtocol.mod.Protocol.SystemInfo.ImageType
import typings.devtoolsProtocol.mod.Protocol.SystemInfo.SubsamplingFormat
import typings.devtoolsProtocol.mod.Protocol.Tracing.MemoryDumpLevelOfDetail
import typings.devtoolsProtocol.mod.Protocol.Tracing.StartRequestTransferMode
import typings.devtoolsProtocol.mod.Protocol.Tracing.StreamCompression
import typings.devtoolsProtocol.mod.Protocol.Tracing.StreamFormat
import typings.devtoolsProtocol.mod.Protocol.Tracing.TraceConfigRecordMode
import typings.devtoolsProtocol.mod.Protocol.Tracing.TracingBackend
import typings.devtoolsProtocol.mod.Protocol.WebAudio.AutomationRate
import typings.devtoolsProtocol.mod.Protocol.WebAudio.ChannelCountMode
import typings.devtoolsProtocol.mod.Protocol.WebAudio.ChannelInterpretation
import typings.devtoolsProtocol.mod.Protocol.WebAudio.ContextState
import typings.devtoolsProtocol.mod.Protocol.WebAudio.ContextType
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.AuthenticatorProtocol
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.AuthenticatorTransport
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.Ctap2Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devtoolsProtocolStrings {
  
  @js.native
  sealed trait Aborted
    extends StObject
       with ErrorReason
  inline def Aborted: Aborted = "Aborted".asInstanceOf[Aborted]
  
  @js.native
  sealed trait AccessDenied
    extends StObject
       with ErrorReason
  inline def AccessDenied: AccessDenied = "AccessDenied".asInstanceOf[AccessDenied]
  
  @js.native
  sealed trait AccountsHttpNotFound
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def AccountsHttpNotFound: AccountsHttpNotFound = "AccountsHttpNotFound".asInstanceOf[AccountsHttpNotFound]
  
  @js.native
  sealed trait AccountsInvalidResponse
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def AccountsInvalidResponse: AccountsInvalidResponse = "AccountsInvalidResponse".asInstanceOf[AccountsInvalidResponse]
  
  @js.native
  sealed trait AccountsNoResponse
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def AccountsNoResponse: AccountsNoResponse = "AccountsNoResponse".asInstanceOf[AccountsNoResponse]
  
  @js.native
  sealed trait Activated
    extends StObject
       with PrerenderFinalStatus
  inline def Activated: Activated = "Activated".asInstanceOf[Activated]
  
  @js.native
  sealed trait ActivatedBeforeStarted
    extends StObject
       with PrerenderFinalStatus
  inline def ActivatedBeforeStarted: ActivatedBeforeStarted = "ActivatedBeforeStarted".asInstanceOf[ActivatedBeforeStarted]
  
  @js.native
  sealed trait ActivationNavigationsDisallowedForBug1234857
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def ActivationNavigationsDisallowedForBug1234857: ActivationNavigationsDisallowedForBug1234857 = "ActivationNavigationsDisallowedForBug1234857".asInstanceOf[ActivationNavigationsDisallowedForBug1234857]
  
  @js.native
  sealed trait AddressUnreachable
    extends StObject
       with ErrorReason
  inline def AddressUnreachable: AddressUnreachable = "AddressUnreachable".asInstanceOf[AddressUnreachable]
  
  @js.native
  sealed trait Allow
    extends StObject
       with PrivateNetworkRequestPolicy
  inline def Allow: Allow = "Allow".asInstanceOf[Allow]
  
  @js.native
  sealed trait AllowOriginMismatch
    extends StObject
       with CorsError
  inline def AllowOriginMismatch: AllowOriginMismatch = "AllowOriginMismatch".asInstanceOf[AllowOriginMismatch]
  
  @js.native
  sealed trait AlreadyExists
    extends StObject
       with TrustTokenOperationDoneEventStatus
  inline def AlreadyExists: AlreadyExists = "AlreadyExists".asInstanceOf[AlreadyExists]
  
  @js.native
  sealed trait AppBanner
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def AppBanner: AppBanner = "AppBanner".asInstanceOf[AppBanner]
  
  @js.native
  sealed trait AttributionReportingIssue
    extends StObject
       with InspectorIssueCode
  inline def AttributionReportingIssue: AttributionReportingIssue = "AttributionReportingIssue".asInstanceOf[AttributionReportingIssue]
  
  @js.native
  sealed trait AttributionSrc
    extends StObject
       with MixedContentResourceType
  inline def AttributionSrc: AttributionSrc = "AttributionSrc".asInstanceOf[AttributionSrc]
  
  @js.native
  sealed trait Audio
    extends StObject
       with MixedContentResourceType
  inline def Audio: Audio = "Audio".asInstanceOf[Audio]
  
  @js.native
  sealed trait AudioOutputDeviceRequested
    extends StObject
       with PrerenderFinalStatus
  inline def AudioOutputDeviceRequested: AudioOutputDeviceRequested = "AudioOutputDeviceRequested".asInstanceOf[AudioOutputDeviceRequested]
  
  @js.native
  sealed trait AuthorizationCoveredByWildcard
    extends StObject
       with DeprecationIssueType
  inline def AuthorizationCoveredByWildcard: AuthorizationCoveredByWildcard = "AuthorizationCoveredByWildcard".asInstanceOf[AuthorizationCoveredByWildcard]
  
  @js.native
  sealed trait BackForwardCacheDisabled
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def BackForwardCacheDisabled: BackForwardCacheDisabled = "BackForwardCacheDisabled".asInstanceOf[BackForwardCacheDisabled]
  
  @js.native
  sealed trait BackForwardCacheDisabledByCommandLine
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def BackForwardCacheDisabledByCommandLine: BackForwardCacheDisabledByCommandLine = "BackForwardCacheDisabledByCommandLine".asInstanceOf[BackForwardCacheDisabledByCommandLine]
  
  @js.native
  sealed trait BackForwardCacheDisabledByLowMemory
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def BackForwardCacheDisabledByLowMemory: BackForwardCacheDisabledByLowMemory = "BackForwardCacheDisabledByLowMemory".asInstanceOf[BackForwardCacheDisabledByLowMemory]
  
  @js.native
  sealed trait BackForwardCacheDisabledForDelegate
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def BackForwardCacheDisabledForDelegate: BackForwardCacheDisabledForDelegate = "BackForwardCacheDisabledForDelegate".asInstanceOf[BackForwardCacheDisabledForDelegate]
  
  @js.native
  sealed trait BackForwardCacheDisabledForPrerender
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def BackForwardCacheDisabledForPrerender: BackForwardCacheDisabledForPrerender = "BackForwardCacheDisabledForPrerender".asInstanceOf[BackForwardCacheDisabledForPrerender]
  
  @js.native
  sealed trait BackForwardCacheRestore
    extends StObject
       with NavigationType
  inline def BackForwardCacheRestore: BackForwardCacheRestore = "BackForwardCacheRestore".asInstanceOf[BackForwardCacheRestore]
  
  @js.native
  sealed trait BadResponse
    extends StObject
       with TrustTokenOperationDoneEventStatus
  inline def BadResponse: BadResponse = "BadResponse".asInstanceOf[BadResponse]
  
  @js.native
  sealed trait Beacon
    extends StObject
       with MixedContentResourceType
  inline def Beacon: Beacon = "Beacon".asInstanceOf[Beacon]
  
  @js.native
  sealed trait BlockFromInsecureToMorePrivate
    extends StObject
       with PrivateNetworkRequestPolicy
  inline def BlockFromInsecureToMorePrivate: BlockFromInsecureToMorePrivate = "BlockFromInsecureToMorePrivate".asInstanceOf[BlockFromInsecureToMorePrivate]
  
  @js.native
  sealed trait BlockedByActiveFunction
    extends StObject
       with SetScriptSourceResponseStatus
  inline def BlockedByActiveFunction: BlockedByActiveFunction = "BlockedByActiveFunction".asInstanceOf[BlockedByActiveFunction]
  
  @js.native
  sealed trait BlockedByActiveGenerator
    extends StObject
       with SetScriptSourceResponseStatus
  inline def BlockedByActiveGenerator: BlockedByActiveGenerator = "BlockedByActiveGenerator".asInstanceOf[BlockedByActiveGenerator]
  
  @js.native
  sealed trait BlockedByClient
    extends StObject
       with ErrorReason
       with PrerenderFinalStatus
  inline def BlockedByClient: BlockedByClient = "BlockedByClient".asInstanceOf[BlockedByClient]
  
  @js.native
  sealed trait BlockedByResponse
    extends StObject
       with ErrorReason
  inline def BlockedByResponse: BlockedByResponse = "BlockedByResponse".asInstanceOf[BlockedByResponse]
  
  @js.native
  sealed trait BlockedByResponseIssue
    extends StObject
       with InspectorIssueCode
  inline def BlockedByResponseIssue: BlockedByResponseIssue = "BlockedByResponseIssue".asInstanceOf[BlockedByResponseIssue]
  
  @js.native
  sealed trait BroadcastChannel
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def BroadcastChannel: BroadcastChannel = "BroadcastChannel".asInstanceOf[BroadcastChannel]
  
  @js.native
  sealed trait BrowsingInstanceNotSwapped
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def BrowsingInstanceNotSwapped: BrowsingInstanceNotSwapped = "BrowsingInstanceNotSwapped".asInstanceOf[BrowsingInstanceNotSwapped]
  
  @js.native
  sealed trait CSPReport
    extends StObject
       with MixedContentResourceType
  inline def CSPReport: CSPReport = "CSPReport".asInstanceOf[CSPReport]
  
  @js.native
  sealed trait CSPViolation
    extends StObject
       with PausedEventReason
  inline def CSPViolation: CSPViolation = "CSPViolation".asInstanceOf[CSPViolation]
  
  @js.native
  sealed trait CSPViolationReport
    extends StObject
       with ResourceType
  inline def CSPViolationReport: CSPViolationReport = "CSPViolationReport".asInstanceOf[CSPViolationReport]
  
  @js.native
  sealed trait CSSAnimation
    extends StObject
       with AnimationType
  inline def CSSAnimation: CSSAnimation = "CSSAnimation".asInstanceOf[CSSAnimation]
  
  @js.native
  sealed trait CSSSelectorInternalMediaControlsOverlayCastButton
    extends StObject
       with DeprecationIssueType
  inline def CSSSelectorInternalMediaControlsOverlayCastButton: CSSSelectorInternalMediaControlsOverlayCastButton = "CSSSelectorInternalMediaControlsOverlayCastButton".asInstanceOf[CSSSelectorInternalMediaControlsOverlayCastButton]
  
  @js.native
  sealed trait CSSTransition
    extends StObject
       with AnimationType
  inline def CSSTransition: CSSTransition = "CSSTransition".asInstanceOf[CSSTransition]
  
  @js.native
  sealed trait CacheControlNoStore
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def CacheControlNoStore: CacheControlNoStore = "CacheControlNoStore".asInstanceOf[CacheControlNoStore]
  
  @js.native
  sealed trait CacheControlNoStoreCookieModified
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def CacheControlNoStoreCookieModified: CacheControlNoStoreCookieModified = "CacheControlNoStoreCookieModified".asInstanceOf[CacheControlNoStoreCookieModified]
  
  @js.native
  sealed trait CacheControlNoStoreHTTPOnlyCookieModified
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def CacheControlNoStoreHTTPOnlyCookieModified: CacheControlNoStoreHTTPOnlyCookieModified = "CacheControlNoStoreHTTPOnlyCookieModified".asInstanceOf[CacheControlNoStoreHTTPOnlyCookieModified]
  
  @js.native
  sealed trait CacheFlushed
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def CacheFlushed: CacheFlushed = "CacheFlushed".asInstanceOf[CacheFlushed]
  
  @js.native
  sealed trait CacheLimit
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def CacheLimit: CacheLimit = "CacheLimit".asInstanceOf[CacheLimit]
  
  @js.native
  sealed trait CanRequestURLHTTPContainingNewline
    extends StObject
       with DeprecationIssueType
  inline def CanRequestURLHTTPContainingNewline: CanRequestURLHTTPContainingNewline = "CanRequestURLHTTPContainingNewline".asInstanceOf[CanRequestURLHTTPContainingNewline]
  
  @js.native
  sealed trait CancelAllHostsForTesting
    extends StObject
       with PrerenderFinalStatus
  inline def CancelAllHostsForTesting: CancelAllHostsForTesting = "CancelAllHostsForTesting".asInstanceOf[CancelAllHostsForTesting]
  
  @js.native
  sealed trait CancelAuth
    extends StObject
       with AuthChallengeResponseResponse
       with typings.devtoolsProtocol.mod.Protocol.Fetch.AuthChallengeResponseResponse
  inline def CancelAuth: CancelAuth = "CancelAuth".asInstanceOf[CancelAuth]
  
  @js.native
  sealed trait Canceled
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def Canceled: Canceled = "Canceled".asInstanceOf[Canceled]
  
  @js.native
  sealed trait ChromeLoadTimesConnectionInfo
    extends StObject
       with DeprecationIssueType
  inline def ChromeLoadTimesConnectionInfo: ChromeLoadTimesConnectionInfo = "ChromeLoadTimesConnectionInfo".asInstanceOf[ChromeLoadTimesConnectionInfo]
  
  @js.native
  sealed trait ChromeLoadTimesFirstPaintAfterLoadTime
    extends StObject
       with DeprecationIssueType
  inline def ChromeLoadTimesFirstPaintAfterLoadTime: ChromeLoadTimesFirstPaintAfterLoadTime = "ChromeLoadTimesFirstPaintAfterLoadTime".asInstanceOf[ChromeLoadTimesFirstPaintAfterLoadTime]
  
  @js.native
  sealed trait ChromeLoadTimesWasAlternateProtocolAvailable
    extends StObject
       with DeprecationIssueType
  inline def ChromeLoadTimesWasAlternateProtocolAvailable: ChromeLoadTimesWasAlternateProtocolAvailable = "ChromeLoadTimesWasAlternateProtocolAvailable".asInstanceOf[ChromeLoadTimesWasAlternateProtocolAvailable]
  
  @js.native
  sealed trait Circumstantial
    extends StObject
       with BackForwardCacheNotRestoredReasonType
  inline def Circumstantial: Circumstantial = "Circumstantial".asInstanceOf[Circumstantial]
  
  @js.native
  sealed trait ClientCertRequested
    extends StObject
       with PrerenderFinalStatus
  inline def ClientCertRequested: ClientCertRequested = "ClientCertRequested".asInstanceOf[ClientCertRequested]
  
  @js.native
  sealed trait ClientHintIssue
    extends StObject
       with InspectorIssueCode
  inline def ClientHintIssue: ClientHintIssue = "ClientHintIssue".asInstanceOf[ClientHintIssue]
  
  @js.native
  sealed trait ClientMetadataHttpNotFound
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def ClientMetadataHttpNotFound: ClientMetadataHttpNotFound = "ClientMetadataHttpNotFound".asInstanceOf[ClientMetadataHttpNotFound]
  
  @js.native
  sealed trait ClientMetadataInvalidResponse
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def ClientMetadataInvalidResponse: ClientMetadataInvalidResponse = "ClientMetadataInvalidResponse".asInstanceOf[ClientMetadataInvalidResponse]
  
  @js.native
  sealed trait ClientMetadataNoResponse
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def ClientMetadataNoResponse: ClientMetadataNoResponse = "ClientMetadataNoResponse".asInstanceOf[ClientMetadataNoResponse]
  
  @js.native
  sealed trait CoepFrameResourceNeedsCoepHeader
    extends StObject
       with BlockedByResponseReason
  inline def CoepFrameResourceNeedsCoepHeader: CoepFrameResourceNeedsCoepHeader = "CoepFrameResourceNeedsCoepHeader".asInstanceOf[CoepFrameResourceNeedsCoepHeader]
  
  @js.native
  sealed trait CompileError
    extends StObject
       with SetScriptSourceResponseStatus
  inline def CompileError: CompileError = "CompileError".asInstanceOf[CompileError]
  
  @js.native
  sealed trait ConflictingBrowsingInstance
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def ConflictingBrowsingInstance: ConflictingBrowsingInstance = "ConflictingBrowsingInstance".asInstanceOf[ConflictingBrowsingInstance]
  
  @js.native
  sealed trait ConnectionAborted
    extends StObject
       with ErrorReason
  inline def ConnectionAborted: ConnectionAborted = "ConnectionAborted".asInstanceOf[ConnectionAborted]
  
  @js.native
  sealed trait ConnectionClosed
    extends StObject
       with ErrorReason
  inline def ConnectionClosed: ConnectionClosed = "ConnectionClosed".asInstanceOf[ConnectionClosed]
  
  @js.native
  sealed trait ConnectionFailed
    extends StObject
       with ErrorReason
  inline def ConnectionFailed: ConnectionFailed = "ConnectionFailed".asInstanceOf[ConnectionFailed]
  
  @js.native
  sealed trait ConnectionRefused
    extends StObject
       with ErrorReason
  inline def ConnectionRefused: ConnectionRefused = "ConnectionRefused".asInstanceOf[ConnectionRefused]
  
  @js.native
  sealed trait ConnectionReset
    extends StObject
       with ErrorReason
  inline def ConnectionReset: ConnectionReset = "ConnectionReset".asInstanceOf[ConnectionReset]
  
  @js.native
  sealed trait ContainsPlugins
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def ContainsPlugins: ContainsPlugins = "ContainsPlugins".asInstanceOf[ContainsPlugins]
  
  @js.native
  sealed trait ContentFileChooser
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def ContentFileChooser: ContentFileChooser = "ContentFileChooser".asInstanceOf[ContentFileChooser]
  
  @js.native
  sealed trait ContentFileSystemAccess
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def ContentFileSystemAccess: ContentFileSystemAccess = "ContentFileSystemAccess".asInstanceOf[ContentFileSystemAccess]
  
  @js.native
  sealed trait ContentMediaDevicesDispatcherHost
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def ContentMediaDevicesDispatcherHost: ContentMediaDevicesDispatcherHost = "ContentMediaDevicesDispatcherHost".asInstanceOf[ContentMediaDevicesDispatcherHost]
  
  @js.native
  sealed trait ContentMediaSessionService
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def ContentMediaSessionService: ContentMediaSessionService = "ContentMediaSessionService".asInstanceOf[ContentMediaSessionService]
  
  @js.native
  sealed trait ContentScreenReader
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def ContentScreenReader: ContentScreenReader = "ContentScreenReader".asInstanceOf[ContentScreenReader]
  
  @js.native
  sealed trait ContentSecurityHandler
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def ContentSecurityHandler: ContentSecurityHandler = "ContentSecurityHandler".asInstanceOf[ContentSecurityHandler]
  
  @js.native
  sealed trait ContentSecurityPolicyIssue
    extends StObject
       with InspectorIssueCode
  inline def ContentSecurityPolicyIssue: ContentSecurityPolicyIssue = "ContentSecurityPolicyIssue".asInstanceOf[ContentSecurityPolicyIssue]
  
  @js.native
  sealed trait ContentSerial
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def ContentSerial: ContentSerial = "ContentSerial".asInstanceOf[ContentSerial]
  
  @js.native
  sealed trait ContentWebAuthenticationAPI
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def ContentWebAuthenticationAPI: ContentWebAuthenticationAPI = "ContentWebAuthenticationAPI".asInstanceOf[ContentWebAuthenticationAPI]
  
  @js.native
  sealed trait ContentWebBluetooth
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def ContentWebBluetooth: ContentWebBluetooth = "ContentWebBluetooth".asInstanceOf[ContentWebBluetooth]
  
  @js.native
  sealed trait ContentWebUSB
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def ContentWebUSB: ContentWebUSB = "ContentWebUSB".asInstanceOf[ContentWebUSB]
  
  @js.native
  sealed trait CookieIssue
    extends StObject
       with InspectorIssueCode
  inline def CookieIssue: CookieIssue = "CookieIssue".asInstanceOf[CookieIssue]
  
  @js.native
  sealed trait CookieWithTruncatingChar
    extends StObject
       with DeprecationIssueType
  inline def CookieWithTruncatingChar: CookieWithTruncatingChar = "CookieWithTruncatingChar".asInstanceOf[CookieWithTruncatingChar]
  
  @js.native
  sealed trait CoopSandboxedIFrameCannotNavigateToCoopPage
    extends StObject
       with BlockedByResponseReason
  inline def CoopSandboxedIFrameCannotNavigateToCoopPage: CoopSandboxedIFrameCannotNavigateToCoopPage = "CoopSandboxedIFrameCannotNavigateToCoopPage".asInstanceOf[CoopSandboxedIFrameCannotNavigateToCoopPage]
  
  @js.native
  sealed trait CorpNotSameOrigin
    extends StObject
       with BlockedByResponseReason
  inline def CorpNotSameOrigin: CorpNotSameOrigin = "CorpNotSameOrigin".asInstanceOf[CorpNotSameOrigin]
  
  @js.native
  sealed trait CorpNotSameOriginAfterDefaultedToSameOriginByCoep
    extends StObject
       with BlockedByResponseReason
  inline def CorpNotSameOriginAfterDefaultedToSameOriginByCoep: CorpNotSameOriginAfterDefaultedToSameOriginByCoep = "CorpNotSameOriginAfterDefaultedToSameOriginByCoep".asInstanceOf[CorpNotSameOriginAfterDefaultedToSameOriginByCoep]
  
  @js.native
  sealed trait CorpNotSameSite
    extends StObject
       with BlockedByResponseReason
  inline def CorpNotSameSite: CorpNotSameSite = "CorpNotSameSite".asInstanceOf[CorpNotSameSite]
  
  @js.native
  sealed trait CorsDisabledScheme
    extends StObject
       with CorsError
  inline def CorsDisabledScheme: CorsDisabledScheme = "CorsDisabledScheme".asInstanceOf[CorsDisabledScheme]
  
  @js.native
  sealed trait CorsIssue
    extends StObject
       with InspectorIssueCode
  inline def CorsIssue: CorsIssue = "CorsIssue".asInstanceOf[CorsIssue]
  
  @js.native
  sealed trait CpuPeakLimit
    extends StObject
       with HeavyAdReason
  inline def CpuPeakLimit: CpuPeakLimit = "CpuPeakLimit".asInstanceOf[CpuPeakLimit]
  
  @js.native
  sealed trait CpuTotalLimit
    extends StObject
       with HeavyAdReason
  inline def CpuTotalLimit: CpuTotalLimit = "CpuTotalLimit".asInstanceOf[CpuTotalLimit]
  
  @js.native
  sealed trait CreatedByAdScript
    extends StObject
       with AdFrameExplanation
  inline def CreatedByAdScript: CreatedByAdScript = "CreatedByAdScript".asInstanceOf[CreatedByAdScript]
  
  @js.native
  sealed trait CreationIssue
    extends StObject
       with SharedArrayBufferIssueType
  inline def CreationIssue: CreationIssue = "CreationIssue".asInstanceOf[CreationIssue]
  
  @js.native
  sealed trait Credentialless
    extends StObject
       with CrossOriginEmbedderPolicyValue
  inline def Credentialless: Credentialless = "Credentialless".asInstanceOf[Credentialless]
  
  @js.native
  sealed trait CrossOriginAccessBasedOnDocumentDomain
    extends StObject
       with DeprecationIssueType
  inline def CrossOriginAccessBasedOnDocumentDomain: CrossOriginAccessBasedOnDocumentDomain = "CrossOriginAccessBasedOnDocumentDomain".asInstanceOf[CrossOriginAccessBasedOnDocumentDomain]
  
  @js.native
  sealed trait CrossOriginNavigation
    extends StObject
       with PrerenderFinalStatus
  inline def CrossOriginNavigation: CrossOriginNavigation = "CrossOriginNavigation".asInstanceOf[CrossOriginNavigation]
  
  @js.native
  sealed trait CrossOriginPortalPostMessageError extends StObject
  inline def CrossOriginPortalPostMessageError: CrossOriginPortalPostMessageError = "CrossOriginPortalPostMessageError".asInstanceOf[CrossOriginPortalPostMessageError]
  
  @js.native
  sealed trait CrossOriginRedirect
    extends StObject
       with PrerenderFinalStatus
  inline def CrossOriginRedirect: CrossOriginRedirect = "CrossOriginRedirect".asInstanceOf[CrossOriginRedirect]
  
  @js.native
  sealed trait CrossOriginWindowAlert
    extends StObject
       with DeprecationIssueType
  inline def CrossOriginWindowAlert: CrossOriginWindowAlert = "CrossOriginWindowAlert".asInstanceOf[CrossOriginWindowAlert]
  
  @js.native
  sealed trait CrossOriginWindowConfirm
    extends StObject
       with DeprecationIssueType
  inline def CrossOriginWindowConfirm: CrossOriginWindowConfirm = "CrossOriginWindowConfirm".asInstanceOf[CrossOriginWindowConfirm]
  
  @js.native
  sealed trait DOM
    extends StObject
       with PausedEventReason
  inline def DOM: DOM = "DOM".asInstanceOf[DOM]
  
  @js.native
  sealed trait DataSaverEnabled
    extends StObject
       with PrerenderFinalStatus
  inline def DataSaverEnabled: DataSaverEnabled = "DataSaverEnabled".asInstanceOf[DataSaverEnabled]
  
  @js.native
  sealed trait DedicatedWorkerOrWorklet
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def DedicatedWorkerOrWorklet: DedicatedWorkerOrWorklet = "DedicatedWorkerOrWorklet".asInstanceOf[DedicatedWorkerOrWorklet]
  
  @js.native
  sealed trait Default
    extends StObject
       with AuthChallengeResponseResponse
       with typings.devtoolsProtocol.mod.Protocol.Fetch.AuthChallengeResponseResponse
  inline def Default: Default = "Default".asInstanceOf[Default]
  
  @js.native
  sealed trait DeprecationExample
    extends StObject
       with DeprecationIssueType
  inline def DeprecationExample: DeprecationExample = "DeprecationExample".asInstanceOf[DeprecationExample]
  
  @js.native
  sealed trait DeprecationIssue
    extends StObject
       with InspectorIssueCode
  inline def DeprecationIssue: DeprecationIssue = "DeprecationIssue".asInstanceOf[DeprecationIssue]
  
  @js.native
  sealed trait Destroyed
    extends StObject
       with PrerenderFinalStatus
  inline def Destroyed: Destroyed = "Destroyed".asInstanceOf[Destroyed]
  
  @js.native
  sealed trait DidFailLoad
    extends StObject
       with PrerenderFinalStatus
  inline def DidFailLoad: DidFailLoad = "DidFailLoad".asInstanceOf[DidFailLoad]
  
  @js.native
  sealed trait DisableForRenderFrameHostCalled
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def DisableForRenderFrameHostCalled: DisableForRenderFrameHostCalled = "DisableForRenderFrameHostCalled".asInstanceOf[DisableForRenderFrameHostCalled]
  
  @js.native
  sealed trait DisabledInSettings
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def DisabledInSettings: DisabledInSettings = "DisabledInSettings".asInstanceOf[DisabledInSettings]
  
  @js.native
  sealed trait DisallowedByMode
    extends StObject
       with CorsError
  inline def DisallowedByMode: DisallowedByMode = "DisallowedByMode".asInstanceOf[DisallowedByMode]
  
  @js.native
  sealed trait Document
    extends StObject
       with ResourceType
  inline def Document: Document = "Document".asInstanceOf[Document]
  
  @js.native
  sealed trait DocumentDomainSettingWithoutOriginAgentClusterHeader
    extends StObject
       with DeprecationIssueType
  inline def DocumentDomainSettingWithoutOriginAgentClusterHeader: DocumentDomainSettingWithoutOriginAgentClusterHeader = "DocumentDomainSettingWithoutOriginAgentClusterHeader".asInstanceOf[DocumentDomainSettingWithoutOriginAgentClusterHeader]
  
  @js.native
  sealed trait DocumentLoaded
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def DocumentLoaded: DocumentLoaded = "DocumentLoaded".asInstanceOf[DocumentLoaded]
  
  @js.native
  sealed trait DomainMismatch
    extends StObject
       with CookieBlockedReason
  inline def DomainMismatch: DomainMismatch = "DomainMismatch".asInstanceOf[DomainMismatch]
  
  @js.native
  sealed trait DomainNotAllowed
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def DomainNotAllowed: DomainNotAllowed = "DomainNotAllowed".asInstanceOf[DomainNotAllowed]
  
  @js.native
  sealed trait Download
    extends StObject
       with MixedContentResourceType
       with PrerenderFinalStatus
  inline def Download: Download = "Download".asInstanceOf[Download]
  
  @js.native
  sealed trait Dummy
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def Dummy: Dummy = "Dummy".asInstanceOf[Dummy]
  
  @js.native
  sealed trait EmbeddedDWARF
    extends StObject
       with DebugSymbolsType
  inline def EmbeddedDWARF: EmbeddedDWARF = "EmbeddedDWARF".asInstanceOf[EmbeddedDWARF]
  
  @js.native
  sealed trait EmbedderAppBannerManager
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def EmbedderAppBannerManager: EmbedderAppBannerManager = "EmbedderAppBannerManager".asInstanceOf[EmbedderAppBannerManager]
  
  @js.native
  sealed trait EmbedderChromePasswordManagerClientBindCredentialManager
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def EmbedderChromePasswordManagerClientBindCredentialManager: EmbedderChromePasswordManagerClientBindCredentialManager = "EmbedderChromePasswordManagerClientBindCredentialManager".asInstanceOf[EmbedderChromePasswordManagerClientBindCredentialManager]
  
  @js.native
  sealed trait EmbedderDomDistillerSelfDeletingRequestDelegate
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def EmbedderDomDistillerSelfDeletingRequestDelegate: EmbedderDomDistillerSelfDeletingRequestDelegate = "EmbedderDomDistillerSelfDeletingRequestDelegate".asInstanceOf[EmbedderDomDistillerSelfDeletingRequestDelegate]
  
  @js.native
  sealed trait EmbedderDomDistillerViewerSource
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def EmbedderDomDistillerViewerSource: EmbedderDomDistillerViewerSource = "EmbedderDomDistillerViewerSource".asInstanceOf[EmbedderDomDistillerViewerSource]
  
  @js.native
  sealed trait EmbedderExtensionMessaging
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def EmbedderExtensionMessaging: EmbedderExtensionMessaging = "EmbedderExtensionMessaging".asInstanceOf[EmbedderExtensionMessaging]
  
  @js.native
  sealed trait EmbedderExtensionMessagingForOpenPort
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def EmbedderExtensionMessagingForOpenPort: EmbedderExtensionMessagingForOpenPort = "EmbedderExtensionMessagingForOpenPort".asInstanceOf[EmbedderExtensionMessagingForOpenPort]
  
  @js.native
  sealed trait EmbedderExtensionSentMessageToCachedFrame
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def EmbedderExtensionSentMessageToCachedFrame: EmbedderExtensionSentMessageToCachedFrame = "EmbedderExtensionSentMessageToCachedFrame".asInstanceOf[EmbedderExtensionSentMessageToCachedFrame]
  
  @js.native
  sealed trait EmbedderExtensions
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def EmbedderExtensions: EmbedderExtensions = "EmbedderExtensions".asInstanceOf[EmbedderExtensions]
  
  @js.native
  sealed trait EmbedderModalDialog
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def EmbedderModalDialog: EmbedderModalDialog = "EmbedderModalDialog".asInstanceOf[EmbedderModalDialog]
  
  @js.native
  sealed trait EmbedderOfflinePage
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def EmbedderOfflinePage: EmbedderOfflinePage = "EmbedderOfflinePage".asInstanceOf[EmbedderOfflinePage]
  
  @js.native
  sealed trait EmbedderOomInterventionTabHelper
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def EmbedderOomInterventionTabHelper: EmbedderOomInterventionTabHelper = "EmbedderOomInterventionTabHelper".asInstanceOf[EmbedderOomInterventionTabHelper]
  
  @js.native
  sealed trait EmbedderPermissionRequestManager
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def EmbedderPermissionRequestManager: EmbedderPermissionRequestManager = "EmbedderPermissionRequestManager".asInstanceOf[EmbedderPermissionRequestManager]
  
  @js.native
  sealed trait EmbedderPopupBlockerTabHelper
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def EmbedderPopupBlockerTabHelper: EmbedderPopupBlockerTabHelper = "EmbedderPopupBlockerTabHelper".asInstanceOf[EmbedderPopupBlockerTabHelper]
  
  @js.native
  sealed trait EmbedderSafeBrowsingThreatDetails
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def EmbedderSafeBrowsingThreatDetails: EmbedderSafeBrowsingThreatDetails = "EmbedderSafeBrowsingThreatDetails".asInstanceOf[EmbedderSafeBrowsingThreatDetails]
  
  @js.native
  sealed trait EmbedderSafeBrowsingTriggeredPopupBlocker
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def EmbedderSafeBrowsingTriggeredPopupBlocker: EmbedderSafeBrowsingTriggeredPopupBlocker = "EmbedderSafeBrowsingTriggeredPopupBlocker".asInstanceOf[EmbedderSafeBrowsingTriggeredPopupBlocker]
  
  @js.native
  sealed trait EmbedderTriggeredAndCrossOriginRedirected
    extends StObject
       with PrerenderFinalStatus
  inline def EmbedderTriggeredAndCrossOriginRedirected: EmbedderTriggeredAndCrossOriginRedirected = "EmbedderTriggeredAndCrossOriginRedirected".asInstanceOf[EmbedderTriggeredAndCrossOriginRedirected]
  
  @js.native
  sealed trait Enabled
    extends StObject
       with OriginTrialStatus
  inline def Enabled: Enabled = "Enabled".asInstanceOf[Enabled]
  
  @js.native
  sealed trait EnteredBackForwardCacheBeforeServiceWorkerHostAdded
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def EnteredBackForwardCacheBeforeServiceWorkerHostAdded: EnteredBackForwardCacheBeforeServiceWorkerHostAdded = "EnteredBackForwardCacheBeforeServiceWorkerHostAdded".asInstanceOf[EnteredBackForwardCacheBeforeServiceWorkerHostAdded]
  
  @js.native
  sealed trait ErrorDocument
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def ErrorDocument: ErrorDocument = "ErrorDocument".asInstanceOf[ErrorDocument]
  
  @js.native
  sealed trait ErrorFetchingSignin
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def ErrorFetchingSignin: ErrorFetchingSignin = "ErrorFetchingSignin".asInstanceOf[ErrorFetchingSignin]
  
  @js.native
  sealed trait ErrorIdToken
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def ErrorIdToken: ErrorIdToken = "ErrorIdToken".asInstanceOf[ErrorIdToken]
  
  @js.native
  sealed trait EventListener
    extends StObject
       with PausedEventReason
  inline def EventListener: EventListener = "EventListener".asInstanceOf[EventListener]
  
  @js.native
  sealed trait EventPath
    extends StObject
       with DeprecationIssueType
  inline def EventPath: EventPath = "EventPath".asInstanceOf[EventPath]
  
  @js.native
  sealed trait EventSource
    extends StObject
       with MixedContentResourceType
       with ResourceType
  inline def EventSource: EventSource = "EventSource".asInstanceOf[EventSource]
  
  @js.native
  sealed trait ExcludeDomainNonASCII
    extends StObject
       with CookieExclusionReason
  inline def ExcludeDomainNonASCII: ExcludeDomainNonASCII = "ExcludeDomainNonASCII".asInstanceOf[ExcludeDomainNonASCII]
  
  @js.native
  sealed trait ExcludeInvalidSameParty
    extends StObject
       with CookieExclusionReason
  inline def ExcludeInvalidSameParty: ExcludeInvalidSameParty = "ExcludeInvalidSameParty".asInstanceOf[ExcludeInvalidSameParty]
  
  @js.native
  sealed trait ExcludeSamePartyCrossPartyContext
    extends StObject
       with CookieExclusionReason
  inline def ExcludeSamePartyCrossPartyContext: ExcludeSamePartyCrossPartyContext = "ExcludeSamePartyCrossPartyContext".asInstanceOf[ExcludeSamePartyCrossPartyContext]
  
  @js.native
  sealed trait ExcludeSameSiteLax
    extends StObject
       with CookieExclusionReason
  inline def ExcludeSameSiteLax: ExcludeSameSiteLax = "ExcludeSameSiteLax".asInstanceOf[ExcludeSameSiteLax]
  
  @js.native
  sealed trait ExcludeSameSiteNoneInsecure
    extends StObject
       with CookieExclusionReason
  inline def ExcludeSameSiteNoneInsecure: ExcludeSameSiteNoneInsecure = "ExcludeSameSiteNoneInsecure".asInstanceOf[ExcludeSameSiteNoneInsecure]
  
  @js.native
  sealed trait ExcludeSameSiteStrict
    extends StObject
       with CookieExclusionReason
  inline def ExcludeSameSiteStrict: ExcludeSameSiteStrict = "ExcludeSameSiteStrict".asInstanceOf[ExcludeSameSiteStrict]
  
  @js.native
  sealed trait ExcludeSameSiteUnspecifiedTreatedAsLax
    extends StObject
       with CookieExclusionReason
  inline def ExcludeSameSiteUnspecifiedTreatedAsLax: ExcludeSameSiteUnspecifiedTreatedAsLax = "ExcludeSameSiteUnspecifiedTreatedAsLax".asInstanceOf[ExcludeSameSiteUnspecifiedTreatedAsLax]
  
  @js.native
  sealed trait ExpectCTHeader
    extends StObject
       with DeprecationIssueType
  inline def ExpectCTHeader: ExpectCTHeader = "ExpectCTHeader".asInstanceOf[ExpectCTHeader]
  
  @js.native
  sealed trait Expired
    extends StObject
       with OriginTrialTokenStatus
  inline def Expired: Expired = "Expired".asInstanceOf[Expired]
  
  @js.native
  sealed trait ExternalDWARF
    extends StObject
       with DebugSymbolsType
  inline def ExternalDWARF: ExternalDWARF = "ExternalDWARF".asInstanceOf[ExternalDWARF]
  
  @js.native
  sealed trait FailToGetMemoryUsage
    extends StObject
       with PrerenderFinalStatus
  inline def FailToGetMemoryUsage: FailToGetMemoryUsage = "FailToGetMemoryUsage".asInstanceOf[FailToGetMemoryUsage]
  
  @js.native
  sealed trait Failed
    extends StObject
       with ErrorReason
  inline def Failed: Failed = "Failed".asInstanceOf[Failed]
  
  @js.native
  sealed trait FailedPrecondition
    extends StObject
       with TrustTokenOperationDoneEventStatus
  inline def FailedPrecondition: FailedPrecondition = "FailedPrecondition".asInstanceOf[FailedPrecondition]
  
  @js.native
  sealed trait Favicon
    extends StObject
       with MixedContentResourceType
  inline def Favicon: Favicon = "Favicon".asInstanceOf[Favicon]
  
  @js.native
  sealed trait FeatureDisabled
    extends StObject
       with OriginTrialTokenStatus
  inline def FeatureDisabled: FeatureDisabled = "FeatureDisabled".asInstanceOf[FeatureDisabled]
  
  @js.native
  sealed trait FeatureDisabledForUser
    extends StObject
       with OriginTrialTokenStatus
  inline def FeatureDisabledForUser: FeatureDisabledForUser = "FeatureDisabledForUser".asInstanceOf[FeatureDisabledForUser]
  
  @js.native
  sealed trait FederatedAuthRequestIssue
    extends StObject
       with InspectorIssueCode
  inline def FederatedAuthRequestIssue: FederatedAuthRequestIssue = "FederatedAuthRequestIssue".asInstanceOf[FederatedAuthRequestIssue]
  
  @js.native
  sealed trait FencedFramesEmbedder
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def FencedFramesEmbedder: FencedFramesEmbedder = "FencedFramesEmbedder".asInstanceOf[FencedFramesEmbedder]
  
  @js.native
  sealed trait Fetch
    extends StObject
       with ResourceType
  inline def Fetch: Fetch = "Fetch".asInstanceOf[Fetch]
  
  @js.native
  sealed trait Font
    extends StObject
       with MixedContentResourceType
       with ResourceType
  inline def Font: Font = "Font".asInstanceOf[Font]
  
  @js.native
  sealed trait ForegroundCacheLimit
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def ForegroundCacheLimit: ForegroundCacheLimit = "ForegroundCacheLimit".asInstanceOf[ForegroundCacheLimit]
  
  @js.native
  sealed trait Form
    extends StObject
       with MixedContentResourceType
  inline def Form: Form = "Form".asInstanceOf[Form]
  
  @js.native
  sealed trait Frame
    extends StObject
       with MixedContentResourceType
  inline def Frame: Frame = "Frame".asInstanceOf[Frame]
  
  @js.native
  sealed trait FulfilledLocally
    extends StObject
       with TrustTokenOperationDoneEventStatus
  inline def FulfilledLocally: FulfilledLocally = "FulfilledLocally".asInstanceOf[FulfilledLocally]
  
  @js.native
  sealed trait GenericIssue
    extends StObject
       with InspectorIssueCode
  inline def GenericIssue: GenericIssue = "GenericIssue".asInstanceOf[GenericIssue]
  
  @js.native
  sealed trait GeolocationInsecureOrigin
    extends StObject
       with DeprecationIssueType
  inline def GeolocationInsecureOrigin: GeolocationInsecureOrigin = "GeolocationInsecureOrigin".asInstanceOf[GeolocationInsecureOrigin]
  
  @js.native
  sealed trait GeolocationInsecureOriginDeprecatedNotRemoved
    extends StObject
       with DeprecationIssueType
  inline def GeolocationInsecureOriginDeprecatedNotRemoved: GeolocationInsecureOriginDeprecatedNotRemoved = "GeolocationInsecureOriginDeprecatedNotRemoved".asInstanceOf[GeolocationInsecureOriginDeprecatedNotRemoved]
  
  @js.native
  sealed trait GetUserMediaInsecureOrigin
    extends StObject
       with DeprecationIssueType
  inline def GetUserMediaInsecureOrigin: GetUserMediaInsecureOrigin = "GetUserMediaInsecureOrigin".asInstanceOf[GetUserMediaInsecureOrigin]
  
  @js.native
  sealed trait HTTPMethodNotGET
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def HTTPMethodNotGET: HTTPMethodNotGET = "HTTPMethodNotGET".asInstanceOf[HTTPMethodNotGET]
  
  @js.native
  sealed trait HTTPStatusNotOK
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def HTTPStatusNotOK: HTTPStatusNotOK = "HTTPStatusNotOK".asInstanceOf[HTTPStatusNotOK]
  
  @js.native
  sealed trait HasEffectiveUrl
    extends StObject
       with PrerenderFinalStatus
  inline def HasEffectiveUrl: HasEffectiveUrl = "HasEffectiveUrl".asInstanceOf[HasEffectiveUrl]
  
  @js.native
  sealed trait HaveInnerContents
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def HaveInnerContents: HaveInnerContents = "HaveInnerContents".asInstanceOf[HaveInnerContents]
  
  @js.native
  sealed trait Header
    extends StObject
       with PermissionsPolicyBlockReason
  inline def Header: Header = "Header".asInstanceOf[Header]
  
  @js.native
  sealed trait HeaderDisallowedByPreflightResponse
    extends StObject
       with CorsError
  inline def HeaderDisallowedByPreflightResponse: HeaderDisallowedByPreflightResponse = "HeaderDisallowedByPreflightResponse".asInstanceOf[HeaderDisallowedByPreflightResponse]
  
  @js.native
  sealed trait HeadersReceived
    extends StObject
       with InterceptionStage
  inline def HeadersReceived: HeadersReceived = "HeadersReceived".asInstanceOf[HeadersReceived]
  
  @js.native
  sealed trait HeavyAdBlocked
    extends StObject
       with HeavyAdResolutionStatus
  inline def HeavyAdBlocked: HeavyAdBlocked = "HeavyAdBlocked".asInstanceOf[HeavyAdBlocked]
  
  @js.native
  sealed trait HeavyAdIssue
    extends StObject
       with InspectorIssueCode
  inline def HeavyAdIssue: HeavyAdIssue = "HeavyAdIssue".asInstanceOf[HeavyAdIssue]
  
  @js.native
  sealed trait HeavyAdWarning
    extends StObject
       with HeavyAdResolutionStatus
  inline def HeavyAdWarning: HeavyAdWarning = "HeavyAdWarning".asInstanceOf[HeavyAdWarning]
  
  @js.native
  sealed trait High
    extends StObject
       with CookiePriority
       with ResourcePriority
  inline def High: High = "High".asInstanceOf[High]
  
  @js.native
  sealed trait HostCandidateAttributeGetter
    extends StObject
       with DeprecationIssueType
  inline def HostCandidateAttributeGetter: HostCandidateAttributeGetter = "HostCandidateAttributeGetter".asInstanceOf[HostCandidateAttributeGetter]
  
  @js.native
  sealed trait IdTokenHttpNotFound
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def IdTokenHttpNotFound: IdTokenHttpNotFound = "IdTokenHttpNotFound".asInstanceOf[IdTokenHttpNotFound]
  
  @js.native
  sealed trait IdTokenInvalidRequest
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def IdTokenInvalidRequest: IdTokenInvalidRequest = "IdTokenInvalidRequest".asInstanceOf[IdTokenInvalidRequest]
  
  @js.native
  sealed trait IdTokenInvalidResponse
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def IdTokenInvalidResponse: IdTokenInvalidResponse = "IdTokenInvalidResponse".asInstanceOf[IdTokenInvalidResponse]
  
  @js.native
  sealed trait IdTokenNoResponse
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def IdTokenNoResponse: IdTokenNoResponse = "IdTokenNoResponse".asInstanceOf[IdTokenNoResponse]
  
  @js.native
  sealed trait IdentityInCanMakePaymentEvent
    extends StObject
       with DeprecationIssueType
  inline def IdentityInCanMakePaymentEvent: IdentityInCanMakePaymentEvent = "IdentityInCanMakePaymentEvent".asInstanceOf[IdentityInCanMakePaymentEvent]
  
  @js.native
  sealed trait IdleManager
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def IdleManager: IdleManager = "IdleManager".asInstanceOf[IdleManager]
  
  @js.native
  sealed trait IframeAttribute
    extends StObject
       with PermissionsPolicyBlockReason
  inline def IframeAttribute: IframeAttribute = "IframeAttribute".asInstanceOf[IframeAttribute]
  
  @js.native
  sealed trait IgnoreEventAndEvict
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def IgnoreEventAndEvict: IgnoreEventAndEvict = "IgnoreEventAndEvict".asInstanceOf[IgnoreEventAndEvict]
  
  @js.native
  sealed trait Image
    extends StObject
       with MixedContentResourceType
       with ResourceType
  inline def Image: Image = "Image".asInstanceOf[Image]
  
  @js.native
  sealed trait Import
    extends StObject
       with MixedContentResourceType
  inline def Import: Import = "Import".asInstanceOf[Import]
  
  @js.native
  sealed trait InFencedFrameTree
    extends StObject
       with PermissionsPolicyBlockReason
  inline def InFencedFrameTree: InFencedFrameTree = "InFencedFrameTree".asInstanceOf[InFencedFrameTree]
  
  @js.native
  sealed trait InIsolatedApp
    extends StObject
       with PermissionsPolicyBlockReason
  inline def InIsolatedApp: InIsolatedApp = "InIsolatedApp".asInstanceOf[InIsolatedApp]
  
  @js.native
  sealed trait InProgressNavigation
    extends StObject
       with PrerenderFinalStatus
  inline def InProgressNavigation: InProgressNavigation = "InProgressNavigation".asInstanceOf[InProgressNavigation]
  
  @js.native
  sealed trait InactivePageRestriction
    extends StObject
       with PrerenderFinalStatus
  inline def InactivePageRestriction: InactivePageRestriction = "InactivePageRestriction".asInstanceOf[InactivePageRestriction]
  
  @js.native
  sealed trait IndexedDBConnection
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def IndexedDBConnection: IndexedDBConnection = "IndexedDBConnection".asInstanceOf[IndexedDBConnection]
  
  @js.native
  sealed trait InjectedJavascript
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def InjectedJavascript: InjectedJavascript = "InjectedJavascript".asInstanceOf[InjectedJavascript]
  
  @js.native
  sealed trait InjectedStyleSheet
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def InjectedStyleSheet: InjectedStyleSheet = "InjectedStyleSheet".asInstanceOf[InjectedStyleSheet]
  
  @js.native
  sealed trait Insecure
    extends StObject
       with OriginTrialTokenStatus
  inline def Insecure: Insecure = "Insecure".asInstanceOf[Insecure]
  
  @js.native
  sealed trait InsecureAncestor
    extends StObject
       with SecureContextType
  inline def InsecureAncestor: InsecureAncestor = "InsecureAncestor".asInstanceOf[InsecureAncestor]
  
  @js.native
  sealed trait InsecureContext
    extends StObject
       with AttributionReportingIssueType
  inline def InsecureContext: InsecureContext = "InsecureContext".asInstanceOf[InsecureContext]
  
  @js.native
  sealed trait InsecurePrivateNetwork
    extends StObject
       with CorsError
  inline def InsecurePrivateNetwork: InsecurePrivateNetwork = "InsecurePrivateNetwork".asInstanceOf[InsecurePrivateNetwork]
  
  @js.native
  sealed trait InsecurePrivateNetworkSubresourceRequest
    extends StObject
       with DeprecationIssueType
  inline def InsecurePrivateNetworkSubresourceRequest: InsecurePrivateNetworkSubresourceRequest = "InsecurePrivateNetworkSubresourceRequest".asInstanceOf[InsecurePrivateNetworkSubresourceRequest]
  
  @js.native
  sealed trait InsecureScheme
    extends StObject
       with SecureContextType
  inline def InsecureScheme: InsecureScheme = "InsecureScheme".asInstanceOf[InsecureScheme]
  
  @js.native
  sealed trait InternalError
    extends StObject
       with TrustTokenOperationDoneEventStatus
  inline def InternalError: InternalError = "InternalError".asInstanceOf[InternalError]
  
  @js.native
  sealed trait InternetDisconnected
    extends StObject
       with ErrorReason
  inline def InternetDisconnected: InternetDisconnected = "InternetDisconnected".asInstanceOf[InternetDisconnected]
  
  @js.native
  sealed trait InvalidAllowCredentials
    extends StObject
       with CorsError
  inline def InvalidAllowCredentials: InvalidAllowCredentials = "InvalidAllowCredentials".asInstanceOf[InvalidAllowCredentials]
  
  @js.native
  sealed trait InvalidAllowHeadersPreflightResponse
    extends StObject
       with CorsError
  inline def InvalidAllowHeadersPreflightResponse: InvalidAllowHeadersPreflightResponse = "InvalidAllowHeadersPreflightResponse".asInstanceOf[InvalidAllowHeadersPreflightResponse]
  
  @js.native
  sealed trait InvalidAllowMethodsPreflightResponse
    extends StObject
       with CorsError
  inline def InvalidAllowMethodsPreflightResponse: InvalidAllowMethodsPreflightResponse = "InvalidAllowMethodsPreflightResponse".asInstanceOf[InvalidAllowMethodsPreflightResponse]
  
  @js.native
  sealed trait InvalidAllowOriginValue
    extends StObject
       with CorsError
  inline def InvalidAllowOriginValue: InvalidAllowOriginValue = "InvalidAllowOriginValue".asInstanceOf[InvalidAllowOriginValue]
  
  @js.native
  sealed trait InvalidArgument
    extends StObject
       with TrustTokenOperationDoneEventStatus
  inline def InvalidArgument: InvalidArgument = "InvalidArgument".asInstanceOf[InvalidArgument]
  
  @js.native
  sealed trait InvalidDomain
    extends StObject
       with SetCookieBlockedReason
  inline def InvalidDomain: InvalidDomain = "InvalidDomain".asInstanceOf[InvalidDomain]
  
  @js.native
  sealed trait InvalidEligibleHeader
    extends StObject
       with AttributionReportingIssueType
  inline def InvalidEligibleHeader: InvalidEligibleHeader = "InvalidEligibleHeader".asInstanceOf[InvalidEligibleHeader]
  
  @js.native
  sealed trait InvalidHeader
    extends StObject
       with AttributionReportingIssueType
  inline def InvalidHeader: InvalidHeader = "InvalidHeader".asInstanceOf[InvalidHeader]
  
  @js.native
  sealed trait InvalidPrefix
    extends StObject
       with SetCookieBlockedReason
  inline def InvalidPrefix: InvalidPrefix = "InvalidPrefix".asInstanceOf[InvalidPrefix]
  
  @js.native
  sealed trait InvalidPrivateNetworkAccess
    extends StObject
       with CorsError
  inline def InvalidPrivateNetworkAccess: InvalidPrivateNetworkAccess = "InvalidPrivateNetworkAccess".asInstanceOf[InvalidPrivateNetworkAccess]
  
  @js.native
  sealed trait InvalidRegisterTriggerHeader
    extends StObject
       with AttributionReportingIssueType
  inline def InvalidRegisterTriggerHeader: InvalidRegisterTriggerHeader = "InvalidRegisterTriggerHeader".asInstanceOf[InvalidRegisterTriggerHeader]
  
  @js.native
  sealed trait InvalidResponse
    extends StObject
       with CorsError
  inline def InvalidResponse: InvalidResponse = "InvalidResponse".asInstanceOf[InvalidResponse]
  
  @js.native
  sealed trait InvalidSchemeNavigation
    extends StObject
       with PrerenderFinalStatus
  inline def InvalidSchemeNavigation: InvalidSchemeNavigation = "InvalidSchemeNavigation".asInstanceOf[InvalidSchemeNavigation]
  
  @js.native
  sealed trait InvalidSchemeRedirect
    extends StObject
       with PrerenderFinalStatus
  inline def InvalidSchemeRedirect: InvalidSchemeRedirect = "InvalidSchemeRedirect".asInstanceOf[InvalidSchemeRedirect]
  
  @js.native
  sealed trait InvalidSignature
    extends StObject
       with OriginTrialTokenStatus
  inline def InvalidSignature: InvalidSignature = "InvalidSignature".asInstanceOf[InvalidSignature]
  
  @js.native
  sealed trait InvalidSigninResponse
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def InvalidSigninResponse: InvalidSigninResponse = "InvalidSigninResponse".asInstanceOf[InvalidSigninResponse]
  
  @js.native
  sealed trait Isolated
    extends StObject
       with CrossOriginIsolatedContextType
  inline def Isolated: Isolated = "Isolated".asInstanceOf[Isolated]
  
  @js.native
  sealed trait Issuance
    extends StObject
       with TrustTokenOperationType
  inline def Issuance: Issuance = "Issuance".asInstanceOf[Issuance]
  
  @js.native
  sealed trait JavaScript
    extends StObject
       with ScriptLanguage
  inline def JavaScript: JavaScript = "JavaScript".asInstanceOf[JavaScript]
  
  @js.native
  sealed trait JavaScriptExecution
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def JavaScriptExecution: JavaScriptExecution = "JavaScriptExecution".asInstanceOf[JavaScriptExecution]
  
  @js.native
  sealed trait KeyboardLock
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def KeyboardLock: KeyboardLock = "KeyboardLock".asInstanceOf[KeyboardLock]
  
  @js.native
  sealed trait Lax
    extends StObject
       with CookieSameSite
  inline def Lax: Lax = "Lax".asInstanceOf[Lax]
  
  @js.native
  sealed trait LimitedQuirksMode
    extends StObject
       with CompatibilityMode
  inline def LimitedQuirksMode: LimitedQuirksMode = "LimitedQuirksMode".asInstanceOf[LimitedQuirksMode]
  
  @js.native
  sealed trait Loading
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def Loading: Loading = "Loading".asInstanceOf[Loading]
  
  @js.native
  sealed trait Local
    extends StObject
       with IPAddressSpace
  inline def Local: Local = "Local".asInstanceOf[Local]
  
  @js.native
  sealed trait LocalCSSFileExtensionRejected
    extends StObject
       with DeprecationIssueType
  inline def LocalCSSFileExtensionRejected: LocalCSSFileExtensionRejected = "LocalCSSFileExtensionRejected".asInstanceOf[LocalCSSFileExtensionRejected]
  
  @js.native
  sealed trait LoginAuthRequested
    extends StObject
       with PrerenderFinalStatus
  inline def LoginAuthRequested: LoginAuthRequested = "LoginAuthRequested".asInstanceOf[LoginAuthRequested]
  
  @js.native
  sealed trait Low
    extends StObject
       with CookiePriority
       with ResourcePriority
  inline def Low: Low = "Low".asInstanceOf[Low]
  
  @js.native
  sealed trait LowEndDevice
    extends StObject
       with PrerenderFinalStatus
  inline def LowEndDevice: LowEndDevice = "LowEndDevice".asInstanceOf[LowEndDevice]
  
  @js.native
  sealed trait LowTextContrastIssue
    extends StObject
       with InspectorIssueCode
  inline def LowTextContrastIssue: LowTextContrastIssue = "LowTextContrastIssue".asInstanceOf[LowTextContrastIssue]
  
  @js.native
  sealed trait MainFrameNavigation
    extends StObject
       with PrerenderFinalStatus
  inline def MainFrameNavigation: MainFrameNavigation = "MainFrameNavigation".asInstanceOf[MainFrameNavigation]
  
  @js.native
  sealed trait MainResourceHasCacheControlNoCache
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def MainResourceHasCacheControlNoCache: MainResourceHasCacheControlNoCache = "MainResourceHasCacheControlNoCache".asInstanceOf[MainResourceHasCacheControlNoCache]
  
  @js.native
  sealed trait MainResourceHasCacheControlNoStore
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def MainResourceHasCacheControlNoStore: MainResourceHasCacheControlNoStore = "MainResourceHasCacheControlNoStore".asInstanceOf[MainResourceHasCacheControlNoStore]
  
  @js.native
  sealed trait Malformed
    extends StObject
       with OriginTrialTokenStatus
  inline def Malformed: Malformed = "Malformed".asInstanceOf[Malformed]
  
  @js.native
  sealed trait Manifest
    extends StObject
       with MixedContentResourceType
       with ResourceType
  inline def Manifest: Manifest = "Manifest".asInstanceOf[Manifest]
  
  @js.native
  sealed trait ManifestHttpNotFound
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def ManifestHttpNotFound: ManifestHttpNotFound = "ManifestHttpNotFound".asInstanceOf[ManifestHttpNotFound]
  
  @js.native
  sealed trait ManifestInvalidResponse
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def ManifestInvalidResponse: ManifestInvalidResponse = "ManifestInvalidResponse".asInstanceOf[ManifestInvalidResponse]
  
  @js.native
  sealed trait ManifestListHttpNotFound
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def ManifestListHttpNotFound: ManifestListHttpNotFound = "ManifestListHttpNotFound".asInstanceOf[ManifestListHttpNotFound]
  
  @js.native
  sealed trait ManifestListInvalidResponse
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def ManifestListInvalidResponse: ManifestListInvalidResponse = "ManifestListInvalidResponse".asInstanceOf[ManifestListInvalidResponse]
  
  @js.native
  sealed trait ManifestListNoResponse
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def ManifestListNoResponse: ManifestListNoResponse = "ManifestListNoResponse".asInstanceOf[ManifestListNoResponse]
  
  @js.native
  sealed trait ManifestListTooBig
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def ManifestListTooBig: ManifestListTooBig = "ManifestListTooBig".asInstanceOf[ManifestListTooBig]
  
  @js.native
  sealed trait ManifestNoResponse
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def ManifestNoResponse: ManifestNoResponse = "ManifestNoResponse".asInstanceOf[ManifestNoResponse]
  
  @js.native
  sealed trait ManifestNotInManifestList
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def ManifestNotInManifestList: ManifestNotInManifestList = "ManifestNotInManifestList".asInstanceOf[ManifestNotInManifestList]
  
  @js.native
  sealed trait MarkedForRemoval
    extends StObject
       with ReportStatus
  inline def MarkedForRemoval: MarkedForRemoval = "MarkedForRemoval".asInstanceOf[MarkedForRemoval]
  
  @js.native
  sealed trait MatchedBlockingRule
    extends StObject
       with AdFrameExplanation
  inline def MatchedBlockingRule: MatchedBlockingRule = "MatchedBlockingRule".asInstanceOf[MatchedBlockingRule]
  
  @js.native
  sealed trait MaxNumOfRunningPrerendersExceeded
    extends StObject
       with PrerenderFinalStatus
  inline def MaxNumOfRunningPrerendersExceeded: MaxNumOfRunningPrerendersExceeded = "MaxNumOfRunningPrerendersExceeded".asInstanceOf[MaxNumOfRunningPrerendersExceeded]
  
  @js.native
  sealed trait Media
    extends StObject
       with ResourceType
  inline def Media: Media = "Media".asInstanceOf[Media]
  
  @js.native
  sealed trait MediaSourceAbortRemove
    extends StObject
       with DeprecationIssueType
  inline def MediaSourceAbortRemove: MediaSourceAbortRemove = "MediaSourceAbortRemove".asInstanceOf[MediaSourceAbortRemove]
  
  @js.native
  sealed trait MediaSourceDurationTruncatingBuffered
    extends StObject
       with DeprecationIssueType
  inline def MediaSourceDurationTruncatingBuffered: MediaSourceDurationTruncatingBuffered = "MediaSourceDurationTruncatingBuffered".asInstanceOf[MediaSourceDurationTruncatingBuffered]
  
  @js.native
  sealed trait Medium
    extends StObject
       with CookiePriority
       with ResourcePriority
  inline def Medium: Medium = "Medium".asInstanceOf[Medium]
  
  @js.native
  sealed trait MemoryLimitExceeded
    extends StObject
       with PrerenderFinalStatus
  inline def MemoryLimitExceeded: MemoryLimitExceeded = "MemoryLimitExceeded".asInstanceOf[MemoryLimitExceeded]
  
  @js.native
  sealed trait MetaTagAllowListInvalidOrigin
    extends StObject
       with ClientHintIssueReason
  inline def MetaTagAllowListInvalidOrigin: MetaTagAllowListInvalidOrigin = "MetaTagAllowListInvalidOrigin".asInstanceOf[MetaTagAllowListInvalidOrigin]
  
  @js.native
  sealed trait MetaTagModifiedHTML
    extends StObject
       with ClientHintIssueReason
  inline def MetaTagModifiedHTML: MetaTagModifiedHTML = "MetaTagModifiedHTML".asInstanceOf[MetaTagModifiedHTML]
  
  @js.native
  sealed trait MethodDisallowedByPreflightResponse
    extends StObject
       with CorsError
  inline def MethodDisallowedByPreflightResponse: MethodDisallowedByPreflightResponse = "MethodDisallowedByPreflightResponse".asInstanceOf[MethodDisallowedByPreflightResponse]
  
  @js.native
  sealed trait MissingAllowOriginHeader
    extends StObject
       with CorsError
  inline def MissingAllowOriginHeader: MissingAllowOriginHeader = "MissingAllowOriginHeader".asInstanceOf[MissingAllowOriginHeader]
  
  @js.native
  sealed trait MixedContent
    extends StObject
       with PrerenderFinalStatus
  inline def MixedContent: MixedContent = "MixedContent".asInstanceOf[MixedContent]
  
  @js.native
  sealed trait MixedContentAutomaticallyUpgraded
    extends StObject
       with MixedContentResolutionStatus
  inline def MixedContentAutomaticallyUpgraded: MixedContentAutomaticallyUpgraded = "MixedContentAutomaticallyUpgraded".asInstanceOf[MixedContentAutomaticallyUpgraded]
  
  @js.native
  sealed trait MixedContentBlocked
    extends StObject
       with MixedContentResolutionStatus
  inline def MixedContentBlocked: MixedContentBlocked = "MixedContentBlocked".asInstanceOf[MixedContentBlocked]
  
  @js.native
  sealed trait MixedContentIssue
    extends StObject
       with InspectorIssueCode
  inline def MixedContentIssue: MixedContentIssue = "MixedContentIssue".asInstanceOf[MixedContentIssue]
  
  @js.native
  sealed trait MixedContentWarning
    extends StObject
       with MixedContentResolutionStatus
  inline def MixedContentWarning: MixedContentWarning = "MixedContentWarning".asInstanceOf[MixedContentWarning]
  
  @js.native
  sealed trait MojoBinderPolicy
    extends StObject
       with PrerenderFinalStatus
  inline def MojoBinderPolicy: MojoBinderPolicy = "MojoBinderPolicy".asInstanceOf[MojoBinderPolicy]
  
  @js.native
  sealed trait MultipleAllowOriginValues
    extends StObject
       with CorsError
  inline def MultipleAllowOriginValues: MultipleAllowOriginValues = "MultipleAllowOriginValues".asInstanceOf[MultipleAllowOriginValues]
  
  @js.native
  sealed trait NameNotResolved
    extends StObject
       with ErrorReason
  inline def NameNotResolved: NameNotResolved = "NameNotResolved".asInstanceOf[NameNotResolved]
  
  @js.native
  sealed trait NameValuePairExceedsMaxSize
    extends StObject
       with CookieBlockedReason
       with SetCookieBlockedReason
  inline def NameValuePairExceedsMaxSize: NameValuePairExceedsMaxSize = "NameValuePairExceedsMaxSize".asInstanceOf[NameValuePairExceedsMaxSize]
  
  @js.native
  sealed trait Navigation
    extends StObject
       with NavigationType
  inline def Navigation: Navigation = "Navigation".asInstanceOf[Navigation]
  
  @js.native
  sealed trait NavigationBadHttpStatus
    extends StObject
       with PrerenderFinalStatus
  inline def NavigationBadHttpStatus: NavigationBadHttpStatus = "NavigationBadHttpStatus".asInstanceOf[NavigationBadHttpStatus]
  
  @js.native
  sealed trait NavigationCancelledWhileRestoring
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def NavigationCancelledWhileRestoring: NavigationCancelledWhileRestoring = "NavigationCancelledWhileRestoring".asInstanceOf[NavigationCancelledWhileRestoring]
  
  @js.native
  sealed trait NavigationNotCommitted
    extends StObject
       with PrerenderFinalStatus
  inline def NavigationNotCommitted: NavigationNotCommitted = "NavigationNotCommitted".asInstanceOf[NavigationNotCommitted]
  
  @js.native
  sealed trait NavigationRequestBlockedByCsp
    extends StObject
       with PrerenderFinalStatus
  inline def NavigationRequestBlockedByCsp: NavigationRequestBlockedByCsp = "NavigationRequestBlockedByCsp".asInstanceOf[NavigationRequestBlockedByCsp]
  
  @js.native
  sealed trait NavigationRequestNetworkError
    extends StObject
       with PrerenderFinalStatus
  inline def NavigationRequestNetworkError: NavigationRequestNetworkError = "NavigationRequestNetworkError".asInstanceOf[NavigationRequestNetworkError]
  
  @js.native
  sealed trait NavigatorUserAgentIssue
    extends StObject
       with InspectorIssueCode
  inline def NavigatorUserAgentIssue: NavigatorUserAgentIssue = "NavigatorUserAgentIssue".asInstanceOf[NavigatorUserAgentIssue]
  
  @js.native
  sealed trait NetworkExceedsBufferLimit
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def NetworkExceedsBufferLimit: NetworkExceedsBufferLimit = "NetworkExceedsBufferLimit".asInstanceOf[NetworkExceedsBufferLimit]
  
  @js.native
  sealed trait NetworkRequestDatapipeDrainedAsBytesConsumer
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def NetworkRequestDatapipeDrainedAsBytesConsumer: NetworkRequestDatapipeDrainedAsBytesConsumer = "NetworkRequestDatapipeDrainedAsBytesConsumer".asInstanceOf[NetworkRequestDatapipeDrainedAsBytesConsumer]
  
  @js.native
  sealed trait NetworkRequestRedirected
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def NetworkRequestRedirected: NetworkRequestRedirected = "NetworkRequestRedirected".asInstanceOf[NetworkRequestRedirected]
  
  @js.native
  sealed trait NetworkRequestTimeout
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def NetworkRequestTimeout: NetworkRequestTimeout = "NetworkRequestTimeout".asInstanceOf[NetworkRequestTimeout]
  
  @js.native
  sealed trait NetworkTotalLimit
    extends StObject
       with HeavyAdReason
  inline def NetworkTotalLimit: NetworkTotalLimit = "NetworkTotalLimit".asInstanceOf[NetworkTotalLimit]
  
  @js.native
  sealed trait NoCorsRedirectModeNotFollow
    extends StObject
       with CorsError
  inline def NoCorsRedirectModeNotFollow: NoCorsRedirectModeNotFollow = "NoCorsRedirectModeNotFollow".asInstanceOf[NoCorsRedirectModeNotFollow]
  
  @js.native
  sealed trait NoQuirksMode
    extends StObject
       with CompatibilityMode
  inline def NoQuirksMode: NoQuirksMode = "NoQuirksMode".asInstanceOf[NoQuirksMode]
  
  @js.native
  sealed trait NoResponseHead
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def NoResponseHead: NoResponseHead = "NoResponseHead".asInstanceOf[NoResponseHead]
  
  @js.native
  sealed trait NoSysexWebMIDIWithoutPermission
    extends StObject
       with DeprecationIssueType
  inline def NoSysexWebMIDIWithoutPermission: NoSysexWebMIDIWithoutPermission = "NoSysexWebMIDIWithoutPermission".asInstanceOf[NoSysexWebMIDIWithoutPermission]
  
  @js.native
  sealed trait NonSecure
    extends StObject
       with CookieSourceScheme
  inline def NonSecure: NonSecure = "NonSecure".asInstanceOf[NonSecure]
  
  @js.native
  sealed trait None
    extends StObject
       with CookieSameSite
       with CrossOriginEmbedderPolicyValue
       with DebugSymbolsType
       with OriginTrialUsageRestriction
  inline def None: None = "None".asInstanceOf[None]
  
  @js.native
  sealed trait NotIsolated
    extends StObject
       with CrossOriginIsolatedContextType
  inline def NotIsolated: NotIsolated = "NotIsolated".asInstanceOf[NotIsolated]
  
  @js.native
  sealed trait NotIsolatedFeatureDisabled
    extends StObject
       with CrossOriginIsolatedContextType
  inline def NotIsolatedFeatureDisabled: NotIsolatedFeatureDisabled = "NotIsolatedFeatureDisabled".asInstanceOf[NotIsolatedFeatureDisabled]
  
  @js.native
  sealed trait NotMostRecentNavigationEntry
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def NotMostRecentNavigationEntry: NotMostRecentNavigationEntry = "NotMostRecentNavigationEntry".asInstanceOf[NotMostRecentNavigationEntry]
  
  @js.native
  sealed trait NotOnPath
    extends StObject
       with CookieBlockedReason
  inline def NotOnPath: NotOnPath = "NotOnPath".asInstanceOf[NotOnPath]
  
  @js.native
  sealed trait NotPrimaryMainFrame
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def NotPrimaryMainFrame: NotPrimaryMainFrame = "NotPrimaryMainFrame".asInstanceOf[NotPrimaryMainFrame]
  
  @js.native
  sealed trait NotSupported
    extends StObject
       with OriginTrialTokenStatus
  inline def NotSupported: NotSupported = "NotSupported".asInstanceOf[NotSupported]
  
  @js.native
  sealed trait NotificationInsecureOrigin
    extends StObject
       with DeprecationIssueType
  inline def NotificationInsecureOrigin: NotificationInsecureOrigin = "NotificationInsecureOrigin".asInstanceOf[NotificationInsecureOrigin]
  
  @js.native
  sealed trait NotificationPermissionRequestedIframe
    extends StObject
       with DeprecationIssueType
  inline def NotificationPermissionRequestedIframe: NotificationPermissionRequestedIframe = "NotificationPermissionRequestedIframe".asInstanceOf[NotificationPermissionRequestedIframe]
  
  @js.native
  sealed trait OOM
    extends StObject
       with PausedEventReason
  inline def OOM: OOM = "OOM".asInstanceOf[OOM]
  
  @js.native
  sealed trait OSNotSupported
    extends StObject
       with OriginTrialStatus
  inline def OSNotSupported: OSNotSupported = "OSNotSupported".asInstanceOf[OSNotSupported]
  
  @js.native
  sealed trait ObsoleteWebRtcCipherSuite
    extends StObject
       with DeprecationIssueType
  inline def ObsoleteWebRtcCipherSuite: ObsoleteWebRtcCipherSuite = "ObsoleteWebRtcCipherSuite".asInstanceOf[ObsoleteWebRtcCipherSuite]
  
  @js.native
  sealed trait Ok
    extends StObject
       with SetScriptSourceResponseStatus
       with TrustTokenOperationDoneEventStatus
  inline def Ok: Ok = "Ok".asInstanceOf[Ok]
  
  @js.native
  sealed trait OpenWebDatabaseInsecureContext
    extends StObject
       with DeprecationIssueType
  inline def OpenWebDatabaseInsecureContext: OpenWebDatabaseInsecureContext = "OpenWebDatabaseInsecureContext".asInstanceOf[OpenWebDatabaseInsecureContext]
  
  @js.native
  sealed trait Other
    extends StObject
       with ResourceType
  inline def Other: Other = "Other".asInstanceOf[Other]
  
  @js.native
  sealed trait OutstandingIndexedDBTransaction
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def OutstandingIndexedDBTransaction: OutstandingIndexedDBTransaction = "OutstandingIndexedDBTransaction".asInstanceOf[OutstandingIndexedDBTransaction]
  
  @js.native
  sealed trait OutstandingNetworkRequestDirectSocket
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def OutstandingNetworkRequestDirectSocket: OutstandingNetworkRequestDirectSocket = "OutstandingNetworkRequestDirectSocket".asInstanceOf[OutstandingNetworkRequestDirectSocket]
  
  @js.native
  sealed trait OutstandingNetworkRequestFetch
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def OutstandingNetworkRequestFetch: OutstandingNetworkRequestFetch = "OutstandingNetworkRequestFetch".asInstanceOf[OutstandingNetworkRequestFetch]
  
  @js.native
  sealed trait OutstandingNetworkRequestOthers
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def OutstandingNetworkRequestOthers: OutstandingNetworkRequestOthers = "OutstandingNetworkRequestOthers".asInstanceOf[OutstandingNetworkRequestOthers]
  
  @js.native
  sealed trait OutstandingNetworkRequestXHR
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def OutstandingNetworkRequestXHR: OutstandingNetworkRequestXHR = "OutstandingNetworkRequestXHR".asInstanceOf[OutstandingNetworkRequestXHR]
  
  @js.native
  sealed trait OverflowVisibleOnReplacedElement
    extends StObject
       with DeprecationIssueType
  inline def OverflowVisibleOnReplacedElement: OverflowVisibleOnReplacedElement = "OverflowVisibleOnReplacedElement".asInstanceOf[OverflowVisibleOnReplacedElement]
  
  @js.native
  sealed trait OverwriteSecure
    extends StObject
       with SetCookieBlockedReason
  inline def OverwriteSecure: OverwriteSecure = "OverwriteSecure".asInstanceOf[OverwriteSecure]
  
  @js.native
  sealed trait PageSupportNeeded
    extends StObject
       with BackForwardCacheNotRestoredReasonType
  inline def PageSupportNeeded: PageSupportNeeded = "PageSupportNeeded".asInstanceOf[PageSupportNeeded]
  
  @js.native
  sealed trait ParentIsAd
    extends StObject
       with AdFrameExplanation
  inline def ParentIsAd: ParentIsAd = "ParentIsAd".asInstanceOf[ParentIsAd]
  
  @js.native
  sealed trait PaymentInstruments
    extends StObject
       with DeprecationIssueType
  inline def PaymentInstruments: PaymentInstruments = "PaymentInstruments".asInstanceOf[PaymentInstruments]
  
  @js.native
  sealed trait PaymentManager
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def PaymentManager: PaymentManager = "PaymentManager".asInstanceOf[PaymentManager]
  
  @js.native
  sealed trait PaymentRequestCSPViolation
    extends StObject
       with DeprecationIssueType
  inline def PaymentRequestCSPViolation: PaymentRequestCSPViolation = "PaymentRequestCSPViolation".asInstanceOf[PaymentRequestCSPViolation]
  
  @js.native
  sealed trait Pending
    extends StObject
       with ReportStatus
  inline def Pending: Pending = "Pending".asInstanceOf[Pending]
  
  @js.native
  sealed trait PerformanceMeasureMemory
    extends StObject
       with GatedAPIFeatures
  inline def PerformanceMeasureMemory: PerformanceMeasureMemory = "PerformanceMeasureMemory".asInstanceOf[PerformanceMeasureMemory]
  
  @js.native
  sealed trait PerformanceProfile
    extends StObject
       with GatedAPIFeatures
  inline def PerformanceProfile: PerformanceProfile = "PerformanceProfile".asInstanceOf[PerformanceProfile]
  
  @js.native
  sealed trait PermissionPolicyDisabled
    extends StObject
       with AttributionReportingIssueType
  inline def PermissionPolicyDisabled: PermissionPolicyDisabled = "PermissionPolicyDisabled".asInstanceOf[PermissionPolicyDisabled]
  
  @js.native
  sealed trait PermissionPolicyNotDelegated
    extends StObject
       with AttributionReportingIssueType
  inline def PermissionPolicyNotDelegated: PermissionPolicyNotDelegated = "PermissionPolicyNotDelegated".asInstanceOf[PermissionPolicyNotDelegated]
  
  @js.native
  sealed trait PersistentQuotaType
    extends StObject
       with DeprecationIssueType
  inline def PersistentQuotaType: PersistentQuotaType = "PersistentQuotaType".asInstanceOf[PersistentQuotaType]
  
  @js.native
  sealed trait PictureInPicture
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def PictureInPicture: PictureInPicture = "PictureInPicture".asInstanceOf[PictureInPicture]
  
  @js.native
  sealed trait PictureSourceSrc
    extends StObject
       with DeprecationIssueType
  inline def PictureSourceSrc: PictureSourceSrc = "PictureSourceSrc".asInstanceOf[PictureSourceSrc]
  
  @js.native
  sealed trait Ping
    extends StObject
       with MixedContentResourceType
       with ResourceType
  inline def Ping: Ping = "Ping".asInstanceOf[Ping]
  
  @js.native
  sealed trait PluginData
    extends StObject
       with MixedContentResourceType
  inline def PluginData: PluginData = "PluginData".asInstanceOf[PluginData]
  
  @js.native
  sealed trait PluginResource
    extends StObject
       with MixedContentResourceType
  inline def PluginResource: PluginResource = "PluginResource".asInstanceOf[PluginResource]
  
  @js.native
  sealed trait Portal
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def Portal: Portal = "Portal".asInstanceOf[Portal]
  
  @js.native
  sealed trait Prefetch
    extends StObject
       with MixedContentResourceType
       with ResourceType
  inline def Prefetch: Prefetch = "Prefetch".asInstanceOf[Prefetch]
  
  @js.native
  sealed trait PrefixedCancelAnimationFrame
    extends StObject
       with DeprecationIssueType
  inline def PrefixedCancelAnimationFrame: PrefixedCancelAnimationFrame = "PrefixedCancelAnimationFrame".asInstanceOf[PrefixedCancelAnimationFrame]
  
  @js.native
  sealed trait PrefixedRequestAnimationFrame
    extends StObject
       with DeprecationIssueType
  inline def PrefixedRequestAnimationFrame: PrefixedRequestAnimationFrame = "PrefixedRequestAnimationFrame".asInstanceOf[PrefixedRequestAnimationFrame]
  
  @js.native
  sealed trait PrefixedStorageInfo
    extends StObject
       with DeprecationIssueType
  inline def PrefixedStorageInfo: PrefixedStorageInfo = "PrefixedStorageInfo".asInstanceOf[PrefixedStorageInfo]
  
  @js.native
  sealed trait PrefixedVideoDisplayingFullscreen
    extends StObject
       with DeprecationIssueType
  inline def PrefixedVideoDisplayingFullscreen: PrefixedVideoDisplayingFullscreen = "PrefixedVideoDisplayingFullscreen".asInstanceOf[PrefixedVideoDisplayingFullscreen]
  
  @js.native
  sealed trait PrefixedVideoEnterFullScreen
    extends StObject
       with DeprecationIssueType
  inline def PrefixedVideoEnterFullScreen: PrefixedVideoEnterFullScreen = "PrefixedVideoEnterFullScreen".asInstanceOf[PrefixedVideoEnterFullScreen]
  
  @js.native
  sealed trait PrefixedVideoEnterFullscreen_
    extends StObject
       with DeprecationIssueType
  inline def PrefixedVideoEnterFullscreen_ : PrefixedVideoEnterFullscreen_ = "PrefixedVideoEnterFullscreen".asInstanceOf[PrefixedVideoEnterFullscreen_]
  
  @js.native
  sealed trait PrefixedVideoExitFullScreen
    extends StObject
       with DeprecationIssueType
  inline def PrefixedVideoExitFullScreen: PrefixedVideoExitFullScreen = "PrefixedVideoExitFullScreen".asInstanceOf[PrefixedVideoExitFullScreen]
  
  @js.native
  sealed trait PrefixedVideoExitFullscreen_
    extends StObject
       with DeprecationIssueType
  inline def PrefixedVideoExitFullscreen_ : PrefixedVideoExitFullscreen_ = "PrefixedVideoExitFullscreen".asInstanceOf[PrefixedVideoExitFullscreen_]
  
  @js.native
  sealed trait PrefixedVideoSupportsFullscreen
    extends StObject
       with DeprecationIssueType
  inline def PrefixedVideoSupportsFullscreen: PrefixedVideoSupportsFullscreen = "PrefixedVideoSupportsFullscreen".asInstanceOf[PrefixedVideoSupportsFullscreen]
  
  @js.native
  sealed trait Preflight
    extends StObject
       with ResourceType
  inline def Preflight: Preflight = "Preflight".asInstanceOf[Preflight]
  
  @js.native
  sealed trait PreflightAllowOriginMismatch
    extends StObject
       with CorsError
  inline def PreflightAllowOriginMismatch: PreflightAllowOriginMismatch = "PreflightAllowOriginMismatch".asInstanceOf[PreflightAllowOriginMismatch]
  
  @js.native
  sealed trait PreflightBlock
    extends StObject
       with PrivateNetworkRequestPolicy
  inline def PreflightBlock: PreflightBlock = "PreflightBlock".asInstanceOf[PreflightBlock]
  
  @js.native
  sealed trait PreflightDisallowedRedirect
    extends StObject
       with CorsError
  inline def PreflightDisallowedRedirect: PreflightDisallowedRedirect = "PreflightDisallowedRedirect".asInstanceOf[PreflightDisallowedRedirect]
  
  @js.native
  sealed trait PreflightInvalidAllowCredentials
    extends StObject
       with CorsError
  inline def PreflightInvalidAllowCredentials: PreflightInvalidAllowCredentials = "PreflightInvalidAllowCredentials".asInstanceOf[PreflightInvalidAllowCredentials]
  
  @js.native
  sealed trait PreflightInvalidAllowExternal
    extends StObject
       with CorsError
  inline def PreflightInvalidAllowExternal: PreflightInvalidAllowExternal = "PreflightInvalidAllowExternal".asInstanceOf[PreflightInvalidAllowExternal]
  
  @js.native
  sealed trait PreflightInvalidAllowOriginValue
    extends StObject
       with CorsError
  inline def PreflightInvalidAllowOriginValue: PreflightInvalidAllowOriginValue = "PreflightInvalidAllowOriginValue".asInstanceOf[PreflightInvalidAllowOriginValue]
  
  @js.native
  sealed trait PreflightInvalidAllowPrivateNetwork
    extends StObject
       with CorsError
  inline def PreflightInvalidAllowPrivateNetwork: PreflightInvalidAllowPrivateNetwork = "PreflightInvalidAllowPrivateNetwork".asInstanceOf[PreflightInvalidAllowPrivateNetwork]
  
  @js.native
  sealed trait PreflightInvalidStatus
    extends StObject
       with CorsError
  inline def PreflightInvalidStatus: PreflightInvalidStatus = "PreflightInvalidStatus".asInstanceOf[PreflightInvalidStatus]
  
  @js.native
  sealed trait PreflightMissingAllowExternal
    extends StObject
       with CorsError
  inline def PreflightMissingAllowExternal: PreflightMissingAllowExternal = "PreflightMissingAllowExternal".asInstanceOf[PreflightMissingAllowExternal]
  
  @js.native
  sealed trait PreflightMissingAllowOriginHeader
    extends StObject
       with CorsError
  inline def PreflightMissingAllowOriginHeader: PreflightMissingAllowOriginHeader = "PreflightMissingAllowOriginHeader".asInstanceOf[PreflightMissingAllowOriginHeader]
  
  @js.native
  sealed trait PreflightMissingAllowPrivateNetwork
    extends StObject
       with CorsError
  inline def PreflightMissingAllowPrivateNetwork: PreflightMissingAllowPrivateNetwork = "PreflightMissingAllowPrivateNetwork".asInstanceOf[PreflightMissingAllowPrivateNetwork]
  
  @js.native
  sealed trait PreflightMultipleAllowOriginValues
    extends StObject
       with CorsError
  inline def PreflightMultipleAllowOriginValues: PreflightMultipleAllowOriginValues = "PreflightMultipleAllowOriginValues".asInstanceOf[PreflightMultipleAllowOriginValues]
  
  @js.native
  sealed trait PreflightWarn
    extends StObject
       with PrivateNetworkRequestPolicy
  inline def PreflightWarn: PreflightWarn = "PreflightWarn".asInstanceOf[PreflightWarn]
  
  @js.native
  sealed trait PreflightWildcardOriginNotAllowed
    extends StObject
       with CorsError
  inline def PreflightWildcardOriginNotAllowed: PreflightWildcardOriginNotAllowed = "PreflightWildcardOriginNotAllowed".asInstanceOf[PreflightWildcardOriginNotAllowed]
  
  @js.native
  sealed trait Printing
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def Printing: Printing = "Printing".asInstanceOf[Printing]
  
  @js.native
  sealed trait Private
    extends StObject
       with IPAddressSpace
  inline def Private: Private = "Private".asInstanceOf[Private]
  
  @js.native
  sealed trait ProvideCredentials
    extends StObject
       with AuthChallengeResponseResponse
       with typings.devtoolsProtocol.mod.Protocol.Fetch.AuthChallengeResponseResponse
  inline def ProvideCredentials: ProvideCredentials = "ProvideCredentials".asInstanceOf[ProvideCredentials]
  
  @js.native
  sealed trait Proxy
    extends StObject
       with AuthChallengeSource
       with typings.devtoolsProtocol.mod.Protocol.Fetch.AuthChallengeSource
  inline def Proxy: Proxy = "Proxy".asInstanceOf[Proxy]
  
  @js.native
  sealed trait Public
    extends StObject
       with IPAddressSpace
  inline def Public: Public = "Public".asInstanceOf[Public]
  
  @js.native
  sealed trait Queued
    extends StObject
       with ReportStatus
  inline def Queued: Queued = "Queued".asInstanceOf[Queued]
  
  @js.native
  sealed trait QuirksMode
    extends StObject
       with CompatibilityMode
  inline def QuirksMode: QuirksMode = "QuirksMode".asInstanceOf[QuirksMode]
  
  @js.native
  sealed trait QuirksModeIssue
    extends StObject
       with InspectorIssueCode
  inline def QuirksModeIssue: QuirksModeIssue = "QuirksModeIssue".asInstanceOf[QuirksModeIssue]
  
  @js.native
  sealed trait RTCConstraintEnableDtlsSrtpFalse
    extends StObject
       with DeprecationIssueType
  inline def RTCConstraintEnableDtlsSrtpFalse: RTCConstraintEnableDtlsSrtpFalse = "RTCConstraintEnableDtlsSrtpFalse".asInstanceOf[RTCConstraintEnableDtlsSrtpFalse]
  
  @js.native
  sealed trait RTCConstraintEnableDtlsSrtpTrue
    extends StObject
       with DeprecationIssueType
  inline def RTCConstraintEnableDtlsSrtpTrue: RTCConstraintEnableDtlsSrtpTrue = "RTCConstraintEnableDtlsSrtpTrue".asInstanceOf[RTCConstraintEnableDtlsSrtpTrue]
  
  @js.native
  sealed trait RTCPeerConnectionComplexPlanBSdpUsingDefaultSdpSemantics
    extends StObject
       with DeprecationIssueType
  inline def RTCPeerConnectionComplexPlanBSdpUsingDefaultSdpSemantics: RTCPeerConnectionComplexPlanBSdpUsingDefaultSdpSemantics = "RTCPeerConnectionComplexPlanBSdpUsingDefaultSdpSemantics".asInstanceOf[RTCPeerConnectionComplexPlanBSdpUsingDefaultSdpSemantics]
  
  @js.native
  sealed trait RTCPeerConnectionSdpSemanticsPlanB
    extends StObject
       with DeprecationIssueType
  inline def RTCPeerConnectionSdpSemanticsPlanB: RTCPeerConnectionSdpSemanticsPlanB = "RTCPeerConnectionSdpSemanticsPlanB".asInstanceOf[RTCPeerConnectionSdpSemanticsPlanB]
  
  @js.native
  sealed trait RangeExpand
    extends StObject
       with DeprecationIssueType
  inline def RangeExpand: RangeExpand = "RangeExpand".asInstanceOf[RangeExpand]
  
  @js.native
  sealed trait ReadCookie
    extends StObject
       with CookieOperation
  inline def ReadCookie: ReadCookie = "ReadCookie".asInstanceOf[ReadCookie]
  
  @js.native
  sealed trait Redemption
    extends StObject
       with TrustTokenOperationType
  inline def Redemption: Redemption = "Redemption".asInstanceOf[Redemption]
  
  @js.native
  sealed trait RedirectContainsCredentials
    extends StObject
       with CorsError
  inline def RedirectContainsCredentials: RedirectContainsCredentials = "RedirectContainsCredentials".asInstanceOf[RedirectContainsCredentials]
  
  @js.native
  sealed trait Refresh
    extends StObject
       with TrustTokenParamsRefreshPolicy
  inline def Refresh: Refresh = "Refresh".asInstanceOf[Refresh]
  
  @js.native
  sealed trait RelatedActiveContentsExist
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def RelatedActiveContentsExist: RelatedActiveContentsExist = "RelatedActiveContentsExist".asInstanceOf[RelatedActiveContentsExist]
  
  @js.native
  sealed trait RenderFrameHostReused_CrossSite
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def RenderFrameHostReused_CrossSite: RenderFrameHostReused_CrossSite = "RenderFrameHostReused_CrossSite".asInstanceOf[RenderFrameHostReused_CrossSite]
  
  @js.native
  sealed trait RenderFrameHostReused_SameSite
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def RenderFrameHostReused_SameSite: RenderFrameHostReused_SameSite = "RenderFrameHostReused_SameSite".asInstanceOf[RenderFrameHostReused_SameSite]
  
  @js.native
  sealed trait RendererProcessCrashed
    extends StObject
       with BackForwardCacheNotRestoredReason
       with PrerenderFinalStatus
  inline def RendererProcessCrashed: RendererProcessCrashed = "RendererProcessCrashed".asInstanceOf[RendererProcessCrashed]
  
  @js.native
  sealed trait RendererProcessKilled
    extends StObject
       with BackForwardCacheNotRestoredReason
       with PrerenderFinalStatus
  inline def RendererProcessKilled: RendererProcessKilled = "RendererProcessKilled".asInstanceOf[RendererProcessKilled]
  
  @js.native
  sealed trait RepaintsOnScroll
    extends StObject
       with ScrollRectType
  inline def RepaintsOnScroll: RepaintsOnScroll = "RepaintsOnScroll".asInstanceOf[RepaintsOnScroll]
  
  @js.native
  sealed trait ReportEvents
    extends StObject
       with StartRequestTransferMode
  inline def ReportEvents: ReportEvents = "ReportEvents".asInstanceOf[ReportEvents]
  
  @js.native
  sealed trait Request
    extends StObject
       with InterceptionStage
       with RequestStage
  inline def Request: Request = "Request".asInstanceOf[Request]
  
  @js.native
  sealed trait RequestedAudioCapturePermission
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def RequestedAudioCapturePermission: RequestedAudioCapturePermission = "RequestedAudioCapturePermission".asInstanceOf[RequestedAudioCapturePermission]
  
  @js.native
  sealed trait RequestedBackForwardCacheBlockedSensors
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def RequestedBackForwardCacheBlockedSensors: RequestedBackForwardCacheBlockedSensors = "RequestedBackForwardCacheBlockedSensors".asInstanceOf[RequestedBackForwardCacheBlockedSensors]
  
  @js.native
  sealed trait RequestedBackgroundWorkPermission
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def RequestedBackgroundWorkPermission: RequestedBackgroundWorkPermission = "RequestedBackgroundWorkPermission".asInstanceOf[RequestedBackgroundWorkPermission]
  
  @js.native
  sealed trait RequestedMIDIPermission
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def RequestedMIDIPermission: RequestedMIDIPermission = "RequestedMIDIPermission".asInstanceOf[RequestedMIDIPermission]
  
  @js.native
  sealed trait RequestedNotificationsPermission
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def RequestedNotificationsPermission: RequestedNotificationsPermission = "RequestedNotificationsPermission".asInstanceOf[RequestedNotificationsPermission]
  
  @js.native
  sealed trait RequestedStorageAccessGrant
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def RequestedStorageAccessGrant: RequestedStorageAccessGrant = "RequestedStorageAccessGrant".asInstanceOf[RequestedStorageAccessGrant]
  
  @js.native
  sealed trait RequestedSubresourceWithEmbeddedCredentials
    extends StObject
       with DeprecationIssueType
  inline def RequestedSubresourceWithEmbeddedCredentials: RequestedSubresourceWithEmbeddedCredentials = "RequestedSubresourceWithEmbeddedCredentials".asInstanceOf[RequestedSubresourceWithEmbeddedCredentials]
  
  @js.native
  sealed trait RequestedVideoCapturePermission
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def RequestedVideoCapturePermission: RequestedVideoCapturePermission = "RequestedVideoCapturePermission".asInstanceOf[RequestedVideoCapturePermission]
  
  @js.native
  sealed trait RequireCorp
    extends StObject
       with CrossOriginEmbedderPolicyValue
  inline def RequireCorp: RequireCorp = "RequireCorp".asInstanceOf[RequireCorp]
  
  @js.native
  sealed trait Resource
    extends StObject
       with MixedContentResourceType
  inline def Resource: Resource = "Resource".asInstanceOf[Resource]
  
  @js.native
  sealed trait ResourceExhausted
    extends StObject
       with TrustTokenOperationDoneEventStatus
  inline def ResourceExhausted: ResourceExhausted = "ResourceExhausted".asInstanceOf[ResourceExhausted]
  
  @js.native
  sealed trait Response
    extends StObject
       with RequestStage
  inline def Response: Response = "Response".asInstanceOf[Response]
  
  @js.native
  sealed trait RestrictProperties
    extends StObject
       with CrossOriginOpenerPolicyValue
  inline def RestrictProperties: RestrictProperties = "RestrictProperties".asInstanceOf[RestrictProperties]
  
  @js.native
  sealed trait RestrictPropertiesPlusCoep
    extends StObject
       with CrossOriginOpenerPolicyValue
  inline def RestrictPropertiesPlusCoep: RestrictPropertiesPlusCoep = "RestrictPropertiesPlusCoep".asInstanceOf[RestrictPropertiesPlusCoep]
  
  @js.native
  sealed trait ReturnAsBase64
    extends StObject
       with PrintToPDFRequestTransferMode
  inline def ReturnAsBase64: ReturnAsBase64 = "ReturnAsBase64".asInstanceOf[ReturnAsBase64]
  
  @js.native
  sealed trait ReturnAsStream
    extends StObject
       with PrintToPDFRequestTransferMode
       with StartRequestTransferMode
  inline def ReturnAsStream: ReturnAsStream = "ReturnAsStream".asInstanceOf[ReturnAsStream]
  
  @js.native
  sealed trait RpPageNotVisible
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def RpPageNotVisible: RpPageNotVisible = "RpPageNotVisible".asInstanceOf[RpPageNotVisible]
  
  @js.native
  sealed trait RtcpMuxPolicyNegotiate
    extends StObject
       with DeprecationIssueType
  inline def RtcpMuxPolicyNegotiate: RtcpMuxPolicyNegotiate = "RtcpMuxPolicyNegotiate".asInstanceOf[RtcpMuxPolicyNegotiate]
  
  @js.native
  sealed trait SameOrigin
    extends StObject
       with CrossOriginOpenerPolicyValue
  inline def SameOrigin: SameOrigin = "SameOrigin".asInstanceOf[SameOrigin]
  
  @js.native
  sealed trait SameOriginAllowPopups
    extends StObject
       with CrossOriginOpenerPolicyValue
  inline def SameOriginAllowPopups: SameOriginAllowPopups = "SameOriginAllowPopups".asInstanceOf[SameOriginAllowPopups]
  
  @js.native
  sealed trait SameOriginPlusCoep
    extends StObject
       with CrossOriginOpenerPolicyValue
  inline def SameOriginPlusCoep: SameOriginPlusCoep = "SameOriginPlusCoep".asInstanceOf[SameOriginPlusCoep]
  
  @js.native
  sealed trait SamePartyConflictsWithOtherAttributes
    extends StObject
       with SetCookieBlockedReason
  inline def SamePartyConflictsWithOtherAttributes: SamePartyConflictsWithOtherAttributes = "SamePartyConflictsWithOtherAttributes".asInstanceOf[SamePartyConflictsWithOtherAttributes]
  
  @js.native
  sealed trait SamePartyFromCrossPartyContext
    extends StObject
       with CookieBlockedReason
       with SetCookieBlockedReason
  inline def SamePartyFromCrossPartyContext: SamePartyFromCrossPartyContext = "SamePartyFromCrossPartyContext".asInstanceOf[SamePartyFromCrossPartyContext]
  
  @js.native
  sealed trait SameSiteLax
    extends StObject
       with CookieBlockedReason
       with SetCookieBlockedReason
  inline def SameSiteLax: SameSiteLax = "SameSiteLax".asInstanceOf[SameSiteLax]
  
  @js.native
  sealed trait SameSiteNoneInsecure
    extends StObject
       with CookieBlockedReason
       with SetCookieBlockedReason
  inline def SameSiteNoneInsecure: SameSiteNoneInsecure = "SameSiteNoneInsecure".asInstanceOf[SameSiteNoneInsecure]
  
  @js.native
  sealed trait SameSiteStrict
    extends StObject
       with CookieBlockedReason
       with SetCookieBlockedReason
  inline def SameSiteStrict: SameSiteStrict = "SameSiteStrict".asInstanceOf[SameSiteStrict]
  
  @js.native
  sealed trait SameSiteUnspecifiedTreatedAsLax
    extends StObject
       with CookieBlockedReason
       with SetCookieBlockedReason
  inline def SameSiteUnspecifiedTreatedAsLax: SameSiteUnspecifiedTreatedAsLax = "SameSiteUnspecifiedTreatedAsLax".asInstanceOf[SameSiteUnspecifiedTreatedAsLax]
  
  @js.native
  sealed trait SchedulerTrackedFeatureUsed
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def SchedulerTrackedFeatureUsed: SchedulerTrackedFeatureUsed = "SchedulerTrackedFeatureUsed".asInstanceOf[SchedulerTrackedFeatureUsed]
  
  @js.native
  sealed trait SchemeNotHTTPOrHTTPS
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def SchemeNotHTTPOrHTTPS: SchemeNotHTTPOrHTTPS = "SchemeNotHTTPOrHTTPS".asInstanceOf[SchemeNotHTTPOrHTTPS]
  
  @js.native
  sealed trait SchemeNotSupported
    extends StObject
       with SetCookieBlockedReason
  inline def SchemeNotSupported: SchemeNotSupported = "SchemeNotSupported".asInstanceOf[SchemeNotSupported]
  
  @js.native
  sealed trait SchemefulSameSiteLax
    extends StObject
       with CookieBlockedReason
       with SetCookieBlockedReason
  inline def SchemefulSameSiteLax: SchemefulSameSiteLax = "SchemefulSameSiteLax".asInstanceOf[SchemefulSameSiteLax]
  
  @js.native
  sealed trait SchemefulSameSiteStrict
    extends StObject
       with CookieBlockedReason
       with SetCookieBlockedReason
  inline def SchemefulSameSiteStrict: SchemefulSameSiteStrict = "SchemefulSameSiteStrict".asInstanceOf[SchemefulSameSiteStrict]
  
  @js.native
  sealed trait SchemefulSameSiteUnspecifiedTreatedAsLax
    extends StObject
       with CookieBlockedReason
       with SetCookieBlockedReason
  inline def SchemefulSameSiteUnspecifiedTreatedAsLax: SchemefulSameSiteUnspecifiedTreatedAsLax = "SchemefulSameSiteUnspecifiedTreatedAsLax".asInstanceOf[SchemefulSameSiteUnspecifiedTreatedAsLax]
  
  @js.native
  sealed trait Script
    extends StObject
       with MixedContentResourceType
       with ResourceType
  inline def Script: Script = "Script".asInstanceOf[Script]
  
  @js.native
  sealed trait Secure
    extends StObject
       with CookieSourceScheme
       with SecureContextType
  inline def Secure: Secure = "Secure".asInstanceOf[Secure]
  
  @js.native
  sealed trait SecureLocalhost
    extends StObject
       with SecureContextType
  inline def SecureLocalhost: SecureLocalhost = "SecureLocalhost".asInstanceOf[SecureLocalhost]
  
  @js.native
  sealed trait SecureOnly
    extends StObject
       with CookieBlockedReason
       with SetCookieBlockedReason
  inline def SecureOnly: SecureOnly = "SecureOnly".asInstanceOf[SecureOnly]
  
  @js.native
  sealed trait Server
    extends StObject
       with AuthChallengeSource
       with typings.devtoolsProtocol.mod.Protocol.Fetch.AuthChallengeSource
  inline def Server: Server = "Server".asInstanceOf[Server]
  
  @js.native
  sealed trait ServiceWorker
    extends StObject
       with MixedContentResourceType
  inline def ServiceWorker: ServiceWorker = "ServiceWorker".asInstanceOf[ServiceWorker]
  
  @js.native
  sealed trait ServiceWorkerClaim
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def ServiceWorkerClaim: ServiceWorkerClaim = "ServiceWorkerClaim".asInstanceOf[ServiceWorkerClaim]
  
  @js.native
  sealed trait ServiceWorkerPostMessage
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def ServiceWorkerPostMessage: ServiceWorkerPostMessage = "ServiceWorkerPostMessage".asInstanceOf[ServiceWorkerPostMessage]
  
  @js.native
  sealed trait ServiceWorkerUnregistration
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def ServiceWorkerUnregistration: ServiceWorkerUnregistration = "ServiceWorkerUnregistration".asInstanceOf[ServiceWorkerUnregistration]
  
  @js.native
  sealed trait ServiceWorkerVersionActivation
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def ServiceWorkerVersionActivation: ServiceWorkerVersionActivation = "ServiceWorkerVersionActivation".asInstanceOf[ServiceWorkerVersionActivation]
  
  @js.native
  sealed trait SessionRestored
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def SessionRestored: SessionRestored = "SessionRestored".asInstanceOf[SessionRestored]
  
  @js.native
  sealed trait SetCookie
    extends StObject
       with CookieOperation
  inline def SetCookie: SetCookie = "SetCookie".asInstanceOf[SetCookie]
  
  @js.native
  sealed trait SharedArrayBufferConstructedWithoutIsolation
    extends StObject
       with DeprecationIssueType
  inline def SharedArrayBufferConstructedWithoutIsolation: SharedArrayBufferConstructedWithoutIsolation = "SharedArrayBufferConstructedWithoutIsolation".asInstanceOf[SharedArrayBufferConstructedWithoutIsolation]
  
  @js.native
  sealed trait SharedArrayBufferIssue
    extends StObject
       with InspectorIssueCode
  inline def SharedArrayBufferIssue: SharedArrayBufferIssue = "SharedArrayBufferIssue".asInstanceOf[SharedArrayBufferIssue]
  
  @js.native
  sealed trait SharedArrayBuffers
    extends StObject
       with GatedAPIFeatures
  inline def SharedArrayBuffers: SharedArrayBuffers = "SharedArrayBuffers".asInstanceOf[SharedArrayBuffers]
  
  @js.native
  sealed trait SharedArrayBuffersTransferAllowed
    extends StObject
       with GatedAPIFeatures
  inline def SharedArrayBuffersTransferAllowed: SharedArrayBuffersTransferAllowed = "SharedArrayBuffersTransferAllowed".asInstanceOf[SharedArrayBuffersTransferAllowed]
  
  @js.native
  sealed trait SharedWorker
    extends StObject
       with BackForwardCacheNotRestoredReason
       with MixedContentResourceType
  inline def SharedWorker: SharedWorker = "SharedWorker".asInstanceOf[SharedWorker]
  
  @js.native
  sealed trait ShouldEmbargo
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def ShouldEmbargo: ShouldEmbargo = "ShouldEmbargo".asInstanceOf[ShouldEmbargo]
  
  @js.native
  sealed trait SignedExchange
    extends StObject
       with InitiatorType
       with ResourceType
  inline def SignedExchange: SignedExchange = "SignedExchange".asInstanceOf[SignedExchange]
  
  @js.native
  sealed trait Signing
    extends StObject
       with TrustTokenOperationType
  inline def Signing: Signing = "Signing".asInstanceOf[Signing]
  
  @js.native
  sealed trait SourceAndTriggerHeaders
    extends StObject
       with AttributionReportingIssueType
  inline def SourceAndTriggerHeaders: SourceAndTriggerHeaders = "SourceAndTriggerHeaders".asInstanceOf[SourceAndTriggerHeaders]
  
  @js.native
  sealed trait SourceIgnored
    extends StObject
       with AttributionReportingIssueType
  inline def SourceIgnored: SourceIgnored = "SourceIgnored".asInstanceOf[SourceIgnored]
  
  @js.native
  sealed trait SourceMap
    extends StObject
       with DebugSymbolsType
  inline def SourceMap: SourceMap = "SourceMap".asInstanceOf[SourceMap]
  
  @js.native
  sealed trait SpeechRecognizer
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def SpeechRecognizer: SpeechRecognizer = "SpeechRecognizer".asInstanceOf[SpeechRecognizer]
  
  @js.native
  sealed trait SpeechSynthesis
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def SpeechSynthesis: SpeechSynthesis = "SpeechSynthesis".asInstanceOf[SpeechSynthesis]
  
  @js.native
  sealed trait SslCertificateError
    extends StObject
       with PrerenderFinalStatus
  inline def SslCertificateError: SslCertificateError = "SslCertificateError".asInstanceOf[SslCertificateError]
  
  @js.native
  sealed trait StartFailed
    extends StObject
       with PrerenderFinalStatus
  inline def StartFailed: StartFailed = "StartFailed".asInstanceOf[StartFailed]
  
  @js.native
  sealed trait StepInto extends StObject
  inline def StepInto: StepInto = "StepInto".asInstanceOf[StepInto]
  
  @js.native
  sealed trait Stop
    extends StObject
       with PrerenderFinalStatus
  inline def Stop: Stop = "Stop".asInstanceOf[Stop]
  
  @js.native
  sealed trait Strict
    extends StObject
       with CookieSameSite
  inline def Strict: Strict = "Strict".asInstanceOf[Strict]
  
  @js.native
  sealed trait Stylesheet
    extends StObject
       with MixedContentResourceType
       with ResourceType
  inline def Stylesheet: Stylesheet = "Stylesheet".asInstanceOf[Stylesheet]
  
  @js.native
  sealed trait SubframeIsNavigating
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def SubframeIsNavigating: SubframeIsNavigating = "SubframeIsNavigating".asInstanceOf[SubframeIsNavigating]
  
  @js.native
  sealed trait SubresourceHasCacheControlNoCache
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def SubresourceHasCacheControlNoCache: SubresourceHasCacheControlNoCache = "SubresourceHasCacheControlNoCache".asInstanceOf[SubresourceHasCacheControlNoCache]
  
  @js.native
  sealed trait SubresourceHasCacheControlNoStore
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def SubresourceHasCacheControlNoStore: SubresourceHasCacheControlNoStore = "SubresourceHasCacheControlNoStore".asInstanceOf[SubresourceHasCacheControlNoStore]
  
  @js.native
  sealed trait Subset
    extends StObject
       with OriginTrialUsageRestriction
  inline def Subset: Subset = "Subset".asInstanceOf[Subset]
  
  @js.native
  sealed trait Success
    extends StObject
       with OriginTrialTokenStatus
       with ReportStatus
  inline def Success: Success = "Success".asInstanceOf[Success]
  
  @js.native
  sealed trait SupportPending
    extends StObject
       with BackForwardCacheNotRestoredReasonType
  inline def SupportPending: SupportPending = "SupportPending".asInstanceOf[SupportPending]
  
  @js.native
  sealed trait SyntaxError
    extends StObject
       with SetCookieBlockedReason
  inline def SyntaxError: SyntaxError = "SyntaxError".asInstanceOf[SyntaxError]
  
  @js.native
  sealed trait TextToSpeech_DisallowedByAutoplay
    extends StObject
       with DeprecationIssueType
  inline def TextToSpeech_DisallowedByAutoplay: TextToSpeech_DisallowedByAutoplay = "TextToSpeech_DisallowedByAutoplay".asInstanceOf[TextToSpeech_DisallowedByAutoplay]
  
  @js.native
  sealed trait TextTrack
    extends StObject
       with ResourceType
  inline def TextTrack: TextTrack = "TextTrack".asInstanceOf[TextTrack]
  
  @js.native
  sealed trait TimedOut
    extends StObject
       with ErrorReason
  inline def TimedOut: TimedOut = "TimedOut".asInstanceOf[TimedOut]
  
  @js.native
  sealed trait Timeout
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def Timeout: Timeout = "Timeout".asInstanceOf[Timeout]
  
  @js.native
  sealed trait TimeoutBackgrounded
    extends StObject
       with PrerenderFinalStatus
  inline def TimeoutBackgrounded: TimeoutBackgrounded = "TimeoutBackgrounded".asInstanceOf[TimeoutBackgrounded]
  
  @js.native
  sealed trait TimeoutPuttingInCache
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def TimeoutPuttingInCache: TimeoutPuttingInCache = "TimeoutPuttingInCache".asInstanceOf[TimeoutPuttingInCache]
  
  @js.native
  sealed trait TokenDisabled
    extends StObject
       with OriginTrialTokenStatus
  inline def TokenDisabled: TokenDisabled = "TokenDisabled".asInstanceOf[TokenDisabled]
  
  @js.native
  sealed trait TooManyConcurrentRequests
    extends StObject
       with AttributionReportingIssueType
  inline def TooManyConcurrentRequests: TooManyConcurrentRequests = "TooManyConcurrentRequests".asInstanceOf[TooManyConcurrentRequests]
  
  @js.native
  sealed trait TooManyRequests
    extends StObject
       with FederatedAuthRequestIssueReason
  inline def TooManyRequests: TooManyRequests = "TooManyRequests".asInstanceOf[TooManyRequests]
  
  @js.native
  sealed trait TouchEventHandler
    extends StObject
       with ScrollRectType
  inline def TouchEventHandler: TouchEventHandler = "TouchEventHandler".asInstanceOf[TouchEventHandler]
  
  @js.native
  sealed trait Track
    extends StObject
       with MixedContentResourceType
  inline def Track: Track = "Track".asInstanceOf[Track]
  
  @js.native
  sealed trait TransferIssue
    extends StObject
       with SharedArrayBufferIssueType
  inline def TransferIssue: TransferIssue = "TransferIssue".asInstanceOf[TransferIssue]
  
  @js.native
  sealed trait TrialNotAllowed
    extends StObject
       with OriginTrialStatus
  inline def TrialNotAllowed: TrialNotAllowed = "TrialNotAllowed".asInstanceOf[TrialNotAllowed]
  
  @js.native
  sealed trait TriggerBackgrounded
    extends StObject
       with PrerenderFinalStatus
  inline def TriggerBackgrounded: TriggerBackgrounded = "TriggerBackgrounded".asInstanceOf[TriggerBackgrounded]
  
  @js.native
  sealed trait TriggerDestroyed
    extends StObject
       with PrerenderFinalStatus
  inline def TriggerDestroyed: TriggerDestroyed = "TriggerDestroyed".asInstanceOf[TriggerDestroyed]
  
  @js.native
  sealed trait TriggerIgnored
    extends StObject
       with AttributionReportingIssueType
  inline def TriggerIgnored: TriggerIgnored = "TriggerIgnored".asInstanceOf[TriggerIgnored]
  
  @js.native
  sealed trait TrustedWebActivityIssue
    extends StObject
       with InspectorIssueCode
  inline def TrustedWebActivityIssue: TrustedWebActivityIssue = "TrustedWebActivityIssue".asInstanceOf[TrustedWebActivityIssue]
  
  @js.native
  sealed trait UaChangeRequiresReload
    extends StObject
       with PrerenderFinalStatus
  inline def UaChangeRequiresReload: UaChangeRequiresReload = "UaChangeRequiresReload".asInstanceOf[UaChangeRequiresReload]
  
  @js.native
  sealed trait Unavailable
    extends StObject
       with TrustTokenOperationDoneEventStatus
  inline def Unavailable: Unavailable = "Unavailable".asInstanceOf[Unavailable]
  
  @js.native
  sealed trait UnexpectedPrivateNetworkAccess
    extends StObject
       with CorsError
  inline def UnexpectedPrivateNetworkAccess: UnexpectedPrivateNetworkAccess = "UnexpectedPrivateNetworkAccess".asInstanceOf[UnexpectedPrivateNetworkAccess]
  
  @js.native
  sealed trait Unknown
    extends StObject
       with BackForwardCacheNotRestoredReason
       with IPAddressSpace
  inline def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  
  @js.native
  sealed trait UnknownError
    extends StObject
       with CookieBlockedReason
       with SetCookieBlockedReason
       with TrustTokenOperationDoneEventStatus
  inline def UnknownError: UnknownError = "UnknownError".asInstanceOf[UnknownError]
  
  @js.native
  sealed trait UnknownTrial
    extends StObject
       with OriginTrialTokenStatus
  inline def UnknownTrial: UnknownTrial = "UnknownTrial".asInstanceOf[UnknownTrial]
  
  @js.native
  sealed trait UnloadHandlerExistsInMainFrame
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def UnloadHandlerExistsInMainFrame: UnloadHandlerExistsInMainFrame = "UnloadHandlerExistsInMainFrame".asInstanceOf[UnloadHandlerExistsInMainFrame]
  
  @js.native
  sealed trait UnloadHandlerExistsInSubFrame
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def UnloadHandlerExistsInSubFrame: UnloadHandlerExistsInSubFrame = "UnloadHandlerExistsInSubFrame".asInstanceOf[UnloadHandlerExistsInSubFrame]
  
  @js.native
  sealed trait UnsafeNone
    extends StObject
       with CrossOriginOpenerPolicyValue
  inline def UnsafeNone: UnsafeNone = "UnsafeNone".asInstanceOf[UnsafeNone]
  
  @js.native
  sealed trait Unset
    extends StObject
       with CookieSourceScheme
  inline def Unset: Unset = "Unset".asInstanceOf[Unset]
  
  @js.native
  sealed trait UntrustworthyReportingOrigin
    extends StObject
       with AttributionReportingIssueType
  inline def UntrustworthyReportingOrigin: UntrustworthyReportingOrigin = "UntrustworthyReportingOrigin".asInstanceOf[UntrustworthyReportingOrigin]
  
  @js.native
  sealed trait UseCached
    extends StObject
       with TrustTokenParamsRefreshPolicy
  inline def UseCached: UseCached = "UseCached".asInstanceOf[UseCached]
  
  @js.native
  sealed trait UserAgentOverrideDiffers
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def UserAgentOverrideDiffers: UserAgentOverrideDiffers = "UserAgentOverrideDiffers".asInstanceOf[UserAgentOverrideDiffers]
  
  @js.native
  sealed trait UserPreferences
    extends StObject
       with CookieBlockedReason
       with SetCookieBlockedReason
  inline def UserPreferences: UserPreferences = "UserPreferences".asInstanceOf[UserPreferences]
  
  @js.native
  sealed trait V8SharedArrayBufferConstructedInExtensionWithoutIsolation
    extends StObject
       with DeprecationIssueType
  inline def V8SharedArrayBufferConstructedInExtensionWithoutIsolation: V8SharedArrayBufferConstructedInExtensionWithoutIsolation = "V8SharedArrayBufferConstructedInExtensionWithoutIsolation".asInstanceOf[V8SharedArrayBufferConstructedInExtensionWithoutIsolation]
  
  @js.native
  sealed trait ValidTokenNotProvided
    extends StObject
       with OriginTrialStatus
  inline def ValidTokenNotProvided: ValidTokenNotProvided = "ValidTokenNotProvided".asInstanceOf[ValidTokenNotProvided]
  
  @js.native
  sealed trait VeryHigh
    extends StObject
       with ResourcePriority
  inline def VeryHigh: VeryHigh = "VeryHigh".asInstanceOf[VeryHigh]
  
  @js.native
  sealed trait VeryLow
    extends StObject
       with ResourcePriority
  inline def VeryLow: VeryLow = "VeryLow".asInstanceOf[VeryLow]
  
  @js.native
  sealed trait Video
    extends StObject
       with MixedContentResourceType
  inline def Video: Video = "Video".asInstanceOf[Video]
  
  @js.native
  sealed trait WarnAttributeValueExceedsMaxSize
    extends StObject
       with CookieWarningReason
  inline def WarnAttributeValueExceedsMaxSize: WarnAttributeValueExceedsMaxSize = "WarnAttributeValueExceedsMaxSize".asInstanceOf[WarnAttributeValueExceedsMaxSize]
  
  @js.native
  sealed trait WarnDomainNonASCII
    extends StObject
       with CookieWarningReason
  inline def WarnDomainNonASCII: WarnDomainNonASCII = "WarnDomainNonASCII".asInstanceOf[WarnDomainNonASCII]
  
  @js.native
  sealed trait WarnFromInsecureToMorePrivate
    extends StObject
       with PrivateNetworkRequestPolicy
  inline def WarnFromInsecureToMorePrivate: WarnFromInsecureToMorePrivate = "WarnFromInsecureToMorePrivate".asInstanceOf[WarnFromInsecureToMorePrivate]
  
  @js.native
  sealed trait WarnSameSiteLaxCrossDowngradeLax
    extends StObject
       with CookieWarningReason
  inline def WarnSameSiteLaxCrossDowngradeLax: WarnSameSiteLaxCrossDowngradeLax = "WarnSameSiteLaxCrossDowngradeLax".asInstanceOf[WarnSameSiteLaxCrossDowngradeLax]
  
  @js.native
  sealed trait WarnSameSiteLaxCrossDowngradeStrict
    extends StObject
       with CookieWarningReason
  inline def WarnSameSiteLaxCrossDowngradeStrict: WarnSameSiteLaxCrossDowngradeStrict = "WarnSameSiteLaxCrossDowngradeStrict".asInstanceOf[WarnSameSiteLaxCrossDowngradeStrict]
  
  @js.native
  sealed trait WarnSameSiteNoneInsecure
    extends StObject
       with CookieWarningReason
  inline def WarnSameSiteNoneInsecure: WarnSameSiteNoneInsecure = "WarnSameSiteNoneInsecure".asInstanceOf[WarnSameSiteNoneInsecure]
  
  @js.native
  sealed trait WarnSameSiteStrictCrossDowngradeLax
    extends StObject
       with CookieWarningReason
  inline def WarnSameSiteStrictCrossDowngradeLax: WarnSameSiteStrictCrossDowngradeLax = "WarnSameSiteStrictCrossDowngradeLax".asInstanceOf[WarnSameSiteStrictCrossDowngradeLax]
  
  @js.native
  sealed trait WarnSameSiteStrictCrossDowngradeStrict
    extends StObject
       with CookieWarningReason
  inline def WarnSameSiteStrictCrossDowngradeStrict: WarnSameSiteStrictCrossDowngradeStrict = "WarnSameSiteStrictCrossDowngradeStrict".asInstanceOf[WarnSameSiteStrictCrossDowngradeStrict]
  
  @js.native
  sealed trait WarnSameSiteStrictLaxDowngradeStrict
    extends StObject
       with CookieWarningReason
  inline def WarnSameSiteStrictLaxDowngradeStrict: WarnSameSiteStrictLaxDowngradeStrict = "WarnSameSiteStrictLaxDowngradeStrict".asInstanceOf[WarnSameSiteStrictLaxDowngradeStrict]
  
  @js.native
  sealed trait WarnSameSiteUnspecifiedCrossSiteContext
    extends StObject
       with CookieWarningReason
  inline def WarnSameSiteUnspecifiedCrossSiteContext: WarnSameSiteUnspecifiedCrossSiteContext = "WarnSameSiteUnspecifiedCrossSiteContext".asInstanceOf[WarnSameSiteUnspecifiedCrossSiteContext]
  
  @js.native
  sealed trait WarnSameSiteUnspecifiedLaxAllowUnsafe
    extends StObject
       with CookieWarningReason
  inline def WarnSameSiteUnspecifiedLaxAllowUnsafe: WarnSameSiteUnspecifiedLaxAllowUnsafe = "WarnSameSiteUnspecifiedLaxAllowUnsafe".asInstanceOf[WarnSameSiteUnspecifiedLaxAllowUnsafe]
  
  @js.native
  sealed trait WasGrantedMediaAccess
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def WasGrantedMediaAccess: WasGrantedMediaAccess = "WasGrantedMediaAccess".asInstanceOf[WasGrantedMediaAccess]
  
  @js.native
  sealed trait WebAnimation
    extends StObject
       with AnimationType
  inline def WebAnimation: WebAnimation = "WebAnimation".asInstanceOf[WebAnimation]
  
  @js.native
  sealed trait WebAssembly
    extends StObject
       with ScriptLanguage
  inline def WebAssembly: WebAssembly = "WebAssembly".asInstanceOf[WebAssembly]
  
  @js.native
  sealed trait WebDatabase
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def WebDatabase: WebDatabase = "WebDatabase".asInstanceOf[WebDatabase]
  
  @js.native
  sealed trait WebHID
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def WebHID: WebHID = "WebHID".asInstanceOf[WebHID]
  
  @js.native
  sealed trait WebLocks
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def WebLocks: WebLocks = "WebLocks".asInstanceOf[WebLocks]
  
  @js.native
  sealed trait WebNfc
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def WebNfc: WebNfc = "WebNfc".asInstanceOf[WebNfc]
  
  @js.native
  sealed trait WebOTPService
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def WebOTPService: WebOTPService = "WebOTPService".asInstanceOf[WebOTPService]
  
  @js.native
  sealed trait WebRTC
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def WebRTC: WebRTC = "WebRTC".asInstanceOf[WebRTC]
  
  @js.native
  sealed trait WebShare
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def WebShare: WebShare = "WebShare".asInstanceOf[WebShare]
  
  @js.native
  sealed trait WebSocket
    extends StObject
       with BackForwardCacheNotRestoredReason
       with ResourceType
  inline def WebSocket: WebSocket = "WebSocket".asInstanceOf[WebSocket]
  
  @js.native
  sealed trait WebTransport
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def WebTransport: WebTransport = "WebTransport".asInstanceOf[WebTransport]
  
  @js.native
  sealed trait WebXR
    extends StObject
       with BackForwardCacheNotRestoredReason
  inline def WebXR: WebXR = "WebXR".asInstanceOf[WebXR]
  
  @js.native
  sealed trait WheelEventHandler
    extends StObject
       with ScrollRectType
  inline def WheelEventHandler: WheelEventHandler = "WheelEventHandler".asInstanceOf[WheelEventHandler]
  
  @js.native
  sealed trait WildcardOriginNotAllowed
    extends StObject
       with CorsError
  inline def WildcardOriginNotAllowed: WildcardOriginNotAllowed = "WildcardOriginNotAllowed".asInstanceOf[WildcardOriginNotAllowed]
  
  @js.native
  sealed trait Worker
    extends StObject
       with MixedContentResourceType
  inline def Worker: Worker = "Worker".asInstanceOf[Worker]
  
  @js.native
  sealed trait WrongOrigin
    extends StObject
       with OriginTrialTokenStatus
  inline def WrongOrigin: WrongOrigin = "WrongOrigin".asInstanceOf[WrongOrigin]
  
  @js.native
  sealed trait WrongVersion
    extends StObject
       with OriginTrialTokenStatus
  inline def WrongVersion: WrongVersion = "WrongVersion".asInstanceOf[WrongVersion]
  
  @js.native
  sealed trait XHR
    extends StObject
       with PausedEventReason
       with ResourceType
  inline def XHR: XHR = "XHR".asInstanceOf[XHR]
  
  @js.native
  sealed trait XHRJSONEncodingDetection
    extends StObject
       with DeprecationIssueType
  inline def XHRJSONEncodingDetection: XHRJSONEncodingDetection = "XHRJSONEncodingDetection".asInstanceOf[XHRJSONEncodingDetection]
  
  @js.native
  sealed trait XMLHttpRequest
    extends StObject
       with MixedContentResourceType
  inline def XMLHttpRequest: XMLHttpRequest = "XMLHttpRequest".asInstanceOf[XMLHttpRequest]
  
  @js.native
  sealed trait XMLHttpRequestSynchronousInNonWorkerOutsideBeforeUnload
    extends StObject
       with DeprecationIssueType
  inline def XMLHttpRequestSynchronousInNonWorkerOutsideBeforeUnload: XMLHttpRequestSynchronousInNonWorkerOutsideBeforeUnload = "XMLHttpRequestSynchronousInNonWorkerOutsideBeforeUnload".asInstanceOf[XMLHttpRequestSynchronousInNonWorkerOutsideBeforeUnload]
  
  @js.native
  sealed trait XRSupportsSession
    extends StObject
       with DeprecationIssueType
  inline def XRSupportsSession: XRSupportsSession = "XRSupportsSession".asInstanceOf[XRSupportsSession]
  
  @js.native
  sealed trait XSLT
    extends StObject
       with MixedContentResourceType
  inline def XSLT: XSLT = "XSLT".asInstanceOf[XSLT]
  
  @js.native
  sealed trait `a-rate`
    extends StObject
       with AutomationRate
  inline def `a-rate`: `a-rate` = "a-rate".asInstanceOf[`a-rate`]
  
  @js.native
  sealed trait aa
    extends StObject
       with ContrastAlgorithm
  inline def aa: aa = "aa".asInstanceOf[aa]
  
  @js.native
  sealed trait aaa
    extends StObject
       with ContrastAlgorithm
  inline def aaa: aaa = "aaa".asInstanceOf[aaa]
  
  @js.native
  sealed trait accelerometer
    extends StObject
       with PermissionsPolicyFeature
  inline def accelerometer: accelerometer = "accelerometer".asInstanceOf[accelerometer]
  
  @js.native
  sealed trait accepted extends StObject
  inline def accepted: accepted = "accepted".asInstanceOf[accepted]
  
  @js.native
  sealed trait accessibilityEvents
    extends StObject
       with PermissionType
  inline def accessibilityEvents: accessibilityEvents = "accessibilityEvents".asInstanceOf[accessibilityEvents]
  
  @js.native
  sealed trait accessor
    extends StObject
       with PropertyPreviewType
  inline def accessor: accessor = "accessor".asInstanceOf[accessor]
  
  @js.native
  sealed trait achromatopsia
    extends StObject
       with SetEmulatedVisionDeficiencyRequestType
  inline def achromatopsia: achromatopsia = "achromatopsia".asInstanceOf[achromatopsia]
  
  @js.native
  sealed trait activated_
    extends StObject
       with ServiceWorkerVersionStatus
  inline def activated_ : activated_ = "activated".asInstanceOf[activated_]
  
  @js.native
  sealed trait activating
    extends StObject
       with ServiceWorkerVersionStatus
  inline def activating: activating = "activating".asInstanceOf[activating]
  
  @js.native
  sealed trait active
    extends StObject
       with SetWebLifecycleStateRequestState
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait activedescendant
    extends StObject
       with AXPropertyName
  inline def activedescendant: activedescendant = "activedescendant".asInstanceOf[activedescendant]
  
  @js.native
  sealed trait addDatabase extends StObject
  inline def addDatabase: addDatabase = "addDatabase".asInstanceOf[addDatabase]
  
  @js.native
  sealed trait addHeapSnapshotChunk extends StObject
  inline def addHeapSnapshotChunk: addHeapSnapshotChunk = "addHeapSnapshotChunk".asInstanceOf[addHeapSnapshotChunk]
  
  @js.native
  sealed trait address_bar
    extends StObject
       with TransitionType
  inline def address_bar: address_bar = "address_bar".asInstanceOf[address_bar]
  
  @js.native
  sealed trait advance
    extends StObject
       with VirtualTimePolicy
  inline def advance: advance = "advance".asInstanceOf[advance]
  
  @js.native
  sealed trait after
    extends StObject
       with PseudoType
  inline def after: after = "after".asInstanceOf[after]
  
  @js.native
  sealed trait alert
    extends StObject
       with DialogType
  inline def alert: alert = "alert".asInstanceOf[alert]
  
  @js.native
  sealed trait all
    extends StObject
       with EnableRequestIncludeWhitespace
       with SetPauseOnExceptionsRequestState
       with StorageType
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait allowAndName
    extends StObject
       with SetDownloadBehaviorRequestBehavior
  inline def allowAndName: allowAndName = "allowAndName".asInstanceOf[allowAndName]
  
  @js.native
  sealed trait allow_
    extends StObject
       with typings.devtoolsProtocol.mod.Protocol.Page.SetDownloadBehaviorRequestBehavior
       with SetDownloadBehaviorRequestBehavior
  inline def allow_ : allow_ = "allow".asInstanceOf[allow_]
  
  @js.native
  sealed trait alternativeJobWonRace
    extends StObject
       with AlternateProtocolUsage
  inline def alternativeJobWonRace: alternativeJobWonRace = "alternativeJobWonRace".asInstanceOf[alternativeJobWonRace]
  
  @js.native
  sealed trait alternativeJobWonWithoutRace
    extends StObject
       with AlternateProtocolUsage
  inline def alternativeJobWonWithoutRace: alternativeJobWonWithoutRace = "alternativeJobWonWithoutRace".asInstanceOf[alternativeJobWonWithoutRace]
  
  @js.native
  sealed trait `ambient-light-sensor`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ambient-light-sensor`: `ambient-light-sensor` = "ambient-light-sensor".asInstanceOf[`ambient-light-sensor`]
  
  @js.native
  sealed trait ambiguous
    extends StObject
       with PausedEventReason
  inline def ambiguous: ambiguous = "ambiguous".asInstanceOf[ambiguous]
  
  @js.native
  sealed trait anchorClick
    extends StObject
       with ClientNavigationReason
  inline def anchorClick: anchorClick = "anchorClick".asInstanceOf[anchorClick]
  
  @js.native
  sealed trait animationCanceled extends StObject
  inline def animationCanceled: animationCanceled = "animationCanceled".asInstanceOf[animationCanceled]
  
  @js.native
  sealed trait animationCreated extends StObject
  inline def animationCreated: animationCreated = "animationCreated".asInstanceOf[animationCreated]
  
  @js.native
  sealed trait animationStarted extends StObject
  inline def animationStarted: animationStarted = "animationStarted".asInstanceOf[animationStarted]
  
  @js.native
  sealed trait any
    extends StObject
       with ContinueToLocationRequestTargetCallFrames
  inline def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait apca
    extends StObject
       with ContrastAlgorithm
  inline def apca: apca = "apca".asInstanceOf[apca]
  
  @js.native
  sealed trait appcache
    extends StObject
       with ConsoleMessageSource
       with LogEntrySource
       with StorageType
  inline def appcache: appcache = "appcache".asInstanceOf[appcache]
  
  @js.native
  sealed trait array
    extends StObject
       with KeyPathType
       with KeyType
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
       with WebDriverValueType
  inline def array: array = "array".asInstanceOf[array]
  
  @js.native
  sealed trait arraybuffer
    extends StObject
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
       with WebDriverValueType
  inline def arraybuffer: arraybuffer = "arraybuffer".asInstanceOf[arraybuffer]
  
  @js.native
  sealed trait assert
    extends StObject
       with ConsoleAPICalledEventType
       with PausedEventReason
  inline def assert: assert = "assert".asInstanceOf[assert]
  
  @js.native
  sealed trait atomic
    extends StObject
       with AXPropertyName
  inline def atomic: atomic = "atomic".asInstanceOf[atomic]
  
  @js.native
  sealed trait attachedToTarget extends StObject
  inline def attachedToTarget: attachedToTarget = "attachedToTarget".asInstanceOf[attachedToTarget]
  
  @js.native
  sealed trait attribute
    extends StObject
       with AXValueSourceType
  inline def attribute: attribute = "attribute".asInstanceOf[attribute]
  
  @js.native
  sealed trait `attribute-modified`
    extends StObject
       with DOMBreakpointType
  inline def `attribute-modified`: `attribute-modified` = "attribute-modified".asInstanceOf[`attribute-modified`]
  
  @js.native
  sealed trait attributeModified extends StObject
  inline def attributeModified: attributeModified = "attributeModified".asInstanceOf[attributeModified]
  
  @js.native
  sealed trait attributeRemoved extends StObject
  inline def attributeRemoved: attributeRemoved = "attributeRemoved".asInstanceOf[attributeRemoved]
  
  @js.native
  sealed trait `attribution-reporting`
    extends StObject
       with PermissionsPolicyFeature
  inline def `attribution-reporting`: `attribution-reporting` = "attribution-reporting".asInstanceOf[`attribution-reporting`]
  
  @js.native
  sealed trait audioCapture
    extends StObject
       with PermissionType
  inline def audioCapture: audioCapture = "audioCapture".asInstanceOf[audioCapture]
  
  @js.native
  sealed trait audioListenerCreated extends StObject
  inline def audioListenerCreated: audioListenerCreated = "audioListenerCreated".asInstanceOf[audioListenerCreated]
  
  @js.native
  sealed trait audioListenerWillBeDestroyed extends StObject
  inline def audioListenerWillBeDestroyed: audioListenerWillBeDestroyed = "audioListenerWillBeDestroyed".asInstanceOf[audioListenerWillBeDestroyed]
  
  @js.native
  sealed trait audioNodeCreated extends StObject
  inline def audioNodeCreated: audioNodeCreated = "audioNodeCreated".asInstanceOf[audioNodeCreated]
  
  @js.native
  sealed trait audioNodeWillBeDestroyed extends StObject
  inline def audioNodeWillBeDestroyed: audioNodeWillBeDestroyed = "audioNodeWillBeDestroyed".asInstanceOf[audioNodeWillBeDestroyed]
  
  @js.native
  sealed trait audioParamCreated extends StObject
  inline def audioParamCreated: audioParamCreated = "audioParamCreated".asInstanceOf[audioParamCreated]
  
  @js.native
  sealed trait audioParamWillBeDestroyed extends StObject
  inline def audioParamWillBeDestroyed: audioParamWillBeDestroyed = "audioParamWillBeDestroyed".asInstanceOf[audioParamWillBeDestroyed]
  
  @js.native
  sealed trait authRequired extends StObject
  inline def authRequired: authRequired = "authRequired".asInstanceOf[authRequired]
  
  @js.native
  sealed trait auto
    extends StObject
       with TracingBackend
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait auto_bookmark
    extends StObject
       with TransitionType
  inline def auto_bookmark: auto_bookmark = "auto_bookmark".asInstanceOf[auto_bookmark]
  
  @js.native
  sealed trait auto_subframe
    extends StObject
       with TransitionType
  inline def auto_subframe: auto_subframe = "auto_subframe".asInstanceOf[auto_subframe]
  
  @js.native
  sealed trait auto_toplevel
    extends StObject
       with TransitionType
  inline def auto_toplevel: auto_toplevel = "auto_toplevel".asInstanceOf[auto_toplevel]
  
  @js.native
  sealed trait autoaccept
    extends StObject
       with SetSPCTransactionModeRequestMode
  inline def autoaccept: autoaccept = "autoaccept".asInstanceOf[autoaccept]
  
  @js.native
  sealed trait autocomplete
    extends StObject
       with AXPropertyName
  inline def autocomplete: autocomplete = "autocomplete".asInstanceOf[autocomplete]
  
  @js.native
  sealed trait autoplay
    extends StObject
       with PermissionsPolicyFeature
  inline def autoplay: autoplay = "autoplay".asInstanceOf[autoplay]
  
  @js.native
  sealed trait autoreject
    extends StObject
       with SetSPCTransactionModeRequestMode
  inline def autoreject: autoreject = "autoreject".asInstanceOf[autoreject]
  
  @js.native
  sealed trait avif
    extends StObject
       with DisabledImageType
  inline def avif: avif = "avif".asInstanceOf[avif]
  
  @js.native
  sealed trait back
    extends StObject
       with MouseButton
  inline def back: back = "back".asInstanceOf[back]
  
  @js.native
  sealed trait backForwardCacheNotUsed extends StObject
  inline def backForwardCacheNotUsed: backForwardCacheNotUsed = "backForwardCacheNotUsed".asInstanceOf[backForwardCacheNotUsed]
  
  @js.native
  sealed trait backdrop
    extends StObject
       with PseudoType
  inline def backdrop: backdrop = "backdrop".asInstanceOf[backdrop]
  
  @js.native
  sealed trait background
    extends StObject
       with MemoryDumpLevelOfDetail
  inline def background: background = "background".asInstanceOf[background]
  
  @js.native
  sealed trait backgroundFetch
    extends StObject
       with PermissionType
       with ServiceName
  inline def backgroundFetch: backgroundFetch = "backgroundFetch".asInstanceOf[backgroundFetch]
  
  @js.native
  sealed trait backgroundServiceEventReceived extends StObject
  inline def backgroundServiceEventReceived: backgroundServiceEventReceived = "backgroundServiceEventReceived".asInstanceOf[backgroundServiceEventReceived]
  
  @js.native
  sealed trait backgroundSync
    extends StObject
       with PermissionType
       with ServiceName
  inline def backgroundSync: backgroundSync = "backgroundSync".asInstanceOf[backgroundSync]
  
  @js.native
  sealed trait badReputation
    extends StObject
       with SafetyTipStatus
  inline def badReputation: badReputation = "badReputation".asInstanceOf[badReputation]
  
  @js.native
  sealed trait basic
    extends StObject
       with CachedResponseType
  inline def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait before
    extends StObject
       with PseudoType
  inline def before: before = "before".asInstanceOf[before]
  
  @js.native
  sealed trait beforeScriptExecution
    extends StObject
       with SetInstrumentationBreakpointRequestInstrumentation
  inline def beforeScriptExecution: beforeScriptExecution = "beforeScriptExecution".asInstanceOf[beforeScriptExecution]
  
  @js.native
  sealed trait beforeScriptWithSourceMapExecution
    extends StObject
       with SetInstrumentationBreakpointRequestInstrumentation
  inline def beforeScriptWithSourceMapExecution: beforeScriptWithSourceMapExecution = "beforeScriptWithSourceMapExecution".asInstanceOf[beforeScriptWithSourceMapExecution]
  
  @js.native
  sealed trait beforeunload
    extends StObject
       with DialogType
  inline def beforeunload: beforeunload = "beforeunload".asInstanceOf[beforeunload]
  
  @js.native
  sealed trait bid
    extends StObject
       with InterestGroupAccessType
  inline def bid: bid = "bid".asInstanceOf[bid]
  
  @js.native
  sealed trait bigint
    extends StObject
       with ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
       with WebDriverValueType
  inline def bigint: bigint = "bigint".asInstanceOf[bigint]
  
  @js.native
  sealed trait bindingCalled extends StObject
  inline def bindingCalled: bindingCalled = "bindingCalled".asInstanceOf[bindingCalled]
  
  @js.native
  sealed trait ble
    extends StObject
       with AuthenticatorTransport
  inline def ble: ble = "ble".asInstanceOf[ble]
  
  @js.native
  sealed trait block
    extends StObject
       with ScopeType
  inline def block: block = "block".asInstanceOf[block]
  
  @js.native
  sealed trait blockable
    extends StObject
       with MixedContentType
  inline def blockable: blockable = "blockable".asInstanceOf[blockable]
  
  @js.native
  sealed trait blockedEvent
    extends StObject
       with ViolationSettingName
  inline def blockedEvent: blockedEvent = "blockedEvent".asInstanceOf[blockedEvent]
  
  @js.native
  sealed trait blockedParser
    extends StObject
       with ViolationSettingName
  inline def blockedParser: blockedParser = "blockedParser".asInstanceOf[blockedParser]
  
  @js.native
  sealed trait bluetooth
    extends StObject
       with ConnectionType
       with PermissionsPolicyFeature
  inline def bluetooth: bluetooth = "bluetooth".asInstanceOf[bluetooth]
  
  @js.native
  sealed trait blurredVision
    extends StObject
       with SetEmulatedVisionDeficiencyRequestType
  inline def blurredVision: blurredVision = "blurredVision".asInstanceOf[blurredVision]
  
  @js.native
  sealed trait boolean
    extends StObject
       with AXValueType
       with ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
       with WebDriverValueType
  inline def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait booleanOrUndefined
    extends StObject
       with AXValueType
  inline def booleanOrUndefined: booleanOrUndefined = "booleanOrUndefined".asInstanceOf[booleanOrUndefined]
  
  @js.native
  sealed trait br
    extends StObject
       with ContentEncoding
  inline def br: br = "br".asInstanceOf[br]
  
  @js.native
  sealed trait breakpointResolved extends StObject
  inline def breakpointResolved: breakpointResolved = "breakpointResolved".asInstanceOf[breakpointResolved]
  
  @js.native
  sealed trait broken
    extends StObject
       with AlternateProtocolUsage
  inline def broken: broken = "broken".asInstanceOf[broken]
  
  @js.native
  sealed trait `browsing-topics`
    extends StObject
       with PermissionsPolicyFeature
  inline def `browsing-topics`: `browsing-topics` = "browsing-topics".asInstanceOf[`browsing-topics`]
  
  @js.native
  sealed trait bufferUsage extends StObject
  inline def bufferUsage: bufferUsage = "bufferUsage".asInstanceOf[bufferUsage]
  
  @js.native
  sealed trait busy
    extends StObject
       with AXPropertyName
  inline def busy: busy = "busy".asInstanceOf[busy]
  
  @js.native
  sealed trait cable
    extends StObject
       with AuthenticatorTransport
  inline def cable: cable = "cable".asInstanceOf[cable]
  
  @js.native
  sealed trait `cache-storage`
    extends StObject
       with ServiceWorkerResponseSource
  inline def `cache-storage`: `cache-storage` = "cache-storage".asInstanceOf[`cache-storage`]
  
  @js.native
  sealed trait cacheStorageContentUpdated extends StObject
  inline def cacheStorageContentUpdated: cacheStorageContentUpdated = "cacheStorageContentUpdated".asInstanceOf[cacheStorageContentUpdated]
  
  @js.native
  sealed trait cacheStorageListUpdated extends StObject
  inline def cacheStorageListUpdated: cacheStorageListUpdated = "cacheStorageListUpdated".asInstanceOf[cacheStorageListUpdated]
  
  @js.native
  sealed trait cache_storage
    extends StObject
       with StorageType
  inline def cache_storage: cache_storage = "cache_storage".asInstanceOf[cache_storage]
  
  @js.native
  sealed trait call
    extends StObject
       with BreakLocationType
  inline def call: call = "call".asInstanceOf[call]
  
  @js.native
  sealed trait camera
    extends StObject
       with PermissionsPolicyFeature
  inline def camera: camera = "camera".asInstanceOf[camera]
  
  @js.native
  sealed trait cancel
    extends StObject
       with CertificateErrorAction
  inline def cancel: cancel = "cancel".asInstanceOf[cancel]
  
  @js.native
  sealed trait canceled_
    extends StObject
       with DownloadProgressEventState
       with typings.devtoolsProtocol.mod.Protocol.Browser.DownloadProgressEventState
  inline def canceled_ : canceled_ = "canceled".asInstanceOf[canceled_]
  
  @js.native
  sealed trait captureAreaScreenshot
    extends StObject
       with InspectMode
  inline def captureAreaScreenshot: captureAreaScreenshot = "captureAreaScreenshot".asInstanceOf[captureAreaScreenshot]
  
  @js.native
  sealed trait `catch`
    extends StObject
       with ScopeType
  inline def `catch`: `catch` = "catch".asInstanceOf[`catch`]
  
  @js.native
  sealed trait cellular2g
    extends StObject
       with ConnectionType
  inline def cellular2g: cellular2g = "cellular2g".asInstanceOf[cellular2g]
  
  @js.native
  sealed trait cellular3g
    extends StObject
       with ConnectionType
  inline def cellular3g: cellular3g = "cellular3g".asInstanceOf[cellular3g]
  
  @js.native
  sealed trait cellular4g
    extends StObject
       with ConnectionType
  inline def cellular4g: cellular4g = "cellular4g".asInstanceOf[cellular4g]
  
  @js.native
  sealed trait certificateError extends StObject
  inline def certificateError: certificateError = "certificateError".asInstanceOf[certificateError]
  
  @js.native
  sealed trait `ch-device-memory`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-device-memory`: `ch-device-memory` = "ch-device-memory".asInstanceOf[`ch-device-memory`]
  
  @js.native
  sealed trait `ch-downlink`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-downlink`: `ch-downlink` = "ch-downlink".asInstanceOf[`ch-downlink`]
  
  @js.native
  sealed trait `ch-dpr`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-dpr`: `ch-dpr` = "ch-dpr".asInstanceOf[`ch-dpr`]
  
  @js.native
  sealed trait `ch-ect`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-ect`: `ch-ect` = "ch-ect".asInstanceOf[`ch-ect`]
  
  @js.native
  sealed trait `ch-prefers-color-scheme`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-prefers-color-scheme`: `ch-prefers-color-scheme` = "ch-prefers-color-scheme".asInstanceOf[`ch-prefers-color-scheme`]
  
  @js.native
  sealed trait `ch-prefers-reduced-motion`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-prefers-reduced-motion`: `ch-prefers-reduced-motion` = "ch-prefers-reduced-motion".asInstanceOf[`ch-prefers-reduced-motion`]
  
  @js.native
  sealed trait `ch-rtt`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-rtt`: `ch-rtt` = "ch-rtt".asInstanceOf[`ch-rtt`]
  
  @js.native
  sealed trait `ch-save-data`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-save-data`: `ch-save-data` = "ch-save-data".asInstanceOf[`ch-save-data`]
  
  @js.native
  sealed trait `ch-ua`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-ua`: `ch-ua` = "ch-ua".asInstanceOf[`ch-ua`]
  
  @js.native
  sealed trait `ch-ua-arch`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-ua-arch`: `ch-ua-arch` = "ch-ua-arch".asInstanceOf[`ch-ua-arch`]
  
  @js.native
  sealed trait `ch-ua-bitness`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-ua-bitness`: `ch-ua-bitness` = "ch-ua-bitness".asInstanceOf[`ch-ua-bitness`]
  
  @js.native
  sealed trait `ch-ua-full`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-ua-full`: `ch-ua-full` = "ch-ua-full".asInstanceOf[`ch-ua-full`]
  
  @js.native
  sealed trait `ch-ua-full-version`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-ua-full-version`: `ch-ua-full-version` = "ch-ua-full-version".asInstanceOf[`ch-ua-full-version`]
  
  @js.native
  sealed trait `ch-ua-full-version-list`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-ua-full-version-list`: `ch-ua-full-version-list` = "ch-ua-full-version-list".asInstanceOf[`ch-ua-full-version-list`]
  
  @js.native
  sealed trait `ch-ua-mobile`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-ua-mobile`: `ch-ua-mobile` = "ch-ua-mobile".asInstanceOf[`ch-ua-mobile`]
  
  @js.native
  sealed trait `ch-ua-model`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-ua-model`: `ch-ua-model` = "ch-ua-model".asInstanceOf[`ch-ua-model`]
  
  @js.native
  sealed trait `ch-ua-platform`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-ua-platform`: `ch-ua-platform` = "ch-ua-platform".asInstanceOf[`ch-ua-platform`]
  
  @js.native
  sealed trait `ch-ua-platform-version`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-ua-platform-version`: `ch-ua-platform-version` = "ch-ua-platform-version".asInstanceOf[`ch-ua-platform-version`]
  
  @js.native
  sealed trait `ch-ua-reduced`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-ua-reduced`: `ch-ua-reduced` = "ch-ua-reduced".asInstanceOf[`ch-ua-reduced`]
  
  @js.native
  sealed trait `ch-ua-wow64`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-ua-wow64`: `ch-ua-wow64` = "ch-ua-wow64".asInstanceOf[`ch-ua-wow64`]
  
  @js.native
  sealed trait `ch-viewport-height`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-viewport-height`: `ch-viewport-height` = "ch-viewport-height".asInstanceOf[`ch-viewport-height`]
  
  @js.native
  sealed trait `ch-viewport-width`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-viewport-width`: `ch-viewport-width` = "ch-viewport-width".asInstanceOf[`ch-viewport-width`]
  
  @js.native
  sealed trait `ch-width`
    extends StObject
       with PermissionsPolicyFeature
  inline def `ch-width`: `ch-width` = "ch-width".asInstanceOf[`ch-width`]
  
  @js.native
  sealed trait char
    extends StObject
       with DispatchKeyEventRequestType
  inline def char: char = "char".asInstanceOf[char]
  
  @js.native
  sealed trait characterDataModified extends StObject
  inline def characterDataModified: characterDataModified = "characterDataModified".asInstanceOf[characterDataModified]
  
  @js.native
  sealed trait checked
    extends StObject
       with AXPropertyName
  inline def checked: checked = "checked".asInstanceOf[checked]
  
  @js.native
  sealed trait child
    extends StObject
       with AdFrameType
  inline def child: child = "child".asInstanceOf[child]
  
  @js.native
  sealed trait childNodeCountUpdated extends StObject
  inline def childNodeCountUpdated: childNodeCountUpdated = "childNodeCountUpdated".asInstanceOf[childNodeCountUpdated]
  
  @js.native
  sealed trait childNodeInserted extends StObject
  inline def childNodeInserted: childNodeInserted = "childNodeInserted".asInstanceOf[childNodeInserted]
  
  @js.native
  sealed trait childNodeRemoved extends StObject
  inline def childNodeRemoved: childNodeRemoved = "childNodeRemoved".asInstanceOf[childNodeRemoved]
  
  @js.native
  sealed trait chrome
    extends StObject
       with TracingBackend
  inline def chrome: chrome = "chrome".asInstanceOf[chrome]
  
  @js.native
  sealed trait `clamped-max`
    extends StObject
       with ChannelCountMode
  inline def `clamped-max`: `clamped-max` = "clamped-max".asInstanceOf[`clamped-max`]
  
  @js.native
  sealed trait clear
    extends StObject
       with ConsoleAPICalledEventType
  inline def clear: clear = "clear".asInstanceOf[clear]
  
  @js.native
  sealed trait `clipboard-read`
    extends StObject
       with PermissionsPolicyFeature
  inline def `clipboard-read`: `clipboard-read` = "clipboard-read".asInstanceOf[`clipboard-read`]
  
  @js.native
  sealed trait `clipboard-write`
    extends StObject
       with PermissionsPolicyFeature
  inline def `clipboard-write`: `clipboard-write` = "clipboard-write".asInstanceOf[`clipboard-write`]
  
  @js.native
  sealed trait clipboardReadWrite
    extends StObject
       with PermissionType
  inline def clipboardReadWrite: clipboardReadWrite = "clipboardReadWrite".asInstanceOf[clipboardReadWrite]
  
  @js.native
  sealed trait clipboardSanitizedWrite
    extends StObject
       with PermissionType
  inline def clipboardSanitizedWrite: clipboardSanitizedWrite = "clipboardSanitizedWrite".asInstanceOf[clipboardSanitizedWrite]
  
  @js.native
  sealed trait closeTabSearch
    extends StObject
       with BrowserCommandId
  inline def closeTabSearch: closeTabSearch = "closeTabSearch".asInstanceOf[closeTabSearch]
  
  @js.native
  sealed trait closed
    extends StObject
       with ContextState
       with ShadowRootType
  inline def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait closure
    extends StObject
       with ScopeType
  inline def closure: closure = "closure".asInstanceOf[closure]
  
  @js.native
  sealed trait `coep-frame-resource-needs-coep-header`
    extends StObject
       with BlockedReason
  inline def `coep-frame-resource-needs-coep-header`: `coep-frame-resource-needs-coep-header` = "coep-frame-resource-needs-coep-header".asInstanceOf[`coep-frame-resource-needs-coep-header`]
  
  @js.native
  sealed trait compilationCacheProduced extends StObject
  inline def compilationCacheProduced: compilationCacheProduced = "compilationCacheProduced".asInstanceOf[compilationCacheProduced]
  
  @js.native
  sealed trait completed
    extends StObject
       with DownloadProgressEventState
       with typings.devtoolsProtocol.mod.Protocol.Browser.DownloadProgressEventState
  inline def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait compliant
    extends StObject
       with CertificateTransparencyCompliance
  inline def compliant: compliant = "compliant".asInstanceOf[compliant]
  
  @js.native
  sealed trait computedString
    extends StObject
       with AXValueType
  inline def computedString: computedString = "computedString".asInstanceOf[computedString]
  
  @js.native
  sealed trait confirm
    extends StObject
       with DialogType
  inline def confirm: confirm = "confirm".asInstanceOf[confirm]
  
  @js.native
  sealed trait `console-api`
    extends StObject
       with ConsoleMessageSource
  inline def `console-api`: `console-api` = "console-api".asInstanceOf[`console-api`]
  
  @js.native
  sealed trait consoleAPICalled extends StObject
  inline def consoleAPICalled: consoleAPICalled = "consoleAPICalled".asInstanceOf[consoleAPICalled]
  
  @js.native
  sealed trait consoleProfileFinished extends StObject
  inline def consoleProfileFinished: consoleProfileFinished = "consoleProfileFinished".asInstanceOf[consoleProfileFinished]
  
  @js.native
  sealed trait consoleProfileStarted extends StObject
  inline def consoleProfileStarted: consoleProfileStarted = "consoleProfileStarted".asInstanceOf[consoleProfileStarted]
  
  @js.native
  sealed trait `content-type`
    extends StObject
       with BlockedReason
  inline def `content-type`: `content-type` = "content-type".asInstanceOf[`content-type`]
  
  @js.native
  sealed trait contents
    extends StObject
       with AXValueSourceType
  inline def contents: contents = "contents".asInstanceOf[contents]
  
  @js.native
  sealed trait contextChanged extends StObject
  inline def contextChanged: contextChanged = "contextChanged".asInstanceOf[contextChanged]
  
  @js.native
  sealed trait contextCreated extends StObject
  inline def contextCreated: contextCreated = "contextCreated".asInstanceOf[contextCreated]
  
  @js.native
  sealed trait contextWillBeDestroyed extends StObject
  inline def contextWillBeDestroyed: contextWillBeDestroyed = "contextWillBeDestroyed".asInstanceOf[contextWillBeDestroyed]
  
  @js.native
  sealed trait continue
    extends StObject
       with CertificateErrorAction
  inline def continue: continue = "continue".asInstanceOf[continue]
  
  @js.native
  sealed trait controls
    extends StObject
       with AXPropertyName
  inline def controls: controls = "controls".asInstanceOf[controls]
  
  @js.native
  sealed trait cookies
    extends StObject
       with StorageType
  inline def cookies: cookies = "cookies".asInstanceOf[cookies]
  
  @js.native
  sealed trait `coop-sandboxed-iframe-cannot-navigate-to-coop-page`
    extends StObject
       with BlockedReason
  inline def `coop-sandboxed-iframe-cannot-navigate-to-coop-page`: `coop-sandboxed-iframe-cannot-navigate-to-coop-page` = "coop-sandboxed-iframe-cannot-navigate-to-coop-page".asInstanceOf[`coop-sandboxed-iframe-cannot-navigate-to-coop-page`]
  
  @js.native
  sealed trait `corp-not-same-origin`
    extends StObject
       with BlockedReason
  inline def `corp-not-same-origin`: `corp-not-same-origin` = "corp-not-same-origin".asInstanceOf[`corp-not-same-origin`]
  
  @js.native
  sealed trait `corp-not-same-origin-after-defaulted-to-same-origin-by-coep`
    extends StObject
       with BlockedReason
  inline def `corp-not-same-origin-after-defaulted-to-same-origin-by-coep`: `corp-not-same-origin-after-defaulted-to-same-origin-by-coep` = "corp-not-same-origin-after-defaulted-to-same-origin-by-coep".asInstanceOf[`corp-not-same-origin-after-defaulted-to-same-origin-by-coep`]
  
  @js.native
  sealed trait `corp-not-same-site`
    extends StObject
       with BlockedReason
  inline def `corp-not-same-site`: `corp-not-same-site` = "corp-not-same-site".asInstanceOf[`corp-not-same-site`]
  
  @js.native
  sealed trait cors
    extends StObject
       with CachedResponseType
  inline def cors: cors = "cors".asInstanceOf[cors]
  
  @js.native
  sealed trait count
    extends StObject
       with ConsoleAPICalledEventType
  inline def count: count = "count".asInstanceOf[count]
  
  @js.native
  sealed trait critical
    extends StObject
       with PressureLevel
  inline def critical: critical = "critical".asInstanceOf[critical]
  
  @js.native
  sealed trait `cross-origin-isolated`
    extends StObject
       with PermissionsPolicyFeature
  inline def `cross-origin-isolated`: `cross-origin-isolated` = "cross-origin-isolated".asInstanceOf[`cross-origin-isolated`]
  
  @js.native
  sealed trait csp
    extends StObject
       with BlockedReason
  inline def csp: csp = "csp".asInstanceOf[csp]
  
  @js.native
  sealed trait ctap2
    extends StObject
       with AuthenticatorProtocol
  inline def ctap2: ctap2 = "ctap2".asInstanceOf[ctap2]
  
  @js.native
  sealed trait ctap2_0
    extends StObject
       with Ctap2Version
  inline def ctap2_0: ctap2_0 = "ctap2_0".asInstanceOf[ctap2_0]
  
  @js.native
  sealed trait ctap2_1
    extends StObject
       with Ctap2Version
  inline def ctap2_1: ctap2_1 = "ctap2_1".asInstanceOf[ctap2_1]
  
  @js.native
  sealed trait current
    extends StObject
       with ContinueToLocationRequestTargetCallFrames
  inline def current: current = "current".asInstanceOf[current]
  
  @js.native
  sealed trait currentTab
    extends StObject
       with ClientNavigationDisposition
  inline def currentTab: currentTab = "currentTab".asInstanceOf[currentTab]
  
  @js.native
  sealed trait dashed
    extends StObject
       with LineStylePattern
  inline def dashed: dashed = "dashed".asInstanceOf[dashed]
  
  @js.native
  sealed trait dataCollected extends StObject
  inline def dataCollected: dataCollected = "dataCollected".asInstanceOf[dataCollected]
  
  @js.native
  sealed trait dataReceived extends StObject
  inline def dataReceived: dataReceived = "dataReceived".asInstanceOf[dataReceived]
  
  @js.native
  sealed trait dataview
    extends StObject
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  inline def dataview: dataview = "dataview".asInstanceOf[dataview]
  
  @js.native
  sealed trait date
    extends StObject
       with KeyType
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
       with WebDriverValueType
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait debug
    extends StObject
       with ConsoleAPICalledEventType
       with ConsoleMessageLevel
       with PlayerMessageLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait debugCommand
    extends StObject
       with PausedEventReason
  inline def debugCommand: debugCommand = "debugCommand".asInstanceOf[debugCommand]
  
  @js.native
  sealed trait debuggerStatement
    extends StObject
       with BreakLocationType
  inline def debuggerStatement: debuggerStatement = "debuggerStatement".asInstanceOf[debuggerStatement]
  
  @js.native
  sealed trait default_
    extends StObject
       with CachedResponseType
       with GestureSourceType
       with typings.devtoolsProtocol.mod.Protocol.Page.SetDownloadBehaviorRequestBehavior
       with SetDownloadBehaviorRequestBehavior
  inline def default_ : default_ = "default".asInstanceOf[default_]
  
  @js.native
  sealed trait deflate
    extends StObject
       with ContentEncoding
  inline def deflate: deflate = "deflate".asInstanceOf[deflate]
  
  @js.native
  sealed trait denied
    extends StObject
       with PermissionSetting
  inline def denied: denied = "denied".asInstanceOf[denied]
  
  @js.native
  sealed trait deny
    extends StObject
       with typings.devtoolsProtocol.mod.Protocol.Page.SetDownloadBehaviorRequestBehavior
       with SetDownloadBehaviorRequestBehavior
  inline def deny: deny = "deny".asInstanceOf[deny]
  
  @js.native
  sealed trait deprecation
    extends StObject
       with ConsoleMessageSource
       with LogEntrySource
  inline def deprecation: deprecation = "deprecation".asInstanceOf[deprecation]
  
  @js.native
  sealed trait describedby
    extends StObject
       with AXPropertyName
  inline def describedby: describedby = "describedby".asInstanceOf[describedby]
  
  @js.native
  sealed trait description
    extends StObject
       with AXValueNativeSourceType
  inline def description: description = "description".asInstanceOf[description]
  
  @js.native
  sealed trait desktop
    extends StObject
       with SetEmitTouchEventsForMouseRequestConfiguration
       with SetTouchEmulationEnabledRequestConfiguration
  inline def desktop: desktop = "desktop".asInstanceOf[desktop]
  
  @js.native
  sealed trait detached extends StObject
  inline def detached: detached = "detached".asInstanceOf[detached]
  
  @js.native
  sealed trait detachedFromTarget extends StObject
  inline def detachedFromTarget: detachedFromTarget = "detachedFromTarget".asInstanceOf[detachedFromTarget]
  
  @js.native
  sealed trait detailed
    extends StObject
       with MemoryDumpLevelOfDetail
  inline def detailed: detailed = "detailed".asInstanceOf[detailed]
  
  @js.native
  sealed trait details
    extends StObject
       with AXPropertyName
  inline def details: details = "details".asInstanceOf[details]
  
  @js.native
  sealed trait deuteranopia
    extends StObject
       with SetEmulatedVisionDeficiencyRequestType
  inline def deuteranopia: deuteranopia = "deuteranopia".asInstanceOf[deuteranopia]
  
  @js.native
  sealed trait dir
    extends StObject
       with ConsoleAPICalledEventType
  inline def dir: dir = "dir".asInstanceOf[dir]
  
  @js.native
  sealed trait `direct-sockets`
    extends StObject
       with PermissionsPolicyFeature
  inline def `direct-sockets`: `direct-sockets` = "direct-sockets".asInstanceOf[`direct-sockets`]
  
  @js.native
  sealed trait dirxml
    extends StObject
       with ConsoleAPICalledEventType
  inline def dirxml: dirxml = "dirxml".asInstanceOf[dirxml]
  
  @js.native
  sealed trait disabled
    extends StObject
       with AXPropertyName
  inline def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @js.native
  sealed trait discouragedAPIUse
    extends StObject
       with ViolationSettingName
  inline def discouragedAPIUse: discouragedAPIUse = "discouragedAPIUse".asInstanceOf[discouragedAPIUse]
  
  @js.native
  sealed trait discrete
    extends StObject
       with ChannelInterpretation
  inline def discrete: discrete = "discrete".asInstanceOf[discrete]
  
  @js.native
  sealed trait `display-capture`
    extends StObject
       with PermissionsPolicyFeature
  inline def `display-capture`: `display-capture` = "display-capture".asInstanceOf[`display-capture`]
  
  @js.native
  sealed trait displayCapture
    extends StObject
       with PermissionType
  inline def displayCapture: displayCapture = "displayCapture".asInstanceOf[displayCapture]
  
  @js.native
  sealed trait distributedNodesUpdated extends StObject
  inline def distributedNodesUpdated: distributedNodesUpdated = "distributedNodesUpdated".asInstanceOf[distributedNodesUpdated]
  
  @js.native
  sealed trait dnsAlpnH3JobWonRace
    extends StObject
       with AlternateProtocolUsage
  inline def dnsAlpnH3JobWonRace: dnsAlpnH3JobWonRace = "dnsAlpnH3JobWonRace".asInstanceOf[dnsAlpnH3JobWonRace]
  
  @js.native
  sealed trait dnsAlpnH3JobWonWithoutRace
    extends StObject
       with AlternateProtocolUsage
  inline def dnsAlpnH3JobWonWithoutRace: dnsAlpnH3JobWonWithoutRace = "dnsAlpnH3JobWonWithoutRace".asInstanceOf[dnsAlpnH3JobWonWithoutRace]
  
  @js.native
  sealed trait `document-domain`
    extends StObject
       with PermissionsPolicyFeature
  inline def `document-domain`: `document-domain` = "document-domain".asInstanceOf[`document-domain`]
  
  @js.native
  sealed trait documentOpened extends StObject
  inline def documentOpened: documentOpened = "documentOpened".asInstanceOf[documentOpened]
  
  @js.native
  sealed trait documentUpdated extends StObject
  inline def documentUpdated: documentUpdated = "documentUpdated".asInstanceOf[documentUpdated]
  
  @js.native
  sealed trait domContentEventFired extends StObject
  inline def domContentEventFired: domContentEventFired = "domContentEventFired".asInstanceOf[domContentEventFired]
  
  @js.native
  sealed trait domRelation
    extends StObject
       with AXValueType
  inline def domRelation: domRelation = "domRelation".asInstanceOf[domRelation]
  
  @js.native
  sealed trait domStorageItemAdded extends StObject
  inline def domStorageItemAdded: domStorageItemAdded = "domStorageItemAdded".asInstanceOf[domStorageItemAdded]
  
  @js.native
  sealed trait domStorageItemRemoved extends StObject
  inline def domStorageItemRemoved: domStorageItemRemoved = "domStorageItemRemoved".asInstanceOf[domStorageItemRemoved]
  
  @js.native
  sealed trait domStorageItemUpdated extends StObject
  inline def domStorageItemUpdated: domStorageItemUpdated = "domStorageItemUpdated".asInstanceOf[domStorageItemUpdated]
  
  @js.native
  sealed trait domStorageItemsCleared extends StObject
  inline def domStorageItemsCleared: domStorageItemsCleared = "domStorageItemsCleared".asInstanceOf[domStorageItemsCleared]
  
  @js.native
  sealed trait dotted
    extends StObject
       with LineStylePattern
  inline def dotted: dotted = "dotted".asInstanceOf[dotted]
  
  @js.native
  sealed trait downloadProgress extends StObject
  inline def downloadProgress: downloadProgress = "downloadProgress".asInstanceOf[downloadProgress]
  
  @js.native
  sealed trait downloadWillBegin extends StObject
  inline def downloadWillBegin: downloadWillBegin = "downloadWillBegin".asInstanceOf[downloadWillBegin]
  
  @js.native
  sealed trait download_
    extends StObject
       with ClientNavigationDisposition
  inline def download_ : download_ = "download".asInstanceOf[download_]
  
  @js.native
  sealed trait dragCancel
    extends StObject
       with DispatchDragEventRequestType
  inline def dragCancel: dragCancel = "dragCancel".asInstanceOf[dragCancel]
  
  @js.native
  sealed trait dragEnter
    extends StObject
       with DispatchDragEventRequestType
  inline def dragEnter: dragEnter = "dragEnter".asInstanceOf[dragEnter]
  
  @js.native
  sealed trait dragIntercepted extends StObject
  inline def dragIntercepted: dragIntercepted = "dragIntercepted".asInstanceOf[dragIntercepted]
  
  @js.native
  sealed trait dragOver
    extends StObject
       with DispatchDragEventRequestType
  inline def dragOver: dragOver = "dragOver".asInstanceOf[dragOver]
  
  @js.native
  sealed trait drop
    extends StObject
       with DispatchDragEventRequestType
  inline def drop: drop = "drop".asInstanceOf[drop]
  
  @js.native
  sealed trait durableStorage
    extends StObject
       with PermissionType
  inline def durableStorage: durableStorage = "durableStorage".asInstanceOf[durableStorage]
  
  @js.native
  sealed trait echoToConsole
    extends StObject
       with TraceConfigRecordMode
  inline def echoToConsole: echoToConsole = "echoToConsole".asInstanceOf[echoToConsole]
  
  @js.native
  sealed trait editable
    extends StObject
       with AXPropertyName
  inline def editable: editable = "editable".asInstanceOf[editable]
  
  @js.native
  sealed trait `encrypted-media`
    extends StObject
       with PermissionsPolicyFeature
  inline def `encrypted-media`: `encrypted-media` = "encrypted-media".asInstanceOf[`encrypted-media`]
  
  @js.native
  sealed trait endGroup
    extends StObject
       with ConsoleAPICalledEventType
  inline def endGroup: endGroup = "endGroup".asInstanceOf[endGroup]
  
  @js.native
  sealed trait entryAdded extends StObject
  inline def entryAdded: entryAdded = "entryAdded".asInstanceOf[entryAdded]
  
  @js.native
  sealed trait error
    extends StObject
       with CachedResponseType
       with ConsoleAPICalledEventType
       with ConsoleMessageLevel
       with LogEntryLevel
       with ObjectPreviewSubtype
       with PlayerMessageLevel
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
       with WebDriverValueType
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait errormessage
    extends StObject
       with AXPropertyName
  inline def errormessage: errormessage = "errormessage".asInstanceOf[errormessage]
  
  @js.native
  sealed trait ethernet
    extends StObject
       with ConnectionType
  inline def ethernet: ethernet = "ethernet".asInstanceOf[ethernet]
  
  @js.native
  sealed trait eval
    extends StObject
       with ScopeType
  inline def eval: eval = "eval".asInstanceOf[eval]
  
  @js.native
  sealed trait eventSourceMessageReceived extends StObject
  inline def eventSourceMessageReceived: eventSourceMessageReceived = "eventSourceMessageReceived".asInstanceOf[eventSourceMessageReceived]
  
  @js.native
  sealed trait exception
    extends StObject
       with PausedEventReason
  inline def exception: exception = "exception".asInstanceOf[exception]
  
  @js.native
  sealed trait exceptionRevoked extends StObject
  inline def exceptionRevoked: exceptionRevoked = "exceptionRevoked".asInstanceOf[exceptionRevoked]
  
  @js.native
  sealed trait exceptionThrown extends StObject
  inline def exceptionThrown: exceptionThrown = "exceptionThrown".asInstanceOf[exceptionThrown]
  
  @js.native
  sealed trait `execution-while-not-rendered`
    extends StObject
       with PermissionsPolicyFeature
  inline def `execution-while-not-rendered`: `execution-while-not-rendered` = "execution-while-not-rendered".asInstanceOf[`execution-while-not-rendered`]
  
  @js.native
  sealed trait `execution-while-out-of-viewport`
    extends StObject
       with PermissionsPolicyFeature
  inline def `execution-while-out-of-viewport`: `execution-while-out-of-viewport` = "execution-while-out-of-viewport".asInstanceOf[`execution-while-out-of-viewport`]
  
  @js.native
  sealed trait executionContextCreated extends StObject
  inline def executionContextCreated: executionContextCreated = "executionContextCreated".asInstanceOf[executionContextCreated]
  
  @js.native
  sealed trait executionContextDestroyed extends StObject
  inline def executionContextDestroyed: executionContextDestroyed = "executionContextDestroyed".asInstanceOf[executionContextDestroyed]
  
  @js.native
  sealed trait executionContextsCleared extends StObject
  inline def executionContextsCleared: executionContextsCleared = "executionContextsCleared".asInstanceOf[executionContextsCleared]
  
  @js.native
  sealed trait expanded
    extends StObject
       with AXPropertyName
  inline def expanded: expanded = "expanded".asInstanceOf[expanded]
  
  @js.native
  sealed trait explicit
    extends StObject
       with ChannelCountMode
  inline def explicit: explicit = "explicit".asInstanceOf[explicit]
  
  @js.native
  sealed trait `fallback-code`
    extends StObject
       with ServiceWorkerResponseSource
  inline def `fallback-code`: `fallback-code` = "fallback-code".asInstanceOf[`fallback-code`]
  
  @js.native
  sealed trait figcaption
    extends StObject
       with AXValueNativeSourceType
  inline def figcaption: figcaption = "figcaption".asInstanceOf[figcaption]
  
  @js.native
  sealed trait fileChooserOpened extends StObject
  inline def fileChooserOpened: fileChooserOpened = "fileChooserOpened".asInstanceOf[fileChooserOpened]
  
  @js.native
  sealed trait file_systems
    extends StObject
       with StorageType
  inline def file_systems: file_systems = "file_systems".asInstanceOf[file_systems]
  
  @js.native
  sealed trait `first-letter`
    extends StObject
       with PseudoType
  inline def `first-letter`: `first-letter` = "first-letter".asInstanceOf[`first-letter`]
  
  @js.native
  sealed trait `first-line`
    extends StObject
       with PseudoType
  inline def `first-line`: `first-line` = "first-line".asInstanceOf[`first-line`]
  
  @js.native
  sealed trait `first-line-inherited`
    extends StObject
       with PseudoType
  inline def `first-line-inherited`: `first-line-inherited` = "first-line-inherited".asInstanceOf[`first-line-inherited`]
  
  @js.native
  sealed trait flash
    extends StObject
       with PermissionType
  inline def flash: flash = "flash".asInstanceOf[flash]
  
  @js.native
  sealed trait flowto
    extends StObject
       with AXPropertyName
  inline def flowto: flowto = "flowto".asInstanceOf[flowto]
  
  @js.native
  sealed trait `focus-without-user-activation`
    extends StObject
       with PermissionsPolicyFeature
  inline def `focus-without-user-activation`: `focus-without-user-activation` = "focus-without-user-activation".asInstanceOf[`focus-without-user-activation`]
  
  @js.native
  sealed trait focusable
    extends StObject
       with AXPropertyName
  inline def focusable: focusable = "focusable".asInstanceOf[focusable]
  
  @js.native
  sealed trait focused
    extends StObject
       with AXPropertyName
  inline def focused: focused = "focused".asInstanceOf[focused]
  
  @js.native
  sealed trait fontsUpdated extends StObject
  inline def fontsUpdated: fontsUpdated = "fontsUpdated".asInstanceOf[fontsUpdated]
  
  @js.native
  sealed trait formSubmissionGet
    extends StObject
       with ClientNavigationReason
  inline def formSubmissionGet: formSubmissionGet = "formSubmissionGet".asInstanceOf[formSubmissionGet]
  
  @js.native
  sealed trait formSubmissionPost
    extends StObject
       with ClientNavigationReason
  inline def formSubmissionPost: formSubmissionPost = "formSubmissionPost".asInstanceOf[formSubmissionPost]
  
  @js.native
  sealed trait form_submit
    extends StObject
       with TransitionType
  inline def form_submit: form_submit = "form_submit".asInstanceOf[form_submit]
  
  @js.native
  sealed trait forward
    extends StObject
       with MouseButton
  inline def forward: forward = "forward".asInstanceOf[forward]
  
  @js.native
  sealed trait frameAttached extends StObject
  inline def frameAttached: frameAttached = "frameAttached".asInstanceOf[frameAttached]
  
  @js.native
  sealed trait frameClearedScheduledNavigation extends StObject
  inline def frameClearedScheduledNavigation: frameClearedScheduledNavigation = "frameClearedScheduledNavigation".asInstanceOf[frameClearedScheduledNavigation]
  
  @js.native
  sealed trait frameDetached extends StObject
  inline def frameDetached: frameDetached = "frameDetached".asInstanceOf[frameDetached]
  
  @js.native
  sealed trait frameNavigated extends StObject
  inline def frameNavigated: frameNavigated = "frameNavigated".asInstanceOf[frameNavigated]
  
  @js.native
  sealed trait frameRequestedNavigation extends StObject
  inline def frameRequestedNavigation: frameRequestedNavigation = "frameRequestedNavigation".asInstanceOf[frameRequestedNavigation]
  
  @js.native
  sealed trait frameResized extends StObject
  inline def frameResized: frameResized = "frameResized".asInstanceOf[frameResized]
  
  @js.native
  sealed trait frameScheduledNavigation extends StObject
  inline def frameScheduledNavigation: frameScheduledNavigation = "frameScheduledNavigation".asInstanceOf[frameScheduledNavigation]
  
  @js.native
  sealed trait frameStartedLoading extends StObject
  inline def frameStartedLoading: frameStartedLoading = "frameStartedLoading".asInstanceOf[frameStartedLoading]
  
  @js.native
  sealed trait frameStoppedLoading extends StObject
  inline def frameStoppedLoading: frameStoppedLoading = "frameStoppedLoading".asInstanceOf[frameStoppedLoading]
  
  @js.native
  sealed trait frobulate
    extends StObject
       with PermissionsPolicyFeature
  inline def frobulate: frobulate = "frobulate".asInstanceOf[frobulate]
  
  @js.native
  sealed trait frozen
    extends StObject
       with SetWebLifecycleStateRequestState
  inline def frozen: frozen = "frozen".asInstanceOf[frozen]
  
  @js.native
  sealed trait fullscreen
    extends StObject
       with PermissionsPolicyFeature
       with WindowState
  inline def fullscreen: fullscreen = "fullscreen".asInstanceOf[fullscreen]
  
  @js.native
  sealed trait function
    extends StObject
       with ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
       with WebDriverValueType
  inline def function: function = "function".asInstanceOf[function]
  
  @js.native
  sealed trait gamepad
    extends StObject
       with PermissionsPolicyFeature
  inline def gamepad: gamepad = "gamepad".asInstanceOf[gamepad]
  
  @js.native
  sealed trait generated
    extends StObject
       with TransitionType
  inline def generated: generated = "generated".asInstanceOf[generated]
  
  @js.native
  sealed trait generator
    extends StObject
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  inline def generator: generator = "generator".asInstanceOf[generator]
  
  @js.native
  sealed trait geolocation
    extends StObject
       with PermissionType
       with PermissionsPolicyFeature
  inline def geolocation: geolocation = "geolocation".asInstanceOf[geolocation]
  
  @js.native
  sealed trait global
    extends StObject
       with ScopeType
  inline def global: global = "global".asInstanceOf[global]
  
  @js.native
  sealed trait `grammar-error`
    extends StObject
       with PseudoType
  inline def `grammar-error`: `grammar-error` = "grammar-error".asInstanceOf[`grammar-error`]
  
  @js.native
  sealed trait granted
    extends StObject
       with PermissionSetting
  inline def granted: granted = "granted".asInstanceOf[granted]
  
  @js.native
  sealed trait gyroscope
    extends StObject
       with PermissionsPolicyFeature
  inline def gyroscope: gyroscope = "gyroscope".asInstanceOf[gyroscope]
  
  @js.native
  sealed trait gzip
    extends StObject
       with ContentEncoding
       with StreamCompression
  inline def gzip: gzip = "gzip".asInstanceOf[gzip]
  
  @js.native
  sealed trait handler
    extends StObject
       with ViolationSettingName
  inline def handler: handler = "handler".asInstanceOf[handler]
  
  @js.native
  sealed trait hasPopup
    extends StObject
       with AXPropertyName
  inline def hasPopup: hasPopup = "hasPopup".asInstanceOf[hasPopup]
  
  @js.native
  sealed trait heapStatsUpdate extends StObject
  inline def heapStatsUpdate: heapStatsUpdate = "heapStatsUpdate".asInstanceOf[heapStatsUpdate]
  
  @js.native
  sealed trait hex
    extends StObject
       with ColorFormat
  inline def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait hid
    extends StObject
       with PermissionsPolicyFeature
  inline def hid: hid = "hid".asInstanceOf[hid]
  
  @js.native
  sealed trait hidden
    extends StObject
       with AXPropertyName
  inline def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait hiddenRoot
    extends StObject
       with AXPropertyName
  inline def hiddenRoot: hiddenRoot = "hiddenRoot".asInstanceOf[hiddenRoot]
  
  @js.native
  sealed trait highlight
    extends StObject
       with PseudoType
  inline def highlight: highlight = "highlight".asInstanceOf[highlight]
  
  @js.native
  sealed trait horizontal
    extends StObject
       with DisplayFeatureOrientation
  inline def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait hsl
    extends StObject
       with ColorFormat
  inline def hsl: hsl = "hsl".asInstanceOf[hsl]
  
  @js.native
  sealed trait `http-cache`
    extends StObject
       with ServiceWorkerResponseSource
  inline def `http-cache`: `http-cache` = "http-cache".asInstanceOf[`http-cache`]
  
  @js.native
  sealed trait httpHeaderRefresh
    extends StObject
       with ClientNavigationReason
  inline def httpHeaderRefresh: httpHeaderRefresh = "httpHeaderRefresh".asInstanceOf[httpHeaderRefresh]
  
  @js.native
  sealed trait hwb
    extends StObject
       with ColorFormat
  inline def hwb: hwb = "hwb".asInstanceOf[hwb]
  
  @js.native
  sealed trait `identity-credentials-get`
    extends StObject
       with PermissionsPolicyFeature
  inline def `identity-credentials-get`: `identity-credentials-get` = "identity-credentials-get".asInstanceOf[`identity-credentials-get`]
  
  @js.native
  sealed trait `idle-detection`
    extends StObject
       with PermissionsPolicyFeature
  inline def `idle-detection`: `idle-detection` = "idle-detection".asInstanceOf[`idle-detection`]
  
  @js.native
  sealed trait idleDetection
    extends StObject
       with PermissionType
  inline def idleDetection: idleDetection = "idleDetection".asInstanceOf[idleDetection]
  
  @js.native
  sealed trait idref
    extends StObject
       with AXValueType
  inline def idref: idref = "idref".asInstanceOf[idref]
  
  @js.native
  sealed trait idrefList
    extends StObject
       with AXValueType
  inline def idrefList: idrefList = "idrefList".asInstanceOf[idrefList]
  
  @js.native
  sealed trait `implicit`
    extends StObject
       with AXValueSourceType
  inline def `implicit`: `implicit` = "implicit".asInstanceOf[`implicit`]
  
  @js.native
  sealed trait importRule
    extends StObject
       with CSSMediaSource
  inline def importRule: importRule = "importRule".asInstanceOf[importRule]
  
  @js.native
  sealed trait inProgress
    extends StObject
       with DownloadProgressEventState
       with typings.devtoolsProtocol.mod.Protocol.Browser.DownloadProgressEventState
  inline def inProgress: inProgress = "inProgress".asInstanceOf[inProgress]
  
  @js.native
  sealed trait indexedDBContentUpdated extends StObject
  inline def indexedDBContentUpdated: indexedDBContentUpdated = "indexedDBContentUpdated".asInstanceOf[indexedDBContentUpdated]
  
  @js.native
  sealed trait indexedDBListUpdated extends StObject
  inline def indexedDBListUpdated: indexedDBListUpdated = "indexedDBListUpdated".asInstanceOf[indexedDBListUpdated]
  
  @js.native
  sealed trait indexeddb
    extends StObject
       with StorageType
  inline def indexeddb: indexeddb = "indexeddb".asInstanceOf[indexeddb]
  
  @js.native
  sealed trait info
    extends StObject
       with ConsoleAPICalledEventType
       with ConsoleMessageLevel
       with LogEntryLevel
       with PlayerMessageLevel
       with SecurityState
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait injected
    extends StObject
       with StyleSheetOrigin
  inline def injected: injected = "injected".asInstanceOf[injected]
  
  @js.native
  sealed trait inlineSheet
    extends StObject
       with CSSMediaSource
  inline def inlineSheet: inlineSheet = "inlineSheet".asInstanceOf[inlineSheet]
  
  @js.native
  sealed trait inlineStyleInvalidated extends StObject
  inline def inlineStyleInvalidated: inlineStyleInvalidated = "inlineStyleInvalidated".asInstanceOf[inlineStyleInvalidated]
  
  @js.native
  sealed trait `input-list-button`
    extends StObject
       with PseudoType
  inline def `input-list-button`: `input-list-button` = "input-list-button".asInstanceOf[`input-list-button`]
  
  @js.native
  sealed trait `insecure-broken`
    extends StObject
       with SecurityState
  inline def `insecure-broken`: `insecure-broken` = "insecure-broken".asInstanceOf[`insecure-broken`]
  
  @js.native
  sealed trait insecure_
    extends StObject
       with SecurityState
  inline def insecure_ : insecure_ = "insecure".asInstanceOf[insecure_]
  
  @js.native
  sealed trait inspectModeCanceled extends StObject
  inline def inspectModeCanceled: inspectModeCanceled = "inspectModeCanceled".asInstanceOf[inspectModeCanceled]
  
  @js.native
  sealed trait inspectNodeRequested extends StObject
  inline def inspectNodeRequested: inspectNodeRequested = "inspectNodeRequested".asInstanceOf[inspectNodeRequested]
  
  @js.native
  sealed trait inspectRequested extends StObject
  inline def inspectRequested: inspectRequested = "inspectRequested".asInstanceOf[inspectRequested]
  
  @js.native
  sealed trait inspector
    extends StObject
       with BlockedReason
       with StyleSheetOrigin
  inline def inspector: inspector = "inspector".asInstanceOf[inspector]
  
  @js.native
  sealed trait installed
    extends StObject
       with ServiceWorkerVersionStatus
  inline def installed: installed = "installed".asInstanceOf[installed]
  
  @js.native
  sealed trait installing
    extends StObject
       with ServiceWorkerVersionStatus
  inline def installing: installing = "installing".asInstanceOf[installing]
  
  @js.native
  sealed trait instrumentation
    extends StObject
       with PausedEventReason
  inline def instrumentation: instrumentation = "instrumentation".asInstanceOf[instrumentation]
  
  @js.native
  sealed trait integer
    extends StObject
       with AXValueType
  inline def integer: integer = "integer".asInstanceOf[integer]
  
  @js.native
  sealed trait `interest-cohort`
    extends StObject
       with PermissionsPolicyFeature
  inline def `interest-cohort`: `interest-cohort` = "interest-cohort".asInstanceOf[`interest-cohort`]
  
  @js.native
  sealed trait interestGroupAccessed extends StObject
  inline def interestGroupAccessed: interestGroupAccessed = "interestGroupAccessed".asInstanceOf[interestGroupAccessed]
  
  @js.native
  sealed trait interest_groups
    extends StObject
       with StorageType
  inline def interest_groups: interest_groups = "interest_groups".asInstanceOf[interest_groups]
  
  @js.native
  sealed trait internal
    extends StObject
       with AuthenticatorTransport
  inline def internal: internal = "internal".asInstanceOf[internal]
  
  @js.native
  sealed trait internalRole
    extends StObject
       with AXValueType
  inline def internalRole: internalRole = "internalRole".asInstanceOf[internalRole]
  
  @js.native
  sealed trait interstitialHidden extends StObject
  inline def interstitialHidden: interstitialHidden = "interstitialHidden".asInstanceOf[interstitialHidden]
  
  @js.native
  sealed trait interstitialShown extends StObject
  inline def interstitialShown: interstitialShown = "interstitialShown".asInstanceOf[interstitialShown]
  
  @js.native
  sealed trait intervention
    extends StObject
       with LogEntrySource
  inline def intervention: intervention = "intervention".asInstanceOf[intervention]
  
  @js.native
  sealed trait invalid
    extends StObject
       with AXPropertyName
  inline def invalid: invalid = "invalid".asInstanceOf[invalid]
  
  @js.native
  sealed trait issueAdded extends StObject
  inline def issueAdded: issueAdded = "issueAdded".asInstanceOf[issueAdded]
  
  @js.native
  sealed trait issueUpdated extends StObject
  inline def issueUpdated: issueUpdated = "issueUpdated".asInstanceOf[issueUpdated]
  
  @js.native
  sealed trait iterator
    extends StObject
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  inline def iterator: iterator = "iterator".asInstanceOf[iterator]
  
  @js.native
  sealed trait javascriptDialogClosed extends StObject
  inline def javascriptDialogClosed: javascriptDialogClosed = "javascriptDialogClosed".asInstanceOf[javascriptDialogClosed]
  
  @js.native
  sealed trait javascriptDialogOpening extends StObject
  inline def javascriptDialogOpening: javascriptDialogOpening = "javascriptDialogOpening".asInstanceOf[javascriptDialogOpening]
  
  @js.native
  sealed trait javascript_
    extends StObject
       with ConsoleMessageSource
       with LogEntrySource
  inline def javascript_ : javascript_ = "javascript".asInstanceOf[javascript_]
  
  @js.native
  sealed trait join
    extends StObject
       with InterestGroupAccessType
  inline def join: join = "join".asInstanceOf[join]
  
  @js.native
  sealed trait `join-ad-interest-group`
    extends StObject
       with PermissionsPolicyFeature
  inline def `join-ad-interest-group`: `join-ad-interest-group` = "join-ad-interest-group".asInstanceOf[`join-ad-interest-group`]
  
  @js.native
  sealed trait jpeg
    extends StObject
       with CaptureScreenshotRequestFormat
       with GetEncodedResponseRequestEncoding
       with ImageType
       with ScreenshotParamsFormat
       with StartScreencastRequestFormat
  inline def jpeg: jpeg = "jpeg".asInstanceOf[jpeg]
  
  @js.native
  sealed trait json
    extends StObject
       with StreamFormat
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait jxl
    extends StObject
       with DisabledImageType
  inline def jxl: jxl = "jxl".asInstanceOf[jxl]
  
  @js.native
  sealed trait `k-rate`
    extends StObject
       with AutomationRate
  inline def `k-rate`: `k-rate` = "k-rate".asInstanceOf[`k-rate`]
  
  @js.native
  sealed trait kDigitalAssetLinks
    extends StObject
       with TwaQualityEnforcementViolationType
  inline def kDigitalAssetLinks: kDigitalAssetLinks = "kDigitalAssetLinks".asInstanceOf[kDigitalAssetLinks]
  
  @js.native
  sealed trait kEvalViolation
    extends StObject
       with ContentSecurityPolicyViolationType
  inline def kEvalViolation: kEvalViolation = "kEvalViolation".asInstanceOf[kEvalViolation]
  
  @js.native
  sealed trait kHttpError
    extends StObject
       with TwaQualityEnforcementViolationType
  inline def kHttpError: kHttpError = "kHttpError".asInstanceOf[kHttpError]
  
  @js.native
  sealed trait kInlineViolation
    extends StObject
       with ContentSecurityPolicyViolationType
  inline def kInlineViolation: kInlineViolation = "kInlineViolation".asInstanceOf[kInlineViolation]
  
  @js.native
  sealed trait kTrustedTypesPolicyViolation
    extends StObject
       with ContentSecurityPolicyViolationType
  inline def kTrustedTypesPolicyViolation: kTrustedTypesPolicyViolation = "kTrustedTypesPolicyViolation".asInstanceOf[kTrustedTypesPolicyViolation]
  
  @js.native
  sealed trait kTrustedTypesSinkViolation
    extends StObject
       with ContentSecurityPolicyViolationType
  inline def kTrustedTypesSinkViolation: kTrustedTypesSinkViolation = "kTrustedTypesSinkViolation".asInstanceOf[kTrustedTypesSinkViolation]
  
  @js.native
  sealed trait kURLViolation
    extends StObject
       with ContentSecurityPolicyViolationType
  inline def kURLViolation: kURLViolation = "kURLViolation".asInstanceOf[kURLViolation]
  
  @js.native
  sealed trait kUnavailableOffline
    extends StObject
       with TwaQualityEnforcementViolationType
  inline def kUnavailableOffline: kUnavailableOffline = "kUnavailableOffline".asInstanceOf[kUnavailableOffline]
  
  @js.native
  sealed trait kWasmEvalViolation
    extends StObject
       with ContentSecurityPolicyViolationType
  inline def kWasmEvalViolation: kWasmEvalViolation = "kWasmEvalViolation".asInstanceOf[kWasmEvalViolation]
  
  @js.native
  sealed trait keyDown
    extends StObject
       with DispatchKeyEventRequestType
  inline def keyDown: keyDown = "keyDown".asInstanceOf[keyDown]
  
  @js.native
  sealed trait keyUp
    extends StObject
       with DispatchKeyEventRequestType
  inline def keyUp: keyUp = "keyUp".asInstanceOf[keyUp]
  
  @js.native
  sealed trait `keyboard-map`
    extends StObject
       with PermissionsPolicyFeature
  inline def `keyboard-map`: `keyboard-map` = "keyboard-map".asInstanceOf[`keyboard-map`]
  
  @js.native
  sealed trait keyshortcuts
    extends StObject
       with AXPropertyName
  inline def keyshortcuts: keyshortcuts = "keyshortcuts".asInstanceOf[keyshortcuts]
  
  @js.native
  sealed trait keyword
    extends StObject
       with TransitionType
  inline def keyword: keyword = "keyword".asInstanceOf[keyword]
  
  @js.native
  sealed trait keyword_generated
    extends StObject
       with TransitionType
  inline def keyword_generated: keyword_generated = "keyword_generated".asInstanceOf[keyword_generated]
  
  @js.native
  sealed trait label
    extends StObject
       with AXValueNativeSourceType
  inline def label: label = "label".asInstanceOf[label]
  
  @js.native
  sealed trait labelfor
    extends StObject
       with AXValueNativeSourceType
  inline def labelfor: labelfor = "labelfor".asInstanceOf[labelfor]
  
  @js.native
  sealed trait labelledby
    extends StObject
       with AXPropertyName
  inline def labelledby: labelledby = "labelledby".asInstanceOf[labelledby]
  
  @js.native
  sealed trait labelwrapped
    extends StObject
       with AXValueNativeSourceType
  inline def labelwrapped: labelwrapped = "labelwrapped".asInstanceOf[labelwrapped]
  
  @js.native
  sealed trait landscapePrimary
    extends StObject
       with ScreenOrientationType
  inline def landscapePrimary: landscapePrimary = "landscapePrimary".asInstanceOf[landscapePrimary]
  
  @js.native
  sealed trait landscapeSecondary
    extends StObject
       with ScreenOrientationType
  inline def landscapeSecondary: landscapeSecondary = "landscapeSecondary".asInstanceOf[landscapeSecondary]
  
  @js.native
  sealed trait lastSeenObjectId extends StObject
  inline def lastSeenObjectId: lastSeenObjectId = "lastSeenObjectId".asInstanceOf[lastSeenObjectId]
  
  @js.native
  sealed trait layerPainted extends StObject
  inline def layerPainted: layerPainted = "layerPainted".asInstanceOf[layerPainted]
  
  @js.native
  sealed trait layerTreeDidChange extends StObject
  inline def layerTreeDidChange: layerTreeDidChange = "layerTreeDidChange".asInstanceOf[layerTreeDidChange]
  
  @js.native
  sealed trait leave
    extends StObject
       with InterestGroupAccessType
  inline def leave: leave = "leave".asInstanceOf[leave]
  
  @js.native
  sealed trait left
    extends StObject
       with MouseButton
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait legend
    extends StObject
       with AXValueNativeSourceType
  inline def legend: legend = "legend".asInstanceOf[legend]
  
  @js.native
  sealed trait level
    extends StObject
       with AXPropertyName
  inline def level: level = "level".asInstanceOf[level]
  
  @js.native
  sealed trait lifecycleEvent extends StObject
  inline def lifecycleEvent: lifecycleEvent = "lifecycleEvent".asInstanceOf[lifecycleEvent]
  
  @js.native
  sealed trait light
    extends StObject
       with MemoryDumpLevelOfDetail
  inline def light: light = "light".asInstanceOf[light]
  
  @js.native
  sealed trait link
    extends StObject
       with TransitionType
  inline def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait linkedSheet
    extends StObject
       with CSSMediaSource
  inline def linkedSheet: linkedSheet = "linkedSheet".asInstanceOf[linkedSheet]
  
  @js.native
  sealed trait live
    extends StObject
       with AXPropertyName
  inline def live: live = "live".asInstanceOf[live]
  
  @js.native
  sealed trait loadComplete extends StObject
  inline def loadComplete: loadComplete = "loadComplete".asInstanceOf[loadComplete]
  
  @js.native
  sealed trait loadEventFired extends StObject
  inline def loadEventFired: loadEventFired = "loadEventFired".asInstanceOf[loadEventFired]
  
  @js.native
  sealed trait loadingFailed extends StObject
  inline def loadingFailed: loadingFailed = "loadingFailed".asInstanceOf[loadingFailed]
  
  @js.native
  sealed trait loadingFinished extends StObject
  inline def loadingFinished: loadingFinished = "loadingFinished".asInstanceOf[loadingFinished]
  
  @js.native
  sealed trait `local-fonts`
    extends StObject
       with PermissionsPolicyFeature
  inline def `local-fonts`: `local-fonts` = "local-fonts".asInstanceOf[`local-fonts`]
  
  @js.native
  sealed trait local_
    extends StObject
       with ScopeType
  inline def local_ : local_ = "local".asInstanceOf[local_]
  
  @js.native
  sealed trait local_storage
    extends StObject
       with StorageType
  inline def local_storage: local_storage = "local_storage".asInstanceOf[local_storage]
  
  @js.native
  sealed trait log
    extends StObject
       with ConsoleAPICalledEventType
       with ConsoleMessageLevel
  inline def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait longLayout
    extends StObject
       with ViolationSettingName
  inline def longLayout: longLayout = "longLayout".asInstanceOf[longLayout]
  
  @js.native
  sealed trait longTask
    extends StObject
       with ViolationSettingName
  inline def longTask: longTask = "longTask".asInstanceOf[longTask]
  
  @js.native
  sealed trait lookalike
    extends StObject
       with SafetyTipStatus
  inline def lookalike: lookalike = "lookalike".asInstanceOf[lookalike]
  
  @js.native
  sealed trait magnetometer
    extends StObject
       with PermissionsPolicyFeature
  inline def magnetometer: magnetometer = "magnetometer".asInstanceOf[magnetometer]
  
  @js.native
  sealed trait mainJobWonRace
    extends StObject
       with AlternateProtocolUsage
  inline def mainJobWonRace: mainJobWonRace = "mainJobWonRace".asInstanceOf[mainJobWonRace]
  
  @js.native
  sealed trait manual_subframe
    extends StObject
       with TransitionType
  inline def manual_subframe: manual_subframe = "manual_subframe".asInstanceOf[manual_subframe]
  
  @js.native
  sealed trait map
    extends StObject
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
       with WebDriverValueType
  inline def map: map = "map".asInstanceOf[map]
  
  @js.native
  sealed trait mappingMissing
    extends StObject
       with AlternateProtocolUsage
  inline def mappingMissing: mappingMissing = "mappingMissing".asInstanceOf[mappingMissing]
  
  @js.native
  sealed trait marker
    extends StObject
       with PseudoType
  inline def marker: marker = "marker".asInstanceOf[marker]
  
  @js.native
  sealed trait max
    extends StObject
       with ChannelCountMode
  inline def max: max = "max".asInstanceOf[max]
  
  @js.native
  sealed trait maximized
    extends StObject
       with WindowState
  inline def maximized: maximized = "maximized".asInstanceOf[maximized]
  
  @js.native
  sealed trait mediaQueryResultChanged extends StObject
  inline def mediaQueryResultChanged: mediaQueryResultChanged = "mediaQueryResultChanged".asInstanceOf[mediaQueryResultChanged]
  
  @js.native
  sealed trait mediaRule
    extends StObject
       with CSSMediaSource
  inline def mediaRule: mediaRule = "mediaRule".asInstanceOf[mediaRule]
  
  @js.native
  sealed trait messageAdded extends StObject
  inline def messageAdded: messageAdded = "messageAdded".asInstanceOf[messageAdded]
  
  @js.native
  sealed trait metaTagRefresh
    extends StObject
       with ClientNavigationReason
  inline def metaTagRefresh: metaTagRefresh = "metaTagRefresh".asInstanceOf[metaTagRefresh]
  
  @js.native
  sealed trait metrics extends StObject
  inline def metrics: metrics = "metrics".asInstanceOf[metrics]
  
  @js.native
  sealed trait mhtml extends StObject
  inline def mhtml: mhtml = "mhtml".asInstanceOf[mhtml]
  
  @js.native
  sealed trait microphone
    extends StObject
       with PermissionsPolicyFeature
  inline def microphone: microphone = "microphone".asInstanceOf[microphone]
  
  @js.native
  sealed trait middle
    extends StObject
       with MouseButton
  inline def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait midi
    extends StObject
       with PermissionType
       with PermissionsPolicyFeature
  inline def midi: midi = "midi".asInstanceOf[midi]
  
  @js.native
  sealed trait midiSysex
    extends StObject
       with PermissionType
  inline def midiSysex: midiSysex = "midiSysex".asInstanceOf[midiSysex]
  
  @js.native
  sealed trait minimized
    extends StObject
       with WindowState
  inline def minimized: minimized = "minimized".asInstanceOf[minimized]
  
  @js.native
  sealed trait `mixed-content`
    extends StObject
       with BlockedReason
  inline def `mixed-content`: `mixed-content` = "mixed-content".asInstanceOf[`mixed-content`]
  
  @js.native
  sealed trait mobile
    extends StObject
       with SetEmitTouchEventsForMouseRequestConfiguration
       with SetTouchEmulationEnabledRequestConfiguration
  inline def mobile: mobile = "mobile".asInstanceOf[mobile]
  
  @js.native
  sealed trait modal
    extends StObject
       with AXPropertyName
  inline def modal: modal = "modal".asInstanceOf[modal]
  
  @js.native
  sealed trait moderate
    extends StObject
       with PressureLevel
  inline def moderate: moderate = "moderate".asInstanceOf[moderate]
  
  @js.native
  sealed trait module
    extends StObject
       with ScopeType
  inline def module: module = "module".asInstanceOf[module]
  
  @js.native
  sealed trait mouse
    extends StObject
       with DispatchMouseEventRequestPointerType
       with GestureSourceType
  inline def mouse: mouse = "mouse".asInstanceOf[mouse]
  
  @js.native
  sealed trait mouseMoved
    extends StObject
       with DispatchMouseEventRequestType
       with EmulateTouchFromMouseEventRequestType
  inline def mouseMoved: mouseMoved = "mouseMoved".asInstanceOf[mouseMoved]
  
  @js.native
  sealed trait mousePressed
    extends StObject
       with DispatchMouseEventRequestType
       with EmulateTouchFromMouseEventRequestType
  inline def mousePressed: mousePressed = "mousePressed".asInstanceOf[mousePressed]
  
  @js.native
  sealed trait mouseReleased
    extends StObject
       with DispatchMouseEventRequestType
       with EmulateTouchFromMouseEventRequestType
  inline def mouseReleased: mouseReleased = "mouseReleased".asInstanceOf[mouseReleased]
  
  @js.native
  sealed trait mouseWheel
    extends StObject
       with DispatchMouseEventRequestType
       with EmulateTouchFromMouseEventRequestType
  inline def mouseWheel: mouseWheel = "mouseWheel".asInstanceOf[mouseWheel]
  
  @js.native
  sealed trait multiline
    extends StObject
       with AXPropertyName
  inline def multiline: multiline = "multiline".asInstanceOf[multiline]
  
  @js.native
  sealed trait multiselectable
    extends StObject
       with AXPropertyName
  inline def multiselectable: multiselectable = "multiselectable".asInstanceOf[multiselectable]
  
  @js.native
  sealed trait navigatedWithinDocument extends StObject
  inline def navigatedWithinDocument: navigatedWithinDocument = "navigatedWithinDocument".asInstanceOf[navigatedWithinDocument]
  
  @js.native
  sealed trait needsBeginFramesChanged extends StObject
  inline def needsBeginFramesChanged: needsBeginFramesChanged = "needsBeginFramesChanged".asInstanceOf[needsBeginFramesChanged]
  
  @js.native
  sealed trait network
    extends StObject
       with ConsoleMessageSource
       with LogEntrySource
       with ServiceWorkerResponseSource
  inline def network: network = "network".asInstanceOf[network]
  
  @js.native
  sealed trait neutral
    extends StObject
       with SecurityState
  inline def neutral: neutral = "neutral".asInstanceOf[neutral]
  
  @js.native
  sealed trait `new`
    extends StObject
       with ServiceWorkerVersionStatus
  inline def `new`: `new` = "new".asInstanceOf[`new`]
  
  @js.native
  sealed trait newTab
    extends StObject
       with ClientNavigationDisposition
  inline def newTab: newTab = "newTab".asInstanceOf[newTab]
  
  @js.native
  sealed trait newWindow
    extends StObject
       with ClientNavigationDisposition
  inline def newWindow: newWindow = "newWindow".asInstanceOf[newWindow]
  
  @js.native
  sealed trait nfc
    extends StObject
       with AuthenticatorTransport
       with PermissionType
  inline def nfc: nfc = "nfc".asInstanceOf[nfc]
  
  @js.native
  sealed trait `no-referrer`
    extends StObject
       with RequestReferrerPolicy
  inline def `no-referrer`: `no-referrer` = "no-referrer".asInstanceOf[`no-referrer`]
  
  @js.native
  sealed trait `no-referrer-when-downgrade`
    extends StObject
       with RequestReferrerPolicy
  inline def `no-referrer-when-downgrade`: `no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[`no-referrer-when-downgrade`]
  
  @js.native
  sealed trait noReferrer
    extends StObject
       with ReferrerPolicy
  inline def noReferrer: noReferrer = "noReferrer".asInstanceOf[noReferrer]
  
  @js.native
  sealed trait noReferrerWhenDowngrade
    extends StObject
       with ReferrerPolicy
  inline def noReferrerWhenDowngrade: noReferrerWhenDowngrade = "noReferrerWhenDowngrade".asInstanceOf[noReferrerWhenDowngrade]
  
  @js.native
  sealed trait node
    extends StObject
       with AXValueType
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
       with WebDriverValueType
  inline def node: node = "node".asInstanceOf[node]
  
  @js.native
  sealed trait `node-removed`
    extends StObject
       with DOMBreakpointType
  inline def `node-removed`: `node-removed` = "node-removed".asInstanceOf[`node-removed`]
  
  @js.native
  sealed trait nodeHighlightRequested extends StObject
  inline def nodeHighlightRequested: nodeHighlightRequested = "nodeHighlightRequested".asInstanceOf[nodeHighlightRequested]
  
  @js.native
  sealed trait nodeList
    extends StObject
       with AXValueType
  inline def nodeList: nodeList = "nodeList".asInstanceOf[nodeList]
  
  @js.native
  sealed trait nodeParamConnected extends StObject
  inline def nodeParamConnected: nodeParamConnected = "nodeParamConnected".asInstanceOf[nodeParamConnected]
  
  @js.native
  sealed trait nodeParamDisconnected extends StObject
  inline def nodeParamDisconnected: nodeParamDisconnected = "nodeParamDisconnected".asInstanceOf[nodeParamDisconnected]
  
  @js.native
  sealed trait nodesConnected extends StObject
  inline def nodesConnected: nodesConnected = "nodesConnected".asInstanceOf[nodesConnected]
  
  @js.native
  sealed trait nodesDisconnected extends StObject
  inline def nodesDisconnected: nodesDisconnected = "nodesDisconnected".asInstanceOf[nodesDisconnected]
  
  @js.native
  sealed trait nodesUpdated extends StObject
  inline def nodesUpdated: nodesUpdated = "nodesUpdated".asInstanceOf[nodesUpdated]
  
  @js.native
  sealed trait none_
    extends StObject
       with AdFrameType
       with ConnectionType
       with EnableRequestIncludeWhitespace
       with InspectMode
       with MixedContentType
       with MouseButton
       with SetEmulatedVisionDeficiencyRequestType
       with SetPauseOnExceptionsRequestState
       with SetSPCTransactionModeRequestMode
       with StreamCompression
  inline def none_ : none_ = "none".asInstanceOf[none_]
  
  @js.native
  sealed trait normal
    extends StObject
       with WindowState
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait `not-compliant`
    extends StObject
       with CertificateTransparencyCompliance
  inline def `not-compliant`: `not-compliant` = "not-compliant".asInstanceOf[`not-compliant`]
  
  @js.native
  sealed trait notifications
    extends StObject
       with PermissionType
       with ServiceName
  inline def notifications: notifications = "notifications".asInstanceOf[notifications]
  
  @js.native
  sealed trait `null`
    extends StObject
       with KeyPathType
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
       with WebDriverValueType
  inline def `null`: `null` = "null".asInstanceOf[`null`]
  
  @js.native
  sealed trait number
    extends StObject
       with AXValueType
       with KeyType
       with ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
       with WebDriverValueType
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait `object`
    extends StObject
       with ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
       with WebDriverValueType
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait offline
    extends StObject
       with ContextType
  inline def offline: offline = "offline".asInstanceOf[offline]
  
  @js.native
  sealed trait opaqueRedirect
    extends StObject
       with CachedResponseType
  inline def opaqueRedirect: opaqueRedirect = "opaqueRedirect".asInstanceOf[opaqueRedirect]
  
  @js.native
  sealed trait opaqueResponse
    extends StObject
       with CachedResponseType
  inline def opaqueResponse: opaqueResponse = "opaqueResponse".asInstanceOf[opaqueResponse]
  
  @js.native
  sealed trait open
    extends StObject
       with ShadowRootType
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait openTabSearch
    extends StObject
       with BrowserCommandId
  inline def openTabSearch: openTabSearch = "openTabSearch".asInstanceOf[openTabSearch]
  
  @js.native
  sealed trait `optionally-blockable`
    extends StObject
       with MixedContentType
  inline def `optionally-blockable`: `optionally-blockable` = "optionally-blockable".asInstanceOf[`optionally-blockable`]
  
  @js.native
  sealed trait orientation
    extends StObject
       with AXPropertyName
  inline def orientation: orientation = "orientation".asInstanceOf[orientation]
  
  @js.native
  sealed trait origin
    extends StObject
       with BlockedReason
       with ReferrerPolicy
       with RequestReferrerPolicy
  inline def origin: origin = "origin".asInstanceOf[origin]
  
  @js.native
  sealed trait `origin-when-cross-origin`
    extends StObject
       with RequestReferrerPolicy
  inline def `origin-when-cross-origin`: `origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[`origin-when-cross-origin`]
  
  @js.native
  sealed trait originWhenCrossOrigin
    extends StObject
       with ReferrerPolicy
  inline def originWhenCrossOrigin: originWhenCrossOrigin = "originWhenCrossOrigin".asInstanceOf[originWhenCrossOrigin]
  
  @js.native
  sealed trait other_
    extends StObject
       with AXValueNativeSourceType
       with BlockedReason
       with ConnectionType
       with ConsoleMessageSource
       with InitiatorType
       with LogEntrySource
       with PausedEventReason
       with StorageType
       with TransitionType
  inline def other_ : other_ = "other".asInstanceOf[other_]
  
  @js.native
  sealed trait `otp-credentials`
    extends StObject
       with PermissionsPolicyFeature
  inline def `otp-credentials`: `otp-credentials` = "otp-credentials".asInstanceOf[`otp-credentials`]
  
  @js.native
  sealed trait owns
    extends StObject
       with AXPropertyName
  inline def owns: owns = "owns".asInstanceOf[owns]
  
  @js.native
  sealed trait `page-transition`
    extends StObject
       with PseudoType
  inline def `page-transition`: `page-transition` = "page-transition".asInstanceOf[`page-transition`]
  
  @js.native
  sealed trait `page-transition-container`
    extends StObject
       with PseudoType
  inline def `page-transition-container`: `page-transition-container` = "page-transition-container".asInstanceOf[`page-transition-container`]
  
  @js.native
  sealed trait `page-transition-image-wrapper`
    extends StObject
       with PseudoType
  inline def `page-transition-image-wrapper`: `page-transition-image-wrapper` = "page-transition-image-wrapper".asInstanceOf[`page-transition-image-wrapper`]
  
  @js.native
  sealed trait `page-transition-incoming-image`
    extends StObject
       with PseudoType
  inline def `page-transition-incoming-image`: `page-transition-incoming-image` = "page-transition-incoming-image".asInstanceOf[`page-transition-incoming-image`]
  
  @js.native
  sealed trait `page-transition-outgoing-image`
    extends StObject
       with PseudoType
  inline def `page-transition-outgoing-image`: `page-transition-outgoing-image` = "page-transition-outgoing-image".asInstanceOf[`page-transition-outgoing-image`]
  
  @js.native
  sealed trait pageBlockInterstitial
    extends StObject
       with ClientNavigationReason
  inline def pageBlockInterstitial: pageBlockInterstitial = "pageBlockInterstitial".asInstanceOf[pageBlockInterstitial]
  
  @js.native
  sealed trait parser
    extends StObject
       with InitiatorType
  inline def parser: parser = "parser".asInstanceOf[parser]
  
  @js.native
  sealed trait pause
    extends StObject
       with VirtualTimePolicy
  inline def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait pauseIfNetworkFetchesPending
    extends StObject
       with VirtualTimePolicy
  inline def pauseIfNetworkFetchesPending: pauseIfNetworkFetchesPending = "pauseIfNetworkFetchesPending".asInstanceOf[pauseIfNetworkFetchesPending]
  
  @js.native
  sealed trait paused extends StObject
  inline def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait payment
    extends StObject
       with PermissionsPolicyFeature
  inline def payment: payment = "payment".asInstanceOf[payment]
  
  @js.native
  sealed trait paymentHandler
    extends StObject
       with PermissionType
       with ServiceName
  inline def paymentHandler: paymentHandler = "paymentHandler".asInstanceOf[paymentHandler]
  
  @js.native
  sealed trait pen
    extends StObject
       with DispatchMouseEventRequestPointerType
  inline def pen: pen = "pen".asInstanceOf[pen]
  
  @js.native
  sealed trait periodicBackgroundSync
    extends StObject
       with PermissionType
       with ServiceName
  inline def periodicBackgroundSync: periodicBackgroundSync = "periodicBackgroundSync".asInstanceOf[periodicBackgroundSync]
  
  @js.native
  sealed trait `picture-in-picture`
    extends StObject
       with PermissionsPolicyFeature
  inline def `picture-in-picture`: `picture-in-picture` = "picture-in-picture".asInstanceOf[`picture-in-picture`]
  
  @js.native
  sealed trait placeholder
    extends StObject
       with AXValueSourceType
  inline def placeholder: placeholder = "placeholder".asInstanceOf[placeholder]
  
  @js.native
  sealed trait playerErrorsRaised extends StObject
  inline def playerErrorsRaised: playerErrorsRaised = "playerErrorsRaised".asInstanceOf[playerErrorsRaised]
  
  @js.native
  sealed trait playerEventsAdded extends StObject
  inline def playerEventsAdded: playerEventsAdded = "playerEventsAdded".asInstanceOf[playerEventsAdded]
  
  @js.native
  sealed trait playerMessagesLogged extends StObject
  inline def playerMessagesLogged: playerMessagesLogged = "playerMessagesLogged".asInstanceOf[playerMessagesLogged]
  
  @js.native
  sealed trait playerPropertiesChanged extends StObject
  inline def playerPropertiesChanged: playerPropertiesChanged = "playerPropertiesChanged".asInstanceOf[playerPropertiesChanged]
  
  @js.native
  sealed trait playersCreated extends StObject
  inline def playersCreated: playersCreated = "playersCreated".asInstanceOf[playersCreated]
  
  @js.native
  sealed trait png
    extends StObject
       with CaptureScreenshotRequestFormat
       with GetEncodedResponseRequestEncoding
       with ScreenshotParamsFormat
       with StartScreencastRequestFormat
  inline def png: png = "png".asInstanceOf[png]
  
  @js.native
  sealed trait portraitPrimary
    extends StObject
       with ScreenOrientationType
  inline def portraitPrimary: portraitPrimary = "portraitPrimary".asInstanceOf[portraitPrimary]
  
  @js.native
  sealed trait portraitSecondary
    extends StObject
       with ScreenOrientationType
  inline def portraitSecondary: portraitSecondary = "portraitSecondary".asInstanceOf[portraitSecondary]
  
  @js.native
  sealed trait preciseCoverageDeltaUpdate extends StObject
  inline def preciseCoverageDeltaUpdate: preciseCoverageDeltaUpdate = "preciseCoverageDeltaUpdate".asInstanceOf[preciseCoverageDeltaUpdate]
  
  @js.native
  sealed trait preflight_
    extends StObject
       with InitiatorType
  inline def preflight_ : preflight_ = "preflight".asInstanceOf[preflight_]
  
  @js.native
  sealed trait preload
    extends StObject
       with InitiatorType
  inline def preload: preload = "preload".asInstanceOf[preload]
  
  @js.native
  sealed trait prerenderAttemptCompleted extends StObject
  inline def prerenderAttemptCompleted: prerenderAttemptCompleted = "prerenderAttemptCompleted".asInstanceOf[prerenderAttemptCompleted]
  
  @js.native
  sealed trait pressed
    extends StObject
       with AXPropertyName
  inline def pressed: pressed = "pressed".asInstanceOf[pressed]
  
  @js.native
  sealed trait profile
    extends StObject
       with ConsoleAPICalledEventType
  inline def profile: profile = "profile".asInstanceOf[profile]
  
  @js.native
  sealed trait profileEnd
    extends StObject
       with ConsoleAPICalledEventType
  inline def profileEnd: profileEnd = "profileEnd".asInstanceOf[profileEnd]
  
  @js.native
  sealed trait promise
    extends StObject
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
       with WebDriverValueType
  inline def promise: promise = "promise".asInstanceOf[promise]
  
  @js.native
  sealed trait promiseRejection
    extends StObject
       with PausedEventReason
  inline def promiseRejection: promiseRejection = "promiseRejection".asInstanceOf[promiseRejection]
  
  @js.native
  sealed trait prompt
    extends StObject
       with DialogType
       with PermissionSetting
  inline def prompt: prompt = "prompt".asInstanceOf[prompt]
  
  @js.native
  sealed trait protanopia
    extends StObject
       with SetEmulatedVisionDeficiencyRequestType
  inline def protanopia: protanopia = "protanopia".asInstanceOf[protanopia]
  
  @js.native
  sealed trait protectedMediaIdentifier
    extends StObject
       with PermissionType
  inline def protectedMediaIdentifier: protectedMediaIdentifier = "protectedMediaIdentifier".asInstanceOf[protectedMediaIdentifier]
  
  @js.native
  sealed trait proto
    extends StObject
       with StreamFormat
  inline def proto: proto = "proto".asInstanceOf[proto]
  
  @js.native
  sealed trait proxy_
    extends StObject
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
       with WebDriverValueType
  inline def proxy_ : proxy_ = "proxy".asInstanceOf[proxy_]
  
  @js.native
  sealed trait pseudoElementAdded extends StObject
  inline def pseudoElementAdded: pseudoElementAdded = "pseudoElementAdded".asInstanceOf[pseudoElementAdded]
  
  @js.native
  sealed trait pseudoElementRemoved extends StObject
  inline def pseudoElementRemoved: pseudoElementRemoved = "pseudoElementRemoved".asInstanceOf[pseudoElementRemoved]
  
  @js.native
  sealed trait `publickey-credentials-get`
    extends StObject
       with PermissionsPolicyFeature
  inline def `publickey-credentials-get`: `publickey-credentials-get` = "publickey-credentials-get".asInstanceOf[`publickey-credentials-get`]
  
  @js.native
  sealed trait pushMessaging
    extends StObject
       with ServiceName
  inline def pushMessaging: pushMessaging = "pushMessaging".asInstanceOf[pushMessaging]
  
  @js.native
  sealed trait rawKeyDown
    extends StObject
       with DispatchKeyEventRequestType
  inline def rawKeyDown: rawKeyDown = "rawKeyDown".asInstanceOf[rawKeyDown]
  
  @js.native
  sealed trait readonly
    extends StObject
       with AXPropertyName
  inline def readonly: readonly = "readonly".asInstanceOf[readonly]
  
  @js.native
  sealed trait realtime
    extends StObject
       with ContextType
  inline def realtime: realtime = "realtime".asInstanceOf[realtime]
  
  @js.native
  sealed trait receivedMessageFromTarget extends StObject
  inline def receivedMessageFromTarget: receivedMessageFromTarget = "receivedMessageFromTarget".asInstanceOf[receivedMessageFromTarget]
  
  @js.native
  sealed trait recommendation
    extends StObject
       with LogEntrySource
  inline def recommendation: recommendation = "recommendation".asInstanceOf[recommendation]
  
  @js.native
  sealed trait recordAsMuchAsPossible
    extends StObject
       with TraceConfigRecordMode
  inline def recordAsMuchAsPossible: recordAsMuchAsPossible = "recordAsMuchAsPossible".asInstanceOf[recordAsMuchAsPossible]
  
  @js.native
  sealed trait recordContinuously
    extends StObject
       with TraceConfigRecordMode
  inline def recordContinuously: recordContinuously = "recordContinuously".asInstanceOf[recordContinuously]
  
  @js.native
  sealed trait recordUntilFull
    extends StObject
       with TraceConfigRecordMode
  inline def recordUntilFull: recordUntilFull = "recordUntilFull".asInstanceOf[recordUntilFull]
  
  @js.native
  sealed trait recordingStateChanged extends StObject
  inline def recordingStateChanged: recordingStateChanged = "recordingStateChanged".asInstanceOf[recordingStateChanged]
  
  @js.native
  sealed trait recurringHandler
    extends StObject
       with ViolationSettingName
  inline def recurringHandler: recurringHandler = "recurringHandler".asInstanceOf[recurringHandler]
  
  @js.native
  sealed trait redundant
    extends StObject
       with ServiceWorkerVersionStatus
  inline def redundant: redundant = "redundant".asInstanceOf[redundant]
  
  @js.native
  sealed trait regexp
    extends StObject
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
       with WebDriverValueType
  inline def regexp: regexp = "regexp".asInstanceOf[regexp]
  
  @js.native
  sealed trait regular
    extends StObject
       with StyleSheetOrigin
  inline def regular: regular = "regular".asInstanceOf[regular]
  
  @js.native
  sealed trait relatedElement
    extends StObject
       with AXValueSourceType
  inline def relatedElement: relatedElement = "relatedElement".asInstanceOf[relatedElement]
  
  @js.native
  sealed trait relevant
    extends StObject
       with AXPropertyName
  inline def relevant: relevant = "relevant".asInstanceOf[relevant]
  
  @js.native
  sealed trait reload
    extends StObject
       with ClientNavigationReason
       with TransitionType
  inline def reload: reload = "reload".asInstanceOf[reload]
  
  @js.native
  sealed trait remove
    extends StObject
       with FrameDetachedEventReason
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait rendering
    extends StObject
       with ConsoleMessageSource
       with LogEntrySource
  inline def rendering: rendering = "rendering".asInstanceOf[rendering]
  
  @js.native
  sealed trait reportHeapSnapshotProgress extends StObject
  inline def reportHeapSnapshotProgress: reportHeapSnapshotProgress = "reportHeapSnapshotProgress".asInstanceOf[reportHeapSnapshotProgress]
  
  @js.native
  sealed trait reportingApiEndpointsChangedForOrigin extends StObject
  inline def reportingApiEndpointsChangedForOrigin: reportingApiEndpointsChangedForOrigin = "reportingApiEndpointsChangedForOrigin".asInstanceOf[reportingApiEndpointsChangedForOrigin]
  
  @js.native
  sealed trait reportingApiReportAdded extends StObject
  inline def reportingApiReportAdded: reportingApiReportAdded = "reportingApiReportAdded".asInstanceOf[reportingApiReportAdded]
  
  @js.native
  sealed trait reportingApiReportUpdated extends StObject
  inline def reportingApiReportUpdated: reportingApiReportUpdated = "reportingApiReportUpdated".asInstanceOf[reportingApiReportUpdated]
  
  @js.native
  sealed trait requestIntercepted extends StObject
  inline def requestIntercepted: requestIntercepted = "requestIntercepted".asInstanceOf[requestIntercepted]
  
  @js.native
  sealed trait requestPaused extends StObject
  inline def requestPaused: requestPaused = "requestPaused".asInstanceOf[requestPaused]
  
  @js.native
  sealed trait requestServedFromCache extends StObject
  inline def requestServedFromCache: requestServedFromCache = "requestServedFromCache".asInstanceOf[requestServedFromCache]
  
  @js.native
  sealed trait requestWillBeSent extends StObject
  inline def requestWillBeSent: requestWillBeSent = "requestWillBeSent".asInstanceOf[requestWillBeSent]
  
  @js.native
  sealed trait requestWillBeSentExtraInfo extends StObject
  inline def requestWillBeSentExtraInfo: requestWillBeSentExtraInfo = "requestWillBeSentExtraInfo".asInstanceOf[requestWillBeSentExtraInfo]
  
  @js.native
  sealed trait required
    extends StObject
       with AXPropertyName
  inline def required: required = "required".asInstanceOf[required]
  
  @js.native
  sealed trait resetProfiles extends StObject
  inline def resetProfiles: resetProfiles = "resetProfiles".asInstanceOf[resetProfiles]
  
  @js.native
  sealed trait resizer
    extends StObject
       with PseudoType
  inline def resizer: resizer = "resizer".asInstanceOf[resizer]
  
  @js.native
  sealed trait resourceChangedPriority extends StObject
  inline def resourceChangedPriority: resourceChangedPriority = "resourceChangedPriority".asInstanceOf[resourceChangedPriority]
  
  @js.native
  sealed trait responseReceived extends StObject
  inline def responseReceived: responseReceived = "responseReceived".asInstanceOf[responseReceived]
  
  @js.native
  sealed trait responseReceivedExtraInfo extends StObject
  inline def responseReceivedExtraInfo: responseReceivedExtraInfo = "responseReceivedExtraInfo".asInstanceOf[responseReceivedExtraInfo]
  
  @js.native
  sealed trait resumed extends StObject
  inline def resumed: resumed = "resumed".asInstanceOf[resumed]
  
  @js.native
  sealed trait `return`
    extends StObject
       with BreakLocationType
  inline def `return`: `return` = "return".asInstanceOf[`return`]
  
  @js.native
  sealed trait rgb
    extends StObject
       with ColorFormat
  inline def rgb: rgb = "rgb".asInstanceOf[rgb]
  
  @js.native
  sealed trait right
    extends StObject
       with MouseButton
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait role
    extends StObject
       with AXValueType
  inline def role: role = "role".asInstanceOf[role]
  
  @js.native
  sealed trait roledescription
    extends StObject
       with AXPropertyName
  inline def roledescription: roledescription = "roledescription".asInstanceOf[roledescription]
  
  @js.native
  sealed trait root
    extends StObject
       with AXPropertyName
       with AdFrameType
  inline def root: root = "root".asInstanceOf[root]
  
  @js.native
  sealed trait rubyannotation
    extends StObject
       with AXValueNativeSourceType
  inline def rubyannotation: rubyannotation = "rubyannotation".asInstanceOf[rubyannotation]
  
  @js.native
  sealed trait `run-ad-auction`
    extends StObject
       with PermissionsPolicyFeature
  inline def `run-ad-auction`: `run-ad-auction` = "run-ad-auction".asInstanceOf[`run-ad-auction`]
  
  @js.native
  sealed trait running
    extends StObject
       with ContextState
       with ServiceWorkerVersionRunningStatus
  inline def running: running = "running".asInstanceOf[running]
  
  @js.native
  sealed trait `same-origin`
    extends StObject
       with RequestReferrerPolicy
  inline def `same-origin`: `same-origin` = "same-origin".asInstanceOf[`same-origin`]
  
  @js.native
  sealed trait sameOrigin_
    extends StObject
       with ReferrerPolicy
  inline def sameOrigin_ : sameOrigin_ = "sameOrigin".asInstanceOf[sameOrigin_]
  
  @js.native
  sealed trait `screen-wake-lock`
    extends StObject
       with PermissionsPolicyFeature
  inline def `screen-wake-lock`: `screen-wake-lock` = "screen-wake-lock".asInstanceOf[`screen-wake-lock`]
  
  @js.native
  sealed trait screencastFrame extends StObject
  inline def screencastFrame: screencastFrame = "screencastFrame".asInstanceOf[screencastFrame]
  
  @js.native
  sealed trait screencastVisibilityChanged extends StObject
  inline def screencastVisibilityChanged: screencastVisibilityChanged = "screencastVisibilityChanged".asInstanceOf[screencastVisibilityChanged]
  
  @js.native
  sealed trait screenshotRequested extends StObject
  inline def screenshotRequested: screenshotRequested = "screenshotRequested".asInstanceOf[screenshotRequested]
  
  @js.native
  sealed trait scriptFailedToParse extends StObject
  inline def scriptFailedToParse: scriptFailedToParse = "scriptFailedToParse".asInstanceOf[scriptFailedToParse]
  
  @js.native
  sealed trait scriptInitiated
    extends StObject
       with ClientNavigationReason
  inline def scriptInitiated: scriptInitiated = "scriptInitiated".asInstanceOf[scriptInitiated]
  
  @js.native
  sealed trait scriptParsed extends StObject
  inline def scriptParsed: scriptParsed = "scriptParsed".asInstanceOf[scriptParsed]
  
  @js.native
  sealed trait script_
    extends StObject
       with InitiatorType
       with ScopeType
  inline def script_ : script_ = "script".asInstanceOf[script_]
  
  @js.native
  sealed trait scrollbar
    extends StObject
       with PseudoType
  inline def scrollbar: scrollbar = "scrollbar".asInstanceOf[scrollbar]
  
  @js.native
  sealed trait `scrollbar-button`
    extends StObject
       with PseudoType
  inline def `scrollbar-button`: `scrollbar-button` = "scrollbar-button".asInstanceOf[`scrollbar-button`]
  
  @js.native
  sealed trait `scrollbar-corner`
    extends StObject
       with PseudoType
  inline def `scrollbar-corner`: `scrollbar-corner` = "scrollbar-corner".asInstanceOf[`scrollbar-corner`]
  
  @js.native
  sealed trait `scrollbar-thumb`
    extends StObject
       with PseudoType
  inline def `scrollbar-thumb`: `scrollbar-thumb` = "scrollbar-thumb".asInstanceOf[`scrollbar-thumb`]
  
  @js.native
  sealed trait `scrollbar-track`
    extends StObject
       with PseudoType
  inline def `scrollbar-track`: `scrollbar-track` = "scrollbar-track".asInstanceOf[`scrollbar-track`]
  
  @js.native
  sealed trait `scrollbar-track-piece`
    extends StObject
       with PseudoType
  inline def `scrollbar-track-piece`: `scrollbar-track-piece` = "scrollbar-track-piece".asInstanceOf[`scrollbar-track-piece`]
  
  @js.native
  sealed trait searchForNode
    extends StObject
       with InspectMode
  inline def searchForNode: searchForNode = "searchForNode".asInstanceOf[searchForNode]
  
  @js.native
  sealed trait searchForUAShadowDOM
    extends StObject
       with InspectMode
  inline def searchForUAShadowDOM: searchForUAShadowDOM = "searchForUAShadowDOM".asInstanceOf[searchForUAShadowDOM]
  
  @js.native
  sealed trait secure_
    extends StObject
       with SecurityState
  inline def secure_ : secure_ = "secure".asInstanceOf[secure_]
  
  @js.native
  sealed trait security
    extends StObject
       with ConsoleMessageSource
       with LogEntrySource
  inline def security: security = "security".asInstanceOf[security]
  
  @js.native
  sealed trait securityStateChanged extends StObject
  inline def securityStateChanged: securityStateChanged = "securityStateChanged".asInstanceOf[securityStateChanged]
  
  @js.native
  sealed trait selectMultiple
    extends StObject
       with FileChooserOpenedEventMode
  inline def selectMultiple: selectMultiple = "selectMultiple".asInstanceOf[selectMultiple]
  
  @js.native
  sealed trait selectSingle
    extends StObject
       with FileChooserOpenedEventMode
  inline def selectSingle: selectSingle = "selectSingle".asInstanceOf[selectSingle]
  
  @js.native
  sealed trait selected
    extends StObject
       with AXPropertyName
  inline def selected: selected = "selected".asInstanceOf[selected]
  
  @js.native
  sealed trait selection
    extends StObject
       with PseudoType
  inline def selection: selection = "selection".asInstanceOf[selection]
  
  @js.native
  sealed trait sensors
    extends StObject
       with PermissionType
  inline def sensors: sensors = "sensors".asInstanceOf[sensors]
  
  @js.native
  sealed trait serial
    extends StObject
       with PermissionsPolicyFeature
  inline def serial: serial = "serial".asInstanceOf[serial]
  
  @js.native
  sealed trait service_workers
    extends StObject
       with StorageType
  inline def service_workers: service_workers = "service_workers".asInstanceOf[service_workers]
  
  @js.native
  sealed trait set
    extends StObject
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
       with WebDriverValueType
  inline def set: set = "set".asInstanceOf[set]
  
  @js.native
  sealed trait setChildNodes extends StObject
  inline def setChildNodes: setChildNodes = "setChildNodes".asInstanceOf[setChildNodes]
  
  @js.native
  sealed trait settable
    extends StObject
       with AXPropertyName
  inline def settable: settable = "settable".asInstanceOf[settable]
  
  @js.native
  sealed trait shader_cache
    extends StObject
       with StorageType
  inline def shader_cache: shader_cache = "shader_cache".asInstanceOf[shader_cache]
  
  @js.native
  sealed trait shadowRootPopped extends StObject
  inline def shadowRootPopped: shadowRootPopped = "shadowRootPopped".asInstanceOf[shadowRootPopped]
  
  @js.native
  sealed trait shadowRootPushed extends StObject
  inline def shadowRootPushed: shadowRootPushed = "shadowRootPushed".asInstanceOf[shadowRootPushed]
  
  @js.native
  sealed trait `shared-autofill`
    extends StObject
       with PermissionsPolicyFeature
  inline def `shared-autofill`: `shared-autofill` = "shared-autofill".asInstanceOf[`shared-autofill`]
  
  @js.native
  sealed trait `shared-storage`
    extends StObject
       with PermissionsPolicyFeature
  inline def `shared-storage`: `shared-storage` = "shared-storage".asInstanceOf[`shared-storage`]
  
  @js.native
  sealed trait showDistances
    extends StObject
       with InspectMode
  inline def showDistances: showDistances = "showDistances".asInstanceOf[showDistances]
  
  @js.native
  sealed trait signatureCertSha256
    extends StObject
       with SignedExchangeErrorField
  inline def signatureCertSha256: signatureCertSha256 = "signatureCertSha256".asInstanceOf[signatureCertSha256]
  
  @js.native
  sealed trait signatureCertUrl
    extends StObject
       with SignedExchangeErrorField
  inline def signatureCertUrl: signatureCertUrl = "signatureCertUrl".asInstanceOf[signatureCertUrl]
  
  @js.native
  sealed trait signatureIntegrity
    extends StObject
       with SignedExchangeErrorField
  inline def signatureIntegrity: signatureIntegrity = "signatureIntegrity".asInstanceOf[signatureIntegrity]
  
  @js.native
  sealed trait signatureSig
    extends StObject
       with SignedExchangeErrorField
  inline def signatureSig: signatureSig = "signatureSig".asInstanceOf[signatureSig]
  
  @js.native
  sealed trait signatureTimestamps
    extends StObject
       with SignedExchangeErrorField
  inline def signatureTimestamps: signatureTimestamps = "signatureTimestamps".asInstanceOf[signatureTimestamps]
  
  @js.native
  sealed trait signatureValidityUrl
    extends StObject
       with SignedExchangeErrorField
  inline def signatureValidityUrl: signatureValidityUrl = "signatureValidityUrl".asInstanceOf[signatureValidityUrl]
  
  @js.native
  sealed trait signedExchangeReceived extends StObject
  inline def signedExchangeReceived: signedExchangeReceived = "signedExchangeReceived".asInstanceOf[signedExchangeReceived]
  
  @js.native
  sealed trait sinksUpdated extends StObject
  inline def sinksUpdated: sinksUpdated = "sinksUpdated".asInstanceOf[sinksUpdated]
  
  @js.native
  sealed trait speakers
    extends StObject
       with ChannelInterpretation
  inline def speakers: speakers = "speakers".asInstanceOf[speakers]
  
  @js.native
  sealed trait `spelling-error`
    extends StObject
       with PseudoType
  inline def `spelling-error`: `spelling-error` = "spelling-error".asInstanceOf[`spelling-error`]
  
  @js.native
  sealed trait startGroup
    extends StObject
       with ConsoleAPICalledEventType
  inline def startGroup: startGroup = "startGroup".asInstanceOf[startGroup]
  
  @js.native
  sealed trait startGroupCollapsed
    extends StObject
       with ConsoleAPICalledEventType
  inline def startGroupCollapsed: startGroupCollapsed = "startGroupCollapsed".asInstanceOf[startGroupCollapsed]
  
  @js.native
  sealed trait starting
    extends StObject
       with ServiceWorkerVersionRunningStatus
  inline def starting: starting = "starting".asInstanceOf[starting]
  
  @js.native
  sealed trait stopped
    extends StObject
       with ServiceWorkerVersionRunningStatus
  inline def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @js.native
  sealed trait stopping
    extends StObject
       with ServiceWorkerVersionRunningStatus
  inline def stopping: stopping = "stopping".asInstanceOf[stopping]
  
  @js.native
  sealed trait storage
    extends StObject
       with ConsoleMessageSource
       with LogEntrySource
  inline def storage: storage = "storage".asInstanceOf[storage]
  
  @js.native
  sealed trait `storage-access`
    extends StObject
       with PermissionsPolicyFeature
  inline def `storage-access`: `storage-access` = "storage-access".asInstanceOf[`storage-access`]
  
  @js.native
  sealed trait `strict-origin`
    extends StObject
       with RequestReferrerPolicy
  inline def `strict-origin`: `strict-origin` = "strict-origin".asInstanceOf[`strict-origin`]
  
  @js.native
  sealed trait `strict-origin-when-cross-origin`
    extends StObject
       with RequestReferrerPolicy
  inline def `strict-origin-when-cross-origin`: `strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[`strict-origin-when-cross-origin`]
  
  @js.native
  sealed trait strictOrigin
    extends StObject
       with ReferrerPolicy
  inline def strictOrigin: strictOrigin = "strictOrigin".asInstanceOf[strictOrigin]
  
  @js.native
  sealed trait strictOriginWhenCrossOrigin
    extends StObject
       with ReferrerPolicy
  inline def strictOriginWhenCrossOrigin: strictOriginWhenCrossOrigin = "strictOriginWhenCrossOrigin".asInstanceOf[strictOriginWhenCrossOrigin]
  
  @js.native
  sealed trait string
    extends StObject
       with AXValueType
       with KeyPathType
       with KeyType
       with ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
       with WebDriverValueType
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait style
    extends StObject
       with AXValueSourceType
  inline def style: style = "style".asInstanceOf[style]
  
  @js.native
  sealed trait styleSheetAdded extends StObject
  inline def styleSheetAdded: styleSheetAdded = "styleSheetAdded".asInstanceOf[styleSheetAdded]
  
  @js.native
  sealed trait styleSheetChanged extends StObject
  inline def styleSheetChanged: styleSheetChanged = "styleSheetChanged".asInstanceOf[styleSheetChanged]
  
  @js.native
  sealed trait styleSheetRemoved extends StObject
  inline def styleSheetRemoved: styleSheetRemoved = "styleSheetRemoved".asInstanceOf[styleSheetRemoved]
  
  @js.native
  sealed trait `subresource-filter`
    extends StObject
       with BlockedReason
  inline def `subresource-filter`: `subresource-filter` = "subresource-filter".asInstanceOf[`subresource-filter`]
  
  @js.native
  sealed trait subresourceWebBundleInnerResponseError extends StObject
  inline def subresourceWebBundleInnerResponseError: subresourceWebBundleInnerResponseError = "subresourceWebBundleInnerResponseError".asInstanceOf[subresourceWebBundleInnerResponseError]
  
  @js.native
  sealed trait subresourceWebBundleInnerResponseParsed extends StObject
  inline def subresourceWebBundleInnerResponseParsed: subresourceWebBundleInnerResponseParsed = "subresourceWebBundleInnerResponseParsed".asInstanceOf[subresourceWebBundleInnerResponseParsed]
  
  @js.native
  sealed trait subresourceWebBundleMetadataError extends StObject
  inline def subresourceWebBundleMetadataError: subresourceWebBundleMetadataError = "subresourceWebBundleMetadataError".asInstanceOf[subresourceWebBundleMetadataError]
  
  @js.native
  sealed trait subresourceWebBundleMetadataReceived extends StObject
  inline def subresourceWebBundleMetadataReceived: subresourceWebBundleMetadataReceived = "subresourceWebBundleMetadataReceived".asInstanceOf[subresourceWebBundleMetadataReceived]
  
  @js.native
  sealed trait `subtree-modified`
    extends StObject
       with DOMBreakpointType
  inline def `subtree-modified`: `subtree-modified` = "subtree-modified".asInstanceOf[`subtree-modified`]
  
  @js.native
  sealed trait suspended
    extends StObject
       with ContextState
  inline def suspended: suspended = "suspended".asInstanceOf[suspended]
  
  @js.native
  sealed trait swap
    extends StObject
       with FrameDetachedEventReason
  inline def swap: swap = "swap".asInstanceOf[swap]
  
  @js.native
  sealed trait symbol
    extends StObject
       with ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
       with WebDriverValueType
  inline def symbol: symbol = "symbol".asInstanceOf[symbol]
  
  @js.native
  sealed trait `sync-xhr`
    extends StObject
       with PermissionsPolicyFeature
  inline def `sync-xhr`: `sync-xhr` = "sync-xhr".asInstanceOf[`sync-xhr`]
  
  @js.native
  sealed trait system
    extends StObject
       with TracingBackend
  inline def system: system = "system".asInstanceOf[system]
  
  @js.native
  sealed trait table
    extends StObject
       with ConsoleAPICalledEventType
  inline def table: table = "table".asInstanceOf[table]
  
  @js.native
  sealed trait tablecaption
    extends StObject
       with AXValueNativeSourceType
  inline def tablecaption: tablecaption = "tablecaption".asInstanceOf[tablecaption]
  
  @js.native
  sealed trait `target-text`
    extends StObject
       with PseudoType
  inline def `target-text`: `target-text` = "target-text".asInstanceOf[`target-text`]
  
  @js.native
  sealed trait targetCrashed extends StObject
  inline def targetCrashed: targetCrashed = "targetCrashed".asInstanceOf[targetCrashed]
  
  @js.native
  sealed trait targetCreated extends StObject
  inline def targetCreated: targetCreated = "targetCreated".asInstanceOf[targetCreated]
  
  @js.native
  sealed trait targetDestroyed extends StObject
  inline def targetDestroyed: targetDestroyed = "targetDestroyed".asInstanceOf[targetDestroyed]
  
  @js.native
  sealed trait targetInfoChanged extends StObject
  inline def targetInfoChanged: targetInfoChanged = "targetInfoChanged".asInstanceOf[targetInfoChanged]
  
  @js.native
  sealed trait targetReloadedAfterCrash extends StObject
  inline def targetReloadedAfterCrash: targetReloadedAfterCrash = "targetReloadedAfterCrash".asInstanceOf[targetReloadedAfterCrash]
  
  @js.native
  sealed trait threadTicks
    extends StObject
       with EnableRequestTimeDomain
       with SetTimeDomainRequestTimeDomain
  inline def threadTicks: threadTicks = "threadTicks".asInstanceOf[threadTicks]
  
  @js.native
  sealed trait timeEnd
    extends StObject
       with ConsoleAPICalledEventType
  inline def timeEnd: timeEnd = "timeEnd".asInstanceOf[timeEnd]
  
  @js.native
  sealed trait timeTicks
    extends StObject
       with EnableRequestTimeDomain
       with SetTimeDomainRequestTimeDomain
  inline def timeTicks: timeTicks = "timeTicks".asInstanceOf[timeTicks]
  
  @js.native
  sealed trait timelineEventAdded extends StObject
  inline def timelineEventAdded: timelineEventAdded = "timelineEventAdded".asInstanceOf[timelineEventAdded]
  
  @js.native
  sealed trait title
    extends StObject
       with AXValueNativeSourceType
  inline def title: title = "title".asInstanceOf[title]
  
  @js.native
  sealed trait token
    extends StObject
       with AXValueType
  inline def token: token = "token".asInstanceOf[token]
  
  @js.native
  sealed trait tokenList
    extends StObject
       with AXValueType
  inline def tokenList: tokenList = "tokenList".asInstanceOf[tokenList]
  
  @js.native
  sealed trait topLayerElementsUpdated extends StObject
  inline def topLayerElementsUpdated: topLayerElementsUpdated = "topLayerElementsUpdated".asInstanceOf[topLayerElementsUpdated]
  
  @js.native
  sealed trait touch
    extends StObject
       with GestureSourceType
  inline def touch: touch = "touch".asInstanceOf[touch]
  
  @js.native
  sealed trait touchCancel
    extends StObject
       with DispatchTouchEventRequestType
  inline def touchCancel: touchCancel = "touchCancel".asInstanceOf[touchCancel]
  
  @js.native
  sealed trait touchEnd
    extends StObject
       with DispatchTouchEventRequestType
  inline def touchEnd: touchEnd = "touchEnd".asInstanceOf[touchEnd]
  
  @js.native
  sealed trait touchMove
    extends StObject
       with DispatchTouchEventRequestType
  inline def touchMove: touchMove = "touchMove".asInstanceOf[touchMove]
  
  @js.native
  sealed trait touchStart
    extends StObject
       with DispatchTouchEventRequestType
  inline def touchStart: touchStart = "touchStart".asInstanceOf[touchStart]
  
  @js.native
  sealed trait trace
    extends StObject
       with ConsoleAPICalledEventType
  inline def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait tracingComplete extends StObject
  inline def tracingComplete: tracingComplete = "tracingComplete".asInstanceOf[tracingComplete]
  
  @js.native
  sealed trait tristate
    extends StObject
       with AXValueType
  inline def tristate: tristate = "tristate".asInstanceOf[tristate]
  
  @js.native
  sealed trait tritanopia
    extends StObject
       with SetEmulatedVisionDeficiencyRequestType
  inline def tritanopia: tritanopia = "tritanopia".asInstanceOf[tritanopia]
  
  @js.native
  sealed trait `trust-token-redemption`
    extends StObject
       with PermissionsPolicyFeature
  inline def `trust-token-redemption`: `trust-token-redemption` = "trust-token-redemption".asInstanceOf[`trust-token-redemption`]
  
  @js.native
  sealed trait trustTokenOperationDone extends StObject
  inline def trustTokenOperationDone: trustTokenOperationDone = "trustTokenOperationDone".asInstanceOf[trustTokenOperationDone]
  
  @js.native
  sealed trait `trustedtype-policy-violation`
    extends StObject
       with CSPViolationType
  inline def `trustedtype-policy-violation`: `trustedtype-policy-violation` = "trustedtype-policy-violation".asInstanceOf[`trustedtype-policy-violation`]
  
  @js.native
  sealed trait `trustedtype-sink-violation`
    extends StObject
       with CSPViolationType
  inline def `trustedtype-sink-violation`: `trustedtype-sink-violation` = "trustedtype-sink-violation".asInstanceOf[`trustedtype-sink-violation`]
  
  @js.native
  sealed trait typed
    extends StObject
       with TransitionType
  inline def typed: typed = "typed".asInstanceOf[typed]
  
  @js.native
  sealed trait typedarray
    extends StObject
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
       with WebDriverValueType
  inline def typedarray: typedarray = "typedarray".asInstanceOf[typedarray]
  
  @js.native
  sealed trait u2f
    extends StObject
       with AuthenticatorProtocol
  inline def u2f: u2f = "u2f".asInstanceOf[u2f]
  
  @js.native
  sealed trait uncaught
    extends StObject
       with SetPauseOnExceptionsRequestState
  inline def uncaught: uncaught = "uncaught".asInstanceOf[uncaught]
  
  @js.native
  sealed trait undefined
    extends StObject
       with ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
       with WebDriverValueType
  inline def undefined: undefined = "undefined".asInstanceOf[undefined]
  
  @js.native
  sealed trait unknown_
    extends StObject
       with CertificateTransparencyCompliance
       with ImageType
       with SecurityState
  inline def unknown_ : unknown_ = "unknown".asInstanceOf[unknown_]
  
  @js.native
  sealed trait unload
    extends StObject
       with PermissionsPolicyFeature
  inline def unload: unload = "unload".asInstanceOf[unload]
  
  @js.native
  sealed trait `unsafe-url`
    extends StObject
       with RequestReferrerPolicy
  inline def `unsafe-url`: `unsafe-url` = "unsafe-url".asInstanceOf[`unsafe-url`]
  
  @js.native
  sealed trait unsafeUrl
    extends StObject
       with ReferrerPolicy
  inline def unsafeUrl: unsafeUrl = "unsafeUrl".asInstanceOf[unsafeUrl]
  
  @js.native
  sealed trait unspecifiedReason
    extends StObject
       with AlternateProtocolUsage
  inline def unspecifiedReason: unspecifiedReason = "unspecifiedReason".asInstanceOf[unspecifiedReason]
  
  @js.native
  sealed trait update
    extends StObject
       with InterestGroupAccessType
  inline def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait usb
    extends StObject
       with AuthenticatorTransport
       with PermissionsPolicyFeature
  inline def usb: usb = "usb".asInstanceOf[usb]
  
  @js.native
  sealed trait `user-agent`
    extends StObject
       with ShadowRootType
       with StyleSheetOrigin
  inline def `user-agent`: `user-agent` = "user-agent".asInstanceOf[`user-agent`]
  
  @js.native
  sealed trait valueUndefined
    extends StObject
       with AXValueType
  inline def valueUndefined: valueUndefined = "valueUndefined".asInstanceOf[valueUndefined]
  
  @js.native
  sealed trait valuemax
    extends StObject
       with AXPropertyName
  inline def valuemax: valuemax = "valuemax".asInstanceOf[valuemax]
  
  @js.native
  sealed trait valuemin
    extends StObject
       with AXPropertyName
  inline def valuemin: valuemin = "valuemin".asInstanceOf[valuemin]
  
  @js.native
  sealed trait valuetext
    extends StObject
       with AXPropertyName
  inline def valuetext: valuetext = "valuetext".asInstanceOf[valuetext]
  
  @js.native
  sealed trait verbose
    extends StObject
       with LogEntryLevel
  inline def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait vertical
    extends StObject
       with DisplayFeatureOrientation
  inline def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait `vertical-scroll`
    extends StObject
       with PermissionsPolicyFeature
  inline def `vertical-scroll`: `vertical-scroll` = "vertical-scroll".asInstanceOf[`vertical-scroll`]
  
  @js.native
  sealed trait videoCapture
    extends StObject
       with PermissionType
  inline def videoCapture: videoCapture = "videoCapture".asInstanceOf[videoCapture]
  
  @js.native
  sealed trait videoCapturePanTiltZoom
    extends StObject
       with PermissionType
  inline def videoCapturePanTiltZoom: videoCapturePanTiltZoom = "videoCapturePanTiltZoom".asInstanceOf[videoCapturePanTiltZoom]
  
  @js.native
  sealed trait violation
    extends StObject
       with LogEntrySource
  inline def violation: violation = "violation".asInstanceOf[violation]
  
  @js.native
  sealed trait virtualTimeBudgetExpired extends StObject
  inline def virtualTimeBudgetExpired: virtualTimeBudgetExpired = "virtualTimeBudgetExpired".asInstanceOf[virtualTimeBudgetExpired]
  
  @js.native
  sealed trait visibleSecurityStateChanged extends StObject
  inline def visibleSecurityStateChanged: visibleSecurityStateChanged = "visibleSecurityStateChanged".asInstanceOf[visibleSecurityStateChanged]
  
  @js.native
  sealed trait wakeLockScreen
    extends StObject
       with PermissionType
  inline def wakeLockScreen: wakeLockScreen = "wakeLockScreen".asInstanceOf[wakeLockScreen]
  
  @js.native
  sealed trait wakeLockSystem
    extends StObject
       with PermissionType
  inline def wakeLockSystem: wakeLockSystem = "wakeLockSystem".asInstanceOf[wakeLockSystem]
  
  @js.native
  sealed trait warning
    extends StObject
       with ConsoleAPICalledEventType
       with ConsoleMessageLevel
       with LogEntryLevel
       with PlayerMessageLevel
  inline def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait `wasm-expression-stack`
    extends StObject
       with ScopeType
  inline def `wasm-expression-stack`: `wasm-expression-stack` = "wasm-expression-stack".asInstanceOf[`wasm-expression-stack`]
  
  @js.native
  sealed trait wasmvalue
    extends StObject
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  inline def wasmvalue: wasmvalue = "wasmvalue".asInstanceOf[wasmvalue]
  
  @js.native
  sealed trait weakmap
    extends StObject
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
       with WebDriverValueType
  inline def weakmap: weakmap = "weakmap".asInstanceOf[weakmap]
  
  @js.native
  sealed trait weakset
    extends StObject
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
       with WebDriverValueType
  inline def weakset: weakset = "weakset".asInstanceOf[weakset]
  
  @js.native
  sealed trait `web-share`
    extends StObject
       with PermissionsPolicyFeature
  inline def `web-share`: `web-share` = "web-share".asInstanceOf[`web-share`]
  
  @js.native
  sealed trait webSocketClosed extends StObject
  inline def webSocketClosed: webSocketClosed = "webSocketClosed".asInstanceOf[webSocketClosed]
  
  @js.native
  sealed trait webSocketCreated extends StObject
  inline def webSocketCreated: webSocketCreated = "webSocketCreated".asInstanceOf[webSocketCreated]
  
  @js.native
  sealed trait webSocketFrameError extends StObject
  inline def webSocketFrameError: webSocketFrameError = "webSocketFrameError".asInstanceOf[webSocketFrameError]
  
  @js.native
  sealed trait webSocketFrameReceived extends StObject
  inline def webSocketFrameReceived: webSocketFrameReceived = "webSocketFrameReceived".asInstanceOf[webSocketFrameReceived]
  
  @js.native
  sealed trait webSocketFrameSent extends StObject
  inline def webSocketFrameSent: webSocketFrameSent = "webSocketFrameSent".asInstanceOf[webSocketFrameSent]
  
  @js.native
  sealed trait webSocketHandshakeResponseReceived extends StObject
  inline def webSocketHandshakeResponseReceived: webSocketHandshakeResponseReceived = "webSocketHandshakeResponseReceived".asInstanceOf[webSocketHandshakeResponseReceived]
  
  @js.native
  sealed trait webSocketWillSendHandshakeRequest extends StObject
  inline def webSocketWillSendHandshakeRequest: webSocketWillSendHandshakeRequest = "webSocketWillSendHandshakeRequest".asInstanceOf[webSocketWillSendHandshakeRequest]
  
  @js.native
  sealed trait webTransportClosed extends StObject
  inline def webTransportClosed: webTransportClosed = "webTransportClosed".asInstanceOf[webTransportClosed]
  
  @js.native
  sealed trait webTransportConnectionEstablished extends StObject
  inline def webTransportConnectionEstablished: webTransportConnectionEstablished = "webTransportConnectionEstablished".asInstanceOf[webTransportConnectionEstablished]
  
  @js.native
  sealed trait webTransportCreated extends StObject
  inline def webTransportCreated: webTransportCreated = "webTransportCreated".asInstanceOf[webTransportCreated]
  
  @js.native
  sealed trait webassemblymemory
    extends StObject
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  inline def webassemblymemory: webassemblymemory = "webassemblymemory".asInstanceOf[webassemblymemory]
  
  @js.native
  sealed trait webp
    extends StObject
       with CaptureScreenshotRequestFormat
       with DisabledImageType
       with GetEncodedResponseRequestEncoding
       with ImageType
  inline def webp: webp = "webp".asInstanceOf[webp]
  
  @js.native
  sealed trait websql
    extends StObject
       with StorageType
  inline def websql: websql = "websql".asInstanceOf[websql]
  
  @js.native
  sealed trait wifi
    extends StObject
       with ConnectionType
  inline def wifi: wifi = "wifi".asInstanceOf[wifi]
  
  @js.native
  sealed trait wimax
    extends StObject
       with ConnectionType
  inline def wimax: wimax = "wimax".asInstanceOf[wimax]
  
  @js.native
  sealed trait win
    extends StObject
       with InterestGroupAccessType
  inline def win: win = "win".asInstanceOf[win]
  
  @js.native
  sealed trait window
    extends StObject
       with WebDriverValueType
  inline def window: window = "window".asInstanceOf[window]
  
  @js.native
  sealed trait `window-placement`
    extends StObject
       with PermissionsPolicyFeature
  inline def `window-placement`: `window-placement` = "window-placement".asInstanceOf[`window-placement`]
  
  @js.native
  sealed trait windowOpen extends StObject
  inline def windowOpen: windowOpen = "windowOpen".asInstanceOf[windowOpen]
  
  @js.native
  sealed trait `with`
    extends StObject
       with ScopeType
  inline def `with`: `with` = "with".asInstanceOf[`with`]
  
  @js.native
  sealed trait workerErrorReported extends StObject
  inline def workerErrorReported: workerErrorReported = "workerErrorReported".asInstanceOf[workerErrorReported]
  
  @js.native
  sealed trait workerRegistrationUpdated extends StObject
  inline def workerRegistrationUpdated: workerRegistrationUpdated = "workerRegistrationUpdated".asInstanceOf[workerRegistrationUpdated]
  
  @js.native
  sealed trait workerVersionUpdated extends StObject
  inline def workerVersionUpdated: workerVersionUpdated = "workerVersionUpdated".asInstanceOf[workerVersionUpdated]
  
  @js.native
  sealed trait worker_
    extends StObject
       with ConsoleMessageSource
       with LogEntrySource
  inline def worker_ : worker_ = "worker".asInstanceOf[worker_]
  
  @js.native
  sealed trait xml
    extends StObject
       with ConsoleMessageSource
       with LogEntrySource
  inline def xml: xml = "xml".asInstanceOf[xml]
  
  @js.native
  sealed trait `xr-spatial-tracking`
    extends StObject
       with PermissionsPolicyFeature
  inline def `xr-spatial-tracking`: `xr-spatial-tracking` = "xr-spatial-tracking".asInstanceOf[`xr-spatial-tracking`]
  
  @js.native
  sealed trait yuv420
    extends StObject
       with SubsamplingFormat
  inline def yuv420: yuv420 = "yuv420".asInstanceOf[yuv420]
  
  @js.native
  sealed trait yuv422
    extends StObject
       with SubsamplingFormat
  inline def yuv422: yuv422 = "yuv422".asInstanceOf[yuv422]
  
  @js.native
  sealed trait yuv444
    extends StObject
       with SubsamplingFormat
  inline def yuv444: yuv444 = "yuv444".asInstanceOf[yuv444]
}
