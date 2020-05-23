package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentGuid extends js.Object {
  var guid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parentGuid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
}

object ParentGuid {
  @scala.inline
  def apply(
    guid: typings.evernote.mod.Types.Guid = null,
    name: String = null,
    parentGuid: typings.evernote.mod.Types.Guid = null,
    updateSequenceNum: js.UndefOr[Double] = js.undefined
  ): ParentGuid = {
    val __obj = js.Dynamic.literal()
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentGuid != null) __obj.updateDynamic("parentGuid")(parentGuid.asInstanceOf[js.Any])
    if (!js.isUndefined(updateSequenceNum)) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentGuid]
  }
}

