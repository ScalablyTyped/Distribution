package typings.exceljs.mod

import typings.exceljs.anon.PartialHeaderFooter
import typings.exceljs.anon.PartialPageSetup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorksheetModel extends StObject {
  
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
  implicit class WorksheetModelMutableBuilder[Self <: WorksheetModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFilter(value: AutoFilter): Self = StObject.set(x, "autoFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderFooter(value: PartialHeaderFooter): Self = StObject.set(x, "headerFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: js.Array[Media]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaVarargs(value: Media*): Self = StObject.set(x, "media", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSetup(value: PartialPageSetup): Self = StObject.set(x, "pageSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: WorksheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowBreaks(value: js.Array[RowBreak]): Self = StObject.set(x, "rowBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowBreaksVarargs(value: RowBreak*): Self = StObject.set(x, "rowBreaks", js.Array(value :_*))
    
    @scala.inline
    def setViews(value: js.Array[WorksheetView]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsVarargs(value: WorksheetView*): Self = StObject.set(x, "views", js.Array(value :_*))
  }
}
