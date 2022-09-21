package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLCapabilitiesParameters extends StObject {
  
  var logarithmicDepthBuffer: js.UndefOr[Any] = js.undefined
  
  var precision: js.UndefOr[Any] = js.undefined
}
object WebGLCapabilitiesParameters {
  
  inline def apply(): WebGLCapabilitiesParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLCapabilitiesParameters]
  }
  
  extension [Self <: WebGLCapabilitiesParameters](x: Self) {
    
    inline def setLogarithmicDepthBuffer(value: Any): Self = StObject.set(x, "logarithmicDepthBuffer", value.asInstanceOf[js.Any])
    
    inline def setLogarithmicDepthBufferUndefined: Self = StObject.set(x, "logarithmicDepthBuffer", js.undefined)
    
    inline def setPrecision(value: Any): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
  }
}
