package typings.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedDiff extends js.Object {
  var hunks: js.Array[Hunk]
  var index: js.UndefOr[String] = js.undefined
  var newFileName: js.UndefOr[String] = js.undefined
  var newHeader: js.UndefOr[String] = js.undefined
  var oldFileName: js.UndefOr[String] = js.undefined
  var oldHeader: js.UndefOr[String] = js.undefined
}

object ParsedDiff {
  @scala.inline
  def apply(
    hunks: js.Array[Hunk],
    index: String = null,
    newFileName: String = null,
    newHeader: String = null,
    oldFileName: String = null,
    oldHeader: String = null
  ): ParsedDiff = {
    val __obj = js.Dynamic.literal(hunks = hunks.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (newFileName != null) __obj.updateDynamic("newFileName")(newFileName.asInstanceOf[js.Any])
    if (newHeader != null) __obj.updateDynamic("newHeader")(newHeader.asInstanceOf[js.Any])
    if (oldFileName != null) __obj.updateDynamic("oldFileName")(oldFileName.asInstanceOf[js.Any])
    if (oldHeader != null) __obj.updateDynamic("oldHeader")(oldHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedDiff]
  }
}

