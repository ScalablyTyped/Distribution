package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconSrc extends StObject {
  
  var iconSrc: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[js.Any | String | js.Array[Double]] = js.undefined
  
  var onClick: js.UndefOr[js.Function] = js.undefined
  
  var tooltip: js.UndefOr[String | IsShown] = js.undefined
}
object IconSrc {
  
  @scala.inline
  def apply(): IconSrc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconSrc]
  }
  
  @scala.inline
  implicit class IconSrcMutableBuilder[Self <: IconSrc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconSrc(value: String): Self = StObject.set(x, "iconSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSrcUndefined: Self = StObject.set(x, "iconSrc", js.undefined)
    
    @scala.inline
    def setLocation(value: js.Any | String | js.Array[Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value :_*))
    
    @scala.inline
    def setOnClick(value: js.Function): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setTooltip(value: String | IsShown): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
