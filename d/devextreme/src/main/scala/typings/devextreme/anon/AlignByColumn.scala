package typings.devextreme.anon

import typings.devextreme.devextremeStrings.avg
import typings.devextreme.devextremeStrings.count
import typings.devextreme.devextremeStrings.custom
import typings.devextreme.devextremeStrings.max
import typings.devextreme.devextremeStrings.min
import typings.devextreme.devextremeStrings.sum
import typings.devextreme.mod.DevExpress.ui.format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignByColumn extends StObject {
  
  var alignByColumn: js.UndefOr[Boolean] = js.undefined
  
  var column: js.UndefOr[String] = js.undefined
  
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ Value, String]] = js.undefined
  
  var displayFormat: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var showInColumn: js.UndefOr[String] = js.undefined
  
  var showInGroupFooter: js.UndefOr[Boolean] = js.undefined
  
  var skipEmptyValues: js.UndefOr[Boolean] = js.undefined
  
  var summaryType: js.UndefOr[avg | count | custom | max | min | sum | String] = js.undefined
  
  var valueFormat: js.UndefOr[format] = js.undefined
}
object AlignByColumn {
  
  inline def apply(): AlignByColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignByColumn]
  }
  
  extension [Self <: AlignByColumn](x: Self) {
    
    inline def setAlignByColumn(value: Boolean): Self = StObject.set(x, "alignByColumn", value.asInstanceOf[js.Any])
    
    inline def setAlignByColumnUndefined: Self = StObject.set(x, "alignByColumn", js.undefined)
    
    inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setCustomizeText(value: /* itemInfo */ Value => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setDisplayFormat(value: String): Self = StObject.set(x, "displayFormat", value.asInstanceOf[js.Any])
    
    inline def setDisplayFormatUndefined: Self = StObject.set(x, "displayFormat", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShowInColumn(value: String): Self = StObject.set(x, "showInColumn", value.asInstanceOf[js.Any])
    
    inline def setShowInColumnUndefined: Self = StObject.set(x, "showInColumn", js.undefined)
    
    inline def setShowInGroupFooter(value: Boolean): Self = StObject.set(x, "showInGroupFooter", value.asInstanceOf[js.Any])
    
    inline def setShowInGroupFooterUndefined: Self = StObject.set(x, "showInGroupFooter", js.undefined)
    
    inline def setSkipEmptyValues(value: Boolean): Self = StObject.set(x, "skipEmptyValues", value.asInstanceOf[js.Any])
    
    inline def setSkipEmptyValuesUndefined: Self = StObject.set(x, "skipEmptyValues", js.undefined)
    
    inline def setSummaryType(value: avg | count | custom | max | min | sum | String): Self = StObject.set(x, "summaryType", value.asInstanceOf[js.Any])
    
    inline def setSummaryTypeUndefined: Self = StObject.set(x, "summaryType", js.undefined)
    
    inline def setValueFormat(value: format): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    inline def setValueFormatFunction1(value: /* value */ Double | typings.std.Date => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
    
    inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
  }
}
