package typings.exceljs.exceljsMod

import typings.exceljs.exceljsStrings.normal
import typings.exceljs.exceljsStrings.pageBreakPreview
import typings.exceljs.exceljsStrings.pageLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorksheetViewNormal extends js.Object {
  /**
  	 * Controls the view state
  	 */
  var state: normal
  /**
  	 * Presentation style
  	 */
  var style: pageBreakPreview | pageLayout
}

object WorksheetViewNormal {
  @scala.inline
  def apply(state: normal, style: pageBreakPreview | pageLayout): WorksheetViewNormal = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorksheetViewNormal]
  }
}

