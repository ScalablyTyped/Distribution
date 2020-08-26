package typings.ejWebAll.ej.RTE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolsCustomOrderedList extends js.Object {
  /** Specifies the styles for customOrderedList item.
    */
  var css: js.UndefOr[String] = js.native
  /** Specifies the image for customOrderedList item.
    */
  var listImage: js.UndefOr[String] = js.native
  /** Specifies the list style for customOrderedList item.
    */
  var listStyle: js.UndefOr[String] = js.native
  /** Specifies the name for customOrderedList item.
    */
  var name: js.UndefOr[String] = js.native
  /** Specifies the text for customOrderedList item.
    */
  var text: js.UndefOr[String] = js.native
  /** Specifies the title for customOrderedList item.
    */
  var tooltip: js.UndefOr[String] = js.native
}

object ToolsCustomOrderedList {
  @scala.inline
  def apply(): ToolsCustomOrderedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolsCustomOrderedList]
  }
  @scala.inline
  implicit class ToolsCustomOrderedListOps[Self <: ToolsCustomOrderedList] (val x: Self) extends AnyVal {
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
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setListImage(value: String): Self = this.set("listImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListImage: Self = this.set("listImage", js.undefined)
    @scala.inline
    def setListStyle(value: String): Self = this.set("listStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListStyle: Self = this.set("listStyle", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

