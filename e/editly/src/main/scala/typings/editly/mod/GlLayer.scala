package typings.editly.mod

import typings.editly.editlyStrings.gl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlLayer
  extends StObject
     with BaseLayer
     with Layer {
  
  /**
  		 * Fragment path (`.frag` file)
  		 */
  var fragmentPath: String
  
  /**
  		 * WARNING: Undocumented feature!
  		 */
  var speed: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Layer type.
  		 */
  @JSName("type")
  var type_GlLayer: gl
  
  /**
  		 * Vertex path (`.vert` file).
  		 */
  var vertexPath: js.UndefOr[String] = js.undefined
}
object GlLayer {
  
  inline def apply(fragmentPath: String): GlLayer = {
    val __obj = js.Dynamic.literal(fragmentPath = fragmentPath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("gl")
    __obj.asInstanceOf[GlLayer]
  }
  
  extension [Self <: GlLayer](x: Self) {
    
    inline def setFragmentPath(value: String): Self = StObject.set(x, "fragmentPath", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    inline def setType(value: gl): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVertexPath(value: String): Self = StObject.set(x, "vertexPath", value.asInstanceOf[js.Any])
    
    inline def setVertexPathUndefined: Self = StObject.set(x, "vertexPath", js.undefined)
  }
}
