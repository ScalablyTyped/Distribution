package typings.evernote

import typings.evernote.mod.Types.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParentGuid extends js.Object {
  var guid: js.UndefOr[Guid] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parentGuid: js.UndefOr[Guid] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
}

object AnonParentGuid {
  @scala.inline
  def apply(
    guid: Guid = null,
    name: String = null,
    parentGuid: Guid = null,
    updateSequenceNum: Int | Double = null
  ): AnonParentGuid = {
    val __obj = js.Dynamic.literal()
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentGuid != null) __obj.updateDynamic("parentGuid")(parentGuid.asInstanceOf[js.Any])
    if (updateSequenceNum != null) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParentGuid]
  }
}

