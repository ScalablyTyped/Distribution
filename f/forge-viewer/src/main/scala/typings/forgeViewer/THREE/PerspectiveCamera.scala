package typings.forgeViewer.THREE

import typings.forgeViewer.anon.FullWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerspectiveCamera
  extends StObject
     with Camera {
  
  var aspect: Double = js.native
  
  def clearViewOffset(): Unit = js.native
  
  var far: Double = js.native
  
  var filmGauge: Double = js.native
  
  var filmOffset: Double = js.native
  
  var focus: Double = js.native
  
  var fov: Double = js.native
  
  def getEffectiveFOV(): Double = js.native
  
  def getFilmHeight(): Double = js.native
  
  def getFilmWidth(): Double = js.native
  
  def getFocalLength(): Double = js.native
  
  var near: Double = js.native
  
  def setFocalLength(focalLength: Double): Unit = js.native
  
  /**
    * @deprecated
    */
  def setLens(focalLength: Double): Unit = js.native
  def setLens(focalLength: Double, frameHeight: Double): Unit = js.native
  
  def setViewOffset(fullWidth: Double, fullHeight: Double, x: Double, y: Double, width: Double, height: Double): Unit = js.native
  
  def toJSON(meta: Any): Any = js.native
  
  def updateProjectionMatrix(): Unit = js.native
  
  var view: FullWidth = js.native
  
  var zoom: Double = js.native
}
