package typings.extjs.Ext.dd.dragdropmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IElementWrapper extends js.Object {
  /** [Property] (Object) */
  var css: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var el: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var id: js.UndefOr[js.Any] = js.native
}

object IElementWrapper {
  @scala.inline
  def apply(): IElementWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IElementWrapper]
  }
  @scala.inline
  implicit class IElementWrapperOps[Self <: IElementWrapper] (val x: Self) extends AnyVal {
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
    def setCss(value: js.Any): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setEl(value: js.Any): Self = this.set("el", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

