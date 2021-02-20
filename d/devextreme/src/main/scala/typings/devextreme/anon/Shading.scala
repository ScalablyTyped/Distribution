package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shading extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var indicatorSrc: js.UndefOr[String] = js.native
  
  var shading: js.UndefOr[Boolean] = js.native
  
  var shadingColor: js.UndefOr[String] = js.native
  
  var showIndicator: js.UndefOr[Boolean] = js.native
  
  var showPane: js.UndefOr[Boolean] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object Shading {
  
  @scala.inline
  def apply(): Shading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shading]
  }
  
  @scala.inline
  implicit class ShadingMutableBuilder[Self <: Shading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIndicatorSrc(value: String): Self = StObject.set(x, "indicatorSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorSrcUndefined: Self = StObject.set(x, "indicatorSrc", js.undefined)
    
    @scala.inline
    def setShading(value: Boolean): Self = StObject.set(x, "shading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadingColor(value: String): Self = StObject.set(x, "shadingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadingColorUndefined: Self = StObject.set(x, "shadingColor", js.undefined)
    
    @scala.inline
    def setShadingUndefined: Self = StObject.set(x, "shading", js.undefined)
    
    @scala.inline
    def setShowIndicator(value: Boolean): Self = StObject.set(x, "showIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowIndicatorUndefined: Self = StObject.set(x, "showIndicator", js.undefined)
    
    @scala.inline
    def setShowPane(value: Boolean): Self = StObject.set(x, "showPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPaneUndefined: Self = StObject.set(x, "showPane", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
