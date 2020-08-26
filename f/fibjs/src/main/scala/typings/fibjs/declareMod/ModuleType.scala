package typings.fibjs.declareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleType extends js.Object {
  var exports: GlobalExportsType = js.native
}

object ModuleType {
  @scala.inline
  def apply(exports: GlobalExportsType): ModuleType = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleType]
  }
  @scala.inline
  implicit class ModuleTypeOps[Self <: ModuleType] (val x: Self) extends AnyVal {
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
    def setExports(value: GlobalExportsType): Self = this.set("exports", value.asInstanceOf[js.Any])
  }
  
}

