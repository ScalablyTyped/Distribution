package typings.devextreme.anon

import typings.devextreme.devextremeStrings.ellipsis
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.none
import typings.devextreme.mod.DevExpress.viz.dxSankeyNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HorizontalOffset extends StObject {
  
  var border: js.UndefOr[ColorVisible] = js.undefined
  
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ dxSankeyNode, String]] = js.undefined
  
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.undefined
  
  var horizontalOffset: js.UndefOr[Double] = js.undefined
  
  var overlappingBehavior: js.UndefOr[ellipsis | hide | none] = js.undefined
  
  var shadow: js.UndefOr[Blur] = js.undefined
  
  var useNodeColors: js.UndefOr[Boolean] = js.undefined
  
  var verticalOffset: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object HorizontalOffset {
  
  @scala.inline
  def apply(): HorizontalOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalOffset]
  }
  
  @scala.inline
  implicit class HorizontalOffsetMutableBuilder[Self <: HorizontalOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: ColorVisible): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setCustomizeText(value: /* itemInfo */ dxSankeyNode => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    @scala.inline
    def setFont(value: typings.devextreme.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setHorizontalOffset(value: Double): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
    
    @scala.inline
    def setOverlappingBehavior(value: ellipsis | hide | none): Self = StObject.set(x, "overlappingBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlappingBehaviorUndefined: Self = StObject.set(x, "overlappingBehavior", js.undefined)
    
    @scala.inline
    def setShadow(value: Blur): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setUseNodeColors(value: Boolean): Self = StObject.set(x, "useNodeColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNodeColorsUndefined: Self = StObject.set(x, "useNodeColors", js.undefined)
    
    @scala.inline
    def setVerticalOffset(value: Double): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
