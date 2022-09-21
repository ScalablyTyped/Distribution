package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotLight
  extends StObject
     with Light {
  
  var angle: Double = js.native
  
  def copy(source: PointLight): SpotLight = js.native
  
  var decay: Double = js.native
  
  var distance: Double = js.native
  
  var exponent: Double = js.native
  
  var penumbra: Double = js.native
  
  var power: Double = js.native
  
  @JSName("shadow")
  var shadow_SpotLight: SpotLightShadow = js.native
  
  var target: Object3D = js.native
}
