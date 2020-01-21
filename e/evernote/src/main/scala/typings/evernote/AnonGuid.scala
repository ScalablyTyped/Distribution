package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGuid extends js.Object {
  var guid: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parentGuid: js.UndefOr[String] = js.undefined
  var updateSequenceNum: js.UndefOr[Double] = js.undefined
}

object AnonGuid {
  @scala.inline
  def apply(
    guid: String = null,
    name: String = null,
    parentGuid: String = null,
    updateSequenceNum: Int | Double = null
  ): AnonGuid = {
    val __obj = js.Dynamic.literal()
    if (guid != null) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentGuid != null) __obj.updateDynamic("parentGuid")(parentGuid.asInstanceOf[js.Any])
    if (updateSequenceNum != null) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGuid]
  }
}

