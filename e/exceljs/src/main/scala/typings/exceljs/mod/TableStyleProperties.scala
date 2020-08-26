package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableStyleProperties extends js.Object {
  /**
  	  * Alternate rows shown with background colour
  	  * @default false
  	  */
  var showColumnStripes: js.UndefOr[Boolean] = js.native
  /**
  	  * Highlight the first column (bold)
  	  * @default false
  	  */
  var showFirstColumn: js.UndefOr[Boolean] = js.native
  /**
  	  * Highlight the last column (bold)
  	  * @default false
  	  */
  var showLastColumn: js.UndefOr[Boolean] = js.native
  /**
  	  * Alternate rows shown with background colour
  	  * @default false
  	  */
  var showRowStripes: js.UndefOr[Boolean] = js.native
  /**
  	 * The colour theme of the table
  	 * @default 'TableStyleMedium2'
  	 */
  var theme: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 61 */ js.Any
  ] = js.native
}

object TableStyleProperties {
  @scala.inline
  def apply(): TableStyleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableStyleProperties]
  }
  @scala.inline
  implicit class TableStylePropertiesOps[Self <: TableStyleProperties] (val x: Self) extends AnyVal {
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
    def setShowColumnStripes(value: Boolean): Self = this.set("showColumnStripes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowColumnStripes: Self = this.set("showColumnStripes", js.undefined)
    @scala.inline
    def setShowFirstColumn(value: Boolean): Self = this.set("showFirstColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowFirstColumn: Self = this.set("showFirstColumn", js.undefined)
    @scala.inline
    def setShowLastColumn(value: Boolean): Self = this.set("showLastColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowLastColumn: Self = this.set("showLastColumn", js.undefined)
    @scala.inline
    def setShowRowStripes(value: Boolean): Self = this.set("showRowStripes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRowStripes: Self = this.set("showRowStripes", js.undefined)
    @scala.inline
    def setTheme(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 61 */ js.Any): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

