package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloud
  extends StObject
     with Object3D {
  
  def copy(source: PointCloud): PointCloud = js.native
  
  var geometry: Geometry | BufferGeometry = js.native
  
  var material: Material = js.native
}
