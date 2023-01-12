package typings.editly.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseLayer extends StObject {
  
  /**
  		 * What time into the clip should this layer start (in seconds).
  		 */
  var start: js.UndefOr[Double] = js.undefined
  
  /**
  		 * What time into the clip should this layer stop (in seconds).
  		 */
  var stop: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Layer type.
  		 */
  var `type`: LayerType
}
object BaseLayer {
  
  inline def apply(`type`: LayerType): BaseLayer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseLayer] (val x: Self) extends AnyVal {
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: Double): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    inline def setType(value: LayerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
