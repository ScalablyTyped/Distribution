package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextualTab extends js.Object {
  /** Specifies the backgroundColor of the contextual tabs and tab set in the ribbon control.
    * @Default {null}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Specifies the borderColor of the contextual tabs and tab set in the ribbon control.
    * @Default {null}
    */
  var borderColor: js.UndefOr[String] = js.native
  /** Specifies the tabs to present in the contextual tabs and tab set. Refer to the tabs section for adding tabs into the contextual tabs and tab set.
    * @Default {Array}
    */
  var tabs: js.UndefOr[js.Array[_]] = js.native
}

object ContextualTab {
  @scala.inline
  def apply(): ContextualTab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextualTab]
  }
  @scala.inline
  implicit class ContextualTabOps[Self <: ContextualTab] (val x: Self) extends AnyVal {
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
    def setTabsVarargs(value: js.Any*): Self = this.set("tabs", js.Array(value :_*))
    @scala.inline
    def setTabs(value: js.Array[_]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
  }
  
}

