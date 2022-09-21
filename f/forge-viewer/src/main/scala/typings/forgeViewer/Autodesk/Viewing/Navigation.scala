package typings.forgeViewer.Autodesk.Viewing

import typings.forgeViewer.THREE.Box3
import typings.forgeViewer.THREE.Vector3
import typings.forgeViewer.anon.Position
import typings.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigation extends StObject {
  
  def computeOverviewDistance(bound: Box3): Double = js.native
  
  def dollyFromPoint(distance: Double, point: Vector3): Unit = js.native
  
  def fitBounds(immediate: Boolean, bounds: Box3): Position = js.native
  def fitBounds(immediate: Boolean, bounds: Box3, reorient: Boolean): Position = js.native
  def fitBounds(immediate: Boolean, bounds: Box3, reorient: Boolean, force: Boolean): Position = js.native
  def fitBounds(immediate: Boolean, bounds: Box3, reorient: Unit, force: Boolean): Position = js.native
  
  def getAlignedUpVector(): Vector3 = js.native
  
  def getCamera(): Any = js.native
  
  def getCameraRightVector(worldAligned: Boolean): Vector3 = js.native
  
  def getCameraUpVector(): Vector3 = js.native
  
  def getEyeVector(): Vector3 = js.native
  
  def getFovMax(): Double = js.native
  
  def getFovMin(): Double = js.native
  
  def getIs2D(): Boolean = js.native
  
  def getPivotPoint(): Vector3 = js.native
  
  def getPivotSetFlag(): Boolean = js.native
  
  def getPosition(): Vector3 = js.native
  
  def getReverseZoomDirection(): Boolean = js.native
  
  def getScreenViewport(): ClientRect = js.native
  
  def getTarget(): Vector3 = js.native
  
  def getUsePivotAlways(): Boolean = js.native
  
  def getVerticalFov(): Double = js.native
  
  def getWorldPoint(x: Double, y: Double): Vector3 = js.native
  
  /**
    * Get the current world up direction.
    *
    * @returns the current world up direction (normalized)
    */
  def getWorldUpVector(): Vector3 = js.native
  
  def orientCameraUp(force: Boolean): Unit = js.native
  
  def screenToViewport(x: Double, y: Double): Vector3 = js.native
  
  def setCameraUpVector(up: Vector3): Unit = js.native
  
  def setOrbitPastWorldPoles(value: Boolean): Any = js.native
  
  def setPivotPoint(pivot: Vector3): Unit = js.native
  
  def setPosition(pos: Vector3): Unit = js.native
  
  def setRequestHomeView(): Unit = js.native
  def setRequestHomeView(`val`: Boolean): Unit = js.native
  
  def setRequestTransitionWithUp(state: Boolean, pos: Vector3, coi: Vector3, fov: Double, up: Vector3): Unit = js.native
  def setRequestTransitionWithUp(state: Boolean, pos: Vector3, coi: Vector3, fov: Double, up: Vector3, worldUp: Vector3): Unit = js.native
  
  def setReverseZoomDirection(state: Boolean): Unit = js.native
  
  def setScreenViewport(viewport: ClientRect): Unit = js.native
  
  def setTarget(target: Vector3): Unit = js.native
  
  def setUseLeftHandedInput(value: Boolean): Any = js.native
  
  def setUsePivotAlways(value: Boolean): Any = js.native
  
  def setVerticalFov(fov: Double, adjustPosition: Boolean): Unit = js.native
  
  def setView(position: Vector3, target: Vector3): Unit = js.native
  
  /**
    * Change the current world up direction.
    *
    * @param up - the new world up direction
    * @param reorient - if true, make sure the camera up is oriented towards the world up direction.
    * @param force - if true, will set the new direction regardless of navigation lock
    */
  def setWorldUpVector(up: Vector3, reorient: Boolean, force: Boolean): Unit = js.native
  
  def setZoomTowardsPivot(value: Boolean): Any = js.native
  
  def toOrthographic(): Unit = js.native
  
  def toPerspective(): Unit = js.native
}
