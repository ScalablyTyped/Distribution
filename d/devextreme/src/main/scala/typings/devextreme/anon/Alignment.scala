package typings.devextreme.anon

import typings.devextreme.devextremeStrings.avg
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.count
import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.max
import typings.devextreme.devextremeStrings.min
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.sum
import typings.devextreme.mod.DevExpress.ui.format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alignment extends StObject {
  
  var alignment: js.UndefOr[center | left | right] = js.undefined
  
  var column: js.UndefOr[String] = js.undefined
  
  var cssClass: js.UndefOr[String] = js.undefined
  
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ Value, String]] = js.undefined
  
  var displayFormat: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var showInColumn: js.UndefOr[String] = js.undefined
  
  var skipEmptyValues: js.UndefOr[Boolean] = js.undefined
  
  var summaryType: js.UndefOr[avg | count | custom | max | min | sum | String] = js.undefined
  
  var valueFormat: js.UndefOr[format] = js.undefined
}
object Alignment {
  
  inline def apply(): Alignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alignment]
  }
  
  extension [Self <: Alignment](x: Self) {
    
    inline def setAlignment(value: center | left | right): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setCustomizeText(value: /* itemInfo */ Value => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setDisplayFormat(value: String): Self = StObject.set(x, "displayFormat", value.asInstanceOf[js.Any])
    
    inline def setDisplayFormatUndefined: Self = StObject.set(x, "displayFormat", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShowInColumn(value: String): Self = StObject.set(x, "showInColumn", value.asInstanceOf[js.Any])
    
    inline def setShowInColumnUndefined: Self = StObject.set(x, "showInColumn", js.undefined)
    
    inline def setSkipEmptyValues(value: Boolean): Self = StObject.set(x, "skipEmptyValues", value.asInstanceOf[js.Any])
    
    inline def setSkipEmptyValuesUndefined: Self = StObject.set(x, "skipEmptyValues", js.undefined)
    
    inline def setSummaryType(value: avg | count | custom | max | min | sum | String): Self = StObject.set(x, "summaryType", value.asInstanceOf[js.Any])
    
    inline def setSummaryTypeUndefined: Self = StObject.set(x, "summaryType", js.undefined)
    
    inline def setValueFormat(value: format): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    inline def setValueFormatFunction1(value: /* value */ Double | typings.std.Date => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
    
    inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
  }
}
