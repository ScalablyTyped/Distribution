package typings.fsDashMerger.fsDashMergerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FSMergerObject extends js.Object {
  var getDestinationPath: js.UndefOr[js.Function] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var root: String
}

object FSMergerObject {
  @scala.inline
  def apply(root: String, getDestinationPath: js.Function = null, prefix: String = null): FSMergerObject = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    if (getDestinationPath != null) __obj.updateDynamic("getDestinationPath")(getDestinationPath.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[FSMergerObject]
  }
}

