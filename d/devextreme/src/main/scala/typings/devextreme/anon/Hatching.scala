package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hatching extends StObject {
  
  var border: js.UndefOr[ColorDashStyle] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var hatching: js.UndefOr[Step] = js.native
}
object Hatching {
  
  @scala.inline
  def apply(): Hatching = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hatching]
  }
  
  @scala.inline
  implicit class HatchingMutableBuilder[Self <: Hatching] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: ColorDashStyle): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setHatching(value: Step): Self = StObject.set(x, "hatching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHatchingUndefined: Self = StObject.set(x, "hatching", js.undefined)
  }
}
