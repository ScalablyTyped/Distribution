package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableStyleProperties extends js.Object {
  /**
  	  * Alternate rows shown with background colour
  	  * @default false
  	  */
  var showColumnStripes: js.UndefOr[Boolean] = js.undefined
  /**
  	  * Highlight the first column (bold)
  	  * @default false
  	  */
  var showFirstColumn: js.UndefOr[Boolean] = js.undefined
  /**
  	  * Highlight the last column (bold)
  	  * @default false
  	  */
  var showLastColumn: js.UndefOr[Boolean] = js.undefined
  /**
  	  * Alternate rows shown with background colour
  	  * @default false
  	  */
  var showRowStripes: js.UndefOr[Boolean] = js.undefined
  /**
  	 * The colour theme of the table
  	 * @default 'TableStyleMedium2'
  	 */
  var theme: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 61 */ js.Any
  ] = js.undefined
}

object TableStyleProperties {
  @scala.inline
  def apply(
    showColumnStripes: js.UndefOr[Boolean] = js.undefined,
    showFirstColumn: js.UndefOr[Boolean] = js.undefined,
    showLastColumn: js.UndefOr[Boolean] = js.undefined,
    showRowStripes: js.UndefOr[Boolean] = js.undefined,
    theme: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 61 */ js.Any = null
  ): TableStyleProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showColumnStripes)) __obj.updateDynamic("showColumnStripes")(showColumnStripes.asInstanceOf[js.Any])
    if (!js.isUndefined(showFirstColumn)) __obj.updateDynamic("showFirstColumn")(showFirstColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(showLastColumn)) __obj.updateDynamic("showLastColumn")(showLastColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowStripes)) __obj.updateDynamic("showRowStripes")(showRowStripes.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableStyleProperties]
  }
}

