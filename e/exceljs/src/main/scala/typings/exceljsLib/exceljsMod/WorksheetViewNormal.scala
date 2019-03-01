package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorksheetViewNormal extends js.Object {
  /**
  	 * Controls the view state
  	 */
  var state: js.UndefOr[exceljsLib.exceljsLibStrings.normal] = js.undefined
  /**
  	 * Presentation style
  	 */
  var style: js.UndefOr[
    exceljsLib.exceljsLibStrings.pageBreakPreview | exceljsLib.exceljsLibStrings.pageLayout
  ] = js.undefined
}

object WorksheetViewNormal {
  @scala.inline
  def apply(
    state: exceljsLib.exceljsLibStrings.normal = null,
    style: exceljsLib.exceljsLibStrings.pageBreakPreview | exceljsLib.exceljsLibStrings.pageLayout = null
  ): WorksheetViewNormal = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetViewNormal]
  }
}

