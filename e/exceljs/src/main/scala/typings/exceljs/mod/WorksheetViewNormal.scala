package typings.exceljs.mod

import typings.exceljs.exceljsStrings.normal
import typings.exceljs.exceljsStrings.pageBreakPreview
import typings.exceljs.exceljsStrings.pageLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorksheetViewNormal extends StObject {
  
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
  implicit class WorksheetViewNormalMutableBuilder[Self <: WorksheetViewNormal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: normal): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: pageBreakPreview | pageLayout): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
