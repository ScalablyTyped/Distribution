package typings.epilogue.epilogueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceSortOption extends js.Object {
  var default: String
  var param: String
}

object ResourceSortOption {
  @scala.inline
  def apply(default: String, param: String): ResourceSortOption = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceSortOption]
  }
}

