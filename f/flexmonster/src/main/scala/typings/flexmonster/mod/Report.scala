package typings.flexmonster.mod

import typings.flexmonster.anon.Columns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Report extends js.Object {
  
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
  implicit class ReportOps[Self <: Report] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConditionsVarargs(value: ConditionalFormat*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[ConditionalFormat]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    
    @scala.inline
    def setCreationDate(value: String): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    
    @scala.inline
    def setDataSource(value: DataSource): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setFormatsVarargs(value: Format*): Self = this.set("formats", js.Array(value :_*))
    
    @scala.inline
    def setFormats(value: js.Array[Format]): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    
    @scala.inline
    def setLocalization(value: js.Object | String): Self = this.set("localization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalization: Self = this.set("localization", js.undefined)
    
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setSlice(value: Slice): Self = this.set("slice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlice: Self = this.set("slice", js.undefined)
    
    @scala.inline
    def setTableSizes(value: Columns): Self = this.set("tableSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableSizes: Self = this.set("tableSizes", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
