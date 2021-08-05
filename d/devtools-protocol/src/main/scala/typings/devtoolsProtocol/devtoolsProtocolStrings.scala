package typings.devtoolsProtocol

import typings.devtoolsProtocol.mod.Protocol.Accessibility.AXPropertyName
import typings.devtoolsProtocol.mod.Protocol.Accessibility.AXValueNativeSourceType
import typings.devtoolsProtocol.mod.Protocol.Accessibility.AXValueSourceType
import typings.devtoolsProtocol.mod.Protocol.Accessibility.AXValueType
import typings.devtoolsProtocol.mod.Protocol.Animation.AnimationType
import typings.devtoolsProtocol.mod.Protocol.Audits.BlockedByResponseReason
import typings.devtoolsProtocol.mod.Protocol.Audits.ContentSecurityPolicyViolationType
import typings.devtoolsProtocol.mod.Protocol.Audits.GetEncodedResponseRequestEncoding
import typings.devtoolsProtocol.mod.Protocol.Audits.HeavyAdReason
import typings.devtoolsProtocol.mod.Protocol.Audits.HeavyAdResolutionStatus
import typings.devtoolsProtocol.mod.Protocol.Audits.InspectorIssueCode
import typings.devtoolsProtocol.mod.Protocol.Audits.MixedContentResolutionStatus
import typings.devtoolsProtocol.mod.Protocol.Audits.MixedContentResourceType
import typings.devtoolsProtocol.mod.Protocol.Audits.SameSiteCookieExclusionReason
import typings.devtoolsProtocol.mod.Protocol.Audits.SameSiteCookieOperation
import typings.devtoolsProtocol.mod.Protocol.Audits.SameSiteCookieWarningReason
import typings.devtoolsProtocol.mod.Protocol.BackgroundService.ServiceName
import typings.devtoolsProtocol.mod.Protocol.Browser.PermissionSetting
import typings.devtoolsProtocol.mod.Protocol.Browser.PermissionType
import typings.devtoolsProtocol.mod.Protocol.Browser.WindowState
import typings.devtoolsProtocol.mod.Protocol.CSS.CSSMediaSource
import typings.devtoolsProtocol.mod.Protocol.CSS.StyleSheetOrigin
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.CachedResponseType
import typings.devtoolsProtocol.mod.Protocol.Console.ConsoleMessageLevel
import typings.devtoolsProtocol.mod.Protocol.Console.ConsoleMessageSource
import typings.devtoolsProtocol.mod.Protocol.DOM.PseudoType
import typings.devtoolsProtocol.mod.Protocol.DOM.ShadowRootType
import typings.devtoolsProtocol.mod.Protocol.DOMDebugger.DOMBreakpointType
import typings.devtoolsProtocol.mod.Protocol.Debugger.BreakLocationType
import typings.devtoolsProtocol.mod.Protocol.Debugger.ContinueToLocationRequestTargetCallFrames
import typings.devtoolsProtocol.mod.Protocol.Debugger.DebugSymbolsType
import typings.devtoolsProtocol.mod.Protocol.Debugger.PausedEventReason
import typings.devtoolsProtocol.mod.Protocol.Debugger.ScopeType
import typings.devtoolsProtocol.mod.Protocol.Debugger.ScriptLanguage
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetInstrumentationBreakpointRequestInstrumentation
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetPauseOnExceptionsRequestState
import typings.devtoolsProtocol.mod.Protocol.Emulation.DisplayFeatureOrientation
import typings.devtoolsProtocol.mod.Protocol.Emulation.ScreenOrientationType
import typings.devtoolsProtocol.mod.Protocol.Emulation.SetEmitTouchEventsForMouseRequestConfiguration
import typings.devtoolsProtocol.mod.Protocol.Emulation.SetEmulatedVisionDeficiencyRequestType
import typings.devtoolsProtocol.mod.Protocol.Emulation.VirtualTimePolicy
import typings.devtoolsProtocol.mod.Protocol.Fetch.RequestStage
import typings.devtoolsProtocol.mod.Protocol.HeadlessExperimental.ScreenshotParamsFormat
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.KeyPathType
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.KeyType
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
import typings.devtoolsProtocol.mod.Protocol.Media.PlayerErrorType
import typings.devtoolsProtocol.mod.Protocol.Media.PlayerMessageLevel
import typings.devtoolsProtocol.mod.Protocol.Memory.PressureLevel
import typings.devtoolsProtocol.mod.Protocol.Network.AuthChallengeResponseResponse
import typings.devtoolsProtocol.mod.Protocol.Network.AuthChallengeSource
import typings.devtoolsProtocol.mod.Protocol.Network.BlockedReason
import typings.devtoolsProtocol.mod.Protocol.Network.CertificateTransparencyCompliance
import typings.devtoolsProtocol.mod.Protocol.Network.ConnectionType
import typings.devtoolsProtocol.mod.Protocol.Network.CookieBlockedReason
import typings.devtoolsProtocol.mod.Protocol.Network.CookiePriority
import typings.devtoolsProtocol.mod.Protocol.Network.CookieSameSite
import typings.devtoolsProtocol.mod.Protocol.Network.CrossOriginEmbedderPolicyValue
import typings.devtoolsProtocol.mod.Protocol.Network.CrossOriginOpenerPolicyValue
import typings.devtoolsProtocol.mod.Protocol.Network.ErrorReason
import typings.devtoolsProtocol.mod.Protocol.Network.InitiatorType
import typings.devtoolsProtocol.mod.Protocol.Network.InterceptionStage
import typings.devtoolsProtocol.mod.Protocol.Network.RequestReferrerPolicy
import typings.devtoolsProtocol.mod.Protocol.Network.ResourcePriority
import typings.devtoolsProtocol.mod.Protocol.Network.ResourceType
import typings.devtoolsProtocol.mod.Protocol.Network.ServiceWorkerResponseSource
import typings.devtoolsProtocol.mod.Protocol.Network.SetCookieBlockedReason
import typings.devtoolsProtocol.mod.Protocol.Network.SignedExchangeErrorField
import typings.devtoolsProtocol.mod.Protocol.Network.TrustTokenOperationType
import typings.devtoolsProtocol.mod.Protocol.Network.TrustTokenParamsRefreshPolicy
import typings.devtoolsProtocol.mod.Protocol.Overlay.ColorFormat
import typings.devtoolsProtocol.mod.Protocol.Overlay.InspectMode
import typings.devtoolsProtocol.mod.Protocol.Page.AdFrameType
import typings.devtoolsProtocol.mod.Protocol.Page.CaptureScreenshotRequestFormat
import typings.devtoolsProtocol.mod.Protocol.Page.ClientNavigationDisposition
import typings.devtoolsProtocol.mod.Protocol.Page.ClientNavigationReason
import typings.devtoolsProtocol.mod.Protocol.Page.CrossOriginIsolatedContextType
import typings.devtoolsProtocol.mod.Protocol.Page.DialogType
import typings.devtoolsProtocol.mod.Protocol.Page.DownloadProgressEventState
import typings.devtoolsProtocol.mod.Protocol.Page.FileChooserOpenedEventMode
import typings.devtoolsProtocol.mod.Protocol.Page.PrintToPDFRequestTransferMode
import typings.devtoolsProtocol.mod.Protocol.Page.ReferrerPolicy
import typings.devtoolsProtocol.mod.Protocol.Page.SecureContextType
import typings.devtoolsProtocol.mod.Protocol.Page.SetDownloadBehaviorRequestBehavior
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
import typings.devtoolsProtocol.mod.Protocol.Security.CertificateErrorAction
import typings.devtoolsProtocol.mod.Protocol.Security.MixedContentType
import typings.devtoolsProtocol.mod.Protocol.Security.SafetyTipStatus
import typings.devtoolsProtocol.mod.Protocol.Security.SecurityState
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.ServiceWorkerVersionRunningStatus
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.ServiceWorkerVersionStatus
import typings.devtoolsProtocol.mod.Protocol.Storage.StorageType
import typings.devtoolsProtocol.mod.Protocol.SystemInfo.ImageType
import typings.devtoolsProtocol.mod.Protocol.SystemInfo.SubsamplingFormat
import typings.devtoolsProtocol.mod.Protocol.Tracing.StartRequestTransferMode
import typings.devtoolsProtocol.mod.Protocol.Tracing.StreamCompression
import typings.devtoolsProtocol.mod.Protocol.Tracing.StreamFormat
import typings.devtoolsProtocol.mod.Protocol.Tracing.TraceConfigRecordMode
import typings.devtoolsProtocol.mod.Protocol.WebAudio.AutomationRate
import typings.devtoolsProtocol.mod.Protocol.WebAudio.ChannelCountMode
import typings.devtoolsProtocol.mod.Protocol.WebAudio.ChannelInterpretation
import typings.devtoolsProtocol.mod.Protocol.WebAudio.ContextState
import typings.devtoolsProtocol.mod.Protocol.WebAudio.ContextType
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.AuthenticatorProtocol
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.AuthenticatorTransport
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
  sealed trait AddressUnreachable
    extends StObject
       with ErrorReason
  inline def AddressUnreachable: AddressUnreachable = "AddressUnreachable".asInstanceOf[AddressUnreachable]
  
  @js.native
  sealed trait Audio
    extends StObject
       with MixedContentResourceType
  inline def Audio: Audio = "Audio".asInstanceOf[Audio]
  
  @js.native
  sealed trait Beacon
    extends StObject
       with MixedContentResourceType
  inline def Beacon: Beacon = "Beacon".asInstanceOf[Beacon]
  
  @js.native
  sealed trait BlockedByClient
    extends StObject
       with ErrorReason
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
  sealed trait CSPReport
    extends StObject
       with MixedContentResourceType
  inline def CSPReport: CSPReport = "CSPReport".asInstanceOf[CSPReport]
  
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
  sealed trait CSSTransition
    extends StObject
       with AnimationType
  inline def CSSTransition: CSSTransition = "CSSTransition".asInstanceOf[CSSTransition]
  
  @js.native
  sealed trait CancelAuth
    extends StObject
       with AuthChallengeResponseResponse
       with typings.devtoolsProtocol.mod.Protocol.Fetch.AuthChallengeResponseResponse
  inline def CancelAuth: CancelAuth = "CancelAuth".asInstanceOf[CancelAuth]
  
  @js.native
  sealed trait CoepFrameResourceNeedsCoepHeader
    extends StObject
       with BlockedByResponseReason
  inline def CoepFrameResourceNeedsCoepHeader: CoepFrameResourceNeedsCoepHeader = "CoepFrameResourceNeedsCoepHeader".asInstanceOf[CoepFrameResourceNeedsCoepHeader]
  
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
  sealed trait ContentSecurityPolicyIssue
    extends StObject
       with InspectorIssueCode
  inline def ContentSecurityPolicyIssue: ContentSecurityPolicyIssue = "ContentSecurityPolicyIssue".asInstanceOf[ContentSecurityPolicyIssue]
  
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
  sealed trait DOM
    extends StObject
       with PausedEventReason
  inline def DOM: DOM = "DOM".asInstanceOf[DOM]
  
  @js.native
  sealed trait Default
    extends StObject
       with AuthChallengeResponseResponse
       with typings.devtoolsProtocol.mod.Protocol.Fetch.AuthChallengeResponseResponse
  inline def Default: Default = "Default".asInstanceOf[Default]
  
  @js.native
  sealed trait Document
    extends StObject
       with ResourceType
  inline def Document: Document = "Document".asInstanceOf[Document]
  
  @js.native
  sealed trait DomainMismatch
    extends StObject
       with CookieBlockedReason
  inline def DomainMismatch: DomainMismatch = "DomainMismatch".asInstanceOf[DomainMismatch]
  
  @js.native
  sealed trait Download
    extends StObject
       with MixedContentResourceType
  inline def Download: Download = "Download".asInstanceOf[Download]
  
  @js.native
  sealed trait EmbeddedDWARF
    extends StObject
       with DebugSymbolsType
  inline def EmbeddedDWARF: EmbeddedDWARF = "EmbeddedDWARF".asInstanceOf[EmbeddedDWARF]
  
  @js.native
  sealed trait EventListener
    extends StObject
       with PausedEventReason
  inline def EventListener: EventListener = "EventListener".asInstanceOf[EventListener]
  
  @js.native
  sealed trait EventSource
    extends StObject
       with MixedContentResourceType
       with ResourceType
  inline def EventSource: EventSource = "EventSource".asInstanceOf[EventSource]
  
  @js.native
  sealed trait ExcludeSameSiteLax
    extends StObject
       with SameSiteCookieExclusionReason
  inline def ExcludeSameSiteLax: ExcludeSameSiteLax = "ExcludeSameSiteLax".asInstanceOf[ExcludeSameSiteLax]
  
  @js.native
  sealed trait ExcludeSameSiteNoneInsecure
    extends StObject
       with SameSiteCookieExclusionReason
  inline def ExcludeSameSiteNoneInsecure: ExcludeSameSiteNoneInsecure = "ExcludeSameSiteNoneInsecure".asInstanceOf[ExcludeSameSiteNoneInsecure]
  
  @js.native
  sealed trait ExcludeSameSiteStrict
    extends StObject
       with SameSiteCookieExclusionReason
  inline def ExcludeSameSiteStrict: ExcludeSameSiteStrict = "ExcludeSameSiteStrict".asInstanceOf[ExcludeSameSiteStrict]
  
  @js.native
  sealed trait ExcludeSameSiteUnspecifiedTreatedAsLax
    extends StObject
       with SameSiteCookieExclusionReason
  inline def ExcludeSameSiteUnspecifiedTreatedAsLax: ExcludeSameSiteUnspecifiedTreatedAsLax = "ExcludeSameSiteUnspecifiedTreatedAsLax".asInstanceOf[ExcludeSameSiteUnspecifiedTreatedAsLax]
  
  @js.native
  sealed trait ExternalDWARF
    extends StObject
       with DebugSymbolsType
  inline def ExternalDWARF: ExternalDWARF = "ExternalDWARF".asInstanceOf[ExternalDWARF]
  
  @js.native
  sealed trait Failed
    extends StObject
       with ErrorReason
  inline def Failed: Failed = "Failed".asInstanceOf[Failed]
  
  @js.native
  sealed trait Favicon
    extends StObject
       with MixedContentResourceType
  inline def Favicon: Favicon = "Favicon".asInstanceOf[Favicon]
  
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
  sealed trait InsecureAncestor
    extends StObject
       with SecureContextType
  inline def InsecureAncestor: InsecureAncestor = "InsecureAncestor".asInstanceOf[InsecureAncestor]
  
  @js.native
  sealed trait InsecureScheme
    extends StObject
       with SecureContextType
  inline def InsecureScheme: InsecureScheme = "InsecureScheme".asInstanceOf[InsecureScheme]
  
  @js.native
  sealed trait InternetDisconnected
    extends StObject
       with ErrorReason
  inline def InternetDisconnected: InternetDisconnected = "InternetDisconnected".asInstanceOf[InternetDisconnected]
  
  @js.native
  sealed trait InvalidDomain
    extends StObject
       with SetCookieBlockedReason
  inline def InvalidDomain: InvalidDomain = "InvalidDomain".asInstanceOf[InvalidDomain]
  
  @js.native
  sealed trait InvalidPrefix
    extends StObject
       with SetCookieBlockedReason
  inline def InvalidPrefix: InvalidPrefix = "InvalidPrefix".asInstanceOf[InvalidPrefix]
  
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
  sealed trait Lax
    extends StObject
       with CookieSameSite
  inline def Lax: Lax = "Lax".asInstanceOf[Lax]
  
  @js.native
  sealed trait Low
    extends StObject
       with CookiePriority
       with ResourcePriority
  inline def Low: Low = "Low".asInstanceOf[Low]
  
  @js.native
  sealed trait Manifest
    extends StObject
       with MixedContentResourceType
       with ResourceType
  inline def Manifest: Manifest = "Manifest".asInstanceOf[Manifest]
  
  @js.native
  sealed trait Media
    extends StObject
       with ResourceType
  inline def Media: Media = "Media".asInstanceOf[Media]
  
  @js.native
  sealed trait Medium
    extends StObject
       with CookiePriority
       with ResourcePriority
  inline def Medium: Medium = "Medium".asInstanceOf[Medium]
  
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
  sealed trait NameNotResolved
    extends StObject
       with ErrorReason
  inline def NameNotResolved: NameNotResolved = "NameNotResolved".asInstanceOf[NameNotResolved]
  
  @js.native
  sealed trait NetworkTotalLimit
    extends StObject
       with HeavyAdReason
  inline def NetworkTotalLimit: NetworkTotalLimit = "NetworkTotalLimit".asInstanceOf[NetworkTotalLimit]
  
  @js.native
  sealed trait None
    extends StObject
       with CookieSameSite
       with CrossOriginEmbedderPolicyValue
       with DebugSymbolsType
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
  sealed trait NotOnPath
    extends StObject
       with CookieBlockedReason
  inline def NotOnPath: NotOnPath = "NotOnPath".asInstanceOf[NotOnPath]
  
  @js.native
  sealed trait OOM
    extends StObject
       with PausedEventReason
  inline def OOM: OOM = "OOM".asInstanceOf[OOM]
  
  @js.native
  sealed trait Other
    extends StObject
       with ResourceType
  inline def Other: Other = "Other".asInstanceOf[Other]
  
  @js.native
  sealed trait OverwriteSecure
    extends StObject
       with SetCookieBlockedReason
  inline def OverwriteSecure: OverwriteSecure = "OverwriteSecure".asInstanceOf[OverwriteSecure]
  
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
  sealed trait Prefetch
    extends StObject
       with MixedContentResourceType
  inline def Prefetch: Prefetch = "Prefetch".asInstanceOf[Prefetch]
  
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
  sealed trait ReadCookie
    extends StObject
       with SameSiteCookieOperation
  inline def ReadCookie: ReadCookie = "ReadCookie".asInstanceOf[ReadCookie]
  
  @js.native
  sealed trait Redemption
    extends StObject
       with TrustTokenOperationType
  inline def Redemption: Redemption = "Redemption".asInstanceOf[Redemption]
  
  @js.native
  sealed trait Refresh
    extends StObject
       with TrustTokenParamsRefreshPolicy
  inline def Refresh: Refresh = "Refresh".asInstanceOf[Refresh]
  
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
  sealed trait Response
    extends StObject
       with RequestStage
  inline def Response: Response = "Response".asInstanceOf[Response]
  
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
  sealed trait SameSiteCookieIssue
    extends StObject
       with InspectorIssueCode
  inline def SameSiteCookieIssue: SameSiteCookieIssue = "SameSiteCookieIssue".asInstanceOf[SameSiteCookieIssue]
  
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
  sealed trait SetCookie
    extends StObject
       with SameSiteCookieOperation
  inline def SetCookie: SetCookie = "SetCookie".asInstanceOf[SetCookie]
  
  @js.native
  sealed trait SharedWorker
    extends StObject
       with MixedContentResourceType
  inline def SharedWorker: SharedWorker = "SharedWorker".asInstanceOf[SharedWorker]
  
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
  sealed trait SourceMap
    extends StObject
       with DebugSymbolsType
  inline def SourceMap: SourceMap = "SourceMap".asInstanceOf[SourceMap]
  
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
  sealed trait SyntaxError
    extends StObject
       with SetCookieBlockedReason
  inline def SyntaxError: SyntaxError = "SyntaxError".asInstanceOf[SyntaxError]
  
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
  sealed trait UnknownError
    extends StObject
       with CookieBlockedReason
       with SetCookieBlockedReason
  inline def UnknownError: UnknownError = "UnknownError".asInstanceOf[UnknownError]
  
  @js.native
  sealed trait UnsafeNone
    extends StObject
       with CrossOriginOpenerPolicyValue
  inline def UnsafeNone: UnsafeNone = "UnsafeNone".asInstanceOf[UnsafeNone]
  
  @js.native
  sealed trait UseCached
    extends StObject
       with TrustTokenParamsRefreshPolicy
  inline def UseCached: UseCached = "UseCached".asInstanceOf[UseCached]
  
  @js.native
  sealed trait UserPreferences
    extends StObject
       with CookieBlockedReason
       with SetCookieBlockedReason
  inline def UserPreferences: UserPreferences = "UserPreferences".asInstanceOf[UserPreferences]
  
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
  sealed trait WarnSameSiteLaxCrossDowngradeLax
    extends StObject
       with SameSiteCookieWarningReason
  inline def WarnSameSiteLaxCrossDowngradeLax: WarnSameSiteLaxCrossDowngradeLax = "WarnSameSiteLaxCrossDowngradeLax".asInstanceOf[WarnSameSiteLaxCrossDowngradeLax]
  
  @js.native
  sealed trait WarnSameSiteLaxCrossDowngradeStrict
    extends StObject
       with SameSiteCookieWarningReason
  inline def WarnSameSiteLaxCrossDowngradeStrict: WarnSameSiteLaxCrossDowngradeStrict = "WarnSameSiteLaxCrossDowngradeStrict".asInstanceOf[WarnSameSiteLaxCrossDowngradeStrict]
  
  @js.native
  sealed trait WarnSameSiteNoneInsecure
    extends StObject
       with SameSiteCookieWarningReason
  inline def WarnSameSiteNoneInsecure: WarnSameSiteNoneInsecure = "WarnSameSiteNoneInsecure".asInstanceOf[WarnSameSiteNoneInsecure]
  
  @js.native
  sealed trait WarnSameSiteStrictCrossDowngradeLax
    extends StObject
       with SameSiteCookieWarningReason
  inline def WarnSameSiteStrictCrossDowngradeLax: WarnSameSiteStrictCrossDowngradeLax = "WarnSameSiteStrictCrossDowngradeLax".asInstanceOf[WarnSameSiteStrictCrossDowngradeLax]
  
  @js.native
  sealed trait WarnSameSiteStrictCrossDowngradeStrict
    extends StObject
       with SameSiteCookieWarningReason
  inline def WarnSameSiteStrictCrossDowngradeStrict: WarnSameSiteStrictCrossDowngradeStrict = "WarnSameSiteStrictCrossDowngradeStrict".asInstanceOf[WarnSameSiteStrictCrossDowngradeStrict]
  
  @js.native
  sealed trait WarnSameSiteStrictLaxDowngradeStrict
    extends StObject
       with SameSiteCookieWarningReason
  inline def WarnSameSiteStrictLaxDowngradeStrict: WarnSameSiteStrictLaxDowngradeStrict = "WarnSameSiteStrictLaxDowngradeStrict".asInstanceOf[WarnSameSiteStrictLaxDowngradeStrict]
  
  @js.native
  sealed trait WarnSameSiteUnspecifiedCrossSiteContext
    extends StObject
       with SameSiteCookieWarningReason
  inline def WarnSameSiteUnspecifiedCrossSiteContext: WarnSameSiteUnspecifiedCrossSiteContext = "WarnSameSiteUnspecifiedCrossSiteContext".asInstanceOf[WarnSameSiteUnspecifiedCrossSiteContext]
  
  @js.native
  sealed trait WarnSameSiteUnspecifiedLaxAllowUnsafe
    extends StObject
       with SameSiteCookieWarningReason
  inline def WarnSameSiteUnspecifiedLaxAllowUnsafe: WarnSameSiteUnspecifiedLaxAllowUnsafe = "WarnSameSiteUnspecifiedLaxAllowUnsafe".asInstanceOf[WarnSameSiteUnspecifiedLaxAllowUnsafe]
  
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
  sealed trait WebSocket
    extends StObject
       with ResourceType
  inline def WebSocket: WebSocket = "WebSocket".asInstanceOf[WebSocket]
  
  @js.native
  sealed trait WheelEventHandler
    extends StObject
       with ScrollRectType
  inline def WheelEventHandler: WheelEventHandler = "WheelEventHandler".asInstanceOf[WheelEventHandler]
  
  @js.native
  sealed trait Worker
    extends StObject
       with MixedContentResourceType
  inline def Worker: Worker = "Worker".asInstanceOf[Worker]
  
  @js.native
  sealed trait XHR
    extends StObject
       with PausedEventReason
       with ResourceType
  inline def XHR: XHR = "XHR".asInstanceOf[XHR]
  
  @js.native
  sealed trait XMLHttpRequest
    extends StObject
       with MixedContentResourceType
  inline def XMLHttpRequest: XMLHttpRequest = "XMLHttpRequest".asInstanceOf[XMLHttpRequest]
  
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
  sealed trait activated
    extends StObject
       with ServiceWorkerVersionStatus
  inline def activated: activated = "activated".asInstanceOf[activated]
  
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
       with SetPauseOnExceptionsRequestState
       with StorageType
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait allow
    extends StObject
       with SetDownloadBehaviorRequestBehavior
       with typings.devtoolsProtocol.mod.Protocol.Browser.SetDownloadBehaviorRequestBehavior
  inline def allow: allow = "allow".asInstanceOf[allow]
  
  @js.native
  sealed trait allowAndName
    extends StObject
       with typings.devtoolsProtocol.mod.Protocol.Browser.SetDownloadBehaviorRequestBehavior
  inline def allowAndName: allowAndName = "allowAndName".asInstanceOf[allowAndName]
  
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
  sealed trait appcache
    extends StObject
       with ConsoleMessageSource
       with LogEntrySource
       with StorageType
  inline def appcache: appcache = "appcache".asInstanceOf[appcache]
  
  @js.native
  sealed trait applicationCacheStatusUpdated extends StObject
  inline def applicationCacheStatusUpdated: applicationCacheStatusUpdated = "applicationCacheStatusUpdated".asInstanceOf[applicationCacheStatusUpdated]
  
  @js.native
  sealed trait array
    extends StObject
       with KeyPathType
       with KeyType
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  inline def array: array = "array".asInstanceOf[array]
  
  @js.native
  sealed trait arraybuffer
    extends StObject
       with RemoteObjectSubtype
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
  sealed trait autocomplete
    extends StObject
       with AXPropertyName
  inline def autocomplete: autocomplete = "autocomplete".asInstanceOf[autocomplete]
  
  @js.native
  sealed trait back
    extends StObject
       with MouseButton
  inline def back: back = "back".asInstanceOf[back]
  
  @js.native
  sealed trait backdrop
    extends StObject
       with PseudoType
  inline def backdrop: backdrop = "backdrop".asInstanceOf[backdrop]
  
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
  sealed trait bigint
    extends StObject
       with ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
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
  inline def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait booleanOrUndefined
    extends StObject
       with AXValueType
  inline def booleanOrUndefined: booleanOrUndefined = "booleanOrUndefined".asInstanceOf[booleanOrUndefined]
  
  @js.native
  sealed trait breakpointResolved extends StObject
  inline def breakpointResolved: breakpointResolved = "breakpointResolved".asInstanceOf[breakpointResolved]
  
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
  sealed trait cancel
    extends StObject
       with CertificateErrorAction
  inline def cancel: cancel = "cancel".asInstanceOf[cancel]
  
  @js.native
  sealed trait canceled
    extends StObject
       with DownloadProgressEventState
  inline def canceled: canceled = "canceled".asInstanceOf[canceled]
  
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
  sealed trait `collapsed-by-client`
    extends StObject
       with BlockedReason
  inline def `collapsed-by-client`: `collapsed-by-client` = "collapsed-by-client".asInstanceOf[`collapsed-by-client`]
  
  @js.native
  sealed trait compilationCacheProduced extends StObject
  inline def compilationCacheProduced: compilationCacheProduced = "compilationCacheProduced".asInstanceOf[compilationCacheProduced]
  
  @js.native
  sealed trait completed
    extends StObject
       with DownloadProgressEventState
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
  sealed trait dataCollected extends StObject
  inline def dataCollected: dataCollected = "dataCollected".asInstanceOf[dataCollected]
  
  @js.native
  sealed trait dataReceived extends StObject
  inline def dataReceived: dataReceived = "dataReceived".asInstanceOf[dataReceived]
  
  @js.native
  sealed trait dataview
    extends StObject
       with RemoteObjectSubtype
  inline def dataview: dataview = "dataview".asInstanceOf[dataview]
  
  @js.native
  sealed trait date
    extends StObject
       with KeyType
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
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
       with SetDownloadBehaviorRequestBehavior
       with typings.devtoolsProtocol.mod.Protocol.Browser.SetDownloadBehaviorRequestBehavior
  inline def default_ : default_ = "default".asInstanceOf[default_]
  
  @js.native
  sealed trait denied
    extends StObject
       with PermissionSetting
  inline def denied: denied = "denied".asInstanceOf[denied]
  
  @js.native
  sealed trait deny
    extends StObject
       with SetDownloadBehaviorRequestBehavior
       with typings.devtoolsProtocol.mod.Protocol.Browser.SetDownloadBehaviorRequestBehavior
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
  sealed trait distributedNodesUpdated extends StObject
  inline def distributedNodesUpdated: distributedNodesUpdated = "distributedNodesUpdated".asInstanceOf[distributedNodesUpdated]
  
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
  sealed trait externref
    extends StObject
       with RemoteObjectSubtype
  inline def externref: externref = "externref".asInstanceOf[externref]
  
  @js.native
  sealed trait f32
    extends StObject
       with RemoteObjectSubtype
  inline def f32: f32 = "f32".asInstanceOf[f32]
  
  @js.native
  sealed trait f64
    extends StObject
       with RemoteObjectSubtype
  inline def f64: f64 = "f64".asInstanceOf[f64]
  
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
  sealed trait frozen
    extends StObject
       with SetWebLifecycleStateRequestState
  inline def frozen: frozen = "frozen".asInstanceOf[frozen]
  
  @js.native
  sealed trait fullscreen
    extends StObject
       with WindowState
  inline def fullscreen: fullscreen = "fullscreen".asInstanceOf[fullscreen]
  
  @js.native
  sealed trait function
    extends StObject
       with ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
  inline def function: function = "function".asInstanceOf[function]
  
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
  inline def geolocation: geolocation = "geolocation".asInstanceOf[geolocation]
  
  @js.native
  sealed trait global
    extends StObject
       with ScopeType
  inline def global: global = "global".asInstanceOf[global]
  
  @js.native
  sealed trait granted
    extends StObject
       with PermissionSetting
  inline def granted: granted = "granted".asInstanceOf[granted]
  
  @js.native
  sealed trait gzip
    extends StObject
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
  sealed trait i32
    extends StObject
       with RemoteObjectSubtype
  inline def i32: i32 = "i32".asInstanceOf[i32]
  
  @js.native
  sealed trait i64
    extends StObject
       with RemoteObjectSubtype
  inline def i64: i64 = "i64".asInstanceOf[i64]
  
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
  sealed trait insecure
    extends StObject
       with SecurityState
  inline def insecure: insecure = "insecure".asInstanceOf[insecure]
  
  @js.native
  sealed trait `insecure-broken`
    extends StObject
       with SecurityState
  inline def `insecure-broken`: `insecure-broken` = "insecure-broken".asInstanceOf[`insecure-broken`]
  
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
  sealed trait `k-rate`
    extends StObject
       with AutomationRate
  inline def `k-rate`: `k-rate` = "k-rate".asInstanceOf[`k-rate`]
  
  @js.native
  sealed trait kEvalViolation
    extends StObject
       with ContentSecurityPolicyViolationType
  inline def kEvalViolation: kEvalViolation = "kEvalViolation".asInstanceOf[kEvalViolation]
  
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
  sealed trait loadEventFired extends StObject
  inline def loadEventFired: loadEventFired = "loadEventFired".asInstanceOf[loadEventFired]
  
  @js.native
  sealed trait loadingFailed extends StObject
  inline def loadingFailed: loadingFailed = "loadingFailed".asInstanceOf[loadingFailed]
  
  @js.native
  sealed trait loadingFinished extends StObject
  inline def loadingFinished: loadingFinished = "loadingFinished".asInstanceOf[loadingFinished]
  
  @js.native
  sealed trait local
    extends StObject
       with ScopeType
  inline def local: local = "local".asInstanceOf[local]
  
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
  inline def map: map = "map".asInstanceOf[map]
  
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
  sealed trait media_error
    extends StObject
       with PlayerErrorType
  inline def media_error: media_error = "media_error".asInstanceOf[media_error]
  
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
  sealed trait middle
    extends StObject
       with MouseButton
  inline def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait midi
    extends StObject
       with PermissionType
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
  sealed trait networkStateUpdated extends StObject
  inline def networkStateUpdated: networkStateUpdated = "networkStateUpdated".asInstanceOf[networkStateUpdated]
  
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
  sealed trait none_
    extends StObject
       with AdFrameType
       with ConnectionType
       with InspectMode
       with MixedContentType
       with MouseButton
       with SetEmulatedVisionDeficiencyRequestType
       with SetPauseOnExceptionsRequestState
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
  inline def `null`: `null` = "null".asInstanceOf[`null`]
  
  @js.native
  sealed trait number
    extends StObject
       with AXValueType
       with KeyType
       with ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait `object`
    extends StObject
       with ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
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
  sealed trait owns
    extends StObject
       with AXPropertyName
  inline def owns: owns = "owns".asInstanceOf[owns]
  
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
  sealed trait pipeline_error
    extends StObject
       with PlayerErrorType
  inline def pipeline_error: pipeline_error = "pipeline_error".asInstanceOf[pipeline_error]
  
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
  sealed trait preload
    extends StObject
       with InitiatorType
  inline def preload: preload = "preload".asInstanceOf[preload]
  
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
       with RemoteObjectSubtype
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
       with RemoteObjectSubtype
  inline def proxy_ : proxy_ = "proxy".asInstanceOf[proxy_]
  
  @js.native
  sealed trait pseudoElementAdded extends StObject
  inline def pseudoElementAdded: pseudoElementAdded = "pseudoElementAdded".asInstanceOf[pseudoElementAdded]
  
  @js.native
  sealed trait pseudoElementRemoved extends StObject
  inline def pseudoElementRemoved: pseudoElementRemoved = "pseudoElementRemoved".asInstanceOf[pseudoElementRemoved]
  
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
  sealed trait rendering
    extends StObject
       with ConsoleMessageSource
       with LogEntrySource
  inline def rendering: rendering = "rendering".asInstanceOf[rendering]
  
  @js.native
  sealed trait reportHeapSnapshotProgress extends StObject
  inline def reportHeapSnapshotProgress: reportHeapSnapshotProgress = "reportHeapSnapshotProgress".asInstanceOf[reportHeapSnapshotProgress]
  
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
  sealed trait symbol
    extends StObject
       with ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
  inline def symbol: symbol = "symbol".asInstanceOf[symbol]
  
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
  sealed trait typed
    extends StObject
       with TransitionType
  inline def typed: typed = "typed".asInstanceOf[typed]
  
  @js.native
  sealed trait typedarray
    extends StObject
       with RemoteObjectSubtype
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
  inline def undefined: undefined = "undefined".asInstanceOf[undefined]
  
  @js.native
  sealed trait unknown
    extends StObject
       with CertificateTransparencyCompliance
       with ImageType
       with SecurityState
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
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
  sealed trait usb
    extends StObject
       with AuthenticatorTransport
  inline def usb: usb = "usb".asInstanceOf[usb]
  
  @js.native
  sealed trait `user-agent`
    extends StObject
       with ShadowRootType
       with StyleSheetOrigin
  inline def `user-agent`: `user-agent` = "user-agent".asInstanceOf[`user-agent`]
  
  @js.native
  sealed trait v128
    extends StObject
       with RemoteObjectSubtype
  inline def v128: v128 = "v128".asInstanceOf[v128]
  
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
  sealed trait wasm
    extends StObject
       with RemoteObjectType
  inline def wasm: wasm = "wasm".asInstanceOf[wasm]
  
  @js.native
  sealed trait `wasm-expression-stack`
    extends StObject
       with ScopeType
  inline def `wasm-expression-stack`: `wasm-expression-stack` = "wasm-expression-stack".asInstanceOf[`wasm-expression-stack`]
  
  @js.native
  sealed trait weakmap
    extends StObject
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  inline def weakmap: weakmap = "weakmap".asInstanceOf[weakmap]
  
  @js.native
  sealed trait weakset
    extends StObject
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  inline def weakset: weakset = "weakset".asInstanceOf[weakset]
  
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
  sealed trait webp
    extends StObject
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
