package typings.forgeViewer.Autodesk.Viewing

import typings.std.DOMRect
import typings.std.HTMLCanvasElement
import typings.three.mod.Box3
import typings.three.mod.Camera
import typings.three.mod.Face3
import typings.three.mod.Material
import typings.three.mod.Matrix4
import typings.three.mod.Ray
import typings.three.mod.Scene
import typings.three.mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Private {
  
  trait BoundsCallback extends StObject {
    
    def onCircularArc(cx: Double, cy: Double, start: Double, end: Double, radius: Double, vpId: Double): Unit
    
    def onEllipticalArc(
      cx: Double,
      cy: Double,
      start: Double,
      end: Double,
      major: Double,
      minor: Double,
      tilt: Double,
      vpId: Double
    ): Unit
    
    def onLineSegment(x1: Double, y1: Double, x2: Double, y2: Double, vpId: Double): Unit
    
    def onOneTriangle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, vpId: Double): Unit
    
    def onTexQuad(centerX: Double, centerY: Double, width: Double, height: Double, rotation: Double, vpId: Double): Unit
    
    def onVertex(cx: Double, cy: Double, vpId: Double): Unit
  }
  object BoundsCallback {
    
    inline def apply(
      onCircularArc: (Double, Double, Double, Double, Double, Double) => Unit,
      onEllipticalArc: (Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
      onLineSegment: (Double, Double, Double, Double, Double) => Unit,
      onOneTriangle: (Double, Double, Double, Double, Double, Double, Double) => Unit,
      onTexQuad: (Double, Double, Double, Double, Double, Double) => Unit,
      onVertex: (Double, Double, Double) => Unit
    ): BoundsCallback = {
      val __obj = js.Dynamic.literal(onCircularArc = js.Any.fromFunction6(onCircularArc), onEllipticalArc = js.Any.fromFunction8(onEllipticalArc), onLineSegment = js.Any.fromFunction5(onLineSegment), onOneTriangle = js.Any.fromFunction7(onOneTriangle), onTexQuad = js.Any.fromFunction6(onTexQuad), onVertex = js.Any.fromFunction3(onVertex))
      __obj.asInstanceOf[BoundsCallback]
    }
    
    extension [Self <: BoundsCallback](x: Self) {
      
      inline def setOnCircularArc(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "onCircularArc", js.Any.fromFunction6(value))
      
      inline def setOnEllipticalArc(value: (Double, Double, Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "onEllipticalArc", js.Any.fromFunction8(value))
      
      inline def setOnLineSegment(value: (Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "onLineSegment", js.Any.fromFunction5(value))
      
      inline def setOnOneTriangle(value: (Double, Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "onOneTriangle", js.Any.fromFunction7(value))
      
      inline def setOnTexQuad(value: (Double, Double, Double, Double, Double, Double) => Unit): Self = StObject.set(x, "onTexQuad", js.Any.fromFunction6(value))
      
      inline def setOnVertex(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "onVertex", js.Any.fromFunction3(value))
    }
  }
  
  trait Dimensions extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Dimensions {
    
    inline def apply(height: Double, width: Double): Dimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimensions]
    }
    
    extension [Self <: Dimensions](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait HitTestResult extends StObject {
    
    var dbId: Double
    
    var distance: Double
    
    var face: Face3
    
    var faceIndex: Double
    
    var fragId: Double
    
    var intersectPoint: Vector3
    
    var model: Model
    
    var `object`: js.Any
    
    var point: Vector3
  }
  object HitTestResult {
    
    inline def apply(
      dbId: Double,
      distance: Double,
      face: Face3,
      faceIndex: Double,
      fragId: Double,
      intersectPoint: Vector3,
      model: Model,
      `object`: js.Any,
      point: Vector3
    ): HitTestResult = {
      val __obj = js.Dynamic.literal(dbId = dbId.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], face = face.asInstanceOf[js.Any], faceIndex = faceIndex.asInstanceOf[js.Any], fragId = fragId.asInstanceOf[js.Any], intersectPoint = intersectPoint.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HitTestResult]
    }
    
    extension [Self <: HitTestResult](x: Self) {
      
      inline def setDbId(value: Double): Self = StObject.set(x, "dbId", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setFace(value: Face3): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
      
      inline def setFaceIndex(value: Double): Self = StObject.set(x, "faceIndex", value.asInstanceOf[js.Any])
      
      inline def setFragId(value: Double): Self = StObject.set(x, "fragId", value.asInstanceOf[js.Any])
      
      inline def setIntersectPoint(value: Vector3): Self = StObject.set(x, "intersectPoint", value.asInstanceOf[js.Any])
      
      inline def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setPoint(value: Vector3): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Preferences extends StObject {
    
    def add(name: String, defaultValue: js.Any): Boolean = js.native
    def add(name: String, defaultValue: js.Any, tags: String): Boolean = js.native
    def add(name: String, defaultValue: js.Any, tags: js.Array[String]): Boolean = js.native
    
    def addListeners(name: String, onChangedCallback: js.Function0[Unit], onResetCallback: js.Function0[Unit]): Unit = js.native
    
    def get(): js.Any = js.native
    
    def hasTag(name: String, tag: String): Boolean = js.native
    
    def load(defaultValues: js.Object): Unit = js.native
    
    def remove(name: String): Boolean = js.native
    def remove(name: String, removeFromWebStorage: Boolean): Boolean = js.native
    
    def removeListeners(name: String): Unit = js.native
    
    def reset(): Unit = js.native
    def reset(tag: String): Unit = js.native
    def reset(tag: String, include: Boolean): Unit = js.native
    def reset(tag: Unit, include: Boolean): Unit = js.native
    
    def set(name: String, value: js.Any): Boolean = js.native
    def set(name: String, value: js.Any, notify: Boolean): Boolean = js.native
    
    def tag(tag: String): Unit = js.native
    def tag(tag: String, names: String): Unit = js.native
    def tag(tag: String, names: js.Array[String]): Unit = js.native
    
    def untag(tag: String): Unit = js.native
    def untag(tag: String, names: String): Unit = js.native
    def untag(tag: String, names: js.Array[String]): Unit = js.native
  }
  
  trait PreferencesOptions extends StObject {
    
    var localStorage: js.UndefOr[Boolean] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object PreferencesOptions {
    
    inline def apply(): PreferencesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreferencesOptions]
    }
    
    extension [Self <: PreferencesOptions](x: Self) {
      
      inline def setLocalStorage(value: Boolean): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
      
      inline def setLocalStorageUndefined: Self = StObject.set(x, "localStorage", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  trait VertexBufferReader extends StObject {
    
    def enumGeoms(filter: js.Any, callback: js.Any): Unit
    
    def enumGeomsForObject(dbId: Double, callback: js.Any): Unit
    
    def enumGeomsForVisibleLayer(layerIdsVisible: js.Array[Double], callback: js.Any): Unit
  }
  object VertexBufferReader {
    
    inline def apply(
      enumGeoms: (js.Any, js.Any) => Unit,
      enumGeomsForObject: (Double, js.Any) => Unit,
      enumGeomsForVisibleLayer: (js.Array[Double], js.Any) => Unit
    ): VertexBufferReader = {
      val __obj = js.Dynamic.literal(enumGeoms = js.Any.fromFunction2(enumGeoms), enumGeomsForObject = js.Any.fromFunction2(enumGeomsForObject), enumGeomsForVisibleLayer = js.Any.fromFunction2(enumGeomsForVisibleLayer))
      __obj.asInstanceOf[VertexBufferReader]
    }
    
    extension [Self <: VertexBufferReader](x: Self) {
      
      inline def setEnumGeoms(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "enumGeoms", js.Any.fromFunction2(value))
      
      inline def setEnumGeomsForObject(value: (Double, js.Any) => Unit): Self = StObject.set(x, "enumGeomsForObject", js.Any.fromFunction2(value))
      
      inline def setEnumGeomsForVisibleLayer(value: (js.Array[Double], js.Any) => Unit): Self = StObject.set(x, "enumGeomsForVisibleLayer", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Viewer3DImpl extends StObject {
    
    def addOverlay(overlayName: String, mesh: js.Any): Unit = js.native
    
    var camera: Camera = js.native
    
    var canvas: HTMLCanvasElement = js.native
    
    def clearHighlight(): Unit = js.native
    
    def clearOverlay(name: String): Unit = js.native
    
    def clientToViewport(clientX: Double, clientY: Double): Vector3 = js.native
    
    def clientToWorld(clientX: Double, clientY: Double): js.Any = js.native
    def clientToWorld(clientX: Double, clientY: Double, ignoreTransparent: Boolean): js.Any = js.native
    
    def createOverlayScene(name: String): Unit = js.native
    def createOverlayScene(name: String, materialPre: Unit, materialPost: Unit, camera: js.Any): Unit = js.native
    def createOverlayScene(name: String, materialPre: Unit, materialPost: Material): Unit = js.native
    def createOverlayScene(name: String, materialPre: Unit, materialPost: Material, camera: js.Any): Unit = js.native
    def createOverlayScene(name: String, materialPre: Material): Unit = js.native
    def createOverlayScene(name: String, materialPre: Material, materialPost: Unit, camera: js.Any): Unit = js.native
    def createOverlayScene(name: String, materialPre: Material, materialPost: Material): Unit = js.native
    def createOverlayScene(name: String, materialPre: Material, materialPost: Material, camera: js.Any): Unit = js.native
    
    def disableHighlight(disable: Boolean): Unit = js.native
    
    def disableSelection(disable: Boolean): Unit = js.native
    
    def getCanvasBoundingClientRect(): DOMRect = js.native
    
    def getFitBounds(p: Boolean): Box3 = js.native
    
    def getMaterials(): js.Any = js.native
    
    def getRenderProxy(model: Model, fragId: Double): js.Any = js.native
    
    def getScreenShotProgressive(w: Double, h: Double): js.Any = js.native
    def getScreenShotProgressive(w: Double, h: Double, onFinished: js.Function0[Unit]): js.Any = js.native
    def getScreenShotProgressive(w: Double, h: Double, onFinished: js.Function0[Unit], options: js.Any): js.Any = js.native
    def getScreenShotProgressive(w: Double, h: Double, onFinished: Unit, options: js.Any): js.Any = js.native
    
    def hitTest(clientX: Double, clientY: Double): HitTestResult = js.native
    def hitTest(clientX: Double, clientY: Double, ignoreTransparent: Boolean): HitTestResult = js.native
    
    def hitTestViewport(vpVec: Vector3, ignoreTransparent: Boolean): HitTestResult = js.native
    
    def initialize(needsClear: Boolean, needsRender: Boolean, overlayDirty: Boolean): Unit = js.native
    
    def intersectGround(clientX: Double, clientY: Double): Vector3 = js.native
    
    def invalidate(needsClear: Boolean): Unit = js.native
    def invalidate(needsClear: Boolean, needsRender: Boolean): Unit = js.native
    def invalidate(needsClear: Boolean, needsRender: Boolean, overlayDirty: Boolean): Unit = js.native
    def invalidate(needsClear: Boolean, needsRender: Unit, overlayDirty: Boolean): Unit = js.native
    
    def matman(): js.Any = js.native
    
    var model: Model = js.native
    
    def modelqueue(): js.Any = js.native
    
    var overlayScenes: js.Any = js.native
    
    def pauseHighlight(disable: Boolean): Unit = js.native
    
    def rayIntersect(ray: Ray): HitTestResult = js.native
    
    def removeOverlay(name: String, mesh: js.Any): js.Any = js.native
    
    def removeOverlayScene(name: String): js.Any = js.native
    
    var scene: Scene = js.native
    
    var sceneAfter: Scene = js.native
    
    def sceneUpdated(param: Boolean): Unit = js.native
    
    var selector: js.Any = js.native
    
    def setLightPreset(index: Double): Unit = js.native
    def setLightPreset(index: Double, force: Boolean): Unit = js.native
    
    def setPlacementTransform(model: Model, matrix: Matrix4): Unit = js.native
    
    def setViewFromCamera(camera: Camera): Unit = js.native
    def setViewFromCamera(camera: Camera, skipTransition: Boolean): Unit = js.native
    def setViewFromCamera(camera: Camera, skipTransition: Boolean, useExactCamera: Boolean): Unit = js.native
    def setViewFromCamera(camera: Camera, skipTransition: Unit, useExactCamera: Boolean): Unit = js.native
    
    def syncCamera(): Unit = js.native
    def syncCamera(syncWorldUp: Boolean): Unit = js.native
    
    var use2dInstancing: Boolean = js.native
    
    def viewportToClient(viewportX: Double, viewportY: Double): Vector3 = js.native
    
    def viewportToRay(vpVec: Vector3): Ray = js.native
    def viewportToRay(vpVec: Vector3, ray: Unit, camera: js.Any): Ray = js.native
    def viewportToRay(vpVec: Vector3, ray: Ray): Ray = js.native
    def viewportToRay(vpVec: Vector3, ray: Ray, camera: js.Any): Ray = js.native
    
    var visibilityManager: VisibilityManager = js.native
    
    def worldToClient(pos: Vector3): Vector3 = js.native
    
    def worldUp(): Vector3 = js.native
    
    def worldUpName(): String = js.native
  }
  
  @js.native
  trait ViewerState extends StObject {
    
    def areEqual(viewerStateA: js.Object, viewerStateB: js.Object): Boolean = js.native
    def areEqual(viewerStateA: js.Object, viewerStateB: js.Object, filter: js.Object): Boolean = js.native
    
    def getSeedUrn(): String = js.native
    
    def getState(): js.Object = js.native
    def getState(filter: js.Object): js.Object = js.native
    
    def restoreState(viewerState: js.Object): Boolean = js.native
    def restoreState(viewerState: js.Object, filter: js.Object): Boolean = js.native
    def restoreState(viewerState: js.Object, filter: js.Object, immediate: Boolean): Boolean = js.native
    def restoreState(viewerState: js.Object, filter: Unit, immediate: Boolean): Boolean = js.native
  }
  
  @js.native
  trait VisibilityManager extends StObject {
    
    def getHiddenNodes(): js.Any = js.native
    
    def getInstanceTree(): InstanceTree = js.native
    
    def getIsolatedNodes(): js.Any = js.native
    
    def hide(node: js.Object): Unit = js.native
    def hide(node: Double): Unit = js.native
    
    def isNodeVisible(dbId: Double): Boolean = js.native
    
    def isolate(node: js.Object): Unit = js.native
    def isolate(node: Double): Unit = js.native
    
    def isolateMultiple(nodeList: js.Array[js.Any]): Unit = js.native
    
    def isolateNone(): Unit = js.native
    
    def setAllVisibility(visible: Boolean): Unit = js.native
    
    def setNodeOff(node: js.Object, isOff: Boolean): Unit = js.native
    def setNodeOff(node: Double, isOff: Boolean): Unit = js.native
    
    def setVisibilityOnNode(node: js.Object, visible: Boolean): Unit = js.native
    def setVisibilityOnNode(node: Double, visible: Boolean): Unit = js.native
    
    def show(node: js.Object): Unit = js.native
    def show(node: Double): Unit = js.native
    
    def toggleVisibility(node: js.Object): Unit = js.native
    def toggleVisibility(node: Double): Unit = js.native
    
    def updateNodeVisibilityTracking(node: js.Object, visible: Boolean): Unit = js.native
    def updateNodeVisibilityTracking(node: Double, visible: Boolean): Unit = js.native
  }
}
