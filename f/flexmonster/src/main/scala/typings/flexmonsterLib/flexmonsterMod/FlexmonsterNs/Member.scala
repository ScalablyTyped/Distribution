package typings
package flexmonsterLib.flexmonsterMod.FlexmonsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Member extends js.Object {
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var children: js.UndefOr[js.Array[Member]] = js.undefined
  var hierarchyName: js.UndefOr[java.lang.String] = js.undefined
  var isLeaf: js.UndefOr[scala.Boolean] = js.undefined
  var parentMember: js.UndefOr[java.lang.String] = js.undefined
  var uniqueName: js.UndefOr[java.lang.String] = js.undefined
}

object Member {
  @scala.inline
  def apply(
    caption: java.lang.String = null,
    children: js.Array[Member] = null,
    hierarchyName: java.lang.String = null,
    isLeaf: js.UndefOr[scala.Boolean] = js.undefined,
    parentMember: java.lang.String = null,
    uniqueName: java.lang.String = null
  ): Member = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (children != null) __obj.updateDynamic("children")(children)
    if (hierarchyName != null) __obj.updateDynamic("hierarchyName")(hierarchyName)
    if (!js.isUndefined(isLeaf)) __obj.updateDynamic("isLeaf")(isLeaf)
    if (parentMember != null) __obj.updateDynamic("parentMember")(parentMember)
    if (uniqueName != null) __obj.updateDynamic("uniqueName")(uniqueName)
    __obj.asInstanceOf[Member]
  }
}

