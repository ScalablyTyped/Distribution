package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartPanes
  extends StObject
     with dxChartCommonPaneSettings {
  
  /**
    * Specifies the pane&apos;s height (or width when the chart is rotated) in a multi-pane chart.
    */
  var height: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Specifies the name of the pane.
    */
  var name: js.UndefOr[String] = js.undefined
}
object dxChartPanes {
  
  inline def apply(): dxChartPanes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartPanes]
  }
  
  extension [Self <: dxChartPanes](x: Self) {
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
