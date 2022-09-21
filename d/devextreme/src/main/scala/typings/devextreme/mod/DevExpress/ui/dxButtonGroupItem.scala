package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StringDictionary
import typings.devextreme.mod.DevExpress.common.ButtonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxButtonGroupItem
  extends StObject
     with CollectionWidgetItem {
  
  /**
    * Specifies the global attributes to be attached to the button group item&apos;s container element.
    */
  var elementAttr: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * Specifies a text for the hint that appears when the button is hovered over or long-pressed.
    */
  var hint: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the icon to be displayed on the button.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the button type.
    */
  var `type`: js.UndefOr[ButtonType] = js.undefined
}
object dxButtonGroupItem {
  
  inline def apply(): dxButtonGroupItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxButtonGroupItem]
  }
  
  extension [Self <: dxButtonGroupItem](x: Self) {
    
    inline def setElementAttr(value: StringDictionary[Any]): Self = StObject.set(x, "elementAttr", value.asInstanceOf[js.Any])
    
    inline def setElementAttrUndefined: Self = StObject.set(x, "elementAttr", js.undefined)
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setType(value: ButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
