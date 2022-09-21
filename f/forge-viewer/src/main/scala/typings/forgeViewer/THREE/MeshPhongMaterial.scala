package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshPhongMaterial
  extends StObject
     with Material {
  
  var alphaMap: Texture = js.native
  
  var aoMap: Texture = js.native
  
  var aoMapIntensity: Double = js.native
  
  var bumpMap: Texture = js.native
  
  var bumpScale: Double = js.native
  
  var color: Color = js.native
  
  var combine: Combine = js.native
  
  def copy(source: MeshPhongMaterial): MeshPhongMaterial = js.native
  
  var displacementBias: Double = js.native
  
  var displacementMap: Texture = js.native
  
  var displacementScale: Double = js.native
  
  var emissive: Color = js.native
  
  var emissiveIntensity: Double = js.native
  
  var emissiveMap: Texture = js.native
  
  var envMap: Texture = js.native
  
  var lightMap: Texture = js.native
  
  var lightMapIntensity: Double = js.native
  
  var map: Texture = js.native
  
  var metal: Boolean = js.native
  
  var morphNormals: Boolean = js.native
  
  var morphTargets: Boolean = js.native
  
  var normalMap: Texture = js.native
  
  var normalScale: Vector2 = js.native
  
  var reflectivity: Double = js.native
  
  var refractionRatio: Double = js.native
  
  def setValues(parameters: MeshPhongMaterialParameters): Unit = js.native
  
  var shininess: Double = js.native
  
  var skinning: Boolean = js.native
  
  // diffuse
  var specular: Color = js.native
  
  var specularMap: Texture = js.native
  
  var wireframe: Boolean = js.native
  
  var wireframeLinecap: String = js.native
  
  var wireframeLinejoin: String = js.native
  
  var wireframeLinewidth: Double = js.native
}
