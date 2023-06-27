package typings.devtoolsProtocol.mod.Protocol.Preload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.Activated
  - typings.devtoolsProtocol.devtoolsProtocolStrings.Destroyed
  - typings.devtoolsProtocol.devtoolsProtocolStrings.LowEndDevice
  - typings.devtoolsProtocol.devtoolsProtocolStrings.InvalidSchemeRedirect
  - typings.devtoolsProtocol.devtoolsProtocolStrings.InvalidSchemeNavigation
  - typings.devtoolsProtocol.devtoolsProtocolStrings.InProgressNavigation
  - typings.devtoolsProtocol.devtoolsProtocolStrings.NavigationRequestBlockedByCsp
  - typings.devtoolsProtocol.devtoolsProtocolStrings.MainFrameNavigation
  - typings.devtoolsProtocol.devtoolsProtocolStrings.MojoBinderPolicy
  - typings.devtoolsProtocol.devtoolsProtocolStrings.RendererProcessCrashed
  - typings.devtoolsProtocol.devtoolsProtocolStrings.RendererProcessKilled
  - typings.devtoolsProtocol.devtoolsProtocolStrings.Download
  - typings.devtoolsProtocol.devtoolsProtocolStrings.TriggerDestroyed
  - typings.devtoolsProtocol.devtoolsProtocolStrings.NavigationNotCommitted
  - typings.devtoolsProtocol.devtoolsProtocolStrings.NavigationBadHttpStatus
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ClientCertRequested
  - typings.devtoolsProtocol.devtoolsProtocolStrings.NavigationRequestNetworkError
  - typings.devtoolsProtocol.devtoolsProtocolStrings.MaxNumOfRunningPrerendersExceeded
  - typings.devtoolsProtocol.devtoolsProtocolStrings.CancelAllHostsForTesting
  - typings.devtoolsProtocol.devtoolsProtocolStrings.DidFailLoad
  - typings.devtoolsProtocol.devtoolsProtocolStrings.Stop
  - typings.devtoolsProtocol.devtoolsProtocolStrings.SslCertificateError
  - typings.devtoolsProtocol.devtoolsProtocolStrings.LoginAuthRequested
  - typings.devtoolsProtocol.devtoolsProtocolStrings.UaChangeRequiresReload
  - typings.devtoolsProtocol.devtoolsProtocolStrings.BlockedByClient
  - typings.devtoolsProtocol.devtoolsProtocolStrings.AudioOutputDeviceRequested
  - typings.devtoolsProtocol.devtoolsProtocolStrings.MixedContent
  - typings.devtoolsProtocol.devtoolsProtocolStrings.TriggerBackgrounded
  - typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderTriggeredAndCrossOriginRedirected
  - typings.devtoolsProtocol.devtoolsProtocolStrings.MemoryLimitExceeded
  - typings.devtoolsProtocol.devtoolsProtocolStrings.FailToGetMemoryUsage
  - typings.devtoolsProtocol.devtoolsProtocolStrings.DataSaverEnabled
  - typings.devtoolsProtocol.devtoolsProtocolStrings.HasEffectiveUrl
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ActivatedBeforeStarted
  - typings.devtoolsProtocol.devtoolsProtocolStrings.InactivePageRestriction
  - typings.devtoolsProtocol.devtoolsProtocolStrings.StartFailed
  - typings.devtoolsProtocol.devtoolsProtocolStrings.TimeoutBackgrounded
  - typings.devtoolsProtocol.devtoolsProtocolStrings.CrossSiteRedirectInInitialNavigation
  - typings.devtoolsProtocol.devtoolsProtocolStrings.CrossSiteNavigationInInitialNavigation
  - typings.devtoolsProtocol.devtoolsProtocolStrings.SameSiteCrossOriginRedirectNotOptInInInitialNavigation
  - typings.devtoolsProtocol.devtoolsProtocolStrings.SameSiteCrossOriginNavigationNotOptInInInitialNavigation
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ActivationNavigationParameterMismatch
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ActivatedInBackground
  - typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderHostDisallowed
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ActivationNavigationDestroyedBeforeSuccess
  - typings.devtoolsProtocol.devtoolsProtocolStrings.TabClosedByUserGesture
  - typings.devtoolsProtocol.devtoolsProtocolStrings.TabClosedWithoutUserGesture
  - typings.devtoolsProtocol.devtoolsProtocolStrings.PrimaryMainFrameRendererProcessCrashed
  - typings.devtoolsProtocol.devtoolsProtocolStrings.PrimaryMainFrameRendererProcessKilled
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ActivationFramePolicyNotCompatible
  - typings.devtoolsProtocol.devtoolsProtocolStrings.PreloadingDisabled
  - typings.devtoolsProtocol.devtoolsProtocolStrings.BatterySaverEnabled
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ActivatedDuringMainFrameNavigation
  - typings.devtoolsProtocol.devtoolsProtocolStrings.PreloadingUnsupportedByWebContents
  - typings.devtoolsProtocol.devtoolsProtocolStrings.CrossSiteRedirectInMainFrameNavigation
  - typings.devtoolsProtocol.devtoolsProtocolStrings.CrossSiteNavigationInMainFrameNavigation
  - typings.devtoolsProtocol.devtoolsProtocolStrings.SameSiteCrossOriginRedirectNotOptInInMainFrameNavigation
  - typings.devtoolsProtocol.devtoolsProtocolStrings.SameSiteCrossOriginNavigationNotOptInInMainFrameNavigation
  - typings.devtoolsProtocol.devtoolsProtocolStrings.MemoryPressureOnTrigger
  - typings.devtoolsProtocol.devtoolsProtocolStrings.MemoryPressureAfterTriggered
  - typings.devtoolsProtocol.devtoolsProtocolStrings.PrerenderingDisabledByDevTools
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ResourceLoadBlockedByClient
*/
trait PrerenderFinalStatus extends StObject
object PrerenderFinalStatus {
  
  inline def Activated: typings.devtoolsProtocol.devtoolsProtocolStrings.Activated = "Activated".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.Activated]
  
  inline def ActivatedBeforeStarted: typings.devtoolsProtocol.devtoolsProtocolStrings.ActivatedBeforeStarted = "ActivatedBeforeStarted".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ActivatedBeforeStarted]
  
  inline def ActivatedDuringMainFrameNavigation: typings.devtoolsProtocol.devtoolsProtocolStrings.ActivatedDuringMainFrameNavigation = "ActivatedDuringMainFrameNavigation".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ActivatedDuringMainFrameNavigation]
  
  inline def ActivatedInBackground: typings.devtoolsProtocol.devtoolsProtocolStrings.ActivatedInBackground = "ActivatedInBackground".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ActivatedInBackground]
  
  inline def ActivationFramePolicyNotCompatible: typings.devtoolsProtocol.devtoolsProtocolStrings.ActivationFramePolicyNotCompatible = "ActivationFramePolicyNotCompatible".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ActivationFramePolicyNotCompatible]
  
  inline def ActivationNavigationDestroyedBeforeSuccess: typings.devtoolsProtocol.devtoolsProtocolStrings.ActivationNavigationDestroyedBeforeSuccess = "ActivationNavigationDestroyedBeforeSuccess".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ActivationNavigationDestroyedBeforeSuccess]
  
  inline def ActivationNavigationParameterMismatch: typings.devtoolsProtocol.devtoolsProtocolStrings.ActivationNavigationParameterMismatch = "ActivationNavigationParameterMismatch".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ActivationNavigationParameterMismatch]
  
  inline def AudioOutputDeviceRequested: typings.devtoolsProtocol.devtoolsProtocolStrings.AudioOutputDeviceRequested = "AudioOutputDeviceRequested".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.AudioOutputDeviceRequested]
  
  inline def BatterySaverEnabled: typings.devtoolsProtocol.devtoolsProtocolStrings.BatterySaverEnabled = "BatterySaverEnabled".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.BatterySaverEnabled]
  
  inline def BlockedByClient: typings.devtoolsProtocol.devtoolsProtocolStrings.BlockedByClient = "BlockedByClient".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.BlockedByClient]
  
  inline def CancelAllHostsForTesting: typings.devtoolsProtocol.devtoolsProtocolStrings.CancelAllHostsForTesting = "CancelAllHostsForTesting".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.CancelAllHostsForTesting]
  
  inline def ClientCertRequested: typings.devtoolsProtocol.devtoolsProtocolStrings.ClientCertRequested = "ClientCertRequested".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ClientCertRequested]
  
  inline def CrossSiteNavigationInInitialNavigation: typings.devtoolsProtocol.devtoolsProtocolStrings.CrossSiteNavigationInInitialNavigation = "CrossSiteNavigationInInitialNavigation".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.CrossSiteNavigationInInitialNavigation]
  
  inline def CrossSiteNavigationInMainFrameNavigation: typings.devtoolsProtocol.devtoolsProtocolStrings.CrossSiteNavigationInMainFrameNavigation = "CrossSiteNavigationInMainFrameNavigation".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.CrossSiteNavigationInMainFrameNavigation]
  
  inline def CrossSiteRedirectInInitialNavigation: typings.devtoolsProtocol.devtoolsProtocolStrings.CrossSiteRedirectInInitialNavigation = "CrossSiteRedirectInInitialNavigation".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.CrossSiteRedirectInInitialNavigation]
  
  inline def CrossSiteRedirectInMainFrameNavigation: typings.devtoolsProtocol.devtoolsProtocolStrings.CrossSiteRedirectInMainFrameNavigation = "CrossSiteRedirectInMainFrameNavigation".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.CrossSiteRedirectInMainFrameNavigation]
  
  inline def DataSaverEnabled: typings.devtoolsProtocol.devtoolsProtocolStrings.DataSaverEnabled = "DataSaverEnabled".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.DataSaverEnabled]
  
  inline def Destroyed: typings.devtoolsProtocol.devtoolsProtocolStrings.Destroyed = "Destroyed".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.Destroyed]
  
  inline def DidFailLoad: typings.devtoolsProtocol.devtoolsProtocolStrings.DidFailLoad = "DidFailLoad".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.DidFailLoad]
  
  inline def Download: typings.devtoolsProtocol.devtoolsProtocolStrings.Download = "Download".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.Download]
  
  inline def EmbedderHostDisallowed: typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderHostDisallowed = "EmbedderHostDisallowed".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderHostDisallowed]
  
  inline def EmbedderTriggeredAndCrossOriginRedirected: typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderTriggeredAndCrossOriginRedirected = "EmbedderTriggeredAndCrossOriginRedirected".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.EmbedderTriggeredAndCrossOriginRedirected]
  
  inline def FailToGetMemoryUsage: typings.devtoolsProtocol.devtoolsProtocolStrings.FailToGetMemoryUsage = "FailToGetMemoryUsage".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.FailToGetMemoryUsage]
  
  inline def HasEffectiveUrl: typings.devtoolsProtocol.devtoolsProtocolStrings.HasEffectiveUrl = "HasEffectiveUrl".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.HasEffectiveUrl]
  
  inline def InProgressNavigation: typings.devtoolsProtocol.devtoolsProtocolStrings.InProgressNavigation = "InProgressNavigation".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.InProgressNavigation]
  
  inline def InactivePageRestriction: typings.devtoolsProtocol.devtoolsProtocolStrings.InactivePageRestriction = "InactivePageRestriction".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.InactivePageRestriction]
  
  inline def InvalidSchemeNavigation: typings.devtoolsProtocol.devtoolsProtocolStrings.InvalidSchemeNavigation = "InvalidSchemeNavigation".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.InvalidSchemeNavigation]
  
  inline def InvalidSchemeRedirect: typings.devtoolsProtocol.devtoolsProtocolStrings.InvalidSchemeRedirect = "InvalidSchemeRedirect".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.InvalidSchemeRedirect]
  
  inline def LoginAuthRequested: typings.devtoolsProtocol.devtoolsProtocolStrings.LoginAuthRequested = "LoginAuthRequested".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.LoginAuthRequested]
  
  inline def LowEndDevice: typings.devtoolsProtocol.devtoolsProtocolStrings.LowEndDevice = "LowEndDevice".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.LowEndDevice]
  
  inline def MainFrameNavigation: typings.devtoolsProtocol.devtoolsProtocolStrings.MainFrameNavigation = "MainFrameNavigation".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.MainFrameNavigation]
  
  inline def MaxNumOfRunningPrerendersExceeded: typings.devtoolsProtocol.devtoolsProtocolStrings.MaxNumOfRunningPrerendersExceeded = "MaxNumOfRunningPrerendersExceeded".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.MaxNumOfRunningPrerendersExceeded]
  
  inline def MemoryLimitExceeded: typings.devtoolsProtocol.devtoolsProtocolStrings.MemoryLimitExceeded = "MemoryLimitExceeded".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.MemoryLimitExceeded]
  
  inline def MemoryPressureAfterTriggered: typings.devtoolsProtocol.devtoolsProtocolStrings.MemoryPressureAfterTriggered = "MemoryPressureAfterTriggered".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.MemoryPressureAfterTriggered]
  
  inline def MemoryPressureOnTrigger: typings.devtoolsProtocol.devtoolsProtocolStrings.MemoryPressureOnTrigger = "MemoryPressureOnTrigger".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.MemoryPressureOnTrigger]
  
  inline def MixedContent: typings.devtoolsProtocol.devtoolsProtocolStrings.MixedContent = "MixedContent".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.MixedContent]
  
  inline def MojoBinderPolicy: typings.devtoolsProtocol.devtoolsProtocolStrings.MojoBinderPolicy = "MojoBinderPolicy".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.MojoBinderPolicy]
  
  inline def NavigationBadHttpStatus: typings.devtoolsProtocol.devtoolsProtocolStrings.NavigationBadHttpStatus = "NavigationBadHttpStatus".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.NavigationBadHttpStatus]
  
  inline def NavigationNotCommitted: typings.devtoolsProtocol.devtoolsProtocolStrings.NavigationNotCommitted = "NavigationNotCommitted".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.NavigationNotCommitted]
  
  inline def NavigationRequestBlockedByCsp: typings.devtoolsProtocol.devtoolsProtocolStrings.NavigationRequestBlockedByCsp = "NavigationRequestBlockedByCsp".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.NavigationRequestBlockedByCsp]
  
  inline def NavigationRequestNetworkError: typings.devtoolsProtocol.devtoolsProtocolStrings.NavigationRequestNetworkError = "NavigationRequestNetworkError".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.NavigationRequestNetworkError]
  
  inline def PreloadingDisabled: typings.devtoolsProtocol.devtoolsProtocolStrings.PreloadingDisabled = "PreloadingDisabled".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.PreloadingDisabled]
  
  inline def PreloadingUnsupportedByWebContents: typings.devtoolsProtocol.devtoolsProtocolStrings.PreloadingUnsupportedByWebContents = "PreloadingUnsupportedByWebContents".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.PreloadingUnsupportedByWebContents]
  
  inline def PrerenderingDisabledByDevTools: typings.devtoolsProtocol.devtoolsProtocolStrings.PrerenderingDisabledByDevTools = "PrerenderingDisabledByDevTools".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.PrerenderingDisabledByDevTools]
  
  inline def PrimaryMainFrameRendererProcessCrashed: typings.devtoolsProtocol.devtoolsProtocolStrings.PrimaryMainFrameRendererProcessCrashed = "PrimaryMainFrameRendererProcessCrashed".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.PrimaryMainFrameRendererProcessCrashed]
  
  inline def PrimaryMainFrameRendererProcessKilled: typings.devtoolsProtocol.devtoolsProtocolStrings.PrimaryMainFrameRendererProcessKilled = "PrimaryMainFrameRendererProcessKilled".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.PrimaryMainFrameRendererProcessKilled]
  
  inline def RendererProcessCrashed: typings.devtoolsProtocol.devtoolsProtocolStrings.RendererProcessCrashed = "RendererProcessCrashed".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.RendererProcessCrashed]
  
  inline def RendererProcessKilled: typings.devtoolsProtocol.devtoolsProtocolStrings.RendererProcessKilled = "RendererProcessKilled".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.RendererProcessKilled]
  
  inline def ResourceLoadBlockedByClient: typings.devtoolsProtocol.devtoolsProtocolStrings.ResourceLoadBlockedByClient = "ResourceLoadBlockedByClient".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.ResourceLoadBlockedByClient]
  
  inline def SameSiteCrossOriginNavigationNotOptInInInitialNavigation: typings.devtoolsProtocol.devtoolsProtocolStrings.SameSiteCrossOriginNavigationNotOptInInInitialNavigation = "SameSiteCrossOriginNavigationNotOptInInInitialNavigation".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.SameSiteCrossOriginNavigationNotOptInInInitialNavigation]
  
  inline def SameSiteCrossOriginNavigationNotOptInInMainFrameNavigation: typings.devtoolsProtocol.devtoolsProtocolStrings.SameSiteCrossOriginNavigationNotOptInInMainFrameNavigation = "SameSiteCrossOriginNavigationNotOptInInMainFrameNavigation".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.SameSiteCrossOriginNavigationNotOptInInMainFrameNavigation]
  
  inline def SameSiteCrossOriginRedirectNotOptInInInitialNavigation: typings.devtoolsProtocol.devtoolsProtocolStrings.SameSiteCrossOriginRedirectNotOptInInInitialNavigation = "SameSiteCrossOriginRedirectNotOptInInInitialNavigation".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.SameSiteCrossOriginRedirectNotOptInInInitialNavigation]
  
  inline def SameSiteCrossOriginRedirectNotOptInInMainFrameNavigation: typings.devtoolsProtocol.devtoolsProtocolStrings.SameSiteCrossOriginRedirectNotOptInInMainFrameNavigation = "SameSiteCrossOriginRedirectNotOptInInMainFrameNavigation".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.SameSiteCrossOriginRedirectNotOptInInMainFrameNavigation]
  
  inline def SslCertificateError: typings.devtoolsProtocol.devtoolsProtocolStrings.SslCertificateError = "SslCertificateError".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.SslCertificateError]
  
  inline def StartFailed: typings.devtoolsProtocol.devtoolsProtocolStrings.StartFailed = "StartFailed".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.StartFailed]
  
  inline def Stop: typings.devtoolsProtocol.devtoolsProtocolStrings.Stop = "Stop".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.Stop]
  
  inline def TabClosedByUserGesture: typings.devtoolsProtocol.devtoolsProtocolStrings.TabClosedByUserGesture = "TabClosedByUserGesture".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.TabClosedByUserGesture]
  
  inline def TabClosedWithoutUserGesture: typings.devtoolsProtocol.devtoolsProtocolStrings.TabClosedWithoutUserGesture = "TabClosedWithoutUserGesture".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.TabClosedWithoutUserGesture]
  
  inline def TimeoutBackgrounded: typings.devtoolsProtocol.devtoolsProtocolStrings.TimeoutBackgrounded = "TimeoutBackgrounded".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.TimeoutBackgrounded]
  
  inline def TriggerBackgrounded: typings.devtoolsProtocol.devtoolsProtocolStrings.TriggerBackgrounded = "TriggerBackgrounded".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.TriggerBackgrounded]
  
  inline def TriggerDestroyed: typings.devtoolsProtocol.devtoolsProtocolStrings.TriggerDestroyed = "TriggerDestroyed".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.TriggerDestroyed]
  
  inline def UaChangeRequiresReload: typings.devtoolsProtocol.devtoolsProtocolStrings.UaChangeRequiresReload = "UaChangeRequiresReload".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.UaChangeRequiresReload]
}
