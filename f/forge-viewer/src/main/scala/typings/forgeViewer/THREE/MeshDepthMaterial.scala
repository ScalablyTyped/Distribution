package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshDepthMaterial
  extends StObject
     with Material {
  
  def copy(source: MeshDepthMaterial): MeshDepthMaterial = js.native
  
  def setValues(parameters: MeshDepthMaterialParameters): Unit = js.native
  
  var wireframe: Boolean = js.native
  
  var wireframeLinewidth: Double = js.native
}
