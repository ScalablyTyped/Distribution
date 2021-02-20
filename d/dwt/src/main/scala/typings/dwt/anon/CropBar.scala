package typings.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CropBar extends StObject {
  
  var cropBar: js.UndefOr[Boolean] = js.native
  
  // Example [[1, 1], [3, 2], [4, 3], [5, 4], [7, 5], [16, 9]],
  var cropMask: js.UndefOr[Boolean] = js.native
  
  var ratios: js.UndefOr[js.Any] = js.native
}
object CropBar {
  
  @scala.inline
  def apply(): CropBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropBar]
  }
  
  @scala.inline
  implicit class CropBarMutableBuilder[Self <: CropBar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCropBar(value: Boolean): Self = StObject.set(x, "cropBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropBarUndefined: Self = StObject.set(x, "cropBar", js.undefined)
    
    @scala.inline
    def setCropMask(value: Boolean): Self = StObject.set(x, "cropMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropMaskUndefined: Self = StObject.set(x, "cropMask", js.undefined)
    
    @scala.inline
    def setRatios(value: js.Any): Self = StObject.set(x, "ratios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatiosUndefined: Self = StObject.set(x, "ratios", js.undefined)
  }
}
