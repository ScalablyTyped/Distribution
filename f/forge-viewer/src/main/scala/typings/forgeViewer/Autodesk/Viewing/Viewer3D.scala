package typings.forgeViewer.Autodesk.Viewing

import typings.forgeViewer.Autodesk.Viewing.Private.Dimensions
import typings.forgeViewer.Autodesk.Viewing.Private.HitTestResult
import typings.forgeViewer.Autodesk.Viewing.Private.Viewer3DImpl
import typings.forgeViewer.Autodesk.Viewing.UI.ToolBar
import typings.std.Element
import typings.std.HTMLCanvasElement
import typings.three.mod.Camera
import typings.three.mod.Color
import typings.three.mod.Vector3
import typings.three.mod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Viewer3D extends StObject {
  
  def activateDefaultNavigationTools(is2d: Boolean): Unit = js.native
  
  def activateExtension(extensionId: String, mode: String): Boolean = js.native
  
  def activateLayerState(name: String): Unit = js.native
  
  def addEventListener(`type`: String, callback: js.Function1[/* event */ js.Any, Unit]): js.Any = js.native
  
  def allLayersHidden(): Boolean = js.native
  
  def anyLayerHidden(): Boolean = js.native
  
  def appendOrderedElementToViewer(layerOrderId: String): Unit = js.native
  
  def applyCamera(camera: Camera, fit: Boolean): Unit = js.native
  
  def areAllVisible(): Boolean = js.native
  
  var canvas: HTMLCanvasElement = js.native
  
  def clearSelection(): Unit = js.native
  
  def clearThemingColors(model: Model): Unit = js.native
  
  def clientToWorld(clientX: Double, clientY: Double): js.Any = js.native
  def clientToWorld(clientX: Double, clientY: Double, ignoreTransparent: Boolean): js.Any = js.native
  
  var container: Element = js.native
  
  def createControls(): Unit = js.native
  
  def deactivateExtension(extensionId: String): Boolean = js.native
  
  def disableHighlight(disable: Boolean): Unit = js.native
  
  def disableSelection(disable: Boolean): Unit = js.native
  
  def dispatchEvent(event: js.Object): Unit = js.native
  
  def explode(scale: Double): Unit = js.native
  
  def finish(): Unit = js.native
  
  def fitToView(): Unit = js.native
  def fitToView(ids: js.Array[Double]): Unit = js.native
  def fitToView(ids: js.Array[Double], model: Unit, immediate: Boolean): Unit = js.native
  def fitToView(ids: js.Array[Double], model: Model): Unit = js.native
  def fitToView(ids: js.Array[Double], model: Model, immediate: Boolean): Unit = js.native
  def fitToView(ids: Null, model: Unit, immediate: Boolean): Unit = js.native
  def fitToView(ids: Null, model: Model): Unit = js.native
  def fitToView(ids: Null, model: Model, immediate: Boolean): Unit = js.native
  def fitToView(ids: Unit, model: Unit, immediate: Boolean): Unit = js.native
  def fitToView(ids: Unit, model: Model): Unit = js.native
  def fitToView(ids: Unit, model: Model, immediate: Boolean): Unit = js.native
  
  def forEachExtension(callback: js.Function1[/* ext */ Extension, Unit]): Unit = js.native
  
  def getActiveNavigationTool(): String = js.native
  
  def getAggregateHiddenNodes(): js.Array[js.Any] = js.native
  
  def getAggregateIsolation(): js.Array[js.Any] = js.native
  
  def getAggregateSelection(): js.Array[js.Any] = js.native
  def getAggregateSelection(callback: js.Function2[/* model */ Model, /* dbId */ Double, Unit]): js.Array[js.Any] = js.native
  
  def getAllModels(): js.Array[Model] = js.native
  
  def getBimWalkToolPopup(): Boolean = js.native
  
  def getCamera(): Camera = js.native
  
  def getCameraFromViewArray(paramas: js.Array[Double]): Camera = js.native
  
  def getClickConfig(what: String, where: String): js.Array[String] = js.native
  
  def getCutPlanes(): js.Array[Vector4] = js.native
  
  def getDefaultNavigationTool(): String = js.native
  
  def getDimensions(): Dimensions = js.native
  
  def getExplodeScale(): Double = js.native
  
  def getExtension(extensionId: String): Extension = js.native
  def getExtension(extensionId: String, callback: js.Function1[/* ext */ Extension, Unit]): Extension = js.native
  
  def getExtensionModes(extensionId: String): js.Array[String] = js.native
  
  def getFOV(): Double = js.native
  
  def getFirstPersonToolPopup(): Boolean = js.native
  
  def getFocalLength(): Double = js.native
  
  def getHiddenNodes(): js.Array[Double] = js.native
  
  def getHotkeyManager(): js.Any = js.native
  
  def getIsolatedNodes(): js.Array[Double] = js.native
  
  def getLayerStates(): js.Array[js.Any] = js.native
  
  def getLoadedExtensions(): js.Array[String] = js.native
  
  def getNavigationLock(): Boolean = js.native
  
  def getNavigationLockSettings(): js.Any = js.native
  
  def getObjectTree(): js.Any = js.native
  def getObjectTree(onSuccessCallback: js.Function1[/* objTree */ InstanceTree, Unit]): js.Any = js.native
  def getObjectTree(
    onSuccessCallback: js.Function1[/* objTree */ InstanceTree, Unit],
    onErrorCallback: js.Function4[
      /* errorCode */ Double, 
      /* errorMessage */ String, 
      /* statusCode */ Double, 
      /* statusText */ String, 
      Unit
    ]
  ): js.Any = js.native
  def getObjectTree(
    onSuccessCallback: Unit,
    onErrorCallback: js.Function4[
      /* errorCode */ Double, 
      /* errorMessage */ String, 
      /* statusCode */ Double, 
      /* statusText */ String, 
      Unit
    ]
  ): js.Any = js.native
  
  def getProperties(dbId: Double): js.Any = js.native
  def getProperties(dbId: Double, successCallback: js.Function1[/* r */ PropertyResult, Unit]): js.Any = js.native
  def getProperties(
    dbId: Double,
    successCallback: js.Function1[/* r */ PropertyResult, Unit],
    errorCallback: js.Function4[
      /* errorCode */ Double, 
      /* errorMessage */ String, 
      /* statusCode */ Double, 
      /* statusText */ String, 
      Unit
    ]
  ): js.Any = js.native
  def getProperties(
    dbId: Double,
    successCallback: Unit,
    errorCallback: js.Function4[
      /* errorCode */ Double, 
      /* errorMessage */ String, 
      /* statusCode */ Double, 
      /* statusText */ String, 
      Unit
    ]
  ): js.Any = js.native
  
  def getScreenShot(w: Double, h: Double, cb: js.Any): Unit = js.native
  
  def getSelection(): js.Array[Double] = js.native
  
  def getSelectionCount(): Double = js.native
  
  def getSelectionVisibility(): js.Any = js.native
  
  def getState(): js.Any = js.native
  def getState(filter: js.Any): js.Any = js.native
  
  def getViewArrayFromCamera(): js.Array[Double] = js.native
  
  def getVisibleModels(): js.Array[Model] = js.native
  
  def hasEventListener(`type`: String, callback: js.Function1[/* event */ js.Any, Unit]): js.Any = js.native
  
  def hide(node: js.Array[Double]): Unit = js.native
  def hide(node: js.Array[Double], model: Model): Unit = js.native
  def hide(node: Double): Unit = js.native
  def hide(node: Double, model: Model): Unit = js.native
  
  def hideLines(hide: Boolean): Unit = js.native
  
  def hideModel(model: Double): Boolean = js.native
  def hideModel(model: Model): Boolean = js.native
  
  def hidePoints(hide: Boolean): Unit = js.native
  
  def hitTest(x: Double, y: Double, ignoreTransparent: Boolean): HitTestResult = js.native
  
  var id: Double = js.native
  
  var impl: Viewer3DImpl = js.native
  
  def initContextMenu(): Unit = js.native
  
  def initSettings(): Unit = js.native
  
  def initialize(): js.Any = js.native
  
  def isExtensionActive(extensionId: String, mode: String): Boolean = js.native
  
  def isExtensionLoaded(extensionId: String): Boolean = js.native
  
  def isHighlightActive(): Boolean = js.native
  
  def isHighlightDisabled(): Boolean = js.native
  
  def isHighlightPaused(): Boolean = js.native
  
  def isLayerVisible(node: js.Any): Boolean = js.native
  
  def isNodeVisible(node: Double): Boolean = js.native
  def isNodeVisible(node: Double, model: Model): Boolean = js.native
  
  def isSelectionDisabled(): Boolean = js.native
  
  def isolate(): Unit = js.native
  def isolate(node: js.Array[Double]): Unit = js.native
  def isolate(node: js.Array[Double], model: Model): Unit = js.native
  def isolate(node: Double): Unit = js.native
  def isolate(node: Double, model: Model): Unit = js.native
  def isolate(node: Unit, model: Model): Unit = js.native
  
  def joinLiveReview(sessionId: String): Unit = js.native
  
  def leaveLiveReview(): Unit = js.native
  
  def loadDocumentNode(avDocument: Document, manifestNode: js.Any): js.Promise[Model] = js.native
  def loadDocumentNode(avDocument: Document, manifestNode: js.Any, options: js.Object): js.Promise[Model] = js.native
  
  def loadExtension(extensionId: String): js.Promise[Extension] = js.native
  def loadExtension(extensionId: String, options: js.Object): js.Promise[Extension] = js.native
  
  def loadExtensionAsync(extensionId: String, url: String): js.Promise[Extension] = js.native
  def loadExtensionAsync(extensionId: String, url: String, options: js.Object): js.Promise[Extension] = js.native
  
  def loadModel(url: String, options: js.Object): js.Any = js.native
  def loadModel(url: String, options: js.Object, onSuccessCallback: js.Function1[/* model */ Model, Unit]): js.Any = js.native
  def loadModel(
    url: String,
    options: js.Object,
    onSuccessCallback: js.Function1[/* model */ Model, Unit],
    onErrorCallback: js.Function3[/* errorCode */ Double, /* errorMessage */ String, /* errorArgs */ js.Any, Unit]
  ): js.Any = js.native
  def loadModel(
    url: String,
    options: js.Object,
    onSuccessCallback: Unit,
    onErrorCallback: js.Function3[/* errorCode */ Double, /* errorMessage */ String, /* errorArgs */ js.Any, Unit]
  ): js.Any = js.native
  
  def localize(): Unit = js.native
  
  var model: Model = js.native
  
  def modelHasTopology(): Boolean = js.native
  
  var navigation: Navigation = js.native
  
  def onModelAdded(model: Model, preserveTools: Boolean): Unit = js.native
  
  var prefs: js.Any = js.native
  
  def refresh(clear: Boolean): Unit = js.native
  
  def registerContextMenuCallback(id: String, callback: js.Function2[/* menu */ js.Any, /* status */ js.Any, Unit]): Unit = js.native
  
  def registerDimensionSpecificHotkeys(is2d: Boolean): Unit = js.native
  
  def registerUniversalHotkeys(): Unit = js.native
  
  def removeEventListener(`type`: String, callback: js.Function1[/* event */ js.Any, Unit]): js.Any = js.native
  
  def reorderElements(element: js.Object): Unit = js.native
  
  def resize(): Unit = js.native
  
  def restoreDefaultSettings(): Unit = js.native
  
  def restoreState(viewerState: js.Any): Boolean = js.native
  def restoreState(viewerState: js.Any, filter: js.Any): Boolean = js.native
  def restoreState(viewerState: js.Any, filter: js.Any, immediate: Boolean): Boolean = js.native
  def restoreState(viewerState: js.Any, filter: Unit, immediate: Boolean): Boolean = js.native
  
  def run(): Unit = js.native
  
  def runContextMenuCallbacks(menu: js.Array[js.Any], status: js.Any): Unit = js.native
  
  def search(text: String, onSuccess: js.Any, onError: js.Any, attributeNames: js.Array[String]): Unit = js.native
  
  def select(dbIds: js.Array[Double]): Unit = js.native
  def select(dbIds: js.Array[Double], model: Unit, selectionType: Double): Unit = js.native
  def select(dbIds: js.Array[Double], model: Model): Unit = js.native
  def select(dbIds: js.Array[Double], model: Model, selectionType: Double): Unit = js.native
  def select(dbIds: Double): Unit = js.native
  def select(dbIds: Double, model: Unit, selectionType: Double): Unit = js.native
  def select(dbIds: Double, model: Model): Unit = js.native
  def select(dbIds: Double, model: Model, selectionType: Double): Unit = js.native
  
  def set2dSelectionColor(col: Color, opacity: Double): Unit = js.native
  
  def setActiveNavigationTool(): Unit = js.native
  def setActiveNavigationTool(toolName: String): Unit = js.native
  
  def setBackgroundColor(red: Double, green: Double, blue: Double, red2: Double, green2: Double, blue2: Double): Unit = js.native
  
  def setBimWalkToolPopup(value: Boolean): Unit = js.native
  
  def setCanvasClickBehavior(config: js.Any): Unit = js.native
  
  def setClickConfig(what: String, where: String, newAction: js.Array[String]): Boolean = js.native
  
  def setClickToSetCOI(state: Boolean): Unit = js.native
  def setClickToSetCOI(state: Boolean, updatePrefs: Boolean): Unit = js.native
  
  def setContextMenu(menu: js.Any): Unit = js.native
  
  def setCutPlanes(planes: js.Array[Vector4]): Unit = js.native
  
  def setDefaultContextMenu(): Boolean = js.native
  
  def setDefaultNavigationTool(name: String): Unit = js.native
  
  def setDisplayEdges(show: Boolean): Unit = js.native
  
  def setEnvMapBackground(value: Boolean): Unit = js.native
  
  def setFOV(degrees: Double): Unit = js.native
  
  def setFirstPersonToolPopup(value: Boolean): Unit = js.native
  
  def setFocalLength(mm: Double): Unit = js.native
  
  def setGhosting(value: Boolean): Unit = js.native
  
  def setGrayscale(value: Boolean): Unit = js.native
  
  def setGroundReflection(value: Boolean): Unit = js.native
  
  def setGroundReflectionAlpha(alpha: Double): Unit = js.native
  
  def setGroundReflectionColor(color: Color): Unit = js.native
  
  def setGroundShadow(value: Boolean): Unit = js.native
  
  def setGroundShadowAlpha(alpha: Double): Unit = js.native
  
  def setGroundShadowColor(color: Color): Unit = js.native
  
  def setLayerVisible(nodes: js.Array[js.Any], visible: Boolean): Unit = js.native
  def setLayerVisible(nodes: js.Array[js.Any], visible: Boolean, isolate: Boolean): Unit = js.native
  
  def setLightPreset(preset: Double): Unit = js.native
  
  def setLoadHeuristics(options: js.Object): Unit = js.native
  
  def setModelUnits(modelUnits: js.Any): Unit = js.native
  
  def setNavigationLock(value: Boolean): Unit = js.native
  
  def setNavigationLockSettings(settings: js.Any): Unit = js.native
  
  def setOptimizeNavigation(value: Boolean): Unit = js.native
  
  def setOrbitPastWorldPoles(value: Boolean): Unit = js.native
  
  def setProgressiveRendering(value: Boolean): Unit = js.native
  
  def setQualityLevel(useSAO: Boolean, useFXAA: Boolean): Unit = js.native
  
  def setReverseHorizontalLookDirection(value: Boolean): Unit = js.native
  
  def setReverseVerticalLookDirection(value: Boolean): Unit = js.native
  
  def setReverseZoomDirection(value: Boolean): Unit = js.native
  
  def setSelectionColor(col: Color, selectionType: Double): Unit = js.native
  
  def setSelectionMode(mode: Double): Unit = js.native
  
  def setSwapBlackAndWhite(value: Boolean): Unit = js.native
  
  def setTheme(name: String): Unit = js.native
  
  def setThemingColor(dbId: Double, color: Vector4): Unit = js.native
  def setThemingColor(dbId: Double, color: Vector4, model: Unit, recursive: Boolean): Unit = js.native
  def setThemingColor(dbId: Double, color: Vector4, model: Model): Unit = js.native
  def setThemingColor(dbId: Double, color: Vector4, model: Model, recursive: Boolean): Unit = js.native
  
  def setUp(config: js.Any): Unit = js.native
  
  def setUseLeftHandedInput(value: Boolean): Unit = js.native
  
  def setUsePivotAlways(value: Boolean): Unit = js.native
  
  def setView(viewNode: js.Any, options: js.Object): Boolean = js.native
  
  def setViewFromArray(params: js.Array[Double]): Unit = js.native
  
  def setViewFromFile(model: Model): Unit = js.native
  
  def setViewFromViewBox(viewbox: js.Array[Double], name: String, skipTransition: Boolean): Unit = js.native
  
  def setZoomTowardsPivot(value: Boolean): Unit = js.native
  
  def show(node: js.Array[Double]): Unit = js.native
  def show(node: js.Array[Double], model: Model): Unit = js.native
  def show(node: Double): Unit = js.native
  def show(node: Double, model: Model): Unit = js.native
  
  def showAll(): Unit = js.native
  
  def showModel(model: Double, preserveTools: Boolean): Boolean = js.native
  def showModel(model: Model, preserveTools: Boolean): Boolean = js.native
  
  def start(): js.Any = js.native
  def start(urn: String): js.Any = js.native
  def start(urn: String, onSuccesfullCallback: js.Function0[Unit]): js.Any = js.native
  def start(
    urn: String,
    onSuccesfullCallback: js.Function0[Unit],
    onErrorCallback: js.Function4[
      /* errorCode */ Double, 
      /* errorMessage */ String, 
      /* statusCode */ Double, 
      /* statusText */ String, 
      Unit
    ]
  ): js.Any = js.native
  def start(
    urn: String,
    onSuccesfullCallback: Unit,
    onErrorCallback: js.Function4[
      /* errorCode */ Double, 
      /* errorMessage */ String, 
      /* statusCode */ Double, 
      /* statusText */ String, 
      Unit
    ]
  ): js.Any = js.native
  def start(urn: Unit, onSuccesfullCallback: js.Function0[Unit]): js.Any = js.native
  def start(
    urn: Unit,
    onSuccesfullCallback: js.Function0[Unit],
    onErrorCallback: js.Function4[
      /* errorCode */ Double, 
      /* errorMessage */ String, 
      /* statusCode */ Double, 
      /* statusText */ String, 
      Unit
    ]
  ): js.Any = js.native
  def start(
    urn: Unit,
    onSuccesfullCallback: Unit,
    onErrorCallback: js.Function4[
      /* errorCode */ Double, 
      /* errorMessage */ String, 
      /* statusCode */ Double, 
      /* statusText */ String, 
      Unit
    ]
  ): js.Any = js.native
  
  def startWithDocumentNode(avDocument: Document, manifestNode: js.Any, options: js.Object): js.Promise[Unit] = js.native
  
  var started: Boolean = js.native
  
  def tearDown(): Unit = js.native
  
  def toggleSelect(dbId: Double, model: Model, selectionType: Double): Unit = js.native
  
  def toggleVisibility(dbId: Double): Unit = js.native
  def toggleVisibility(dbId: Double, model: Model): Unit = js.native
  
  var toolbar: ToolBar = js.native
  
  def trackADPExtensionsLoaded(): Unit = js.native
  
  def trackADPSettingsOptions(): Unit = js.native
  
  def triggerContextMenu(event: js.Any): Boolean = js.native
  
  def triggerDoubleTapCallback(event: js.Any): Unit = js.native
  
  def triggerSelectionChanged(dbId: Double): Unit = js.native
  
  def triggerSingleTapCallback(event: js.Any): Unit = js.native
  
  def triggerSwipeCallback(event: js.Any): Unit = js.native
  
  def uninitialize(): Unit = js.native
  
  def unloadDocumentNode(manifestNode: js.Any): Boolean = js.native
  
  def unloadExtension(extensionId: String): Boolean = js.native
  
  def unloadModel(model: Model): Unit = js.native
  
  def unregisterContextMenuCallback(id: String): Boolean = js.native
  
  def worldToClient(pt: Vector3): Vector3 = js.native
}
