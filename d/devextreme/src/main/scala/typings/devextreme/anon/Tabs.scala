package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDiagram.DiagramPanelVisibility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tabs extends StObject {
  
  /**
    * Contains an array of tabs in the Properties panel.
    */
  var tabs: js.UndefOr[js.Array[Groups]] = js.undefined
  
  /**
    * Specifies the panel&apos;s visibility.
    */
  var visibility: js.UndefOr[DiagramPanelVisibility] = js.undefined
}
object Tabs {
  
  inline def apply(): Tabs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tabs]
  }
  
  extension [Self <: Tabs](x: Self) {
    
    inline def setTabs(value: js.Array[Groups]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
    
    inline def setTabsVarargs(value: Groups*): Self = StObject.set(x, "tabs", js.Array(value*))
    
    inline def setVisibility(value: DiagramPanelVisibility): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
