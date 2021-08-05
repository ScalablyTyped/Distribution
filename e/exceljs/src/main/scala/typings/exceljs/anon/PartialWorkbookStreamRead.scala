package typings.exceljs.anon

import typings.exceljs.exceljsStrings.cache
import typings.exceljs.exceljsStrings.emit
import typings.exceljs.exceljsStrings.ignore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.stream.xlsx.WorkbookStreamReaderOptions> */
trait PartialWorkbookStreamRead extends StObject {
  
  var entries: js.UndefOr[emit | ignore] = js.undefined
  
  var hyperlinks: js.UndefOr[cache | emit | ignore] = js.undefined
  
  var sharedStrings: js.UndefOr[cache | emit | ignore] = js.undefined
  
  var styles: js.UndefOr[cache | ignore] = js.undefined
  
  var worksheets: js.UndefOr[emit | ignore] = js.undefined
}
object PartialWorkbookStreamRead {
  
  inline def apply(): PartialWorkbookStreamRead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWorkbookStreamRead]
  }
  
  extension [Self <: PartialWorkbookStreamRead](x: Self) {
    
    inline def setEntries(value: emit | ignore): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setHyperlinks(value: cache | emit | ignore): Self = StObject.set(x, "hyperlinks", value.asInstanceOf[js.Any])
    
    inline def setHyperlinksUndefined: Self = StObject.set(x, "hyperlinks", js.undefined)
    
    inline def setSharedStrings(value: cache | emit | ignore): Self = StObject.set(x, "sharedStrings", value.asInstanceOf[js.Any])
    
    inline def setSharedStringsUndefined: Self = StObject.set(x, "sharedStrings", js.undefined)
    
    inline def setStyles(value: cache | ignore): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setWorksheets(value: emit | ignore): Self = StObject.set(x, "worksheets", value.asInstanceOf[js.Any])
    
    inline def setWorksheetsUndefined: Self = StObject.set(x, "worksheets", js.undefined)
  }
}
