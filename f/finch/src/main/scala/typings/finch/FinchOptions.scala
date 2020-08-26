package typings.finch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinchOptions extends js.Object {
  var CoerceParameterTypes: js.UndefOr[Boolean] = js.native
}

object FinchOptions {
  @scala.inline
  def apply(): FinchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinchOptions]
  }
  @scala.inline
  implicit class FinchOptionsOps[Self <: FinchOptions] (val x: Self) extends AnyVal {
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
    def setCoerceParameterTypes(value: Boolean): Self = this.set("CoerceParameterTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoerceParameterTypes: Self = this.set("CoerceParameterTypes", js.undefined)
  }
  
}

