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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devtoolsProtocolStrings {
  
  @scala.inline
  def Aborted: Aborted = "Aborted".asInstanceOf[Aborted]
  
  @scala.inline
  def AccessDenied: AccessDenied = "AccessDenied".asInstanceOf[AccessDenied]
  
  @scala.inline
  def AddressUnreachable: AddressUnreachable = "AddressUnreachable".asInstanceOf[AddressUnreachable]
  
  @scala.inline
  def Audio: Audio = "Audio".asInstanceOf[Audio]
  
  @scala.inline
  def Beacon: Beacon = "Beacon".asInstanceOf[Beacon]
  
  @scala.inline
  def BlockedByClient: BlockedByClient = "BlockedByClient".asInstanceOf[BlockedByClient]
  
  @scala.inline
  def BlockedByResponse: BlockedByResponse = "BlockedByResponse".asInstanceOf[BlockedByResponse]
  
  @scala.inline
  def BlockedByResponseIssue: BlockedByResponseIssue = "BlockedByResponseIssue".asInstanceOf[BlockedByResponseIssue]
  
  @scala.inline
  def CSPReport: CSPReport = "CSPReport".asInstanceOf[CSPReport]
  
  @scala.inline
  def CSPViolationReport: CSPViolationReport = "CSPViolationReport".asInstanceOf[CSPViolationReport]
  
  @scala.inline
  def CSSAnimation: CSSAnimation = "CSSAnimation".asInstanceOf[CSSAnimation]
  
  @scala.inline
  def CSSTransition: CSSTransition = "CSSTransition".asInstanceOf[CSSTransition]
  
  @scala.inline
  def CancelAuth: CancelAuth = "CancelAuth".asInstanceOf[CancelAuth]
  
  @scala.inline
  def CoepFrameResourceNeedsCoepHeader: CoepFrameResourceNeedsCoepHeader = "CoepFrameResourceNeedsCoepHeader".asInstanceOf[CoepFrameResourceNeedsCoepHeader]
  
  @scala.inline
  def ConnectionAborted: ConnectionAborted = "ConnectionAborted".asInstanceOf[ConnectionAborted]
  
  @scala.inline
  def ConnectionClosed: ConnectionClosed = "ConnectionClosed".asInstanceOf[ConnectionClosed]
  
  @scala.inline
  def ConnectionFailed: ConnectionFailed = "ConnectionFailed".asInstanceOf[ConnectionFailed]
  
  @scala.inline
  def ConnectionRefused: ConnectionRefused = "ConnectionRefused".asInstanceOf[ConnectionRefused]
  
  @scala.inline
  def ConnectionReset: ConnectionReset = "ConnectionReset".asInstanceOf[ConnectionReset]
  
  @scala.inline
  def ContentSecurityPolicyIssue: ContentSecurityPolicyIssue = "ContentSecurityPolicyIssue".asInstanceOf[ContentSecurityPolicyIssue]
  
  @scala.inline
  def CoopSandboxedIFrameCannotNavigateToCoopPage: CoopSandboxedIFrameCannotNavigateToCoopPage = "CoopSandboxedIFrameCannotNavigateToCoopPage".asInstanceOf[CoopSandboxedIFrameCannotNavigateToCoopPage]
  
  @scala.inline
  def CorpNotSameOrigin: CorpNotSameOrigin = "CorpNotSameOrigin".asInstanceOf[CorpNotSameOrigin]
  
  @scala.inline
  def CorpNotSameOriginAfterDefaultedToSameOriginByCoep: CorpNotSameOriginAfterDefaultedToSameOriginByCoep = "CorpNotSameOriginAfterDefaultedToSameOriginByCoep".asInstanceOf[CorpNotSameOriginAfterDefaultedToSameOriginByCoep]
  
  @scala.inline
  def CorpNotSameSite: CorpNotSameSite = "CorpNotSameSite".asInstanceOf[CorpNotSameSite]
  
  @scala.inline
  def CpuPeakLimit: CpuPeakLimit = "CpuPeakLimit".asInstanceOf[CpuPeakLimit]
  
  @scala.inline
  def CpuTotalLimit: CpuTotalLimit = "CpuTotalLimit".asInstanceOf[CpuTotalLimit]
  
  @scala.inline
  def DOM: DOM = "DOM".asInstanceOf[DOM]
  
  @scala.inline
  def Default: Default = "Default".asInstanceOf[Default]
  
  @scala.inline
  def Document: Document = "Document".asInstanceOf[Document]
  
  @scala.inline
  def DomainMismatch: DomainMismatch = "DomainMismatch".asInstanceOf[DomainMismatch]
  
  @scala.inline
  def Download: Download = "Download".asInstanceOf[Download]
  
  @scala.inline
  def EmbeddedDWARF: EmbeddedDWARF = "EmbeddedDWARF".asInstanceOf[EmbeddedDWARF]
  
  @scala.inline
  def EventListener: EventListener = "EventListener".asInstanceOf[EventListener]
  
  @scala.inline
  def EventSource: EventSource = "EventSource".asInstanceOf[EventSource]
  
  @scala.inline
  def ExcludeSameSiteLax: ExcludeSameSiteLax = "ExcludeSameSiteLax".asInstanceOf[ExcludeSameSiteLax]
  
  @scala.inline
  def ExcludeSameSiteNoneInsecure: ExcludeSameSiteNoneInsecure = "ExcludeSameSiteNoneInsecure".asInstanceOf[ExcludeSameSiteNoneInsecure]
  
  @scala.inline
  def ExcludeSameSiteStrict: ExcludeSameSiteStrict = "ExcludeSameSiteStrict".asInstanceOf[ExcludeSameSiteStrict]
  
  @scala.inline
  def ExcludeSameSiteUnspecifiedTreatedAsLax: ExcludeSameSiteUnspecifiedTreatedAsLax = "ExcludeSameSiteUnspecifiedTreatedAsLax".asInstanceOf[ExcludeSameSiteUnspecifiedTreatedAsLax]
  
  @scala.inline
  def ExternalDWARF: ExternalDWARF = "ExternalDWARF".asInstanceOf[ExternalDWARF]
  
  @scala.inline
  def Failed: Failed = "Failed".asInstanceOf[Failed]
  
  @scala.inline
  def Favicon: Favicon = "Favicon".asInstanceOf[Favicon]
  
  @scala.inline
  def Fetch: Fetch = "Fetch".asInstanceOf[Fetch]
  
  @scala.inline
  def Font: Font = "Font".asInstanceOf[Font]
  
  @scala.inline
  def Form: Form = "Form".asInstanceOf[Form]
  
  @scala.inline
  def Frame: Frame = "Frame".asInstanceOf[Frame]
  
  @scala.inline
  def HeadersReceived: HeadersReceived = "HeadersReceived".asInstanceOf[HeadersReceived]
  
  @scala.inline
  def HeavyAdBlocked: HeavyAdBlocked = "HeavyAdBlocked".asInstanceOf[HeavyAdBlocked]
  
  @scala.inline
  def HeavyAdIssue: HeavyAdIssue = "HeavyAdIssue".asInstanceOf[HeavyAdIssue]
  
  @scala.inline
  def HeavyAdWarning: HeavyAdWarning = "HeavyAdWarning".asInstanceOf[HeavyAdWarning]
  
  @scala.inline
  def High: High = "High".asInstanceOf[High]
  
  @scala.inline
  def Image: Image = "Image".asInstanceOf[Image]
  
  @scala.inline
  def Import: Import = "Import".asInstanceOf[Import]
  
  @scala.inline
  def InsecureAncestor: InsecureAncestor = "InsecureAncestor".asInstanceOf[InsecureAncestor]
  
  @scala.inline
  def InsecureScheme: InsecureScheme = "InsecureScheme".asInstanceOf[InsecureScheme]
  
  @scala.inline
  def InternetDisconnected: InternetDisconnected = "InternetDisconnected".asInstanceOf[InternetDisconnected]
  
  @scala.inline
  def InvalidDomain: InvalidDomain = "InvalidDomain".asInstanceOf[InvalidDomain]
  
  @scala.inline
  def InvalidPrefix: InvalidPrefix = "InvalidPrefix".asInstanceOf[InvalidPrefix]
  
  @scala.inline
  def Isolated: Isolated = "Isolated".asInstanceOf[Isolated]
  
  @scala.inline
  def Issuance: Issuance = "Issuance".asInstanceOf[Issuance]
  
  @scala.inline
  def JavaScript: JavaScript = "JavaScript".asInstanceOf[JavaScript]
  
  @scala.inline
  def Lax: Lax = "Lax".asInstanceOf[Lax]
  
  @scala.inline
  def Low: Low = "Low".asInstanceOf[Low]
  
  @scala.inline
  def Manifest: Manifest = "Manifest".asInstanceOf[Manifest]
  
  @scala.inline
  def Media: Media = "Media".asInstanceOf[Media]
  
  @scala.inline
  def Medium: Medium = "Medium".asInstanceOf[Medium]
  
  @scala.inline
  def MixedContentAutomaticallyUpgraded: MixedContentAutomaticallyUpgraded = "MixedContentAutomaticallyUpgraded".asInstanceOf[MixedContentAutomaticallyUpgraded]
  
  @scala.inline
  def MixedContentBlocked: MixedContentBlocked = "MixedContentBlocked".asInstanceOf[MixedContentBlocked]
  
  @scala.inline
  def MixedContentIssue: MixedContentIssue = "MixedContentIssue".asInstanceOf[MixedContentIssue]
  
  @scala.inline
  def MixedContentWarning: MixedContentWarning = "MixedContentWarning".asInstanceOf[MixedContentWarning]
  
  @scala.inline
  def NameNotResolved: NameNotResolved = "NameNotResolved".asInstanceOf[NameNotResolved]
  
  @scala.inline
  def NetworkTotalLimit: NetworkTotalLimit = "NetworkTotalLimit".asInstanceOf[NetworkTotalLimit]
  
  @scala.inline
  def None: None = "None".asInstanceOf[None]
  
  @scala.inline
  def NotIsolated: NotIsolated = "NotIsolated".asInstanceOf[NotIsolated]
  
  @scala.inline
  def NotIsolatedFeatureDisabled: NotIsolatedFeatureDisabled = "NotIsolatedFeatureDisabled".asInstanceOf[NotIsolatedFeatureDisabled]
  
  @scala.inline
  def NotOnPath: NotOnPath = "NotOnPath".asInstanceOf[NotOnPath]
  
  @scala.inline
  def OOM: OOM = "OOM".asInstanceOf[OOM]
  
  @scala.inline
  def Other: Other = "Other".asInstanceOf[Other]
  
  @scala.inline
  def OverwriteSecure: OverwriteSecure = "OverwriteSecure".asInstanceOf[OverwriteSecure]
  
  @scala.inline
  def Ping: Ping = "Ping".asInstanceOf[Ping]
  
  @scala.inline
  def PluginData: PluginData = "PluginData".asInstanceOf[PluginData]
  
  @scala.inline
  def PluginResource: PluginResource = "PluginResource".asInstanceOf[PluginResource]
  
  @scala.inline
  def Prefetch: Prefetch = "Prefetch".asInstanceOf[Prefetch]
  
  @scala.inline
  def ProvideCredentials: ProvideCredentials = "ProvideCredentials".asInstanceOf[ProvideCredentials]
  
  @scala.inline
  def Proxy: Proxy = "Proxy".asInstanceOf[Proxy]
  
  @scala.inline
  def ReadCookie: ReadCookie = "ReadCookie".asInstanceOf[ReadCookie]
  
  @scala.inline
  def Redemption: Redemption = "Redemption".asInstanceOf[Redemption]
  
  @scala.inline
  def Refresh: Refresh = "Refresh".asInstanceOf[Refresh]
  
  @scala.inline
  def RepaintsOnScroll: RepaintsOnScroll = "RepaintsOnScroll".asInstanceOf[RepaintsOnScroll]
  
  @scala.inline
  def ReportEvents: ReportEvents = "ReportEvents".asInstanceOf[ReportEvents]
  
  @scala.inline
  def Request: Request = "Request".asInstanceOf[Request]
  
  @scala.inline
  def RequireCorp: RequireCorp = "RequireCorp".asInstanceOf[RequireCorp]
  
  @scala.inline
  def Resource: Resource = "Resource".asInstanceOf[Resource]
  
  @scala.inline
  def Response: Response = "Response".asInstanceOf[Response]
  
  @scala.inline
  def ReturnAsBase64: ReturnAsBase64 = "ReturnAsBase64".asInstanceOf[ReturnAsBase64]
  
  @scala.inline
  def ReturnAsStream: ReturnAsStream = "ReturnAsStream".asInstanceOf[ReturnAsStream]
  
  @scala.inline
  def SameOrigin: SameOrigin = "SameOrigin".asInstanceOf[SameOrigin]
  
  @scala.inline
  def SameOriginAllowPopups: SameOriginAllowPopups = "SameOriginAllowPopups".asInstanceOf[SameOriginAllowPopups]
  
  @scala.inline
  def SameOriginPlusCoep: SameOriginPlusCoep = "SameOriginPlusCoep".asInstanceOf[SameOriginPlusCoep]
  
  @scala.inline
  def SameSiteCookieIssue: SameSiteCookieIssue = "SameSiteCookieIssue".asInstanceOf[SameSiteCookieIssue]
  
  @scala.inline
  def SameSiteLax: SameSiteLax = "SameSiteLax".asInstanceOf[SameSiteLax]
  
  @scala.inline
  def SameSiteNoneInsecure: SameSiteNoneInsecure = "SameSiteNoneInsecure".asInstanceOf[SameSiteNoneInsecure]
  
  @scala.inline
  def SameSiteStrict: SameSiteStrict = "SameSiteStrict".asInstanceOf[SameSiteStrict]
  
  @scala.inline
  def SameSiteUnspecifiedTreatedAsLax: SameSiteUnspecifiedTreatedAsLax = "SameSiteUnspecifiedTreatedAsLax".asInstanceOf[SameSiteUnspecifiedTreatedAsLax]
  
  @scala.inline
  def SchemeNotSupported: SchemeNotSupported = "SchemeNotSupported".asInstanceOf[SchemeNotSupported]
  
  @scala.inline
  def SchemefulSameSiteLax: SchemefulSameSiteLax = "SchemefulSameSiteLax".asInstanceOf[SchemefulSameSiteLax]
  
  @scala.inline
  def SchemefulSameSiteStrict: SchemefulSameSiteStrict = "SchemefulSameSiteStrict".asInstanceOf[SchemefulSameSiteStrict]
  
  @scala.inline
  def SchemefulSameSiteUnspecifiedTreatedAsLax: SchemefulSameSiteUnspecifiedTreatedAsLax = "SchemefulSameSiteUnspecifiedTreatedAsLax".asInstanceOf[SchemefulSameSiteUnspecifiedTreatedAsLax]
  
  @scala.inline
  def Script: Script = "Script".asInstanceOf[Script]
  
  @scala.inline
  def Secure: Secure = "Secure".asInstanceOf[Secure]
  
  @scala.inline
  def SecureLocalhost: SecureLocalhost = "SecureLocalhost".asInstanceOf[SecureLocalhost]
  
  @scala.inline
  def SecureOnly: SecureOnly = "SecureOnly".asInstanceOf[SecureOnly]
  
  @scala.inline
  def Server: Server = "Server".asInstanceOf[Server]
  
  @scala.inline
  def ServiceWorker: ServiceWorker = "ServiceWorker".asInstanceOf[ServiceWorker]
  
  @scala.inline
  def SetCookie: SetCookie = "SetCookie".asInstanceOf[SetCookie]
  
  @scala.inline
  def SharedWorker: SharedWorker = "SharedWorker".asInstanceOf[SharedWorker]
  
  @scala.inline
  def SignedExchange: SignedExchange = "SignedExchange".asInstanceOf[SignedExchange]
  
  @scala.inline
  def Signing: Signing = "Signing".asInstanceOf[Signing]
  
  @scala.inline
  def SourceMap: SourceMap = "SourceMap".asInstanceOf[SourceMap]
  
  @scala.inline
  def Strict: Strict = "Strict".asInstanceOf[Strict]
  
  @scala.inline
  def Stylesheet: Stylesheet = "Stylesheet".asInstanceOf[Stylesheet]
  
  @scala.inline
  def SyntaxError: SyntaxError = "SyntaxError".asInstanceOf[SyntaxError]
  
  @scala.inline
  def TextTrack: TextTrack = "TextTrack".asInstanceOf[TextTrack]
  
  @scala.inline
  def TimedOut: TimedOut = "TimedOut".asInstanceOf[TimedOut]
  
  @scala.inline
  def TouchEventHandler: TouchEventHandler = "TouchEventHandler".asInstanceOf[TouchEventHandler]
  
  @scala.inline
  def Track: Track = "Track".asInstanceOf[Track]
  
  @scala.inline
  def UnknownError: UnknownError = "UnknownError".asInstanceOf[UnknownError]
  
  @scala.inline
  def UnsafeNone: UnsafeNone = "UnsafeNone".asInstanceOf[UnsafeNone]
  
  @scala.inline
  def UseCached: UseCached = "UseCached".asInstanceOf[UseCached]
  
  @scala.inline
  def UserPreferences: UserPreferences = "UserPreferences".asInstanceOf[UserPreferences]
  
  @scala.inline
  def VeryHigh: VeryHigh = "VeryHigh".asInstanceOf[VeryHigh]
  
  @scala.inline
  def VeryLow: VeryLow = "VeryLow".asInstanceOf[VeryLow]
  
  @scala.inline
  def Video: Video = "Video".asInstanceOf[Video]
  
  @scala.inline
  def WarnSameSiteLaxCrossDowngradeLax: WarnSameSiteLaxCrossDowngradeLax = "WarnSameSiteLaxCrossDowngradeLax".asInstanceOf[WarnSameSiteLaxCrossDowngradeLax]
  
  @scala.inline
  def WarnSameSiteLaxCrossDowngradeStrict: WarnSameSiteLaxCrossDowngradeStrict = "WarnSameSiteLaxCrossDowngradeStrict".asInstanceOf[WarnSameSiteLaxCrossDowngradeStrict]
  
  @scala.inline
  def WarnSameSiteNoneInsecure: WarnSameSiteNoneInsecure = "WarnSameSiteNoneInsecure".asInstanceOf[WarnSameSiteNoneInsecure]
  
  @scala.inline
  def WarnSameSiteStrictCrossDowngradeLax: WarnSameSiteStrictCrossDowngradeLax = "WarnSameSiteStrictCrossDowngradeLax".asInstanceOf[WarnSameSiteStrictCrossDowngradeLax]
  
  @scala.inline
  def WarnSameSiteStrictCrossDowngradeStrict: WarnSameSiteStrictCrossDowngradeStrict = "WarnSameSiteStrictCrossDowngradeStrict".asInstanceOf[WarnSameSiteStrictCrossDowngradeStrict]
  
  @scala.inline
  def WarnSameSiteStrictLaxDowngradeStrict: WarnSameSiteStrictLaxDowngradeStrict = "WarnSameSiteStrictLaxDowngradeStrict".asInstanceOf[WarnSameSiteStrictLaxDowngradeStrict]
  
  @scala.inline
  def WarnSameSiteUnspecifiedCrossSiteContext: WarnSameSiteUnspecifiedCrossSiteContext = "WarnSameSiteUnspecifiedCrossSiteContext".asInstanceOf[WarnSameSiteUnspecifiedCrossSiteContext]
  
  @scala.inline
  def WarnSameSiteUnspecifiedLaxAllowUnsafe: WarnSameSiteUnspecifiedLaxAllowUnsafe = "WarnSameSiteUnspecifiedLaxAllowUnsafe".asInstanceOf[WarnSameSiteUnspecifiedLaxAllowUnsafe]
  
  @scala.inline
  def WebAnimation: WebAnimation = "WebAnimation".asInstanceOf[WebAnimation]
  
  @scala.inline
  def WebAssembly: WebAssembly = "WebAssembly".asInstanceOf[WebAssembly]
  
  @scala.inline
  def WebSocket: WebSocket = "WebSocket".asInstanceOf[WebSocket]
  
  @scala.inline
  def WheelEventHandler: WheelEventHandler = "WheelEventHandler".asInstanceOf[WheelEventHandler]
  
  @scala.inline
  def Worker: Worker = "Worker".asInstanceOf[Worker]
  
  @scala.inline
  def XHR: XHR = "XHR".asInstanceOf[XHR]
  
  @scala.inline
  def XMLHttpRequest: XMLHttpRequest = "XMLHttpRequest".asInstanceOf[XMLHttpRequest]
  
  @scala.inline
  def XSLT: XSLT = "XSLT".asInstanceOf[XSLT]
  
  @scala.inline
  def `a-rate`: `a-rate` = "a-rate".asInstanceOf[`a-rate`]
  
  @scala.inline
  def accepted: accepted = "accepted".asInstanceOf[accepted]
  
  @scala.inline
  def accessibilityEvents: accessibilityEvents = "accessibilityEvents".asInstanceOf[accessibilityEvents]
  
  @scala.inline
  def accessor: accessor = "accessor".asInstanceOf[accessor]
  
  @scala.inline
  def achromatopsia: achromatopsia = "achromatopsia".asInstanceOf[achromatopsia]
  
  @scala.inline
  def activated: activated = "activated".asInstanceOf[activated]
  
  @scala.inline
  def activating: activating = "activating".asInstanceOf[activating]
  
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  
  @scala.inline
  def activedescendant: activedescendant = "activedescendant".asInstanceOf[activedescendant]
  
  @scala.inline
  def addDatabase: addDatabase = "addDatabase".asInstanceOf[addDatabase]
  
  @scala.inline
  def addHeapSnapshotChunk: addHeapSnapshotChunk = "addHeapSnapshotChunk".asInstanceOf[addHeapSnapshotChunk]
  
  @scala.inline
  def address_bar: address_bar = "address_bar".asInstanceOf[address_bar]
  
  @scala.inline
  def advance: advance = "advance".asInstanceOf[advance]
  
  @scala.inline
  def after: after = "after".asInstanceOf[after]
  
  @scala.inline
  def alert: alert = "alert".asInstanceOf[alert]
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @scala.inline
  def allow: allow = "allow".asInstanceOf[allow]
  
  @scala.inline
  def allowAndName: allowAndName = "allowAndName".asInstanceOf[allowAndName]
  
  @scala.inline
  def ambiguous: ambiguous = "ambiguous".asInstanceOf[ambiguous]
  
  @scala.inline
  def anchorClick: anchorClick = "anchorClick".asInstanceOf[anchorClick]
  
  @scala.inline
  def animationCanceled: animationCanceled = "animationCanceled".asInstanceOf[animationCanceled]
  
  @scala.inline
  def animationCreated: animationCreated = "animationCreated".asInstanceOf[animationCreated]
  
  @scala.inline
  def animationStarted: animationStarted = "animationStarted".asInstanceOf[animationStarted]
  
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  
  @scala.inline
  def appcache: appcache = "appcache".asInstanceOf[appcache]
  
  @scala.inline
  def applicationCacheStatusUpdated: applicationCacheStatusUpdated = "applicationCacheStatusUpdated".asInstanceOf[applicationCacheStatusUpdated]
  
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  
  @scala.inline
  def arraybuffer: arraybuffer = "arraybuffer".asInstanceOf[arraybuffer]
  
  @scala.inline
  def assert: assert = "assert".asInstanceOf[assert]
  
  @scala.inline
  def atomic: atomic = "atomic".asInstanceOf[atomic]
  
  @scala.inline
  def attachedToTarget: attachedToTarget = "attachedToTarget".asInstanceOf[attachedToTarget]
  
  @scala.inline
  def attribute: attribute = "attribute".asInstanceOf[attribute]
  
  @scala.inline
  def `attribute-modified`: `attribute-modified` = "attribute-modified".asInstanceOf[`attribute-modified`]
  
  @scala.inline
  def attributeModified: attributeModified = "attributeModified".asInstanceOf[attributeModified]
  
  @scala.inline
  def attributeRemoved: attributeRemoved = "attributeRemoved".asInstanceOf[attributeRemoved]
  
  @scala.inline
  def audioCapture: audioCapture = "audioCapture".asInstanceOf[audioCapture]
  
  @scala.inline
  def audioListenerCreated: audioListenerCreated = "audioListenerCreated".asInstanceOf[audioListenerCreated]
  
  @scala.inline
  def audioListenerWillBeDestroyed: audioListenerWillBeDestroyed = "audioListenerWillBeDestroyed".asInstanceOf[audioListenerWillBeDestroyed]
  
  @scala.inline
  def audioNodeCreated: audioNodeCreated = "audioNodeCreated".asInstanceOf[audioNodeCreated]
  
  @scala.inline
  def audioNodeWillBeDestroyed: audioNodeWillBeDestroyed = "audioNodeWillBeDestroyed".asInstanceOf[audioNodeWillBeDestroyed]
  
  @scala.inline
  def audioParamCreated: audioParamCreated = "audioParamCreated".asInstanceOf[audioParamCreated]
  
  @scala.inline
  def audioParamWillBeDestroyed: audioParamWillBeDestroyed = "audioParamWillBeDestroyed".asInstanceOf[audioParamWillBeDestroyed]
  
  @scala.inline
  def authRequired: authRequired = "authRequired".asInstanceOf[authRequired]
  
  @scala.inline
  def auto_bookmark: auto_bookmark = "auto_bookmark".asInstanceOf[auto_bookmark]
  
  @scala.inline
  def auto_subframe: auto_subframe = "auto_subframe".asInstanceOf[auto_subframe]
  
  @scala.inline
  def auto_toplevel: auto_toplevel = "auto_toplevel".asInstanceOf[auto_toplevel]
  
  @scala.inline
  def autocomplete: autocomplete = "autocomplete".asInstanceOf[autocomplete]
  
  @scala.inline
  def back: back = "back".asInstanceOf[back]
  
  @scala.inline
  def backdrop: backdrop = "backdrop".asInstanceOf[backdrop]
  
  @scala.inline
  def backgroundFetch: backgroundFetch = "backgroundFetch".asInstanceOf[backgroundFetch]
  
  @scala.inline
  def backgroundServiceEventReceived: backgroundServiceEventReceived = "backgroundServiceEventReceived".asInstanceOf[backgroundServiceEventReceived]
  
  @scala.inline
  def backgroundSync: backgroundSync = "backgroundSync".asInstanceOf[backgroundSync]
  
  @scala.inline
  def badReputation: badReputation = "badReputation".asInstanceOf[badReputation]
  
  @scala.inline
  def basic: basic = "basic".asInstanceOf[basic]
  
  @scala.inline
  def before: before = "before".asInstanceOf[before]
  
  @scala.inline
  def beforeScriptExecution: beforeScriptExecution = "beforeScriptExecution".asInstanceOf[beforeScriptExecution]
  
  @scala.inline
  def beforeScriptWithSourceMapExecution: beforeScriptWithSourceMapExecution = "beforeScriptWithSourceMapExecution".asInstanceOf[beforeScriptWithSourceMapExecution]
  
  @scala.inline
  def beforeunload: beforeunload = "beforeunload".asInstanceOf[beforeunload]
  
  @scala.inline
  def bigint: bigint = "bigint".asInstanceOf[bigint]
  
  @scala.inline
  def bindingCalled: bindingCalled = "bindingCalled".asInstanceOf[bindingCalled]
  
  @scala.inline
  def ble: ble = "ble".asInstanceOf[ble]
  
  @scala.inline
  def block: block = "block".asInstanceOf[block]
  
  @scala.inline
  def blockable: blockable = "blockable".asInstanceOf[blockable]
  
  @scala.inline
  def blockedEvent: blockedEvent = "blockedEvent".asInstanceOf[blockedEvent]
  
  @scala.inline
  def blockedParser: blockedParser = "blockedParser".asInstanceOf[blockedParser]
  
  @scala.inline
  def bluetooth: bluetooth = "bluetooth".asInstanceOf[bluetooth]
  
  @scala.inline
  def blurredVision: blurredVision = "blurredVision".asInstanceOf[blurredVision]
  
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @scala.inline
  def booleanOrUndefined: booleanOrUndefined = "booleanOrUndefined".asInstanceOf[booleanOrUndefined]
  
  @scala.inline
  def breakpointResolved: breakpointResolved = "breakpointResolved".asInstanceOf[breakpointResolved]
  
  @scala.inline
  def bufferUsage: bufferUsage = "bufferUsage".asInstanceOf[bufferUsage]
  
  @scala.inline
  def busy: busy = "busy".asInstanceOf[busy]
  
  @scala.inline
  def cable: cable = "cable".asInstanceOf[cable]
  
  @scala.inline
  def `cache-storage`: `cache-storage` = "cache-storage".asInstanceOf[`cache-storage`]
  
  @scala.inline
  def cacheStorageContentUpdated: cacheStorageContentUpdated = "cacheStorageContentUpdated".asInstanceOf[cacheStorageContentUpdated]
  
  @scala.inline
  def cacheStorageListUpdated: cacheStorageListUpdated = "cacheStorageListUpdated".asInstanceOf[cacheStorageListUpdated]
  
  @scala.inline
  def cache_storage: cache_storage = "cache_storage".asInstanceOf[cache_storage]
  
  @scala.inline
  def call: call = "call".asInstanceOf[call]
  
  @scala.inline
  def cancel: cancel = "cancel".asInstanceOf[cancel]
  
  @scala.inline
  def canceled: canceled = "canceled".asInstanceOf[canceled]
  
  @scala.inline
  def captureAreaScreenshot: captureAreaScreenshot = "captureAreaScreenshot".asInstanceOf[captureAreaScreenshot]
  
  @scala.inline
  def `catch`: `catch` = "catch".asInstanceOf[`catch`]
  
  @scala.inline
  def cellular2g: cellular2g = "cellular2g".asInstanceOf[cellular2g]
  
  @scala.inline
  def cellular3g: cellular3g = "cellular3g".asInstanceOf[cellular3g]
  
  @scala.inline
  def cellular4g: cellular4g = "cellular4g".asInstanceOf[cellular4g]
  
  @scala.inline
  def certificateError: certificateError = "certificateError".asInstanceOf[certificateError]
  
  @scala.inline
  def char: char = "char".asInstanceOf[char]
  
  @scala.inline
  def characterDataModified: characterDataModified = "characterDataModified".asInstanceOf[characterDataModified]
  
  @scala.inline
  def checked: checked = "checked".asInstanceOf[checked]
  
  @scala.inline
  def child: child = "child".asInstanceOf[child]
  
  @scala.inline
  def childNodeCountUpdated: childNodeCountUpdated = "childNodeCountUpdated".asInstanceOf[childNodeCountUpdated]
  
  @scala.inline
  def childNodeInserted: childNodeInserted = "childNodeInserted".asInstanceOf[childNodeInserted]
  
  @scala.inline
  def childNodeRemoved: childNodeRemoved = "childNodeRemoved".asInstanceOf[childNodeRemoved]
  
  @scala.inline
  def `clamped-max`: `clamped-max` = "clamped-max".asInstanceOf[`clamped-max`]
  
  @scala.inline
  def clear: clear = "clear".asInstanceOf[clear]
  
  @scala.inline
  def clipboardReadWrite: clipboardReadWrite = "clipboardReadWrite".asInstanceOf[clipboardReadWrite]
  
  @scala.inline
  def clipboardSanitizedWrite: clipboardSanitizedWrite = "clipboardSanitizedWrite".asInstanceOf[clipboardSanitizedWrite]
  
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  
  @scala.inline
  def closure: closure = "closure".asInstanceOf[closure]
  
  @scala.inline
  def `coep-frame-resource-needs-coep-header`: `coep-frame-resource-needs-coep-header` = "coep-frame-resource-needs-coep-header".asInstanceOf[`coep-frame-resource-needs-coep-header`]
  
  @scala.inline
  def `collapsed-by-client`: `collapsed-by-client` = "collapsed-by-client".asInstanceOf[`collapsed-by-client`]
  
  @scala.inline
  def compilationCacheProduced: compilationCacheProduced = "compilationCacheProduced".asInstanceOf[compilationCacheProduced]
  
  @scala.inline
  def completed: completed = "completed".asInstanceOf[completed]
  
  @scala.inline
  def compliant: compliant = "compliant".asInstanceOf[compliant]
  
  @scala.inline
  def computedString: computedString = "computedString".asInstanceOf[computedString]
  
  @scala.inline
  def confirm: confirm = "confirm".asInstanceOf[confirm]
  
  @scala.inline
  def `console-api`: `console-api` = "console-api".asInstanceOf[`console-api`]
  
  @scala.inline
  def consoleAPICalled: consoleAPICalled = "consoleAPICalled".asInstanceOf[consoleAPICalled]
  
  @scala.inline
  def consoleProfileFinished: consoleProfileFinished = "consoleProfileFinished".asInstanceOf[consoleProfileFinished]
  
  @scala.inline
  def consoleProfileStarted: consoleProfileStarted = "consoleProfileStarted".asInstanceOf[consoleProfileStarted]
  
  @scala.inline
  def `content-type`: `content-type` = "content-type".asInstanceOf[`content-type`]
  
  @scala.inline
  def contents: contents = "contents".asInstanceOf[contents]
  
  @scala.inline
  def contextChanged: contextChanged = "contextChanged".asInstanceOf[contextChanged]
  
  @scala.inline
  def contextCreated: contextCreated = "contextCreated".asInstanceOf[contextCreated]
  
  @scala.inline
  def contextWillBeDestroyed: contextWillBeDestroyed = "contextWillBeDestroyed".asInstanceOf[contextWillBeDestroyed]
  
  @scala.inline
  def continue: continue = "continue".asInstanceOf[continue]
  
  @scala.inline
  def controls: controls = "controls".asInstanceOf[controls]
  
  @scala.inline
  def cookies: cookies = "cookies".asInstanceOf[cookies]
  
  @scala.inline
  def `coop-sandboxed-iframe-cannot-navigate-to-coop-page`: `coop-sandboxed-iframe-cannot-navigate-to-coop-page` = "coop-sandboxed-iframe-cannot-navigate-to-coop-page".asInstanceOf[`coop-sandboxed-iframe-cannot-navigate-to-coop-page`]
  
  @scala.inline
  def `corp-not-same-origin`: `corp-not-same-origin` = "corp-not-same-origin".asInstanceOf[`corp-not-same-origin`]
  
  @scala.inline
  def `corp-not-same-origin-after-defaulted-to-same-origin-by-coep`: `corp-not-same-origin-after-defaulted-to-same-origin-by-coep` = "corp-not-same-origin-after-defaulted-to-same-origin-by-coep".asInstanceOf[`corp-not-same-origin-after-defaulted-to-same-origin-by-coep`]
  
  @scala.inline
  def `corp-not-same-site`: `corp-not-same-site` = "corp-not-same-site".asInstanceOf[`corp-not-same-site`]
  
  @scala.inline
  def cors: cors = "cors".asInstanceOf[cors]
  
  @scala.inline
  def count: count = "count".asInstanceOf[count]
  
  @scala.inline
  def critical: critical = "critical".asInstanceOf[critical]
  
  @scala.inline
  def csp: csp = "csp".asInstanceOf[csp]
  
  @scala.inline
  def ctap2: ctap2 = "ctap2".asInstanceOf[ctap2]
  
  @scala.inline
  def current: current = "current".asInstanceOf[current]
  
  @scala.inline
  def currentTab: currentTab = "currentTab".asInstanceOf[currentTab]
  
  @scala.inline
  def dataCollected: dataCollected = "dataCollected".asInstanceOf[dataCollected]
  
  @scala.inline
  def dataReceived: dataReceived = "dataReceived".asInstanceOf[dataReceived]
  
  @scala.inline
  def dataview: dataview = "dataview".asInstanceOf[dataview]
  
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @scala.inline
  def debugCommand: debugCommand = "debugCommand".asInstanceOf[debugCommand]
  
  @scala.inline
  def debuggerStatement: debuggerStatement = "debuggerStatement".asInstanceOf[debuggerStatement]
  
  @scala.inline
  def default_ : default_ = "default".asInstanceOf[default_]
  
  @scala.inline
  def denied: denied = "denied".asInstanceOf[denied]
  
  @scala.inline
  def deny: deny = "deny".asInstanceOf[deny]
  
  @scala.inline
  def deprecation: deprecation = "deprecation".asInstanceOf[deprecation]
  
  @scala.inline
  def describedby: describedby = "describedby".asInstanceOf[describedby]
  
  @scala.inline
  def desktop: desktop = "desktop".asInstanceOf[desktop]
  
  @scala.inline
  def detached: detached = "detached".asInstanceOf[detached]
  
  @scala.inline
  def detachedFromTarget: detachedFromTarget = "detachedFromTarget".asInstanceOf[detachedFromTarget]
  
  @scala.inline
  def details: details = "details".asInstanceOf[details]
  
  @scala.inline
  def deuteranopia: deuteranopia = "deuteranopia".asInstanceOf[deuteranopia]
  
  @scala.inline
  def dir: dir = "dir".asInstanceOf[dir]
  
  @scala.inline
  def dirxml: dirxml = "dirxml".asInstanceOf[dirxml]
  
  @scala.inline
  def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @scala.inline
  def discouragedAPIUse: discouragedAPIUse = "discouragedAPIUse".asInstanceOf[discouragedAPIUse]
  
  @scala.inline
  def discrete: discrete = "discrete".asInstanceOf[discrete]
  
  @scala.inline
  def distributedNodesUpdated: distributedNodesUpdated = "distributedNodesUpdated".asInstanceOf[distributedNodesUpdated]
  
  @scala.inline
  def documentUpdated: documentUpdated = "documentUpdated".asInstanceOf[documentUpdated]
  
  @scala.inline
  def domContentEventFired: domContentEventFired = "domContentEventFired".asInstanceOf[domContentEventFired]
  
  @scala.inline
  def domRelation: domRelation = "domRelation".asInstanceOf[domRelation]
  
  @scala.inline
  def domStorageItemAdded: domStorageItemAdded = "domStorageItemAdded".asInstanceOf[domStorageItemAdded]
  
  @scala.inline
  def domStorageItemRemoved: domStorageItemRemoved = "domStorageItemRemoved".asInstanceOf[domStorageItemRemoved]
  
  @scala.inline
  def domStorageItemUpdated: domStorageItemUpdated = "domStorageItemUpdated".asInstanceOf[domStorageItemUpdated]
  
  @scala.inline
  def domStorageItemsCleared: domStorageItemsCleared = "domStorageItemsCleared".asInstanceOf[domStorageItemsCleared]
  
  @scala.inline
  def downloadProgress: downloadProgress = "downloadProgress".asInstanceOf[downloadProgress]
  
  @scala.inline
  def downloadWillBegin: downloadWillBegin = "downloadWillBegin".asInstanceOf[downloadWillBegin]
  
  @scala.inline
  def download_ : download_ = "download".asInstanceOf[download_]
  
  @scala.inline
  def durableStorage: durableStorage = "durableStorage".asInstanceOf[durableStorage]
  
  @scala.inline
  def echoToConsole: echoToConsole = "echoToConsole".asInstanceOf[echoToConsole]
  
  @scala.inline
  def editable: editable = "editable".asInstanceOf[editable]
  
  @scala.inline
  def endGroup: endGroup = "endGroup".asInstanceOf[endGroup]
  
  @scala.inline
  def entryAdded: entryAdded = "entryAdded".asInstanceOf[entryAdded]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def errormessage: errormessage = "errormessage".asInstanceOf[errormessage]
  
  @scala.inline
  def ethernet: ethernet = "ethernet".asInstanceOf[ethernet]
  
  @scala.inline
  def eval: eval = "eval".asInstanceOf[eval]
  
  @scala.inline
  def eventSourceMessageReceived: eventSourceMessageReceived = "eventSourceMessageReceived".asInstanceOf[eventSourceMessageReceived]
  
  @scala.inline
  def exception: exception = "exception".asInstanceOf[exception]
  
  @scala.inline
  def exceptionRevoked: exceptionRevoked = "exceptionRevoked".asInstanceOf[exceptionRevoked]
  
  @scala.inline
  def exceptionThrown: exceptionThrown = "exceptionThrown".asInstanceOf[exceptionThrown]
  
  @scala.inline
  def executionContextCreated: executionContextCreated = "executionContextCreated".asInstanceOf[executionContextCreated]
  
  @scala.inline
  def executionContextDestroyed: executionContextDestroyed = "executionContextDestroyed".asInstanceOf[executionContextDestroyed]
  
  @scala.inline
  def executionContextsCleared: executionContextsCleared = "executionContextsCleared".asInstanceOf[executionContextsCleared]
  
  @scala.inline
  def expanded: expanded = "expanded".asInstanceOf[expanded]
  
  @scala.inline
  def explicit: explicit = "explicit".asInstanceOf[explicit]
  
  @scala.inline
  def externref: externref = "externref".asInstanceOf[externref]
  
  @scala.inline
  def f32: f32 = "f32".asInstanceOf[f32]
  
  @scala.inline
  def f64: f64 = "f64".asInstanceOf[f64]
  
  @scala.inline
  def `fallback-code`: `fallback-code` = "fallback-code".asInstanceOf[`fallback-code`]
  
  @scala.inline
  def figcaption: figcaption = "figcaption".asInstanceOf[figcaption]
  
  @scala.inline
  def fileChooserOpened: fileChooserOpened = "fileChooserOpened".asInstanceOf[fileChooserOpened]
  
  @scala.inline
  def file_systems: file_systems = "file_systems".asInstanceOf[file_systems]
  
  @scala.inline
  def `first-letter`: `first-letter` = "first-letter".asInstanceOf[`first-letter`]
  
  @scala.inline
  def `first-line`: `first-line` = "first-line".asInstanceOf[`first-line`]
  
  @scala.inline
  def `first-line-inherited`: `first-line-inherited` = "first-line-inherited".asInstanceOf[`first-line-inherited`]
  
  @scala.inline
  def flash: flash = "flash".asInstanceOf[flash]
  
  @scala.inline
  def flowto: flowto = "flowto".asInstanceOf[flowto]
  
  @scala.inline
  def focusable: focusable = "focusable".asInstanceOf[focusable]
  
  @scala.inline
  def focused: focused = "focused".asInstanceOf[focused]
  
  @scala.inline
  def fontsUpdated: fontsUpdated = "fontsUpdated".asInstanceOf[fontsUpdated]
  
  @scala.inline
  def formSubmissionGet: formSubmissionGet = "formSubmissionGet".asInstanceOf[formSubmissionGet]
  
  @scala.inline
  def formSubmissionPost: formSubmissionPost = "formSubmissionPost".asInstanceOf[formSubmissionPost]
  
  @scala.inline
  def form_submit: form_submit = "form_submit".asInstanceOf[form_submit]
  
  @scala.inline
  def forward: forward = "forward".asInstanceOf[forward]
  
  @scala.inline
  def frameAttached: frameAttached = "frameAttached".asInstanceOf[frameAttached]
  
  @scala.inline
  def frameClearedScheduledNavigation: frameClearedScheduledNavigation = "frameClearedScheduledNavigation".asInstanceOf[frameClearedScheduledNavigation]
  
  @scala.inline
  def frameDetached: frameDetached = "frameDetached".asInstanceOf[frameDetached]
  
  @scala.inline
  def frameNavigated: frameNavigated = "frameNavigated".asInstanceOf[frameNavigated]
  
  @scala.inline
  def frameRequestedNavigation: frameRequestedNavigation = "frameRequestedNavigation".asInstanceOf[frameRequestedNavigation]
  
  @scala.inline
  def frameResized: frameResized = "frameResized".asInstanceOf[frameResized]
  
  @scala.inline
  def frameScheduledNavigation: frameScheduledNavigation = "frameScheduledNavigation".asInstanceOf[frameScheduledNavigation]
  
  @scala.inline
  def frameStartedLoading: frameStartedLoading = "frameStartedLoading".asInstanceOf[frameStartedLoading]
  
  @scala.inline
  def frameStoppedLoading: frameStoppedLoading = "frameStoppedLoading".asInstanceOf[frameStoppedLoading]
  
  @scala.inline
  def frozen: frozen = "frozen".asInstanceOf[frozen]
  
  @scala.inline
  def fullscreen: fullscreen = "fullscreen".asInstanceOf[fullscreen]
  
  @scala.inline
  def function: function = "function".asInstanceOf[function]
  
  @scala.inline
  def generated: generated = "generated".asInstanceOf[generated]
  
  @scala.inline
  def generator: generator = "generator".asInstanceOf[generator]
  
  @scala.inline
  def geolocation: geolocation = "geolocation".asInstanceOf[geolocation]
  
  @scala.inline
  def global: global = "global".asInstanceOf[global]
  
  @scala.inline
  def granted: granted = "granted".asInstanceOf[granted]
  
  @scala.inline
  def gzip: gzip = "gzip".asInstanceOf[gzip]
  
  @scala.inline
  def handler: handler = "handler".asInstanceOf[handler]
  
  @scala.inline
  def hasPopup: hasPopup = "hasPopup".asInstanceOf[hasPopup]
  
  @scala.inline
  def heapStatsUpdate: heapStatsUpdate = "heapStatsUpdate".asInstanceOf[heapStatsUpdate]
  
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  
  @scala.inline
  def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @scala.inline
  def hiddenRoot: hiddenRoot = "hiddenRoot".asInstanceOf[hiddenRoot]
  
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @scala.inline
  def hsl: hsl = "hsl".asInstanceOf[hsl]
  
  @scala.inline
  def `http-cache`: `http-cache` = "http-cache".asInstanceOf[`http-cache`]
  
  @scala.inline
  def httpHeaderRefresh: httpHeaderRefresh = "httpHeaderRefresh".asInstanceOf[httpHeaderRefresh]
  
  @scala.inline
  def i32: i32 = "i32".asInstanceOf[i32]
  
  @scala.inline
  def i64: i64 = "i64".asInstanceOf[i64]
  
  @scala.inline
  def idleDetection: idleDetection = "idleDetection".asInstanceOf[idleDetection]
  
  @scala.inline
  def idref: idref = "idref".asInstanceOf[idref]
  
  @scala.inline
  def idrefList: idrefList = "idrefList".asInstanceOf[idrefList]
  
  @scala.inline
  def `implicit`: `implicit` = "implicit".asInstanceOf[`implicit`]
  
  @scala.inline
  def importRule: importRule = "importRule".asInstanceOf[importRule]
  
  @scala.inline
  def inProgress: inProgress = "inProgress".asInstanceOf[inProgress]
  
  @scala.inline
  def indexedDBContentUpdated: indexedDBContentUpdated = "indexedDBContentUpdated".asInstanceOf[indexedDBContentUpdated]
  
  @scala.inline
  def indexedDBListUpdated: indexedDBListUpdated = "indexedDBListUpdated".asInstanceOf[indexedDBListUpdated]
  
  @scala.inline
  def indexeddb: indexeddb = "indexeddb".asInstanceOf[indexeddb]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def injected: injected = "injected".asInstanceOf[injected]
  
  @scala.inline
  def inlineSheet: inlineSheet = "inlineSheet".asInstanceOf[inlineSheet]
  
  @scala.inline
  def inlineStyleInvalidated: inlineStyleInvalidated = "inlineStyleInvalidated".asInstanceOf[inlineStyleInvalidated]
  
  @scala.inline
  def `input-list-button`: `input-list-button` = "input-list-button".asInstanceOf[`input-list-button`]
  
  @scala.inline
  def insecure: insecure = "insecure".asInstanceOf[insecure]
  
  @scala.inline
  def `insecure-broken`: `insecure-broken` = "insecure-broken".asInstanceOf[`insecure-broken`]
  
  @scala.inline
  def inspectModeCanceled: inspectModeCanceled = "inspectModeCanceled".asInstanceOf[inspectModeCanceled]
  
  @scala.inline
  def inspectNodeRequested: inspectNodeRequested = "inspectNodeRequested".asInstanceOf[inspectNodeRequested]
  
  @scala.inline
  def inspectRequested: inspectRequested = "inspectRequested".asInstanceOf[inspectRequested]
  
  @scala.inline
  def inspector: inspector = "inspector".asInstanceOf[inspector]
  
  @scala.inline
  def installed: installed = "installed".asInstanceOf[installed]
  
  @scala.inline
  def installing: installing = "installing".asInstanceOf[installing]
  
  @scala.inline
  def instrumentation: instrumentation = "instrumentation".asInstanceOf[instrumentation]
  
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  
  @scala.inline
  def internal: internal = "internal".asInstanceOf[internal]
  
  @scala.inline
  def internalRole: internalRole = "internalRole".asInstanceOf[internalRole]
  
  @scala.inline
  def interstitialHidden: interstitialHidden = "interstitialHidden".asInstanceOf[interstitialHidden]
  
  @scala.inline
  def interstitialShown: interstitialShown = "interstitialShown".asInstanceOf[interstitialShown]
  
  @scala.inline
  def intervention: intervention = "intervention".asInstanceOf[intervention]
  
  @scala.inline
  def invalid: invalid = "invalid".asInstanceOf[invalid]
  
  @scala.inline
  def issueAdded: issueAdded = "issueAdded".asInstanceOf[issueAdded]
  
  @scala.inline
  def issueUpdated: issueUpdated = "issueUpdated".asInstanceOf[issueUpdated]
  
  @scala.inline
  def iterator: iterator = "iterator".asInstanceOf[iterator]
  
  @scala.inline
  def javascriptDialogClosed: javascriptDialogClosed = "javascriptDialogClosed".asInstanceOf[javascriptDialogClosed]
  
  @scala.inline
  def javascriptDialogOpening: javascriptDialogOpening = "javascriptDialogOpening".asInstanceOf[javascriptDialogOpening]
  
  @scala.inline
  def javascript_ : javascript_ = "javascript".asInstanceOf[javascript_]
  
  @scala.inline
  def jpeg: jpeg = "jpeg".asInstanceOf[jpeg]
  
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @scala.inline
  def `k-rate`: `k-rate` = "k-rate".asInstanceOf[`k-rate`]
  
  @scala.inline
  def kEvalViolation: kEvalViolation = "kEvalViolation".asInstanceOf[kEvalViolation]
  
  @scala.inline
  def kInlineViolation: kInlineViolation = "kInlineViolation".asInstanceOf[kInlineViolation]
  
  @scala.inline
  def kTrustedTypesPolicyViolation: kTrustedTypesPolicyViolation = "kTrustedTypesPolicyViolation".asInstanceOf[kTrustedTypesPolicyViolation]
  
  @scala.inline
  def kTrustedTypesSinkViolation: kTrustedTypesSinkViolation = "kTrustedTypesSinkViolation".asInstanceOf[kTrustedTypesSinkViolation]
  
  @scala.inline
  def kURLViolation: kURLViolation = "kURLViolation".asInstanceOf[kURLViolation]
  
  @scala.inline
  def keyDown: keyDown = "keyDown".asInstanceOf[keyDown]
  
  @scala.inline
  def keyUp: keyUp = "keyUp".asInstanceOf[keyUp]
  
  @scala.inline
  def keyshortcuts: keyshortcuts = "keyshortcuts".asInstanceOf[keyshortcuts]
  
  @scala.inline
  def keyword: keyword = "keyword".asInstanceOf[keyword]
  
  @scala.inline
  def keyword_generated: keyword_generated = "keyword_generated".asInstanceOf[keyword_generated]
  
  @scala.inline
  def label: label = "label".asInstanceOf[label]
  
  @scala.inline
  def labelfor: labelfor = "labelfor".asInstanceOf[labelfor]
  
  @scala.inline
  def labelledby: labelledby = "labelledby".asInstanceOf[labelledby]
  
  @scala.inline
  def labelwrapped: labelwrapped = "labelwrapped".asInstanceOf[labelwrapped]
  
  @scala.inline
  def landscapePrimary: landscapePrimary = "landscapePrimary".asInstanceOf[landscapePrimary]
  
  @scala.inline
  def landscapeSecondary: landscapeSecondary = "landscapeSecondary".asInstanceOf[landscapeSecondary]
  
  @scala.inline
  def lastSeenObjectId: lastSeenObjectId = "lastSeenObjectId".asInstanceOf[lastSeenObjectId]
  
  @scala.inline
  def layerPainted: layerPainted = "layerPainted".asInstanceOf[layerPainted]
  
  @scala.inline
  def layerTreeDidChange: layerTreeDidChange = "layerTreeDidChange".asInstanceOf[layerTreeDidChange]
  
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @scala.inline
  def legend: legend = "legend".asInstanceOf[legend]
  
  @scala.inline
  def level: level = "level".asInstanceOf[level]
  
  @scala.inline
  def lifecycleEvent: lifecycleEvent = "lifecycleEvent".asInstanceOf[lifecycleEvent]
  
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  
  @scala.inline
  def linkedSheet: linkedSheet = "linkedSheet".asInstanceOf[linkedSheet]
  
  @scala.inline
  def live: live = "live".asInstanceOf[live]
  
  @scala.inline
  def loadEventFired: loadEventFired = "loadEventFired".asInstanceOf[loadEventFired]
  
  @scala.inline
  def loadingFailed: loadingFailed = "loadingFailed".asInstanceOf[loadingFailed]
  
  @scala.inline
  def loadingFinished: loadingFinished = "loadingFinished".asInstanceOf[loadingFinished]
  
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  
  @scala.inline
  def local_storage: local_storage = "local_storage".asInstanceOf[local_storage]
  
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  
  @scala.inline
  def longLayout: longLayout = "longLayout".asInstanceOf[longLayout]
  
  @scala.inline
  def longTask: longTask = "longTask".asInstanceOf[longTask]
  
  @scala.inline
  def lookalike: lookalike = "lookalike".asInstanceOf[lookalike]
  
  @scala.inline
  def manual_subframe: manual_subframe = "manual_subframe".asInstanceOf[manual_subframe]
  
  @scala.inline
  def map: map = "map".asInstanceOf[map]
  
  @scala.inline
  def marker: marker = "marker".asInstanceOf[marker]
  
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  
  @scala.inline
  def maximized: maximized = "maximized".asInstanceOf[maximized]
  
  @scala.inline
  def mediaQueryResultChanged: mediaQueryResultChanged = "mediaQueryResultChanged".asInstanceOf[mediaQueryResultChanged]
  
  @scala.inline
  def mediaRule: mediaRule = "mediaRule".asInstanceOf[mediaRule]
  
  @scala.inline
  def media_error: media_error = "media_error".asInstanceOf[media_error]
  
  @scala.inline
  def messageAdded: messageAdded = "messageAdded".asInstanceOf[messageAdded]
  
  @scala.inline
  def metaTagRefresh: metaTagRefresh = "metaTagRefresh".asInstanceOf[metaTagRefresh]
  
  @scala.inline
  def metrics: metrics = "metrics".asInstanceOf[metrics]
  
  @scala.inline
  def mhtml: mhtml = "mhtml".asInstanceOf[mhtml]
  
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  
  @scala.inline
  def midi: midi = "midi".asInstanceOf[midi]
  
  @scala.inline
  def midiSysex: midiSysex = "midiSysex".asInstanceOf[midiSysex]
  
  @scala.inline
  def minimized: minimized = "minimized".asInstanceOf[minimized]
  
  @scala.inline
  def `mixed-content`: `mixed-content` = "mixed-content".asInstanceOf[`mixed-content`]
  
  @scala.inline
  def mobile: mobile = "mobile".asInstanceOf[mobile]
  
  @scala.inline
  def modal: modal = "modal".asInstanceOf[modal]
  
  @scala.inline
  def moderate: moderate = "moderate".asInstanceOf[moderate]
  
  @scala.inline
  def module: module = "module".asInstanceOf[module]
  
  @scala.inline
  def mouse: mouse = "mouse".asInstanceOf[mouse]
  
  @scala.inline
  def mouseMoved: mouseMoved = "mouseMoved".asInstanceOf[mouseMoved]
  
  @scala.inline
  def mousePressed: mousePressed = "mousePressed".asInstanceOf[mousePressed]
  
  @scala.inline
  def mouseReleased: mouseReleased = "mouseReleased".asInstanceOf[mouseReleased]
  
  @scala.inline
  def mouseWheel: mouseWheel = "mouseWheel".asInstanceOf[mouseWheel]
  
  @scala.inline
  def multiline: multiline = "multiline".asInstanceOf[multiline]
  
  @scala.inline
  def multiselectable: multiselectable = "multiselectable".asInstanceOf[multiselectable]
  
  @scala.inline
  def navigatedWithinDocument: navigatedWithinDocument = "navigatedWithinDocument".asInstanceOf[navigatedWithinDocument]
  
  @scala.inline
  def needsBeginFramesChanged: needsBeginFramesChanged = "needsBeginFramesChanged".asInstanceOf[needsBeginFramesChanged]
  
  @scala.inline
  def network: network = "network".asInstanceOf[network]
  
  @scala.inline
  def networkStateUpdated: networkStateUpdated = "networkStateUpdated".asInstanceOf[networkStateUpdated]
  
  @scala.inline
  def neutral: neutral = "neutral".asInstanceOf[neutral]
  
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  
  @scala.inline
  def newTab: newTab = "newTab".asInstanceOf[newTab]
  
  @scala.inline
  def newWindow: newWindow = "newWindow".asInstanceOf[newWindow]
  
  @scala.inline
  def nfc: nfc = "nfc".asInstanceOf[nfc]
  
  @scala.inline
  def `no-referrer`: `no-referrer` = "no-referrer".asInstanceOf[`no-referrer`]
  
  @scala.inline
  def `no-referrer-when-downgrade`: `no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[`no-referrer-when-downgrade`]
  
  @scala.inline
  def noReferrer: noReferrer = "noReferrer".asInstanceOf[noReferrer]
  
  @scala.inline
  def noReferrerWhenDowngrade: noReferrerWhenDowngrade = "noReferrerWhenDowngrade".asInstanceOf[noReferrerWhenDowngrade]
  
  @scala.inline
  def node: node = "node".asInstanceOf[node]
  
  @scala.inline
  def `node-removed`: `node-removed` = "node-removed".asInstanceOf[`node-removed`]
  
  @scala.inline
  def nodeHighlightRequested: nodeHighlightRequested = "nodeHighlightRequested".asInstanceOf[nodeHighlightRequested]
  
  @scala.inline
  def nodeList: nodeList = "nodeList".asInstanceOf[nodeList]
  
  @scala.inline
  def nodeParamConnected: nodeParamConnected = "nodeParamConnected".asInstanceOf[nodeParamConnected]
  
  @scala.inline
  def nodeParamDisconnected: nodeParamDisconnected = "nodeParamDisconnected".asInstanceOf[nodeParamDisconnected]
  
  @scala.inline
  def nodesConnected: nodesConnected = "nodesConnected".asInstanceOf[nodesConnected]
  
  @scala.inline
  def nodesDisconnected: nodesDisconnected = "nodesDisconnected".asInstanceOf[nodesDisconnected]
  
  @scala.inline
  def none_ : none_ = "none".asInstanceOf[none_]
  
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @scala.inline
  def `not-compliant`: `not-compliant` = "not-compliant".asInstanceOf[`not-compliant`]
  
  @scala.inline
  def notifications: notifications = "notifications".asInstanceOf[notifications]
  
  @scala.inline
  def `null`: `null` = "null".asInstanceOf[`null`]
  
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  
  @scala.inline
  def offline: offline = "offline".asInstanceOf[offline]
  
  @scala.inline
  def opaqueRedirect: opaqueRedirect = "opaqueRedirect".asInstanceOf[opaqueRedirect]
  
  @scala.inline
  def opaqueResponse: opaqueResponse = "opaqueResponse".asInstanceOf[opaqueResponse]
  
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @scala.inline
  def `optionally-blockable`: `optionally-blockable` = "optionally-blockable".asInstanceOf[`optionally-blockable`]
  
  @scala.inline
  def orientation: orientation = "orientation".asInstanceOf[orientation]
  
  @scala.inline
  def origin: origin = "origin".asInstanceOf[origin]
  
  @scala.inline
  def `origin-when-cross-origin`: `origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[`origin-when-cross-origin`]
  
  @scala.inline
  def originWhenCrossOrigin: originWhenCrossOrigin = "originWhenCrossOrigin".asInstanceOf[originWhenCrossOrigin]
  
  @scala.inline
  def other_ : other_ = "other".asInstanceOf[other_]
  
  @scala.inline
  def owns: owns = "owns".asInstanceOf[owns]
  
  @scala.inline
  def pageBlockInterstitial: pageBlockInterstitial = "pageBlockInterstitial".asInstanceOf[pageBlockInterstitial]
  
  @scala.inline
  def parser: parser = "parser".asInstanceOf[parser]
  
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  
  @scala.inline
  def pauseIfNetworkFetchesPending: pauseIfNetworkFetchesPending = "pauseIfNetworkFetchesPending".asInstanceOf[pauseIfNetworkFetchesPending]
  
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  
  @scala.inline
  def paymentHandler: paymentHandler = "paymentHandler".asInstanceOf[paymentHandler]
  
  @scala.inline
  def pen: pen = "pen".asInstanceOf[pen]
  
  @scala.inline
  def periodicBackgroundSync: periodicBackgroundSync = "periodicBackgroundSync".asInstanceOf[periodicBackgroundSync]
  
  @scala.inline
  def pipeline_error: pipeline_error = "pipeline_error".asInstanceOf[pipeline_error]
  
  @scala.inline
  def placeholder: placeholder = "placeholder".asInstanceOf[placeholder]
  
  @scala.inline
  def playerErrorsRaised: playerErrorsRaised = "playerErrorsRaised".asInstanceOf[playerErrorsRaised]
  
  @scala.inline
  def playerEventsAdded: playerEventsAdded = "playerEventsAdded".asInstanceOf[playerEventsAdded]
  
  @scala.inline
  def playerMessagesLogged: playerMessagesLogged = "playerMessagesLogged".asInstanceOf[playerMessagesLogged]
  
  @scala.inline
  def playerPropertiesChanged: playerPropertiesChanged = "playerPropertiesChanged".asInstanceOf[playerPropertiesChanged]
  
  @scala.inline
  def playersCreated: playersCreated = "playersCreated".asInstanceOf[playersCreated]
  
  @scala.inline
  def png: png = "png".asInstanceOf[png]
  
  @scala.inline
  def portraitPrimary: portraitPrimary = "portraitPrimary".asInstanceOf[portraitPrimary]
  
  @scala.inline
  def portraitSecondary: portraitSecondary = "portraitSecondary".asInstanceOf[portraitSecondary]
  
  @scala.inline
  def preciseCoverageDeltaUpdate: preciseCoverageDeltaUpdate = "preciseCoverageDeltaUpdate".asInstanceOf[preciseCoverageDeltaUpdate]
  
  @scala.inline
  def preload: preload = "preload".asInstanceOf[preload]
  
  @scala.inline
  def pressed: pressed = "pressed".asInstanceOf[pressed]
  
  @scala.inline
  def profile: profile = "profile".asInstanceOf[profile]
  
  @scala.inline
  def profileEnd: profileEnd = "profileEnd".asInstanceOf[profileEnd]
  
  @scala.inline
  def promise: promise = "promise".asInstanceOf[promise]
  
  @scala.inline
  def promiseRejection: promiseRejection = "promiseRejection".asInstanceOf[promiseRejection]
  
  @scala.inline
  def prompt: prompt = "prompt".asInstanceOf[prompt]
  
  @scala.inline
  def protanopia: protanopia = "protanopia".asInstanceOf[protanopia]
  
  @scala.inline
  def protectedMediaIdentifier: protectedMediaIdentifier = "protectedMediaIdentifier".asInstanceOf[protectedMediaIdentifier]
  
  @scala.inline
  def proto: proto = "proto".asInstanceOf[proto]
  
  @scala.inline
  def proxy_ : proxy_ = "proxy".asInstanceOf[proxy_]
  
  @scala.inline
  def pseudoElementAdded: pseudoElementAdded = "pseudoElementAdded".asInstanceOf[pseudoElementAdded]
  
  @scala.inline
  def pseudoElementRemoved: pseudoElementRemoved = "pseudoElementRemoved".asInstanceOf[pseudoElementRemoved]
  
  @scala.inline
  def pushMessaging: pushMessaging = "pushMessaging".asInstanceOf[pushMessaging]
  
  @scala.inline
  def rawKeyDown: rawKeyDown = "rawKeyDown".asInstanceOf[rawKeyDown]
  
  @scala.inline
  def readonly: readonly = "readonly".asInstanceOf[readonly]
  
  @scala.inline
  def realtime: realtime = "realtime".asInstanceOf[realtime]
  
  @scala.inline
  def receivedMessageFromTarget: receivedMessageFromTarget = "receivedMessageFromTarget".asInstanceOf[receivedMessageFromTarget]
  
  @scala.inline
  def recommendation: recommendation = "recommendation".asInstanceOf[recommendation]
  
  @scala.inline
  def recordAsMuchAsPossible: recordAsMuchAsPossible = "recordAsMuchAsPossible".asInstanceOf[recordAsMuchAsPossible]
  
  @scala.inline
  def recordContinuously: recordContinuously = "recordContinuously".asInstanceOf[recordContinuously]
  
  @scala.inline
  def recordUntilFull: recordUntilFull = "recordUntilFull".asInstanceOf[recordUntilFull]
  
  @scala.inline
  def recordingStateChanged: recordingStateChanged = "recordingStateChanged".asInstanceOf[recordingStateChanged]
  
  @scala.inline
  def recurringHandler: recurringHandler = "recurringHandler".asInstanceOf[recurringHandler]
  
  @scala.inline
  def redundant: redundant = "redundant".asInstanceOf[redundant]
  
  @scala.inline
  def regexp: regexp = "regexp".asInstanceOf[regexp]
  
  @scala.inline
  def regular: regular = "regular".asInstanceOf[regular]
  
  @scala.inline
  def relatedElement: relatedElement = "relatedElement".asInstanceOf[relatedElement]
  
  @scala.inline
  def relevant: relevant = "relevant".asInstanceOf[relevant]
  
  @scala.inline
  def reload: reload = "reload".asInstanceOf[reload]
  
  @scala.inline
  def rendering: rendering = "rendering".asInstanceOf[rendering]
  
  @scala.inline
  def reportHeapSnapshotProgress: reportHeapSnapshotProgress = "reportHeapSnapshotProgress".asInstanceOf[reportHeapSnapshotProgress]
  
  @scala.inline
  def requestIntercepted: requestIntercepted = "requestIntercepted".asInstanceOf[requestIntercepted]
  
  @scala.inline
  def requestPaused: requestPaused = "requestPaused".asInstanceOf[requestPaused]
  
  @scala.inline
  def requestServedFromCache: requestServedFromCache = "requestServedFromCache".asInstanceOf[requestServedFromCache]
  
  @scala.inline
  def requestWillBeSent: requestWillBeSent = "requestWillBeSent".asInstanceOf[requestWillBeSent]
  
  @scala.inline
  def requestWillBeSentExtraInfo: requestWillBeSentExtraInfo = "requestWillBeSentExtraInfo".asInstanceOf[requestWillBeSentExtraInfo]
  
  @scala.inline
  def required: required = "required".asInstanceOf[required]
  
  @scala.inline
  def resetProfiles: resetProfiles = "resetProfiles".asInstanceOf[resetProfiles]
  
  @scala.inline
  def resizer: resizer = "resizer".asInstanceOf[resizer]
  
  @scala.inline
  def resourceChangedPriority: resourceChangedPriority = "resourceChangedPriority".asInstanceOf[resourceChangedPriority]
  
  @scala.inline
  def responseReceived: responseReceived = "responseReceived".asInstanceOf[responseReceived]
  
  @scala.inline
  def responseReceivedExtraInfo: responseReceivedExtraInfo = "responseReceivedExtraInfo".asInstanceOf[responseReceivedExtraInfo]
  
  @scala.inline
  def resumed: resumed = "resumed".asInstanceOf[resumed]
  
  @scala.inline
  def `return`: `return` = "return".asInstanceOf[`return`]
  
  @scala.inline
  def rgb: rgb = "rgb".asInstanceOf[rgb]
  
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @scala.inline
  def role: role = "role".asInstanceOf[role]
  
  @scala.inline
  def roledescription: roledescription = "roledescription".asInstanceOf[roledescription]
  
  @scala.inline
  def root: root = "root".asInstanceOf[root]
  
  @scala.inline
  def running: running = "running".asInstanceOf[running]
  
  @scala.inline
  def `same-origin`: `same-origin` = "same-origin".asInstanceOf[`same-origin`]
  
  @scala.inline
  def sameOrigin_ : sameOrigin_ = "sameOrigin".asInstanceOf[sameOrigin_]
  
  @scala.inline
  def screencastFrame: screencastFrame = "screencastFrame".asInstanceOf[screencastFrame]
  
  @scala.inline
  def screencastVisibilityChanged: screencastVisibilityChanged = "screencastVisibilityChanged".asInstanceOf[screencastVisibilityChanged]
  
  @scala.inline
  def screenshotRequested: screenshotRequested = "screenshotRequested".asInstanceOf[screenshotRequested]
  
  @scala.inline
  def scriptFailedToParse: scriptFailedToParse = "scriptFailedToParse".asInstanceOf[scriptFailedToParse]
  
  @scala.inline
  def scriptInitiated: scriptInitiated = "scriptInitiated".asInstanceOf[scriptInitiated]
  
  @scala.inline
  def scriptParsed: scriptParsed = "scriptParsed".asInstanceOf[scriptParsed]
  
  @scala.inline
  def script_ : script_ = "script".asInstanceOf[script_]
  
  @scala.inline
  def scrollbar: scrollbar = "scrollbar".asInstanceOf[scrollbar]
  
  @scala.inline
  def `scrollbar-button`: `scrollbar-button` = "scrollbar-button".asInstanceOf[`scrollbar-button`]
  
  @scala.inline
  def `scrollbar-corner`: `scrollbar-corner` = "scrollbar-corner".asInstanceOf[`scrollbar-corner`]
  
  @scala.inline
  def `scrollbar-thumb`: `scrollbar-thumb` = "scrollbar-thumb".asInstanceOf[`scrollbar-thumb`]
  
  @scala.inline
  def `scrollbar-track`: `scrollbar-track` = "scrollbar-track".asInstanceOf[`scrollbar-track`]
  
  @scala.inline
  def `scrollbar-track-piece`: `scrollbar-track-piece` = "scrollbar-track-piece".asInstanceOf[`scrollbar-track-piece`]
  
  @scala.inline
  def searchForNode: searchForNode = "searchForNode".asInstanceOf[searchForNode]
  
  @scala.inline
  def searchForUAShadowDOM: searchForUAShadowDOM = "searchForUAShadowDOM".asInstanceOf[searchForUAShadowDOM]
  
  @scala.inline
  def secure_ : secure_ = "secure".asInstanceOf[secure_]
  
  @scala.inline
  def security: security = "security".asInstanceOf[security]
  
  @scala.inline
  def securityStateChanged: securityStateChanged = "securityStateChanged".asInstanceOf[securityStateChanged]
  
  @scala.inline
  def selectMultiple: selectMultiple = "selectMultiple".asInstanceOf[selectMultiple]
  
  @scala.inline
  def selectSingle: selectSingle = "selectSingle".asInstanceOf[selectSingle]
  
  @scala.inline
  def selected: selected = "selected".asInstanceOf[selected]
  
  @scala.inline
  def selection: selection = "selection".asInstanceOf[selection]
  
  @scala.inline
  def sensors: sensors = "sensors".asInstanceOf[sensors]
  
  @scala.inline
  def service_workers: service_workers = "service_workers".asInstanceOf[service_workers]
  
  @scala.inline
  def set: set = "set".asInstanceOf[set]
  
  @scala.inline
  def setChildNodes: setChildNodes = "setChildNodes".asInstanceOf[setChildNodes]
  
  @scala.inline
  def settable: settable = "settable".asInstanceOf[settable]
  
  @scala.inline
  def shader_cache: shader_cache = "shader_cache".asInstanceOf[shader_cache]
  
  @scala.inline
  def shadowRootPopped: shadowRootPopped = "shadowRootPopped".asInstanceOf[shadowRootPopped]
  
  @scala.inline
  def shadowRootPushed: shadowRootPushed = "shadowRootPushed".asInstanceOf[shadowRootPushed]
  
  @scala.inline
  def showDistances: showDistances = "showDistances".asInstanceOf[showDistances]
  
  @scala.inline
  def signatureCertSha256: signatureCertSha256 = "signatureCertSha256".asInstanceOf[signatureCertSha256]
  
  @scala.inline
  def signatureCertUrl: signatureCertUrl = "signatureCertUrl".asInstanceOf[signatureCertUrl]
  
  @scala.inline
  def signatureIntegrity: signatureIntegrity = "signatureIntegrity".asInstanceOf[signatureIntegrity]
  
  @scala.inline
  def signatureSig: signatureSig = "signatureSig".asInstanceOf[signatureSig]
  
  @scala.inline
  def signatureTimestamps: signatureTimestamps = "signatureTimestamps".asInstanceOf[signatureTimestamps]
  
  @scala.inline
  def signatureValidityUrl: signatureValidityUrl = "signatureValidityUrl".asInstanceOf[signatureValidityUrl]
  
  @scala.inline
  def signedExchangeReceived: signedExchangeReceived = "signedExchangeReceived".asInstanceOf[signedExchangeReceived]
  
  @scala.inline
  def sinksUpdated: sinksUpdated = "sinksUpdated".asInstanceOf[sinksUpdated]
  
  @scala.inline
  def speakers: speakers = "speakers".asInstanceOf[speakers]
  
  @scala.inline
  def startGroup: startGroup = "startGroup".asInstanceOf[startGroup]
  
  @scala.inline
  def startGroupCollapsed: startGroupCollapsed = "startGroupCollapsed".asInstanceOf[startGroupCollapsed]
  
  @scala.inline
  def starting: starting = "starting".asInstanceOf[starting]
  
  @scala.inline
  def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @scala.inline
  def stopping: stopping = "stopping".asInstanceOf[stopping]
  
  @scala.inline
  def storage: storage = "storage".asInstanceOf[storage]
  
  @scala.inline
  def `strict-origin`: `strict-origin` = "strict-origin".asInstanceOf[`strict-origin`]
  
  @scala.inline
  def `strict-origin-when-cross-origin`: `strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[`strict-origin-when-cross-origin`]
  
  @scala.inline
  def strictOrigin: strictOrigin = "strictOrigin".asInstanceOf[strictOrigin]
  
  @scala.inline
  def strictOriginWhenCrossOrigin: strictOriginWhenCrossOrigin = "strictOriginWhenCrossOrigin".asInstanceOf[strictOriginWhenCrossOrigin]
  
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @scala.inline
  def style: style = "style".asInstanceOf[style]
  
  @scala.inline
  def styleSheetAdded: styleSheetAdded = "styleSheetAdded".asInstanceOf[styleSheetAdded]
  
  @scala.inline
  def styleSheetChanged: styleSheetChanged = "styleSheetChanged".asInstanceOf[styleSheetChanged]
  
  @scala.inline
  def styleSheetRemoved: styleSheetRemoved = "styleSheetRemoved".asInstanceOf[styleSheetRemoved]
  
  @scala.inline
  def `subresource-filter`: `subresource-filter` = "subresource-filter".asInstanceOf[`subresource-filter`]
  
  @scala.inline
  def `subtree-modified`: `subtree-modified` = "subtree-modified".asInstanceOf[`subtree-modified`]
  
  @scala.inline
  def suspended: suspended = "suspended".asInstanceOf[suspended]
  
  @scala.inline
  def symbol: symbol = "symbol".asInstanceOf[symbol]
  
  @scala.inline
  def table: table = "table".asInstanceOf[table]
  
  @scala.inline
  def tablecaption: tablecaption = "tablecaption".asInstanceOf[tablecaption]
  
  @scala.inline
  def targetCrashed: targetCrashed = "targetCrashed".asInstanceOf[targetCrashed]
  
  @scala.inline
  def targetCreated: targetCreated = "targetCreated".asInstanceOf[targetCreated]
  
  @scala.inline
  def targetDestroyed: targetDestroyed = "targetDestroyed".asInstanceOf[targetDestroyed]
  
  @scala.inline
  def targetInfoChanged: targetInfoChanged = "targetInfoChanged".asInstanceOf[targetInfoChanged]
  
  @scala.inline
  def targetReloadedAfterCrash: targetReloadedAfterCrash = "targetReloadedAfterCrash".asInstanceOf[targetReloadedAfterCrash]
  
  @scala.inline
  def threadTicks: threadTicks = "threadTicks".asInstanceOf[threadTicks]
  
  @scala.inline
  def timeEnd: timeEnd = "timeEnd".asInstanceOf[timeEnd]
  
  @scala.inline
  def timeTicks: timeTicks = "timeTicks".asInstanceOf[timeTicks]
  
  @scala.inline
  def title: title = "title".asInstanceOf[title]
  
  @scala.inline
  def token: token = "token".asInstanceOf[token]
  
  @scala.inline
  def tokenList: tokenList = "tokenList".asInstanceOf[tokenList]
  
  @scala.inline
  def touch: touch = "touch".asInstanceOf[touch]
  
  @scala.inline
  def touchCancel: touchCancel = "touchCancel".asInstanceOf[touchCancel]
  
  @scala.inline
  def touchEnd: touchEnd = "touchEnd".asInstanceOf[touchEnd]
  
  @scala.inline
  def touchMove: touchMove = "touchMove".asInstanceOf[touchMove]
  
  @scala.inline
  def touchStart: touchStart = "touchStart".asInstanceOf[touchStart]
  
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  
  @scala.inline
  def tracingComplete: tracingComplete = "tracingComplete".asInstanceOf[tracingComplete]
  
  @scala.inline
  def tristate: tristate = "tristate".asInstanceOf[tristate]
  
  @scala.inline
  def tritanopia: tritanopia = "tritanopia".asInstanceOf[tritanopia]
  
  @scala.inline
  def typed: typed = "typed".asInstanceOf[typed]
  
  @scala.inline
  def typedarray: typedarray = "typedarray".asInstanceOf[typedarray]
  
  @scala.inline
  def u2f: u2f = "u2f".asInstanceOf[u2f]
  
  @scala.inline
  def uncaught: uncaught = "uncaught".asInstanceOf[uncaught]
  
  @scala.inline
  def undefined: undefined = "undefined".asInstanceOf[undefined]
  
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @scala.inline
  def `unsafe-url`: `unsafe-url` = "unsafe-url".asInstanceOf[`unsafe-url`]
  
  @scala.inline
  def unsafeUrl: unsafeUrl = "unsafeUrl".asInstanceOf[unsafeUrl]
  
  @scala.inline
  def usb: usb = "usb".asInstanceOf[usb]
  
  @scala.inline
  def `user-agent`: `user-agent` = "user-agent".asInstanceOf[`user-agent`]
  
  @scala.inline
  def v128: v128 = "v128".asInstanceOf[v128]
  
  @scala.inline
  def valueUndefined: valueUndefined = "valueUndefined".asInstanceOf[valueUndefined]
  
  @scala.inline
  def valuemax: valuemax = "valuemax".asInstanceOf[valuemax]
  
  @scala.inline
  def valuemin: valuemin = "valuemin".asInstanceOf[valuemin]
  
  @scala.inline
  def valuetext: valuetext = "valuetext".asInstanceOf[valuetext]
  
  @scala.inline
  def verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @scala.inline
  def videoCapture: videoCapture = "videoCapture".asInstanceOf[videoCapture]
  
  @scala.inline
  def videoCapturePanTiltZoom: videoCapturePanTiltZoom = "videoCapturePanTiltZoom".asInstanceOf[videoCapturePanTiltZoom]
  
  @scala.inline
  def violation: violation = "violation".asInstanceOf[violation]
  
  @scala.inline
  def virtualTimeBudgetExpired: virtualTimeBudgetExpired = "virtualTimeBudgetExpired".asInstanceOf[virtualTimeBudgetExpired]
  
  @scala.inline
  def visibleSecurityStateChanged: visibleSecurityStateChanged = "visibleSecurityStateChanged".asInstanceOf[visibleSecurityStateChanged]
  
  @scala.inline
  def wakeLockScreen: wakeLockScreen = "wakeLockScreen".asInstanceOf[wakeLockScreen]
  
  @scala.inline
  def wakeLockSystem: wakeLockSystem = "wakeLockSystem".asInstanceOf[wakeLockSystem]
  
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  
  @scala.inline
  def wasm: wasm = "wasm".asInstanceOf[wasm]
  
  @scala.inline
  def `wasm-expression-stack`: `wasm-expression-stack` = "wasm-expression-stack".asInstanceOf[`wasm-expression-stack`]
  
  @scala.inline
  def weakmap: weakmap = "weakmap".asInstanceOf[weakmap]
  
  @scala.inline
  def weakset: weakset = "weakset".asInstanceOf[weakset]
  
  @scala.inline
  def webSocketClosed: webSocketClosed = "webSocketClosed".asInstanceOf[webSocketClosed]
  
  @scala.inline
  def webSocketCreated: webSocketCreated = "webSocketCreated".asInstanceOf[webSocketCreated]
  
  @scala.inline
  def webSocketFrameError: webSocketFrameError = "webSocketFrameError".asInstanceOf[webSocketFrameError]
  
  @scala.inline
  def webSocketFrameReceived: webSocketFrameReceived = "webSocketFrameReceived".asInstanceOf[webSocketFrameReceived]
  
  @scala.inline
  def webSocketFrameSent: webSocketFrameSent = "webSocketFrameSent".asInstanceOf[webSocketFrameSent]
  
  @scala.inline
  def webSocketHandshakeResponseReceived: webSocketHandshakeResponseReceived = "webSocketHandshakeResponseReceived".asInstanceOf[webSocketHandshakeResponseReceived]
  
  @scala.inline
  def webSocketWillSendHandshakeRequest: webSocketWillSendHandshakeRequest = "webSocketWillSendHandshakeRequest".asInstanceOf[webSocketWillSendHandshakeRequest]
  
  @scala.inline
  def webp: webp = "webp".asInstanceOf[webp]
  
  @scala.inline
  def websql: websql = "websql".asInstanceOf[websql]
  
  @scala.inline
  def wifi: wifi = "wifi".asInstanceOf[wifi]
  
  @scala.inline
  def wimax: wimax = "wimax".asInstanceOf[wimax]
  
  @scala.inline
  def windowOpen: windowOpen = "windowOpen".asInstanceOf[windowOpen]
  
  @scala.inline
  def `with`: `with` = "with".asInstanceOf[`with`]
  
  @scala.inline
  def workerErrorReported: workerErrorReported = "workerErrorReported".asInstanceOf[workerErrorReported]
  
  @scala.inline
  def workerRegistrationUpdated: workerRegistrationUpdated = "workerRegistrationUpdated".asInstanceOf[workerRegistrationUpdated]
  
  @scala.inline
  def workerVersionUpdated: workerVersionUpdated = "workerVersionUpdated".asInstanceOf[workerVersionUpdated]
  
  @scala.inline
  def worker_ : worker_ = "worker".asInstanceOf[worker_]
  
  @scala.inline
  def xml: xml = "xml".asInstanceOf[xml]
  
  @scala.inline
  def yuv420: yuv420 = "yuv420".asInstanceOf[yuv420]
  
  @scala.inline
  def yuv422: yuv422 = "yuv422".asInstanceOf[yuv422]
  
  @scala.inline
  def yuv444: yuv444 = "yuv444".asInstanceOf[yuv444]
  
  @js.native
  sealed trait Aborted extends ErrorReason
  
  @js.native
  sealed trait AccessDenied extends ErrorReason
  
  @js.native
  sealed trait AddressUnreachable extends ErrorReason
  
  @js.native
  sealed trait Audio extends MixedContentResourceType
  
  @js.native
  sealed trait Beacon extends MixedContentResourceType
  
  @js.native
  sealed trait BlockedByClient extends ErrorReason
  
  @js.native
  sealed trait BlockedByResponse extends ErrorReason
  
  @js.native
  sealed trait BlockedByResponseIssue extends InspectorIssueCode
  
  @js.native
  sealed trait CSPReport extends MixedContentResourceType
  
  @js.native
  sealed trait CSPViolationReport extends ResourceType
  
  @js.native
  sealed trait CSSAnimation extends AnimationType
  
  @js.native
  sealed trait CSSTransition extends AnimationType
  
  @js.native
  sealed trait CancelAuth
    extends AuthChallengeResponseResponse
       with typings.devtoolsProtocol.mod.Protocol.Fetch.AuthChallengeResponseResponse
  
  @js.native
  sealed trait CoepFrameResourceNeedsCoepHeader extends BlockedByResponseReason
  
  @js.native
  sealed trait ConnectionAborted extends ErrorReason
  
  @js.native
  sealed trait ConnectionClosed extends ErrorReason
  
  @js.native
  sealed trait ConnectionFailed extends ErrorReason
  
  @js.native
  sealed trait ConnectionRefused extends ErrorReason
  
  @js.native
  sealed trait ConnectionReset extends ErrorReason
  
  @js.native
  sealed trait ContentSecurityPolicyIssue extends InspectorIssueCode
  
  @js.native
  sealed trait CoopSandboxedIFrameCannotNavigateToCoopPage extends BlockedByResponseReason
  
  @js.native
  sealed trait CorpNotSameOrigin extends BlockedByResponseReason
  
  @js.native
  sealed trait CorpNotSameOriginAfterDefaultedToSameOriginByCoep extends BlockedByResponseReason
  
  @js.native
  sealed trait CorpNotSameSite extends BlockedByResponseReason
  
  @js.native
  sealed trait CpuPeakLimit extends HeavyAdReason
  
  @js.native
  sealed trait CpuTotalLimit extends HeavyAdReason
  
  @js.native
  sealed trait DOM extends PausedEventReason
  
  @js.native
  sealed trait Default
    extends AuthChallengeResponseResponse
       with typings.devtoolsProtocol.mod.Protocol.Fetch.AuthChallengeResponseResponse
  
  @js.native
  sealed trait Document extends ResourceType
  
  @js.native
  sealed trait DomainMismatch extends CookieBlockedReason
  
  @js.native
  sealed trait Download extends MixedContentResourceType
  
  @js.native
  sealed trait EmbeddedDWARF extends DebugSymbolsType
  
  @js.native
  sealed trait EventListener extends PausedEventReason
  
  @js.native
  sealed trait EventSource
    extends MixedContentResourceType
       with ResourceType
  
  @js.native
  sealed trait ExcludeSameSiteLax extends SameSiteCookieExclusionReason
  
  @js.native
  sealed trait ExcludeSameSiteNoneInsecure extends SameSiteCookieExclusionReason
  
  @js.native
  sealed trait ExcludeSameSiteStrict extends SameSiteCookieExclusionReason
  
  @js.native
  sealed trait ExcludeSameSiteUnspecifiedTreatedAsLax extends SameSiteCookieExclusionReason
  
  @js.native
  sealed trait ExternalDWARF extends DebugSymbolsType
  
  @js.native
  sealed trait Failed extends ErrorReason
  
  @js.native
  sealed trait Favicon extends MixedContentResourceType
  
  @js.native
  sealed trait Fetch extends ResourceType
  
  @js.native
  sealed trait Font
    extends MixedContentResourceType
       with ResourceType
  
  @js.native
  sealed trait Form extends MixedContentResourceType
  
  @js.native
  sealed trait Frame extends MixedContentResourceType
  
  @js.native
  sealed trait HeadersReceived extends InterceptionStage
  
  @js.native
  sealed trait HeavyAdBlocked extends HeavyAdResolutionStatus
  
  @js.native
  sealed trait HeavyAdIssue extends InspectorIssueCode
  
  @js.native
  sealed trait HeavyAdWarning extends HeavyAdResolutionStatus
  
  @js.native
  sealed trait High
    extends CookiePriority
       with ResourcePriority
  
  @js.native
  sealed trait Image
    extends MixedContentResourceType
       with ResourceType
  
  @js.native
  sealed trait Import extends MixedContentResourceType
  
  @js.native
  sealed trait InsecureAncestor extends SecureContextType
  
  @js.native
  sealed trait InsecureScheme extends SecureContextType
  
  @js.native
  sealed trait InternetDisconnected extends ErrorReason
  
  @js.native
  sealed trait InvalidDomain extends SetCookieBlockedReason
  
  @js.native
  sealed trait InvalidPrefix extends SetCookieBlockedReason
  
  @js.native
  sealed trait Isolated extends CrossOriginIsolatedContextType
  
  @js.native
  sealed trait Issuance extends TrustTokenOperationType
  
  @js.native
  sealed trait JavaScript extends ScriptLanguage
  
  @js.native
  sealed trait Lax extends CookieSameSite
  
  @js.native
  sealed trait Low
    extends CookiePriority
       with ResourcePriority
  
  @js.native
  sealed trait Manifest
    extends MixedContentResourceType
       with ResourceType
  
  @js.native
  sealed trait Media extends ResourceType
  
  @js.native
  sealed trait Medium
    extends CookiePriority
       with ResourcePriority
  
  @js.native
  sealed trait MixedContentAutomaticallyUpgraded extends MixedContentResolutionStatus
  
  @js.native
  sealed trait MixedContentBlocked extends MixedContentResolutionStatus
  
  @js.native
  sealed trait MixedContentIssue extends InspectorIssueCode
  
  @js.native
  sealed trait MixedContentWarning extends MixedContentResolutionStatus
  
  @js.native
  sealed trait NameNotResolved extends ErrorReason
  
  @js.native
  sealed trait NetworkTotalLimit extends HeavyAdReason
  
  @js.native
  sealed trait None
    extends CookieSameSite
       with CrossOriginEmbedderPolicyValue
       with DebugSymbolsType
  
  @js.native
  sealed trait NotIsolated extends CrossOriginIsolatedContextType
  
  @js.native
  sealed trait NotIsolatedFeatureDisabled extends CrossOriginIsolatedContextType
  
  @js.native
  sealed trait NotOnPath extends CookieBlockedReason
  
  @js.native
  sealed trait OOM extends PausedEventReason
  
  @js.native
  sealed trait Other extends ResourceType
  
  @js.native
  sealed trait OverwriteSecure extends SetCookieBlockedReason
  
  @js.native
  sealed trait Ping
    extends MixedContentResourceType
       with ResourceType
  
  @js.native
  sealed trait PluginData extends MixedContentResourceType
  
  @js.native
  sealed trait PluginResource extends MixedContentResourceType
  
  @js.native
  sealed trait Prefetch extends MixedContentResourceType
  
  @js.native
  sealed trait ProvideCredentials
    extends AuthChallengeResponseResponse
       with typings.devtoolsProtocol.mod.Protocol.Fetch.AuthChallengeResponseResponse
  
  @js.native
  sealed trait Proxy
    extends AuthChallengeSource
       with typings.devtoolsProtocol.mod.Protocol.Fetch.AuthChallengeSource
  
  @js.native
  sealed trait ReadCookie extends SameSiteCookieOperation
  
  @js.native
  sealed trait Redemption extends TrustTokenOperationType
  
  @js.native
  sealed trait Refresh extends TrustTokenParamsRefreshPolicy
  
  @js.native
  sealed trait RepaintsOnScroll extends ScrollRectType
  
  @js.native
  sealed trait ReportEvents extends StartRequestTransferMode
  
  @js.native
  sealed trait Request
    extends InterceptionStage
       with RequestStage
  
  @js.native
  sealed trait RequireCorp extends CrossOriginEmbedderPolicyValue
  
  @js.native
  sealed trait Resource extends MixedContentResourceType
  
  @js.native
  sealed trait Response extends RequestStage
  
  @js.native
  sealed trait ReturnAsBase64 extends PrintToPDFRequestTransferMode
  
  @js.native
  sealed trait ReturnAsStream
    extends PrintToPDFRequestTransferMode
       with StartRequestTransferMode
  
  @js.native
  sealed trait SameOrigin extends CrossOriginOpenerPolicyValue
  
  @js.native
  sealed trait SameOriginAllowPopups extends CrossOriginOpenerPolicyValue
  
  @js.native
  sealed trait SameOriginPlusCoep extends CrossOriginOpenerPolicyValue
  
  @js.native
  sealed trait SameSiteCookieIssue extends InspectorIssueCode
  
  @js.native
  sealed trait SameSiteLax
    extends CookieBlockedReason
       with SetCookieBlockedReason
  
  @js.native
  sealed trait SameSiteNoneInsecure
    extends CookieBlockedReason
       with SetCookieBlockedReason
  
  @js.native
  sealed trait SameSiteStrict
    extends CookieBlockedReason
       with SetCookieBlockedReason
  
  @js.native
  sealed trait SameSiteUnspecifiedTreatedAsLax
    extends CookieBlockedReason
       with SetCookieBlockedReason
  
  @js.native
  sealed trait SchemeNotSupported extends SetCookieBlockedReason
  
  @js.native
  sealed trait SchemefulSameSiteLax
    extends CookieBlockedReason
       with SetCookieBlockedReason
  
  @js.native
  sealed trait SchemefulSameSiteStrict
    extends CookieBlockedReason
       with SetCookieBlockedReason
  
  @js.native
  sealed trait SchemefulSameSiteUnspecifiedTreatedAsLax
    extends CookieBlockedReason
       with SetCookieBlockedReason
  
  @js.native
  sealed trait Script
    extends MixedContentResourceType
       with ResourceType
  
  @js.native
  sealed trait Secure extends SecureContextType
  
  @js.native
  sealed trait SecureLocalhost extends SecureContextType
  
  @js.native
  sealed trait SecureOnly
    extends CookieBlockedReason
       with SetCookieBlockedReason
  
  @js.native
  sealed trait Server
    extends AuthChallengeSource
       with typings.devtoolsProtocol.mod.Protocol.Fetch.AuthChallengeSource
  
  @js.native
  sealed trait ServiceWorker extends MixedContentResourceType
  
  @js.native
  sealed trait SetCookie extends SameSiteCookieOperation
  
  @js.native
  sealed trait SharedWorker extends MixedContentResourceType
  
  @js.native
  sealed trait SignedExchange
    extends InitiatorType
       with ResourceType
  
  @js.native
  sealed trait Signing extends TrustTokenOperationType
  
  @js.native
  sealed trait SourceMap extends DebugSymbolsType
  
  @js.native
  sealed trait Strict extends CookieSameSite
  
  @js.native
  sealed trait Stylesheet
    extends MixedContentResourceType
       with ResourceType
  
  @js.native
  sealed trait SyntaxError extends SetCookieBlockedReason
  
  @js.native
  sealed trait TextTrack extends ResourceType
  
  @js.native
  sealed trait TimedOut extends ErrorReason
  
  @js.native
  sealed trait TouchEventHandler extends ScrollRectType
  
  @js.native
  sealed trait Track extends MixedContentResourceType
  
  @js.native
  sealed trait UnknownError
    extends CookieBlockedReason
       with SetCookieBlockedReason
  
  @js.native
  sealed trait UnsafeNone extends CrossOriginOpenerPolicyValue
  
  @js.native
  sealed trait UseCached extends TrustTokenParamsRefreshPolicy
  
  @js.native
  sealed trait UserPreferences
    extends CookieBlockedReason
       with SetCookieBlockedReason
  
  @js.native
  sealed trait VeryHigh extends ResourcePriority
  
  @js.native
  sealed trait VeryLow extends ResourcePriority
  
  @js.native
  sealed trait Video extends MixedContentResourceType
  
  @js.native
  sealed trait WarnSameSiteLaxCrossDowngradeLax extends SameSiteCookieWarningReason
  
  @js.native
  sealed trait WarnSameSiteLaxCrossDowngradeStrict extends SameSiteCookieWarningReason
  
  @js.native
  sealed trait WarnSameSiteNoneInsecure extends SameSiteCookieWarningReason
  
  @js.native
  sealed trait WarnSameSiteStrictCrossDowngradeLax extends SameSiteCookieWarningReason
  
  @js.native
  sealed trait WarnSameSiteStrictCrossDowngradeStrict extends SameSiteCookieWarningReason
  
  @js.native
  sealed trait WarnSameSiteStrictLaxDowngradeStrict extends SameSiteCookieWarningReason
  
  @js.native
  sealed trait WarnSameSiteUnspecifiedCrossSiteContext extends SameSiteCookieWarningReason
  
  @js.native
  sealed trait WarnSameSiteUnspecifiedLaxAllowUnsafe extends SameSiteCookieWarningReason
  
  @js.native
  sealed trait WebAnimation extends AnimationType
  
  @js.native
  sealed trait WebAssembly extends ScriptLanguage
  
  @js.native
  sealed trait WebSocket extends ResourceType
  
  @js.native
  sealed trait WheelEventHandler extends ScrollRectType
  
  @js.native
  sealed trait Worker extends MixedContentResourceType
  
  @js.native
  sealed trait XHR
    extends PausedEventReason
       with ResourceType
  
  @js.native
  sealed trait XMLHttpRequest extends MixedContentResourceType
  
  @js.native
  sealed trait XSLT extends MixedContentResourceType
  
  @js.native
  sealed trait `a-rate` extends AutomationRate
  
  @js.native
  sealed trait accepted extends js.Object
  
  @js.native
  sealed trait accessibilityEvents extends PermissionType
  
  @js.native
  sealed trait accessor extends PropertyPreviewType
  
  @js.native
  sealed trait achromatopsia extends SetEmulatedVisionDeficiencyRequestType
  
  @js.native
  sealed trait activated extends ServiceWorkerVersionStatus
  
  @js.native
  sealed trait activating extends ServiceWorkerVersionStatus
  
  @js.native
  sealed trait active extends SetWebLifecycleStateRequestState
  
  @js.native
  sealed trait activedescendant extends AXPropertyName
  
  @js.native
  sealed trait addDatabase extends js.Object
  
  @js.native
  sealed trait addHeapSnapshotChunk extends js.Object
  
  @js.native
  sealed trait address_bar extends TransitionType
  
  @js.native
  sealed trait advance extends VirtualTimePolicy
  
  @js.native
  sealed trait after extends PseudoType
  
  @js.native
  sealed trait alert extends DialogType
  
  @js.native
  sealed trait all
    extends SetPauseOnExceptionsRequestState
       with StorageType
  
  @js.native
  sealed trait allow
    extends SetDownloadBehaviorRequestBehavior
       with typings.devtoolsProtocol.mod.Protocol.Browser.SetDownloadBehaviorRequestBehavior
  
  @js.native
  sealed trait allowAndName
    extends typings.devtoolsProtocol.mod.Protocol.Browser.SetDownloadBehaviorRequestBehavior
  
  @js.native
  sealed trait ambiguous extends PausedEventReason
  
  @js.native
  sealed trait anchorClick extends ClientNavigationReason
  
  @js.native
  sealed trait animationCanceled extends js.Object
  
  @js.native
  sealed trait animationCreated extends js.Object
  
  @js.native
  sealed trait animationStarted extends js.Object
  
  @js.native
  sealed trait any extends ContinueToLocationRequestTargetCallFrames
  
  @js.native
  sealed trait appcache
    extends ConsoleMessageSource
       with LogEntrySource
       with StorageType
  
  @js.native
  sealed trait applicationCacheStatusUpdated extends js.Object
  
  @js.native
  sealed trait array
    extends KeyPathType
       with KeyType
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  
  @js.native
  sealed trait arraybuffer extends RemoteObjectSubtype
  
  @js.native
  sealed trait assert
    extends ConsoleAPICalledEventType
       with PausedEventReason
  
  @js.native
  sealed trait atomic extends AXPropertyName
  
  @js.native
  sealed trait attachedToTarget extends js.Object
  
  @js.native
  sealed trait attribute extends AXValueSourceType
  
  @js.native
  sealed trait `attribute-modified` extends DOMBreakpointType
  
  @js.native
  sealed trait attributeModified extends js.Object
  
  @js.native
  sealed trait attributeRemoved extends js.Object
  
  @js.native
  sealed trait audioCapture extends PermissionType
  
  @js.native
  sealed trait audioListenerCreated extends js.Object
  
  @js.native
  sealed trait audioListenerWillBeDestroyed extends js.Object
  
  @js.native
  sealed trait audioNodeCreated extends js.Object
  
  @js.native
  sealed trait audioNodeWillBeDestroyed extends js.Object
  
  @js.native
  sealed trait audioParamCreated extends js.Object
  
  @js.native
  sealed trait audioParamWillBeDestroyed extends js.Object
  
  @js.native
  sealed trait authRequired extends js.Object
  
  @js.native
  sealed trait auto_bookmark extends TransitionType
  
  @js.native
  sealed trait auto_subframe extends TransitionType
  
  @js.native
  sealed trait auto_toplevel extends TransitionType
  
  @js.native
  sealed trait autocomplete extends AXPropertyName
  
  @js.native
  sealed trait back extends MouseButton
  
  @js.native
  sealed trait backdrop extends PseudoType
  
  @js.native
  sealed trait backgroundFetch
    extends PermissionType
       with ServiceName
  
  @js.native
  sealed trait backgroundServiceEventReceived extends js.Object
  
  @js.native
  sealed trait backgroundSync
    extends PermissionType
       with ServiceName
  
  @js.native
  sealed trait badReputation extends SafetyTipStatus
  
  @js.native
  sealed trait basic extends CachedResponseType
  
  @js.native
  sealed trait before extends PseudoType
  
  @js.native
  sealed trait beforeScriptExecution extends SetInstrumentationBreakpointRequestInstrumentation
  
  @js.native
  sealed trait beforeScriptWithSourceMapExecution extends SetInstrumentationBreakpointRequestInstrumentation
  
  @js.native
  sealed trait beforeunload extends DialogType
  
  @js.native
  sealed trait bigint
    extends ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
  
  @js.native
  sealed trait bindingCalled extends js.Object
  
  @js.native
  sealed trait ble extends AuthenticatorTransport
  
  @js.native
  sealed trait block extends ScopeType
  
  @js.native
  sealed trait blockable extends MixedContentType
  
  @js.native
  sealed trait blockedEvent extends ViolationSettingName
  
  @js.native
  sealed trait blockedParser extends ViolationSettingName
  
  @js.native
  sealed trait bluetooth extends ConnectionType
  
  @js.native
  sealed trait blurredVision extends SetEmulatedVisionDeficiencyRequestType
  
  @js.native
  sealed trait boolean
    extends AXValueType
       with ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
  
  @js.native
  sealed trait booleanOrUndefined extends AXValueType
  
  @js.native
  sealed trait breakpointResolved extends js.Object
  
  @js.native
  sealed trait bufferUsage extends js.Object
  
  @js.native
  sealed trait busy extends AXPropertyName
  
  @js.native
  sealed trait cable extends AuthenticatorTransport
  
  @js.native
  sealed trait `cache-storage` extends ServiceWorkerResponseSource
  
  @js.native
  sealed trait cacheStorageContentUpdated extends js.Object
  
  @js.native
  sealed trait cacheStorageListUpdated extends js.Object
  
  @js.native
  sealed trait cache_storage extends StorageType
  
  @js.native
  sealed trait call extends BreakLocationType
  
  @js.native
  sealed trait cancel extends CertificateErrorAction
  
  @js.native
  sealed trait canceled extends DownloadProgressEventState
  
  @js.native
  sealed trait captureAreaScreenshot extends InspectMode
  
  @js.native
  sealed trait `catch` extends ScopeType
  
  @js.native
  sealed trait cellular2g extends ConnectionType
  
  @js.native
  sealed trait cellular3g extends ConnectionType
  
  @js.native
  sealed trait cellular4g extends ConnectionType
  
  @js.native
  sealed trait certificateError extends js.Object
  
  @js.native
  sealed trait char extends DispatchKeyEventRequestType
  
  @js.native
  sealed trait characterDataModified extends js.Object
  
  @js.native
  sealed trait checked extends AXPropertyName
  
  @js.native
  sealed trait child extends AdFrameType
  
  @js.native
  sealed trait childNodeCountUpdated extends js.Object
  
  @js.native
  sealed trait childNodeInserted extends js.Object
  
  @js.native
  sealed trait childNodeRemoved extends js.Object
  
  @js.native
  sealed trait `clamped-max` extends ChannelCountMode
  
  @js.native
  sealed trait clear extends ConsoleAPICalledEventType
  
  @js.native
  sealed trait clipboardReadWrite extends PermissionType
  
  @js.native
  sealed trait clipboardSanitizedWrite extends PermissionType
  
  @js.native
  sealed trait closed
    extends ContextState
       with ShadowRootType
  
  @js.native
  sealed trait closure extends ScopeType
  
  @js.native
  sealed trait `coep-frame-resource-needs-coep-header` extends BlockedReason
  
  @js.native
  sealed trait `collapsed-by-client` extends BlockedReason
  
  @js.native
  sealed trait compilationCacheProduced extends js.Object
  
  @js.native
  sealed trait completed extends DownloadProgressEventState
  
  @js.native
  sealed trait compliant extends CertificateTransparencyCompliance
  
  @js.native
  sealed trait computedString extends AXValueType
  
  @js.native
  sealed trait confirm extends DialogType
  
  @js.native
  sealed trait `console-api` extends ConsoleMessageSource
  
  @js.native
  sealed trait consoleAPICalled extends js.Object
  
  @js.native
  sealed trait consoleProfileFinished extends js.Object
  
  @js.native
  sealed trait consoleProfileStarted extends js.Object
  
  @js.native
  sealed trait `content-type` extends BlockedReason
  
  @js.native
  sealed trait contents extends AXValueSourceType
  
  @js.native
  sealed trait contextChanged extends js.Object
  
  @js.native
  sealed trait contextCreated extends js.Object
  
  @js.native
  sealed trait contextWillBeDestroyed extends js.Object
  
  @js.native
  sealed trait continue extends CertificateErrorAction
  
  @js.native
  sealed trait controls extends AXPropertyName
  
  @js.native
  sealed trait cookies extends StorageType
  
  @js.native
  sealed trait `coop-sandboxed-iframe-cannot-navigate-to-coop-page` extends BlockedReason
  
  @js.native
  sealed trait `corp-not-same-origin` extends BlockedReason
  
  @js.native
  sealed trait `corp-not-same-origin-after-defaulted-to-same-origin-by-coep` extends BlockedReason
  
  @js.native
  sealed trait `corp-not-same-site` extends BlockedReason
  
  @js.native
  sealed trait cors extends CachedResponseType
  
  @js.native
  sealed trait count extends ConsoleAPICalledEventType
  
  @js.native
  sealed trait critical extends PressureLevel
  
  @js.native
  sealed trait csp extends BlockedReason
  
  @js.native
  sealed trait ctap2 extends AuthenticatorProtocol
  
  @js.native
  sealed trait current extends ContinueToLocationRequestTargetCallFrames
  
  @js.native
  sealed trait currentTab extends ClientNavigationDisposition
  
  @js.native
  sealed trait dataCollected extends js.Object
  
  @js.native
  sealed trait dataReceived extends js.Object
  
  @js.native
  sealed trait dataview extends RemoteObjectSubtype
  
  @js.native
  sealed trait date
    extends KeyType
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  
  @js.native
  sealed trait debug
    extends ConsoleAPICalledEventType
       with ConsoleMessageLevel
       with PlayerMessageLevel
  
  @js.native
  sealed trait debugCommand extends PausedEventReason
  
  @js.native
  sealed trait debuggerStatement extends BreakLocationType
  
  @js.native
  sealed trait default_
    extends CachedResponseType
       with GestureSourceType
       with SetDownloadBehaviorRequestBehavior
       with typings.devtoolsProtocol.mod.Protocol.Browser.SetDownloadBehaviorRequestBehavior
  
  @js.native
  sealed trait denied extends PermissionSetting
  
  @js.native
  sealed trait deny
    extends SetDownloadBehaviorRequestBehavior
       with typings.devtoolsProtocol.mod.Protocol.Browser.SetDownloadBehaviorRequestBehavior
  
  @js.native
  sealed trait deprecation
    extends ConsoleMessageSource
       with LogEntrySource
  
  @js.native
  sealed trait describedby extends AXPropertyName
  
  @js.native
  sealed trait desktop
    extends SetEmitTouchEventsForMouseRequestConfiguration
       with SetTouchEmulationEnabledRequestConfiguration
  
  @js.native
  sealed trait detached extends js.Object
  
  @js.native
  sealed trait detachedFromTarget extends js.Object
  
  @js.native
  sealed trait details extends AXPropertyName
  
  @js.native
  sealed trait deuteranopia extends SetEmulatedVisionDeficiencyRequestType
  
  @js.native
  sealed trait dir extends ConsoleAPICalledEventType
  
  @js.native
  sealed trait dirxml extends ConsoleAPICalledEventType
  
  @js.native
  sealed trait disabled extends AXPropertyName
  
  @js.native
  sealed trait discouragedAPIUse extends ViolationSettingName
  
  @js.native
  sealed trait discrete extends ChannelInterpretation
  
  @js.native
  sealed trait distributedNodesUpdated extends js.Object
  
  @js.native
  sealed trait documentUpdated extends js.Object
  
  @js.native
  sealed trait domContentEventFired extends js.Object
  
  @js.native
  sealed trait domRelation extends AXValueType
  
  @js.native
  sealed trait domStorageItemAdded extends js.Object
  
  @js.native
  sealed trait domStorageItemRemoved extends js.Object
  
  @js.native
  sealed trait domStorageItemUpdated extends js.Object
  
  @js.native
  sealed trait domStorageItemsCleared extends js.Object
  
  @js.native
  sealed trait downloadProgress extends js.Object
  
  @js.native
  sealed trait downloadWillBegin extends js.Object
  
  @js.native
  sealed trait download_ extends ClientNavigationDisposition
  
  @js.native
  sealed trait durableStorage extends PermissionType
  
  @js.native
  sealed trait echoToConsole extends TraceConfigRecordMode
  
  @js.native
  sealed trait editable extends AXPropertyName
  
  @js.native
  sealed trait endGroup extends ConsoleAPICalledEventType
  
  @js.native
  sealed trait entryAdded extends js.Object
  
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
  
  @js.native
  sealed trait errormessage extends AXPropertyName
  
  @js.native
  sealed trait ethernet extends ConnectionType
  
  @js.native
  sealed trait eval extends ScopeType
  
  @js.native
  sealed trait eventSourceMessageReceived extends js.Object
  
  @js.native
  sealed trait exception extends PausedEventReason
  
  @js.native
  sealed trait exceptionRevoked extends js.Object
  
  @js.native
  sealed trait exceptionThrown extends js.Object
  
  @js.native
  sealed trait executionContextCreated extends js.Object
  
  @js.native
  sealed trait executionContextDestroyed extends js.Object
  
  @js.native
  sealed trait executionContextsCleared extends js.Object
  
  @js.native
  sealed trait expanded extends AXPropertyName
  
  @js.native
  sealed trait explicit extends ChannelCountMode
  
  @js.native
  sealed trait externref extends RemoteObjectSubtype
  
  @js.native
  sealed trait f32 extends RemoteObjectSubtype
  
  @js.native
  sealed trait f64 extends RemoteObjectSubtype
  
  @js.native
  sealed trait `fallback-code` extends ServiceWorkerResponseSource
  
  @js.native
  sealed trait figcaption extends AXValueNativeSourceType
  
  @js.native
  sealed trait fileChooserOpened extends js.Object
  
  @js.native
  sealed trait file_systems extends StorageType
  
  @js.native
  sealed trait `first-letter` extends PseudoType
  
  @js.native
  sealed trait `first-line` extends PseudoType
  
  @js.native
  sealed trait `first-line-inherited` extends PseudoType
  
  @js.native
  sealed trait flash extends PermissionType
  
  @js.native
  sealed trait flowto extends AXPropertyName
  
  @js.native
  sealed trait focusable extends AXPropertyName
  
  @js.native
  sealed trait focused extends AXPropertyName
  
  @js.native
  sealed trait fontsUpdated extends js.Object
  
  @js.native
  sealed trait formSubmissionGet extends ClientNavigationReason
  
  @js.native
  sealed trait formSubmissionPost extends ClientNavigationReason
  
  @js.native
  sealed trait form_submit extends TransitionType
  
  @js.native
  sealed trait forward extends MouseButton
  
  @js.native
  sealed trait frameAttached extends js.Object
  
  @js.native
  sealed trait frameClearedScheduledNavigation extends js.Object
  
  @js.native
  sealed trait frameDetached extends js.Object
  
  @js.native
  sealed trait frameNavigated extends js.Object
  
  @js.native
  sealed trait frameRequestedNavigation extends js.Object
  
  @js.native
  sealed trait frameResized extends js.Object
  
  @js.native
  sealed trait frameScheduledNavigation extends js.Object
  
  @js.native
  sealed trait frameStartedLoading extends js.Object
  
  @js.native
  sealed trait frameStoppedLoading extends js.Object
  
  @js.native
  sealed trait frozen extends SetWebLifecycleStateRequestState
  
  @js.native
  sealed trait fullscreen extends WindowState
  
  @js.native
  sealed trait function
    extends ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
  
  @js.native
  sealed trait generated extends TransitionType
  
  @js.native
  sealed trait generator
    extends ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  
  @js.native
  sealed trait geolocation extends PermissionType
  
  @js.native
  sealed trait global extends ScopeType
  
  @js.native
  sealed trait granted extends PermissionSetting
  
  @js.native
  sealed trait gzip extends StreamCompression
  
  @js.native
  sealed trait handler extends ViolationSettingName
  
  @js.native
  sealed trait hasPopup extends AXPropertyName
  
  @js.native
  sealed trait heapStatsUpdate extends js.Object
  
  @js.native
  sealed trait hex extends ColorFormat
  
  @js.native
  sealed trait hidden extends AXPropertyName
  
  @js.native
  sealed trait hiddenRoot extends AXPropertyName
  
  @js.native
  sealed trait horizontal extends DisplayFeatureOrientation
  
  @js.native
  sealed trait hsl extends ColorFormat
  
  @js.native
  sealed trait `http-cache` extends ServiceWorkerResponseSource
  
  @js.native
  sealed trait httpHeaderRefresh extends ClientNavigationReason
  
  @js.native
  sealed trait i32 extends RemoteObjectSubtype
  
  @js.native
  sealed trait i64 extends RemoteObjectSubtype
  
  @js.native
  sealed trait idleDetection extends PermissionType
  
  @js.native
  sealed trait idref extends AXValueType
  
  @js.native
  sealed trait idrefList extends AXValueType
  
  @js.native
  sealed trait `implicit` extends AXValueSourceType
  
  @js.native
  sealed trait importRule extends CSSMediaSource
  
  @js.native
  sealed trait inProgress extends DownloadProgressEventState
  
  @js.native
  sealed trait indexedDBContentUpdated extends js.Object
  
  @js.native
  sealed trait indexedDBListUpdated extends js.Object
  
  @js.native
  sealed trait indexeddb extends StorageType
  
  @js.native
  sealed trait info
    extends ConsoleAPICalledEventType
       with ConsoleMessageLevel
       with LogEntryLevel
       with PlayerMessageLevel
       with SecurityState
  
  @js.native
  sealed trait injected extends StyleSheetOrigin
  
  @js.native
  sealed trait inlineSheet extends CSSMediaSource
  
  @js.native
  sealed trait inlineStyleInvalidated extends js.Object
  
  @js.native
  sealed trait `input-list-button` extends PseudoType
  
  @js.native
  sealed trait insecure extends SecurityState
  
  @js.native
  sealed trait `insecure-broken` extends SecurityState
  
  @js.native
  sealed trait inspectModeCanceled extends js.Object
  
  @js.native
  sealed trait inspectNodeRequested extends js.Object
  
  @js.native
  sealed trait inspectRequested extends js.Object
  
  @js.native
  sealed trait inspector
    extends BlockedReason
       with StyleSheetOrigin
  
  @js.native
  sealed trait installed extends ServiceWorkerVersionStatus
  
  @js.native
  sealed trait installing extends ServiceWorkerVersionStatus
  
  @js.native
  sealed trait instrumentation extends PausedEventReason
  
  @js.native
  sealed trait integer extends AXValueType
  
  @js.native
  sealed trait internal extends AuthenticatorTransport
  
  @js.native
  sealed trait internalRole extends AXValueType
  
  @js.native
  sealed trait interstitialHidden extends js.Object
  
  @js.native
  sealed trait interstitialShown extends js.Object
  
  @js.native
  sealed trait intervention extends LogEntrySource
  
  @js.native
  sealed trait invalid extends AXPropertyName
  
  @js.native
  sealed trait issueAdded extends js.Object
  
  @js.native
  sealed trait issueUpdated extends js.Object
  
  @js.native
  sealed trait iterator
    extends ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  
  @js.native
  sealed trait javascriptDialogClosed extends js.Object
  
  @js.native
  sealed trait javascriptDialogOpening extends js.Object
  
  @js.native
  sealed trait javascript_
    extends ConsoleMessageSource
       with LogEntrySource
  
  @js.native
  sealed trait jpeg
    extends CaptureScreenshotRequestFormat
       with GetEncodedResponseRequestEncoding
       with ImageType
       with ScreenshotParamsFormat
       with StartScreencastRequestFormat
  
  @js.native
  sealed trait json extends StreamFormat
  
  @js.native
  sealed trait `k-rate` extends AutomationRate
  
  @js.native
  sealed trait kEvalViolation extends ContentSecurityPolicyViolationType
  
  @js.native
  sealed trait kInlineViolation extends ContentSecurityPolicyViolationType
  
  @js.native
  sealed trait kTrustedTypesPolicyViolation extends ContentSecurityPolicyViolationType
  
  @js.native
  sealed trait kTrustedTypesSinkViolation extends ContentSecurityPolicyViolationType
  
  @js.native
  sealed trait kURLViolation extends ContentSecurityPolicyViolationType
  
  @js.native
  sealed trait keyDown extends DispatchKeyEventRequestType
  
  @js.native
  sealed trait keyUp extends DispatchKeyEventRequestType
  
  @js.native
  sealed trait keyshortcuts extends AXPropertyName
  
  @js.native
  sealed trait keyword extends TransitionType
  
  @js.native
  sealed trait keyword_generated extends TransitionType
  
  @js.native
  sealed trait label extends AXValueNativeSourceType
  
  @js.native
  sealed trait labelfor extends AXValueNativeSourceType
  
  @js.native
  sealed trait labelledby extends AXPropertyName
  
  @js.native
  sealed trait labelwrapped extends AXValueNativeSourceType
  
  @js.native
  sealed trait landscapePrimary extends ScreenOrientationType
  
  @js.native
  sealed trait landscapeSecondary extends ScreenOrientationType
  
  @js.native
  sealed trait lastSeenObjectId extends js.Object
  
  @js.native
  sealed trait layerPainted extends js.Object
  
  @js.native
  sealed trait layerTreeDidChange extends js.Object
  
  @js.native
  sealed trait left extends MouseButton
  
  @js.native
  sealed trait legend extends AXValueNativeSourceType
  
  @js.native
  sealed trait level extends AXPropertyName
  
  @js.native
  sealed trait lifecycleEvent extends js.Object
  
  @js.native
  sealed trait link extends TransitionType
  
  @js.native
  sealed trait linkedSheet extends CSSMediaSource
  
  @js.native
  sealed trait live extends AXPropertyName
  
  @js.native
  sealed trait loadEventFired extends js.Object
  
  @js.native
  sealed trait loadingFailed extends js.Object
  
  @js.native
  sealed trait loadingFinished extends js.Object
  
  @js.native
  sealed trait local extends ScopeType
  
  @js.native
  sealed trait local_storage extends StorageType
  
  @js.native
  sealed trait log
    extends ConsoleAPICalledEventType
       with ConsoleMessageLevel
  
  @js.native
  sealed trait longLayout extends ViolationSettingName
  
  @js.native
  sealed trait longTask extends ViolationSettingName
  
  @js.native
  sealed trait lookalike extends SafetyTipStatus
  
  @js.native
  sealed trait manual_subframe extends TransitionType
  
  @js.native
  sealed trait map
    extends ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  
  @js.native
  sealed trait marker extends PseudoType
  
  @js.native
  sealed trait max extends ChannelCountMode
  
  @js.native
  sealed trait maximized extends WindowState
  
  @js.native
  sealed trait mediaQueryResultChanged extends js.Object
  
  @js.native
  sealed trait mediaRule extends CSSMediaSource
  
  @js.native
  sealed trait media_error extends PlayerErrorType
  
  @js.native
  sealed trait messageAdded extends js.Object
  
  @js.native
  sealed trait metaTagRefresh extends ClientNavigationReason
  
  @js.native
  sealed trait metrics extends js.Object
  
  @js.native
  sealed trait mhtml extends js.Object
  
  @js.native
  sealed trait middle extends MouseButton
  
  @js.native
  sealed trait midi extends PermissionType
  
  @js.native
  sealed trait midiSysex extends PermissionType
  
  @js.native
  sealed trait minimized extends WindowState
  
  @js.native
  sealed trait `mixed-content` extends BlockedReason
  
  @js.native
  sealed trait mobile
    extends SetEmitTouchEventsForMouseRequestConfiguration
       with SetTouchEmulationEnabledRequestConfiguration
  
  @js.native
  sealed trait modal extends AXPropertyName
  
  @js.native
  sealed trait moderate extends PressureLevel
  
  @js.native
  sealed trait module extends ScopeType
  
  @js.native
  sealed trait mouse
    extends DispatchMouseEventRequestPointerType
       with GestureSourceType
  
  @js.native
  sealed trait mouseMoved
    extends DispatchMouseEventRequestType
       with EmulateTouchFromMouseEventRequestType
  
  @js.native
  sealed trait mousePressed
    extends DispatchMouseEventRequestType
       with EmulateTouchFromMouseEventRequestType
  
  @js.native
  sealed trait mouseReleased
    extends DispatchMouseEventRequestType
       with EmulateTouchFromMouseEventRequestType
  
  @js.native
  sealed trait mouseWheel
    extends DispatchMouseEventRequestType
       with EmulateTouchFromMouseEventRequestType
  
  @js.native
  sealed trait multiline extends AXPropertyName
  
  @js.native
  sealed trait multiselectable extends AXPropertyName
  
  @js.native
  sealed trait navigatedWithinDocument extends js.Object
  
  @js.native
  sealed trait needsBeginFramesChanged extends js.Object
  
  @js.native
  sealed trait network
    extends ConsoleMessageSource
       with LogEntrySource
       with ServiceWorkerResponseSource
  
  @js.native
  sealed trait networkStateUpdated extends js.Object
  
  @js.native
  sealed trait neutral extends SecurityState
  
  @js.native
  sealed trait `new` extends ServiceWorkerVersionStatus
  
  @js.native
  sealed trait newTab extends ClientNavigationDisposition
  
  @js.native
  sealed trait newWindow extends ClientNavigationDisposition
  
  @js.native
  sealed trait nfc
    extends AuthenticatorTransport
       with PermissionType
  
  @js.native
  sealed trait `no-referrer` extends RequestReferrerPolicy
  
  @js.native
  sealed trait `no-referrer-when-downgrade` extends RequestReferrerPolicy
  
  @js.native
  sealed trait noReferrer extends ReferrerPolicy
  
  @js.native
  sealed trait noReferrerWhenDowngrade extends ReferrerPolicy
  
  @js.native
  sealed trait node
    extends AXValueType
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  
  @js.native
  sealed trait `node-removed` extends DOMBreakpointType
  
  @js.native
  sealed trait nodeHighlightRequested extends js.Object
  
  @js.native
  sealed trait nodeList extends AXValueType
  
  @js.native
  sealed trait nodeParamConnected extends js.Object
  
  @js.native
  sealed trait nodeParamDisconnected extends js.Object
  
  @js.native
  sealed trait nodesConnected extends js.Object
  
  @js.native
  sealed trait nodesDisconnected extends js.Object
  
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
  
  @js.native
  sealed trait normal extends WindowState
  
  @js.native
  sealed trait `not-compliant` extends CertificateTransparencyCompliance
  
  @js.native
  sealed trait notifications
    extends PermissionType
       with ServiceName
  
  @js.native
  sealed trait `null`
    extends KeyPathType
       with ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  
  @js.native
  sealed trait number
    extends AXValueType
       with KeyType
       with ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
  
  @js.native
  sealed trait `object`
    extends ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
  
  @js.native
  sealed trait offline extends ContextType
  
  @js.native
  sealed trait opaqueRedirect extends CachedResponseType
  
  @js.native
  sealed trait opaqueResponse extends CachedResponseType
  
  @js.native
  sealed trait open extends ShadowRootType
  
  @js.native
  sealed trait `optionally-blockable` extends MixedContentType
  
  @js.native
  sealed trait orientation extends AXPropertyName
  
  @js.native
  sealed trait origin
    extends BlockedReason
       with ReferrerPolicy
       with RequestReferrerPolicy
  
  @js.native
  sealed trait `origin-when-cross-origin` extends RequestReferrerPolicy
  
  @js.native
  sealed trait originWhenCrossOrigin extends ReferrerPolicy
  
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
  
  @js.native
  sealed trait owns extends AXPropertyName
  
  @js.native
  sealed trait pageBlockInterstitial extends ClientNavigationReason
  
  @js.native
  sealed trait parser extends InitiatorType
  
  @js.native
  sealed trait pause extends VirtualTimePolicy
  
  @js.native
  sealed trait pauseIfNetworkFetchesPending extends VirtualTimePolicy
  
  @js.native
  sealed trait paused extends js.Object
  
  @js.native
  sealed trait paymentHandler
    extends PermissionType
       with ServiceName
  
  @js.native
  sealed trait pen extends DispatchMouseEventRequestPointerType
  
  @js.native
  sealed trait periodicBackgroundSync
    extends PermissionType
       with ServiceName
  
  @js.native
  sealed trait pipeline_error extends PlayerErrorType
  
  @js.native
  sealed trait placeholder extends AXValueSourceType
  
  @js.native
  sealed trait playerErrorsRaised extends js.Object
  
  @js.native
  sealed trait playerEventsAdded extends js.Object
  
  @js.native
  sealed trait playerMessagesLogged extends js.Object
  
  @js.native
  sealed trait playerPropertiesChanged extends js.Object
  
  @js.native
  sealed trait playersCreated extends js.Object
  
  @js.native
  sealed trait png
    extends CaptureScreenshotRequestFormat
       with GetEncodedResponseRequestEncoding
       with ScreenshotParamsFormat
       with StartScreencastRequestFormat
  
  @js.native
  sealed trait portraitPrimary extends ScreenOrientationType
  
  @js.native
  sealed trait portraitSecondary extends ScreenOrientationType
  
  @js.native
  sealed trait preciseCoverageDeltaUpdate extends js.Object
  
  @js.native
  sealed trait preload extends InitiatorType
  
  @js.native
  sealed trait pressed extends AXPropertyName
  
  @js.native
  sealed trait profile extends ConsoleAPICalledEventType
  
  @js.native
  sealed trait profileEnd extends ConsoleAPICalledEventType
  
  @js.native
  sealed trait promise extends RemoteObjectSubtype
  
  @js.native
  sealed trait promiseRejection extends PausedEventReason
  
  @js.native
  sealed trait prompt
    extends DialogType
       with PermissionSetting
  
  @js.native
  sealed trait protanopia extends SetEmulatedVisionDeficiencyRequestType
  
  @js.native
  sealed trait protectedMediaIdentifier extends PermissionType
  
  @js.native
  sealed trait proto extends StreamFormat
  
  @js.native
  sealed trait proxy_ extends RemoteObjectSubtype
  
  @js.native
  sealed trait pseudoElementAdded extends js.Object
  
  @js.native
  sealed trait pseudoElementRemoved extends js.Object
  
  @js.native
  sealed trait pushMessaging extends ServiceName
  
  @js.native
  sealed trait rawKeyDown extends DispatchKeyEventRequestType
  
  @js.native
  sealed trait readonly extends AXPropertyName
  
  @js.native
  sealed trait realtime extends ContextType
  
  @js.native
  sealed trait receivedMessageFromTarget extends js.Object
  
  @js.native
  sealed trait recommendation extends LogEntrySource
  
  @js.native
  sealed trait recordAsMuchAsPossible extends TraceConfigRecordMode
  
  @js.native
  sealed trait recordContinuously extends TraceConfigRecordMode
  
  @js.native
  sealed trait recordUntilFull extends TraceConfigRecordMode
  
  @js.native
  sealed trait recordingStateChanged extends js.Object
  
  @js.native
  sealed trait recurringHandler extends ViolationSettingName
  
  @js.native
  sealed trait redundant extends ServiceWorkerVersionStatus
  
  @js.native
  sealed trait regexp
    extends ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  
  @js.native
  sealed trait regular extends StyleSheetOrigin
  
  @js.native
  sealed trait relatedElement extends AXValueSourceType
  
  @js.native
  sealed trait relevant extends AXPropertyName
  
  @js.native
  sealed trait reload
    extends ClientNavigationReason
       with TransitionType
  
  @js.native
  sealed trait rendering
    extends ConsoleMessageSource
       with LogEntrySource
  
  @js.native
  sealed trait reportHeapSnapshotProgress extends js.Object
  
  @js.native
  sealed trait requestIntercepted extends js.Object
  
  @js.native
  sealed trait requestPaused extends js.Object
  
  @js.native
  sealed trait requestServedFromCache extends js.Object
  
  @js.native
  sealed trait requestWillBeSent extends js.Object
  
  @js.native
  sealed trait requestWillBeSentExtraInfo extends js.Object
  
  @js.native
  sealed trait required extends AXPropertyName
  
  @js.native
  sealed trait resetProfiles extends js.Object
  
  @js.native
  sealed trait resizer extends PseudoType
  
  @js.native
  sealed trait resourceChangedPriority extends js.Object
  
  @js.native
  sealed trait responseReceived extends js.Object
  
  @js.native
  sealed trait responseReceivedExtraInfo extends js.Object
  
  @js.native
  sealed trait resumed extends js.Object
  
  @js.native
  sealed trait `return` extends BreakLocationType
  
  @js.native
  sealed trait rgb extends ColorFormat
  
  @js.native
  sealed trait right extends MouseButton
  
  @js.native
  sealed trait role extends AXValueType
  
  @js.native
  sealed trait roledescription extends AXPropertyName
  
  @js.native
  sealed trait root
    extends AXPropertyName
       with AdFrameType
  
  @js.native
  sealed trait running
    extends ContextState
       with ServiceWorkerVersionRunningStatus
  
  @js.native
  sealed trait `same-origin` extends RequestReferrerPolicy
  
  @js.native
  sealed trait sameOrigin_ extends ReferrerPolicy
  
  @js.native
  sealed trait screencastFrame extends js.Object
  
  @js.native
  sealed trait screencastVisibilityChanged extends js.Object
  
  @js.native
  sealed trait screenshotRequested extends js.Object
  
  @js.native
  sealed trait scriptFailedToParse extends js.Object
  
  @js.native
  sealed trait scriptInitiated extends ClientNavigationReason
  
  @js.native
  sealed trait scriptParsed extends js.Object
  
  @js.native
  sealed trait script_
    extends InitiatorType
       with ScopeType
  
  @js.native
  sealed trait scrollbar extends PseudoType
  
  @js.native
  sealed trait `scrollbar-button` extends PseudoType
  
  @js.native
  sealed trait `scrollbar-corner` extends PseudoType
  
  @js.native
  sealed trait `scrollbar-thumb` extends PseudoType
  
  @js.native
  sealed trait `scrollbar-track` extends PseudoType
  
  @js.native
  sealed trait `scrollbar-track-piece` extends PseudoType
  
  @js.native
  sealed trait searchForNode extends InspectMode
  
  @js.native
  sealed trait searchForUAShadowDOM extends InspectMode
  
  @js.native
  sealed trait secure_ extends SecurityState
  
  @js.native
  sealed trait security
    extends ConsoleMessageSource
       with LogEntrySource
  
  @js.native
  sealed trait securityStateChanged extends js.Object
  
  @js.native
  sealed trait selectMultiple extends FileChooserOpenedEventMode
  
  @js.native
  sealed trait selectSingle extends FileChooserOpenedEventMode
  
  @js.native
  sealed trait selected extends AXPropertyName
  
  @js.native
  sealed trait selection extends PseudoType
  
  @js.native
  sealed trait sensors extends PermissionType
  
  @js.native
  sealed trait service_workers extends StorageType
  
  @js.native
  sealed trait set
    extends ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  
  @js.native
  sealed trait setChildNodes extends js.Object
  
  @js.native
  sealed trait settable extends AXPropertyName
  
  @js.native
  sealed trait shader_cache extends StorageType
  
  @js.native
  sealed trait shadowRootPopped extends js.Object
  
  @js.native
  sealed trait shadowRootPushed extends js.Object
  
  @js.native
  sealed trait showDistances extends InspectMode
  
  @js.native
  sealed trait signatureCertSha256 extends SignedExchangeErrorField
  
  @js.native
  sealed trait signatureCertUrl extends SignedExchangeErrorField
  
  @js.native
  sealed trait signatureIntegrity extends SignedExchangeErrorField
  
  @js.native
  sealed trait signatureSig extends SignedExchangeErrorField
  
  @js.native
  sealed trait signatureTimestamps extends SignedExchangeErrorField
  
  @js.native
  sealed trait signatureValidityUrl extends SignedExchangeErrorField
  
  @js.native
  sealed trait signedExchangeReceived extends js.Object
  
  @js.native
  sealed trait sinksUpdated extends js.Object
  
  @js.native
  sealed trait speakers extends ChannelInterpretation
  
  @js.native
  sealed trait startGroup extends ConsoleAPICalledEventType
  
  @js.native
  sealed trait startGroupCollapsed extends ConsoleAPICalledEventType
  
  @js.native
  sealed trait starting extends ServiceWorkerVersionRunningStatus
  
  @js.native
  sealed trait stopped extends ServiceWorkerVersionRunningStatus
  
  @js.native
  sealed trait stopping extends ServiceWorkerVersionRunningStatus
  
  @js.native
  sealed trait storage
    extends ConsoleMessageSource
       with LogEntrySource
  
  @js.native
  sealed trait `strict-origin` extends RequestReferrerPolicy
  
  @js.native
  sealed trait `strict-origin-when-cross-origin` extends RequestReferrerPolicy
  
  @js.native
  sealed trait strictOrigin extends ReferrerPolicy
  
  @js.native
  sealed trait strictOriginWhenCrossOrigin extends ReferrerPolicy
  
  @js.native
  sealed trait string
    extends AXValueType
       with KeyPathType
       with KeyType
       with ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
  
  @js.native
  sealed trait style extends AXValueSourceType
  
  @js.native
  sealed trait styleSheetAdded extends js.Object
  
  @js.native
  sealed trait styleSheetChanged extends js.Object
  
  @js.native
  sealed trait styleSheetRemoved extends js.Object
  
  @js.native
  sealed trait `subresource-filter` extends BlockedReason
  
  @js.native
  sealed trait `subtree-modified` extends DOMBreakpointType
  
  @js.native
  sealed trait suspended extends ContextState
  
  @js.native
  sealed trait symbol
    extends ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
  
  @js.native
  sealed trait table extends ConsoleAPICalledEventType
  
  @js.native
  sealed trait tablecaption extends AXValueNativeSourceType
  
  @js.native
  sealed trait targetCrashed extends js.Object
  
  @js.native
  sealed trait targetCreated extends js.Object
  
  @js.native
  sealed trait targetDestroyed extends js.Object
  
  @js.native
  sealed trait targetInfoChanged extends js.Object
  
  @js.native
  sealed trait targetReloadedAfterCrash extends js.Object
  
  @js.native
  sealed trait threadTicks
    extends EnableRequestTimeDomain
       with SetTimeDomainRequestTimeDomain
  
  @js.native
  sealed trait timeEnd extends ConsoleAPICalledEventType
  
  @js.native
  sealed trait timeTicks
    extends EnableRequestTimeDomain
       with SetTimeDomainRequestTimeDomain
  
  @js.native
  sealed trait title extends AXValueNativeSourceType
  
  @js.native
  sealed trait token extends AXValueType
  
  @js.native
  sealed trait tokenList extends AXValueType
  
  @js.native
  sealed trait touch extends GestureSourceType
  
  @js.native
  sealed trait touchCancel extends DispatchTouchEventRequestType
  
  @js.native
  sealed trait touchEnd extends DispatchTouchEventRequestType
  
  @js.native
  sealed trait touchMove extends DispatchTouchEventRequestType
  
  @js.native
  sealed trait touchStart extends DispatchTouchEventRequestType
  
  @js.native
  sealed trait trace extends ConsoleAPICalledEventType
  
  @js.native
  sealed trait tracingComplete extends js.Object
  
  @js.native
  sealed trait tristate extends AXValueType
  
  @js.native
  sealed trait tritanopia extends SetEmulatedVisionDeficiencyRequestType
  
  @js.native
  sealed trait typed extends TransitionType
  
  @js.native
  sealed trait typedarray extends RemoteObjectSubtype
  
  @js.native
  sealed trait u2f extends AuthenticatorProtocol
  
  @js.native
  sealed trait uncaught extends SetPauseOnExceptionsRequestState
  
  @js.native
  sealed trait undefined
    extends ObjectPreviewType
       with PropertyPreviewType
       with RemoteObjectType
  
  @js.native
  sealed trait unknown
    extends CertificateTransparencyCompliance
       with ImageType
       with SecurityState
  
  @js.native
  sealed trait `unsafe-url` extends RequestReferrerPolicy
  
  @js.native
  sealed trait unsafeUrl extends ReferrerPolicy
  
  @js.native
  sealed trait usb extends AuthenticatorTransport
  
  @js.native
  sealed trait `user-agent`
    extends ShadowRootType
       with StyleSheetOrigin
  
  @js.native
  sealed trait v128 extends RemoteObjectSubtype
  
  @js.native
  sealed trait valueUndefined extends AXValueType
  
  @js.native
  sealed trait valuemax extends AXPropertyName
  
  @js.native
  sealed trait valuemin extends AXPropertyName
  
  @js.native
  sealed trait valuetext extends AXPropertyName
  
  @js.native
  sealed trait verbose extends LogEntryLevel
  
  @js.native
  sealed trait vertical extends DisplayFeatureOrientation
  
  @js.native
  sealed trait videoCapture extends PermissionType
  
  @js.native
  sealed trait videoCapturePanTiltZoom extends PermissionType
  
  @js.native
  sealed trait violation extends LogEntrySource
  
  @js.native
  sealed trait virtualTimeBudgetExpired extends js.Object
  
  @js.native
  sealed trait visibleSecurityStateChanged extends js.Object
  
  @js.native
  sealed trait wakeLockScreen extends PermissionType
  
  @js.native
  sealed trait wakeLockSystem extends PermissionType
  
  @js.native
  sealed trait warning
    extends ConsoleAPICalledEventType
       with ConsoleMessageLevel
       with LogEntryLevel
       with PlayerMessageLevel
  
  @js.native
  sealed trait wasm extends RemoteObjectType
  
  @js.native
  sealed trait `wasm-expression-stack` extends ScopeType
  
  @js.native
  sealed trait weakmap
    extends ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  
  @js.native
  sealed trait weakset
    extends ObjectPreviewSubtype
       with PropertyPreviewSubtype
       with RemoteObjectSubtype
  
  @js.native
  sealed trait webSocketClosed extends js.Object
  
  @js.native
  sealed trait webSocketCreated extends js.Object
  
  @js.native
  sealed trait webSocketFrameError extends js.Object
  
  @js.native
  sealed trait webSocketFrameReceived extends js.Object
  
  @js.native
  sealed trait webSocketFrameSent extends js.Object
  
  @js.native
  sealed trait webSocketHandshakeResponseReceived extends js.Object
  
  @js.native
  sealed trait webSocketWillSendHandshakeRequest extends js.Object
  
  @js.native
  sealed trait webp
    extends GetEncodedResponseRequestEncoding
       with ImageType
  
  @js.native
  sealed trait websql extends StorageType
  
  @js.native
  sealed trait wifi extends ConnectionType
  
  @js.native
  sealed trait wimax extends ConnectionType
  
  @js.native
  sealed trait windowOpen extends js.Object
  
  @js.native
  sealed trait `with` extends ScopeType
  
  @js.native
  sealed trait workerErrorReported extends js.Object
  
  @js.native
  sealed trait workerRegistrationUpdated extends js.Object
  
  @js.native
  sealed trait workerVersionUpdated extends js.Object
  
  @js.native
  sealed trait worker_
    extends ConsoleMessageSource
       with LogEntrySource
  
  @js.native
  sealed trait xml
    extends ConsoleMessageSource
       with LogEntrySource
  
  @js.native
  sealed trait yuv420 extends SubsamplingFormat
  
  @js.native
  sealed trait yuv422 extends SubsamplingFormat
  
  @js.native
  sealed trait yuv444 extends SubsamplingFormat
}
