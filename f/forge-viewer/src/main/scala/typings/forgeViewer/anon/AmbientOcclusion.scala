package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmbientOcclusion extends StObject {
  
  var ambientOcclusion: Enabled
  
  var appearance: AmbientShadow
  
  var environment: String
  
  var toneMap: Exposure
}
object AmbientOcclusion {
  
  inline def apply(ambientOcclusion: Enabled, appearance: AmbientShadow, environment: String, toneMap: Exposure): AmbientOcclusion = {
    val __obj = js.Dynamic.literal(ambientOcclusion = ambientOcclusion.asInstanceOf[js.Any], appearance = appearance.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], toneMap = toneMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmbientOcclusion]
  }
  
  extension [Self <: AmbientOcclusion](x: Self) {
    
    inline def setAmbientOcclusion(value: Enabled): Self = StObject.set(x, "ambientOcclusion", value.asInstanceOf[js.Any])
    
    inline def setAppearance(value: AmbientShadow): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setToneMap(value: Exposure): Self = StObject.set(x, "toneMap", value.asInstanceOf[js.Any])
  }
}
