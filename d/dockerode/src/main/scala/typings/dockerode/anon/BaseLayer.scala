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
  
  @scala.inline
  def apply(Type: String): BaseLayer = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLayer]
  }
  
  @scala.inline
  implicit class BaseLayerMutableBuilder[Self <: BaseLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseLayer(value: String): Self = StObject.set(x, "BaseLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseLayerUndefined: Self = StObject.set(x, "BaseLayer", js.undefined)
    
    @scala.inline
    def setLayers(value: js.Array[String]): Self = StObject.set(x, "Layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "Layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: String*): Self = StObject.set(x, "Layers", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
