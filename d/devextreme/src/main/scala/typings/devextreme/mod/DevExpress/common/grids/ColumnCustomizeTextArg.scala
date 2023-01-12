package typings.devextreme.mod.DevExpress.common.grids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnCustomizeTextArg extends StObject {
  
  var groupInterval: js.UndefOr[String | Double] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String | Double | js.Date] = js.undefined
  
  var valueText: js.UndefOr[String] = js.undefined
}
object ColumnCustomizeTextArg {
  
  inline def apply(): ColumnCustomizeTextArg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnCustomizeTextArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnCustomizeTextArg] (val x: Self) extends AnyVal {
    
    inline def setGroupInterval(value: String | Double): Self = StObject.set(x, "groupInterval", value.asInstanceOf[js.Any])
    
    inline def setGroupIntervalUndefined: Self = StObject.set(x, "groupInterval", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setValue(value: String | Double | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
    
    inline def setValueTextUndefined: Self = StObject.set(x, "valueText", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
