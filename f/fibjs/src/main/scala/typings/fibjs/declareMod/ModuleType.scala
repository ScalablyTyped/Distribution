package typings.fibjs.declareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleType extends js.Object {
  var exports: GlobalExportsType
}

object ModuleType {
  @scala.inline
  def apply(exports: GlobalExportsType): ModuleType = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleType]
  }
}

