package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartTooltip extends StObject {
  
  var ignoreBounds: js.UndefOr[Boolean] = js.native
  
  var isHtml: js.UndefOr[Boolean] = js.native
  
  var showColorCode: js.UndefOr[Boolean] = js.native
  
  var textStyle: js.UndefOr[ChartTextStyle] = js.native
  
  var trigger: js.UndefOr[String] = js.native
}
object ChartTooltip {
  
  @scala.inline
  def apply(): ChartTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTooltip]
  }
  
  @scala.inline
  implicit class ChartTooltipMutableBuilder[Self <: ChartTooltip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreBounds(value: Boolean): Self = StObject.set(x, "ignoreBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreBoundsUndefined: Self = StObject.set(x, "ignoreBounds", js.undefined)
    
    @scala.inline
    def setIsHtml(value: Boolean): Self = StObject.set(x, "isHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHtmlUndefined: Self = StObject.set(x, "isHtml", js.undefined)
    
    @scala.inline
    def setShowColorCode(value: Boolean): Self = StObject.set(x, "showColorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowColorCodeUndefined: Self = StObject.set(x, "showColorCode", js.undefined)
    
    @scala.inline
    def setTextStyle(value: ChartTextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
