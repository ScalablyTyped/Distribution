package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseSize extends StObject {
  
  var baseSize: js.UndefOr[Double | auto] = js.native
  
  var ratio: js.UndefOr[Double] = js.native
  
  var screen: js.UndefOr[String] = js.native
  
  var shrink: js.UndefOr[Double] = js.native
}
object BaseSize {
  
  @scala.inline
  def apply(): BaseSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSize]
  }
  
  @scala.inline
  implicit class BaseSizeMutableBuilder[Self <: BaseSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseSize(value: Double | auto): Self = StObject.set(x, "baseSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseSizeUndefined: Self = StObject.set(x, "baseSize", js.undefined)
    
    @scala.inline
    def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    @scala.inline
    def setScreen(value: String): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenUndefined: Self = StObject.set(x, "screen", js.undefined)
    
    @scala.inline
    def setShrink(value: Double): Self = StObject.set(x, "shrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkUndefined: Self = StObject.set(x, "shrink", js.undefined)
  }
}
