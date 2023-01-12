package typings.exceljs.mod

import typings.exceljs.anon.PartialHeaderFooter
import typings.exceljs.anon.PartialPageSetup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorksheetModel extends StObject {
  
  var autoFilter: AutoFilter
  
  var headerFooter: PartialHeaderFooter
  
  var id: Double
  
  var media: js.Array[Media]
  
  var name: String
  
  var pageSetup: PartialPageSetup
  
  // dataValidations: this.dataValidations.model,
  var properties: WorksheetProperties
  
  var rowBreaks: js.Array[RowBreak]
  
  var views: js.Array[WorksheetView]
}
object WorksheetModel {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: WorksheetModel] (val x: Self) extends AnyVal {
    
    inline def setAutoFilter(value: AutoFilter): Self = StObject.set(x, "autoFilter", value.asInstanceOf[js.Any])
    
    inline def setHeaderFooter(value: PartialHeaderFooter): Self = StObject.set(x, "headerFooter", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: js.Array[Media]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaVarargs(value: Media*): Self = StObject.set(x, "media", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPageSetup(value: PartialPageSetup): Self = StObject.set(x, "pageSetup", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: WorksheetProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setRowBreaks(value: js.Array[RowBreak]): Self = StObject.set(x, "rowBreaks", value.asInstanceOf[js.Any])
    
    inline def setRowBreaksVarargs(value: RowBreak*): Self = StObject.set(x, "rowBreaks", js.Array(value*))
    
    inline def setViews(value: js.Array[WorksheetView]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsVarargs(value: WorksheetView*): Self = StObject.set(x, "views", js.Array(value*))
  }
}
