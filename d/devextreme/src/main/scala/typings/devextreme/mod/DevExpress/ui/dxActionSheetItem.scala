package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.common.ButtonStyle
import typings.devextreme.mod.DevExpress.common.ButtonType
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.std.MouseEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxActionSheetItem[TKey]
  extends StObject
     with CollectionWidgetItem {
  
  /**
    * Specifies the icon to be displayed on the action sheet button.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * A handler for the click event raised for the button representing the given action sheet button.
    */
  var onClick: js.UndefOr[
    (js.Function1[
      /* e */ NativeEventInfo[dxActionSheet[this.type, TKey], MouseEvent | PointerEvent], 
      Unit
    ]) | String
  ] = js.undefined
  
  /**
    * Specifies which style to apply to the button that is an action sheet item.
    */
  var stylingMode: js.UndefOr[ButtonStyle] = js.undefined
  
  /**
    * Specifies the type of the button that is an action sheet item.
    */
  var `type`: js.UndefOr[ButtonType] = js.undefined
}
object dxActionSheetItem {
  
  inline def apply[TKey](): dxActionSheetItem[TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxActionSheetItem[TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxActionSheetItem[?], TKey] (val x: Self & dxActionSheetItem[TKey]) extends AnyVal {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setOnClick(
      value: (js.Function1[
          /* e */ NativeEventInfo[dxActionSheet[dxActionSheetItem[TKey], TKey], MouseEvent | PointerEvent], 
          Unit
        ]) | String
    ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickFunction1(
      value: /* e */ NativeEventInfo[dxActionSheet[dxActionSheetItem[TKey], TKey], MouseEvent | PointerEvent] => Unit
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setStylingMode(value: ButtonStyle): Self = StObject.set(x, "stylingMode", value.asInstanceOf[js.Any])
    
    inline def setStylingModeUndefined: Self = StObject.set(x, "stylingMode", js.undefined)
    
    inline def setType(value: ButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
