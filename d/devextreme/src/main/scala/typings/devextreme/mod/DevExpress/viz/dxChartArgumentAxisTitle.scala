package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartArgumentAxisTitle
  extends StObject
     with dxChartCommonAxisSettingsTitle {
  
  /**
    * Specifies the text of the axis title.
    */
  var text: js.UndefOr[String] = js.undefined
}
object dxChartArgumentAxisTitle {
  
  inline def apply(): dxChartArgumentAxisTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartArgumentAxisTitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxChartArgumentAxisTitle] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
