package typings
package diffLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedDiff extends js.Object {
  var hunks: js.Array[Hunk]
  var index: js.UndefOr[java.lang.String] = js.undefined
  var newFileName: js.UndefOr[java.lang.String] = js.undefined
  var newHeader: js.UndefOr[java.lang.String] = js.undefined
  var oldFileName: js.UndefOr[java.lang.String] = js.undefined
  var oldHeader: js.UndefOr[java.lang.String] = js.undefined
}

object ParsedDiff {
  @scala.inline
  def apply(
    hunks: js.Array[Hunk],
    index: java.lang.String = null,
    newFileName: java.lang.String = null,
    newHeader: java.lang.String = null,
    oldFileName: java.lang.String = null,
    oldHeader: java.lang.String = null
  ): ParsedDiff = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hunks")(hunks)
    if (index != null) __obj.updateDynamic("index")(index)
    if (newFileName != null) __obj.updateDynamic("newFileName")(newFileName)
    if (newHeader != null) __obj.updateDynamic("newHeader")(newHeader)
    if (oldFileName != null) __obj.updateDynamic("oldFileName")(oldFileName)
    if (oldHeader != null) __obj.updateDynamic("oldHeader")(oldHeader)
    __obj.asInstanceOf[ParsedDiff]
  }
}

