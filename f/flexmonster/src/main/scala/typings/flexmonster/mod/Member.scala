package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Member extends js.Object {
  var caption: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[js.Array[Member]] = js.undefined
  var hierarchyName: js.UndefOr[String] = js.undefined
  var isLeaf: js.UndefOr[Boolean] = js.undefined
  var parentMember: js.UndefOr[String] = js.undefined
  var uniqueName: js.UndefOr[String] = js.undefined
}

object Member {
  @scala.inline
  def apply(
    caption: String = null,
    children: js.Array[Member] = null,
    hierarchyName: String = null,
    isLeaf: js.UndefOr[Boolean] = js.undefined,
    parentMember: String = null,
    uniqueName: String = null
  ): Member = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (hierarchyName != null) __obj.updateDynamic("hierarchyName")(hierarchyName.asInstanceOf[js.Any])
    if (!js.isUndefined(isLeaf)) __obj.updateDynamic("isLeaf")(isLeaf.asInstanceOf[js.Any])
    if (parentMember != null) __obj.updateDynamic("parentMember")(parentMember.asInstanceOf[js.Any])
    if (uniqueName != null) __obj.updateDynamic("uniqueName")(uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member]
  }
}

