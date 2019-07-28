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
  var state: js.UndefOr[normal] = js.undefined
  /**
  	 * Presentation style
  	 */
  var style: js.UndefOr[pageBreakPreview | pageLayout] = js.undefined
}

object WorksheetViewNormal {
  @scala.inline
  def apply(state: normal = null, style: pageBreakPreview | pageLayout = null): WorksheetViewNormal = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetViewNormal]
  }
}

