package typings.exceljs.anon

import typings.exceljs.mod.WorksheetState
import typings.exceljs.mod.WorksheetView
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.AddWorksheetOptions> */
trait PartialAddWorksheetOption extends StObject {
  
  var headerFooter: js.UndefOr[PartialHeaderFooter] = js.undefined
  
  var pageSetup: js.UndefOr[PartialPageSetup] = js.undefined
  
  var properties: js.UndefOr[PartialWorksheetPropertie] = js.undefined
  
  var state: js.UndefOr[WorksheetState] = js.undefined
  
  var views: js.UndefOr[js.Array[Partial[WorksheetView]]] = js.undefined
}
object PartialAddWorksheetOption {
  
  inline def apply(): PartialAddWorksheetOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAddWorksheetOption]
  }
  
  extension [Self <: PartialAddWorksheetOption](x: Self) {
    
    inline def setHeaderFooter(value: PartialHeaderFooter): Self = StObject.set(x, "headerFooter", value.asInstanceOf[js.Any])
    
    inline def setHeaderFooterUndefined: Self = StObject.set(x, "headerFooter", js.undefined)
    
    inline def setPageSetup(value: PartialPageSetup): Self = StObject.set(x, "pageSetup", value.asInstanceOf[js.Any])
    
    inline def setPageSetupUndefined: Self = StObject.set(x, "pageSetup", js.undefined)
    
    inline def setProperties(value: PartialWorksheetPropertie): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setState(value: WorksheetState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setViews(value: js.Array[Partial[WorksheetView]]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    inline def setViewsVarargs(value: Partial[WorksheetView]*): Self = StObject.set(x, "views", js.Array(value :_*))
  }
}
