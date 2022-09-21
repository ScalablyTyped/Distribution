package typings.forgeViewer.THREE

import typings.forgeViewer.anon.Derivatives
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaderMaterial
  extends StObject
     with Material {
  
  var clipping: Boolean = js.native
  
  def copy(source: ShaderMaterial): ShaderMaterial = js.native
  
  var defaultAttributeValues: Any = js.native
  
  var defines: Any = js.native
  
  /**
    * @deprecated Use extensions.derivatives
    */
  var derivatives: Any = js.native
  
  var extensions: Derivatives = js.native
  
  var fragmentShader: String = js.native
  
  var index0AttributeName: String = js.native
  
  var lights: Boolean = js.native
  
  var linewidth: Double = js.native
  
  var morphNormals: Boolean = js.native
  
  var morphTargets: Boolean = js.native
  
  def setValues(parameters: ShaderMaterialParameters): Unit = js.native
  
  var skinning: Boolean = js.native
  
  var uniforms: Any = js.native
  
  // type should be  { [uniform: string]: { value: any }; };    but gives "Index signature is missing in type" error during compilation
  var vertexShader: String = js.native
  
  var wireframe: Boolean = js.native
  
  var wireframeLinewidth: Double = js.native
}
