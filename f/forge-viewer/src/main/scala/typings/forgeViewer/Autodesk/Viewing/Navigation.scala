package typings.forgeViewer.Autodesk.Viewing

import typings.std.ClientRect
import typings.three.mod.Box3
import typings.three.mod.Vector3
import typings.three.vector2Mod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigation extends StObject {
  
  def dollyFromPoint(distance: Double, point: Vector3): Unit
  
  def fitBounds(immediate: Boolean, bounds: Box3): js.Any
  
  def getAlignedUpVector(): Vector3
  
  def getCamera(): js.Any
  
  def getCameraRightVector(worldAligned: Boolean): Vector3
  
  def getCameraUpVector(): Vector3
  
  def getEyeVector(): Vector3
  
  def getFovMax(): Double
  
  def getFovMin(): Double
  
  def getIs2D(): Boolean
  
  def getPivotPoint(): Vector3
  
  def getPivotSetFlag(): Boolean
  
  def getPosition(): Vector3
  
  def getReverseZoomDirection(): Boolean
  
  def getScreenViewport(): ClientRect
  
  def getTarget(): Vector3
  
  def getUsePivotAlways(): Boolean
  
  def getWorldPoint(x: Double, y: Double): Vector3
  
  def screenToViewport(x: Double, y: Double): Vector3
  
  def setCameraUpVector(up: Vector): Unit
  
  def setOrbitPastWorldPoles(value: Boolean): js.Any
  
  def setPivotPoint(pivot: Vector3): Unit
  
  def setPosition(pos: Vector3): Unit
  
  def setReverseZoomDirection(state: Boolean): Unit
  
  def setScreenViewport(viewport: ClientRect): Unit
  
  def setTarget(target: Vector3): Unit
  
  def setUseLeftHandedInput(value: Boolean): js.Any
  
  def setUsePivotAlways(value: Boolean): js.Any
  
  def setVerticalFov(fov: Double, adjustPosition: Boolean): Unit
  
  def setView(position: Vector3, target: Vector3): Unit
  
  def setZoomTowardsPivot(value: Boolean): js.Any
  
  def toOrthographic(): Unit
  
  def toPerspective(): Unit
}
object Navigation {
  
  @scala.inline
  def apply(
    dollyFromPoint: (Double, Vector3) => Unit,
    fitBounds: (Boolean, Box3) => js.Any,
    getAlignedUpVector: () => Vector3,
    getCamera: () => js.Any,
    getCameraRightVector: Boolean => Vector3,
    getCameraUpVector: () => Vector3,
    getEyeVector: () => Vector3,
    getFovMax: () => Double,
    getFovMin: () => Double,
    getIs2D: () => Boolean,
    getPivotPoint: () => Vector3,
    getPivotSetFlag: () => Boolean,
    getPosition: () => Vector3,
    getReverseZoomDirection: () => Boolean,
    getScreenViewport: () => ClientRect,
    getTarget: () => Vector3,
    getUsePivotAlways: () => Boolean,
    getWorldPoint: (Double, Double) => Vector3,
    screenToViewport: (Double, Double) => Vector3,
    setCameraUpVector: Vector => Unit,
    setOrbitPastWorldPoles: Boolean => js.Any,
    setPivotPoint: Vector3 => Unit,
    setPosition: Vector3 => Unit,
    setReverseZoomDirection: Boolean => Unit,
    setScreenViewport: ClientRect => Unit,
    setTarget: Vector3 => Unit,
    setUseLeftHandedInput: Boolean => js.Any,
    setUsePivotAlways: Boolean => js.Any,
    setVerticalFov: (Double, Boolean) => Unit,
    setView: (Vector3, Vector3) => Unit,
    setZoomTowardsPivot: Boolean => js.Any,
    toOrthographic: () => Unit,
    toPerspective: () => Unit
  ): Navigation = {
    val __obj = js.Dynamic.literal(dollyFromPoint = js.Any.fromFunction2(dollyFromPoint), fitBounds = js.Any.fromFunction2(fitBounds), getAlignedUpVector = js.Any.fromFunction0(getAlignedUpVector), getCamera = js.Any.fromFunction0(getCamera), getCameraRightVector = js.Any.fromFunction1(getCameraRightVector), getCameraUpVector = js.Any.fromFunction0(getCameraUpVector), getEyeVector = js.Any.fromFunction0(getEyeVector), getFovMax = js.Any.fromFunction0(getFovMax), getFovMin = js.Any.fromFunction0(getFovMin), getIs2D = js.Any.fromFunction0(getIs2D), getPivotPoint = js.Any.fromFunction0(getPivotPoint), getPivotSetFlag = js.Any.fromFunction0(getPivotSetFlag), getPosition = js.Any.fromFunction0(getPosition), getReverseZoomDirection = js.Any.fromFunction0(getReverseZoomDirection), getScreenViewport = js.Any.fromFunction0(getScreenViewport), getTarget = js.Any.fromFunction0(getTarget), getUsePivotAlways = js.Any.fromFunction0(getUsePivotAlways), getWorldPoint = js.Any.fromFunction2(getWorldPoint), screenToViewport = js.Any.fromFunction2(screenToViewport), setCameraUpVector = js.Any.fromFunction1(setCameraUpVector), setOrbitPastWorldPoles = js.Any.fromFunction1(setOrbitPastWorldPoles), setPivotPoint = js.Any.fromFunction1(setPivotPoint), setPosition = js.Any.fromFunction1(setPosition), setReverseZoomDirection = js.Any.fromFunction1(setReverseZoomDirection), setScreenViewport = js.Any.fromFunction1(setScreenViewport), setTarget = js.Any.fromFunction1(setTarget), setUseLeftHandedInput = js.Any.fromFunction1(setUseLeftHandedInput), setUsePivotAlways = js.Any.fromFunction1(setUsePivotAlways), setVerticalFov = js.Any.fromFunction2(setVerticalFov), setView = js.Any.fromFunction2(setView), setZoomTowardsPivot = js.Any.fromFunction1(setZoomTowardsPivot), toOrthographic = js.Any.fromFunction0(toOrthographic), toPerspective = js.Any.fromFunction0(toPerspective))
    __obj.asInstanceOf[Navigation]
  }
  
  @scala.inline
  implicit class NavigationMutableBuilder[Self <: Navigation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDollyFromPoint(value: (Double, Vector3) => Unit): Self = StObject.set(x, "dollyFromPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFitBounds(value: (Boolean, Box3) => js.Any): Self = StObject.set(x, "fitBounds", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAlignedUpVector(value: () => Vector3): Self = StObject.set(x, "getAlignedUpVector", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCamera(value: () => js.Any): Self = StObject.set(x, "getCamera", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCameraRightVector(value: Boolean => Vector3): Self = StObject.set(x, "getCameraRightVector", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCameraUpVector(value: () => Vector3): Self = StObject.set(x, "getCameraUpVector", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEyeVector(value: () => Vector3): Self = StObject.set(x, "getEyeVector", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFovMax(value: () => Double): Self = StObject.set(x, "getFovMax", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFovMin(value: () => Double): Self = StObject.set(x, "getFovMin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIs2D(value: () => Boolean): Self = StObject.set(x, "getIs2D", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPivotPoint(value: () => Vector3): Self = StObject.set(x, "getPivotPoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPivotSetFlag(value: () => Boolean): Self = StObject.set(x, "getPivotSetFlag", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPosition(value: () => Vector3): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetReverseZoomDirection(value: () => Boolean): Self = StObject.set(x, "getReverseZoomDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScreenViewport(value: () => ClientRect): Self = StObject.set(x, "getScreenViewport", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTarget(value: () => Vector3): Self = StObject.set(x, "getTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUsePivotAlways(value: () => Boolean): Self = StObject.set(x, "getUsePivotAlways", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWorldPoint(value: (Double, Double) => Vector3): Self = StObject.set(x, "getWorldPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setScreenToViewport(value: (Double, Double) => Vector3): Self = StObject.set(x, "screenToViewport", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetCameraUpVector(value: Vector => Unit): Self = StObject.set(x, "setCameraUpVector", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOrbitPastWorldPoles(value: Boolean => js.Any): Self = StObject.set(x, "setOrbitPastWorldPoles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPivotPoint(value: Vector3 => Unit): Self = StObject.set(x, "setPivotPoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPosition(value: Vector3 => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetReverseZoomDirection(value: Boolean => Unit): Self = StObject.set(x, "setReverseZoomDirection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetScreenViewport(value: ClientRect => Unit): Self = StObject.set(x, "setScreenViewport", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTarget(value: Vector3 => Unit): Self = StObject.set(x, "setTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUseLeftHandedInput(value: Boolean => js.Any): Self = StObject.set(x, "setUseLeftHandedInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUsePivotAlways(value: Boolean => js.Any): Self = StObject.set(x, "setUsePivotAlways", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVerticalFov(value: (Double, Boolean) => Unit): Self = StObject.set(x, "setVerticalFov", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetView(value: (Vector3, Vector3) => Unit): Self = StObject.set(x, "setView", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetZoomTowardsPivot(value: Boolean => js.Any): Self = StObject.set(x, "setZoomTowardsPivot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToOrthographic(value: () => Unit): Self = StObject.set(x, "toOrthographic", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToPerspective(value: () => Unit): Self = StObject.set(x, "toPerspective", js.Any.fromFunction0(value))
  }
}
