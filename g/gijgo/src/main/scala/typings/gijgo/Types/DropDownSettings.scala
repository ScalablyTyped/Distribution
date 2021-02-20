package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropDownSettings extends StObject {
  
  //Events
  var change: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var dataBound: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  
  var dataSource: js.UndefOr[js.Any] = js.native
  
  var icons: js.UndefOr[DropDownIcons] = js.native
  
  var iconsLibrary: js.UndefOr[String] = js.native
  
  var maxHeight: js.UndefOr[js.Any] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var selectedField: js.UndefOr[String] = js.native
  
  var textField: js.UndefOr[String] = js.native
  
  var uiLibrary: js.UndefOr[String] = js.native
  
  var valueField: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object DropDownSettings {
  
  @scala.inline
  def apply(): DropDownSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownSettings]
  }
  
  @scala.inline
  implicit class DropDownSettingsMutableBuilder[Self <: DropDownSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: /* e */ js.Any => _): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setDataBound(value: /* e */ js.Any => _): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setIcons(value: DropDownIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsLibrary(value: String): Self = StObject.set(x, "iconsLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsLibraryUndefined: Self = StObject.set(x, "iconsLibrary", js.undefined)
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: js.Any): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setSelectedField(value: String): Self = StObject.set(x, "selectedField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedFieldUndefined: Self = StObject.set(x, "selectedField", js.undefined)
    
    @scala.inline
    def setTextField(value: String): Self = StObject.set(x, "textField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextFieldUndefined: Self = StObject.set(x, "textField", js.undefined)
    
    @scala.inline
    def setUiLibrary(value: String): Self = StObject.set(x, "uiLibrary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiLibraryUndefined: Self = StObject.set(x, "uiLibrary", js.undefined)
    
    @scala.inline
    def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
