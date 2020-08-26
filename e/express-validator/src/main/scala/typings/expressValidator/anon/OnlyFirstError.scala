package typings.expressValidator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnlyFirstError extends js.Object {
  var onlyFirstError: js.UndefOr[Boolean] = js.native
}

object OnlyFirstError {
  @scala.inline
  def apply(): OnlyFirstError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlyFirstError]
  }
  @scala.inline
  implicit class OnlyFirstErrorOps[Self <: OnlyFirstError] (val x: Self) extends AnyVal {
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
    def setOnlyFirstError(value: Boolean): Self = this.set("onlyFirstError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyFirstError: Self = this.set("onlyFirstError", js.undefined)
  }
  
}

