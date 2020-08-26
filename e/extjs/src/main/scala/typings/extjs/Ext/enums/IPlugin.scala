package typings.extjs.Ext.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlugin extends js.Object {
  /** [Property] (String) */
  var bufferedrenderer: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var cellediting: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var gridheaderresizer: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var gridviewdragdrop: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var rowediting: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var rowexpander: js.UndefOr[String] = js.native
  /** [Property] (String) */
  var treeviewdragdrop: js.UndefOr[String] = js.native
}

object IPlugin {
  @scala.inline
  def apply(): IPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPlugin]
  }
  @scala.inline
  implicit class IPluginOps[Self <: IPlugin] (val x: Self) extends AnyVal {
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
    def setBufferedrenderer(value: String): Self = this.set("bufferedrenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferedrenderer: Self = this.set("bufferedrenderer", js.undefined)
    @scala.inline
    def setCellediting(value: String): Self = this.set("cellediting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellediting: Self = this.set("cellediting", js.undefined)
    @scala.inline
    def setGridheaderresizer(value: String): Self = this.set("gridheaderresizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridheaderresizer: Self = this.set("gridheaderresizer", js.undefined)
    @scala.inline
    def setGridviewdragdrop(value: String): Self = this.set("gridviewdragdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridviewdragdrop: Self = this.set("gridviewdragdrop", js.undefined)
    @scala.inline
    def setRowediting(value: String): Self = this.set("rowediting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowediting: Self = this.set("rowediting", js.undefined)
    @scala.inline
    def setRowexpander(value: String): Self = this.set("rowexpander", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowexpander: Self = this.set("rowexpander", js.undefined)
    @scala.inline
    def setTreeviewdragdrop(value: String): Self = this.set("treeviewdragdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeviewdragdrop: Self = this.set("treeviewdragdrop", js.undefined)
  }
  
}

