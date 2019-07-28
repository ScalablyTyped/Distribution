package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Guid extends js.Object {
  var guid: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parentGuid: js.UndefOr[String] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
}

object Anon_Guid {
  @scala.inline
  def apply(
    guid: String = null,
    name: String = null,
    parentGuid: String = null,
    updateSequenceNum: Int | Double = null
  ): Anon_Guid = {
    val __obj = js.Dynamic.literal()
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentGuid != null) __obj.updateDynamic("parentGuid")(parentGuid)
    if (updateSequenceNum != null) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Guid]
  }
}

