package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartValueAxisStripsLabel
  extends StObject
     with dxChartCommonAxisSettingsStripStyleLabel {
  
  /**
    * Specifies the text of the strip label.
    */
  var text: js.UndefOr[String] = js.undefined
}
object dxChartValueAxisStripsLabel {
  
  inline def apply(): dxChartValueAxisStripsLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartValueAxisStripsLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxChartValueAxisStripsLabel] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
