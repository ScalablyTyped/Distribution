package typings.forgeViewer.global.Autodesk.Viewing

import typings.std.ClientRect
import typings.three.mod.Box3
import typings.three.mod.Vector3
import typings.three.vector2Mod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Autodesk.Viewing.Navigation")
@js.native
class Navigation ()
  extends StObject
     with typings.forgeViewer.Autodesk.Viewing.Navigation {
  
  /* CompleteClass */
  override def dollyFromPoint(distance: Double, point: Vector3): Unit = js.native
  
  /* CompleteClass */
  override def fitBounds(immediate: Boolean, bounds: Box3): js.Any = js.native
  
  /* CompleteClass */
  override def getAlignedUpVector(): Vector3 = js.native
  
  /* CompleteClass */
  override def getCamera(): js.Any = js.native
  
  /* CompleteClass */
  override def getCameraRightVector(worldAligned: Boolean): Vector3 = js.native
  
  /* CompleteClass */
  override def getCameraUpVector(): Vector3 = js.native
  
  /* CompleteClass */
  override def getEyeVector(): Vector3 = js.native
  
  /* CompleteClass */
  override def getFovMax(): Double = js.native
  
  /* CompleteClass */
  override def getFovMin(): Double = js.native
  
  /* CompleteClass */
  override def getIs2D(): Boolean = js.native
  
  /* CompleteClass */
  override def getPivotPoint(): Vector3 = js.native
  
  /* CompleteClass */
  override def getPivotSetFlag(): Boolean = js.native
  
  /* CompleteClass */
  override def getPosition(): Vector3 = js.native
  
  /* CompleteClass */
  override def getReverseZoomDirection(): Boolean = js.native
  
  /* CompleteClass */
  override def getScreenViewport(): ClientRect = js.native
  
  /* CompleteClass */
  override def getTarget(): Vector3 = js.native
  
  /* CompleteClass */
  override def getUsePivotAlways(): Boolean = js.native
  
  /* CompleteClass */
  override def getWorldPoint(x: Double, y: Double): Vector3 = js.native
  
  /* CompleteClass */
  override def screenToViewport(x: Double, y: Double): Vector3 = js.native
  
  /* CompleteClass */
  override def setCameraUpVector(up: Vector): Unit = js.native
  
  /* CompleteClass */
  override def setOrbitPastWorldPoles(value: Boolean): js.Any = js.native
  
  /* CompleteClass */
  override def setPivotPoint(pivot: Vector3): Unit = js.native
  
  /* CompleteClass */
  override def setPosition(pos: Vector3): Unit = js.native
  
  /* CompleteClass */
  override def setReverseZoomDirection(state: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def setScreenViewport(viewport: ClientRect): Unit = js.native
  
  /* CompleteClass */
  override def setTarget(target: Vector3): Unit = js.native
  
  /* CompleteClass */
  override def setUseLeftHandedInput(value: Boolean): js.Any = js.native
  
  /* CompleteClass */
  override def setUsePivotAlways(value: Boolean): js.Any = js.native
  
  /* CompleteClass */
  override def setVerticalFov(fov: Double, adjustPosition: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def setView(position: Vector3, target: Vector3): Unit = js.native
  
  /* CompleteClass */
  override def setZoomTowardsPivot(value: Boolean): js.Any = js.native
  
  /* CompleteClass */
  override def toOrthographic(): Unit = js.native
  
  /* CompleteClass */
  override def toPerspective(): Unit = js.native
}
