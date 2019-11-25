package typings.flexmonster.flexmonsterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterItem extends js.Object {
  var caption: js.UndefOr[String] = js.undefined
  var hierarchyName: js.UndefOr[String] = js.undefined
  var uniqueName: js.UndefOr[String] = js.undefined
}

object FilterItem {
  @scala.inline
  def apply(caption: String = null, hierarchyName: String = null, uniqueName: String = null): FilterItem = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (hierarchyName != null) __obj.updateDynamic("hierarchyName")(hierarchyName.asInstanceOf[js.Any])
    if (uniqueName != null) __obj.updateDynamic("uniqueName")(uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterItem]
  }
}

