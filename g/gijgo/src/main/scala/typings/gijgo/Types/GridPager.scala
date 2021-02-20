package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//Grid
@js.native
trait GridPager extends StObject {
  
  var leftControls: js.UndefOr[js.Array[_]] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var rightControls: js.UndefOr[js.Array[_]] = js.native
  
  var sizes: js.UndefOr[js.Array[Double]] = js.native
}
object GridPager {
  
  @scala.inline
  def apply(): GridPager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridPager]
  }
  
  @scala.inline
  implicit class GridPagerMutableBuilder[Self <: GridPager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeftControls(value: js.Array[_]): Self = StObject.set(x, "leftControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftControlsUndefined: Self = StObject.set(x, "leftControls", js.undefined)
    
    @scala.inline
    def setLeftControlsVarargs(value: js.Any*): Self = StObject.set(x, "leftControls", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setRightControls(value: js.Array[_]): Self = StObject.set(x, "rightControls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightControlsUndefined: Self = StObject.set(x, "rightControls", js.undefined)
    
    @scala.inline
    def setRightControlsVarargs(value: js.Any*): Self = StObject.set(x, "rightControls", js.Array(value :_*))
    
    @scala.inline
    def setSizes(value: js.Array[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    @scala.inline
    def setSizesVarargs(value: Double*): Self = StObject.set(x, "sizes", js.Array(value :_*))
  }
}
