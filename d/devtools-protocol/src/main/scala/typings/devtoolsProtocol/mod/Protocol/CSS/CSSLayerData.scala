package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSLayerData extends StObject {
  
  /**
    * Layer name.
    */
  var name: String
  
  /**
    * Layer order. The order determines the order of the layer in the cascade order.
    * A higher number has higher priority in the cascade order.
    */
  var order: Double
  
  /**
    * Direct sub-layers
    */
  var subLayers: js.UndefOr[js.Array[CSSLayerData]] = js.undefined
}
object CSSLayerData {
  
  inline def apply(name: String, order: Double): CSSLayerData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSLayerData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSLayerData] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setSubLayers(value: js.Array[CSSLayerData]): Self = StObject.set(x, "subLayers", value.asInstanceOf[js.Any])
    
    inline def setSubLayersUndefined: Self = StObject.set(x, "subLayers", js.undefined)
    
    inline def setSubLayersVarargs(value: CSSLayerData*): Self = StObject.set(x, "subLayers", js.Array(value*))
  }
}
