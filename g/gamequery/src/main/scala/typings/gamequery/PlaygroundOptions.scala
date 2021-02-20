package typings.gamequery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaygroundOptions extends StObject {
  
  var disableCollision: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var keyTracker: js.UndefOr[Boolean] = js.native
  
  var mouseTracker: js.UndefOr[Boolean] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var refreshRate: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PlaygroundOptions {
  
  @scala.inline
  def apply(): PlaygroundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaygroundOptions]
  }
  
  @scala.inline
  implicit class PlaygroundOptionsMutableBuilder[Self <: PlaygroundOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableCollision(value: Boolean): Self = StObject.set(x, "disableCollision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableCollisionUndefined: Self = StObject.set(x, "disableCollision", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setKeyTracker(value: Boolean): Self = StObject.set(x, "keyTracker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyTrackerUndefined: Self = StObject.set(x, "keyTracker", js.undefined)
    
    @scala.inline
    def setMouseTracker(value: Boolean): Self = StObject.set(x, "mouseTracker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseTrackerUndefined: Self = StObject.set(x, "mouseTracker", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRefreshRate(value: Double): Self = StObject.set(x, "refreshRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshRateUndefined: Self = StObject.set(x, "refreshRate", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
