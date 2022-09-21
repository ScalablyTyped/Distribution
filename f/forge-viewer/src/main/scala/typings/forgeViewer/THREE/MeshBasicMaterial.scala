package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshBasicMaterial
  extends StObject
     with Material {
  
  var alphaMap: Texture = js.native
  
  var aoMap: Texture = js.native
  
  var aoMapIntensity: Double = js.native
  
  var color: Color = js.native
  
  var combine: Combine = js.native
  
  def copy(source: MeshBasicMaterial): MeshBasicMaterial = js.native
  
  var envMap: Texture = js.native
  
  var map: Texture = js.native
  
  var morphTargets: Boolean = js.native
  
  var reflectivity: Double = js.native
  
  var refractionRatio: Double = js.native
  
  def setValues(parameters: MeshBasicMaterialParameters): Unit = js.native
  
  var shading: Shading = js.native
  
  var skinning: Boolean = js.native
  
  var specularMap: Texture = js.native
  
  var wireframe: Boolean = js.native
  
  var wireframeLinecap: String = js.native
  
  var wireframeLinejoin: String = js.native
  
  var wireframeLinewidth: Double = js.native
}
