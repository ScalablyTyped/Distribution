package typings.exceljs.mod

import typings.exceljs.anon.PartialHeaderFooter
import typings.exceljs.anon.PartialPageSetup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorksheetModel extends js.Object {
  
  var autoFilter: AutoFilter = js.native
  
  var headerFooter: PartialHeaderFooter = js.native
  
  var id: Double = js.native
  
  var media: js.Array[Media] = js.native
  
  var name: String = js.native
  
  var pageSetup: PartialPageSetup = js.native
  
  // dataValidations: this.dataValidations.model,
  var properties: WorksheetProperties = js.native
  
  var rowBreaks: js.Array[RowBreak] = js.native
  
  var views: js.Array[WorksheetView] = js.native
}
object WorksheetModel {
  
  @scala.inline
  def apply(
    autoFilter: AutoFilter,
    headerFooter: PartialHeaderFooter,
    id: Double,
    media: js.Array[Media],
    name: String,
    pageSetup: PartialPageSetup,
    properties: WorksheetProperties,
    rowBreaks: js.Array[RowBreak],
    views: js.Array[WorksheetView]
  ): WorksheetModel = {
    val __obj = js.Dynamic.literal(autoFilter = autoFilter.asInstanceOf[js.Any], headerFooter = headerFooter.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pageSetup = pageSetup.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rowBreaks = rowBreaks.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetModel]
  }
  
  @scala.inline
  implicit class WorksheetModelOps[Self <: WorksheetModel] (val x: Self) extends AnyVal {
    
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
    def setAutoFilter(value: AutoFilter): Self = this.set("autoFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderFooter(value: PartialHeaderFooter): Self = this.set("headerFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaVarargs(value: Media*): Self = this.set("media", js.Array(value :_*))
    
    @scala.inline
    def setMedia(value: js.Array[Media]): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSetup(value: PartialPageSetup): Self = this.set("pageSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: WorksheetProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowBreaksVarargs(value: RowBreak*): Self = this.set("rowBreaks", js.Array(value :_*))
    
    @scala.inline
    def setRowBreaks(value: js.Array[RowBreak]): Self = this.set("rowBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsVarargs(value: WorksheetView*): Self = this.set("views", js.Array(value :_*))
    
    @scala.inline
    def setViews(value: js.Array[WorksheetView]): Self = this.set("views", value.asInstanceOf[js.Any])
  }
}
