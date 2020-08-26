package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextualTabOptions extends js.Object {
  /** Pass the background color
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Pass the border color
    */
  var borderColor: js.UndefOr[String] = js.native
  /** Pass the tabs object to add in ribbon
    */
  var tabs: js.UndefOr[js.Any] = js.native
}

object ContextualTabOptions {
  @scala.inline
  def apply(): ContextualTabOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextualTabOptions]
  }
  @scala.inline
  implicit class ContextualTabOptionsOps[Self <: ContextualTabOptions] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setTabs(value: js.Any): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
  }
  
}

