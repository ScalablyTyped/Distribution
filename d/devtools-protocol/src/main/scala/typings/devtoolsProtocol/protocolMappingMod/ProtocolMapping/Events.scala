package typings.devtoolsProtocol.protocolMappingMod.ProtocolMapping

import typings.devtoolsProtocol.mod.Protocol.Animation.AnimationCanceledEvent
import typings.devtoolsProtocol.mod.Protocol.Animation.AnimationCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.Animation.AnimationStartedEvent
import typings.devtoolsProtocol.mod.Protocol.ApplicationCache.ApplicationCacheStatusUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.ApplicationCache.NetworkStateUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Audits.IssueAddedEvent
import typings.devtoolsProtocol.mod.Protocol.BackgroundService.BackgroundServiceEventReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.BackgroundService.RecordingStateChangedEvent
import typings.devtoolsProtocol.mod.Protocol.CSS.FontsUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.CSS.StyleSheetAddedEvent
import typings.devtoolsProtocol.mod.Protocol.CSS.StyleSheetChangedEvent
import typings.devtoolsProtocol.mod.Protocol.CSS.StyleSheetRemovedEvent
import typings.devtoolsProtocol.mod.Protocol.Cast.IssueUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Cast.SinksUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Console.MessageAddedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.AttributeModifiedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.AttributeRemovedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.CharacterDataModifiedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.ChildNodeCountUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.ChildNodeInsertedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.ChildNodeRemovedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.DistributedNodesUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.InlineStyleInvalidatedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.PseudoElementAddedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.PseudoElementRemovedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.SetChildNodesEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.ShadowRootPoppedEvent
import typings.devtoolsProtocol.mod.Protocol.DOM.ShadowRootPushedEvent
import typings.devtoolsProtocol.mod.Protocol.DOMStorage.DomStorageItemAddedEvent
import typings.devtoolsProtocol.mod.Protocol.DOMStorage.DomStorageItemRemovedEvent
import typings.devtoolsProtocol.mod.Protocol.DOMStorage.DomStorageItemUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.DOMStorage.DomStorageItemsClearedEvent
import typings.devtoolsProtocol.mod.Protocol.Database.AddDatabaseEvent
import typings.devtoolsProtocol.mod.Protocol.Debugger.BreakpointResolvedEvent
import typings.devtoolsProtocol.mod.Protocol.Debugger.PausedEvent
import typings.devtoolsProtocol.mod.Protocol.Debugger.ScriptFailedToParseEvent
import typings.devtoolsProtocol.mod.Protocol.Debugger.ScriptParsedEvent
import typings.devtoolsProtocol.mod.Protocol.Fetch.AuthRequiredEvent
import typings.devtoolsProtocol.mod.Protocol.Fetch.RequestPausedEvent
import typings.devtoolsProtocol.mod.Protocol.HeadlessExperimental.NeedsBeginFramesChangedEvent
import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.AddHeapSnapshotChunkEvent
import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.HeapStatsUpdateEvent
import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.LastSeenObjectIdEvent
import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.ReportHeapSnapshotProgressEvent
import typings.devtoolsProtocol.mod.Protocol.Inspector.DetachedEvent
import typings.devtoolsProtocol.mod.Protocol.LayerTree.LayerPaintedEvent
import typings.devtoolsProtocol.mod.Protocol.LayerTree.LayerTreeDidChangeEvent
import typings.devtoolsProtocol.mod.Protocol.Log.EntryAddedEvent
import typings.devtoolsProtocol.mod.Protocol.Media.PlayerErrorsRaisedEvent
import typings.devtoolsProtocol.mod.Protocol.Media.PlayerEventsAddedEvent
import typings.devtoolsProtocol.mod.Protocol.Media.PlayerMessagesLoggedEvent
import typings.devtoolsProtocol.mod.Protocol.Media.PlayerPropertiesChangedEvent
import typings.devtoolsProtocol.mod.Protocol.Media.PlayersCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.DataReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.EventSourceMessageReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.LoadingFailedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.LoadingFinishedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.RequestInterceptedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.RequestServedFromCacheEvent
import typings.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentEvent
import typings.devtoolsProtocol.mod.Protocol.Network.RequestWillBeSentExtraInfoEvent
import typings.devtoolsProtocol.mod.Protocol.Network.ResourceChangedPriorityEvent
import typings.devtoolsProtocol.mod.Protocol.Network.ResponseReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.ResponseReceivedExtraInfoEvent
import typings.devtoolsProtocol.mod.Protocol.Network.SignedExchangeReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketClosedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketFrameErrorEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketFrameReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketFrameSentEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketHandshakeResponseReceivedEvent
import typings.devtoolsProtocol.mod.Protocol.Network.WebSocketWillSendHandshakeRequestEvent
import typings.devtoolsProtocol.mod.Protocol.Overlay.InspectNodeRequestedEvent
import typings.devtoolsProtocol.mod.Protocol.Overlay.NodeHighlightRequestedEvent
import typings.devtoolsProtocol.mod.Protocol.Overlay.ScreenshotRequestedEvent
import typings.devtoolsProtocol.mod.Protocol.Page.CompilationCacheProducedEvent
import typings.devtoolsProtocol.mod.Protocol.Page.DomContentEventFiredEvent
import typings.devtoolsProtocol.mod.Protocol.Page.DownloadProgressEvent
import typings.devtoolsProtocol.mod.Protocol.Page.DownloadWillBeginEvent
import typings.devtoolsProtocol.mod.Protocol.Page.FileChooserOpenedEvent
import typings.devtoolsProtocol.mod.Protocol.Page.FrameAttachedEvent
import typings.devtoolsProtocol.mod.Protocol.Page.FrameClearedScheduledNavigationEvent
import typings.devtoolsProtocol.mod.Protocol.Page.FrameDetachedEvent
import typings.devtoolsProtocol.mod.Protocol.Page.FrameNavigatedEvent
import typings.devtoolsProtocol.mod.Protocol.Page.FrameRequestedNavigationEvent
import typings.devtoolsProtocol.mod.Protocol.Page.FrameScheduledNavigationEvent
import typings.devtoolsProtocol.mod.Protocol.Page.FrameStartedLoadingEvent
import typings.devtoolsProtocol.mod.Protocol.Page.FrameStoppedLoadingEvent
import typings.devtoolsProtocol.mod.Protocol.Page.JavascriptDialogClosedEvent
import typings.devtoolsProtocol.mod.Protocol.Page.JavascriptDialogOpeningEvent
import typings.devtoolsProtocol.mod.Protocol.Page.LifecycleEventEvent
import typings.devtoolsProtocol.mod.Protocol.Page.LoadEventFiredEvent
import typings.devtoolsProtocol.mod.Protocol.Page.NavigatedWithinDocumentEvent
import typings.devtoolsProtocol.mod.Protocol.Page.ScreencastFrameEvent
import typings.devtoolsProtocol.mod.Protocol.Page.ScreencastVisibilityChangedEvent
import typings.devtoolsProtocol.mod.Protocol.Page.WindowOpenEvent
import typings.devtoolsProtocol.mod.Protocol.Performance.MetricsEvent
import typings.devtoolsProtocol.mod.Protocol.Profiler.ConsoleProfileFinishedEvent
import typings.devtoolsProtocol.mod.Protocol.Profiler.ConsoleProfileStartedEvent
import typings.devtoolsProtocol.mod.Protocol.Profiler.PreciseCoverageDeltaUpdateEvent
import typings.devtoolsProtocol.mod.Protocol.Runtime.BindingCalledEvent
import typings.devtoolsProtocol.mod.Protocol.Runtime.ConsoleAPICalledEvent
import typings.devtoolsProtocol.mod.Protocol.Runtime.ExceptionRevokedEvent
import typings.devtoolsProtocol.mod.Protocol.Runtime.ExceptionThrownEvent
import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextDestroyedEvent
import typings.devtoolsProtocol.mod.Protocol.Runtime.InspectRequestedEvent
import typings.devtoolsProtocol.mod.Protocol.Security.CertificateErrorEvent
import typings.devtoolsProtocol.mod.Protocol.Security.SecurityStateChangedEvent
import typings.devtoolsProtocol.mod.Protocol.Security.VisibleSecurityStateChangedEvent
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.WorkerErrorReportedEvent
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.WorkerRegistrationUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.ServiceWorker.WorkerVersionUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Storage.CacheStorageContentUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Storage.CacheStorageListUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Storage.IndexedDBContentUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Storage.IndexedDBListUpdatedEvent
import typings.devtoolsProtocol.mod.Protocol.Target.AttachedToTargetEvent
import typings.devtoolsProtocol.mod.Protocol.Target.DetachedFromTargetEvent
import typings.devtoolsProtocol.mod.Protocol.Target.ReceivedMessageFromTargetEvent
import typings.devtoolsProtocol.mod.Protocol.Target.TargetCrashedEvent
import typings.devtoolsProtocol.mod.Protocol.Target.TargetCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.Target.TargetDestroyedEvent
import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfoChangedEvent
import typings.devtoolsProtocol.mod.Protocol.Tethering.AcceptedEvent
import typings.devtoolsProtocol.mod.Protocol.Tracing.BufferUsageEvent
import typings.devtoolsProtocol.mod.Protocol.Tracing.DataCollectedEvent
import typings.devtoolsProtocol.mod.Protocol.Tracing.TracingCompleteEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.AudioListenerCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.AudioListenerWillBeDestroyedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.AudioNodeCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.AudioNodeWillBeDestroyedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.AudioParamCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.AudioParamWillBeDestroyedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.ContextChangedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.ContextCreatedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.ContextWillBeDestroyedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.NodeParamConnectedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.NodeParamDisconnectedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.NodesConnectedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAudio.NodesDisconnectedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  /**
    * Event for when an animation has been cancelled.
    */
  @JSName("Animation.animationCanceled")
  var AnimationDotanimationCanceled: js.Array[AnimationCanceledEvent] = js.native
  /**
    * Event for each animation that has been created.
    */
  @JSName("Animation.animationCreated")
  var AnimationDotanimationCreated: js.Array[AnimationCreatedEvent] = js.native
  /**
    * Event for animation that has been started.
    */
  @JSName("Animation.animationStarted")
  var AnimationDotanimationStarted: js.Array[AnimationStartedEvent] = js.native
  @JSName("ApplicationCache.applicationCacheStatusUpdated")
  var ApplicationCacheDotapplicationCacheStatusUpdated: js.Array[ApplicationCacheStatusUpdatedEvent] = js.native
  @JSName("ApplicationCache.networkStateUpdated")
  var ApplicationCacheDotnetworkStateUpdated: js.Array[NetworkStateUpdatedEvent] = js.native
  @JSName("Audits.issueAdded")
  var AuditsDotissueAdded: js.Array[IssueAddedEvent] = js.native
  /**
    * Called with all existing backgroundServiceEvents when enabled, and all new
    * events afterwards if enabled and recording.
    */
  @JSName("BackgroundService.backgroundServiceEventReceived")
  var BackgroundServiceDotbackgroundServiceEventReceived: js.Array[BackgroundServiceEventReceivedEvent] = js.native
  /**
    * Called when the recording state for the service has been updated.
    */
  @JSName("BackgroundService.recordingStateChanged")
  var BackgroundServiceDotrecordingStateChanged: js.Array[RecordingStateChangedEvent] = js.native
  /**
    * Fires whenever a web font is updated.  A non-empty font parameter indicates a successfully loaded
    * web font
    */
  @JSName("CSS.fontsUpdated")
  var CSSDotfontsUpdated: js.Array[FontsUpdatedEvent] = js.native
  /**
    * Fires whenever a MediaQuery result changes (for example, after a browser window has been
    * resized.) The current implementation considers only viewport-dependent media features.
    */
  @JSName("CSS.mediaQueryResultChanged")
  var CSSDotmediaQueryResultChanged: js.Array[js.Any] = js.native
  /**
    * Fired whenever an active document stylesheet is added.
    */
  @JSName("CSS.styleSheetAdded")
  var CSSDotstyleSheetAdded: js.Array[StyleSheetAddedEvent] = js.native
  /**
    * Fired whenever a stylesheet is changed as a result of the client operation.
    */
  @JSName("CSS.styleSheetChanged")
  var CSSDotstyleSheetChanged: js.Array[StyleSheetChangedEvent] = js.native
  /**
    * Fired whenever an active document stylesheet is removed.
    */
  @JSName("CSS.styleSheetRemoved")
  var CSSDotstyleSheetRemoved: js.Array[StyleSheetRemovedEvent] = js.native
  /**
    * This is fired whenever the outstanding issue/error message changes.
    * |issueMessage| is empty if there is no issue.
    */
  @JSName("Cast.issueUpdated")
  var CastDotissueUpdated: js.Array[IssueUpdatedEvent] = js.native
  /**
    * This is fired whenever the list of available sinks changes. A sink is a
    * device or a software surface that you can cast to.
    */
  @JSName("Cast.sinksUpdated")
  var CastDotsinksUpdated: js.Array[SinksUpdatedEvent] = js.native
  /**
    * Issued when new console message is added.
    */
  @JSName("Console.messageAdded")
  var ConsoleDotmessageAdded: js.Array[MessageAddedEvent] = js.native
  /**
    * Fired when `Element`'s attribute is modified.
    */
  @JSName("DOM.attributeModified")
  var DOMDotattributeModified: js.Array[AttributeModifiedEvent] = js.native
  /**
    * Fired when `Element`'s attribute is removed.
    */
  @JSName("DOM.attributeRemoved")
  var DOMDotattributeRemoved: js.Array[AttributeRemovedEvent] = js.native
  /**
    * Mirrors `DOMCharacterDataModified` event.
    */
  @JSName("DOM.characterDataModified")
  var DOMDotcharacterDataModified: js.Array[CharacterDataModifiedEvent] = js.native
  /**
    * Fired when `Container`'s child node count has changed.
    */
  @JSName("DOM.childNodeCountUpdated")
  var DOMDotchildNodeCountUpdated: js.Array[ChildNodeCountUpdatedEvent] = js.native
  /**
    * Mirrors `DOMNodeInserted` event.
    */
  @JSName("DOM.childNodeInserted")
  var DOMDotchildNodeInserted: js.Array[ChildNodeInsertedEvent] = js.native
  /**
    * Mirrors `DOMNodeRemoved` event.
    */
  @JSName("DOM.childNodeRemoved")
  var DOMDotchildNodeRemoved: js.Array[ChildNodeRemovedEvent] = js.native
  /**
    * Called when distrubution is changed.
    */
  @JSName("DOM.distributedNodesUpdated")
  var DOMDotdistributedNodesUpdated: js.Array[DistributedNodesUpdatedEvent] = js.native
  /**
    * Fired when `Document` has been totally updated. Node ids are no longer valid.
    */
  @JSName("DOM.documentUpdated")
  var DOMDotdocumentUpdated: js.Array[js.Any] = js.native
  /**
    * Fired when `Element`'s inline style is modified via a CSS property modification.
    */
  @JSName("DOM.inlineStyleInvalidated")
  var DOMDotinlineStyleInvalidated: js.Array[InlineStyleInvalidatedEvent] = js.native
  /**
    * Called when a pseudo element is added to an element.
    */
  @JSName("DOM.pseudoElementAdded")
  var DOMDotpseudoElementAdded: js.Array[PseudoElementAddedEvent] = js.native
  /**
    * Called when a pseudo element is removed from an element.
    */
  @JSName("DOM.pseudoElementRemoved")
  var DOMDotpseudoElementRemoved: js.Array[PseudoElementRemovedEvent] = js.native
  /**
    * Fired when backend wants to provide client with the missing DOM structure. This happens upon
    * most of the calls requesting node ids.
    */
  @JSName("DOM.setChildNodes")
  var DOMDotsetChildNodes: js.Array[SetChildNodesEvent] = js.native
  /**
    * Called when shadow root is popped from the element.
    */
  @JSName("DOM.shadowRootPopped")
  var DOMDotshadowRootPopped: js.Array[ShadowRootPoppedEvent] = js.native
  /**
    * Called when shadow root is pushed into the element.
    */
  @JSName("DOM.shadowRootPushed")
  var DOMDotshadowRootPushed: js.Array[ShadowRootPushedEvent] = js.native
  @JSName("DOMStorage.domStorageItemAdded")
  var DOMStorageDotdomStorageItemAdded: js.Array[DomStorageItemAddedEvent] = js.native
  @JSName("DOMStorage.domStorageItemRemoved")
  var DOMStorageDotdomStorageItemRemoved: js.Array[DomStorageItemRemovedEvent] = js.native
  @JSName("DOMStorage.domStorageItemUpdated")
  var DOMStorageDotdomStorageItemUpdated: js.Array[DomStorageItemUpdatedEvent] = js.native
  @JSName("DOMStorage.domStorageItemsCleared")
  var DOMStorageDotdomStorageItemsCleared: js.Array[DomStorageItemsClearedEvent] = js.native
  @JSName("Database.addDatabase")
  var DatabaseDotaddDatabase: js.Array[AddDatabaseEvent] = js.native
  /**
    * Fired when breakpoint is resolved to an actual script and location.
    */
  @JSName("Debugger.breakpointResolved")
  var DebuggerDotbreakpointResolved: js.Array[BreakpointResolvedEvent] = js.native
  /**
    * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria.
    */
  @JSName("Debugger.paused")
  var DebuggerDotpaused: js.Array[PausedEvent] = js.native
  /**
    * Fired when the virtual machine resumed execution.
    */
  @JSName("Debugger.resumed")
  var DebuggerDotresumed: js.Array[js.Any] = js.native
  /**
    * Fired when virtual machine fails to parse the script.
    */
  @JSName("Debugger.scriptFailedToParse")
  var DebuggerDotscriptFailedToParse: js.Array[ScriptFailedToParseEvent] = js.native
  /**
    * Fired when virtual machine parses script. This event is also fired for all known and uncollected
    * scripts upon enabling debugger.
    */
  @JSName("Debugger.scriptParsed")
  var DebuggerDotscriptParsed: js.Array[ScriptParsedEvent] = js.native
  /**
    * Notification sent after the virtual time budget for the current VirtualTimePolicy has run out.
    */
  @JSName("Emulation.virtualTimeBudgetExpired")
  var EmulationDotvirtualTimeBudgetExpired: js.Array[js.Any] = js.native
  /**
    * Issued when the domain is enabled with handleAuthRequests set to true.
    * The request is paused until client responds with continueWithAuth.
    */
  @JSName("Fetch.authRequired")
  var FetchDotauthRequired: js.Array[AuthRequiredEvent] = js.native
  /**
    * Issued when the domain is enabled and the request URL matches the
    * specified filter. The request is paused until the client responds
    * with one of continueRequest, failRequest or fulfillRequest.
    * The stage of the request can be determined by presence of responseErrorReason
    * and responseStatusCode -- the request is at the response stage if either
    * of these fields is present and in the request stage otherwise.
    */
  @JSName("Fetch.requestPaused")
  var FetchDotrequestPaused: js.Array[RequestPausedEvent] = js.native
  /**
    * Issued when the target starts or stops needing BeginFrames.
    * Deprecated. Issue beginFrame unconditionally instead and use result from
    * beginFrame to detect whether the frames were suppressed.
    */
  @JSName("HeadlessExperimental.needsBeginFramesChanged")
  var HeadlessExperimentalDotneedsBeginFramesChanged: js.Array[NeedsBeginFramesChangedEvent] = js.native
  @JSName("HeapProfiler.addHeapSnapshotChunk")
  var HeapProfilerDotaddHeapSnapshotChunk: js.Array[AddHeapSnapshotChunkEvent] = js.native
  /**
    * If heap objects tracking has been started then backend may send update for one or more fragments
    */
  @JSName("HeapProfiler.heapStatsUpdate")
  var HeapProfilerDotheapStatsUpdate: js.Array[HeapStatsUpdateEvent] = js.native
  /**
    * If heap objects tracking has been started then backend regularly sends a current value for last
    * seen object id and corresponding timestamp. If the were changes in the heap since last event
    * then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event.
    */
  @JSName("HeapProfiler.lastSeenObjectId")
  var HeapProfilerDotlastSeenObjectId: js.Array[LastSeenObjectIdEvent] = js.native
  @JSName("HeapProfiler.reportHeapSnapshotProgress")
  var HeapProfilerDotreportHeapSnapshotProgress: js.Array[ReportHeapSnapshotProgressEvent] = js.native
  @JSName("HeapProfiler.resetProfiles")
  var HeapProfilerDotresetProfiles: js.Array[js.Any] = js.native
  /**
    * Fired when remote debugging connection is about to be terminated. Contains detach reason.
    */
  @JSName("Inspector.detached")
  var InspectorDotdetached: js.Array[DetachedEvent] = js.native
  /**
    * Fired when debugging target has crashed
    */
  @JSName("Inspector.targetCrashed")
  var InspectorDottargetCrashed: js.Array[js.Any] = js.native
  /**
    * Fired when debugging target has reloaded after crash
    */
  @JSName("Inspector.targetReloadedAfterCrash")
  var InspectorDottargetReloadedAfterCrash: js.Array[js.Any] = js.native
  @JSName("LayerTree.layerPainted")
  var LayerTreeDotlayerPainted: js.Array[LayerPaintedEvent] = js.native
  @JSName("LayerTree.layerTreeDidChange")
  var LayerTreeDotlayerTreeDidChange: js.Array[LayerTreeDidChangeEvent] = js.native
  /**
    * Issued when new message was logged.
    */
  @JSName("Log.entryAdded")
  var LogDotentryAdded: js.Array[EntryAddedEvent] = js.native
  /**
    * Send a list of any errors that need to be delivered.
    */
  @JSName("Media.playerErrorsRaised")
  var MediaDotplayerErrorsRaised: js.Array[PlayerErrorsRaisedEvent] = js.native
  /**
    * Send events as a list, allowing them to be batched on the browser for less
    * congestion. If batched, events must ALWAYS be in chronological order.
    */
  @JSName("Media.playerEventsAdded")
  var MediaDotplayerEventsAdded: js.Array[PlayerEventsAddedEvent] = js.native
  /**
    * Send a list of any messages that need to be delivered.
    */
  @JSName("Media.playerMessagesLogged")
  var MediaDotplayerMessagesLogged: js.Array[PlayerMessagesLoggedEvent] = js.native
  /**
    * This can be called multiple times, and can be used to set / override /
    * remove player properties. A null propValue indicates removal.
    */
  @JSName("Media.playerPropertiesChanged")
  var MediaDotplayerPropertiesChanged: js.Array[PlayerPropertiesChangedEvent] = js.native
  /**
    * Called whenever a player is created, or when a new agent joins and recieves
    * a list of active players. If an agent is restored, it will recieve the full
    * list of player ids and all events again.
    */
  @JSName("Media.playersCreated")
  var MediaDotplayersCreated: js.Array[PlayersCreatedEvent] = js.native
  /**
    * Fired when data chunk was received over the network.
    */
  @JSName("Network.dataReceived")
  var NetworkDotdataReceived: js.Array[DataReceivedEvent] = js.native
  /**
    * Fired when EventSource message is received.
    */
  @JSName("Network.eventSourceMessageReceived")
  var NetworkDoteventSourceMessageReceived: js.Array[EventSourceMessageReceivedEvent] = js.native
  /**
    * Fired when HTTP request has failed to load.
    */
  @JSName("Network.loadingFailed")
  var NetworkDotloadingFailed: js.Array[LoadingFailedEvent] = js.native
  /**
    * Fired when HTTP request has finished loading.
    */
  @JSName("Network.loadingFinished")
  var NetworkDotloadingFinished: js.Array[LoadingFinishedEvent] = js.native
  /**
    * Details of an intercepted HTTP request, which must be either allowed, blocked, modified or
    * mocked.
    * Deprecated, use Fetch.requestPaused instead.
    */
  @JSName("Network.requestIntercepted")
  var NetworkDotrequestIntercepted: js.Array[RequestInterceptedEvent] = js.native
  /**
    * Fired if request ended up loading from cache.
    */
  @JSName("Network.requestServedFromCache")
  var NetworkDotrequestServedFromCache: js.Array[RequestServedFromCacheEvent] = js.native
  /**
    * Fired when page is about to send HTTP request.
    */
  @JSName("Network.requestWillBeSent")
  var NetworkDotrequestWillBeSent: js.Array[RequestWillBeSentEvent] = js.native
  /**
    * Fired when additional information about a requestWillBeSent event is available from the
    * network stack. Not every requestWillBeSent event will have an additional
    * requestWillBeSentExtraInfo fired for it, and there is no guarantee whether requestWillBeSent
    * or requestWillBeSentExtraInfo will be fired first for the same request.
    */
  @JSName("Network.requestWillBeSentExtraInfo")
  var NetworkDotrequestWillBeSentExtraInfo: js.Array[RequestWillBeSentExtraInfoEvent] = js.native
  /**
    * Fired when resource loading priority is changed
    */
  @JSName("Network.resourceChangedPriority")
  var NetworkDotresourceChangedPriority: js.Array[ResourceChangedPriorityEvent] = js.native
  /**
    * Fired when HTTP response is available.
    */
  @JSName("Network.responseReceived")
  var NetworkDotresponseReceived: js.Array[ResponseReceivedEvent] = js.native
  /**
    * Fired when additional information about a responseReceived event is available from the network
    * stack. Not every responseReceived event will have an additional responseReceivedExtraInfo for
    * it, and responseReceivedExtraInfo may be fired before or after responseReceived.
    */
  @JSName("Network.responseReceivedExtraInfo")
  var NetworkDotresponseReceivedExtraInfo: js.Array[ResponseReceivedExtraInfoEvent] = js.native
  /**
    * Fired when a signed exchange was received over the network
    */
  @JSName("Network.signedExchangeReceived")
  var NetworkDotsignedExchangeReceived: js.Array[SignedExchangeReceivedEvent] = js.native
  /**
    * Fired when WebSocket is closed.
    */
  @JSName("Network.webSocketClosed")
  var NetworkDotwebSocketClosed: js.Array[WebSocketClosedEvent] = js.native
  /**
    * Fired upon WebSocket creation.
    */
  @JSName("Network.webSocketCreated")
  var NetworkDotwebSocketCreated: js.Array[WebSocketCreatedEvent] = js.native
  /**
    * Fired when WebSocket message error occurs.
    */
  @JSName("Network.webSocketFrameError")
  var NetworkDotwebSocketFrameError: js.Array[WebSocketFrameErrorEvent] = js.native
  /**
    * Fired when WebSocket message is received.
    */
  @JSName("Network.webSocketFrameReceived")
  var NetworkDotwebSocketFrameReceived: js.Array[WebSocketFrameReceivedEvent] = js.native
  /**
    * Fired when WebSocket message is sent.
    */
  @JSName("Network.webSocketFrameSent")
  var NetworkDotwebSocketFrameSent: js.Array[WebSocketFrameSentEvent] = js.native
  /**
    * Fired when WebSocket handshake response becomes available.
    */
  @JSName("Network.webSocketHandshakeResponseReceived")
  var NetworkDotwebSocketHandshakeResponseReceived: js.Array[WebSocketHandshakeResponseReceivedEvent] = js.native
  /**
    * Fired when WebSocket is about to initiate handshake.
    */
  @JSName("Network.webSocketWillSendHandshakeRequest")
  var NetworkDotwebSocketWillSendHandshakeRequest: js.Array[WebSocketWillSendHandshakeRequestEvent] = js.native
  /**
    * Fired when user cancels the inspect mode.
    */
  @JSName("Overlay.inspectModeCanceled")
  var OverlayDotinspectModeCanceled: js.Array[js.Any] = js.native
  /**
    * Fired when the node should be inspected. This happens after call to `setInspectMode` or when
    * user manually inspects an element.
    */
  @JSName("Overlay.inspectNodeRequested")
  var OverlayDotinspectNodeRequested: js.Array[InspectNodeRequestedEvent] = js.native
  /**
    * Fired when the node should be highlighted. This happens after call to `setInspectMode`.
    */
  @JSName("Overlay.nodeHighlightRequested")
  var OverlayDotnodeHighlightRequested: js.Array[NodeHighlightRequestedEvent] = js.native
  /**
    * Fired when user asks to capture screenshot of some area on the page.
    */
  @JSName("Overlay.screenshotRequested")
  var OverlayDotscreenshotRequested: js.Array[ScreenshotRequestedEvent] = js.native
  /**
    * Issued for every compilation cache generated. Is only available
    * if Page.setGenerateCompilationCache is enabled.
    */
  @JSName("Page.compilationCacheProduced")
  var PageDotcompilationCacheProduced: js.Array[CompilationCacheProducedEvent] = js.native
  @JSName("Page.domContentEventFired")
  var PageDotdomContentEventFired: js.Array[DomContentEventFiredEvent] = js.native
  /**
    * Fired when download makes progress. Last call has |done| == true.
    */
  @JSName("Page.downloadProgress")
  var PageDotdownloadProgress: js.Array[DownloadProgressEvent] = js.native
  /**
    * Fired when page is about to start a download.
    */
  @JSName("Page.downloadWillBegin")
  var PageDotdownloadWillBegin: js.Array[DownloadWillBeginEvent] = js.native
  /**
    * Emitted only when `page.interceptFileChooser` is enabled.
    */
  @JSName("Page.fileChooserOpened")
  var PageDotfileChooserOpened: js.Array[FileChooserOpenedEvent] = js.native
  /**
    * Fired when frame has been attached to its parent.
    */
  @JSName("Page.frameAttached")
  var PageDotframeAttached: js.Array[FrameAttachedEvent] = js.native
  /**
    * Fired when frame no longer has a scheduled navigation.
    */
  @JSName("Page.frameClearedScheduledNavigation")
  var PageDotframeClearedScheduledNavigation: js.Array[FrameClearedScheduledNavigationEvent] = js.native
  /**
    * Fired when frame has been detached from its parent.
    */
  @JSName("Page.frameDetached")
  var PageDotframeDetached: js.Array[FrameDetachedEvent] = js.native
  /**
    * Fired once navigation of the frame has completed. Frame is now associated with the new loader.
    */
  @JSName("Page.frameNavigated")
  var PageDotframeNavigated: js.Array[FrameNavigatedEvent] = js.native
  /**
    * Fired when a renderer-initiated navigation is requested.
    * Navigation may still be cancelled after the event is issued.
    */
  @JSName("Page.frameRequestedNavigation")
  var PageDotframeRequestedNavigation: js.Array[FrameRequestedNavigationEvent] = js.native
  @JSName("Page.frameResized")
  var PageDotframeResized: js.Array[js.Any] = js.native
  /**
    * Fired when frame schedules a potential navigation.
    */
  @JSName("Page.frameScheduledNavigation")
  var PageDotframeScheduledNavigation: js.Array[FrameScheduledNavigationEvent] = js.native
  /**
    * Fired when frame has started loading.
    */
  @JSName("Page.frameStartedLoading")
  var PageDotframeStartedLoading: js.Array[FrameStartedLoadingEvent] = js.native
  /**
    * Fired when frame has stopped loading.
    */
  @JSName("Page.frameStoppedLoading")
  var PageDotframeStoppedLoading: js.Array[FrameStoppedLoadingEvent] = js.native
  /**
    * Fired when interstitial page was hidden
    */
  @JSName("Page.interstitialHidden")
  var PageDotinterstitialHidden: js.Array[js.Any] = js.native
  /**
    * Fired when interstitial page was shown
    */
  @JSName("Page.interstitialShown")
  var PageDotinterstitialShown: js.Array[js.Any] = js.native
  /**
    * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) has been
    * closed.
    */
  @JSName("Page.javascriptDialogClosed")
  var PageDotjavascriptDialogClosed: js.Array[JavascriptDialogClosedEvent] = js.native
  /**
    * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) is about to
    * open.
    */
  @JSName("Page.javascriptDialogOpening")
  var PageDotjavascriptDialogOpening: js.Array[JavascriptDialogOpeningEvent] = js.native
  /**
    * Fired for top level page lifecycle events such as navigation, load, paint, etc.
    */
  @JSName("Page.lifecycleEvent")
  var PageDotlifecycleEvent: js.Array[LifecycleEventEvent] = js.native
  @JSName("Page.loadEventFired")
  var PageDotloadEventFired: js.Array[LoadEventFiredEvent] = js.native
  /**
    * Fired when same-document navigation happens, e.g. due to history API usage or anchor navigation.
    */
  @JSName("Page.navigatedWithinDocument")
  var PageDotnavigatedWithinDocument: js.Array[NavigatedWithinDocumentEvent] = js.native
  /**
    * Compressed image data requested by the `startScreencast`.
    */
  @JSName("Page.screencastFrame")
  var PageDotscreencastFrame: js.Array[ScreencastFrameEvent] = js.native
  /**
    * Fired when the page with currently enabled screencast was shown or hidden `.
    */
  @JSName("Page.screencastVisibilityChanged")
  var PageDotscreencastVisibilityChanged: js.Array[ScreencastVisibilityChangedEvent] = js.native
  /**
    * Fired when a new window is going to be opened, via window.open(), link click, form submission,
    * etc.
    */
  @JSName("Page.windowOpen")
  var PageDotwindowOpen: js.Array[WindowOpenEvent] = js.native
  /**
    * Current values of the metrics.
    */
  @JSName("Performance.metrics")
  var PerformanceDotmetrics: js.Array[MetricsEvent] = js.native
  @JSName("Profiler.consoleProfileFinished")
  var ProfilerDotconsoleProfileFinished: js.Array[ConsoleProfileFinishedEvent] = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("Profiler.consoleProfileStarted")
  var ProfilerDotconsoleProfileStarted: js.Array[ConsoleProfileStartedEvent] = js.native
  /**
    * Reports coverage delta since the last poll (either from an event like this, or from
    * `takePreciseCoverage` for the current isolate. May only be sent if precise code
    * coverage has been started. This event can be trigged by the embedder to, for example,
    * trigger collection of coverage data immediatelly at a certain point in time.
    */
  @JSName("Profiler.preciseCoverageDeltaUpdate")
  var ProfilerDotpreciseCoverageDeltaUpdate: js.Array[PreciseCoverageDeltaUpdateEvent] = js.native
  /**
    * Notification is issued every time when binding is called.
    */
  @JSName("Runtime.bindingCalled")
  var RuntimeDotbindingCalled: js.Array[BindingCalledEvent] = js.native
  /**
    * Issued when console API was called.
    */
  @JSName("Runtime.consoleAPICalled")
  var RuntimeDotconsoleAPICalled: js.Array[ConsoleAPICalledEvent] = js.native
  /**
    * Issued when unhandled exception was revoked.
    */
  @JSName("Runtime.exceptionRevoked")
  var RuntimeDotexceptionRevoked: js.Array[ExceptionRevokedEvent] = js.native
  /**
    * Issued when exception was thrown and unhandled.
    */
  @JSName("Runtime.exceptionThrown")
  var RuntimeDotexceptionThrown: js.Array[ExceptionThrownEvent] = js.native
  /**
    * Issued when new execution context is created.
    */
  @JSName("Runtime.executionContextCreated")
  var RuntimeDotexecutionContextCreated: js.Array[ExecutionContextCreatedEvent] = js.native
  /**
    * Issued when execution context is destroyed.
    */
  @JSName("Runtime.executionContextDestroyed")
  var RuntimeDotexecutionContextDestroyed: js.Array[ExecutionContextDestroyedEvent] = js.native
  /**
    * Issued when all executionContexts were cleared in browser
    */
  @JSName("Runtime.executionContextsCleared")
  var RuntimeDotexecutionContextsCleared: js.Array[js.Any] = js.native
  /**
    * Issued when object should be inspected (for example, as a result of inspect() command line API
    * call).
    */
  @JSName("Runtime.inspectRequested")
  var RuntimeDotinspectRequested: js.Array[InspectRequestedEvent] = js.native
  /**
    * There is a certificate error. If overriding certificate errors is enabled, then it should be
    * handled with the `handleCertificateError` command. Note: this event does not fire if the
    * certificate error has been allowed internally. Only one client per target should override
    * certificate errors at the same time.
    */
  @JSName("Security.certificateError")
  var SecurityDotcertificateError: js.Array[CertificateErrorEvent] = js.native
  /**
    * The security state of the page changed.
    */
  @JSName("Security.securityStateChanged")
  var SecurityDotsecurityStateChanged: js.Array[SecurityStateChangedEvent] = js.native
  /**
    * The security state of the page changed.
    */
  @JSName("Security.visibleSecurityStateChanged")
  var SecurityDotvisibleSecurityStateChanged: js.Array[VisibleSecurityStateChangedEvent] = js.native
  @JSName("ServiceWorker.workerErrorReported")
  var ServiceWorkerDotworkerErrorReported: js.Array[WorkerErrorReportedEvent] = js.native
  @JSName("ServiceWorker.workerRegistrationUpdated")
  var ServiceWorkerDotworkerRegistrationUpdated: js.Array[WorkerRegistrationUpdatedEvent] = js.native
  @JSName("ServiceWorker.workerVersionUpdated")
  var ServiceWorkerDotworkerVersionUpdated: js.Array[WorkerVersionUpdatedEvent] = js.native
  /**
    * A cache's contents have been modified.
    */
  @JSName("Storage.cacheStorageContentUpdated")
  var StorageDotcacheStorageContentUpdated: js.Array[CacheStorageContentUpdatedEvent] = js.native
  /**
    * A cache has been added/deleted.
    */
  @JSName("Storage.cacheStorageListUpdated")
  var StorageDotcacheStorageListUpdated: js.Array[CacheStorageListUpdatedEvent] = js.native
  /**
    * The origin's IndexedDB object store has been modified.
    */
  @JSName("Storage.indexedDBContentUpdated")
  var StorageDotindexedDBContentUpdated: js.Array[IndexedDBContentUpdatedEvent] = js.native
  /**
    * The origin's IndexedDB database list has been modified.
    */
  @JSName("Storage.indexedDBListUpdated")
  var StorageDotindexedDBListUpdated: js.Array[IndexedDBListUpdatedEvent] = js.native
  /**
    * Issued when attached to target because of auto-attach or `attachToTarget` command.
    */
  @JSName("Target.attachedToTarget")
  var TargetDotattachedToTarget: js.Array[AttachedToTargetEvent] = js.native
  /**
    * Issued when detached from target for any reason (including `detachFromTarget` command). Can be
    * issued multiple times per target if multiple sessions have been attached to it.
    */
  @JSName("Target.detachedFromTarget")
  var TargetDotdetachedFromTarget: js.Array[DetachedFromTargetEvent] = js.native
  /**
    * Notifies about a new protocol message received from the session (as reported in
    * `attachedToTarget` event).
    */
  @JSName("Target.receivedMessageFromTarget")
  var TargetDotreceivedMessageFromTarget: js.Array[ReceivedMessageFromTargetEvent] = js.native
  /**
    * Issued when a target has crashed.
    */
  @JSName("Target.targetCrashed")
  var TargetDottargetCrashed: js.Array[TargetCrashedEvent] = js.native
  /**
    * Issued when a possible inspection target is created.
    */
  @JSName("Target.targetCreated")
  var TargetDottargetCreated: js.Array[TargetCreatedEvent] = js.native
  /**
    * Issued when a target is destroyed.
    */
  @JSName("Target.targetDestroyed")
  var TargetDottargetDestroyed: js.Array[TargetDestroyedEvent] = js.native
  /**
    * Issued when some information about a target has changed. This only happens between
    * `targetCreated` and `targetDestroyed`.
    */
  @JSName("Target.targetInfoChanged")
  var TargetDottargetInfoChanged: js.Array[TargetInfoChangedEvent] = js.native
  /**
    * Informs that port was successfully bound and got a specified connection id.
    */
  @JSName("Tethering.accepted")
  var TetheringDotaccepted: js.Array[AcceptedEvent] = js.native
  @JSName("Tracing.bufferUsage")
  var TracingDotbufferUsage: js.Array[BufferUsageEvent] = js.native
  /**
    * Contains an bucket of collected trace events. When tracing is stopped collected events will be
    * send as a sequence of dataCollected events followed by tracingComplete event.
    */
  @JSName("Tracing.dataCollected")
  var TracingDotdataCollected: js.Array[DataCollectedEvent] = js.native
  /**
    * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
    * delivered via dataCollected events.
    */
  @JSName("Tracing.tracingComplete")
  var TracingDottracingComplete: js.Array[TracingCompleteEvent] = js.native
  /**
    * Notifies that the construction of an AudioListener has finished.
    */
  @JSName("WebAudio.audioListenerCreated")
  var WebAudioDotaudioListenerCreated: js.Array[AudioListenerCreatedEvent] = js.native
  /**
    * Notifies that a new AudioListener has been created.
    */
  @JSName("WebAudio.audioListenerWillBeDestroyed")
  var WebAudioDotaudioListenerWillBeDestroyed: js.Array[AudioListenerWillBeDestroyedEvent] = js.native
  /**
    * Notifies that a new AudioNode has been created.
    */
  @JSName("WebAudio.audioNodeCreated")
  var WebAudioDotaudioNodeCreated: js.Array[AudioNodeCreatedEvent] = js.native
  /**
    * Notifies that an existing AudioNode has been destroyed.
    */
  @JSName("WebAudio.audioNodeWillBeDestroyed")
  var WebAudioDotaudioNodeWillBeDestroyed: js.Array[AudioNodeWillBeDestroyedEvent] = js.native
  /**
    * Notifies that a new AudioParam has been created.
    */
  @JSName("WebAudio.audioParamCreated")
  var WebAudioDotaudioParamCreated: js.Array[AudioParamCreatedEvent] = js.native
  /**
    * Notifies that an existing AudioParam has been destroyed.
    */
  @JSName("WebAudio.audioParamWillBeDestroyed")
  var WebAudioDotaudioParamWillBeDestroyed: js.Array[AudioParamWillBeDestroyedEvent] = js.native
  /**
    * Notifies that existing BaseAudioContext has changed some properties (id stays the same)..
    */
  @JSName("WebAudio.contextChanged")
  var WebAudioDotcontextChanged: js.Array[ContextChangedEvent] = js.native
  /**
    * Notifies that a new BaseAudioContext has been created.
    */
  @JSName("WebAudio.contextCreated")
  var WebAudioDotcontextCreated: js.Array[ContextCreatedEvent] = js.native
  /**
    * Notifies that an existing BaseAudioContext will be destroyed.
    */
  @JSName("WebAudio.contextWillBeDestroyed")
  var WebAudioDotcontextWillBeDestroyed: js.Array[ContextWillBeDestroyedEvent] = js.native
  /**
    * Notifies that an AudioNode is connected to an AudioParam.
    */
  @JSName("WebAudio.nodeParamConnected")
  var WebAudioDotnodeParamConnected: js.Array[NodeParamConnectedEvent] = js.native
  /**
    * Notifies that an AudioNode is disconnected to an AudioParam.
    */
  @JSName("WebAudio.nodeParamDisconnected")
  var WebAudioDotnodeParamDisconnected: js.Array[NodeParamDisconnectedEvent] = js.native
  /**
    * Notifies that two AudioNodes are connected.
    */
  @JSName("WebAudio.nodesConnected")
  var WebAudioDotnodesConnected: js.Array[NodesConnectedEvent] = js.native
  /**
    * Notifies that AudioNodes are disconnected. The destination can be null, and it means all the outgoing connections from the source are disconnected.
    */
  @JSName("WebAudio.nodesDisconnected")
  var WebAudioDotnodesDisconnected: js.Array[NodesDisconnectedEvent] = js.native
}

object Events {
  @scala.inline
  def apply(
    AnimationDotanimationCanceled: js.Array[AnimationCanceledEvent],
    AnimationDotanimationCreated: js.Array[AnimationCreatedEvent],
    AnimationDotanimationStarted: js.Array[AnimationStartedEvent],
    ApplicationCacheDotapplicationCacheStatusUpdated: js.Array[ApplicationCacheStatusUpdatedEvent],
    ApplicationCacheDotnetworkStateUpdated: js.Array[NetworkStateUpdatedEvent],
    AuditsDotissueAdded: js.Array[IssueAddedEvent],
    BackgroundServiceDotbackgroundServiceEventReceived: js.Array[BackgroundServiceEventReceivedEvent],
    BackgroundServiceDotrecordingStateChanged: js.Array[RecordingStateChangedEvent],
    CSSDotfontsUpdated: js.Array[FontsUpdatedEvent],
    CSSDotmediaQueryResultChanged: js.Array[js.Any],
    CSSDotstyleSheetAdded: js.Array[StyleSheetAddedEvent],
    CSSDotstyleSheetChanged: js.Array[StyleSheetChangedEvent],
    CSSDotstyleSheetRemoved: js.Array[StyleSheetRemovedEvent],
    CastDotissueUpdated: js.Array[IssueUpdatedEvent],
    CastDotsinksUpdated: js.Array[SinksUpdatedEvent],
    ConsoleDotmessageAdded: js.Array[MessageAddedEvent],
    DOMDotattributeModified: js.Array[AttributeModifiedEvent],
    DOMDotattributeRemoved: js.Array[AttributeRemovedEvent],
    DOMDotcharacterDataModified: js.Array[CharacterDataModifiedEvent],
    DOMDotchildNodeCountUpdated: js.Array[ChildNodeCountUpdatedEvent],
    DOMDotchildNodeInserted: js.Array[ChildNodeInsertedEvent],
    DOMDotchildNodeRemoved: js.Array[ChildNodeRemovedEvent],
    DOMDotdistributedNodesUpdated: js.Array[DistributedNodesUpdatedEvent],
    DOMDotdocumentUpdated: js.Array[js.Any],
    DOMDotinlineStyleInvalidated: js.Array[InlineStyleInvalidatedEvent],
    DOMDotpseudoElementAdded: js.Array[PseudoElementAddedEvent],
    DOMDotpseudoElementRemoved: js.Array[PseudoElementRemovedEvent],
    DOMDotsetChildNodes: js.Array[SetChildNodesEvent],
    DOMDotshadowRootPopped: js.Array[ShadowRootPoppedEvent],
    DOMDotshadowRootPushed: js.Array[ShadowRootPushedEvent],
    DOMStorageDotdomStorageItemAdded: js.Array[DomStorageItemAddedEvent],
    DOMStorageDotdomStorageItemRemoved: js.Array[DomStorageItemRemovedEvent],
    DOMStorageDotdomStorageItemUpdated: js.Array[DomStorageItemUpdatedEvent],
    DOMStorageDotdomStorageItemsCleared: js.Array[DomStorageItemsClearedEvent],
    DatabaseDotaddDatabase: js.Array[AddDatabaseEvent],
    DebuggerDotbreakpointResolved: js.Array[BreakpointResolvedEvent],
    DebuggerDotpaused: js.Array[PausedEvent],
    DebuggerDotresumed: js.Array[js.Any],
    DebuggerDotscriptFailedToParse: js.Array[ScriptFailedToParseEvent],
    DebuggerDotscriptParsed: js.Array[ScriptParsedEvent],
    EmulationDotvirtualTimeBudgetExpired: js.Array[js.Any],
    FetchDotauthRequired: js.Array[AuthRequiredEvent],
    FetchDotrequestPaused: js.Array[RequestPausedEvent],
    HeadlessExperimentalDotneedsBeginFramesChanged: js.Array[NeedsBeginFramesChangedEvent],
    HeapProfilerDotaddHeapSnapshotChunk: js.Array[AddHeapSnapshotChunkEvent],
    HeapProfilerDotheapStatsUpdate: js.Array[HeapStatsUpdateEvent],
    HeapProfilerDotlastSeenObjectId: js.Array[LastSeenObjectIdEvent],
    HeapProfilerDotreportHeapSnapshotProgress: js.Array[ReportHeapSnapshotProgressEvent],
    HeapProfilerDotresetProfiles: js.Array[js.Any],
    InspectorDotdetached: js.Array[DetachedEvent],
    InspectorDottargetCrashed: js.Array[js.Any],
    InspectorDottargetReloadedAfterCrash: js.Array[js.Any],
    LayerTreeDotlayerPainted: js.Array[LayerPaintedEvent],
    LayerTreeDotlayerTreeDidChange: js.Array[LayerTreeDidChangeEvent],
    LogDotentryAdded: js.Array[EntryAddedEvent],
    MediaDotplayerErrorsRaised: js.Array[PlayerErrorsRaisedEvent],
    MediaDotplayerEventsAdded: js.Array[PlayerEventsAddedEvent],
    MediaDotplayerMessagesLogged: js.Array[PlayerMessagesLoggedEvent],
    MediaDotplayerPropertiesChanged: js.Array[PlayerPropertiesChangedEvent],
    MediaDotplayersCreated: js.Array[PlayersCreatedEvent],
    NetworkDotdataReceived: js.Array[DataReceivedEvent],
    NetworkDoteventSourceMessageReceived: js.Array[EventSourceMessageReceivedEvent],
    NetworkDotloadingFailed: js.Array[LoadingFailedEvent],
    NetworkDotloadingFinished: js.Array[LoadingFinishedEvent],
    NetworkDotrequestIntercepted: js.Array[RequestInterceptedEvent],
    NetworkDotrequestServedFromCache: js.Array[RequestServedFromCacheEvent],
    NetworkDotrequestWillBeSent: js.Array[RequestWillBeSentEvent],
    NetworkDotrequestWillBeSentExtraInfo: js.Array[RequestWillBeSentExtraInfoEvent],
    NetworkDotresourceChangedPriority: js.Array[ResourceChangedPriorityEvent],
    NetworkDotresponseReceived: js.Array[ResponseReceivedEvent],
    NetworkDotresponseReceivedExtraInfo: js.Array[ResponseReceivedExtraInfoEvent],
    NetworkDotsignedExchangeReceived: js.Array[SignedExchangeReceivedEvent],
    NetworkDotwebSocketClosed: js.Array[WebSocketClosedEvent],
    NetworkDotwebSocketCreated: js.Array[WebSocketCreatedEvent],
    NetworkDotwebSocketFrameError: js.Array[WebSocketFrameErrorEvent],
    NetworkDotwebSocketFrameReceived: js.Array[WebSocketFrameReceivedEvent],
    NetworkDotwebSocketFrameSent: js.Array[WebSocketFrameSentEvent],
    NetworkDotwebSocketHandshakeResponseReceived: js.Array[WebSocketHandshakeResponseReceivedEvent],
    NetworkDotwebSocketWillSendHandshakeRequest: js.Array[WebSocketWillSendHandshakeRequestEvent],
    OverlayDotinspectModeCanceled: js.Array[js.Any],
    OverlayDotinspectNodeRequested: js.Array[InspectNodeRequestedEvent],
    OverlayDotnodeHighlightRequested: js.Array[NodeHighlightRequestedEvent],
    OverlayDotscreenshotRequested: js.Array[ScreenshotRequestedEvent],
    PageDotcompilationCacheProduced: js.Array[CompilationCacheProducedEvent],
    PageDotdomContentEventFired: js.Array[DomContentEventFiredEvent],
    PageDotdownloadProgress: js.Array[DownloadProgressEvent],
    PageDotdownloadWillBegin: js.Array[DownloadWillBeginEvent],
    PageDotfileChooserOpened: js.Array[FileChooserOpenedEvent],
    PageDotframeAttached: js.Array[FrameAttachedEvent],
    PageDotframeClearedScheduledNavigation: js.Array[FrameClearedScheduledNavigationEvent],
    PageDotframeDetached: js.Array[FrameDetachedEvent],
    PageDotframeNavigated: js.Array[FrameNavigatedEvent],
    PageDotframeRequestedNavigation: js.Array[FrameRequestedNavigationEvent],
    PageDotframeResized: js.Array[js.Any],
    PageDotframeScheduledNavigation: js.Array[FrameScheduledNavigationEvent],
    PageDotframeStartedLoading: js.Array[FrameStartedLoadingEvent],
    PageDotframeStoppedLoading: js.Array[FrameStoppedLoadingEvent],
    PageDotinterstitialHidden: js.Array[js.Any],
    PageDotinterstitialShown: js.Array[js.Any],
    PageDotjavascriptDialogClosed: js.Array[JavascriptDialogClosedEvent],
    PageDotjavascriptDialogOpening: js.Array[JavascriptDialogOpeningEvent],
    PageDotlifecycleEvent: js.Array[LifecycleEventEvent],
    PageDotloadEventFired: js.Array[LoadEventFiredEvent],
    PageDotnavigatedWithinDocument: js.Array[NavigatedWithinDocumentEvent],
    PageDotscreencastFrame: js.Array[ScreencastFrameEvent],
    PageDotscreencastVisibilityChanged: js.Array[ScreencastVisibilityChangedEvent],
    PageDotwindowOpen: js.Array[WindowOpenEvent],
    PerformanceDotmetrics: js.Array[MetricsEvent],
    ProfilerDotconsoleProfileFinished: js.Array[ConsoleProfileFinishedEvent],
    ProfilerDotconsoleProfileStarted: js.Array[ConsoleProfileStartedEvent],
    ProfilerDotpreciseCoverageDeltaUpdate: js.Array[PreciseCoverageDeltaUpdateEvent],
    RuntimeDotbindingCalled: js.Array[BindingCalledEvent],
    RuntimeDotconsoleAPICalled: js.Array[ConsoleAPICalledEvent],
    RuntimeDotexceptionRevoked: js.Array[ExceptionRevokedEvent],
    RuntimeDotexceptionThrown: js.Array[ExceptionThrownEvent],
    RuntimeDotexecutionContextCreated: js.Array[ExecutionContextCreatedEvent],
    RuntimeDotexecutionContextDestroyed: js.Array[ExecutionContextDestroyedEvent],
    RuntimeDotexecutionContextsCleared: js.Array[js.Any],
    RuntimeDotinspectRequested: js.Array[InspectRequestedEvent],
    SecurityDotcertificateError: js.Array[CertificateErrorEvent],
    SecurityDotsecurityStateChanged: js.Array[SecurityStateChangedEvent],
    SecurityDotvisibleSecurityStateChanged: js.Array[VisibleSecurityStateChangedEvent],
    ServiceWorkerDotworkerErrorReported: js.Array[WorkerErrorReportedEvent],
    ServiceWorkerDotworkerRegistrationUpdated: js.Array[WorkerRegistrationUpdatedEvent],
    ServiceWorkerDotworkerVersionUpdated: js.Array[WorkerVersionUpdatedEvent],
    StorageDotcacheStorageContentUpdated: js.Array[CacheStorageContentUpdatedEvent],
    StorageDotcacheStorageListUpdated: js.Array[CacheStorageListUpdatedEvent],
    StorageDotindexedDBContentUpdated: js.Array[IndexedDBContentUpdatedEvent],
    StorageDotindexedDBListUpdated: js.Array[IndexedDBListUpdatedEvent],
    TargetDotattachedToTarget: js.Array[AttachedToTargetEvent],
    TargetDotdetachedFromTarget: js.Array[DetachedFromTargetEvent],
    TargetDotreceivedMessageFromTarget: js.Array[ReceivedMessageFromTargetEvent],
    TargetDottargetCrashed: js.Array[TargetCrashedEvent],
    TargetDottargetCreated: js.Array[TargetCreatedEvent],
    TargetDottargetDestroyed: js.Array[TargetDestroyedEvent],
    TargetDottargetInfoChanged: js.Array[TargetInfoChangedEvent],
    TetheringDotaccepted: js.Array[AcceptedEvent],
    TracingDotbufferUsage: js.Array[BufferUsageEvent],
    TracingDotdataCollected: js.Array[DataCollectedEvent],
    TracingDottracingComplete: js.Array[TracingCompleteEvent],
    WebAudioDotaudioListenerCreated: js.Array[AudioListenerCreatedEvent],
    WebAudioDotaudioListenerWillBeDestroyed: js.Array[AudioListenerWillBeDestroyedEvent],
    WebAudioDotaudioNodeCreated: js.Array[AudioNodeCreatedEvent],
    WebAudioDotaudioNodeWillBeDestroyed: js.Array[AudioNodeWillBeDestroyedEvent],
    WebAudioDotaudioParamCreated: js.Array[AudioParamCreatedEvent],
    WebAudioDotaudioParamWillBeDestroyed: js.Array[AudioParamWillBeDestroyedEvent],
    WebAudioDotcontextChanged: js.Array[ContextChangedEvent],
    WebAudioDotcontextCreated: js.Array[ContextCreatedEvent],
    WebAudioDotcontextWillBeDestroyed: js.Array[ContextWillBeDestroyedEvent],
    WebAudioDotnodeParamConnected: js.Array[NodeParamConnectedEvent],
    WebAudioDotnodeParamDisconnected: js.Array[NodeParamDisconnectedEvent],
    WebAudioDotnodesConnected: js.Array[NodesConnectedEvent],
    WebAudioDotnodesDisconnected: js.Array[NodesDisconnectedEvent]
  ): Events = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Animation.animationCanceled")(AnimationDotanimationCanceled.asInstanceOf[js.Any])
    __obj.updateDynamic("Animation.animationCreated")(AnimationDotanimationCreated.asInstanceOf[js.Any])
    __obj.updateDynamic("Animation.animationStarted")(AnimationDotanimationStarted.asInstanceOf[js.Any])
    __obj.updateDynamic("ApplicationCache.applicationCacheStatusUpdated")(ApplicationCacheDotapplicationCacheStatusUpdated.asInstanceOf[js.Any])
    __obj.updateDynamic("ApplicationCache.networkStateUpdated")(ApplicationCacheDotnetworkStateUpdated.asInstanceOf[js.Any])
    __obj.updateDynamic("Audits.issueAdded")(AuditsDotissueAdded.asInstanceOf[js.Any])
    __obj.updateDynamic("BackgroundService.backgroundServiceEventReceived")(BackgroundServiceDotbackgroundServiceEventReceived.asInstanceOf[js.Any])
    __obj.updateDynamic("BackgroundService.recordingStateChanged")(BackgroundServiceDotrecordingStateChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.fontsUpdated")(CSSDotfontsUpdated.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.mediaQueryResultChanged")(CSSDotmediaQueryResultChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.styleSheetAdded")(CSSDotstyleSheetAdded.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.styleSheetChanged")(CSSDotstyleSheetChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("CSS.styleSheetRemoved")(CSSDotstyleSheetRemoved.asInstanceOf[js.Any])
    __obj.updateDynamic("Cast.issueUpdated")(CastDotissueUpdated.asInstanceOf[js.Any])
    __obj.updateDynamic("Cast.sinksUpdated")(CastDotsinksUpdated.asInstanceOf[js.Any])
    __obj.updateDynamic("Console.messageAdded")(ConsoleDotmessageAdded.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.attributeModified")(DOMDotattributeModified.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.attributeRemoved")(DOMDotattributeRemoved.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.characterDataModified")(DOMDotcharacterDataModified.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.childNodeCountUpdated")(DOMDotchildNodeCountUpdated.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.childNodeInserted")(DOMDotchildNodeInserted.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.childNodeRemoved")(DOMDotchildNodeRemoved.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.distributedNodesUpdated")(DOMDotdistributedNodesUpdated.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.documentUpdated")(DOMDotdocumentUpdated.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.inlineStyleInvalidated")(DOMDotinlineStyleInvalidated.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.pseudoElementAdded")(DOMDotpseudoElementAdded.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.pseudoElementRemoved")(DOMDotpseudoElementRemoved.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.setChildNodes")(DOMDotsetChildNodes.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.shadowRootPopped")(DOMDotshadowRootPopped.asInstanceOf[js.Any])
    __obj.updateDynamic("DOM.shadowRootPushed")(DOMDotshadowRootPushed.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMStorage.domStorageItemAdded")(DOMStorageDotdomStorageItemAdded.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMStorage.domStorageItemRemoved")(DOMStorageDotdomStorageItemRemoved.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMStorage.domStorageItemUpdated")(DOMStorageDotdomStorageItemUpdated.asInstanceOf[js.Any])
    __obj.updateDynamic("DOMStorage.domStorageItemsCleared")(DOMStorageDotdomStorageItemsCleared.asInstanceOf[js.Any])
    __obj.updateDynamic("Database.addDatabase")(DatabaseDotaddDatabase.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.breakpointResolved")(DebuggerDotbreakpointResolved.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.paused")(DebuggerDotpaused.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.resumed")(DebuggerDotresumed.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.scriptFailedToParse")(DebuggerDotscriptFailedToParse.asInstanceOf[js.Any])
    __obj.updateDynamic("Debugger.scriptParsed")(DebuggerDotscriptParsed.asInstanceOf[js.Any])
    __obj.updateDynamic("Emulation.virtualTimeBudgetExpired")(EmulationDotvirtualTimeBudgetExpired.asInstanceOf[js.Any])
    __obj.updateDynamic("Fetch.authRequired")(FetchDotauthRequired.asInstanceOf[js.Any])
    __obj.updateDynamic("Fetch.requestPaused")(FetchDotrequestPaused.asInstanceOf[js.Any])
    __obj.updateDynamic("HeadlessExperimental.needsBeginFramesChanged")(HeadlessExperimentalDotneedsBeginFramesChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("HeapProfiler.addHeapSnapshotChunk")(HeapProfilerDotaddHeapSnapshotChunk.asInstanceOf[js.Any])
    __obj.updateDynamic("HeapProfiler.heapStatsUpdate")(HeapProfilerDotheapStatsUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("HeapProfiler.lastSeenObjectId")(HeapProfilerDotlastSeenObjectId.asInstanceOf[js.Any])
    __obj.updateDynamic("HeapProfiler.reportHeapSnapshotProgress")(HeapProfilerDotreportHeapSnapshotProgress.asInstanceOf[js.Any])
    __obj.updateDynamic("HeapProfiler.resetProfiles")(HeapProfilerDotresetProfiles.asInstanceOf[js.Any])
    __obj.updateDynamic("Inspector.detached")(InspectorDotdetached.asInstanceOf[js.Any])
    __obj.updateDynamic("Inspector.targetCrashed")(InspectorDottargetCrashed.asInstanceOf[js.Any])
    __obj.updateDynamic("Inspector.targetReloadedAfterCrash")(InspectorDottargetReloadedAfterCrash.asInstanceOf[js.Any])
    __obj.updateDynamic("LayerTree.layerPainted")(LayerTreeDotlayerPainted.asInstanceOf[js.Any])
    __obj.updateDynamic("LayerTree.layerTreeDidChange")(LayerTreeDotlayerTreeDidChange.asInstanceOf[js.Any])
    __obj.updateDynamic("Log.entryAdded")(LogDotentryAdded.asInstanceOf[js.Any])
    __obj.updateDynamic("Media.playerErrorsRaised")(MediaDotplayerErrorsRaised.asInstanceOf[js.Any])
    __obj.updateDynamic("Media.playerEventsAdded")(MediaDotplayerEventsAdded.asInstanceOf[js.Any])
    __obj.updateDynamic("Media.playerMessagesLogged")(MediaDotplayerMessagesLogged.asInstanceOf[js.Any])
    __obj.updateDynamic("Media.playerPropertiesChanged")(MediaDotplayerPropertiesChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("Media.playersCreated")(MediaDotplayersCreated.asInstanceOf[js.Any])
    __obj.updateDynamic("Network.dataReceived")(NetworkDotdataReceived.asInstanceOf[js.Any])
    __obj.updateDynamic("Network.eventSourceMessageReceived")(NetworkDoteventSourceMessageReceived.asInstanceOf[js.Any])
    __obj.updateDynamic("Network.loadingFailed")(NetworkDotloadingFailed.asInstanceOf[js.Any])
    __obj.updateDynamic("Network.loadingFinished")(NetworkDotloadingFinished.asInstanceOf[js.Any])
    __obj.updateDynamic("Network.requestIntercepted")(NetworkDotrequestIntercepted.asInstanceOf[js.Any])
    __obj.updateDynamic("Network.requestServedFromCache")(NetworkDotrequestServedFromCache.asInstanceOf[js.Any])
    __obj.updateDynamic("Network.requestWillBeSent")(NetworkDotrequestWillBeSent.asInstanceOf[js.Any])
    __obj.updateDynamic("Network.requestWillBeSentExtraInfo")(NetworkDotrequestWillBeSentExtraInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("Network.resourceChangedPriority")(NetworkDotresourceChangedPriority.asInstanceOf[js.Any])
    __obj.updateDynamic("Network.responseReceived")(NetworkDotresponseReceived.asInstanceOf[js.Any])
    __obj.updateDynamic("Network.responseReceivedExtraInfo")(NetworkDotresponseReceivedExtraInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("Network.signedExchangeReceived")(NetworkDotsignedExchangeReceived.asInstanceOf[js.Any])
    __obj.updateDynamic("Network.webSocketClosed")(NetworkDotwebSocketClosed.asInstanceOf[js.Any])
    __obj.updateDynamic("Network.webSocketCreated")(NetworkDotwebSocketCreated.asInstanceOf[js.Any])
    __obj.updateDynamic("Network.webSocketFrameError")(NetworkDotwebSocketFrameError.asInstanceOf[js.Any])
    __obj.updateDynamic("Network.webSocketFrameReceived")(NetworkDotwebSocketFrameReceived.asInstanceOf[js.Any])
    __obj.updateDynamic("Network.webSocketFrameSent")(NetworkDotwebSocketFrameSent.asInstanceOf[js.Any])
    __obj.updateDynamic("Network.webSocketHandshakeResponseReceived")(NetworkDotwebSocketHandshakeResponseReceived.asInstanceOf[js.Any])
    __obj.updateDynamic("Network.webSocketWillSendHandshakeRequest")(NetworkDotwebSocketWillSendHandshakeRequest.asInstanceOf[js.Any])
    __obj.updateDynamic("Overlay.inspectModeCanceled")(OverlayDotinspectModeCanceled.asInstanceOf[js.Any])
    __obj.updateDynamic("Overlay.inspectNodeRequested")(OverlayDotinspectNodeRequested.asInstanceOf[js.Any])
    __obj.updateDynamic("Overlay.nodeHighlightRequested")(OverlayDotnodeHighlightRequested.asInstanceOf[js.Any])
    __obj.updateDynamic("Overlay.screenshotRequested")(OverlayDotscreenshotRequested.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.compilationCacheProduced")(PageDotcompilationCacheProduced.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.domContentEventFired")(PageDotdomContentEventFired.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.downloadProgress")(PageDotdownloadProgress.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.downloadWillBegin")(PageDotdownloadWillBegin.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.fileChooserOpened")(PageDotfileChooserOpened.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.frameAttached")(PageDotframeAttached.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.frameClearedScheduledNavigation")(PageDotframeClearedScheduledNavigation.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.frameDetached")(PageDotframeDetached.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.frameNavigated")(PageDotframeNavigated.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.frameRequestedNavigation")(PageDotframeRequestedNavigation.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.frameResized")(PageDotframeResized.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.frameScheduledNavigation")(PageDotframeScheduledNavigation.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.frameStartedLoading")(PageDotframeStartedLoading.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.frameStoppedLoading")(PageDotframeStoppedLoading.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.interstitialHidden")(PageDotinterstitialHidden.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.interstitialShown")(PageDotinterstitialShown.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.javascriptDialogClosed")(PageDotjavascriptDialogClosed.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.javascriptDialogOpening")(PageDotjavascriptDialogOpening.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.lifecycleEvent")(PageDotlifecycleEvent.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.loadEventFired")(PageDotloadEventFired.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.navigatedWithinDocument")(PageDotnavigatedWithinDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.screencastFrame")(PageDotscreencastFrame.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.screencastVisibilityChanged")(PageDotscreencastVisibilityChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("Page.windowOpen")(PageDotwindowOpen.asInstanceOf[js.Any])
    __obj.updateDynamic("Performance.metrics")(PerformanceDotmetrics.asInstanceOf[js.Any])
    __obj.updateDynamic("Profiler.consoleProfileFinished")(ProfilerDotconsoleProfileFinished.asInstanceOf[js.Any])
    __obj.updateDynamic("Profiler.consoleProfileStarted")(ProfilerDotconsoleProfileStarted.asInstanceOf[js.Any])
    __obj.updateDynamic("Profiler.preciseCoverageDeltaUpdate")(ProfilerDotpreciseCoverageDeltaUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("Runtime.bindingCalled")(RuntimeDotbindingCalled.asInstanceOf[js.Any])
    __obj.updateDynamic("Runtime.consoleAPICalled")(RuntimeDotconsoleAPICalled.asInstanceOf[js.Any])
    __obj.updateDynamic("Runtime.exceptionRevoked")(RuntimeDotexceptionRevoked.asInstanceOf[js.Any])
    __obj.updateDynamic("Runtime.exceptionThrown")(RuntimeDotexceptionThrown.asInstanceOf[js.Any])
    __obj.updateDynamic("Runtime.executionContextCreated")(RuntimeDotexecutionContextCreated.asInstanceOf[js.Any])
    __obj.updateDynamic("Runtime.executionContextDestroyed")(RuntimeDotexecutionContextDestroyed.asInstanceOf[js.Any])
    __obj.updateDynamic("Runtime.executionContextsCleared")(RuntimeDotexecutionContextsCleared.asInstanceOf[js.Any])
    __obj.updateDynamic("Runtime.inspectRequested")(RuntimeDotinspectRequested.asInstanceOf[js.Any])
    __obj.updateDynamic("Security.certificateError")(SecurityDotcertificateError.asInstanceOf[js.Any])
    __obj.updateDynamic("Security.securityStateChanged")(SecurityDotsecurityStateChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("Security.visibleSecurityStateChanged")(SecurityDotvisibleSecurityStateChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("ServiceWorker.workerErrorReported")(ServiceWorkerDotworkerErrorReported.asInstanceOf[js.Any])
    __obj.updateDynamic("ServiceWorker.workerRegistrationUpdated")(ServiceWorkerDotworkerRegistrationUpdated.asInstanceOf[js.Any])
    __obj.updateDynamic("ServiceWorker.workerVersionUpdated")(ServiceWorkerDotworkerVersionUpdated.asInstanceOf[js.Any])
    __obj.updateDynamic("Storage.cacheStorageContentUpdated")(StorageDotcacheStorageContentUpdated.asInstanceOf[js.Any])
    __obj.updateDynamic("Storage.cacheStorageListUpdated")(StorageDotcacheStorageListUpdated.asInstanceOf[js.Any])
    __obj.updateDynamic("Storage.indexedDBContentUpdated")(StorageDotindexedDBContentUpdated.asInstanceOf[js.Any])
    __obj.updateDynamic("Storage.indexedDBListUpdated")(StorageDotindexedDBListUpdated.asInstanceOf[js.Any])
    __obj.updateDynamic("Target.attachedToTarget")(TargetDotattachedToTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("Target.detachedFromTarget")(TargetDotdetachedFromTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("Target.receivedMessageFromTarget")(TargetDotreceivedMessageFromTarget.asInstanceOf[js.Any])
    __obj.updateDynamic("Target.targetCrashed")(TargetDottargetCrashed.asInstanceOf[js.Any])
    __obj.updateDynamic("Target.targetCreated")(TargetDottargetCreated.asInstanceOf[js.Any])
    __obj.updateDynamic("Target.targetDestroyed")(TargetDottargetDestroyed.asInstanceOf[js.Any])
    __obj.updateDynamic("Target.targetInfoChanged")(TargetDottargetInfoChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("Tethering.accepted")(TetheringDotaccepted.asInstanceOf[js.Any])
    __obj.updateDynamic("Tracing.bufferUsage")(TracingDotbufferUsage.asInstanceOf[js.Any])
    __obj.updateDynamic("Tracing.dataCollected")(TracingDotdataCollected.asInstanceOf[js.Any])
    __obj.updateDynamic("Tracing.tracingComplete")(TracingDottracingComplete.asInstanceOf[js.Any])
    __obj.updateDynamic("WebAudio.audioListenerCreated")(WebAudioDotaudioListenerCreated.asInstanceOf[js.Any])
    __obj.updateDynamic("WebAudio.audioListenerWillBeDestroyed")(WebAudioDotaudioListenerWillBeDestroyed.asInstanceOf[js.Any])
    __obj.updateDynamic("WebAudio.audioNodeCreated")(WebAudioDotaudioNodeCreated.asInstanceOf[js.Any])
    __obj.updateDynamic("WebAudio.audioNodeWillBeDestroyed")(WebAudioDotaudioNodeWillBeDestroyed.asInstanceOf[js.Any])
    __obj.updateDynamic("WebAudio.audioParamCreated")(WebAudioDotaudioParamCreated.asInstanceOf[js.Any])
    __obj.updateDynamic("WebAudio.audioParamWillBeDestroyed")(WebAudioDotaudioParamWillBeDestroyed.asInstanceOf[js.Any])
    __obj.updateDynamic("WebAudio.contextChanged")(WebAudioDotcontextChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("WebAudio.contextCreated")(WebAudioDotcontextCreated.asInstanceOf[js.Any])
    __obj.updateDynamic("WebAudio.contextWillBeDestroyed")(WebAudioDotcontextWillBeDestroyed.asInstanceOf[js.Any])
    __obj.updateDynamic("WebAudio.nodeParamConnected")(WebAudioDotnodeParamConnected.asInstanceOf[js.Any])
    __obj.updateDynamic("WebAudio.nodeParamDisconnected")(WebAudioDotnodeParamDisconnected.asInstanceOf[js.Any])
    __obj.updateDynamic("WebAudio.nodesConnected")(WebAudioDotnodesConnected.asInstanceOf[js.Any])
    __obj.updateDynamic("WebAudio.nodesDisconnected")(WebAudioDotnodesDisconnected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
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
    def setAnimationDotanimationCanceledVarargs(value: AnimationCanceledEvent*): Self = this.set("Animation.animationCanceled", js.Array(value :_*))
    @scala.inline
    def setAnimationDotanimationCanceled(value: js.Array[AnimationCanceledEvent]): Self = this.set("Animation.animationCanceled", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationDotanimationCreatedVarargs(value: AnimationCreatedEvent*): Self = this.set("Animation.animationCreated", js.Array(value :_*))
    @scala.inline
    def setAnimationDotanimationCreated(value: js.Array[AnimationCreatedEvent]): Self = this.set("Animation.animationCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationDotanimationStartedVarargs(value: AnimationStartedEvent*): Self = this.set("Animation.animationStarted", js.Array(value :_*))
    @scala.inline
    def setAnimationDotanimationStarted(value: js.Array[AnimationStartedEvent]): Self = this.set("Animation.animationStarted", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplicationCacheDotapplicationCacheStatusUpdatedVarargs(value: ApplicationCacheStatusUpdatedEvent*): Self = this.set("ApplicationCache.applicationCacheStatusUpdated", js.Array(value :_*))
    @scala.inline
    def setApplicationCacheDotapplicationCacheStatusUpdated(value: js.Array[ApplicationCacheStatusUpdatedEvent]): Self = this.set("ApplicationCache.applicationCacheStatusUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplicationCacheDotnetworkStateUpdatedVarargs(value: NetworkStateUpdatedEvent*): Self = this.set("ApplicationCache.networkStateUpdated", js.Array(value :_*))
    @scala.inline
    def setApplicationCacheDotnetworkStateUpdated(value: js.Array[NetworkStateUpdatedEvent]): Self = this.set("ApplicationCache.networkStateUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuditsDotissueAddedVarargs(value: IssueAddedEvent*): Self = this.set("Audits.issueAdded", js.Array(value :_*))
    @scala.inline
    def setAuditsDotissueAdded(value: js.Array[IssueAddedEvent]): Self = this.set("Audits.issueAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundServiceDotbackgroundServiceEventReceivedVarargs(value: BackgroundServiceEventReceivedEvent*): Self = this.set("BackgroundService.backgroundServiceEventReceived", js.Array(value :_*))
    @scala.inline
    def setBackgroundServiceDotbackgroundServiceEventReceived(value: js.Array[BackgroundServiceEventReceivedEvent]): Self = this.set("BackgroundService.backgroundServiceEventReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundServiceDotrecordingStateChangedVarargs(value: RecordingStateChangedEvent*): Self = this.set("BackgroundService.recordingStateChanged", js.Array(value :_*))
    @scala.inline
    def setBackgroundServiceDotrecordingStateChanged(value: js.Array[RecordingStateChangedEvent]): Self = this.set("BackgroundService.recordingStateChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setCSSDotfontsUpdatedVarargs(value: FontsUpdatedEvent*): Self = this.set("CSS.fontsUpdated", js.Array(value :_*))
    @scala.inline
    def setCSSDotfontsUpdated(value: js.Array[FontsUpdatedEvent]): Self = this.set("CSS.fontsUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setCSSDotmediaQueryResultChangedVarargs(value: js.Any*): Self = this.set("CSS.mediaQueryResultChanged", js.Array(value :_*))
    @scala.inline
    def setCSSDotmediaQueryResultChanged(value: js.Array[js.Any]): Self = this.set("CSS.mediaQueryResultChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setCSSDotstyleSheetAddedVarargs(value: StyleSheetAddedEvent*): Self = this.set("CSS.styleSheetAdded", js.Array(value :_*))
    @scala.inline
    def setCSSDotstyleSheetAdded(value: js.Array[StyleSheetAddedEvent]): Self = this.set("CSS.styleSheetAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def setCSSDotstyleSheetChangedVarargs(value: StyleSheetChangedEvent*): Self = this.set("CSS.styleSheetChanged", js.Array(value :_*))
    @scala.inline
    def setCSSDotstyleSheetChanged(value: js.Array[StyleSheetChangedEvent]): Self = this.set("CSS.styleSheetChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setCSSDotstyleSheetRemovedVarargs(value: StyleSheetRemovedEvent*): Self = this.set("CSS.styleSheetRemoved", js.Array(value :_*))
    @scala.inline
    def setCSSDotstyleSheetRemoved(value: js.Array[StyleSheetRemovedEvent]): Self = this.set("CSS.styleSheetRemoved", value.asInstanceOf[js.Any])
    @scala.inline
    def setCastDotissueUpdatedVarargs(value: IssueUpdatedEvent*): Self = this.set("Cast.issueUpdated", js.Array(value :_*))
    @scala.inline
    def setCastDotissueUpdated(value: js.Array[IssueUpdatedEvent]): Self = this.set("Cast.issueUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setCastDotsinksUpdatedVarargs(value: SinksUpdatedEvent*): Self = this.set("Cast.sinksUpdated", js.Array(value :_*))
    @scala.inline
    def setCastDotsinksUpdated(value: js.Array[SinksUpdatedEvent]): Self = this.set("Cast.sinksUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsoleDotmessageAddedVarargs(value: MessageAddedEvent*): Self = this.set("Console.messageAdded", js.Array(value :_*))
    @scala.inline
    def setConsoleDotmessageAdded(value: js.Array[MessageAddedEvent]): Self = this.set("Console.messageAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMDotattributeModifiedVarargs(value: AttributeModifiedEvent*): Self = this.set("DOM.attributeModified", js.Array(value :_*))
    @scala.inline
    def setDOMDotattributeModified(value: js.Array[AttributeModifiedEvent]): Self = this.set("DOM.attributeModified", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMDotattributeRemovedVarargs(value: AttributeRemovedEvent*): Self = this.set("DOM.attributeRemoved", js.Array(value :_*))
    @scala.inline
    def setDOMDotattributeRemoved(value: js.Array[AttributeRemovedEvent]): Self = this.set("DOM.attributeRemoved", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMDotcharacterDataModifiedVarargs(value: CharacterDataModifiedEvent*): Self = this.set("DOM.characterDataModified", js.Array(value :_*))
    @scala.inline
    def setDOMDotcharacterDataModified(value: js.Array[CharacterDataModifiedEvent]): Self = this.set("DOM.characterDataModified", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMDotchildNodeCountUpdatedVarargs(value: ChildNodeCountUpdatedEvent*): Self = this.set("DOM.childNodeCountUpdated", js.Array(value :_*))
    @scala.inline
    def setDOMDotchildNodeCountUpdated(value: js.Array[ChildNodeCountUpdatedEvent]): Self = this.set("DOM.childNodeCountUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMDotchildNodeInsertedVarargs(value: ChildNodeInsertedEvent*): Self = this.set("DOM.childNodeInserted", js.Array(value :_*))
    @scala.inline
    def setDOMDotchildNodeInserted(value: js.Array[ChildNodeInsertedEvent]): Self = this.set("DOM.childNodeInserted", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMDotchildNodeRemovedVarargs(value: ChildNodeRemovedEvent*): Self = this.set("DOM.childNodeRemoved", js.Array(value :_*))
    @scala.inline
    def setDOMDotchildNodeRemoved(value: js.Array[ChildNodeRemovedEvent]): Self = this.set("DOM.childNodeRemoved", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMDotdistributedNodesUpdatedVarargs(value: DistributedNodesUpdatedEvent*): Self = this.set("DOM.distributedNodesUpdated", js.Array(value :_*))
    @scala.inline
    def setDOMDotdistributedNodesUpdated(value: js.Array[DistributedNodesUpdatedEvent]): Self = this.set("DOM.distributedNodesUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMDotdocumentUpdatedVarargs(value: js.Any*): Self = this.set("DOM.documentUpdated", js.Array(value :_*))
    @scala.inline
    def setDOMDotdocumentUpdated(value: js.Array[js.Any]): Self = this.set("DOM.documentUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMDotinlineStyleInvalidatedVarargs(value: InlineStyleInvalidatedEvent*): Self = this.set("DOM.inlineStyleInvalidated", js.Array(value :_*))
    @scala.inline
    def setDOMDotinlineStyleInvalidated(value: js.Array[InlineStyleInvalidatedEvent]): Self = this.set("DOM.inlineStyleInvalidated", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMDotpseudoElementAddedVarargs(value: PseudoElementAddedEvent*): Self = this.set("DOM.pseudoElementAdded", js.Array(value :_*))
    @scala.inline
    def setDOMDotpseudoElementAdded(value: js.Array[PseudoElementAddedEvent]): Self = this.set("DOM.pseudoElementAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMDotpseudoElementRemovedVarargs(value: PseudoElementRemovedEvent*): Self = this.set("DOM.pseudoElementRemoved", js.Array(value :_*))
    @scala.inline
    def setDOMDotpseudoElementRemoved(value: js.Array[PseudoElementRemovedEvent]): Self = this.set("DOM.pseudoElementRemoved", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMDotsetChildNodesVarargs(value: SetChildNodesEvent*): Self = this.set("DOM.setChildNodes", js.Array(value :_*))
    @scala.inline
    def setDOMDotsetChildNodes(value: js.Array[SetChildNodesEvent]): Self = this.set("DOM.setChildNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMDotshadowRootPoppedVarargs(value: ShadowRootPoppedEvent*): Self = this.set("DOM.shadowRootPopped", js.Array(value :_*))
    @scala.inline
    def setDOMDotshadowRootPopped(value: js.Array[ShadowRootPoppedEvent]): Self = this.set("DOM.shadowRootPopped", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMDotshadowRootPushedVarargs(value: ShadowRootPushedEvent*): Self = this.set("DOM.shadowRootPushed", js.Array(value :_*))
    @scala.inline
    def setDOMDotshadowRootPushed(value: js.Array[ShadowRootPushedEvent]): Self = this.set("DOM.shadowRootPushed", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMStorageDotdomStorageItemAddedVarargs(value: DomStorageItemAddedEvent*): Self = this.set("DOMStorage.domStorageItemAdded", js.Array(value :_*))
    @scala.inline
    def setDOMStorageDotdomStorageItemAdded(value: js.Array[DomStorageItemAddedEvent]): Self = this.set("DOMStorage.domStorageItemAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMStorageDotdomStorageItemRemovedVarargs(value: DomStorageItemRemovedEvent*): Self = this.set("DOMStorage.domStorageItemRemoved", js.Array(value :_*))
    @scala.inline
    def setDOMStorageDotdomStorageItemRemoved(value: js.Array[DomStorageItemRemovedEvent]): Self = this.set("DOMStorage.domStorageItemRemoved", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMStorageDotdomStorageItemUpdatedVarargs(value: DomStorageItemUpdatedEvent*): Self = this.set("DOMStorage.domStorageItemUpdated", js.Array(value :_*))
    @scala.inline
    def setDOMStorageDotdomStorageItemUpdated(value: js.Array[DomStorageItemUpdatedEvent]): Self = this.set("DOMStorage.domStorageItemUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMStorageDotdomStorageItemsClearedVarargs(value: DomStorageItemsClearedEvent*): Self = this.set("DOMStorage.domStorageItemsCleared", js.Array(value :_*))
    @scala.inline
    def setDOMStorageDotdomStorageItemsCleared(value: js.Array[DomStorageItemsClearedEvent]): Self = this.set("DOMStorage.domStorageItemsCleared", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatabaseDotaddDatabaseVarargs(value: AddDatabaseEvent*): Self = this.set("Database.addDatabase", js.Array(value :_*))
    @scala.inline
    def setDatabaseDotaddDatabase(value: js.Array[AddDatabaseEvent]): Self = this.set("Database.addDatabase", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebuggerDotbreakpointResolvedVarargs(value: BreakpointResolvedEvent*): Self = this.set("Debugger.breakpointResolved", js.Array(value :_*))
    @scala.inline
    def setDebuggerDotbreakpointResolved(value: js.Array[BreakpointResolvedEvent]): Self = this.set("Debugger.breakpointResolved", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebuggerDotpausedVarargs(value: PausedEvent*): Self = this.set("Debugger.paused", js.Array(value :_*))
    @scala.inline
    def setDebuggerDotpaused(value: js.Array[PausedEvent]): Self = this.set("Debugger.paused", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebuggerDotresumedVarargs(value: js.Any*): Self = this.set("Debugger.resumed", js.Array(value :_*))
    @scala.inline
    def setDebuggerDotresumed(value: js.Array[js.Any]): Self = this.set("Debugger.resumed", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebuggerDotscriptFailedToParseVarargs(value: ScriptFailedToParseEvent*): Self = this.set("Debugger.scriptFailedToParse", js.Array(value :_*))
    @scala.inline
    def setDebuggerDotscriptFailedToParse(value: js.Array[ScriptFailedToParseEvent]): Self = this.set("Debugger.scriptFailedToParse", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebuggerDotscriptParsedVarargs(value: ScriptParsedEvent*): Self = this.set("Debugger.scriptParsed", js.Array(value :_*))
    @scala.inline
    def setDebuggerDotscriptParsed(value: js.Array[ScriptParsedEvent]): Self = this.set("Debugger.scriptParsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmulationDotvirtualTimeBudgetExpiredVarargs(value: js.Any*): Self = this.set("Emulation.virtualTimeBudgetExpired", js.Array(value :_*))
    @scala.inline
    def setEmulationDotvirtualTimeBudgetExpired(value: js.Array[js.Any]): Self = this.set("Emulation.virtualTimeBudgetExpired", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetchDotauthRequiredVarargs(value: AuthRequiredEvent*): Self = this.set("Fetch.authRequired", js.Array(value :_*))
    @scala.inline
    def setFetchDotauthRequired(value: js.Array[AuthRequiredEvent]): Self = this.set("Fetch.authRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetchDotrequestPausedVarargs(value: RequestPausedEvent*): Self = this.set("Fetch.requestPaused", js.Array(value :_*))
    @scala.inline
    def setFetchDotrequestPaused(value: js.Array[RequestPausedEvent]): Self = this.set("Fetch.requestPaused", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadlessExperimentalDotneedsBeginFramesChangedVarargs(value: NeedsBeginFramesChangedEvent*): Self = this.set("HeadlessExperimental.needsBeginFramesChanged", js.Array(value :_*))
    @scala.inline
    def setHeadlessExperimentalDotneedsBeginFramesChanged(value: js.Array[NeedsBeginFramesChangedEvent]): Self = this.set("HeadlessExperimental.needsBeginFramesChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeapProfilerDotaddHeapSnapshotChunkVarargs(value: AddHeapSnapshotChunkEvent*): Self = this.set("HeapProfiler.addHeapSnapshotChunk", js.Array(value :_*))
    @scala.inline
    def setHeapProfilerDotaddHeapSnapshotChunk(value: js.Array[AddHeapSnapshotChunkEvent]): Self = this.set("HeapProfiler.addHeapSnapshotChunk", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeapProfilerDotheapStatsUpdateVarargs(value: HeapStatsUpdateEvent*): Self = this.set("HeapProfiler.heapStatsUpdate", js.Array(value :_*))
    @scala.inline
    def setHeapProfilerDotheapStatsUpdate(value: js.Array[HeapStatsUpdateEvent]): Self = this.set("HeapProfiler.heapStatsUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeapProfilerDotlastSeenObjectIdVarargs(value: LastSeenObjectIdEvent*): Self = this.set("HeapProfiler.lastSeenObjectId", js.Array(value :_*))
    @scala.inline
    def setHeapProfilerDotlastSeenObjectId(value: js.Array[LastSeenObjectIdEvent]): Self = this.set("HeapProfiler.lastSeenObjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeapProfilerDotreportHeapSnapshotProgressVarargs(value: ReportHeapSnapshotProgressEvent*): Self = this.set("HeapProfiler.reportHeapSnapshotProgress", js.Array(value :_*))
    @scala.inline
    def setHeapProfilerDotreportHeapSnapshotProgress(value: js.Array[ReportHeapSnapshotProgressEvent]): Self = this.set("HeapProfiler.reportHeapSnapshotProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeapProfilerDotresetProfilesVarargs(value: js.Any*): Self = this.set("HeapProfiler.resetProfiles", js.Array(value :_*))
    @scala.inline
    def setHeapProfilerDotresetProfiles(value: js.Array[js.Any]): Self = this.set("HeapProfiler.resetProfiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setInspectorDotdetachedVarargs(value: DetachedEvent*): Self = this.set("Inspector.detached", js.Array(value :_*))
    @scala.inline
    def setInspectorDotdetached(value: js.Array[DetachedEvent]): Self = this.set("Inspector.detached", value.asInstanceOf[js.Any])
    @scala.inline
    def setInspectorDottargetCrashedVarargs(value: js.Any*): Self = this.set("Inspector.targetCrashed", js.Array(value :_*))
    @scala.inline
    def setInspectorDottargetCrashed(value: js.Array[js.Any]): Self = this.set("Inspector.targetCrashed", value.asInstanceOf[js.Any])
    @scala.inline
    def setInspectorDottargetReloadedAfterCrashVarargs(value: js.Any*): Self = this.set("Inspector.targetReloadedAfterCrash", js.Array(value :_*))
    @scala.inline
    def setInspectorDottargetReloadedAfterCrash(value: js.Array[js.Any]): Self = this.set("Inspector.targetReloadedAfterCrash", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayerTreeDotlayerPaintedVarargs(value: LayerPaintedEvent*): Self = this.set("LayerTree.layerPainted", js.Array(value :_*))
    @scala.inline
    def setLayerTreeDotlayerPainted(value: js.Array[LayerPaintedEvent]): Self = this.set("LayerTree.layerPainted", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayerTreeDotlayerTreeDidChangeVarargs(value: LayerTreeDidChangeEvent*): Self = this.set("LayerTree.layerTreeDidChange", js.Array(value :_*))
    @scala.inline
    def setLayerTreeDotlayerTreeDidChange(value: js.Array[LayerTreeDidChangeEvent]): Self = this.set("LayerTree.layerTreeDidChange", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogDotentryAddedVarargs(value: EntryAddedEvent*): Self = this.set("Log.entryAdded", js.Array(value :_*))
    @scala.inline
    def setLogDotentryAdded(value: js.Array[EntryAddedEvent]): Self = this.set("Log.entryAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaDotplayerErrorsRaisedVarargs(value: PlayerErrorsRaisedEvent*): Self = this.set("Media.playerErrorsRaised", js.Array(value :_*))
    @scala.inline
    def setMediaDotplayerErrorsRaised(value: js.Array[PlayerErrorsRaisedEvent]): Self = this.set("Media.playerErrorsRaised", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaDotplayerEventsAddedVarargs(value: PlayerEventsAddedEvent*): Self = this.set("Media.playerEventsAdded", js.Array(value :_*))
    @scala.inline
    def setMediaDotplayerEventsAdded(value: js.Array[PlayerEventsAddedEvent]): Self = this.set("Media.playerEventsAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaDotplayerMessagesLoggedVarargs(value: PlayerMessagesLoggedEvent*): Self = this.set("Media.playerMessagesLogged", js.Array(value :_*))
    @scala.inline
    def setMediaDotplayerMessagesLogged(value: js.Array[PlayerMessagesLoggedEvent]): Self = this.set("Media.playerMessagesLogged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaDotplayerPropertiesChangedVarargs(value: PlayerPropertiesChangedEvent*): Self = this.set("Media.playerPropertiesChanged", js.Array(value :_*))
    @scala.inline
    def setMediaDotplayerPropertiesChanged(value: js.Array[PlayerPropertiesChangedEvent]): Self = this.set("Media.playerPropertiesChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaDotplayersCreatedVarargs(value: PlayersCreatedEvent*): Self = this.set("Media.playersCreated", js.Array(value :_*))
    @scala.inline
    def setMediaDotplayersCreated(value: js.Array[PlayersCreatedEvent]): Self = this.set("Media.playersCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkDotdataReceivedVarargs(value: DataReceivedEvent*): Self = this.set("Network.dataReceived", js.Array(value :_*))
    @scala.inline
    def setNetworkDotdataReceived(value: js.Array[DataReceivedEvent]): Self = this.set("Network.dataReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkDoteventSourceMessageReceivedVarargs(value: EventSourceMessageReceivedEvent*): Self = this.set("Network.eventSourceMessageReceived", js.Array(value :_*))
    @scala.inline
    def setNetworkDoteventSourceMessageReceived(value: js.Array[EventSourceMessageReceivedEvent]): Self = this.set("Network.eventSourceMessageReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkDotloadingFailedVarargs(value: LoadingFailedEvent*): Self = this.set("Network.loadingFailed", js.Array(value :_*))
    @scala.inline
    def setNetworkDotloadingFailed(value: js.Array[LoadingFailedEvent]): Self = this.set("Network.loadingFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkDotloadingFinishedVarargs(value: LoadingFinishedEvent*): Self = this.set("Network.loadingFinished", js.Array(value :_*))
    @scala.inline
    def setNetworkDotloadingFinished(value: js.Array[LoadingFinishedEvent]): Self = this.set("Network.loadingFinished", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkDotrequestInterceptedVarargs(value: RequestInterceptedEvent*): Self = this.set("Network.requestIntercepted", js.Array(value :_*))
    @scala.inline
    def setNetworkDotrequestIntercepted(value: js.Array[RequestInterceptedEvent]): Self = this.set("Network.requestIntercepted", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkDotrequestServedFromCacheVarargs(value: RequestServedFromCacheEvent*): Self = this.set("Network.requestServedFromCache", js.Array(value :_*))
    @scala.inline
    def setNetworkDotrequestServedFromCache(value: js.Array[RequestServedFromCacheEvent]): Self = this.set("Network.requestServedFromCache", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkDotrequestWillBeSentVarargs(value: RequestWillBeSentEvent*): Self = this.set("Network.requestWillBeSent", js.Array(value :_*))
    @scala.inline
    def setNetworkDotrequestWillBeSent(value: js.Array[RequestWillBeSentEvent]): Self = this.set("Network.requestWillBeSent", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkDotrequestWillBeSentExtraInfoVarargs(value: RequestWillBeSentExtraInfoEvent*): Self = this.set("Network.requestWillBeSentExtraInfo", js.Array(value :_*))
    @scala.inline
    def setNetworkDotrequestWillBeSentExtraInfo(value: js.Array[RequestWillBeSentExtraInfoEvent]): Self = this.set("Network.requestWillBeSentExtraInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkDotresourceChangedPriorityVarargs(value: ResourceChangedPriorityEvent*): Self = this.set("Network.resourceChangedPriority", js.Array(value :_*))
    @scala.inline
    def setNetworkDotresourceChangedPriority(value: js.Array[ResourceChangedPriorityEvent]): Self = this.set("Network.resourceChangedPriority", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkDotresponseReceivedVarargs(value: ResponseReceivedEvent*): Self = this.set("Network.responseReceived", js.Array(value :_*))
    @scala.inline
    def setNetworkDotresponseReceived(value: js.Array[ResponseReceivedEvent]): Self = this.set("Network.responseReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkDotresponseReceivedExtraInfoVarargs(value: ResponseReceivedExtraInfoEvent*): Self = this.set("Network.responseReceivedExtraInfo", js.Array(value :_*))
    @scala.inline
    def setNetworkDotresponseReceivedExtraInfo(value: js.Array[ResponseReceivedExtraInfoEvent]): Self = this.set("Network.responseReceivedExtraInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkDotsignedExchangeReceivedVarargs(value: SignedExchangeReceivedEvent*): Self = this.set("Network.signedExchangeReceived", js.Array(value :_*))
    @scala.inline
    def setNetworkDotsignedExchangeReceived(value: js.Array[SignedExchangeReceivedEvent]): Self = this.set("Network.signedExchangeReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkDotwebSocketClosedVarargs(value: WebSocketClosedEvent*): Self = this.set("Network.webSocketClosed", js.Array(value :_*))
    @scala.inline
    def setNetworkDotwebSocketClosed(value: js.Array[WebSocketClosedEvent]): Self = this.set("Network.webSocketClosed", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkDotwebSocketCreatedVarargs(value: WebSocketCreatedEvent*): Self = this.set("Network.webSocketCreated", js.Array(value :_*))
    @scala.inline
    def setNetworkDotwebSocketCreated(value: js.Array[WebSocketCreatedEvent]): Self = this.set("Network.webSocketCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkDotwebSocketFrameErrorVarargs(value: WebSocketFrameErrorEvent*): Self = this.set("Network.webSocketFrameError", js.Array(value :_*))
    @scala.inline
    def setNetworkDotwebSocketFrameError(value: js.Array[WebSocketFrameErrorEvent]): Self = this.set("Network.webSocketFrameError", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkDotwebSocketFrameReceivedVarargs(value: WebSocketFrameReceivedEvent*): Self = this.set("Network.webSocketFrameReceived", js.Array(value :_*))
    @scala.inline
    def setNetworkDotwebSocketFrameReceived(value: js.Array[WebSocketFrameReceivedEvent]): Self = this.set("Network.webSocketFrameReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkDotwebSocketFrameSentVarargs(value: WebSocketFrameSentEvent*): Self = this.set("Network.webSocketFrameSent", js.Array(value :_*))
    @scala.inline
    def setNetworkDotwebSocketFrameSent(value: js.Array[WebSocketFrameSentEvent]): Self = this.set("Network.webSocketFrameSent", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkDotwebSocketHandshakeResponseReceivedVarargs(value: WebSocketHandshakeResponseReceivedEvent*): Self = this.set("Network.webSocketHandshakeResponseReceived", js.Array(value :_*))
    @scala.inline
    def setNetworkDotwebSocketHandshakeResponseReceived(value: js.Array[WebSocketHandshakeResponseReceivedEvent]): Self = this.set("Network.webSocketHandshakeResponseReceived", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkDotwebSocketWillSendHandshakeRequestVarargs(value: WebSocketWillSendHandshakeRequestEvent*): Self = this.set("Network.webSocketWillSendHandshakeRequest", js.Array(value :_*))
    @scala.inline
    def setNetworkDotwebSocketWillSendHandshakeRequest(value: js.Array[WebSocketWillSendHandshakeRequestEvent]): Self = this.set("Network.webSocketWillSendHandshakeRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlayDotinspectModeCanceledVarargs(value: js.Any*): Self = this.set("Overlay.inspectModeCanceled", js.Array(value :_*))
    @scala.inline
    def setOverlayDotinspectModeCanceled(value: js.Array[js.Any]): Self = this.set("Overlay.inspectModeCanceled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlayDotinspectNodeRequestedVarargs(value: InspectNodeRequestedEvent*): Self = this.set("Overlay.inspectNodeRequested", js.Array(value :_*))
    @scala.inline
    def setOverlayDotinspectNodeRequested(value: js.Array[InspectNodeRequestedEvent]): Self = this.set("Overlay.inspectNodeRequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlayDotnodeHighlightRequestedVarargs(value: NodeHighlightRequestedEvent*): Self = this.set("Overlay.nodeHighlightRequested", js.Array(value :_*))
    @scala.inline
    def setOverlayDotnodeHighlightRequested(value: js.Array[NodeHighlightRequestedEvent]): Self = this.set("Overlay.nodeHighlightRequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlayDotscreenshotRequestedVarargs(value: ScreenshotRequestedEvent*): Self = this.set("Overlay.screenshotRequested", js.Array(value :_*))
    @scala.inline
    def setOverlayDotscreenshotRequested(value: js.Array[ScreenshotRequestedEvent]): Self = this.set("Overlay.screenshotRequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotcompilationCacheProducedVarargs(value: CompilationCacheProducedEvent*): Self = this.set("Page.compilationCacheProduced", js.Array(value :_*))
    @scala.inline
    def setPageDotcompilationCacheProduced(value: js.Array[CompilationCacheProducedEvent]): Self = this.set("Page.compilationCacheProduced", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotdomContentEventFiredVarargs(value: DomContentEventFiredEvent*): Self = this.set("Page.domContentEventFired", js.Array(value :_*))
    @scala.inline
    def setPageDotdomContentEventFired(value: js.Array[DomContentEventFiredEvent]): Self = this.set("Page.domContentEventFired", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotdownloadProgressVarargs(value: DownloadProgressEvent*): Self = this.set("Page.downloadProgress", js.Array(value :_*))
    @scala.inline
    def setPageDotdownloadProgress(value: js.Array[DownloadProgressEvent]): Self = this.set("Page.downloadProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotdownloadWillBeginVarargs(value: DownloadWillBeginEvent*): Self = this.set("Page.downloadWillBegin", js.Array(value :_*))
    @scala.inline
    def setPageDotdownloadWillBegin(value: js.Array[DownloadWillBeginEvent]): Self = this.set("Page.downloadWillBegin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotfileChooserOpenedVarargs(value: FileChooserOpenedEvent*): Self = this.set("Page.fileChooserOpened", js.Array(value :_*))
    @scala.inline
    def setPageDotfileChooserOpened(value: js.Array[FileChooserOpenedEvent]): Self = this.set("Page.fileChooserOpened", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotframeAttachedVarargs(value: FrameAttachedEvent*): Self = this.set("Page.frameAttached", js.Array(value :_*))
    @scala.inline
    def setPageDotframeAttached(value: js.Array[FrameAttachedEvent]): Self = this.set("Page.frameAttached", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotframeClearedScheduledNavigationVarargs(value: FrameClearedScheduledNavigationEvent*): Self = this.set("Page.frameClearedScheduledNavigation", js.Array(value :_*))
    @scala.inline
    def setPageDotframeClearedScheduledNavigation(value: js.Array[FrameClearedScheduledNavigationEvent]): Self = this.set("Page.frameClearedScheduledNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotframeDetachedVarargs(value: FrameDetachedEvent*): Self = this.set("Page.frameDetached", js.Array(value :_*))
    @scala.inline
    def setPageDotframeDetached(value: js.Array[FrameDetachedEvent]): Self = this.set("Page.frameDetached", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotframeNavigatedVarargs(value: FrameNavigatedEvent*): Self = this.set("Page.frameNavigated", js.Array(value :_*))
    @scala.inline
    def setPageDotframeNavigated(value: js.Array[FrameNavigatedEvent]): Self = this.set("Page.frameNavigated", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotframeRequestedNavigationVarargs(value: FrameRequestedNavigationEvent*): Self = this.set("Page.frameRequestedNavigation", js.Array(value :_*))
    @scala.inline
    def setPageDotframeRequestedNavigation(value: js.Array[FrameRequestedNavigationEvent]): Self = this.set("Page.frameRequestedNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotframeResizedVarargs(value: js.Any*): Self = this.set("Page.frameResized", js.Array(value :_*))
    @scala.inline
    def setPageDotframeResized(value: js.Array[js.Any]): Self = this.set("Page.frameResized", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotframeScheduledNavigationVarargs(value: FrameScheduledNavigationEvent*): Self = this.set("Page.frameScheduledNavigation", js.Array(value :_*))
    @scala.inline
    def setPageDotframeScheduledNavigation(value: js.Array[FrameScheduledNavigationEvent]): Self = this.set("Page.frameScheduledNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotframeStartedLoadingVarargs(value: FrameStartedLoadingEvent*): Self = this.set("Page.frameStartedLoading", js.Array(value :_*))
    @scala.inline
    def setPageDotframeStartedLoading(value: js.Array[FrameStartedLoadingEvent]): Self = this.set("Page.frameStartedLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotframeStoppedLoadingVarargs(value: FrameStoppedLoadingEvent*): Self = this.set("Page.frameStoppedLoading", js.Array(value :_*))
    @scala.inline
    def setPageDotframeStoppedLoading(value: js.Array[FrameStoppedLoadingEvent]): Self = this.set("Page.frameStoppedLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotinterstitialHiddenVarargs(value: js.Any*): Self = this.set("Page.interstitialHidden", js.Array(value :_*))
    @scala.inline
    def setPageDotinterstitialHidden(value: js.Array[js.Any]): Self = this.set("Page.interstitialHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotinterstitialShownVarargs(value: js.Any*): Self = this.set("Page.interstitialShown", js.Array(value :_*))
    @scala.inline
    def setPageDotinterstitialShown(value: js.Array[js.Any]): Self = this.set("Page.interstitialShown", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotjavascriptDialogClosedVarargs(value: JavascriptDialogClosedEvent*): Self = this.set("Page.javascriptDialogClosed", js.Array(value :_*))
    @scala.inline
    def setPageDotjavascriptDialogClosed(value: js.Array[JavascriptDialogClosedEvent]): Self = this.set("Page.javascriptDialogClosed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotjavascriptDialogOpeningVarargs(value: JavascriptDialogOpeningEvent*): Self = this.set("Page.javascriptDialogOpening", js.Array(value :_*))
    @scala.inline
    def setPageDotjavascriptDialogOpening(value: js.Array[JavascriptDialogOpeningEvent]): Self = this.set("Page.javascriptDialogOpening", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotlifecycleEventVarargs(value: LifecycleEventEvent*): Self = this.set("Page.lifecycleEvent", js.Array(value :_*))
    @scala.inline
    def setPageDotlifecycleEvent(value: js.Array[LifecycleEventEvent]): Self = this.set("Page.lifecycleEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotloadEventFiredVarargs(value: LoadEventFiredEvent*): Self = this.set("Page.loadEventFired", js.Array(value :_*))
    @scala.inline
    def setPageDotloadEventFired(value: js.Array[LoadEventFiredEvent]): Self = this.set("Page.loadEventFired", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotnavigatedWithinDocumentVarargs(value: NavigatedWithinDocumentEvent*): Self = this.set("Page.navigatedWithinDocument", js.Array(value :_*))
    @scala.inline
    def setPageDotnavigatedWithinDocument(value: js.Array[NavigatedWithinDocumentEvent]): Self = this.set("Page.navigatedWithinDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotscreencastFrameVarargs(value: ScreencastFrameEvent*): Self = this.set("Page.screencastFrame", js.Array(value :_*))
    @scala.inline
    def setPageDotscreencastFrame(value: js.Array[ScreencastFrameEvent]): Self = this.set("Page.screencastFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotscreencastVisibilityChangedVarargs(value: ScreencastVisibilityChangedEvent*): Self = this.set("Page.screencastVisibilityChanged", js.Array(value :_*))
    @scala.inline
    def setPageDotscreencastVisibilityChanged(value: js.Array[ScreencastVisibilityChangedEvent]): Self = this.set("Page.screencastVisibilityChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDotwindowOpenVarargs(value: WindowOpenEvent*): Self = this.set("Page.windowOpen", js.Array(value :_*))
    @scala.inline
    def setPageDotwindowOpen(value: js.Array[WindowOpenEvent]): Self = this.set("Page.windowOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerformanceDotmetricsVarargs(value: MetricsEvent*): Self = this.set("Performance.metrics", js.Array(value :_*))
    @scala.inline
    def setPerformanceDotmetrics(value: js.Array[MetricsEvent]): Self = this.set("Performance.metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfilerDotconsoleProfileFinishedVarargs(value: ConsoleProfileFinishedEvent*): Self = this.set("Profiler.consoleProfileFinished", js.Array(value :_*))
    @scala.inline
    def setProfilerDotconsoleProfileFinished(value: js.Array[ConsoleProfileFinishedEvent]): Self = this.set("Profiler.consoleProfileFinished", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfilerDotconsoleProfileStartedVarargs(value: ConsoleProfileStartedEvent*): Self = this.set("Profiler.consoleProfileStarted", js.Array(value :_*))
    @scala.inline
    def setProfilerDotconsoleProfileStarted(value: js.Array[ConsoleProfileStartedEvent]): Self = this.set("Profiler.consoleProfileStarted", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfilerDotpreciseCoverageDeltaUpdateVarargs(value: PreciseCoverageDeltaUpdateEvent*): Self = this.set("Profiler.preciseCoverageDeltaUpdate", js.Array(value :_*))
    @scala.inline
    def setProfilerDotpreciseCoverageDeltaUpdate(value: js.Array[PreciseCoverageDeltaUpdateEvent]): Self = this.set("Profiler.preciseCoverageDeltaUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntimeDotbindingCalledVarargs(value: BindingCalledEvent*): Self = this.set("Runtime.bindingCalled", js.Array(value :_*))
    @scala.inline
    def setRuntimeDotbindingCalled(value: js.Array[BindingCalledEvent]): Self = this.set("Runtime.bindingCalled", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntimeDotconsoleAPICalledVarargs(value: ConsoleAPICalledEvent*): Self = this.set("Runtime.consoleAPICalled", js.Array(value :_*))
    @scala.inline
    def setRuntimeDotconsoleAPICalled(value: js.Array[ConsoleAPICalledEvent]): Self = this.set("Runtime.consoleAPICalled", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntimeDotexceptionRevokedVarargs(value: ExceptionRevokedEvent*): Self = this.set("Runtime.exceptionRevoked", js.Array(value :_*))
    @scala.inline
    def setRuntimeDotexceptionRevoked(value: js.Array[ExceptionRevokedEvent]): Self = this.set("Runtime.exceptionRevoked", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntimeDotexceptionThrownVarargs(value: ExceptionThrownEvent*): Self = this.set("Runtime.exceptionThrown", js.Array(value :_*))
    @scala.inline
    def setRuntimeDotexceptionThrown(value: js.Array[ExceptionThrownEvent]): Self = this.set("Runtime.exceptionThrown", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntimeDotexecutionContextCreatedVarargs(value: ExecutionContextCreatedEvent*): Self = this.set("Runtime.executionContextCreated", js.Array(value :_*))
    @scala.inline
    def setRuntimeDotexecutionContextCreated(value: js.Array[ExecutionContextCreatedEvent]): Self = this.set("Runtime.executionContextCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntimeDotexecutionContextDestroyedVarargs(value: ExecutionContextDestroyedEvent*): Self = this.set("Runtime.executionContextDestroyed", js.Array(value :_*))
    @scala.inline
    def setRuntimeDotexecutionContextDestroyed(value: js.Array[ExecutionContextDestroyedEvent]): Self = this.set("Runtime.executionContextDestroyed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntimeDotexecutionContextsClearedVarargs(value: js.Any*): Self = this.set("Runtime.executionContextsCleared", js.Array(value :_*))
    @scala.inline
    def setRuntimeDotexecutionContextsCleared(value: js.Array[js.Any]): Self = this.set("Runtime.executionContextsCleared", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntimeDotinspectRequestedVarargs(value: InspectRequestedEvent*): Self = this.set("Runtime.inspectRequested", js.Array(value :_*))
    @scala.inline
    def setRuntimeDotinspectRequested(value: js.Array[InspectRequestedEvent]): Self = this.set("Runtime.inspectRequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityDotcertificateErrorVarargs(value: CertificateErrorEvent*): Self = this.set("Security.certificateError", js.Array(value :_*))
    @scala.inline
    def setSecurityDotcertificateError(value: js.Array[CertificateErrorEvent]): Self = this.set("Security.certificateError", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityDotsecurityStateChangedVarargs(value: SecurityStateChangedEvent*): Self = this.set("Security.securityStateChanged", js.Array(value :_*))
    @scala.inline
    def setSecurityDotsecurityStateChanged(value: js.Array[SecurityStateChangedEvent]): Self = this.set("Security.securityStateChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityDotvisibleSecurityStateChangedVarargs(value: VisibleSecurityStateChangedEvent*): Self = this.set("Security.visibleSecurityStateChanged", js.Array(value :_*))
    @scala.inline
    def setSecurityDotvisibleSecurityStateChanged(value: js.Array[VisibleSecurityStateChangedEvent]): Self = this.set("Security.visibleSecurityStateChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceWorkerDotworkerErrorReportedVarargs(value: WorkerErrorReportedEvent*): Self = this.set("ServiceWorker.workerErrorReported", js.Array(value :_*))
    @scala.inline
    def setServiceWorkerDotworkerErrorReported(value: js.Array[WorkerErrorReportedEvent]): Self = this.set("ServiceWorker.workerErrorReported", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceWorkerDotworkerRegistrationUpdatedVarargs(value: WorkerRegistrationUpdatedEvent*): Self = this.set("ServiceWorker.workerRegistrationUpdated", js.Array(value :_*))
    @scala.inline
    def setServiceWorkerDotworkerRegistrationUpdated(value: js.Array[WorkerRegistrationUpdatedEvent]): Self = this.set("ServiceWorker.workerRegistrationUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceWorkerDotworkerVersionUpdatedVarargs(value: WorkerVersionUpdatedEvent*): Self = this.set("ServiceWorker.workerVersionUpdated", js.Array(value :_*))
    @scala.inline
    def setServiceWorkerDotworkerVersionUpdated(value: js.Array[WorkerVersionUpdatedEvent]): Self = this.set("ServiceWorker.workerVersionUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorageDotcacheStorageContentUpdatedVarargs(value: CacheStorageContentUpdatedEvent*): Self = this.set("Storage.cacheStorageContentUpdated", js.Array(value :_*))
    @scala.inline
    def setStorageDotcacheStorageContentUpdated(value: js.Array[CacheStorageContentUpdatedEvent]): Self = this.set("Storage.cacheStorageContentUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorageDotcacheStorageListUpdatedVarargs(value: CacheStorageListUpdatedEvent*): Self = this.set("Storage.cacheStorageListUpdated", js.Array(value :_*))
    @scala.inline
    def setStorageDotcacheStorageListUpdated(value: js.Array[CacheStorageListUpdatedEvent]): Self = this.set("Storage.cacheStorageListUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorageDotindexedDBContentUpdatedVarargs(value: IndexedDBContentUpdatedEvent*): Self = this.set("Storage.indexedDBContentUpdated", js.Array(value :_*))
    @scala.inline
    def setStorageDotindexedDBContentUpdated(value: js.Array[IndexedDBContentUpdatedEvent]): Self = this.set("Storage.indexedDBContentUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorageDotindexedDBListUpdatedVarargs(value: IndexedDBListUpdatedEvent*): Self = this.set("Storage.indexedDBListUpdated", js.Array(value :_*))
    @scala.inline
    def setStorageDotindexedDBListUpdated(value: js.Array[IndexedDBListUpdatedEvent]): Self = this.set("Storage.indexedDBListUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetDotattachedToTargetVarargs(value: AttachedToTargetEvent*): Self = this.set("Target.attachedToTarget", js.Array(value :_*))
    @scala.inline
    def setTargetDotattachedToTarget(value: js.Array[AttachedToTargetEvent]): Self = this.set("Target.attachedToTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetDotdetachedFromTargetVarargs(value: DetachedFromTargetEvent*): Self = this.set("Target.detachedFromTarget", js.Array(value :_*))
    @scala.inline
    def setTargetDotdetachedFromTarget(value: js.Array[DetachedFromTargetEvent]): Self = this.set("Target.detachedFromTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetDotreceivedMessageFromTargetVarargs(value: ReceivedMessageFromTargetEvent*): Self = this.set("Target.receivedMessageFromTarget", js.Array(value :_*))
    @scala.inline
    def setTargetDotreceivedMessageFromTarget(value: js.Array[ReceivedMessageFromTargetEvent]): Self = this.set("Target.receivedMessageFromTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetDottargetCrashedVarargs(value: TargetCrashedEvent*): Self = this.set("Target.targetCrashed", js.Array(value :_*))
    @scala.inline
    def setTargetDottargetCrashed(value: js.Array[TargetCrashedEvent]): Self = this.set("Target.targetCrashed", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetDottargetCreatedVarargs(value: TargetCreatedEvent*): Self = this.set("Target.targetCreated", js.Array(value :_*))
    @scala.inline
    def setTargetDottargetCreated(value: js.Array[TargetCreatedEvent]): Self = this.set("Target.targetCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetDottargetDestroyedVarargs(value: TargetDestroyedEvent*): Self = this.set("Target.targetDestroyed", js.Array(value :_*))
    @scala.inline
    def setTargetDottargetDestroyed(value: js.Array[TargetDestroyedEvent]): Self = this.set("Target.targetDestroyed", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetDottargetInfoChangedVarargs(value: TargetInfoChangedEvent*): Self = this.set("Target.targetInfoChanged", js.Array(value :_*))
    @scala.inline
    def setTargetDottargetInfoChanged(value: js.Array[TargetInfoChangedEvent]): Self = this.set("Target.targetInfoChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setTetheringDotacceptedVarargs(value: AcceptedEvent*): Self = this.set("Tethering.accepted", js.Array(value :_*))
    @scala.inline
    def setTetheringDotaccepted(value: js.Array[AcceptedEvent]): Self = this.set("Tethering.accepted", value.asInstanceOf[js.Any])
    @scala.inline
    def setTracingDotbufferUsageVarargs(value: BufferUsageEvent*): Self = this.set("Tracing.bufferUsage", js.Array(value :_*))
    @scala.inline
    def setTracingDotbufferUsage(value: js.Array[BufferUsageEvent]): Self = this.set("Tracing.bufferUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTracingDotdataCollectedVarargs(value: DataCollectedEvent*): Self = this.set("Tracing.dataCollected", js.Array(value :_*))
    @scala.inline
    def setTracingDotdataCollected(value: js.Array[DataCollectedEvent]): Self = this.set("Tracing.dataCollected", value.asInstanceOf[js.Any])
    @scala.inline
    def setTracingDottracingCompleteVarargs(value: TracingCompleteEvent*): Self = this.set("Tracing.tracingComplete", js.Array(value :_*))
    @scala.inline
    def setTracingDottracingComplete(value: js.Array[TracingCompleteEvent]): Self = this.set("Tracing.tracingComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAudioDotaudioListenerCreatedVarargs(value: AudioListenerCreatedEvent*): Self = this.set("WebAudio.audioListenerCreated", js.Array(value :_*))
    @scala.inline
    def setWebAudioDotaudioListenerCreated(value: js.Array[AudioListenerCreatedEvent]): Self = this.set("WebAudio.audioListenerCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAudioDotaudioListenerWillBeDestroyedVarargs(value: AudioListenerWillBeDestroyedEvent*): Self = this.set("WebAudio.audioListenerWillBeDestroyed", js.Array(value :_*))
    @scala.inline
    def setWebAudioDotaudioListenerWillBeDestroyed(value: js.Array[AudioListenerWillBeDestroyedEvent]): Self = this.set("WebAudio.audioListenerWillBeDestroyed", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAudioDotaudioNodeCreatedVarargs(value: AudioNodeCreatedEvent*): Self = this.set("WebAudio.audioNodeCreated", js.Array(value :_*))
    @scala.inline
    def setWebAudioDotaudioNodeCreated(value: js.Array[AudioNodeCreatedEvent]): Self = this.set("WebAudio.audioNodeCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAudioDotaudioNodeWillBeDestroyedVarargs(value: AudioNodeWillBeDestroyedEvent*): Self = this.set("WebAudio.audioNodeWillBeDestroyed", js.Array(value :_*))
    @scala.inline
    def setWebAudioDotaudioNodeWillBeDestroyed(value: js.Array[AudioNodeWillBeDestroyedEvent]): Self = this.set("WebAudio.audioNodeWillBeDestroyed", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAudioDotaudioParamCreatedVarargs(value: AudioParamCreatedEvent*): Self = this.set("WebAudio.audioParamCreated", js.Array(value :_*))
    @scala.inline
    def setWebAudioDotaudioParamCreated(value: js.Array[AudioParamCreatedEvent]): Self = this.set("WebAudio.audioParamCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAudioDotaudioParamWillBeDestroyedVarargs(value: AudioParamWillBeDestroyedEvent*): Self = this.set("WebAudio.audioParamWillBeDestroyed", js.Array(value :_*))
    @scala.inline
    def setWebAudioDotaudioParamWillBeDestroyed(value: js.Array[AudioParamWillBeDestroyedEvent]): Self = this.set("WebAudio.audioParamWillBeDestroyed", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAudioDotcontextChangedVarargs(value: ContextChangedEvent*): Self = this.set("WebAudio.contextChanged", js.Array(value :_*))
    @scala.inline
    def setWebAudioDotcontextChanged(value: js.Array[ContextChangedEvent]): Self = this.set("WebAudio.contextChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAudioDotcontextCreatedVarargs(value: ContextCreatedEvent*): Self = this.set("WebAudio.contextCreated", js.Array(value :_*))
    @scala.inline
    def setWebAudioDotcontextCreated(value: js.Array[ContextCreatedEvent]): Self = this.set("WebAudio.contextCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAudioDotcontextWillBeDestroyedVarargs(value: ContextWillBeDestroyedEvent*): Self = this.set("WebAudio.contextWillBeDestroyed", js.Array(value :_*))
    @scala.inline
    def setWebAudioDotcontextWillBeDestroyed(value: js.Array[ContextWillBeDestroyedEvent]): Self = this.set("WebAudio.contextWillBeDestroyed", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAudioDotnodeParamConnectedVarargs(value: NodeParamConnectedEvent*): Self = this.set("WebAudio.nodeParamConnected", js.Array(value :_*))
    @scala.inline
    def setWebAudioDotnodeParamConnected(value: js.Array[NodeParamConnectedEvent]): Self = this.set("WebAudio.nodeParamConnected", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAudioDotnodeParamDisconnectedVarargs(value: NodeParamDisconnectedEvent*): Self = this.set("WebAudio.nodeParamDisconnected", js.Array(value :_*))
    @scala.inline
    def setWebAudioDotnodeParamDisconnected(value: js.Array[NodeParamDisconnectedEvent]): Self = this.set("WebAudio.nodeParamDisconnected", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAudioDotnodesConnectedVarargs(value: NodesConnectedEvent*): Self = this.set("WebAudio.nodesConnected", js.Array(value :_*))
    @scala.inline
    def setWebAudioDotnodesConnected(value: js.Array[NodesConnectedEvent]): Self = this.set("WebAudio.nodesConnected", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAudioDotnodesDisconnectedVarargs(value: NodesDisconnectedEvent*): Self = this.set("WebAudio.nodesDisconnected", js.Array(value :_*))
    @scala.inline
    def setWebAudioDotnodesDisconnected(value: js.Array[NodesDisconnectedEvent]): Self = this.set("WebAudio.nodesDisconnected", value.asInstanceOf[js.Any])
  }
  
}

