package typings.fastclick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastClickOptions extends StObject {
  
  var tapDelay: js.UndefOr[Double] = js.native
  
  var touchBoundary: js.UndefOr[Double] = js.native
}
object FastClickOptions {
  
  @scala.inline
  def apply(): FastClickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FastClickOptions]
  }
  
  @scala.inline
  implicit class FastClickOptionsMutableBuilder[Self <: FastClickOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTapDelay(value: Double): Self = StObject.set(x, "tapDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapDelayUndefined: Self = StObject.set(x, "tapDelay", js.undefined)
    
    @scala.inline
    def setTouchBoundary(value: Double): Self = StObject.set(x, "touchBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBoundaryUndefined: Self = StObject.set(x, "touchBoundary", js.undefined)
  }
}
