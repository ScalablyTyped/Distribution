package typings.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPolarChartArgumentAxisStripsLabel
  extends StObject
     with dxPolarChartCommonAxisSettingsStripStyleLabel {
  
  /**
    * Specifies the text displayed in a strip.
    */
  var text: js.UndefOr[String] = js.undefined
}
object dxPolarChartArgumentAxisStripsLabel {
  
  inline def apply(): dxPolarChartArgumentAxisStripsLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPolarChartArgumentAxisStripsLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxPolarChartArgumentAxisStripsLabel] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
