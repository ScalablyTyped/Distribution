package typings.forgeViewer.THREE

import typings.forgeViewer.anon.FullHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrthographicCamera
  extends StObject
     with Camera {
  
  var bottom: Double = js.native
  
  def clearViewOffset(): Unit = js.native
  
  def copy(source: OrthographicCamera): OrthographicCamera = js.native
  
  var far: Double = js.native
  
  var left: Double = js.native
  
  var near: Double = js.native
  
  var right: Double = js.native
  
  def setViewOffset(
    fullWidth: Double,
    fullHeight: Double,
    offsetX: Double,
    offsetY: Double,
    width: Double,
    height: Double
  ): Unit = js.native
  
  def toJSON(meta: Any): Any = js.native
  
  var top: Double = js.native
  
  def updateProjectionMatrix(): Unit = js.native
  
  var view: FullHeight = js.native
  
  var zoom: Double = js.native
}
