package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsMACAddressOptions extends js.Object {
  var no_colons: js.UndefOr[Boolean] = js.native
}

object IsMACAddressOptions {
  @scala.inline
  def apply(): IsMACAddressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsMACAddressOptions]
  }
  @scala.inline
  implicit class IsMACAddressOptionsOps[Self <: IsMACAddressOptions] (val x: Self) extends AnyVal {
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
    def setNo_colons(value: Boolean): Self = this.set("no_colons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNo_colons: Self = this.set("no_colons", js.undefined)
  }
  
}

