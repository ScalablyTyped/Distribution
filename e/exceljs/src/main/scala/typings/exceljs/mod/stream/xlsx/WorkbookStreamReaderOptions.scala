package typings.exceljs.mod.stream.xlsx

import typings.exceljs.exceljsStrings.cache
import typings.exceljs.exceljsStrings.emit
import typings.exceljs.exceljsStrings.ignore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookStreamReaderOptions extends js.Object {
  
  /**
  			 * @default 'ignore'
  			 */
  var entries: js.UndefOr[emit | ignore] = js.native
  
  /**
  			 * @default 'ignore'
  			 */
  var hyperlinks: js.UndefOr[cache | emit | ignore] = js.native
  
  /**
  			 * @default 'cache'
  			 */
  var sharedStrings: js.UndefOr[cache | emit | ignore] = js.native
  
  /**
  			 * @default 'ignore'
  			 */
  var styles: js.UndefOr[cache | ignore] = js.native
  
  /**
  			 * @default 'emit'
  			 */
  var worksheets: js.UndefOr[emit | ignore] = js.native
}
object WorkbookStreamReaderOptions {
  
  @scala.inline
  def apply(): WorkbookStreamReaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookStreamReaderOptions]
  }
  
  @scala.inline
  implicit class WorkbookStreamReaderOptionsOps[Self <: WorkbookStreamReaderOptions] (val x: Self) extends AnyVal {
    
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
    def setEntries(value: emit | ignore): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    
    @scala.inline
    def setHyperlinks(value: cache | emit | ignore): Self = this.set("hyperlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyperlinks: Self = this.set("hyperlinks", js.undefined)
    
    @scala.inline
    def setSharedStrings(value: cache | emit | ignore): Self = this.set("sharedStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedStrings: Self = this.set("sharedStrings", js.undefined)
    
    @scala.inline
    def setStyles(value: cache | ignore): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setWorksheets(value: emit | ignore): Self = this.set("worksheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorksheets: Self = this.set("worksheets", js.undefined)
  }
}
