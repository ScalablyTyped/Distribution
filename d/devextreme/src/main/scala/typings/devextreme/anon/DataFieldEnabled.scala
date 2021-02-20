package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataFieldEnabled extends StObject {
  
  var dataField: js.UndefOr[String] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.native
}
object DataFieldEnabled {
  
  @scala.inline
  def apply(): DataFieldEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataFieldEnabled]
  }
  
  @scala.inline
  implicit class DataFieldEnabledMutableBuilder[Self <: DataFieldEnabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFont(value: typings.devextreme.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
