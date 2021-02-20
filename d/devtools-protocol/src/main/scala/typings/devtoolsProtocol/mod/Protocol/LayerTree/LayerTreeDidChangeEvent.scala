package typings.devtoolsProtocol.mod.Protocol.LayerTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerTreeDidChangeEvent extends StObject {
  
  /**
    * Layer tree, absent if not in the comspositing mode.
    */
  var layers: js.UndefOr[js.Array[Layer]] = js.native
}
object LayerTreeDidChangeEvent {
  
  @scala.inline
  def apply(): LayerTreeDidChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerTreeDidChangeEvent]
  }
  
  @scala.inline
  implicit class LayerTreeDidChangeEventMutableBuilder[Self <: LayerTreeDidChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayers(value: js.Array[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value :_*))
  }
}
