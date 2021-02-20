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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devtoolsProtocolStrings {
  
  @js.native
  sealed trait Aborted extends ErrorReason
  @scala.inline
  def Aborted: Aborted = "Aborted".asInstanceOf[Aborted]
  
  @js.native
  sealed trait AccessDenied extends ErrorReason
  @scala.inline
  def AccessDenied: AccessDenied = "AccessDenied".asInstanceOf[AccessDenied]
  
  @js.native
  sealed trait AddressUnreachable extends ErrorReason
  @scala.inline
  def AddressUnreachable: AddressUnreachable = "AddressUnreachable".asInstanceOf[AddressUnreachable]
  
  @js.native
  sealed trait Audio extends MixedContentResourceType
  @scala.inline
  def Audio: Audio = "Audio".asInstanceOf[Audio]
  
  @js.native
  sealed trait Beacon extends MixedContentResourceType
  @scala.inline
  def Beacon: Beacon = "Beacon".asInstanceOf[Beacon]
  
  @js.native
  sealed trait BlockedByClient extends ErrorReason
  @scala.inline
  def BlockedByClient: BlockedByClient = "BlockedByClient".asInstanceOf[BlockedByClient]
  
  @js.native
  sealed trait BlockedByResponse extends ErrorReason
  @scala.inline
  def BlockedByResponse: BlockedByResponse = "BlockedByResponse".asInstanceOf[BlockedByResponse]
  
  @js.native
  sealed trait BlockedByResponseIssue extends InspectorIssueCode
  @scala.inline
  def BlockedByResponseIssue: BlockedByResponseIssue = "BlockedByResponseIssue".asInstanceOf[BlockedByResponseIssue]
  
  @js.native
  sealed trait CSPReport extends MixedContentResourceType
  @scala.inline
  def CSPReport: CSPReport = "CSPReport".asInstanceOf[CSPReport]
  
  @js.native
  sealed trait CSPViolationReport extends ResourceType
  @scala.inline
  def CSPViolationReport: CSPViolationReport = "CSPViolationReport".asInstanceOf[CSPViolationReport]
  
  @js.native
  sealed trait CSSAnimation extends AnimationType
  @scala.inline
  def CSSAnimation: CSSAnimation = "CSSAnimation".asInstanceOf[CSSAnimation]
  
  @js.native
  sealed trait CSSTransition extends AnimationType
  @scala.inline
  def CSSTransition: CSSTransition = "CSSTransition".asInstanceOf[CSSTransition]
  
  @js.native
  sealed trait CancelAuth
    extends AuthChallengeResponseResponse
       with typings.devtoolsProtocol.mod.Protocol.Fetch.AuthChallengeResponseResponse
  @scala.inline
  def CancelAuth: CancelAuth = "CancelAuth".asInstanceOf[CancelAuth]
  
  @js.native
  sealed trait CoepFrameResourceNeedsCoepHeader extends BlockedByResponseReason
  @scala.inline
  def CoepFrameResourceNeedsCoepHeader: CoepFrameResourceNeedsCoepHeader = "CoepFrameResourceNeedsCoepHeader".asInstanceOf[CoepFrameResourceNeedsCoepHeader]
  
  @js.native
  sealed trait ConnectionAborted extends ErrorReason
  @scala.inline
  def ConnectionAborted: ConnectionAborted = "ConnectionAborted".asInstanceOf[ConnectionAborted]
  
  @js.native
  sealed trait ConnectionClosed extends ErrorReason
  @scala.inline
  def ConnectionClosed: ConnectionClosed = "ConnectionClosed".asInstanceOf[ConnectionClosed]
  
  @js.native
  sealed trait ConnectionFailed extends ErrorReason
  @scala.inline
  def ConnectionFailed: ConnectionFailed = "ConnectionFailed".asInstanceOf[ConnectionFailed]
  
  @js.native
  sealed trait ConnectionRefused extends ErrorReason
  @scala.inline
  def ConnectionRefused: ConnectionRefused = "ConnectionRefused".asInstanceOf[ConnectionRefused]
  
  @js.native
  sealed trait ConnectionReset extends ErrorReason
  @scala.inline
  def ConnectionReset: ConnectionReset = "ConnectionReset".asInstanceOf[ConnectionReset]
  
  @js.native
  sealed trait ContentSecurityPolicyIssue extends InspectorIssueCode
  @scala.inline
  def ContentSecurityPolicyIssue: ContentSecurityPolicyIssue = "ContentSecurityPolicyIssue".asInstanceOf[ContentSecurityPolicyIssue]
  
  @js.native
  sealed trait CoopSandboxedIFrameCannotNavigateToCoopPage extends BlockedByResponseReason
  @scala.inline
  def CoopSandboxedIFrameCannotNavigateToCoopPage: CoopSandboxedIFrameCannotNavigateToCoopPage = "CoopSandboxedIFrameCannotNavigateToCoopPage".asInstanceOf[CoopSandboxedIFrameCannotNavigateToCoopPage]
  
  @js.native
  sealed trait CorpNotSameOrigin extends BlockedByResponseReason
  @scala.inline
  def CorpNotSameOrigin: CorpNotSameOrigin = "CorpNotSameOrigin".asInstanceOf[CorpNotSameOrigin]
  
  @js.native
  sealed trait CorpNotSameOriginAfterDefaultedToSameOriginByCoep extends BlockedByResponseReason
  @scala.inline
  def CorpNotSameOriginAfterDefaultedToSameOriginByCoep: CorpNotSameOriginAfterDefaultedToSameOriginByCoep = "CorpNotSameOriginAfterDefaultedToSameOriginByCoep".asInstanceOf[CorpNotSameOriginAfterDefaultedToSameOriginByCoep]
  
  @js.native
  sealed trait CorpNotSameSite extends BlockedByResponseReason
  @scala.inline
  def CorpNotSameSite: CorpNotSameSite = "CorpNotSameSite".asInstanceOf[CorpNotSameSite]
  
  @js.native
  sealed trait CpuPeakLimit extends HeavyAdReason
  @scala.inline
  def CpuPeakLimit: CpuPeakLimit = "CpuPeakLimit".asInstanceOf[CpuPeakLimit]
  
  @js.native
  sealed trait CpuTotalLimit extends HeavyAdReason
  @scala.inline
  def CpuTotalLimit: CpuTotalLimit = "CpuTotalLimit".asInstanceOf[CpuTotalLimit]
  
  @js.native
  sealed trait DOM extends PausedEventReason
  @scala.inline
  def DOM: DOM = "DOM".asInstanceOf[DOM]
  
  @js.native
  sealed trait Default
    extends AuthChallengeResponseResponse
       with typings.devtoolsProtocol.mod.Protocol.Fetch.AuthChallengeResponseResponse
  @scala.inline
  def Default: Default = "Default".asInstanceOf[Default]
  
  @js.native
  sealed trait Document extends ResourceType
  @scala.inline
  def Document: Document = "Document".asInstanceOf[Document]
  
  @js.native
  sealed trait DomainMismatch extends CookieBlockedReason
  @scala.inline
  def DomainMismatch: DomainMismatch = "DomainMismatch".asInstanceOf[DomainMismatch]
  
  @js.native
  sealed trait Download extends MixedContentResourceType
  @scala.inline
  def Download: Download = "Download".asInstanceOf[Download]
  
  @js.native
  sealed trait EmbeddedDWARF extends DebugSymbolsType
  @scala.inline
  def EmbeddedDWARF: EmbeddedDWARF = "EmbeddedDWARF".asInstanceOf[EmbeddedDWARF]
  
  @js.native
  sealed trait EventListener extends PausedEventReason
  @scala.inline
  def EventListener: EventListener = "EventListener".asInstanceOf[EventListener]
  
  @js.native
  sealed trait EventSource
    extends MixedContentResourceType
       with ResourceType
  @scala.inline
  def EventSource: EventSource = "EventSource".asInstanceOf[EventSource]
  
  @js.native
  sealed trait ExcludeSameSiteLax extends SameSiteCookieExclusionReason
  @scala.inline
  def ExcludeSameSiteLax: ExcludeSameSiteLax = "ExcludeSameSiteLax".asInstanceOf[ExcludeSameSiteLax]
  
  @js.native
  sealed trait ExcludeSameSiteNoneInsecure extends SameSiteCookieExclusionReason
  @scala.inline
  def ExcludeSameSiteNoneInsecure: ExcludeSameSiteNoneInsecure = "ExcludeSameSiteNoneInsecure".asInstanceOf[ExcludeSameSiteNoneInsecure]
  
  @js.native
  sealed trait ExcludeSameSiteStrict extends SameSiteCookieExclusionReason
  @scala.inline
  def ExcludeSameSiteStrict: ExcludeSameSiteStrict = "ExcludeSameSiteStrict".asInstanceOf[ExcludeSameSiteStrict]
  
  @js.native
  sealed trait ExcludeSameSiteUnspecifiedTreatedAsLax extends SameSiteCookieExclusionReason
  @scala.inline
  def ExcludeSameSiteUnspecifiedTreatedAsLax: ExcludeSameSiteUnspecifiedTreatedAsLax = "ExcludeSameSiteUnspecifiedTreatedAsLax".asInstanceOf[ExcludeSameSiteUnspecifiedTreatedAsLax]
  
  @js.native
  sealed trait ExternalDWARF extends DebugSymbolsType
  @scala.inline
  def ExternalDWARF: ExternalDWARF = "ExternalDWARF".asInstanceOf[ExternalDWARF]
  
  @js.native
  sealed trait Failed extends ErrorReason
  @scala.inline
  def Failed: Failed = "Failed".asInstanceOf[Failed]
  
  @js.native
  sealed trait Favicon extends MixedContentResourceType
  @scala.inline
  def Favicon: Favicon = "Favicon".asInstanceOf[Favicon]
  
  @js.native
  sealed trait Fetch extends ResourceType
  @scala.inline
  def Fetch: Fetch = "Fetch".asInstanceOf[Fetch]
  
  @js.native
  sealed trait Font
    extends MixedContentResourceType
       with ResourceType
  @scala.inline
  def Font: Font = "Font".asInstanceOf[Font]
  
  @js.native
  sealed trait Form extends MixedContentResourceType
  @scala.inline
  def Form: Form = "Form".asInstanceOf[Form]
  
  @js.native
  sealed trait Frame extends MixedContentResourceType
  @scala.inline
  def Frame: Frame = "Frame".asInstanceOf[Frame]
  
  @js.native
  sealed trait HeadersReceived extends InterceptionStage
  @scala.inline
  def HeadersReceived: HeadersReceived = "HeadersReceived".asInstanceOf[HeadersReceived]
  
  @js.native
  sealed trait HeavyAdBlocked extends HeavyAdResolutionStatus
  @scala.inline
  def HeavyAdBlocked: HeavyAdBlocked = "HeavyAdBlocked".asInstanceOf[HeavyAdBlocked]
  
  @js.native
  sealed trait HeavyAdIssue extends InspectorIssueCode
  @scala.inline
  def HeavyAdIssue: HeavyAdIssue = "HeavyAdIssue".asInstanceOf[HeavyAdIssue]
  
  @js.native
  sealed trait HeavyAdWarning extends HeavyAdResolutionStatus
  @scala.inline
  def HeavyAdWarning: HeavyAdWarning = "HeavyAdWarning".asInstanceOf[HeavyAdWarning]
  
  @js.native
  sealed trait High
    extends CookiePriority
       with ResourcePriority
  @scala.inline
  def High: High = "High".asInstanceOf[High]
  
  @js.native
  sealed trait Image
    extends MixedContentResourceType
       with ResourceType
  @scala.inline
  def Image: Image = "Image".asInstanceOf[Image]
  
  @js.native
  sealed trait Import extends MixedContentResourceType
  @scala.inline
  def Import: Import = "Import".asInstanceOf[Import]
  
  @js.native
  sealed trait InsecureAncestor extends SecureContextType
  @scala.inline
  def InsecureAncestor: InsecureAncestor = "InsecureAncestor".asInstanceOf[InsecureAncestor]
  
  @js.native
  sealed trait InsecureScheme extends SecureContextType
  @scala.inline
  def InsecureScheme: InsecureScheme = "InsecureScheme".asInstanceOf[InsecureScheme]
  
  @js.native
  sealed trait InternetDisconnected extends ErrorReason
  @scala.inline
  def InternetDisconnected: InternetDisconnected = "InternetDisconnected".asInstanceOf[InternetDisconnected]
  
  @js.native
  sealed trait InvalidDomain extends SetCookieBlockedReason
  @scala.inline
  def InvalidDomain: InvalidDomain = "InvalidDomain".asInstanceOf[InvalidDomain]
  
  @js.native
  sealed trait InvalidPrefix extends SetCookieBlockedReason
  @scala.inline
  def InvalidPrefix: InvalidPrefix = "InvalidPrefix".asInstanceOf[InvalidPrefix]
  
  @js.native
  sealed trait Isolated extends CrossOriginIsolatedContextType
  @scala.inline
  def Isolated: Isolated = "Isolated".asInstanceOf[Isolated]
  
  @js.native
  sealed trait Issuance extends TrustTokenOperationType
  @scala.inline
  def Issuance: Issuance = "Issuance".asInstanceOf[Issuance]
  
  @js.native
  sealed trait JavaScript extends ScriptLanguage
  @scala.inline
  def JavaScript: JavaScript = "JavaScript".asInstanceOf[JavaScript]
  
  @js.native
  sealed trait Lax extends CookieSameSite
  @scala.inline
  def Lax: Lax = "Lax".asInstanceOf[Lax]
  
  @js.native
  sealed trait Low
    extends CookiePriority
       with ResourcePriority
  @scala.inline
  def Low: Low = "Low".asInstanceOf[Low]
  
  @js.native
  sealed trait Manifest
    extends MixedContentResourceType
       with ResourceType
  @scala.inline
  def Manifest: Manifest = "Manifest".asInstanceOf[Manifest]
  
  @js.native
  sealed trait Media extends ResourceType
  @scala.inline
  def Media: Media = "Media".asInstanceOf[Media]
  
  @js.native
  sealed trait Medium
    extends CookiePriority
       with ResourcePriority
  @scala.inline
  def Medium: Medium = "Medium".asInstanceOf[Medium]
  
  @js.native
  sealed trait MixedContentAutomaticallyUpgraded extends MixedContentResolutionStatus
  @scala.inline
  def MixedContentAutomaticallyUpgraded: MixedContentAutomaticallyUpgraded = "MixedContentAutomaticallyUpgraded".asInstanceOf[MixedContentAutomaticallyUpgraded]
  
  @js.native
  sealed trait MixedContentBlocked extends MixedContentResolutionStatus
  @scala.inline
  def MixedContentBlocked: MixedContentBlocked = "MixedContentBlocked".asInstanceOf[MixedContentBlocked]
  
  @js.native
  sealed trait MixedContentIssue extends InspectorIssueCode
  @scala.inline
  def MixedContentIssue: MixedContentIssue = "MixedContentIssue".asInstanceOf[MixedContentIssue]
  
  @js.native
  sealed trait MixedContentWarning extends MixedContentResolutionStatus
  @scala.inline
  def MixedContentWarning: MixedContentWarning = "MixedContentWarning".asInstanceOf[MixedContentWarning]
  
  @js.native
  sealed trait NameNotResolved extends ErrorReason
  @scala.inline
  def NameNotResolved: NameNotResolved = "NameNotResolved".asInstanceOf[NameNotResolved]
  
  @js.native
  sealed trait NetworkTotalLimit extends HeavyAdReason
  @scala.inline
  def NetworkTotalLimit: NetworkTotalLimit = "NetworkTotalLimit".asInstanceOf[NetworkTotalLimit]
  
  @js.native
  sealed trait None
    extends CookieSameSite
       with CrossOriginEmbedderPolicyValue
       with DebugSymbolsType
  @scala.inline
  def None: None = "None".asInstanceOf[None]
  
  @js.native
  sealed trait NotIsolated extends CrossOriginIsolatedContextType
  @scala.inline
  def NotIsolated: NotIsolated = "NotIsolated".asInstanceOf[NotIsolated]
  
  @js.native
  sealed trait NotIsolatedFeatureDisabled extends CrossOriginIsolatedContextType
  @scala.inline
  def NotIsolatedFeatureDisabled: NotIsolatedFeatureDisabled = "NotIsolatedFeatureDisabled".asInstanceOf[NotIsolatedFeatureDisabled]
  
  @js.native
  sealed trait NotOnPath extends CookieBlockedReason
  @scala.inline
  def NotOnPath: NotOnPath = "NotOnPath".asInstanceOf[NotOnPath]
  
  @js.native
  sealed trait OOM extends PausedEventReason
  @scala.inline
  def OOM: OOM = "OOM".asInstanceOf[OOM]
  
  @js.native
  sealed trait Other extends ResourceType
  @scala.inline
  def Other: Other = "Other".asInstanceOf[Other]
  
  @js.native
  sealed trait OverwriteSecure extends SetCookieBlockedReason
  @scala.inline
  def OverwriteSecure: OverwriteSecure = "OverwriteSecure".asInstanceOf[OverwriteSecure]
  
  @js.native
  sealed trait Ping
    extends MixedContentResourceType
       with ResourceType
  @scala.inline
  def Ping: Ping = "Ping".asInstanceOf[Ping]
  
  @js.native
  sealed trait PluginData extends MixedContentResourceType
  @scala.inline
  def PluginData: PluginData = "PluginData".asInstanceOf[PluginData]
  
  @js.native
  sealed trait PluginResource extends MixedContentResourceType
  @scala.inline
  def PluginResource: PluginResource = "PluginResource".asInstanceOf[PluginResource]
  
  @js.native
  sealed trait Prefetch extends MixedContentResourceType
  @scala.inline
  def Prefetch: Prefetch = "Prefetch".asInstanceOf[Prefetch]
  
  @js.native
  sealed trait ProvideCredentials
    extends AuthChallengeResponseResponse
       with typings.devtoolsProtocol.mod.Protocol.Fetch.AuthChallengeResponseResponse
  @scala.inline
  def ProvideCredentials: ProvideCredentials = "ProvideCredentials".asInstanceOf[ProvideCredentials]
  
  @js.native
  sealed trait Proxy
    extends AuthChallengeSource
       with typings.devtoolsProtocol.mod.Protocol.Fetch.AuthChallengeSource
  @scala.inline
  def Proxy: Proxy = "Proxy".asInstanceOf[Proxy]
  
  @js.native
  sealed trait ReadCookie extends SameSiteCookieOperation
  @scala.inline
  def ReadCookie: ReadCookie = "ReadCookie".asInstanceOf[ReadCookie]
  
  @js.native
  sealed trait Redemption extends TrustTokenOperationType
  @scala.inline
  def Redemption: Redemption = "Redemption".asInstanceOf[Redemption]
  
  @js.native
  sealed trait Refresh extends TrustTokenParamsRefreshPolicy
  @scala.inline
  def Refresh: Refresh = "Refresh".asInstanceOf[Refresh]
  
  @js.native
  sealed trait RepaintsOnScroll extends ScrollRectType
  @scala.inline
  def RepaintsOnScroll: RepaintsOnScroll = "RepaintsOnScroll".asInstanceOf[RepaintsOnScroll]
  
  @js.native
  sealed trait ReportEvents extends StartRequestTransferMode
  @scala.inline
  def ReportEvents: ReportEvents = "ReportEvents".asInstanceOf[ReportEvents]
  
  @js.native
  sealed trait Request
    extends InterceptionStage
       with RequestStage
  @scala.inline
  def Request: Request = "Request".asInstanceOf[Request]
  
  @js.native
  sealed trait RequireCorp extends CrossOriginEmbedderPolicyValue
  @scala.inline
  def RequireCorp: RequireCorp = "RequireCorp".asInstanceOf[RequireCorp]
  
  @js.native
  sealed trait Resource extends MixedContentResourceType
  @scala.inline
  def Resource: Resource = "Resource".asInstanceOf[Resource]
  
  @js.native
  sealed trait Response extends RequestStage
  @scala.inline
  def Response: Response = "Response".asInstanceOf[Response]
  
  @js.native
  sealed trait ReturnAsBase64 extends PrintToPDFRequestTransferMode
  @scala.inline
  def ReturnAsBase64: ReturnAsBase64 = "ReturnAsBase64".asInstanceOf[ReturnAsBase64]
  
  @js.native
  sealed trait ReturnAsStream
    extends PrintToPDFRequestTransferMode
       with StartRequestTransferMode
  @scala.inline
  def ReturnAsStream: ReturnAsStream = "ReturnAsStream".asInstanceOf[ReturnAsStream]
  
  @js.native
  sealed trait SameOrigin extends CrossOriginOpenerPolicyValue
  @scala.inline
  def SameOrigin: SameOrigin = "SameOrigin".asInstanceOf[SameOrigin]
  
  @js.native
  sealed trait SameOriginAllowPopups extends CrossOriginOpenerPolicyValue
  @scala.inline
  def SameOriginAllowPopups: SameOriginAllowPopups = "SameOriginAllowPopups".asInstanceOf[SameOriginAllowPopups]
  
  @js.native
  sealed trait SameOriginPlusCoep extends CrossOriginOpenerPolicyValue
  @scala.inline
  def SameOriginPlusCoep: SameOriginPlusCoep = "SameOriginPlusCoep".asInstanceOf[SameOriginPlusCoep]
  
  @js.native
  sealed trait SameSiteCookieIssue extends InspectorIssueCode
  @scala.inline
  def SameSiteCookieIssue: SameSiteCookieIssue = "SameSiteCookieIssue".asInstanceOf[SameSiteCookieIssue]
  
  @js.native
  sealed trait SameSiteLax
    extends CookieBlockedReason
       with SetCookieBlockedReason
  @scala.inline
  def SameSiteLax: SameSiteLax = "SameSiteLax".asInstanceOf[SameSiteLax]
  
  @js.native
  sealed trait SameSiteNoneInsecure
    extends CookieBlockedReason
       with SetCookieBlockedReason
  @scala.inline
  def SameSiteNoneInsecure: SameSiteNoneInsecure = "SameSiteNoneInsecure".asInstanceOf[SameSiteNoneInsecure]
  
  @js.native
  sealed trait SameSiteStrict
    extends CookieBlockedReason
       with SetCookieBlockedReason
  @scala.inline
  def SameSiteStrict: SameSiteStrict = "SameSiteStrict".asInstanceOf[SameSiteStrict]
  
  @js.native
  sealed trait SameSiteUnspecifiedTreatedAsLax
    extends CookieBlockedReason
       with SetCookieBlockedReason
  @scala.inline
  def SameSiteUnspecifiedTreatedAsLax: SameSiteUnspecifiedTreatedAsLax = "SameSiteUnspecifiedTreatedAsLax".asInstanceOf[SameSiteUnspecifiedTreatedAsLax]
  
  @js.native
  sealed trait SchemeNotSupported extends SetCookieBlockedReason
  @scala.inline
  def SchemeNotSupported: SchemeNotSupported = "SchemeNotSupported".asInstanceOf[SchemeNotSupported]
  
  @js.native
  sealed trait SchemefulSameSiteLax
    extends CookieBlockedReason
       with SetCookieBlockedReason
  @scala.inline
  def SchemefulSameSiteLax: SchemefulSameSiteLax = "SchemefulSameSiteLax".asInstanceOf[SchemefulSameSiteLax]
  
  @js.native
  sealed trait SchemefulSameSiteStrict
    extends CookieBlockedReason
       with SetCookieBlockedReason
  @scala.inline
  def SchemefulSameSiteStrict: SchemefulSameSiteStrict = "SchemefulSameSiteStrict".asInstanceOf[SchemefulSameSiteStrict]
  
  @js.native
  sealed trait SchemefulSameSiteUnspecifiedTreatedAsLax
    extends CookieBlockedReason
       with SetCookieBlockedReason
  @scala.inline
  def SchemefulSameSiteUnspecifiedTreatedAsLax: SchemefulSameSiteUnspecifiedTreatedAsLax = "SchemefulSameSiteUnspecifiedTreatedAsLax".asInstanceOf[SchemefulSameSiteUnspecifiedTreatedAsLax]
  
  @js.native
  sealed trait Script
    extends MixedContentResourceType
       with ResourceType
  @scala.inline
  def Script: Script = "Script".asInstanceOf[Script]
  
  @js.native
  sealed trait Secure extends SecureContextType
  @scala.inline
  def Secure: Secure = "Secure".asInstanceOf[Secure]
  
  @js.native
  sealed trait SecureLocalhost extends SecureContextType
  @scala.inline
  def SecureLocalhost: SecureLocalhost = "SecureLocalhost".asInstanceOf[SecureLocalhost]
  
  @js.native
  sealed trait SecureOnly
    extends CookieBlockedReason
       with SetCookieBlockedReason
  @scala.inline
  def SecureOnly: SecureOnly = "SecureOnly".asInstanceOf[SecureOnly]
  
  @js.native
  sealed trait Server
    extends AuthChallengeSource
       with typings.devtoolsProtocol.mod.Protocol.Fetch.AuthChallengeSource
  @scala.inline
  def Server: Server = "Server".asInstanceOf[Server]
  
  @js.native
  sealed trait ServiceWorker extends MixedContentResourceType
  @scala.inline
  def ServiceWorker: ServiceWorker = "ServiceWorker".asInstanceOf[ServiceWorker]
  
  @js.native
  sealed trait SetCookie extends SameSiteCookieOperation
  @scala.inline
  def SetCookie: SetCookie = "SetCookie".asInstanceOf[SetCookie]
  
  @js.native
  sealed trait SharedWorker extends MixedContentResourceType
  @scala.inline
  def SharedWorker: SharedWorker = "SharedWorker".asInstanceOf[SharedWorker]
  
  @js.native
  sealed trait SignedExchange
    extends InitiatorType
       with ResourceType
  @scala.inline
  def SignedExchange: SignedExchange = "SignedExchange".asInstanceOf[SignedExchange]
  
  @js.native
  sealed trait Signing extends TrustTokenOperationType
  @scala.inline
  def Signing: Signing = "Signing".asInstanceOf[Signing]
  
  @js.native
  sealed trait SourceMap extends DebugSymbolsType
  @scala.inline
  def SourceMap: SourceMap = "SourceMap".asInstanceOf[SourceMap]
  
  @js.native
  sealed trait Strict extends CookieSameSite
  @scala.inline
  def Strict: Strict = "Strict".asInstanceOf[Strict]
  
  @js.native
  sealed trait Stylesheet
    extends MixedContentResourceType
       with ResourceType
  @scala.inline
  def Stylesheet: Stylesheet = "Stylesheet".asInstanceOf[Stylesheet]
  
  @js.native
  sealed trait SyntaxError extends SetCookieBlockedReason
  @scala.inline
  def SyntaxError: SyntaxError = "SyntaxError".asInstanceOf[SyntaxError]
  
  @js.native
  sealed trait TextTrack extends ResourceType
  @scala.inline
  def TextTrack: TextTrack = "TextTrack".asInstanceOf[TextTrack]
  
  @js.native
  sealed trait TimedOut extends ErrorReason
  @scala.inline
  def TimedOut: TimedOut = "TimedOut".asInstanceOf[TimedOut]
  
  @js.native
  sealed trait TouchEventHandler extends ScrollRectType
  @scala.inline
  def TouchEventHandler: TouchEventHandler = "TouchEventHandler".asInstanceOf[TouchEventHandler]
  
  @js.native
  sealed trait Track extends MixedContentResourceType
  @scala.inline
  def Track: Track = "Track".asInstanceOf[Track]
  
  @js.native
  sealed trait UnknownError
    extends CookieBlockedReason
       with SetCookieBlockedReason
  @scala.inline
  def UnknownError: UnknownError = "UnknownError".asInstanceOf[UnknownError]
  
  @js.native
  sealed trait UnsafeNone extends CrossOriginOpenerPolicyValue
  @scala.inline
  def UnsafeNone: UnsafeNone = "UnsafeNone".asInstanceOf[UnsafeNone]
  
  @js.native
  sealed trait UseCached extends TrustTokenParamsRefreshPolicy
  @scala.inline
  def UseCached: UseCached = "UseCached".asInstanceOf[UseCached]
  
  @js.native
  sealed trait UserPreferences
    extends CookieBlockedReason
       with SetCookieBlockedReason
  @scala.inline
  def UserPreferences: UserPreferences = "UserPreferences".asInstanceOf[UserPreferences]
  
  @js.native
  sealed trait VeryHigh extends ResourcePriority
  @scala.inline
  def VeryHigh: VeryHigh = "VeryHigh".asInstanceOf[VeryHigh]
  
  @js.native
  sealed trait VeryLow extends ResourcePriority
  @scala.inline
  def VeryLow: VeryLow = "VeryLow".asInstanceOf[VeryLow]
  
  @js.native
  sealed trait Video extends MixedContentResourceType
  @scala.inline
  def Video: Video = "Video".asInstanceOf[Video]
  
  @js.native
  sealed trait WarnSameSiteLaxCrossDowngradeLax extends SameSiteCookieWarningReason
  @scala.inline
  def WarnSameSiteLaxCrossDowngradeLax: WarnSameSiteLaxCrossDowngradeLax = "WarnSameSiteLaxCrossDowngradeLax".asInstanceOf[WarnSameSiteLaxCrossDowngradeLax]
  
  @js.native
  sealed trait WarnSameSiteLaxCrossDowngradeStrict extends SameSiteCookieWarningReason
  @scala.inline
  def WarnSameSiteLaxCrossDowngradeStrict: WarnSameSiteLaxCrossDowngradeStrict = "WarnSameSiteLaxCrossDowngradeStrict".asInstanceOf[WarnSameSiteLaxCrossDowngradeStrict]
  
  @js.native
  sealed trait WarnSameSiteNoneInsecure extends SameSiteCookieWarningReason
  @scala.inline
  def WarnSameSiteNoneInsecure: WarnSameSiteNoneInsecure = "WarnSameSiteNoneInsecure".asInstanceOf[WarnSameSiteNoneInsecure]
  
  @js.native
  sealed trait WarnSameSiteStrictCrossDowngradeLax extends SameSiteCookieWarningReason
  @scala.inline
  def WarnSameSiteStrictCrossDowngradeLax: WarnSameSiteStrictCrossDowngradeLax = "WarnSameSiteStrictCrossDowngradeLax".asInstanceOf[WarnSameSiteStrictCrossDowngradeLax]
  
  @js.native
  sealed trait WarnSameSiteStrictCrossDowngradeStrict extends SameSiteCookieWarningReason
  @scala.inline
  def WarnSameSiteStrictCrossDowngradeStrict: WarnSameSiteStrictCrossDowngradeStrict = "WarnSameSiteStrictCrossDowngradeStrict".asInstanceOf[WarnSameSiteStrictCrossDowngradeStrict]
  
  @js.native
  sealed trait WarnSameSiteStrictLaxDowngradeStrict extends SameSiteCookieWarningReason
  @scala.inline
  def WarnSameSiteStrictLaxDowngradeStrict: WarnSameSiteStrictLaxDowngradeStrict = "WarnSameSiteStrictLaxDowngradeStrict".asInstanceOf[WarnSameSiteStrictLaxDowngradeStrict]
  
  @js.native
  sealed trait WarnSameSiteUnspecifiedCrossSiteContext extends SameSiteCookieWarningReason
  @scala.inline
  def WarnSameSiteUnspecifiedCrossSiteContext: WarnSameSiteUnspecifiedCrossSiteContext = "WarnSameSiteUnspecifiedCrossSiteContext".asInstanceOf[WarnSameSiteUnspecifiedCrossSiteContext]
  
  @js.native
  sealed trait WarnSameSiteUnspecifiedLaxAllowUnsafe extends SameSiteCookieWarningReason
  @scala.inline
  def WarnSameSiteUnspecifiedLaxAllowUnsafe: WarnSameSiteUnspecifiedLaxAllowUnsafe = "WarnSameSiteUnspecifiedLaxAllowUnsafe".asInstanceOf[WarnSameSiteUnspecifiedLaxAllowUnsafe]
  
  @js.native
  sealed trait WebAnimation extends AnimationType
  @scala.inline
  def WebAnimation: WebAnimation = "WebAnimation".asInstanceOf[WebAnimation]
  
  @js.native
  sealed trait WebAssembly extends ScriptLanguage
  @scala.inline
  def WebAssembly: WebAssembly = "WebAssembly".asInstanceOf[WebAssembly]
  
  @js.native
  sealed trait WebSocket extends ResourceType
  @scala.inline
  def WebSocket: WebSocket = "WebSocket".asInstanceOf[WebSocket]
  
  @js.native
  sealed trait WheelEventHandler extends ScrollRectType
  @scala.inline
  def WheelEventHandler: WheelEventHandler = "WheelEventHandler".asInstanceOf[WheelEventHandler]
  
  @js.native
  sealed trait Worker extends MixedContentResourceType
  @scala.inline
  def Worker: Worker = "Worker".asInstanceOf[Worker]
  
  @js.native
  sealed trait XHR
    extends PausedEventReason
       with ResourceType
  @scala.inline
  def XHR: XHR = "XHR".asInstanceOf[XHR]
  
  @js.native
  sealed trait XMLHttpRequest extends MixedContentResourceType
  @scala.inline
  def XMLHttpRequest: XMLHttpRequest = "XMLHttpRequest".asInstanceOf[XMLHttpRequest]
  
  @js.native
  sealed trait XSLT extends MixedContentResourceType
  @scala.inline
  def XSLT: XSLT = "XSLT".asInstanceOf[XSLT]
  
  @js.native
  sealed trait `a-rate` extends AutomationRate
  @scala.inline
  def `a-rate`: `a-rate` = "a-rate".asInstanceOf[`a-rate`]
  
  @js.native
  sealed trait accepted extends StObject
  @scala.inline
  def accepted: accepted = "accepted".asInstanceOf[accepted]
  
  @js.native
  sealed trait accessibilityEvents extends PermissionType
  @scala.inline
  def accessibilityEvents: accessibilityEvents = "accessibilityEvents".asInstanceOf[accessibilityEvents]
  
  @js.native
  sealed trait accessor extends PropertyPreviewType
  @scala.inline
  def accessor: accessor = "accessor".asInstanceOf[accessor]
  
  @js.native
  sealed trait achromatopsia extends SetEmulatedVisionDeficiencyRequestType
  @scala.inline
  def achromatopsia: achromatopsia = "achromatopsia".asInstanceOf[achromatopsia]
  
  @js.native
  sealed trait activated extends ServiceWorkerVersionStatus
  @scala.inline
  def activated: activated = "activated".asInstanceOf[activated]
  
  @js.native
  sealed trait activating extends ServiceWorkerVersionStatus
  @scala.inline
  def activating: activating = "activating".asInstanceOf[activating]
  
  @js.native
  sealed trait active extends SetWebLifecycleStateRequestState
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait activedescendant extends AXPropertyName
  @scala.inline
  def activedescendant: activedescendant = "activedescendant".asInstanceOf[activedescendant]
  
  @js.native
  sealed trait addDatabase extends StObject
  @scala.inline
  def addDatabase: addDatabase = "addDatabase".asInstanceOf[addDatabase]
  
  @js.native
  sealed trait addHeapSnapshotChunk extends StObject
  @scala.inline
  def addHeapSnapshotChunk: addHeapSnapshotChunk = "addHeapSnapshotChunk".asInstanceOf[addHeapSnapshotChunk]
  
  @js.native
  sealed trait address_bar extends TransitionType
  @scala.inline
  def address_bar: address_bar = "address_bar".asInstanceOf[address_bar]
  
  @js.native
  sealed trait advance extends VirtualTimePolicy
  @scala.inline
  def advance: advance = "advance".asInstanceOf[advance]
  
  @js.native
  sealed trait after extends PseudoType
  @scala.inline
  def after: after = "after".asInstanceOf[after]
  
  @js.native
  sealed trait alert extends DialogType
  @scala.inline
  def alert: alert = "alert".asInstanceOf[alert]
  
  @js.native
  sealed trait all
    extends SetPauseOnExceptionsRequestState
       with StorageType
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait allow
    extends SetDownloadBehaviorRequestBehavior
       with typings.devtoolsProtocol.mod.Protocol.Browser.SetDownloadBehaviorRequestBehavior
  @scala.inline
  def allow: allow = "allow".asInstanceOf[allow]
  
  @js.native
  sealed trait allowAndName
    extends typings.devtoolsProtocol.mod.Protocol.Browser.SetDownloadBehaviorRequestBehavior
  @scala.inline
  def allowAndName: allowAndName = "allowAndName".asInstanceOf[allowAndName]
  
  @js.native
  sealed trait ambiguous extends PausedEventReason
  @scala.inline
  def ambiguous: ambiguous = "ambiguous".asInstanceOf[ambiguous]
  
  @js.native
  sealed trait anchorClick extends ClientNavigationReason
  @scala.inline
  def anchorClick: anchorClick = "anchorClick".asInstanceOf[anchorClick]
  
  @js.native
  sealed trait animationCanceled extends StObject
  @scala.inline
  def animationCanceled: animationCanceled = "animationCanceled".asInstanceOf[animationCanceled]
  
  @js.native
  sealed trait animationCreated extends StObject
  @scala.inline
  def animationCreated: animationCreated = "animationCreated".asInstanceOf[animationCreated]
  
  @js.native
  sealed trait animationStarted extends StObject
  @scala.inline
  def animationStarted: animationStarted = "animationStarted".asInstanceOf[animationStarted]
  
  @js.native
  sealed trait any extends ContinueToLocationRequestTargetCallFrames
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait appcache
    extends ConsoleMessageSource
       with LogEntrySource
       with StorageType
  @scala.inline
  def appcache: appcache = "appcache".asInstanceOf[appcache]
  
  @js.native
  sealed trait applicationCacheStatusUpdated extends StObject
  @scala.inline
  def applicationCacheStatusUpdated: applicationCacheStatusUpdated = "applicationCacheStatusUpdated".asInstanceOf[applicationCacheStatusUpdated]
  
  @js.native
  sealed trait array
    extends KeyPathType
       with KeyType
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  
  @js.native
  sealed trait arraybuffer extends RemoteObjectSubtype
  @scala.inline
  def arraybuffer: arraybuffer = "arraybuffer".asInstanceOf[arraybuffer]
  
  @js.native
  sealed trait assert
    extends ConsoleAPICalledEventType
       with PausedEventReason
  @scala.inline
  def assert: assert = "assert".asInstanceOf[assert]
  
  @js.native
  sealed trait atomic extends AXPropertyName
  @scala.inline
  def atomic: atomic = "atomic".asInstanceOf[atomic]
  
  @js.native
  sealed trait attachedToTarget extends StObject
  @scala.inline
  def attachedToTarget: attachedToTarget = "attachedToTarget".asInstanceOf[attachedToTarget]
  
  @js.native
  sealed trait attribute extends AXValueSourceType
  @scala.inline
  def attribute: attribute = "attribute".asInstanceOf[attribute]
  
  @js.native
  sealed trait `attribute-modified` extends DOMBreakpointType
  @scala.inline
  def `attribute-modified`: `attribute-modified` = "attribute-modified".asInstanceOf[`attribute-modified`]
  
  @js.native
  sealed trait attributeModified extends StObject
  @scala.inline
  def attributeModified: attributeModified = "attributeModified".asInstanceOf[attributeModified]
  
  @js.native
  sealed trait attributeRemoved extends StObject
  @scala.inline
  def attributeRemoved: attributeRemoved = "attributeRemoved".asInstanceOf[attributeRemoved]
  
  @js.native
  sealed trait audioCapture extends PermissionType
  @scala.inline
  def audioCapture: audioCapture = "audioCapture".asInstanceOf[audioCapture]
  
  @js.native
  sealed trait audioListenerCreated extends StObject
  @scala.inline
  def audioListenerCreated: audioListenerCreated = "audioListenerCreated".asInstanceOf[audioListenerCreated]
  
  @js.native
  sealed trait audioListenerWillBeDestroyed extends StObject
  @scala.inline
  def audioListenerWillBeDestroyed: audioListenerWillBeDestroyed = "audioListenerWillBeDestroyed".asInstanceOf[audioListenerWillBeDestroyed]
  
  @js.native
  sealed trait audioNodeCreated extends StObject
  @scala.inline
  def audioNodeCreated: audioNodeCreated = "audioNodeCreated".asInstanceOf[audioNodeCreated]
  
  @js.native
  sealed trait audioNodeWillBeDestroyed extends StObject
  @scala.inline
  def audioNodeWillBeDestroyed: audioNodeWillBeDestroyed = "audioNodeWillBeDestroyed".asInstanceOf[audioNodeWillBeDestroyed]
  
  @js.native
  sealed trait audioParamCreated extends StObject
  @scala.inline
  def audioParamCreated: audioParamCreated = "audioParamCreated".asInstanceOf[audioParamCreated]
  
  @js.native
  sealed trait audioParamWillBeDestroyed extends StObject
  @scala.inline
  def audioParamWillBeDestroyed: audioParamWillBeDestroyed = "audioParamWillBeDestroyed".asInstanceOf[audioParamWillBeDestroyed]
  
  @js.native
  sealed trait authRequired extends StObject
  @scala.inline
  def authRequired: authRequired = "authRequired".asInstanceOf[authRequired]
  
  @js.native
  sealed trait auto_bookmark extends TransitionType
  @scala.inline
  def auto_bookmark: auto_bookmark = "auto_bookmark".asInstanceOf[auto_bookmark]
  
  @js.native
  sealed trait auto_subframe extends TransitionType
  @scala.inline
  def auto_subframe: auto_subframe = "auto_subframe".asInstanceOf[auto_subframe]
  
  @js.native
  sealed trait auto_toplevel extends TransitionType
  @scala.inline
  def auto_toplevel: auto_toplevel = "auto_toplevel".asInstanceOf[auto_toplevel]
  
  @js.native
  sealed trait autocomplete extends AXPropertyName
  @scala.inline
  def autocomplete: autocomplete = "autocomplete".asInstanceOf[autocomplete]
  
  @js.native
  sealed trait back extends MouseButton
  @scala.inline
  def back: back = "back".asInstanceOf[back]
  
  @js.native
  sealed trait backdrop extends PseudoType
  @scala.inline
  def backdrop: backdrop = "backdrop".asInstanceOf[backdrop]
  
  @js.native
  sealed trait backgroundFetch
    extends PermissionType
       with ServiceName
  @scala.inline
  def backgroundFetch: backgroundFetch = "backgroundFetch".asInstanceOf[backgroundFetch]
  
  @js.native
  sealed trait backgroundServiceEventReceived extends StObject
  @scala.inline
  def backgroundServiceEventReceived: backgroundServiceEventReceived = "backgroundServiceEventReceived".asInstanceOf[backgroundServiceEventReceived]
  
  @js.native
  sealed trait backgroundSync
    extends PermissionType
       with ServiceName
  @scala.inline
  def backgroundSync: backgroundSync = "backgroundSync".asInstanceOf[backgroundSync]
  
  @js.native
  sealed trait badReputation extends SafetyTipStatus
  @scala.inline
  def badReputation: badReputation = "badReputation".asInstanceOf[badReputation]
  
  @js.native
  sealed trait basic extends CachedResponseType
  @scala.inline
  def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait before extends PseudoType
  @scala.inline
  def before: before = "before".asInstanceOf[before]
  
  @js.native
  sealed trait beforeScriptExecution extends SetInstrumentationBreakpointRequestInstrumentation
  @scala.inline
  def beforeScriptExecution: beforeScriptExecution = "beforeScriptExecution".asInstanceOf[beforeScriptExecution]
  
  @js.native
  sealed trait beforeScriptWithSourceMapExecution extends SetInstrumentationBreakpointRequestInstrumentation
  @scala.inline
  def beforeScriptWithSourceMapExecution: beforeScriptWithSourceMapExecution = "beforeScriptWithSourceMapExecution".asInstanceOf[beforeScriptWithSourceMapExecution]
  
  @js.native
  sealed trait beforeunload extends DialogType
  @scala.inline
  def beforeunload: beforeunload = "beforeunload".asInstanceOf[beforeunload]
  
  @js.native
  sealed trait bigint
    extends ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
  @scala.inline
  def bigint: bigint = "bigint".asInstanceOf[bigint]
  
  @js.native
  sealed trait bindingCalled extends StObject
  @scala.inline
  def bindingCalled: bindingCalled = "bindingCalled".asInstanceOf[bindingCalled]
  
  @js.native
  sealed trait ble extends AuthenticatorTransport
  @scala.inline
  def ble: ble = "ble".asInstanceOf[ble]
  
  @js.native
  sealed trait block extends ScopeType
  @scala.inline
  def block: block = "block".asInstanceOf[block]
  
  @js.native
  sealed trait blockable extends MixedContentType
  @scala.inline
  def blockable: blockable = "blockable".asInstanceOf[blockable]
  
  @js.native
  sealed trait blockedEvent extends ViolationSettingName
  @scala.inline
  def blockedEvent: blockedEvent = "blockedEvent".asInstanceOf[blockedEvent]
  
  @js.native
  sealed trait blockedParser extends ViolationSettingName
  @scala.inline
  def blockedParser: blockedParser = "blockedParser".asInstanceOf[blockedParser]
  
  @js.native
  sealed trait bluetooth extends ConnectionType
  @scala.inline
  def bluetooth: bluetooth = "bluetooth".asInstanceOf[bluetooth]
  
  @js.native
  sealed trait blurredVision extends SetEmulatedVisionDeficiencyRequestType
  @scala.inline
  def blurredVision: blurredVision = "blurredVision".asInstanceOf[blurredVision]
  
  @js.native
  sealed trait boolean
    extends AXValueType
       with ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait booleanOrUndefined extends AXValueType
  @scala.inline
  def booleanOrUndefined: booleanOrUndefined = "booleanOrUndefined".asInstanceOf[booleanOrUndefined]
  
  @js.native
  sealed trait breakpointResolved extends StObject
  @scala.inline
  def breakpointResolved: breakpointResolved = "breakpointResolved".asInstanceOf[breakpointResolved]
  
  @js.native
  sealed trait bufferUsage extends StObject
  @scala.inline
  def bufferUsage: bufferUsage = "bufferUsage".asInstanceOf[bufferUsage]
  
  @js.native
  sealed trait busy extends AXPropertyName
  @scala.inline
  def busy: busy = "busy".asInstanceOf[busy]
  
  @js.native
  sealed trait cable extends AuthenticatorTransport
  @scala.inline
  def cable: cable = "cable".asInstanceOf[cable]
  
  @js.native
  sealed trait `cache-storage` extends ServiceWorkerResponseSource
  @scala.inline
  def `cache-storage`: `cache-storage` = "cache-storage".asInstanceOf[`cache-storage`]
  
  @js.native
  sealed trait cacheStorageContentUpdated extends StObject
  @scala.inline
  def cacheStorageContentUpdated: cacheStorageContentUpdated = "cacheStorageContentUpdated".asInstanceOf[cacheStorageContentUpdated]
  
  @js.native
  sealed trait cacheStorageListUpdated extends StObject
  @scala.inline
  def cacheStorageListUpdated: cacheStorageListUpdated = "cacheStorageListUpdated".asInstanceOf[cacheStorageListUpdated]
  
  @js.native
  sealed trait cache_storage extends StorageType
  @scala.inline
  def cache_storage: cache_storage = "cache_storage".asInstanceOf[cache_storage]
  
  @js.native
  sealed trait call extends BreakLocationType
  @scala.inline
  def call: call = "call".asInstanceOf[call]
  
  @js.native
  sealed trait cancel extends CertificateErrorAction
  @scala.inline
  def cancel: cancel = "cancel".asInstanceOf[cancel]
  
  @js.native
  sealed trait canceled extends DownloadProgressEventState
  @scala.inline
  def canceled: canceled = "canceled".asInstanceOf[canceled]
  
  @js.native
  sealed trait captureAreaScreenshot extends InspectMode
  @scala.inline
  def captureAreaScreenshot: captureAreaScreenshot = "captureAreaScreenshot".asInstanceOf[captureAreaScreenshot]
  
  @js.native
  sealed trait `catch` extends ScopeType
  @scala.inline
  def `catch`: `catch` = "catch".asInstanceOf[`catch`]
  
  @js.native
  sealed trait cellular2g extends ConnectionType
  @scala.inline
  def cellular2g: cellular2g = "cellular2g".asInstanceOf[cellular2g]
  
  @js.native
  sealed trait cellular3g extends ConnectionType
  @scala.inline
  def cellular3g: cellular3g = "cellular3g".asInstanceOf[cellular3g]
  
  @js.native
  sealed trait cellular4g extends ConnectionType
  @scala.inline
  def cellular4g: cellular4g = "cellular4g".asInstanceOf[cellular4g]
  
  @js.native
  sealed trait certificateError extends StObject
  @scala.inline
  def certificateError: certificateError = "certificateError".asInstanceOf[certificateError]
  
  @js.native
  sealed trait char extends DispatchKeyEventRequestType
  @scala.inline
  def char: char = "char".asInstanceOf[char]
  
  @js.native
  sealed trait characterDataModified extends StObject
  @scala.inline
  def characterDataModified: characterDataModified = "characterDataModified".asInstanceOf[characterDataModified]
  
  @js.native
  sealed trait checked extends AXPropertyName
  @scala.inline
  def checked: checked = "checked".asInstanceOf[checked]
  
  @js.native
  sealed trait child extends AdFrameType
  @scala.inline
  def child: child = "child".asInstanceOf[child]
  
  @js.native
  sealed trait childNodeCountUpdated extends StObject
  @scala.inline
  def childNodeCountUpdated: childNodeCountUpdated = "childNodeCountUpdated".asInstanceOf[childNodeCountUpdated]
  
  @js.native
  sealed trait childNodeInserted extends StObject
  @scala.inline
  def childNodeInserted: childNodeInserted = "childNodeInserted".asInstanceOf[childNodeInserted]
  
  @js.native
  sealed trait childNodeRemoved extends StObject
  @scala.inline
  def childNodeRemoved: childNodeRemoved = "childNodeRemoved".asInstanceOf[childNodeRemoved]
  
  @js.native
  sealed trait `clamped-max` extends ChannelCountMode
  @scala.inline
  def `clamped-max`: `clamped-max` = "clamped-max".asInstanceOf[`clamped-max`]
  
  @js.native
  sealed trait clear extends ConsoleAPICalledEventType
  @scala.inline
  def clear: clear = "clear".asInstanceOf[clear]
  
  @js.native
  sealed trait clipboardReadWrite extends PermissionType
  @scala.inline
  def clipboardReadWrite: clipboardReadWrite = "clipboardReadWrite".asInstanceOf[clipboardReadWrite]
  
  @js.native
  sealed trait clipboardSanitizedWrite extends PermissionType
  @scala.inline
  def clipboardSanitizedWrite: clipboardSanitizedWrite = "clipboardSanitizedWrite".asInstanceOf[clipboardSanitizedWrite]
  
  @js.native
  sealed trait closed
    extends ContextState
       with ShadowRootType
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait closure extends ScopeType
  @scala.inline
  def closure: closure = "closure".asInstanceOf[closure]
  
  @js.native
  sealed trait `coep-frame-resource-needs-coep-header` extends BlockedReason
  @scala.inline
  def `coep-frame-resource-needs-coep-header`: `coep-frame-resource-needs-coep-header` = "coep-frame-resource-needs-coep-header".asInstanceOf[`coep-frame-resource-needs-coep-header`]
  
  @js.native
  sealed trait `collapsed-by-client` extends BlockedReason
  @scala.inline
  def `collapsed-by-client`: `collapsed-by-client` = "collapsed-by-client".asInstanceOf[`collapsed-by-client`]
  
  @js.native
  sealed trait compilationCacheProduced extends StObject
  @scala.inline
  def compilationCacheProduced: compilationCacheProduced = "compilationCacheProduced".asInstanceOf[compilationCacheProduced]
  
  @js.native
  sealed trait completed extends DownloadProgressEventState
  @scala.inline
  def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait compliant extends CertificateTransparencyCompliance
  @scala.inline
  def compliant: compliant = "compliant".asInstanceOf[compliant]
  
  @js.native
  sealed trait computedString extends AXValueType
  @scala.inline
  def computedString: computedString = "computedString".asInstanceOf[computedString]
  
  @js.native
  sealed trait confirm extends DialogType
  @scala.inline
  def confirm: confirm = "confirm".asInstanceOf[confirm]
  
  @js.native
  sealed trait `console-api` extends ConsoleMessageSource
  @scala.inline
  def `console-api`: `console-api` = "console-api".asInstanceOf[`console-api`]
  
  @js.native
  sealed trait consoleAPICalled extends StObject
  @scala.inline
  def consoleAPICalled: consoleAPICalled = "consoleAPICalled".asInstanceOf[consoleAPICalled]
  
  @js.native
  sealed trait consoleProfileFinished extends StObject
  @scala.inline
  def consoleProfileFinished: consoleProfileFinished = "consoleProfileFinished".asInstanceOf[consoleProfileFinished]
  
  @js.native
  sealed trait consoleProfileStarted extends StObject
  @scala.inline
  def consoleProfileStarted: consoleProfileStarted = "consoleProfileStarted".asInstanceOf[consoleProfileStarted]
  
  @js.native
  sealed trait `content-type` extends BlockedReason
  @scala.inline
  def `content-type`: `content-type` = "content-type".asInstanceOf[`content-type`]
  
  @js.native
  sealed trait contents extends AXValueSourceType
  @scala.inline
  def contents: contents = "contents".asInstanceOf[contents]
  
  @js.native
  sealed trait contextChanged extends StObject
  @scala.inline
  def contextChanged: contextChanged = "contextChanged".asInstanceOf[contextChanged]
  
  @js.native
  sealed trait contextCreated extends StObject
  @scala.inline
  def contextCreated: contextCreated = "contextCreated".asInstanceOf[contextCreated]
  
  @js.native
  sealed trait contextWillBeDestroyed extends StObject
  @scala.inline
  def contextWillBeDestroyed: contextWillBeDestroyed = "contextWillBeDestroyed".asInstanceOf[contextWillBeDestroyed]
  
  @js.native
  sealed trait continue extends CertificateErrorAction
  @scala.inline
  def continue: continue = "continue".asInstanceOf[continue]
  
  @js.native
  sealed trait controls extends AXPropertyName
  @scala.inline
  def controls: controls = "controls".asInstanceOf[controls]
  
  @js.native
  sealed trait cookies extends StorageType
  @scala.inline
  def cookies: cookies = "cookies".asInstanceOf[cookies]
  
  @js.native
  sealed trait `coop-sandboxed-iframe-cannot-navigate-to-coop-page` extends BlockedReason
  @scala.inline
  def `coop-sandboxed-iframe-cannot-navigate-to-coop-page`: `coop-sandboxed-iframe-cannot-navigate-to-coop-page` = "coop-sandboxed-iframe-cannot-navigate-to-coop-page".asInstanceOf[`coop-sandboxed-iframe-cannot-navigate-to-coop-page`]
  
  @js.native
  sealed trait `corp-not-same-origin` extends BlockedReason
  @scala.inline
  def `corp-not-same-origin`: `corp-not-same-origin` = "corp-not-same-origin".asInstanceOf[`corp-not-same-origin`]
  
  @js.native
  sealed trait `corp-not-same-origin-after-defaulted-to-same-origin-by-coep` extends BlockedReason
  @scala.inline
  def `corp-not-same-origin-after-defaulted-to-same-origin-by-coep`: `corp-not-same-origin-after-defaulted-to-same-origin-by-coep` = "corp-not-same-origin-after-defaulted-to-same-origin-by-coep".asInstanceOf[`corp-not-same-origin-after-defaulted-to-same-origin-by-coep`]
  
  @js.native
  sealed trait `corp-not-same-site` extends BlockedReason
  @scala.inline
  def `corp-not-same-site`: `corp-not-same-site` = "corp-not-same-site".asInstanceOf[`corp-not-same-site`]
  
  @js.native
  sealed trait cors extends CachedResponseType
  @scala.inline
  def cors: cors = "cors".asInstanceOf[cors]
  
  @js.native
  sealed trait count extends ConsoleAPICalledEventType
  @scala.inline
  def count: count = "count".asInstanceOf[count]
  
  @js.native
  sealed trait critical extends PressureLevel
  @scala.inline
  def critical: critical = "critical".asInstanceOf[critical]
  
  @js.native
  sealed trait csp extends BlockedReason
  @scala.inline
  def csp: csp = "csp".asInstanceOf[csp]
  
  @js.native
  sealed trait ctap2 extends AuthenticatorProtocol
  @scala.inline
  def ctap2: ctap2 = "ctap2".asInstanceOf[ctap2]
  
  @js.native
  sealed trait current extends ContinueToLocationRequestTargetCallFrames
  @scala.inline
  def current: current = "current".asInstanceOf[current]
  
  @js.native
  sealed trait currentTab extends ClientNavigationDisposition
  @scala.inline
  def currentTab: currentTab = "currentTab".asInstanceOf[currentTab]
  
  @js.native
  sealed trait dataCollected extends StObject
  @scala.inline
  def dataCollected: dataCollected = "dataCollected".asInstanceOf[dataCollected]
  
  @js.native
  sealed trait dataReceived extends StObject
  @scala.inline
  def dataReceived: dataReceived = "dataReceived".asInstanceOf[dataReceived]
  
  @js.native
  sealed trait dataview extends RemoteObjectSubtype
  @scala.inline
  def dataview: dataview = "dataview".asInstanceOf[dataview]
  
  @js.native
  sealed trait date
    extends KeyType
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait debug
    extends ConsoleAPICalledEventType
       with ConsoleMessageLevel
       with PlayerMessageLevel
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait debugCommand extends PausedEventReason
  @scala.inline
  def debugCommand: debugCommand = "debugCommand".asInstanceOf[debugCommand]
  
  @js.native
  sealed trait debuggerStatement extends BreakLocationType
  @scala.inline
  def debuggerStatement: debuggerStatement = "debuggerStatement".asInstanceOf[debuggerStatement]
  
  @js.native
  sealed trait default_
    extends CachedResponseType
       with GestureSourceType
       with SetDownloadBehaviorRequestBehavior
       with typings.devtoolsProtocol.mod.Protocol.Browser.SetDownloadBehaviorRequestBehavior
  @scala.inline
  def default_ : default_ = "default".asInstanceOf[default_]
  
  @js.native
  sealed trait denied extends PermissionSetting
  @scala.inline
  def denied: denied = "denied".asInstanceOf[denied]
  
  @js.native
  sealed trait deny
    extends SetDownloadBehaviorRequestBehavior
       with typings.devtoolsProtocol.mod.Protocol.Browser.SetDownloadBehaviorRequestBehavior
  @scala.inline
  def deny: deny = "deny".asInstanceOf[deny]
  
  @js.native
  sealed trait deprecation
    extends ConsoleMessageSource
       with LogEntrySource
  @scala.inline
  def deprecation: deprecation = "deprecation".asInstanceOf[deprecation]
  
  @js.native
  sealed trait describedby extends AXPropertyName
  @scala.inline
  def describedby: describedby = "describedby".asInstanceOf[describedby]
  
  @js.native
  sealed trait desktop
    extends SetEmitTouchEventsForMouseRequestConfiguration
       with SetTouchEmulationEnabledRequestConfiguration
  @scala.inline
  def desktop: desktop = "desktop".asInstanceOf[desktop]
  
  @js.native
  sealed trait detached extends StObject
  @scala.inline
  def detached: detached = "detached".asInstanceOf[detached]
  
  @js.native
  sealed trait detachedFromTarget extends StObject
  @scala.inline
  def detachedFromTarget: detachedFromTarget = "detachedFromTarget".asInstanceOf[detachedFromTarget]
  
  @js.native
  sealed trait details extends AXPropertyName
  @scala.inline
  def details: details = "details".asInstanceOf[details]
  
  @js.native
  sealed trait deuteranopia extends SetEmulatedVisionDeficiencyRequestType
  @scala.inline
  def deuteranopia: deuteranopia = "deuteranopia".asInstanceOf[deuteranopia]
  
  @js.native
  sealed trait dir extends ConsoleAPICalledEventType
  @scala.inline
  def dir: dir = "dir".asInstanceOf[dir]
  
  @js.native
  sealed trait dirxml extends ConsoleAPICalledEventType
  @scala.inline
  def dirxml: dirxml = "dirxml".asInstanceOf[dirxml]
  
  @js.native
  sealed trait disabled extends AXPropertyName
  @scala.inline
  def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @js.native
  sealed trait discouragedAPIUse extends ViolationSettingName
  @scala.inline
  def discouragedAPIUse: discouragedAPIUse = "discouragedAPIUse".asInstanceOf[discouragedAPIUse]
  
  @js.native
  sealed trait discrete extends ChannelInterpretation
  @scala.inline
  def discrete: discrete = "discrete".asInstanceOf[discrete]
  
  @js.native
  sealed trait distributedNodesUpdated extends StObject
  @scala.inline
  def distributedNodesUpdated: distributedNodesUpdated = "distributedNodesUpdated".asInstanceOf[distributedNodesUpdated]
  
  @js.native
  sealed trait documentUpdated extends StObject
  @scala.inline
  def documentUpdated: documentUpdated = "documentUpdated".asInstanceOf[documentUpdated]
  
  @js.native
  sealed trait domContentEventFired extends StObject
  @scala.inline
  def domContentEventFired: domContentEventFired = "domContentEventFired".asInstanceOf[domContentEventFired]
  
  @js.native
  sealed trait domRelation extends AXValueType
  @scala.inline
  def domRelation: domRelation = "domRelation".asInstanceOf[domRelation]
  
  @js.native
  sealed trait domStorageItemAdded extends StObject
  @scala.inline
  def domStorageItemAdded: domStorageItemAdded = "domStorageItemAdded".asInstanceOf[domStorageItemAdded]
  
  @js.native
  sealed trait domStorageItemRemoved extends StObject
  @scala.inline
  def domStorageItemRemoved: domStorageItemRemoved = "domStorageItemRemoved".asInstanceOf[domStorageItemRemoved]
  
  @js.native
  sealed trait domStorageItemUpdated extends StObject
  @scala.inline
  def domStorageItemUpdated: domStorageItemUpdated = "domStorageItemUpdated".asInstanceOf[domStorageItemUpdated]
  
  @js.native
  sealed trait domStorageItemsCleared extends StObject
  @scala.inline
  def domStorageItemsCleared: domStorageItemsCleared = "domStorageItemsCleared".asInstanceOf[domStorageItemsCleared]
  
  @js.native
  sealed trait downloadProgress extends StObject
  @scala.inline
  def downloadProgress: downloadProgress = "downloadProgress".asInstanceOf[downloadProgress]
  
  @js.native
  sealed trait downloadWillBegin extends StObject
  @scala.inline
  def downloadWillBegin: downloadWillBegin = "downloadWillBegin".asInstanceOf[downloadWillBegin]
  
  @js.native
  sealed trait download_ extends ClientNavigationDisposition
  @scala.inline
  def download_ : download_ = "download".asInstanceOf[download_]
  
  @js.native
  sealed trait durableStorage extends PermissionType
  @scala.inline
  def durableStorage: durableStorage = "durableStorage".asInstanceOf[durableStorage]
  
  @js.native
  sealed trait echoToConsole extends TraceConfigRecordMode
  @scala.inline
  def echoToConsole: echoToConsole = "echoToConsole".asInstanceOf[echoToConsole]
  
  @js.native
  sealed trait editable extends AXPropertyName
  @scala.inline
  def editable: editable = "editable".asInstanceOf[editable]
  
  @js.native
  sealed trait endGroup extends ConsoleAPICalledEventType
  @scala.inline
  def endGroup: endGroup = "endGroup".asInstanceOf[endGroup]
  
  @js.native
  sealed trait entryAdded extends StObject
  @scala.inline
  def entryAdded: entryAdded = "entryAdded".asInstanceOf[entryAdded]
  
  @js.native
  sealed trait error
    extends CachedResponseType
       with ConsoleAPICalledEventType
       with ConsoleMessageLevel
       with LogEntryLevel
       with ObjectPreviewSubtype
       with PlayerMessageLevel
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait errormessage extends AXPropertyName
  @scala.inline
  def errormessage: errormessage = "errormessage".asInstanceOf[errormessage]
  
  @js.native
  sealed trait ethernet extends ConnectionType
  @scala.inline
  def ethernet: ethernet = "ethernet".asInstanceOf[ethernet]
  
  @js.native
  sealed trait eval extends ScopeType
  @scala.inline
  def eval: eval = "eval".asInstanceOf[eval]
  
  @js.native
  sealed trait eventSourceMessageReceived extends StObject
  @scala.inline
  def eventSourceMessageReceived: eventSourceMessageReceived = "eventSourceMessageReceived".asInstanceOf[eventSourceMessageReceived]
  
  @js.native
  sealed trait exception extends PausedEventReason
  @scala.inline
  def exception: exception = "exception".asInstanceOf[exception]
  
  @js.native
  sealed trait exceptionRevoked extends StObject
  @scala.inline
  def exceptionRevoked: exceptionRevoked = "exceptionRevoked".asInstanceOf[exceptionRevoked]
  
  @js.native
  sealed trait exceptionThrown extends StObject
  @scala.inline
  def exceptionThrown: exceptionThrown = "exceptionThrown".asInstanceOf[exceptionThrown]
  
  @js.native
  sealed trait executionContextCreated extends StObject
  @scala.inline
  def executionContextCreated: executionContextCreated = "executionContextCreated".asInstanceOf[executionContextCreated]
  
  @js.native
  sealed trait executionContextDestroyed extends StObject
  @scala.inline
  def executionContextDestroyed: executionContextDestroyed = "executionContextDestroyed".asInstanceOf[executionContextDestroyed]
  
  @js.native
  sealed trait executionContextsCleared extends StObject
  @scala.inline
  def executionContextsCleared: executionContextsCleared = "executionContextsCleared".asInstanceOf[executionContextsCleared]
  
  @js.native
  sealed trait expanded extends AXPropertyName
  @scala.inline
  def expanded: expanded = "expanded".asInstanceOf[expanded]
  
  @js.native
  sealed trait explicit extends ChannelCountMode
  @scala.inline
  def explicit: explicit = "explicit".asInstanceOf[explicit]
  
  @js.native
  sealed trait externref extends RemoteObjectSubtype
  @scala.inline
  def externref: externref = "externref".asInstanceOf[externref]
  
  @js.native
  sealed trait f32 extends RemoteObjectSubtype
  @scala.inline
  def f32: f32 = "f32".asInstanceOf[f32]
  
  @js.native
  sealed trait f64 extends RemoteObjectSubtype
  @scala.inline
  def f64: f64 = "f64".asInstanceOf[f64]
  
  @js.native
  sealed trait `fallback-code` extends ServiceWorkerResponseSource
  @scala.inline
  def `fallback-code`: `fallback-code` = "fallback-code".asInstanceOf[`fallback-code`]
  
  @js.native
  sealed trait figcaption extends AXValueNativeSourceType
  @scala.inline
  def figcaption: figcaption = "figcaption".asInstanceOf[figcaption]
  
  @js.native
  sealed trait fileChooserOpened extends StObject
  @scala.inline
  def fileChooserOpened: fileChooserOpened = "fileChooserOpened".asInstanceOf[fileChooserOpened]
  
  @js.native
  sealed trait file_systems extends StorageType
  @scala.inline
  def file_systems: file_systems = "file_systems".asInstanceOf[file_systems]
  
  @js.native
  sealed trait `first-letter` extends PseudoType
  @scala.inline
  def `first-letter`: `first-letter` = "first-letter".asInstanceOf[`first-letter`]
  
  @js.native
  sealed trait `first-line` extends PseudoType
  @scala.inline
  def `first-line`: `first-line` = "first-line".asInstanceOf[`first-line`]
  
  @js.native
  sealed trait `first-line-inherited` extends PseudoType
  @scala.inline
  def `first-line-inherited`: `first-line-inherited` = "first-line-inherited".asInstanceOf[`first-line-inherited`]
  
  @js.native
  sealed trait flash extends PermissionType
  @scala.inline
  def flash: flash = "flash".asInstanceOf[flash]
  
  @js.native
  sealed trait flowto extends AXPropertyName
  @scala.inline
  def flowto: flowto = "flowto".asInstanceOf[flowto]
  
  @js.native
  sealed trait focusable extends AXPropertyName
  @scala.inline
  def focusable: focusable = "focusable".asInstanceOf[focusable]
  
  @js.native
  sealed trait focused extends AXPropertyName
  @scala.inline
  def focused: focused = "focused".asInstanceOf[focused]
  
  @js.native
  sealed trait fontsUpdated extends StObject
  @scala.inline
  def fontsUpdated: fontsUpdated = "fontsUpdated".asInstanceOf[fontsUpdated]
  
  @js.native
  sealed trait formSubmissionGet extends ClientNavigationReason
  @scala.inline
  def formSubmissionGet: formSubmissionGet = "formSubmissionGet".asInstanceOf[formSubmissionGet]
  
  @js.native
  sealed trait formSubmissionPost extends ClientNavigationReason
  @scala.inline
  def formSubmissionPost: formSubmissionPost = "formSubmissionPost".asInstanceOf[formSubmissionPost]
  
  @js.native
  sealed trait form_submit extends TransitionType
  @scala.inline
  def form_submit: form_submit = "form_submit".asInstanceOf[form_submit]
  
  @js.native
  sealed trait forward extends MouseButton
  @scala.inline
  def forward: forward = "forward".asInstanceOf[forward]
  
  @js.native
  sealed trait frameAttached extends StObject
  @scala.inline
  def frameAttached: frameAttached = "frameAttached".asInstanceOf[frameAttached]
  
  @js.native
  sealed trait frameClearedScheduledNavigation extends StObject
  @scala.inline
  def frameClearedScheduledNavigation: frameClearedScheduledNavigation = "frameClearedScheduledNavigation".asInstanceOf[frameClearedScheduledNavigation]
  
  @js.native
  sealed trait frameDetached extends StObject
  @scala.inline
  def frameDetached: frameDetached = "frameDetached".asInstanceOf[frameDetached]
  
  @js.native
  sealed trait frameNavigated extends StObject
  @scala.inline
  def frameNavigated: frameNavigated = "frameNavigated".asInstanceOf[frameNavigated]
  
  @js.native
  sealed trait frameRequestedNavigation extends StObject
  @scala.inline
  def frameRequestedNavigation: frameRequestedNavigation = "frameRequestedNavigation".asInstanceOf[frameRequestedNavigation]
  
  @js.native
  sealed trait frameResized extends StObject
  @scala.inline
  def frameResized: frameResized = "frameResized".asInstanceOf[frameResized]
  
  @js.native
  sealed trait frameScheduledNavigation extends StObject
  @scala.inline
  def frameScheduledNavigation: frameScheduledNavigation = "frameScheduledNavigation".asInstanceOf[frameScheduledNavigation]
  
  @js.native
  sealed trait frameStartedLoading extends StObject
  @scala.inline
  def frameStartedLoading: frameStartedLoading = "frameStartedLoading".asInstanceOf[frameStartedLoading]
  
  @js.native
  sealed trait frameStoppedLoading extends StObject
  @scala.inline
  def frameStoppedLoading: frameStoppedLoading = "frameStoppedLoading".asInstanceOf[frameStoppedLoading]
  
  @js.native
  sealed trait frozen extends SetWebLifecycleStateRequestState
  @scala.inline
  def frozen: frozen = "frozen".asInstanceOf[frozen]
  
  @js.native
  sealed trait fullscreen extends WindowState
  @scala.inline
  def fullscreen: fullscreen = "fullscreen".asInstanceOf[fullscreen]
  
  @js.native
  sealed trait function
    extends ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
  @scala.inline
  def function: function = "function".asInstanceOf[function]
  
  @js.native
  sealed trait generated extends TransitionType
  @scala.inline
  def generated: generated = "generated".asInstanceOf[generated]
  
  @js.native
  sealed trait generator
    extends ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  @scala.inline
  def generator: generator = "generator".asInstanceOf[generator]
  
  @js.native
  sealed trait geolocation extends PermissionType
  @scala.inline
  def geolocation: geolocation = "geolocation".asInstanceOf[geolocation]
  
  @js.native
  sealed trait global extends ScopeType
  @scala.inline
  def global: global = "global".asInstanceOf[global]
  
  @js.native
  sealed trait granted extends PermissionSetting
  @scala.inline
  def granted: granted = "granted".asInstanceOf[granted]
  
  @js.native
  sealed trait gzip extends StreamCompression
  @scala.inline
  def gzip: gzip = "gzip".asInstanceOf[gzip]
  
  @js.native
  sealed trait handler extends ViolationSettingName
  @scala.inline
  def handler: handler = "handler".asInstanceOf[handler]
  
  @js.native
  sealed trait hasPopup extends AXPropertyName
  @scala.inline
  def hasPopup: hasPopup = "hasPopup".asInstanceOf[hasPopup]
  
  @js.native
  sealed trait heapStatsUpdate extends StObject
  @scala.inline
  def heapStatsUpdate: heapStatsUpdate = "heapStatsUpdate".asInstanceOf[heapStatsUpdate]
  
  @js.native
  sealed trait hex extends ColorFormat
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait hidden extends AXPropertyName
  @scala.inline
  def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait hiddenRoot extends AXPropertyName
  @scala.inline
  def hiddenRoot: hiddenRoot = "hiddenRoot".asInstanceOf[hiddenRoot]
  
  @js.native
  sealed trait horizontal extends DisplayFeatureOrientation
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait hsl extends ColorFormat
  @scala.inline
  def hsl: hsl = "hsl".asInstanceOf[hsl]
  
  @js.native
  sealed trait `http-cache` extends ServiceWorkerResponseSource
  @scala.inline
  def `http-cache`: `http-cache` = "http-cache".asInstanceOf[`http-cache`]
  
  @js.native
  sealed trait httpHeaderRefresh extends ClientNavigationReason
  @scala.inline
  def httpHeaderRefresh: httpHeaderRefresh = "httpHeaderRefresh".asInstanceOf[httpHeaderRefresh]
  
  @js.native
  sealed trait i32 extends RemoteObjectSubtype
  @scala.inline
  def i32: i32 = "i32".asInstanceOf[i32]
  
  @js.native
  sealed trait i64 extends RemoteObjectSubtype
  @scala.inline
  def i64: i64 = "i64".asInstanceOf[i64]
  
  @js.native
  sealed trait idleDetection extends PermissionType
  @scala.inline
  def idleDetection: idleDetection = "idleDetection".asInstanceOf[idleDetection]
  
  @js.native
  sealed trait idref extends AXValueType
  @scala.inline
  def idref: idref = "idref".asInstanceOf[idref]
  
  @js.native
  sealed trait idrefList extends AXValueType
  @scala.inline
  def idrefList: idrefList = "idrefList".asInstanceOf[idrefList]
  
  @js.native
  sealed trait `implicit` extends AXValueSourceType
  @scala.inline
  def `implicit`: `implicit` = "implicit".asInstanceOf[`implicit`]
  
  @js.native
  sealed trait importRule extends CSSMediaSource
  @scala.inline
  def importRule: importRule = "importRule".asInstanceOf[importRule]
  
  @js.native
  sealed trait inProgress extends DownloadProgressEventState
  @scala.inline
  def inProgress: inProgress = "inProgress".asInstanceOf[inProgress]
  
  @js.native
  sealed trait indexedDBContentUpdated extends StObject
  @scala.inline
  def indexedDBContentUpdated: indexedDBContentUpdated = "indexedDBContentUpdated".asInstanceOf[indexedDBContentUpdated]
  
  @js.native
  sealed trait indexedDBListUpdated extends StObject
  @scala.inline
  def indexedDBListUpdated: indexedDBListUpdated = "indexedDBListUpdated".asInstanceOf[indexedDBListUpdated]
  
  @js.native
  sealed trait indexeddb extends StorageType
  @scala.inline
  def indexeddb: indexeddb = "indexeddb".asInstanceOf[indexeddb]
  
  @js.native
  sealed trait info
    extends ConsoleAPICalledEventType
       with ConsoleMessageLevel
       with LogEntryLevel
       with PlayerMessageLevel
       with SecurityState
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait injected extends StyleSheetOrigin
  @scala.inline
  def injected: injected = "injected".asInstanceOf[injected]
  
  @js.native
  sealed trait inlineSheet extends CSSMediaSource
  @scala.inline
  def inlineSheet: inlineSheet = "inlineSheet".asInstanceOf[inlineSheet]
  
  @js.native
  sealed trait inlineStyleInvalidated extends StObject
  @scala.inline
  def inlineStyleInvalidated: inlineStyleInvalidated = "inlineStyleInvalidated".asInstanceOf[inlineStyleInvalidated]
  
  @js.native
  sealed trait `input-list-button` extends PseudoType
  @scala.inline
  def `input-list-button`: `input-list-button` = "input-list-button".asInstanceOf[`input-list-button`]
  
  @js.native
  sealed trait insecure extends SecurityState
  @scala.inline
  def insecure: insecure = "insecure".asInstanceOf[insecure]
  
  @js.native
  sealed trait `insecure-broken` extends SecurityState
  @scala.inline
  def `insecure-broken`: `insecure-broken` = "insecure-broken".asInstanceOf[`insecure-broken`]
  
  @js.native
  sealed trait inspectModeCanceled extends StObject
  @scala.inline
  def inspectModeCanceled: inspectModeCanceled = "inspectModeCanceled".asInstanceOf[inspectModeCanceled]
  
  @js.native
  sealed trait inspectNodeRequested extends StObject
  @scala.inline
  def inspectNodeRequested: inspectNodeRequested = "inspectNodeRequested".asInstanceOf[inspectNodeRequested]
  
  @js.native
  sealed trait inspectRequested extends StObject
  @scala.inline
  def inspectRequested: inspectRequested = "inspectRequested".asInstanceOf[inspectRequested]
  
  @js.native
  sealed trait inspector
    extends BlockedReason
       with StyleSheetOrigin
  @scala.inline
  def inspector: inspector = "inspector".asInstanceOf[inspector]
  
  @js.native
  sealed trait installed extends ServiceWorkerVersionStatus
  @scala.inline
  def installed: installed = "installed".asInstanceOf[installed]
  
  @js.native
  sealed trait installing extends ServiceWorkerVersionStatus
  @scala.inline
  def installing: installing = "installing".asInstanceOf[installing]
  
  @js.native
  sealed trait instrumentation extends PausedEventReason
  @scala.inline
  def instrumentation: instrumentation = "instrumentation".asInstanceOf[instrumentation]
  
  @js.native
  sealed trait integer extends AXValueType
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  
  @js.native
  sealed trait internal extends AuthenticatorTransport
  @scala.inline
  def internal: internal = "internal".asInstanceOf[internal]
  
  @js.native
  sealed trait internalRole extends AXValueType
  @scala.inline
  def internalRole: internalRole = "internalRole".asInstanceOf[internalRole]
  
  @js.native
  sealed trait interstitialHidden extends StObject
  @scala.inline
  def interstitialHidden: interstitialHidden = "interstitialHidden".asInstanceOf[interstitialHidden]
  
  @js.native
  sealed trait interstitialShown extends StObject
  @scala.inline
  def interstitialShown: interstitialShown = "interstitialShown".asInstanceOf[interstitialShown]
  
  @js.native
  sealed trait intervention extends LogEntrySource
  @scala.inline
  def intervention: intervention = "intervention".asInstanceOf[intervention]
  
  @js.native
  sealed trait invalid extends AXPropertyName
  @scala.inline
  def invalid: invalid = "invalid".asInstanceOf[invalid]
  
  @js.native
  sealed trait issueAdded extends StObject
  @scala.inline
  def issueAdded: issueAdded = "issueAdded".asInstanceOf[issueAdded]
  
  @js.native
  sealed trait issueUpdated extends StObject
  @scala.inline
  def issueUpdated: issueUpdated = "issueUpdated".asInstanceOf[issueUpdated]
  
  @js.native
  sealed trait iterator
    extends ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  @scala.inline
  def iterator: iterator = "iterator".asInstanceOf[iterator]
  
  @js.native
  sealed trait javascriptDialogClosed extends StObject
  @scala.inline
  def javascriptDialogClosed: javascriptDialogClosed = "javascriptDialogClosed".asInstanceOf[javascriptDialogClosed]
  
  @js.native
  sealed trait javascriptDialogOpening extends StObject
  @scala.inline
  def javascriptDialogOpening: javascriptDialogOpening = "javascriptDialogOpening".asInstanceOf[javascriptDialogOpening]
  
  @js.native
  sealed trait javascript_
    extends ConsoleMessageSource
       with LogEntrySource
  @scala.inline
  def javascript_ : javascript_ = "javascript".asInstanceOf[javascript_]
  
  @js.native
  sealed trait jpeg
    extends CaptureScreenshotRequestFormat
       with GetEncodedResponseRequestEncoding
       with ImageType
       with ScreenshotParamsFormat
       with StartScreencastRequestFormat
  @scala.inline
  def jpeg: jpeg = "jpeg".asInstanceOf[jpeg]
  
  @js.native
  sealed trait json extends StreamFormat
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait `k-rate` extends AutomationRate
  @scala.inline
  def `k-rate`: `k-rate` = "k-rate".asInstanceOf[`k-rate`]
  
  @js.native
  sealed trait kEvalViolation extends ContentSecurityPolicyViolationType
  @scala.inline
  def kEvalViolation: kEvalViolation = "kEvalViolation".asInstanceOf[kEvalViolation]
  
  @js.native
  sealed trait kInlineViolation extends ContentSecurityPolicyViolationType
  @scala.inline
  def kInlineViolation: kInlineViolation = "kInlineViolation".asInstanceOf[kInlineViolation]
  
  @js.native
  sealed trait kTrustedTypesPolicyViolation extends ContentSecurityPolicyViolationType
  @scala.inline
  def kTrustedTypesPolicyViolation: kTrustedTypesPolicyViolation = "kTrustedTypesPolicyViolation".asInstanceOf[kTrustedTypesPolicyViolation]
  
  @js.native
  sealed trait kTrustedTypesSinkViolation extends ContentSecurityPolicyViolationType
  @scala.inline
  def kTrustedTypesSinkViolation: kTrustedTypesSinkViolation = "kTrustedTypesSinkViolation".asInstanceOf[kTrustedTypesSinkViolation]
  
  @js.native
  sealed trait kURLViolation extends ContentSecurityPolicyViolationType
  @scala.inline
  def kURLViolation: kURLViolation = "kURLViolation".asInstanceOf[kURLViolation]
  
  @js.native
  sealed trait keyDown extends DispatchKeyEventRequestType
  @scala.inline
  def keyDown: keyDown = "keyDown".asInstanceOf[keyDown]
  
  @js.native
  sealed trait keyUp extends DispatchKeyEventRequestType
  @scala.inline
  def keyUp: keyUp = "keyUp".asInstanceOf[keyUp]
  
  @js.native
  sealed trait keyshortcuts extends AXPropertyName
  @scala.inline
  def keyshortcuts: keyshortcuts = "keyshortcuts".asInstanceOf[keyshortcuts]
  
  @js.native
  sealed trait keyword extends TransitionType
  @scala.inline
  def keyword: keyword = "keyword".asInstanceOf[keyword]
  
  @js.native
  sealed trait keyword_generated extends TransitionType
  @scala.inline
  def keyword_generated: keyword_generated = "keyword_generated".asInstanceOf[keyword_generated]
  
  @js.native
  sealed trait label extends AXValueNativeSourceType
  @scala.inline
  def label: label = "label".asInstanceOf[label]
  
  @js.native
  sealed trait labelfor extends AXValueNativeSourceType
  @scala.inline
  def labelfor: labelfor = "labelfor".asInstanceOf[labelfor]
  
  @js.native
  sealed trait labelledby extends AXPropertyName
  @scala.inline
  def labelledby: labelledby = "labelledby".asInstanceOf[labelledby]
  
  @js.native
  sealed trait labelwrapped extends AXValueNativeSourceType
  @scala.inline
  def labelwrapped: labelwrapped = "labelwrapped".asInstanceOf[labelwrapped]
  
  @js.native
  sealed trait landscapePrimary extends ScreenOrientationType
  @scala.inline
  def landscapePrimary: landscapePrimary = "landscapePrimary".asInstanceOf[landscapePrimary]
  
  @js.native
  sealed trait landscapeSecondary extends ScreenOrientationType
  @scala.inline
  def landscapeSecondary: landscapeSecondary = "landscapeSecondary".asInstanceOf[landscapeSecondary]
  
  @js.native
  sealed trait lastSeenObjectId extends StObject
  @scala.inline
  def lastSeenObjectId: lastSeenObjectId = "lastSeenObjectId".asInstanceOf[lastSeenObjectId]
  
  @js.native
  sealed trait layerPainted extends StObject
  @scala.inline
  def layerPainted: layerPainted = "layerPainted".asInstanceOf[layerPainted]
  
  @js.native
  sealed trait layerTreeDidChange extends StObject
  @scala.inline
  def layerTreeDidChange: layerTreeDidChange = "layerTreeDidChange".asInstanceOf[layerTreeDidChange]
  
  @js.native
  sealed trait left extends MouseButton
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait legend extends AXValueNativeSourceType
  @scala.inline
  def legend: legend = "legend".asInstanceOf[legend]
  
  @js.native
  sealed trait level extends AXPropertyName
  @scala.inline
  def level: level = "level".asInstanceOf[level]
  
  @js.native
  sealed trait lifecycleEvent extends StObject
  @scala.inline
  def lifecycleEvent: lifecycleEvent = "lifecycleEvent".asInstanceOf[lifecycleEvent]
  
  @js.native
  sealed trait link extends TransitionType
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait linkedSheet extends CSSMediaSource
  @scala.inline
  def linkedSheet: linkedSheet = "linkedSheet".asInstanceOf[linkedSheet]
  
  @js.native
  sealed trait live extends AXPropertyName
  @scala.inline
  def live: live = "live".asInstanceOf[live]
  
  @js.native
  sealed trait loadEventFired extends StObject
  @scala.inline
  def loadEventFired: loadEventFired = "loadEventFired".asInstanceOf[loadEventFired]
  
  @js.native
  sealed trait loadingFailed extends StObject
  @scala.inline
  def loadingFailed: loadingFailed = "loadingFailed".asInstanceOf[loadingFailed]
  
  @js.native
  sealed trait loadingFinished extends StObject
  @scala.inline
  def loadingFinished: loadingFinished = "loadingFinished".asInstanceOf[loadingFinished]
  
  @js.native
  sealed trait local extends ScopeType
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait local_storage extends StorageType
  @scala.inline
  def local_storage: local_storage = "local_storage".asInstanceOf[local_storage]
  
  @js.native
  sealed trait log
    extends ConsoleAPICalledEventType
       with ConsoleMessageLevel
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait longLayout extends ViolationSettingName
  @scala.inline
  def longLayout: longLayout = "longLayout".asInstanceOf[longLayout]
  
  @js.native
  sealed trait longTask extends ViolationSettingName
  @scala.inline
  def longTask: longTask = "longTask".asInstanceOf[longTask]
  
  @js.native
  sealed trait lookalike extends SafetyTipStatus
  @scala.inline
  def lookalike: lookalike = "lookalike".asInstanceOf[lookalike]
  
  @js.native
  sealed trait manual_subframe extends TransitionType
  @scala.inline
  def manual_subframe: manual_subframe = "manual_subframe".asInstanceOf[manual_subframe]
  
  @js.native
  sealed trait map
    extends ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  @scala.inline
  def map: map = "map".asInstanceOf[map]
  
  @js.native
  sealed trait marker extends PseudoType
  @scala.inline
  def marker: marker = "marker".asInstanceOf[marker]
  
  @js.native
  sealed trait max extends ChannelCountMode
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  
  @js.native
  sealed trait maximized extends WindowState
  @scala.inline
  def maximized: maximized = "maximized".asInstanceOf[maximized]
  
  @js.native
  sealed trait mediaQueryResultChanged extends StObject
  @scala.inline
  def mediaQueryResultChanged: mediaQueryResultChanged = "mediaQueryResultChanged".asInstanceOf[mediaQueryResultChanged]
  
  @js.native
  sealed trait mediaRule extends CSSMediaSource
  @scala.inline
  def mediaRule: mediaRule = "mediaRule".asInstanceOf[mediaRule]
  
  @js.native
  sealed trait media_error extends PlayerErrorType
  @scala.inline
  def media_error: media_error = "media_error".asInstanceOf[media_error]
  
  @js.native
  sealed trait messageAdded extends StObject
  @scala.inline
  def messageAdded: messageAdded = "messageAdded".asInstanceOf[messageAdded]
  
  @js.native
  sealed trait metaTagRefresh extends ClientNavigationReason
  @scala.inline
  def metaTagRefresh: metaTagRefresh = "metaTagRefresh".asInstanceOf[metaTagRefresh]
  
  @js.native
  sealed trait metrics extends StObject
  @scala.inline
  def metrics: metrics = "metrics".asInstanceOf[metrics]
  
  @js.native
  sealed trait mhtml extends StObject
  @scala.inline
  def mhtml: mhtml = "mhtml".asInstanceOf[mhtml]
  
  @js.native
  sealed trait middle extends MouseButton
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait midi extends PermissionType
  @scala.inline
  def midi: midi = "midi".asInstanceOf[midi]
  
  @js.native
  sealed trait midiSysex extends PermissionType
  @scala.inline
  def midiSysex: midiSysex = "midiSysex".asInstanceOf[midiSysex]
  
  @js.native
  sealed trait minimized extends WindowState
  @scala.inline
  def minimized: minimized = "minimized".asInstanceOf[minimized]
  
  @js.native
  sealed trait `mixed-content` extends BlockedReason
  @scala.inline
  def `mixed-content`: `mixed-content` = "mixed-content".asInstanceOf[`mixed-content`]
  
  @js.native
  sealed trait mobile
    extends SetEmitTouchEventsForMouseRequestConfiguration
       with SetTouchEmulationEnabledRequestConfiguration
  @scala.inline
  def mobile: mobile = "mobile".asInstanceOf[mobile]
  
  @js.native
  sealed trait modal extends AXPropertyName
  @scala.inline
  def modal: modal = "modal".asInstanceOf[modal]
  
  @js.native
  sealed trait moderate extends PressureLevel
  @scala.inline
  def moderate: moderate = "moderate".asInstanceOf[moderate]
  
  @js.native
  sealed trait module extends ScopeType
  @scala.inline
  def module: module = "module".asInstanceOf[module]
  
  @js.native
  sealed trait mouse
    extends DispatchMouseEventRequestPointerType
       with GestureSourceType
  @scala.inline
  def mouse: mouse = "mouse".asInstanceOf[mouse]
  
  @js.native
  sealed trait mouseMoved
    extends DispatchMouseEventRequestType
       with EmulateTouchFromMouseEventRequestType
  @scala.inline
  def mouseMoved: mouseMoved = "mouseMoved".asInstanceOf[mouseMoved]
  
  @js.native
  sealed trait mousePressed
    extends DispatchMouseEventRequestType
       with EmulateTouchFromMouseEventRequestType
  @scala.inline
  def mousePressed: mousePressed = "mousePressed".asInstanceOf[mousePressed]
  
  @js.native
  sealed trait mouseReleased
    extends DispatchMouseEventRequestType
       with EmulateTouchFromMouseEventRequestType
  @scala.inline
  def mouseReleased: mouseReleased = "mouseReleased".asInstanceOf[mouseReleased]
  
  @js.native
  sealed trait mouseWheel
    extends DispatchMouseEventRequestType
       with EmulateTouchFromMouseEventRequestType
  @scala.inline
  def mouseWheel: mouseWheel = "mouseWheel".asInstanceOf[mouseWheel]
  
  @js.native
  sealed trait multiline extends AXPropertyName
  @scala.inline
  def multiline: multiline = "multiline".asInstanceOf[multiline]
  
  @js.native
  sealed trait multiselectable extends AXPropertyName
  @scala.inline
  def multiselectable: multiselectable = "multiselectable".asInstanceOf[multiselectable]
  
  @js.native
  sealed trait navigatedWithinDocument extends StObject
  @scala.inline
  def navigatedWithinDocument: navigatedWithinDocument = "navigatedWithinDocument".asInstanceOf[navigatedWithinDocument]
  
  @js.native
  sealed trait needsBeginFramesChanged extends StObject
  @scala.inline
  def needsBeginFramesChanged: needsBeginFramesChanged = "needsBeginFramesChanged".asInstanceOf[needsBeginFramesChanged]
  
  @js.native
  sealed trait network
    extends ConsoleMessageSource
       with LogEntrySource
       with ServiceWorkerResponseSource
  @scala.inline
  def network: network = "network".asInstanceOf[network]
  
  @js.native
  sealed trait networkStateUpdated extends StObject
  @scala.inline
  def networkStateUpdated: networkStateUpdated = "networkStateUpdated".asInstanceOf[networkStateUpdated]
  
  @js.native
  sealed trait neutral extends SecurityState
  @scala.inline
  def neutral: neutral = "neutral".asInstanceOf[neutral]
  
  @js.native
  sealed trait `new` extends ServiceWorkerVersionStatus
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  
  @js.native
  sealed trait newTab extends ClientNavigationDisposition
  @scala.inline
  def newTab: newTab = "newTab".asInstanceOf[newTab]
  
  @js.native
  sealed trait newWindow extends ClientNavigationDisposition
  @scala.inline
  def newWindow: newWindow = "newWindow".asInstanceOf[newWindow]
  
  @js.native
  sealed trait nfc
    extends AuthenticatorTransport
       with PermissionType
  @scala.inline
  def nfc: nfc = "nfc".asInstanceOf[nfc]
  
  @js.native
  sealed trait `no-referrer` extends RequestReferrerPolicy
  @scala.inline
  def `no-referrer`: `no-referrer` = "no-referrer".asInstanceOf[`no-referrer`]
  
  @js.native
  sealed trait `no-referrer-when-downgrade` extends RequestReferrerPolicy
  @scala.inline
  def `no-referrer-when-downgrade`: `no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[`no-referrer-when-downgrade`]
  
  @js.native
  sealed trait noReferrer extends ReferrerPolicy
  @scala.inline
  def noReferrer: noReferrer = "noReferrer".asInstanceOf[noReferrer]
  
  @js.native
  sealed trait noReferrerWhenDowngrade extends ReferrerPolicy
  @scala.inline
  def noReferrerWhenDowngrade: noReferrerWhenDowngrade = "noReferrerWhenDowngrade".asInstanceOf[noReferrerWhenDowngrade]
  
  @js.native
  sealed trait node
    extends AXValueType
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  @scala.inline
  def node: node = "node".asInstanceOf[node]
  
  @js.native
  sealed trait `node-removed` extends DOMBreakpointType
  @scala.inline
  def `node-removed`: `node-removed` = "node-removed".asInstanceOf[`node-removed`]
  
  @js.native
  sealed trait nodeHighlightRequested extends StObject
  @scala.inline
  def nodeHighlightRequested: nodeHighlightRequested = "nodeHighlightRequested".asInstanceOf[nodeHighlightRequested]
  
  @js.native
  sealed trait nodeList extends AXValueType
  @scala.inline
  def nodeList: nodeList = "nodeList".asInstanceOf[nodeList]
  
  @js.native
  sealed trait nodeParamConnected extends StObject
  @scala.inline
  def nodeParamConnected: nodeParamConnected = "nodeParamConnected".asInstanceOf[nodeParamConnected]
  
  @js.native
  sealed trait nodeParamDisconnected extends StObject
  @scala.inline
  def nodeParamDisconnected: nodeParamDisconnected = "nodeParamDisconnected".asInstanceOf[nodeParamDisconnected]
  
  @js.native
  sealed trait nodesConnected extends StObject
  @scala.inline
  def nodesConnected: nodesConnected = "nodesConnected".asInstanceOf[nodesConnected]
  
  @js.native
  sealed trait nodesDisconnected extends StObject
  @scala.inline
  def nodesDisconnected: nodesDisconnected = "nodesDisconnected".asInstanceOf[nodesDisconnected]
  
  @js.native
  sealed trait none_
    extends AdFrameType
       with ConnectionType
       with InspectMode
       with MixedContentType
       with MouseButton
       with SetEmulatedVisionDeficiencyRequestType
       with SetPauseOnExceptionsRequestState
       with StreamCompression
  @scala.inline
  def none_ : none_ = "none".asInstanceOf[none_]
  
  @js.native
  sealed trait normal extends WindowState
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait `not-compliant` extends CertificateTransparencyCompliance
  @scala.inline
  def `not-compliant`: `not-compliant` = "not-compliant".asInstanceOf[`not-compliant`]
  
  @js.native
  sealed trait notifications
    extends PermissionType
       with ServiceName
  @scala.inline
  def notifications: notifications = "notifications".asInstanceOf[notifications]
  
  @js.native
  sealed trait `null`
    extends KeyPathType
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  @scala.inline
  def `null`: `null` = "null".asInstanceOf[`null`]
  
  @js.native
  sealed trait number
    extends AXValueType
       with KeyType
       with ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait `object`
    extends ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait offline extends ContextType
  @scala.inline
  def offline: offline = "offline".asInstanceOf[offline]
  
  @js.native
  sealed trait opaqueRedirect extends CachedResponseType
  @scala.inline
  def opaqueRedirect: opaqueRedirect = "opaqueRedirect".asInstanceOf[opaqueRedirect]
  
  @js.native
  sealed trait opaqueResponse extends CachedResponseType
  @scala.inline
  def opaqueResponse: opaqueResponse = "opaqueResponse".asInstanceOf[opaqueResponse]
  
  @js.native
  sealed trait open extends ShadowRootType
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait `optionally-blockable` extends MixedContentType
  @scala.inline
  def `optionally-blockable`: `optionally-blockable` = "optionally-blockable".asInstanceOf[`optionally-blockable`]
  
  @js.native
  sealed trait orientation extends AXPropertyName
  @scala.inline
  def orientation: orientation = "orientation".asInstanceOf[orientation]
  
  @js.native
  sealed trait origin
    extends BlockedReason
       with ReferrerPolicy
       with RequestReferrerPolicy
  @scala.inline
  def origin: origin = "origin".asInstanceOf[origin]
  
  @js.native
  sealed trait `origin-when-cross-origin` extends RequestReferrerPolicy
  @scala.inline
  def `origin-when-cross-origin`: `origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[`origin-when-cross-origin`]
  
  @js.native
  sealed trait originWhenCrossOrigin extends ReferrerPolicy
  @scala.inline
  def originWhenCrossOrigin: originWhenCrossOrigin = "originWhenCrossOrigin".asInstanceOf[originWhenCrossOrigin]
  
  @js.native
  sealed trait other_
    extends AXValueNativeSourceType
       with BlockedReason
       with ConnectionType
       with ConsoleMessageSource
       with InitiatorType
       with LogEntrySource
       with PausedEventReason
       with StorageType
       with TransitionType
  @scala.inline
  def other_ : other_ = "other".asInstanceOf[other_]
  
  @js.native
  sealed trait owns extends AXPropertyName
  @scala.inline
  def owns: owns = "owns".asInstanceOf[owns]
  
  @js.native
  sealed trait pageBlockInterstitial extends ClientNavigationReason
  @scala.inline
  def pageBlockInterstitial: pageBlockInterstitial = "pageBlockInterstitial".asInstanceOf[pageBlockInterstitial]
  
  @js.native
  sealed trait parser extends InitiatorType
  @scala.inline
  def parser: parser = "parser".asInstanceOf[parser]
  
  @js.native
  sealed trait pause extends VirtualTimePolicy
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait pauseIfNetworkFetchesPending extends VirtualTimePolicy
  @scala.inline
  def pauseIfNetworkFetchesPending: pauseIfNetworkFetchesPending = "pauseIfNetworkFetchesPending".asInstanceOf[pauseIfNetworkFetchesPending]
  
  @js.native
  sealed trait paused extends StObject
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait paymentHandler
    extends PermissionType
       with ServiceName
  @scala.inline
  def paymentHandler: paymentHandler = "paymentHandler".asInstanceOf[paymentHandler]
  
  @js.native
  sealed trait pen extends DispatchMouseEventRequestPointerType
  @scala.inline
  def pen: pen = "pen".asInstanceOf[pen]
  
  @js.native
  sealed trait periodicBackgroundSync
    extends PermissionType
       with ServiceName
  @scala.inline
  def periodicBackgroundSync: periodicBackgroundSync = "periodicBackgroundSync".asInstanceOf[periodicBackgroundSync]
  
  @js.native
  sealed trait pipeline_error extends PlayerErrorType
  @scala.inline
  def pipeline_error: pipeline_error = "pipeline_error".asInstanceOf[pipeline_error]
  
  @js.native
  sealed trait placeholder extends AXValueSourceType
  @scala.inline
  def placeholder: placeholder = "placeholder".asInstanceOf[placeholder]
  
  @js.native
  sealed trait playerErrorsRaised extends StObject
  @scala.inline
  def playerErrorsRaised: playerErrorsRaised = "playerErrorsRaised".asInstanceOf[playerErrorsRaised]
  
  @js.native
  sealed trait playerEventsAdded extends StObject
  @scala.inline
  def playerEventsAdded: playerEventsAdded = "playerEventsAdded".asInstanceOf[playerEventsAdded]
  
  @js.native
  sealed trait playerMessagesLogged extends StObject
  @scala.inline
  def playerMessagesLogged: playerMessagesLogged = "playerMessagesLogged".asInstanceOf[playerMessagesLogged]
  
  @js.native
  sealed trait playerPropertiesChanged extends StObject
  @scala.inline
  def playerPropertiesChanged: playerPropertiesChanged = "playerPropertiesChanged".asInstanceOf[playerPropertiesChanged]
  
  @js.native
  sealed trait playersCreated extends StObject
  @scala.inline
  def playersCreated: playersCreated = "playersCreated".asInstanceOf[playersCreated]
  
  @js.native
  sealed trait png
    extends CaptureScreenshotRequestFormat
       with GetEncodedResponseRequestEncoding
       with ScreenshotParamsFormat
       with StartScreencastRequestFormat
  @scala.inline
  def png: png = "png".asInstanceOf[png]
  
  @js.native
  sealed trait portraitPrimary extends ScreenOrientationType
  @scala.inline
  def portraitPrimary: portraitPrimary = "portraitPrimary".asInstanceOf[portraitPrimary]
  
  @js.native
  sealed trait portraitSecondary extends ScreenOrientationType
  @scala.inline
  def portraitSecondary: portraitSecondary = "portraitSecondary".asInstanceOf[portraitSecondary]
  
  @js.native
  sealed trait preciseCoverageDeltaUpdate extends StObject
  @scala.inline
  def preciseCoverageDeltaUpdate: preciseCoverageDeltaUpdate = "preciseCoverageDeltaUpdate".asInstanceOf[preciseCoverageDeltaUpdate]
  
  @js.native
  sealed trait preload extends InitiatorType
  @scala.inline
  def preload: preload = "preload".asInstanceOf[preload]
  
  @js.native
  sealed trait pressed extends AXPropertyName
  @scala.inline
  def pressed: pressed = "pressed".asInstanceOf[pressed]
  
  @js.native
  sealed trait profile extends ConsoleAPICalledEventType
  @scala.inline
  def profile: profile = "profile".asInstanceOf[profile]
  
  @js.native
  sealed trait profileEnd extends ConsoleAPICalledEventType
  @scala.inline
  def profileEnd: profileEnd = "profileEnd".asInstanceOf[profileEnd]
  
  @js.native
  sealed trait promise extends RemoteObjectSubtype
  @scala.inline
  def promise: promise = "promise".asInstanceOf[promise]
  
  @js.native
  sealed trait promiseRejection extends PausedEventReason
  @scala.inline
  def promiseRejection: promiseRejection = "promiseRejection".asInstanceOf[promiseRejection]
  
  @js.native
  sealed trait prompt
    extends DialogType
       with PermissionSetting
  @scala.inline
  def prompt: prompt = "prompt".asInstanceOf[prompt]
  
  @js.native
  sealed trait protanopia extends SetEmulatedVisionDeficiencyRequestType
  @scala.inline
  def protanopia: protanopia = "protanopia".asInstanceOf[protanopia]
  
  @js.native
  sealed trait protectedMediaIdentifier extends PermissionType
  @scala.inline
  def protectedMediaIdentifier: protectedMediaIdentifier = "protectedMediaIdentifier".asInstanceOf[protectedMediaIdentifier]
  
  @js.native
  sealed trait proto extends StreamFormat
  @scala.inline
  def proto: proto = "proto".asInstanceOf[proto]
  
  @js.native
  sealed trait proxy_ extends RemoteObjectSubtype
  @scala.inline
  def proxy_ : proxy_ = "proxy".asInstanceOf[proxy_]
  
  @js.native
  sealed trait pseudoElementAdded extends StObject
  @scala.inline
  def pseudoElementAdded: pseudoElementAdded = "pseudoElementAdded".asInstanceOf[pseudoElementAdded]
  
  @js.native
  sealed trait pseudoElementRemoved extends StObject
  @scala.inline
  def pseudoElementRemoved: pseudoElementRemoved = "pseudoElementRemoved".asInstanceOf[pseudoElementRemoved]
  
  @js.native
  sealed trait pushMessaging extends ServiceName
  @scala.inline
  def pushMessaging: pushMessaging = "pushMessaging".asInstanceOf[pushMessaging]
  
  @js.native
  sealed trait rawKeyDown extends DispatchKeyEventRequestType
  @scala.inline
  def rawKeyDown: rawKeyDown = "rawKeyDown".asInstanceOf[rawKeyDown]
  
  @js.native
  sealed trait readonly extends AXPropertyName
  @scala.inline
  def readonly: readonly = "readonly".asInstanceOf[readonly]
  
  @js.native
  sealed trait realtime extends ContextType
  @scala.inline
  def realtime: realtime = "realtime".asInstanceOf[realtime]
  
  @js.native
  sealed trait receivedMessageFromTarget extends StObject
  @scala.inline
  def receivedMessageFromTarget: receivedMessageFromTarget = "receivedMessageFromTarget".asInstanceOf[receivedMessageFromTarget]
  
  @js.native
  sealed trait recommendation extends LogEntrySource
  @scala.inline
  def recommendation: recommendation = "recommendation".asInstanceOf[recommendation]
  
  @js.native
  sealed trait recordAsMuchAsPossible extends TraceConfigRecordMode
  @scala.inline
  def recordAsMuchAsPossible: recordAsMuchAsPossible = "recordAsMuchAsPossible".asInstanceOf[recordAsMuchAsPossible]
  
  @js.native
  sealed trait recordContinuously extends TraceConfigRecordMode
  @scala.inline
  def recordContinuously: recordContinuously = "recordContinuously".asInstanceOf[recordContinuously]
  
  @js.native
  sealed trait recordUntilFull extends TraceConfigRecordMode
  @scala.inline
  def recordUntilFull: recordUntilFull = "recordUntilFull".asInstanceOf[recordUntilFull]
  
  @js.native
  sealed trait recordingStateChanged extends StObject
  @scala.inline
  def recordingStateChanged: recordingStateChanged = "recordingStateChanged".asInstanceOf[recordingStateChanged]
  
  @js.native
  sealed trait recurringHandler extends ViolationSettingName
  @scala.inline
  def recurringHandler: recurringHandler = "recurringHandler".asInstanceOf[recurringHandler]
  
  @js.native
  sealed trait redundant extends ServiceWorkerVersionStatus
  @scala.inline
  def redundant: redundant = "redundant".asInstanceOf[redundant]
  
  @js.native
  sealed trait regexp
    extends ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  @scala.inline
  def regexp: regexp = "regexp".asInstanceOf[regexp]
  
  @js.native
  sealed trait regular extends StyleSheetOrigin
  @scala.inline
  def regular: regular = "regular".asInstanceOf[regular]
  
  @js.native
  sealed trait relatedElement extends AXValueSourceType
  @scala.inline
  def relatedElement: relatedElement = "relatedElement".asInstanceOf[relatedElement]
  
  @js.native
  sealed trait relevant extends AXPropertyName
  @scala.inline
  def relevant: relevant = "relevant".asInstanceOf[relevant]
  
  @js.native
  sealed trait reload
    extends ClientNavigationReason
       with TransitionType
  @scala.inline
  def reload: reload = "reload".asInstanceOf[reload]
  
  @js.native
  sealed trait rendering
    extends ConsoleMessageSource
       with LogEntrySource
  @scala.inline
  def rendering: rendering = "rendering".asInstanceOf[rendering]
  
  @js.native
  sealed trait reportHeapSnapshotProgress extends StObject
  @scala.inline
  def reportHeapSnapshotProgress: reportHeapSnapshotProgress = "reportHeapSnapshotProgress".asInstanceOf[reportHeapSnapshotProgress]
  
  @js.native
  sealed trait requestIntercepted extends StObject
  @scala.inline
  def requestIntercepted: requestIntercepted = "requestIntercepted".asInstanceOf[requestIntercepted]
  
  @js.native
  sealed trait requestPaused extends StObject
  @scala.inline
  def requestPaused: requestPaused = "requestPaused".asInstanceOf[requestPaused]
  
  @js.native
  sealed trait requestServedFromCache extends StObject
  @scala.inline
  def requestServedFromCache: requestServedFromCache = "requestServedFromCache".asInstanceOf[requestServedFromCache]
  
  @js.native
  sealed trait requestWillBeSent extends StObject
  @scala.inline
  def requestWillBeSent: requestWillBeSent = "requestWillBeSent".asInstanceOf[requestWillBeSent]
  
  @js.native
  sealed trait requestWillBeSentExtraInfo extends StObject
  @scala.inline
  def requestWillBeSentExtraInfo: requestWillBeSentExtraInfo = "requestWillBeSentExtraInfo".asInstanceOf[requestWillBeSentExtraInfo]
  
  @js.native
  sealed trait required extends AXPropertyName
  @scala.inline
  def required: required = "required".asInstanceOf[required]
  
  @js.native
  sealed trait resetProfiles extends StObject
  @scala.inline
  def resetProfiles: resetProfiles = "resetProfiles".asInstanceOf[resetProfiles]
  
  @js.native
  sealed trait resizer extends PseudoType
  @scala.inline
  def resizer: resizer = "resizer".asInstanceOf[resizer]
  
  @js.native
  sealed trait resourceChangedPriority extends StObject
  @scala.inline
  def resourceChangedPriority: resourceChangedPriority = "resourceChangedPriority".asInstanceOf[resourceChangedPriority]
  
  @js.native
  sealed trait responseReceived extends StObject
  @scala.inline
  def responseReceived: responseReceived = "responseReceived".asInstanceOf[responseReceived]
  
  @js.native
  sealed trait responseReceivedExtraInfo extends StObject
  @scala.inline
  def responseReceivedExtraInfo: responseReceivedExtraInfo = "responseReceivedExtraInfo".asInstanceOf[responseReceivedExtraInfo]
  
  @js.native
  sealed trait resumed extends StObject
  @scala.inline
  def resumed: resumed = "resumed".asInstanceOf[resumed]
  
  @js.native
  sealed trait `return` extends BreakLocationType
  @scala.inline
  def `return`: `return` = "return".asInstanceOf[`return`]
  
  @js.native
  sealed trait rgb extends ColorFormat
  @scala.inline
  def rgb: rgb = "rgb".asInstanceOf[rgb]
  
  @js.native
  sealed trait right extends MouseButton
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait role extends AXValueType
  @scala.inline
  def role: role = "role".asInstanceOf[role]
  
  @js.native
  sealed trait roledescription extends AXPropertyName
  @scala.inline
  def roledescription: roledescription = "roledescription".asInstanceOf[roledescription]
  
  @js.native
  sealed trait root
    extends AXPropertyName
       with AdFrameType
  @scala.inline
  def root: root = "root".asInstanceOf[root]
  
  @js.native
  sealed trait running
    extends ContextState
       with ServiceWorkerVersionRunningStatus
  @scala.inline
  def running: running = "running".asInstanceOf[running]
  
  @js.native
  sealed trait `same-origin` extends RequestReferrerPolicy
  @scala.inline
  def `same-origin`: `same-origin` = "same-origin".asInstanceOf[`same-origin`]
  
  @js.native
  sealed trait sameOrigin_ extends ReferrerPolicy
  @scala.inline
  def sameOrigin_ : sameOrigin_ = "sameOrigin".asInstanceOf[sameOrigin_]
  
  @js.native
  sealed trait screencastFrame extends StObject
  @scala.inline
  def screencastFrame: screencastFrame = "screencastFrame".asInstanceOf[screencastFrame]
  
  @js.native
  sealed trait screencastVisibilityChanged extends StObject
  @scala.inline
  def screencastVisibilityChanged: screencastVisibilityChanged = "screencastVisibilityChanged".asInstanceOf[screencastVisibilityChanged]
  
  @js.native
  sealed trait screenshotRequested extends StObject
  @scala.inline
  def screenshotRequested: screenshotRequested = "screenshotRequested".asInstanceOf[screenshotRequested]
  
  @js.native
  sealed trait scriptFailedToParse extends StObject
  @scala.inline
  def scriptFailedToParse: scriptFailedToParse = "scriptFailedToParse".asInstanceOf[scriptFailedToParse]
  
  @js.native
  sealed trait scriptInitiated extends ClientNavigationReason
  @scala.inline
  def scriptInitiated: scriptInitiated = "scriptInitiated".asInstanceOf[scriptInitiated]
  
  @js.native
  sealed trait scriptParsed extends StObject
  @scala.inline
  def scriptParsed: scriptParsed = "scriptParsed".asInstanceOf[scriptParsed]
  
  @js.native
  sealed trait script_
    extends InitiatorType
       with ScopeType
  @scala.inline
  def script_ : script_ = "script".asInstanceOf[script_]
  
  @js.native
  sealed trait scrollbar extends PseudoType
  @scala.inline
  def scrollbar: scrollbar = "scrollbar".asInstanceOf[scrollbar]
  
  @js.native
  sealed trait `scrollbar-button` extends PseudoType
  @scala.inline
  def `scrollbar-button`: `scrollbar-button` = "scrollbar-button".asInstanceOf[`scrollbar-button`]
  
  @js.native
  sealed trait `scrollbar-corner` extends PseudoType
  @scala.inline
  def `scrollbar-corner`: `scrollbar-corner` = "scrollbar-corner".asInstanceOf[`scrollbar-corner`]
  
  @js.native
  sealed trait `scrollbar-thumb` extends PseudoType
  @scala.inline
  def `scrollbar-thumb`: `scrollbar-thumb` = "scrollbar-thumb".asInstanceOf[`scrollbar-thumb`]
  
  @js.native
  sealed trait `scrollbar-track` extends PseudoType
  @scala.inline
  def `scrollbar-track`: `scrollbar-track` = "scrollbar-track".asInstanceOf[`scrollbar-track`]
  
  @js.native
  sealed trait `scrollbar-track-piece` extends PseudoType
  @scala.inline
  def `scrollbar-track-piece`: `scrollbar-track-piece` = "scrollbar-track-piece".asInstanceOf[`scrollbar-track-piece`]
  
  @js.native
  sealed trait searchForNode extends InspectMode
  @scala.inline
  def searchForNode: searchForNode = "searchForNode".asInstanceOf[searchForNode]
  
  @js.native
  sealed trait searchForUAShadowDOM extends InspectMode
  @scala.inline
  def searchForUAShadowDOM: searchForUAShadowDOM = "searchForUAShadowDOM".asInstanceOf[searchForUAShadowDOM]
  
  @js.native
  sealed trait secure_ extends SecurityState
  @scala.inline
  def secure_ : secure_ = "secure".asInstanceOf[secure_]
  
  @js.native
  sealed trait security
    extends ConsoleMessageSource
       with LogEntrySource
  @scala.inline
  def security: security = "security".asInstanceOf[security]
  
  @js.native
  sealed trait securityStateChanged extends StObject
  @scala.inline
  def securityStateChanged: securityStateChanged = "securityStateChanged".asInstanceOf[securityStateChanged]
  
  @js.native
  sealed trait selectMultiple extends FileChooserOpenedEventMode
  @scala.inline
  def selectMultiple: selectMultiple = "selectMultiple".asInstanceOf[selectMultiple]
  
  @js.native
  sealed trait selectSingle extends FileChooserOpenedEventMode
  @scala.inline
  def selectSingle: selectSingle = "selectSingle".asInstanceOf[selectSingle]
  
  @js.native
  sealed trait selected extends AXPropertyName
  @scala.inline
  def selected: selected = "selected".asInstanceOf[selected]
  
  @js.native
  sealed trait selection extends PseudoType
  @scala.inline
  def selection: selection = "selection".asInstanceOf[selection]
  
  @js.native
  sealed trait sensors extends PermissionType
  @scala.inline
  def sensors: sensors = "sensors".asInstanceOf[sensors]
  
  @js.native
  sealed trait service_workers extends StorageType
  @scala.inline
  def service_workers: service_workers = "service_workers".asInstanceOf[service_workers]
  
  @js.native
  sealed trait set
    extends ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  @scala.inline
  def set: set = "set".asInstanceOf[set]
  
  @js.native
  sealed trait setChildNodes extends StObject
  @scala.inline
  def setChildNodes: setChildNodes = "setChildNodes".asInstanceOf[setChildNodes]
  
  @js.native
  sealed trait settable extends AXPropertyName
  @scala.inline
  def settable: settable = "settable".asInstanceOf[settable]
  
  @js.native
  sealed trait shader_cache extends StorageType
  @scala.inline
  def shader_cache: shader_cache = "shader_cache".asInstanceOf[shader_cache]
  
  @js.native
  sealed trait shadowRootPopped extends StObject
  @scala.inline
  def shadowRootPopped: shadowRootPopped = "shadowRootPopped".asInstanceOf[shadowRootPopped]
  
  @js.native
  sealed trait shadowRootPushed extends StObject
  @scala.inline
  def shadowRootPushed: shadowRootPushed = "shadowRootPushed".asInstanceOf[shadowRootPushed]
  
  @js.native
  sealed trait showDistances extends InspectMode
  @scala.inline
  def showDistances: showDistances = "showDistances".asInstanceOf[showDistances]
  
  @js.native
  sealed trait signatureCertSha256 extends SignedExchangeErrorField
  @scala.inline
  def signatureCertSha256: signatureCertSha256 = "signatureCertSha256".asInstanceOf[signatureCertSha256]
  
  @js.native
  sealed trait signatureCertUrl extends SignedExchangeErrorField
  @scala.inline
  def signatureCertUrl: signatureCertUrl = "signatureCertUrl".asInstanceOf[signatureCertUrl]
  
  @js.native
  sealed trait signatureIntegrity extends SignedExchangeErrorField
  @scala.inline
  def signatureIntegrity: signatureIntegrity = "signatureIntegrity".asInstanceOf[signatureIntegrity]
  
  @js.native
  sealed trait signatureSig extends SignedExchangeErrorField
  @scala.inline
  def signatureSig: signatureSig = "signatureSig".asInstanceOf[signatureSig]
  
  @js.native
  sealed trait signatureTimestamps extends SignedExchangeErrorField
  @scala.inline
  def signatureTimestamps: signatureTimestamps = "signatureTimestamps".asInstanceOf[signatureTimestamps]
  
  @js.native
  sealed trait signatureValidityUrl extends SignedExchangeErrorField
  @scala.inline
  def signatureValidityUrl: signatureValidityUrl = "signatureValidityUrl".asInstanceOf[signatureValidityUrl]
  
  @js.native
  sealed trait signedExchangeReceived extends StObject
  @scala.inline
  def signedExchangeReceived: signedExchangeReceived = "signedExchangeReceived".asInstanceOf[signedExchangeReceived]
  
  @js.native
  sealed trait sinksUpdated extends StObject
  @scala.inline
  def sinksUpdated: sinksUpdated = "sinksUpdated".asInstanceOf[sinksUpdated]
  
  @js.native
  sealed trait speakers extends ChannelInterpretation
  @scala.inline
  def speakers: speakers = "speakers".asInstanceOf[speakers]
  
  @js.native
  sealed trait startGroup extends ConsoleAPICalledEventType
  @scala.inline
  def startGroup: startGroup = "startGroup".asInstanceOf[startGroup]
  
  @js.native
  sealed trait startGroupCollapsed extends ConsoleAPICalledEventType
  @scala.inline
  def startGroupCollapsed: startGroupCollapsed = "startGroupCollapsed".asInstanceOf[startGroupCollapsed]
  
  @js.native
  sealed trait starting extends ServiceWorkerVersionRunningStatus
  @scala.inline
  def starting: starting = "starting".asInstanceOf[starting]
  
  @js.native
  sealed trait stopped extends ServiceWorkerVersionRunningStatus
  @scala.inline
  def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @js.native
  sealed trait stopping extends ServiceWorkerVersionRunningStatus
  @scala.inline
  def stopping: stopping = "stopping".asInstanceOf[stopping]
  
  @js.native
  sealed trait storage
    extends ConsoleMessageSource
       with LogEntrySource
  @scala.inline
  def storage: storage = "storage".asInstanceOf[storage]
  
  @js.native
  sealed trait `strict-origin` extends RequestReferrerPolicy
  @scala.inline
  def `strict-origin`: `strict-origin` = "strict-origin".asInstanceOf[`strict-origin`]
  
  @js.native
  sealed trait `strict-origin-when-cross-origin` extends RequestReferrerPolicy
  @scala.inline
  def `strict-origin-when-cross-origin`: `strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[`strict-origin-when-cross-origin`]
  
  @js.native
  sealed trait strictOrigin extends ReferrerPolicy
  @scala.inline
  def strictOrigin: strictOrigin = "strictOrigin".asInstanceOf[strictOrigin]
  
  @js.native
  sealed trait strictOriginWhenCrossOrigin extends ReferrerPolicy
  @scala.inline
  def strictOriginWhenCrossOrigin: strictOriginWhenCrossOrigin = "strictOriginWhenCrossOrigin".asInstanceOf[strictOriginWhenCrossOrigin]
  
  @js.native
  sealed trait string
    extends AXValueType
       with KeyPathType
       with KeyType
       with ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait style extends AXValueSourceType
  @scala.inline
  def style: style = "style".asInstanceOf[style]
  
  @js.native
  sealed trait styleSheetAdded extends StObject
  @scala.inline
  def styleSheetAdded: styleSheetAdded = "styleSheetAdded".asInstanceOf[styleSheetAdded]
  
  @js.native
  sealed trait styleSheetChanged extends StObject
  @scala.inline
  def styleSheetChanged: styleSheetChanged = "styleSheetChanged".asInstanceOf[styleSheetChanged]
  
  @js.native
  sealed trait styleSheetRemoved extends StObject
  @scala.inline
  def styleSheetRemoved: styleSheetRemoved = "styleSheetRemoved".asInstanceOf[styleSheetRemoved]
  
  @js.native
  sealed trait `subresource-filter` extends BlockedReason
  @scala.inline
  def `subresource-filter`: `subresource-filter` = "subresource-filter".asInstanceOf[`subresource-filter`]
  
  @js.native
  sealed trait `subtree-modified` extends DOMBreakpointType
  @scala.inline
  def `subtree-modified`: `subtree-modified` = "subtree-modified".asInstanceOf[`subtree-modified`]
  
  @js.native
  sealed trait suspended extends ContextState
  @scala.inline
  def suspended: suspended = "suspended".asInstanceOf[suspended]
  
  @js.native
  sealed trait symbol
    extends ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
  @scala.inline
  def symbol: symbol = "symbol".asInstanceOf[symbol]
  
  @js.native
  sealed trait table extends ConsoleAPICalledEventType
  @scala.inline
  def table: table = "table".asInstanceOf[table]
  
  @js.native
  sealed trait tablecaption extends AXValueNativeSourceType
  @scala.inline
  def tablecaption: tablecaption = "tablecaption".asInstanceOf[tablecaption]
  
  @js.native
  sealed trait targetCrashed extends StObject
  @scala.inline
  def targetCrashed: targetCrashed = "targetCrashed".asInstanceOf[targetCrashed]
  
  @js.native
  sealed trait targetCreated extends StObject
  @scala.inline
  def targetCreated: targetCreated = "targetCreated".asInstanceOf[targetCreated]
  
  @js.native
  sealed trait targetDestroyed extends StObject
  @scala.inline
  def targetDestroyed: targetDestroyed = "targetDestroyed".asInstanceOf[targetDestroyed]
  
  @js.native
  sealed trait targetInfoChanged extends StObject
  @scala.inline
  def targetInfoChanged: targetInfoChanged = "targetInfoChanged".asInstanceOf[targetInfoChanged]
  
  @js.native
  sealed trait targetReloadedAfterCrash extends StObject
  @scala.inline
  def targetReloadedAfterCrash: targetReloadedAfterCrash = "targetReloadedAfterCrash".asInstanceOf[targetReloadedAfterCrash]
  
  @js.native
  sealed trait threadTicks
    extends EnableRequestTimeDomain
       with SetTimeDomainRequestTimeDomain
  @scala.inline
  def threadTicks: threadTicks = "threadTicks".asInstanceOf[threadTicks]
  
  @js.native
  sealed trait timeEnd extends ConsoleAPICalledEventType
  @scala.inline
  def timeEnd: timeEnd = "timeEnd".asInstanceOf[timeEnd]
  
  @js.native
  sealed trait timeTicks
    extends EnableRequestTimeDomain
       with SetTimeDomainRequestTimeDomain
  @scala.inline
  def timeTicks: timeTicks = "timeTicks".asInstanceOf[timeTicks]
  
  @js.native
  sealed trait title extends AXValueNativeSourceType
  @scala.inline
  def title: title = "title".asInstanceOf[title]
  
  @js.native
  sealed trait token extends AXValueType
  @scala.inline
  def token: token = "token".asInstanceOf[token]
  
  @js.native
  sealed trait tokenList extends AXValueType
  @scala.inline
  def tokenList: tokenList = "tokenList".asInstanceOf[tokenList]
  
  @js.native
  sealed trait touch extends GestureSourceType
  @scala.inline
  def touch: touch = "touch".asInstanceOf[touch]
  
  @js.native
  sealed trait touchCancel extends DispatchTouchEventRequestType
  @scala.inline
  def touchCancel: touchCancel = "touchCancel".asInstanceOf[touchCancel]
  
  @js.native
  sealed trait touchEnd extends DispatchTouchEventRequestType
  @scala.inline
  def touchEnd: touchEnd = "touchEnd".asInstanceOf[touchEnd]
  
  @js.native
  sealed trait touchMove extends DispatchTouchEventRequestType
  @scala.inline
  def touchMove: touchMove = "touchMove".asInstanceOf[touchMove]
  
  @js.native
  sealed trait touchStart extends DispatchTouchEventRequestType
  @scala.inline
  def touchStart: touchStart = "touchStart".asInstanceOf[touchStart]
  
  @js.native
  sealed trait trace extends ConsoleAPICalledEventType
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait tracingComplete extends StObject
  @scala.inline
  def tracingComplete: tracingComplete = "tracingComplete".asInstanceOf[tracingComplete]
  
  @js.native
  sealed trait tristate extends AXValueType
  @scala.inline
  def tristate: tristate = "tristate".asInstanceOf[tristate]
  
  @js.native
  sealed trait tritanopia extends SetEmulatedVisionDeficiencyRequestType
  @scala.inline
  def tritanopia: tritanopia = "tritanopia".asInstanceOf[tritanopia]
  
  @js.native
  sealed trait typed extends TransitionType
  @scala.inline
  def typed: typed = "typed".asInstanceOf[typed]
  
  @js.native
  sealed trait typedarray extends RemoteObjectSubtype
  @scala.inline
  def typedarray: typedarray = "typedarray".asInstanceOf[typedarray]
  
  @js.native
  sealed trait u2f extends AuthenticatorProtocol
  @scala.inline
  def u2f: u2f = "u2f".asInstanceOf[u2f]
  
  @js.native
  sealed trait uncaught extends SetPauseOnExceptionsRequestState
  @scala.inline
  def uncaught: uncaught = "uncaught".asInstanceOf[uncaught]
  
  @js.native
  sealed trait undefined
    extends ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
  @scala.inline
  def undefined: undefined = "undefined".asInstanceOf[undefined]
  
  @js.native
  sealed trait unknown
    extends CertificateTransparencyCompliance
       with ImageType
       with SecurityState
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait `unsafe-url` extends RequestReferrerPolicy
  @scala.inline
  def `unsafe-url`: `unsafe-url` = "unsafe-url".asInstanceOf[`unsafe-url`]
  
  @js.native
  sealed trait unsafeUrl extends ReferrerPolicy
  @scala.inline
  def unsafeUrl: unsafeUrl = "unsafeUrl".asInstanceOf[unsafeUrl]
  
  @js.native
  sealed trait usb extends AuthenticatorTransport
  @scala.inline
  def usb: usb = "usb".asInstanceOf[usb]
  
  @js.native
  sealed trait `user-agent`
    extends ShadowRootType
       with StyleSheetOrigin
  @scala.inline
  def `user-agent`: `user-agent` = "user-agent".asInstanceOf[`user-agent`]
  
  @js.native
  sealed trait v128 extends RemoteObjectSubtype
  @scala.inline
  def v128: v128 = "v128".asInstanceOf[v128]
  
  @js.native
  sealed trait valueUndefined extends AXValueType
  @scala.inline
  def valueUndefined: valueUndefined = "valueUndefined".asInstanceOf[valueUndefined]
  
  @js.native
  sealed trait valuemax extends AXPropertyName
  @scala.inline
  def valuemax: valuemax = "valuemax".asInstanceOf[valuemax]
  
  @js.native
  sealed trait valuemin extends AXPropertyName
  @scala.inline
  def valuemin: valuemin = "valuemin".asInstanceOf[valuemin]
  
  @js.native
  sealed trait valuetext extends AXPropertyName
  @scala.inline
  def valuetext: valuetext = "valuetext".asInstanceOf[valuetext]
  
  @js.native
  sealed trait verbose extends LogEntryLevel
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @js.native
  sealed trait vertical extends DisplayFeatureOrientation
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait videoCapture extends PermissionType
  @scala.inline
  def videoCapture: videoCapture = "videoCapture".asInstanceOf[videoCapture]
  
  @js.native
  sealed trait videoCapturePanTiltZoom extends PermissionType
  @scala.inline
  def videoCapturePanTiltZoom: videoCapturePanTiltZoom = "videoCapturePanTiltZoom".asInstanceOf[videoCapturePanTiltZoom]
  
  @js.native
  sealed trait violation extends LogEntrySource
  @scala.inline
  def violation: violation = "violation".asInstanceOf[violation]
  
  @js.native
  sealed trait virtualTimeBudgetExpired extends StObject
  @scala.inline
  def virtualTimeBudgetExpired: virtualTimeBudgetExpired = "virtualTimeBudgetExpired".asInstanceOf[virtualTimeBudgetExpired]
  
  @js.native
  sealed trait visibleSecurityStateChanged extends StObject
  @scala.inline
  def visibleSecurityStateChanged: visibleSecurityStateChanged = "visibleSecurityStateChanged".asInstanceOf[visibleSecurityStateChanged]
  
  @js.native
  sealed trait wakeLockScreen extends PermissionType
  @scala.inline
  def wakeLockScreen: wakeLockScreen = "wakeLockScreen".asInstanceOf[wakeLockScreen]
  
  @js.native
  sealed trait wakeLockSystem extends PermissionType
  @scala.inline
  def wakeLockSystem: wakeLockSystem = "wakeLockSystem".asInstanceOf[wakeLockSystem]
  
  @js.native
  sealed trait warning
    extends ConsoleAPICalledEventType
       with ConsoleMessageLevel
       with LogEntryLevel
       with PlayerMessageLevel
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait wasm extends RemoteObjectType
  @scala.inline
  def wasm: wasm = "wasm".asInstanceOf[wasm]
  
  @js.native
  sealed trait `wasm-expression-stack` extends ScopeType
  @scala.inline
  def `wasm-expression-stack`: `wasm-expression-stack` = "wasm-expression-stack".asInstanceOf[`wasm-expression-stack`]
  
  @js.native
  sealed trait weakmap
    extends ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  @scala.inline
  def weakmap: weakmap = "weakmap".asInstanceOf[weakmap]
  
  @js.native
  sealed trait weakset
    extends ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  @scala.inline
  def weakset: weakset = "weakset".asInstanceOf[weakset]
  
  @js.native
  sealed trait webSocketClosed extends StObject
  @scala.inline
  def webSocketClosed: webSocketClosed = "webSocketClosed".asInstanceOf[webSocketClosed]
  
  @js.native
  sealed trait webSocketCreated extends StObject
  @scala.inline
  def webSocketCreated: webSocketCreated = "webSocketCreated".asInstanceOf[webSocketCreated]
  
  @js.native
  sealed trait webSocketFrameError extends StObject
  @scala.inline
  def webSocketFrameError: webSocketFrameError = "webSocketFrameError".asInstanceOf[webSocketFrameError]
  
  @js.native
  sealed trait webSocketFrameReceived extends StObject
  @scala.inline
  def webSocketFrameReceived: webSocketFrameReceived = "webSocketFrameReceived".asInstanceOf[webSocketFrameReceived]
  
  @js.native
  sealed trait webSocketFrameSent extends StObject
  @scala.inline
  def webSocketFrameSent: webSocketFrameSent = "webSocketFrameSent".asInstanceOf[webSocketFrameSent]
  
  @js.native
  sealed trait webSocketHandshakeResponseReceived extends StObject
  @scala.inline
  def webSocketHandshakeResponseReceived: webSocketHandshakeResponseReceived = "webSocketHandshakeResponseReceived".asInstanceOf[webSocketHandshakeResponseReceived]
  
  @js.native
  sealed trait webSocketWillSendHandshakeRequest extends StObject
  @scala.inline
  def webSocketWillSendHandshakeRequest: webSocketWillSendHandshakeRequest = "webSocketWillSendHandshakeRequest".asInstanceOf[webSocketWillSendHandshakeRequest]
  
  @js.native
  sealed trait webp
    extends GetEncodedResponseRequestEncoding
       with ImageType
  @scala.inline
  def webp: webp = "webp".asInstanceOf[webp]
  
  @js.native
  sealed trait websql extends StorageType
  @scala.inline
  def websql: websql = "websql".asInstanceOf[websql]
  
  @js.native
  sealed trait wifi extends ConnectionType
  @scala.inline
  def wifi: wifi = "wifi".asInstanceOf[wifi]
  
  @js.native
  sealed trait wimax extends ConnectionType
  @scala.inline
  def wimax: wimax = "wimax".asInstanceOf[wimax]
  
  @js.native
  sealed trait windowOpen extends StObject
  @scala.inline
  def windowOpen: windowOpen = "windowOpen".asInstanceOf[windowOpen]
  
  @js.native
  sealed trait `with` extends ScopeType
  @scala.inline
  def `with`: `with` = "with".asInstanceOf[`with`]
  
  @js.native
  sealed trait workerErrorReported extends StObject
  @scala.inline
  def workerErrorReported: workerErrorReported = "workerErrorReported".asInstanceOf[workerErrorReported]
  
  @js.native
  sealed trait workerRegistrationUpdated extends StObject
  @scala.inline
  def workerRegistrationUpdated: workerRegistrationUpdated = "workerRegistrationUpdated".asInstanceOf[workerRegistrationUpdated]
  
  @js.native
  sealed trait workerVersionUpdated extends StObject
  @scala.inline
  def workerVersionUpdated: workerVersionUpdated = "workerVersionUpdated".asInstanceOf[workerVersionUpdated]
  
  @js.native
  sealed trait worker_
    extends ConsoleMessageSource
       with LogEntrySource
  @scala.inline
  def worker_ : worker_ = "worker".asInstanceOf[worker_]
  
  @js.native
  sealed trait xml
    extends ConsoleMessageSource
       with LogEntrySource
  @scala.inline
  def xml: xml = "xml".asInstanceOf[xml]
  
  @js.native
  sealed trait yuv420 extends SubsamplingFormat
  @scala.inline
  def yuv420: yuv420 = "yuv420".asInstanceOf[yuv420]
  
  @js.native
  sealed trait yuv422 extends SubsamplingFormat
  @scala.inline
  def yuv422: yuv422 = "yuv422".asInstanceOf[yuv422]
  
  @js.native
  sealed trait yuv444 extends SubsamplingFormat
  @scala.inline
  def yuv444: yuv444 = "yuv444".asInstanceOf[yuv444]
}
