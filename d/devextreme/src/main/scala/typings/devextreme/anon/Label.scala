package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Label extends StObject {
  
  var label: js.UndefOr[CustomizeTextFormat] = js.native
  
  var separatorHeight: js.UndefOr[Double] = js.native
  
  var textLeftIndent: js.UndefOr[Double] = js.native
  
  var textTopIndent: js.UndefOr[Double] = js.native
  
  var topIndent: js.UndefOr[Double] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object Label {
  
  @scala.inline
  def apply(): Label = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: CustomizeTextFormat): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setSeparatorHeight(value: Double): Self = StObject.set(x, "separatorHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorHeightUndefined: Self = StObject.set(x, "separatorHeight", js.undefined)
    
    @scala.inline
    def setTextLeftIndent(value: Double): Self = StObject.set(x, "textLeftIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextLeftIndentUndefined: Self = StObject.set(x, "textLeftIndent", js.undefined)
    
    @scala.inline
    def setTextTopIndent(value: Double): Self = StObject.set(x, "textTopIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextTopIndentUndefined: Self = StObject.set(x, "textTopIndent", js.undefined)
    
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
