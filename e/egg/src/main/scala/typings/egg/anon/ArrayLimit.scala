package typings.egg.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayLimit extends js.Object {
  var arrayLimit: Double = js.native
  var depth: Double = js.native
  var parameterLimit: Double = js.native
}

object ArrayLimit {
  @scala.inline
  def apply(arrayLimit: Double, depth: Double, parameterLimit: Double): ArrayLimit = {
    val __obj = js.Dynamic.literal(arrayLimit = arrayLimit.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], parameterLimit = parameterLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayLimit]
  }
  @scala.inline
  implicit class ArrayLimitOps[Self <: ArrayLimit] (val x: Self) extends AnyVal {
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
    def setArrayLimit(value: Double): Self = this.set("arrayLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameterLimit(value: Double): Self = this.set("parameterLimit", value.asInstanceOf[js.Any])
  }
  
}

