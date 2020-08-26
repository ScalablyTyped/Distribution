package typings.devextreme.mod.DevExpress.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTemplateOptions extends js.Object {
  /** @name dxTemplate.Options.name */
  var name: js.UndefOr[String] = js.native
}

object dxTemplateOptions {
  @scala.inline
  def apply(): dxTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTemplateOptions]
  }
  @scala.inline
  implicit class dxTemplateOptionsOps[Self <: dxTemplateOptions] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

