package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeparatorHeight extends StObject {
  
  /**
    * Defines the properties that can be set for the text that is displayed by the scale markers.
    */
  var label: js.UndefOr[CustomizeTextFormat] = js.undefined
  
  /**
    * Specifies the height of the marker&apos;s separator.
    */
  var separatorHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the space between the marker label and the marker separator.
    */
  var textLeftIndent: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the space between the marker&apos;s label and the top edge of the marker&apos;s separator.
    */
  var textTopIndent: js.UndefOr[Double] = js.undefined
  
  /**
    * Specified the indent between the marker and the scale labels.
    */
  var topIndent: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether scale markers are visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object SeparatorHeight {
  
  inline def apply(): SeparatorHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeparatorHeight]
  }
  
  extension [Self <: SeparatorHeight](x: Self) {
    
    inline def setLabel(value: CustomizeTextFormat): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSeparatorHeight(value: Double): Self = StObject.set(x, "separatorHeight", value.asInstanceOf[js.Any])
    
    inline def setSeparatorHeightUndefined: Self = StObject.set(x, "separatorHeight", js.undefined)
    
    inline def setTextLeftIndent(value: Double): Self = StObject.set(x, "textLeftIndent", value.asInstanceOf[js.Any])
    
    inline def setTextLeftIndentUndefined: Self = StObject.set(x, "textLeftIndent", js.undefined)
    
    inline def setTextTopIndent(value: Double): Self = StObject.set(x, "textTopIndent", value.asInstanceOf[js.Any])
    
    inline def setTextTopIndentUndefined: Self = StObject.set(x, "textTopIndent", js.undefined)
    
    inline def setTopIndent(value: Double): Self = StObject.set(x, "topIndent", value.asInstanceOf[js.Any])
    
    inline def setTopIndentUndefined: Self = StObject.set(x, "topIndent", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
