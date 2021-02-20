package typings.devextreme.anon

import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HorizontalAlignment extends StObject {
  
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.native
  
  var horizontalAlignment: js.UndefOr[center | left | right] = js.native
  
  var margin: js.UndefOr[Bottom] = js.native
  
  var placeholderSize: js.UndefOr[Double] = js.native
  
  var subtitle: js.UndefOr[Font | String] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var verticalAlignment: js.UndefOr[bottom | top] = js.native
}
object HorizontalAlignment {
  
  @scala.inline
  def apply(): HorizontalAlignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalAlignment]
  }
  
  @scala.inline
  implicit class HorizontalAlignmentMutableBuilder[Self <: HorizontalAlignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: typings.devextreme.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: center | left | right): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    @scala.inline
    def setMargin(value: Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setPlaceholderSize(value: Double): Self = StObject.set(x, "placeholderSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderSizeUndefined: Self = StObject.set(x, "placeholderSize", js.undefined)
    
    @scala.inline
    def setSubtitle(value: Font | String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: bottom | top): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
  }
}
