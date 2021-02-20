package typings.devextreme.anon

import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.none
import typings.devextreme.mod.DevExpress.ui.format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverlappingBehavior extends StObject {
  
  var customizeText: js.UndefOr[js.Function1[/* scaleValue */ ValueValueText, String]] = js.native
  
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.native
  
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.native
  
  var overlappingBehavior: js.UndefOr[hide | none] = js.native
  
  var topIndent: js.UndefOr[Double] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object OverlappingBehavior {
  
  @scala.inline
  def apply(): OverlappingBehavior = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlappingBehavior]
  }
  
  @scala.inline
  implicit class OverlappingBehaviorMutableBuilder[Self <: OverlappingBehavior] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomizeText(value: /* scaleValue */ ValueValueText => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    @scala.inline
    def setFont(value: typings.devextreme.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFormat(value: format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatFunction1(value: /* value */ Double | typings.std.Date => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setOverlappingBehavior(value: hide | none): Self = StObject.set(x, "overlappingBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlappingBehaviorUndefined: Self = StObject.set(x, "overlappingBehavior", js.undefined)
    
    @scala.inline
    def setTopIndent(value: Double): Self = StObject.set(x, "topIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopIndentUndefined: Self = StObject.set(x, "topIndent", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
