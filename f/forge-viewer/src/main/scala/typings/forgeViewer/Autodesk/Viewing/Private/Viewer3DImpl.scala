package typings.forgeViewer.Autodesk.Viewing.Private

import typings.forgeViewer.Autodesk.Viewing.Model
import typings.forgeViewer.THREE.Box2
import typings.forgeViewer.THREE.Box3
import typings.forgeViewer.THREE.Camera
import typings.forgeViewer.THREE.Material
import typings.forgeViewer.THREE.Matrix4
import typings.forgeViewer.THREE.Ray
import typings.forgeViewer.THREE.Scene
import typings.forgeViewer.THREE.Vector3
import typings.std.DOMRect
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Viewer3DImpl extends StObject {
  
  def addOverlay(overlayName: String, mesh: Any): Unit = js.native
  
  var camera: Camera = js.native
  
  var canvas: HTMLCanvasElement = js.native
  
  def castRay(clientX: Double, clientY: Double, ignoreTransparent: Boolean, options: Any): Any = js.native
  
  def clearHighlight(): Unit = js.native
  
  def clearOverlay(name: String): Unit = js.native
  
  def clientToViewport(clientX: Double, clientY: Double): Vector3 = js.native
  
  def clientToWorld(clientX: Double, clientY: Double): Any = js.native
  def clientToWorld(clientX: Double, clientY: Double, ignoreTransparent: Boolean): Any = js.native
  
  def createOverlayScene(name: String): Any = js.native
  def createOverlayScene(name: String, materialPre: Unit, materialPost: Unit, camera: Any): Any = js.native
  def createOverlayScene(name: String, materialPre: Unit, materialPost: Unit, camera: Any, needIdTarget: Boolean): Any = js.native
  def createOverlayScene(
    name: String,
    materialPre: Unit,
    materialPost: Unit,
    camera: Any,
    needIdTarget: Boolean,
    needSeparateDepth: Boolean
  ): Any = js.native
  def createOverlayScene(
    name: String,
    materialPre: Unit,
    materialPost: Unit,
    camera: Any,
    needIdTarget: Unit,
    needSeparateDepth: Boolean
  ): Any = js.native
  def createOverlayScene(name: String, materialPre: Unit, materialPost: Unit, camera: Unit, needIdTarget: Boolean): Any = js.native
  def createOverlayScene(
    name: String,
    materialPre: Unit,
    materialPost: Unit,
    camera: Unit,
    needIdTarget: Boolean,
    needSeparateDepth: Boolean
  ): Any = js.native
  def createOverlayScene(
    name: String,
    materialPre: Unit,
    materialPost: Unit,
    camera: Unit,
    needIdTarget: Unit,
    needSeparateDepth: Boolean
  ): Any = js.native
  def createOverlayScene(name: String, materialPre: Unit, materialPost: Material): Any = js.native
  def createOverlayScene(name: String, materialPre: Unit, materialPost: Material, camera: Any): Any = js.native
  def createOverlayScene(name: String, materialPre: Unit, materialPost: Material, camera: Any, needIdTarget: Boolean): Any = js.native
  def createOverlayScene(
    name: String,
    materialPre: Unit,
    materialPost: Material,
    camera: Any,
    needIdTarget: Boolean,
    needSeparateDepth: Boolean
  ): Any = js.native
  def createOverlayScene(
    name: String,
    materialPre: Unit,
    materialPost: Material,
    camera: Any,
    needIdTarget: Unit,
    needSeparateDepth: Boolean
  ): Any = js.native
  def createOverlayScene(name: String, materialPre: Unit, materialPost: Material, camera: Unit, needIdTarget: Boolean): Any = js.native
  def createOverlayScene(
    name: String,
    materialPre: Unit,
    materialPost: Material,
    camera: Unit,
    needIdTarget: Boolean,
    needSeparateDepth: Boolean
  ): Any = js.native
  def createOverlayScene(
    name: String,
    materialPre: Unit,
    materialPost: Material,
    camera: Unit,
    needIdTarget: Unit,
    needSeparateDepth: Boolean
  ): Any = js.native
  def createOverlayScene(name: String, materialPre: Material): Any = js.native
  def createOverlayScene(name: String, materialPre: Material, materialPost: Unit, camera: Any): Any = js.native
  def createOverlayScene(name: String, materialPre: Material, materialPost: Unit, camera: Any, needIdTarget: Boolean): Any = js.native
  def createOverlayScene(
    name: String,
    materialPre: Material,
    materialPost: Unit,
    camera: Any,
    needIdTarget: Boolean,
    needSeparateDepth: Boolean
  ): Any = js.native
  def createOverlayScene(
    name: String,
    materialPre: Material,
    materialPost: Unit,
    camera: Any,
    needIdTarget: Unit,
    needSeparateDepth: Boolean
  ): Any = js.native
  def createOverlayScene(name: String, materialPre: Material, materialPost: Unit, camera: Unit, needIdTarget: Boolean): Any = js.native
  def createOverlayScene(
    name: String,
    materialPre: Material,
    materialPost: Unit,
    camera: Unit,
    needIdTarget: Boolean,
    needSeparateDepth: Boolean
  ): Any = js.native
  def createOverlayScene(
    name: String,
    materialPre: Material,
    materialPost: Unit,
    camera: Unit,
    needIdTarget: Unit,
    needSeparateDepth: Boolean
  ): Any = js.native
  def createOverlayScene(name: String, materialPre: Material, materialPost: Material): Any = js.native
  def createOverlayScene(name: String, materialPre: Material, materialPost: Material, camera: Any): Any = js.native
  def createOverlayScene(name: String, materialPre: Material, materialPost: Material, camera: Any, needIdTarget: Boolean): Any = js.native
  def createOverlayScene(
    name: String,
    materialPre: Material,
    materialPost: Material,
    camera: Any,
    needIdTarget: Boolean,
    needSeparateDepth: Boolean
  ): Any = js.native
  def createOverlayScene(
    name: String,
    materialPre: Material,
    materialPost: Material,
    camera: Any,
    needIdTarget: Unit,
    needSeparateDepth: Boolean
  ): Any = js.native
  def createOverlayScene(name: String, materialPre: Material, materialPost: Material, camera: Unit, needIdTarget: Boolean): Any = js.native
  def createOverlayScene(
    name: String,
    materialPre: Material,
    materialPost: Material,
    camera: Unit,
    needIdTarget: Boolean,
    needSeparateDepth: Boolean
  ): Any = js.native
  def createOverlayScene(
    name: String,
    materialPre: Material,
    materialPost: Material,
    camera: Unit,
    needIdTarget: Unit,
    needSeparateDepth: Boolean
  ): Any = js.native
  
  def currentLightPreset(): Double = js.native
  
  def disableHighlight(disable: Boolean): Unit = js.native
  
  def disableSelection(disable: Boolean): Unit = js.native
  
  def getCanvasBoundingClientRect(): DOMRect = js.native
  
  def getFitBounds(p: Boolean): Box3 = js.native
  
  def getFragmentProxy(model: Model, fragId: Double): Any = js.native
  
  def getLayersRoot(): Any = js.native
  
  def getMaterials(): Any = js.native
  
  def getRenderProxy(model: Model, fragId: Double): Any = js.native
  
  def getScreenShotProgressive(w: Double, h: Double): Any = js.native
  def getScreenShotProgressive(w: Double, h: Double, onFinished: js.Function0[Unit]): Any = js.native
  def getScreenShotProgressive(w: Double, h: Double, onFinished: js.Function0[Unit], options: Any): Any = js.native
  def getScreenShotProgressive(w: Double, h: Double, onFinished: Unit, options: Any): Any = js.native
  
  def hasModels(): Boolean = js.native
  
  def hitTest(clientX: Double, clientY: Double): HitTestResult = js.native
  def hitTest(clientX: Double, clientY: Double, ignoreTransparent: Boolean): HitTestResult = js.native
  
  def hitTestViewport(vpVec: Vector3, ignoreTransparent: Boolean): HitTestResult = js.native
  
  def initialize(needsClear: Boolean, needsRender: Boolean, overlayDirty: Boolean): Unit = js.native
  
  def intersectGround(clientX: Double, clientY: Double): Vector3 = js.native
  
  def invalidate(needsClear: Boolean): Unit = js.native
  def invalidate(needsClear: Boolean, needsRender: Boolean): Unit = js.native
  def invalidate(needsClear: Boolean, needsRender: Boolean, overlayDirty: Boolean): Unit = js.native
  def invalidate(needsClear: Boolean, needsRender: Unit, overlayDirty: Boolean): Unit = js.native
  
  def matman(): MaterialManager = js.native
  
  var model: Model = js.native
  
  def modelqueue(): Any = js.native
  
  var overlayScenes: Any = js.native
  
  def pauseHighlight(disable: Boolean): Unit = js.native
  
  def rayIntersect(ray: Ray): HitTestResult = js.native
  def rayIntersect(ray: Ray, ignoreTransparent: Boolean): HitTestResult = js.native
  def rayIntersect(ray: Ray, ignoreTransparent: Boolean, dbIds: js.Array[Double]): HitTestResult = js.native
  def rayIntersect(ray: Ray, ignoreTransparent: Boolean, dbIds: js.Array[Double], modelId: js.Array[Double]): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Boolean,
    dbIds: js.Array[Double],
    modelId: js.Array[Double],
    intersections: js.Array[Any]
  ): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Boolean,
    dbIds: js.Array[Double],
    modelId: js.Array[Double],
    intersections: js.Array[Any],
    options: Any
  ): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Boolean,
    dbIds: js.Array[Double],
    modelId: js.Array[Double],
    intersections: Unit,
    options: Any
  ): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Boolean,
    dbIds: js.Array[Double],
    modelId: Unit,
    intersections: js.Array[Any]
  ): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Boolean,
    dbIds: js.Array[Double],
    modelId: Unit,
    intersections: js.Array[Any],
    options: Any
  ): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Boolean,
    dbIds: js.Array[Double],
    modelId: Unit,
    intersections: Unit,
    options: Any
  ): HitTestResult = js.native
  def rayIntersect(ray: Ray, ignoreTransparent: Boolean, dbIds: Unit, modelId: js.Array[Double]): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Boolean,
    dbIds: Unit,
    modelId: js.Array[Double],
    intersections: js.Array[Any]
  ): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Boolean,
    dbIds: Unit,
    modelId: js.Array[Double],
    intersections: js.Array[Any],
    options: Any
  ): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Boolean,
    dbIds: Unit,
    modelId: js.Array[Double],
    intersections: Unit,
    options: Any
  ): HitTestResult = js.native
  def rayIntersect(ray: Ray, ignoreTransparent: Boolean, dbIds: Unit, modelId: Unit, intersections: js.Array[Any]): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Boolean,
    dbIds: Unit,
    modelId: Unit,
    intersections: js.Array[Any],
    options: Any
  ): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Boolean,
    dbIds: Unit,
    modelId: Unit,
    intersections: Unit,
    options: Any
  ): HitTestResult = js.native
  def rayIntersect(ray: Ray, ignoreTransparent: Unit, dbIds: js.Array[Double]): HitTestResult = js.native
  def rayIntersect(ray: Ray, ignoreTransparent: Unit, dbIds: js.Array[Double], modelId: js.Array[Double]): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Unit,
    dbIds: js.Array[Double],
    modelId: js.Array[Double],
    intersections: js.Array[Any]
  ): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Unit,
    dbIds: js.Array[Double],
    modelId: js.Array[Double],
    intersections: js.Array[Any],
    options: Any
  ): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Unit,
    dbIds: js.Array[Double],
    modelId: js.Array[Double],
    intersections: Unit,
    options: Any
  ): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Unit,
    dbIds: js.Array[Double],
    modelId: Unit,
    intersections: js.Array[Any]
  ): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Unit,
    dbIds: js.Array[Double],
    modelId: Unit,
    intersections: js.Array[Any],
    options: Any
  ): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Unit,
    dbIds: js.Array[Double],
    modelId: Unit,
    intersections: Unit,
    options: Any
  ): HitTestResult = js.native
  def rayIntersect(ray: Ray, ignoreTransparent: Unit, dbIds: Unit, modelId: js.Array[Double]): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Unit,
    dbIds: Unit,
    modelId: js.Array[Double],
    intersections: js.Array[Any]
  ): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Unit,
    dbIds: Unit,
    modelId: js.Array[Double],
    intersections: js.Array[Any],
    options: Any
  ): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Unit,
    dbIds: Unit,
    modelId: js.Array[Double],
    intersections: Unit,
    options: Any
  ): HitTestResult = js.native
  def rayIntersect(ray: Ray, ignoreTransparent: Unit, dbIds: Unit, modelId: Unit, intersections: js.Array[Any]): HitTestResult = js.native
  def rayIntersect(
    ray: Ray,
    ignoreTransparent: Unit,
    dbIds: Unit,
    modelId: Unit,
    intersections: js.Array[Any],
    options: Any
  ): HitTestResult = js.native
  def rayIntersect(ray: Ray, ignoreTransparent: Unit, dbIds: Unit, modelId: Unit, intersections: Unit, options: Any): HitTestResult = js.native
  
  def removeOverlay(name: String, mesh: Any): Any = js.native
  
  def removeOverlayScene(name: String): Any = js.native
  
  var scene: Scene = js.native
  
  var sceneAfter: Scene = js.native
  
  def sceneUpdated(param: Boolean): Unit = js.native
  
  var selector: Any = js.native
  
  def setDoNotCut(model: Model, doNotCut: Boolean): Unit = js.native
  
  def setLightPreset(index: Double): Unit = js.native
  def setLightPreset(index: Double, force: Boolean): Unit = js.native
  
  def setPlacementTransform(model: Model, matrix: Matrix4): Unit = js.native
  
  def setViewFromCamera(camera: Camera): Unit = js.native
  def setViewFromCamera(camera: Camera, skipTransition: Boolean): Unit = js.native
  def setViewFromCamera(camera: Camera, skipTransition: Boolean, useExactCamera: Boolean): Unit = js.native
  def setViewFromCamera(camera: Camera, skipTransition: Unit, useExactCamera: Boolean): Unit = js.native
  
  def setViewportBounds(model: Model): Unit = js.native
  def setViewportBounds(model: Model, bounds: Box2): Unit = js.native
  def setViewportBounds(model: Model, bounds: Box3): Unit = js.native
  
  var showGhosting: Boolean = js.native
  
  def syncCamera(): Unit = js.native
  def syncCamera(syncWorldUp: Boolean): Unit = js.native
  
  def tick(highResTimeStamp: Double): Unit = js.native
  
  var use2dInstancing: Boolean = js.native
  
  def viewportToClient(viewportX: Double, viewportY: Double): Vector3 = js.native
  
  def viewportToRay(vpVec: Vector3): Ray = js.native
  def viewportToRay(vpVec: Vector3, ray: Unit, camera: Any): Ray = js.native
  def viewportToRay(vpVec: Vector3, ray: Ray): Ray = js.native
  def viewportToRay(vpVec: Vector3, ray: Ray, camera: Any): Ray = js.native
  
  var visibilityManager: VisibilityManager = js.native
  
  def worldToClient(pos: Vector3): Vector3 = js.native
  
  def worldUp(): Vector3 = js.native
  
  def worldUpName(): String = js.native
}
