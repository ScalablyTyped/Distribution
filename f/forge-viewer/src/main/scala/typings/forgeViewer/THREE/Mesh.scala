package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mesh
  extends StObject
     with Object3D {
  
  def copy(source: Mesh): Mesh = js.native
  
  var dbId: js.UndefOr[Double] = js.native
  
  var drawMode: TrianglesDrawModes = js.native
  
  var geometry: Geometry | BufferGeometry = js.native
  
  def getMorphTargetIndexByName(name: String): Double = js.native
  
  var material: Material = js.native
  
  def setDrawMode(drawMode: TrianglesDrawModes): Unit = js.native
  
  def updateMorphTargets(): Unit = js.native
}
