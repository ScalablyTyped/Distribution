package typings.exceljs.anon

import typings.exceljs.exceljsStrings.cache
import typings.exceljs.exceljsStrings.emit
import typings.exceljs.exceljsStrings.ignore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.stream.xlsx.WorkbookStreamReaderOptions> */
@js.native
trait PartialWorkbookStreamRead extends StObject {
  
  var entries: js.UndefOr[emit | ignore] = js.native
  
  var hyperlinks: js.UndefOr[cache | emit | ignore] = js.native
  
  var sharedStrings: js.UndefOr[cache | emit | ignore] = js.native
  
  var styles: js.UndefOr[cache | ignore] = js.native
  
  var worksheets: js.UndefOr[emit | ignore] = js.native
}
object PartialWorkbookStreamRead {
  
  @scala.inline
  def apply(): PartialWorkbookStreamRead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWorkbookStreamRead]
  }
  
  @scala.inline
  implicit class PartialWorkbookStreamReadMutableBuilder[Self <: PartialWorkbookStreamRead] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: emit | ignore): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setHyperlinks(value: cache | emit | ignore): Self = StObject.set(x, "hyperlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlinksUndefined: Self = StObject.set(x, "hyperlinks", js.undefined)
    
    @scala.inline
    def setSharedStrings(value: cache | emit | ignore): Self = StObject.set(x, "sharedStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedStringsUndefined: Self = StObject.set(x, "sharedStrings", js.undefined)
    
    @scala.inline
    def setStyles(value: cache | ignore): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setWorksheets(value: emit | ignore): Self = StObject.set(x, "worksheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetsUndefined: Self = StObject.set(x, "worksheets", js.undefined)
  }
}
