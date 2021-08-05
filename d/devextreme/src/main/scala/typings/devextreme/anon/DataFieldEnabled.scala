package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataFieldEnabled extends StObject {
  
  var dataField: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.undefined
}
object DataFieldEnabled {
  
  inline def apply(): DataFieldEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFieldEnabled]
  }
  
  extension [Self <: DataFieldEnabled](x: Self) {
    
    inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFont(value: typings.devextreme.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
