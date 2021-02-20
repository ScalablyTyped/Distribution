package typings.flexmonster.mod

import typings.flexmonster.anon.Columns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Report extends StObject {
  
  var conditions: js.UndefOr[js.Array[ConditionalFormat]] = js.native
  
  var creationDate: js.UndefOr[String] = js.native
  
  var dataSource: js.UndefOr[DataSource] = js.native
  
  var formats: js.UndefOr[js.Array[Format]] = js.native
  
  var localization: js.UndefOr[js.Object | String] = js.native
  
  var options: js.UndefOr[Options] = js.native
  
  var slice: js.UndefOr[Slice] = js.native
  
  var tableSizes: js.UndefOr[Columns] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object Report {
  
  @scala.inline
  def apply(): Report = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Report]
  }
  
  @scala.inline
  implicit class ReportMutableBuilder[Self <: Report] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditions(value: js.Array[ConditionalFormat]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: ConditionalFormat*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setFormats(value: js.Array[Format]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    @scala.inline
    def setFormatsVarargs(value: Format*): Self = StObject.set(x, "formats", js.Array(value :_*))
    
    @scala.inline
    def setLocalization(value: js.Object | String): Self = StObject.set(x, "localization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizationUndefined: Self = StObject.set(x, "localization", js.undefined)
    
    @scala.inline
    def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setSlice(value: Slice): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
    
    @scala.inline
    def setTableSizes(value: Columns): Self = StObject.set(x, "tableSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableSizesUndefined: Self = StObject.set(x, "tableSizes", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
