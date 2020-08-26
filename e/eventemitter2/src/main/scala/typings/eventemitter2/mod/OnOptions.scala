package typings.eventemitter2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnOptions extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var nextTick: js.UndefOr[Boolean] = js.native
  var objectify: js.UndefOr[Boolean] = js.native
  var promisify: js.UndefOr[Boolean] = js.native
}

object OnOptions {
  @scala.inline
  def apply(): OnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnOptions]
  }
  @scala.inline
  implicit class OnOptionsOps[Self <: OnOptions] (val x: Self) extends AnyVal {
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setNextTick(value: Boolean): Self = this.set("nextTick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextTick: Self = this.set("nextTick", js.undefined)
    @scala.inline
    def setObjectify(value: Boolean): Self = this.set("objectify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectify: Self = this.set("objectify", js.undefined)
    @scala.inline
    def setPromisify(value: Boolean): Self = this.set("promisify", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromisify: Self = this.set("promisify", js.undefined)
  }
  
}

