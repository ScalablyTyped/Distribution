package typings.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxThumbPos extends FancyBoxGetFitPosResults {
  
  var scaleX: js.UndefOr[Double] = js.native
  
  var scaleY: js.UndefOr[Double] = js.native
}
object FancyBoxThumbPos {
  
  @scala.inline
  def apply(): FancyBoxThumbPos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyBoxThumbPos]
  }
  
  @scala.inline
  implicit class FancyBoxThumbPosMutableBuilder[Self <: FancyBoxThumbPos] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    @scala.inline
    def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
  }
}
