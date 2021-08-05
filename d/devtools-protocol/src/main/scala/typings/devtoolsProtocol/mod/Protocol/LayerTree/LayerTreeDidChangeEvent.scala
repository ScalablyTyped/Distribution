package typings.devtoolsProtocol.mod.Protocol.LayerTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerTreeDidChangeEvent extends StObject {
  
  /**
    * Layer tree, absent if not in the comspositing mode.
    */
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
}
object LayerTreeDidChangeEvent {
  
  inline def apply(): LayerTreeDidChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerTreeDidChangeEvent]
  }
  
  extension [Self <: LayerTreeDidChangeEvent](x: Self) {
    
    inline def setLayers(value: js.Array[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value :_*))
  }
}
