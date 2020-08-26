package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsGroupsContentGroupsCustomToolTip extends js.Object {
  /** Sets content to the custom tooltip. Text and HTML support are provided for content.
    * @Default {null}
    */
  var content: js.UndefOr[String] = js.native
  /** Sets icon to the custom tooltip content.
    * @Default {null}
    */
  var prefixIcon: js.UndefOr[String] = js.native
  /** Sets title to the custom tooltip. Text and HTML support are provided for title and the title is in bold for text format.
    * @Default {null}
    */
  var title: js.UndefOr[String] = js.native
}

object TabsGroupsContentGroupsCustomToolTip {
  @scala.inline
  def apply(): TabsGroupsContentGroupsCustomToolTip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsGroupsContentGroupsCustomToolTip]
  }
  @scala.inline
  implicit class TabsGroupsContentGroupsCustomToolTipOps[Self <: TabsGroupsContentGroupsCustomToolTip] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setPrefixIcon(value: String): Self = this.set("prefixIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixIcon: Self = this.set("prefixIcon", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

