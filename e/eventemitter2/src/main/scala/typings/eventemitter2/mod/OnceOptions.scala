package typings.eventemitter2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnceOptions extends js.Object {
  /**
    * @default Promise
    */
  var Promise: js.Function = js.native
  /**
    * @default false
    */
  var overload: Boolean = js.native
  /**
    * @default 0
    */
  var timeout: Double = js.native
}

object OnceOptions {
  @scala.inline
  def apply(Promise: js.Function, overload: Boolean, timeout: Double): OnceOptions = {
    val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], overload = overload.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnceOptions]
  }
  @scala.inline
  implicit class OnceOptionsOps[Self <: OnceOptions] (val x: Self) extends AnyVal {
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
    def setPromise(value: js.Function): Self = this.set("Promise", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverload(value: Boolean): Self = this.set("overload", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
  
}

