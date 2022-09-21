package typings.gijgo.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropDownSettings extends StObject {
  
  //Events
  var change: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ Any, Any]] = js.undefined
  
  var dataSource: js.UndefOr[Any] = js.undefined
  
  var icons: js.UndefOr[DropDownIcons] = js.undefined
  
  var iconsLibrary: js.UndefOr[String] = js.undefined
  
  var maxHeight: js.UndefOr[Any] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var selectedField: js.UndefOr[String] = js.undefined
  
  var textField: js.UndefOr[String] = js.undefined
  
  var uiLibrary: js.UndefOr[String] = js.undefined
  
  var valueField: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object DropDownSettings {
  
  inline def apply(): DropDownSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownSettings]
  }
  
  extension [Self <: DropDownSettings](x: Self) {
    
    inline def setChange(value: /* e */ Any => Any): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setDataBound(value: /* e */ Any => Any): Self = StObject.set(x, "dataBound", js.Any.fromFunction1(value))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setIcons(value: DropDownIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsLibrary(value: String): Self = StObject.set(x, "iconsLibrary", value.asInstanceOf[js.Any])
    
    inline def setIconsLibraryUndefined: Self = StObject.set(x, "iconsLibrary", js.undefined)
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setMaxHeight(value: Any): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSelectedField(value: String): Self = StObject.set(x, "selectedField", value.asInstanceOf[js.Any])
    
    inline def setSelectedFieldUndefined: Self = StObject.set(x, "selectedField", js.undefined)
    
    inline def setTextField(value: String): Self = StObject.set(x, "textField", value.asInstanceOf[js.Any])
    
    inline def setTextFieldUndefined: Self = StObject.set(x, "textField", js.undefined)
    
    inline def setUiLibrary(value: String): Self = StObject.set(x, "uiLibrary", value.asInstanceOf[js.Any])
    
    inline def setUiLibraryUndefined: Self = StObject.set(x, "uiLibrary", js.undefined)
    
    inline def setValueField(value: String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
    
    inline def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
