package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtocolApi extends js.Object {
  var Accessibility: AccessibilityApi = js.native
  var Animation: AnimationApi = js.native
  var ApplicationCache: ApplicationCacheApi = js.native
  var Audits: AuditsApi = js.native
  var BackgroundService: BackgroundServiceApi = js.native
  var Browser: BrowserApi = js.native
  var CSS: CSSApi = js.native
  var CacheStorage: CacheStorageApi = js.native
  var Cast: CastApi = js.native
  var Console: ConsoleApi = js.native
  var DOM: DOMApi = js.native
  var DOMDebugger: DOMDebuggerApi = js.native
  var DOMSnapshot: DOMSnapshotApi = js.native
  var DOMStorage: DOMStorageApi = js.native
  var Database: DatabaseApi = js.native
  var Debugger: DebuggerApi = js.native
  var DeviceOrientation: DeviceOrientationApi = js.native
  var Emulation: EmulationApi = js.native
  var Fetch: FetchApi = js.native
  var HeadlessExperimental: HeadlessExperimentalApi = js.native
  var HeapProfiler: HeapProfilerApi = js.native
  var IO: IOApi = js.native
  var IndexedDB: IndexedDBApi = js.native
  var Input: InputApi = js.native
  var Inspector: InspectorApi = js.native
  var LayerTree: LayerTreeApi = js.native
  var Log: LogApi = js.native
  var Media: MediaApi = js.native
  var Memory: MemoryApi = js.native
  var Network: NetworkApi = js.native
  var Overlay: OverlayApi = js.native
  var Page: PageApi = js.native
  var Performance: PerformanceApi = js.native
  var Profiler: ProfilerApi = js.native
  var Runtime: RuntimeApi = js.native
  var Schema: SchemaApi = js.native
  var Security: SecurityApi = js.native
  var ServiceWorker: ServiceWorkerApi = js.native
  var Storage: StorageApi = js.native
  var SystemInfo: SystemInfoApi = js.native
  var Target: TargetApi = js.native
  var Tethering: TetheringApi = js.native
  var Tracing: TracingApi = js.native
  var WebAudio: WebAudioApi = js.native
  var WebAuthn: WebAuthnApi = js.native
}

object ProtocolApi {
  @scala.inline
  def apply(
    Accessibility: AccessibilityApi,
    Animation: AnimationApi,
    ApplicationCache: ApplicationCacheApi,
    Audits: AuditsApi,
    BackgroundService: BackgroundServiceApi,
    Browser: BrowserApi,
    CSS: CSSApi,
    CacheStorage: CacheStorageApi,
    Cast: CastApi,
    Console: ConsoleApi,
    DOM: DOMApi,
    DOMDebugger: DOMDebuggerApi,
    DOMSnapshot: DOMSnapshotApi,
    DOMStorage: DOMStorageApi,
    Database: DatabaseApi,
    Debugger: DebuggerApi,
    DeviceOrientation: DeviceOrientationApi,
    Emulation: EmulationApi,
    Fetch: FetchApi,
    HeadlessExperimental: HeadlessExperimentalApi,
    HeapProfiler: HeapProfilerApi,
    IO: IOApi,
    IndexedDB: IndexedDBApi,
    Input: InputApi,
    Inspector: InspectorApi,
    LayerTree: LayerTreeApi,
    Log: LogApi,
    Media: MediaApi,
    Memory: MemoryApi,
    Network: NetworkApi,
    Overlay: OverlayApi,
    Page: PageApi,
    Performance: PerformanceApi,
    Profiler: ProfilerApi,
    Runtime: RuntimeApi,
    Schema: SchemaApi,
    Security: SecurityApi,
    ServiceWorker: ServiceWorkerApi,
    Storage: StorageApi,
    SystemInfo: SystemInfoApi,
    Target: TargetApi,
    Tethering: TetheringApi,
    Tracing: TracingApi,
    WebAudio: WebAudioApi,
    WebAuthn: WebAuthnApi
  ): ProtocolApi = {
    val __obj = js.Dynamic.literal(Accessibility = Accessibility.asInstanceOf[js.Any], Animation = Animation.asInstanceOf[js.Any], ApplicationCache = ApplicationCache.asInstanceOf[js.Any], Audits = Audits.asInstanceOf[js.Any], BackgroundService = BackgroundService.asInstanceOf[js.Any], Browser = Browser.asInstanceOf[js.Any], CSS = CSS.asInstanceOf[js.Any], CacheStorage = CacheStorage.asInstanceOf[js.Any], Cast = Cast.asInstanceOf[js.Any], Console = Console.asInstanceOf[js.Any], DOM = DOM.asInstanceOf[js.Any], DOMDebugger = DOMDebugger.asInstanceOf[js.Any], DOMSnapshot = DOMSnapshot.asInstanceOf[js.Any], DOMStorage = DOMStorage.asInstanceOf[js.Any], Database = Database.asInstanceOf[js.Any], Debugger = Debugger.asInstanceOf[js.Any], DeviceOrientation = DeviceOrientation.asInstanceOf[js.Any], Emulation = Emulation.asInstanceOf[js.Any], Fetch = Fetch.asInstanceOf[js.Any], HeadlessExperimental = HeadlessExperimental.asInstanceOf[js.Any], HeapProfiler = HeapProfiler.asInstanceOf[js.Any], IO = IO.asInstanceOf[js.Any], IndexedDB = IndexedDB.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any], Inspector = Inspector.asInstanceOf[js.Any], LayerTree = LayerTree.asInstanceOf[js.Any], Log = Log.asInstanceOf[js.Any], Media = Media.asInstanceOf[js.Any], Memory = Memory.asInstanceOf[js.Any], Network = Network.asInstanceOf[js.Any], Overlay = Overlay.asInstanceOf[js.Any], Page = Page.asInstanceOf[js.Any], Performance = Performance.asInstanceOf[js.Any], Profiler = Profiler.asInstanceOf[js.Any], Runtime = Runtime.asInstanceOf[js.Any], Schema = Schema.asInstanceOf[js.Any], Security = Security.asInstanceOf[js.Any], ServiceWorker = ServiceWorker.asInstanceOf[js.Any], Storage = Storage.asInstanceOf[js.Any], SystemInfo = SystemInfo.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], Tethering = Tethering.asInstanceOf[js.Any], Tracing = Tracing.asInstanceOf[js.Any], WebAudio = WebAudio.asInstanceOf[js.Any], WebAuthn = WebAuthn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolApi]
  }
  @scala.inline
  implicit class ProtocolApiOps[Self <: ProtocolApi] (val x: Self) extends AnyVal {
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
    def setAccessibility(value: AccessibilityApi): Self = this.set("Accessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimation(value: AnimationApi): Self = this.set("Animation", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplicationCache(value: ApplicationCacheApi): Self = this.set("ApplicationCache", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudits(value: AuditsApi): Self = this.set("Audits", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundService(value: BackgroundServiceApi): Self = this.set("BackgroundService", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowser(value: BrowserApi): Self = this.set("Browser", value.asInstanceOf[js.Any])
    @scala.inline
    def setCSS(value: CSSApi): Self = this.set("CSS", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheStorage(value: CacheStorageApi): Self = this.set("CacheStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def setCast(value: CastApi): Self = this.set("Cast", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsole(value: ConsoleApi): Self = this.set("Console", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOM(value: DOMApi): Self = this.set("DOM", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMDebugger(value: DOMDebuggerApi): Self = this.set("DOMDebugger", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMSnapshot(value: DOMSnapshotApi): Self = this.set("DOMSnapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOMStorage(value: DOMStorageApi): Self = this.set("DOMStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatabase(value: DatabaseApi): Self = this.set("Database", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebugger(value: DebuggerApi): Self = this.set("Debugger", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceOrientation(value: DeviceOrientationApi): Self = this.set("DeviceOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmulation(value: EmulationApi): Self = this.set("Emulation", value.asInstanceOf[js.Any])
    @scala.inline
    def setFetch(value: FetchApi): Self = this.set("Fetch", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadlessExperimental(value: HeadlessExperimentalApi): Self = this.set("HeadlessExperimental", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeapProfiler(value: HeapProfilerApi): Self = this.set("HeapProfiler", value.asInstanceOf[js.Any])
    @scala.inline
    def setIO(value: IOApi): Self = this.set("IO", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexedDB(value: IndexedDBApi): Self = this.set("IndexedDB", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: InputApi): Self = this.set("Input", value.asInstanceOf[js.Any])
    @scala.inline
    def setInspector(value: InspectorApi): Self = this.set("Inspector", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayerTree(value: LayerTreeApi): Self = this.set("LayerTree", value.asInstanceOf[js.Any])
    @scala.inline
    def setLog(value: LogApi): Self = this.set("Log", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedia(value: MediaApi): Self = this.set("Media", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemory(value: MemoryApi): Self = this.set("Memory", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetwork(value: NetworkApi): Self = this.set("Network", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlay(value: OverlayApi): Self = this.set("Overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage(value: PageApi): Self = this.set("Page", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerformance(value: PerformanceApi): Self = this.set("Performance", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfiler(value: ProfilerApi): Self = this.set("Profiler", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntime(value: RuntimeApi): Self = this.set("Runtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: SchemaApi): Self = this.set("Schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurity(value: SecurityApi): Self = this.set("Security", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceWorker(value: ServiceWorkerApi): Self = this.set("ServiceWorker", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorage(value: StorageApi): Self = this.set("Storage", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystemInfo(value: SystemInfoApi): Self = this.set("SystemInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: TargetApi): Self = this.set("Target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTethering(value: TetheringApi): Self = this.set("Tethering", value.asInstanceOf[js.Any])
    @scala.inline
    def setTracing(value: TracingApi): Self = this.set("Tracing", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAudio(value: WebAudioApi): Self = this.set("WebAudio", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAuthn(value: WebAuthnApi): Self = this.set("WebAuthn", value.asInstanceOf[js.Any])
  }
  
}

