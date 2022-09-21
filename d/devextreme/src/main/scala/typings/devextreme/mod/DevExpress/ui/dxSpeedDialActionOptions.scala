package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.ui.dxSpeedDialAction.ClickEvent
import typings.devextreme.mod.DevExpress.ui.dxSpeedDialAction.ContentReadyEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSpeedDialActionOptions
  extends StObject
     with WidgetOptions[dxSpeedDialAction] {
  
  /**
    * Specifies the icon the FAB or speed dial action button displays.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * Allows you to reorder action buttons in the speed dial menu.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the text label displayed inside the FAB or near the speed dial action button.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * A function that is executed when the FAB or speed dial action button is clicked or tapped.
    */
  var onClick: js.UndefOr[js.Function1[/* e */ ClickEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when the UI component&apos;s content is ready and each time the content is changed.
    */
  @JSName("onContentReady")
  var onContentReady_dxSpeedDialActionOptions: js.UndefOr[js.Function1[/* e */ ContentReadyEvent, Unit]] = js.undefined
}
object dxSpeedDialActionOptions {
  
  inline def apply(): dxSpeedDialActionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSpeedDialActionOptions]
  }
  
  extension [Self <: dxSpeedDialActionOptions](x: Self) {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOnClick(value: /* e */ ClickEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnContentReady(value: /* e */ ContentReadyEvent => Unit): Self = StObject.set(x, "onContentReady", js.Any.fromFunction1(value))
    
    inline def setOnContentReadyUndefined: Self = StObject.set(x, "onContentReady", js.undefined)
  }
}
