package typings.gamequery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaygroundOptions extends StObject {
  
  var disableCollision: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var keyTracker: js.UndefOr[Boolean] = js.undefined
  
  var mouseTracker: js.UndefOr[Boolean] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var refreshRate: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PlaygroundOptions {
  
  inline def apply(): PlaygroundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaygroundOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaygroundOptions] (val x: Self) extends AnyVal {
    
    inline def setDisableCollision(value: Boolean): Self = StObject.set(x, "disableCollision", value.asInstanceOf[js.Any])
    
    inline def setDisableCollisionUndefined: Self = StObject.set(x, "disableCollision", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setKeyTracker(value: Boolean): Self = StObject.set(x, "keyTracker", value.asInstanceOf[js.Any])
    
    inline def setKeyTrackerUndefined: Self = StObject.set(x, "keyTracker", js.undefined)
    
    inline def setMouseTracker(value: Boolean): Self = StObject.set(x, "mouseTracker", value.asInstanceOf[js.Any])
    
    inline def setMouseTrackerUndefined: Self = StObject.set(x, "mouseTracker", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRefreshRate(value: Double): Self = StObject.set(x, "refreshRate", value.asInstanceOf[js.Any])
    
    inline def setRefreshRateUndefined: Self = StObject.set(x, "refreshRate", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
