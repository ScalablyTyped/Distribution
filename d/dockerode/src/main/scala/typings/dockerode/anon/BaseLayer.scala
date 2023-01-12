package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseLayer extends StObject {
  
  var BaseLayer: js.UndefOr[String] = js.undefined
  
  var Layers: js.UndefOr[js.Array[String]] = js.undefined
  
  var Type: String
}
object BaseLayer {
  
  inline def apply(Type: String): BaseLayer = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseLayer] (val x: Self) extends AnyVal {
    
    inline def setBaseLayer(value: String): Self = StObject.set(x, "BaseLayer", value.asInstanceOf[js.Any])
    
    inline def setBaseLayerUndefined: Self = StObject.set(x, "BaseLayer", js.undefined)
    
    inline def setLayers(value: js.Array[String]): Self = StObject.set(x, "Layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "Layers", js.undefined)
    
    inline def setLayersVarargs(value: String*): Self = StObject.set(x, "Layers", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
