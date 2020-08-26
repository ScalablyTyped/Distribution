package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxHtmlEditorMediaResizing extends js.Object {
  /** @name dxHtmlEditorMediaResizing.allowedTargets */
  var allowedTargets: js.UndefOr[js.Array[String]] = js.native
  /** @name dxHtmlEditorMediaResizing.enabled */
  var enabled: js.UndefOr[Boolean] = js.native
}

object dxHtmlEditorMediaResizing {
  @scala.inline
  def apply(): dxHtmlEditorMediaResizing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorMediaResizing]
  }
  @scala.inline
  implicit class dxHtmlEditorMediaResizingOps[Self <: dxHtmlEditorMediaResizing] (val x: Self) extends AnyVal {
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
    def setAllowedTargetsVarargs(value: String*): Self = this.set("allowedTargets", js.Array(value :_*))
    @scala.inline
    def setAllowedTargets(value: js.Array[String]): Self = this.set("allowedTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedTargets: Self = this.set("allowedTargets", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
  
}

