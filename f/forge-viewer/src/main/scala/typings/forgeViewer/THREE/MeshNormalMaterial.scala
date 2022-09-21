package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshNormalMaterial
  extends StObject
     with Material {
  
  def copy(source: MeshNormalMaterial): MeshNormalMaterial = js.native
  
  var morphTargets: Boolean = js.native
  
  def setValues(parameters: MeshNormalMaterialParameters): Unit = js.native
  
  var wireframe: Boolean = js.native
  
  var wireframeLinewidth: Double = js.native
}
