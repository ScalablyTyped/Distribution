package typings
package flexmonsterLib.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterItem extends js.Object {
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var hierarchyName: js.UndefOr[java.lang.String] = js.undefined
  var uniqueName: js.UndefOr[java.lang.String] = js.undefined
}

object FilterItem {
  @scala.inline
  def apply(
    caption: java.lang.String = null,
    hierarchyName: java.lang.String = null,
    uniqueName: java.lang.String = null
  ): FilterItem = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (hierarchyName != null) __obj.updateDynamic("hierarchyName")(hierarchyName)
    if (uniqueName != null) __obj.updateDynamic("uniqueName")(uniqueName)
    __obj.asInstanceOf[FilterItem]
  }
}

