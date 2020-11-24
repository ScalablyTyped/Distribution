package typings.exceljs.mod

import typings.exceljs.exceljsStrings.normal
import typings.exceljs.exceljsStrings.pageBreakPreview
import typings.exceljs.exceljsStrings.pageLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorksheetViewNormal extends js.Object {
  
  /**
  	 * Controls the view state
  	 */
  var state: normal = js.native
  
  /**
  	 * Presentation style
  	 */
  var style: pageBreakPreview | pageLayout = js.native
}
object WorksheetViewNormal {
  
  @scala.inline
  def apply(state: normal, style: pageBreakPreview | pageLayout): WorksheetViewNormal = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetViewNormal]
  }
  
  @scala.inline
  implicit class WorksheetViewNormalOps[Self <: WorksheetViewNormal] (val x: Self) extends AnyVal {
    
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
    def setState(value: normal): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: pageBreakPreview | pageLayout): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
