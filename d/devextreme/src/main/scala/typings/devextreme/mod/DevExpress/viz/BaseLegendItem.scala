package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseLegendItem extends StObject {
  
  /**
    * A legend item marker.
    */
  var marker: js.UndefOr[Fill] = js.undefined
  
  /**
    * The text that the legend item displays.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates and specifies whether the legend item is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object BaseLegendItem {
  
  inline def apply(): BaseLegendItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseLegendItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseLegendItem] (val x: Self) extends AnyVal {
    
    inline def setMarker(value: Fill): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
