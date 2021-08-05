package typings.flexmonster.mod

import typings.flexmonster.anon.Columns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Report extends StObject {
  
  var conditions: js.UndefOr[js.Array[ConditionalFormat]] = js.undefined
  
  var creationDate: js.UndefOr[String] = js.undefined
  
  var dataSource: js.UndefOr[DataSource] = js.undefined
  
  var formats: js.UndefOr[js.Array[Format]] = js.undefined
  
  var localization: js.UndefOr[js.Object | String] = js.undefined
  
  var options: js.UndefOr[Options] = js.undefined
  
  var slice: js.UndefOr[Slice] = js.undefined
  
  var tableSizes: js.UndefOr[Columns] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object Report {
  
  inline def apply(): Report = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Report]
  }
  
  extension [Self <: Report](x: Self) {
    
    inline def setConditions(value: js.Array[ConditionalFormat]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: ConditionalFormat*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setFormats(value: js.Array[Format]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    inline def setFormatsVarargs(value: Format*): Self = StObject.set(x, "formats", js.Array(value :_*))
    
    inline def setLocalization(value: js.Object | String): Self = StObject.set(x, "localization", value.asInstanceOf[js.Any])
    
    inline def setLocalizationUndefined: Self = StObject.set(x, "localization", js.undefined)
    
    inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSlice(value: Slice): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
    
    inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
    
    inline def setTableSizes(value: Columns): Self = StObject.set(x, "tableSizes", value.asInstanceOf[js.Any])
    
    inline def setTableSizesUndefined: Self = StObject.set(x, "tableSizes", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
