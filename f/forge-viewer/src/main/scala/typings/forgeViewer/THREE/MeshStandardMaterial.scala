package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshStandardMaterial
  extends StObject
     with Material {
  
  var alphaMap: Texture = js.native
  
  var aoMap: Texture = js.native
  
  var aoMapIntensity: Double = js.native
  
  var bumpMap: Texture = js.native
  
  var bumpScale: Double = js.native
  
  var color: Color = js.native
  
  def copy(source: MeshStandardMaterial): MeshStandardMaterial = js.native
  
  var defines: Any = js.native
  
  var displacementBias: Double = js.native
  
  var displacementMap: Texture = js.native
  
  var displacementScale: Double = js.native
  
  var emissive: Color = js.native
  
  var emissiveIntensity: Double = js.native
  
  var emissiveMap: Texture = js.native
  
  var envMap: Texture = js.native
  
  var envMapIntensity: Double = js.native
  
  var lighhtMap: Texture = js.native
  
  var lightMapIntensity: Double = js.native
  
  var map: Texture = js.native
  
  var metalMap: Texture = js.native
  
  var metalness: Double = js.native
  
  var morphNormals: Boolean = js.native
  
  var morphTargets: Boolean = js.native
  
  var normalMap: Texture = js.native
  
  var normalScale: Double = js.native
  
  var refractionRatio: Double = js.native
  
  var roughness: Double = js.native
  
  var roughnessMap: Texture = js.native
  
  def setValues(parameters: MeshStandardMaterialParameters): Unit = js.native
  
  var skinning: Boolean = js.native
  
  var wireframe: Boolean = js.native
  
  var wireframeLinewidth: Double = js.native
}
