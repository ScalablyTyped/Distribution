package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartArgumentAxisStripsLabel
  extends StObject
     with dxChartCommonAxisSettingsStripStyleLabel {
  
  /**
    * Specifies the text of the strip label.
    */
  var text: js.UndefOr[String] = js.undefined
}
object dxChartArgumentAxisStripsLabel {
  
  inline def apply(): dxChartArgumentAxisStripsLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartArgumentAxisStripsLabel]
  }
  
  extension [Self <: dxChartArgumentAxisStripsLabel](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
