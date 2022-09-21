package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLayersForNodeResponse extends StObject {
  
  var rootLayer: CSSLayerData
}
object GetLayersForNodeResponse {
  
  inline def apply(rootLayer: CSSLayerData): GetLayersForNodeResponse = {
    val __obj = js.Dynamic.literal(rootLayer = rootLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayersForNodeResponse]
  }
  
  extension [Self <: GetLayersForNodeResponse](x: Self) {
    
    inline def setRootLayer(value: CSSLayerData): Self = StObject.set(x, "rootLayer", value.asInstanceOf[js.Any])
  }
}
