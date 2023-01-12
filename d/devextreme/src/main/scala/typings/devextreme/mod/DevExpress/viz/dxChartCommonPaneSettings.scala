package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.BottomColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartCommonPaneSettings extends StObject {
  
  /**
    * Specifies the color of the pane&apos;s background.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Configures the pane border.
    */
  var border: js.UndefOr[BottomColor] = js.undefined
}
object dxChartCommonPaneSettings {
  
  inline def apply(): dxChartCommonPaneSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonPaneSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxChartCommonPaneSettings] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorder(value: BottomColor): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
  }
}
