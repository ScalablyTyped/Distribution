package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Guid extends js.Object {
  var guid: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var parentGuid: js.UndefOr[java.lang.String] = js.undefined
  var updateSequenceNum: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Guid {
  @scala.inline
  def apply(
    guid: java.lang.String = null,
    name: java.lang.String = null,
    parentGuid: java.lang.String = null,
    updateSequenceNum: scala.Int | scala.Double = null
  ): Anon_Guid = {
    val __obj = js.Dynamic.literal()
    if (guid != null) __obj.updateDynamic("guid")(guid)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentGuid != null) __obj.updateDynamic("parentGuid")(parentGuid)
    if (updateSequenceNum != null) __obj.updateDynamic("updateSequenceNum")(updateSequenceNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Guid]
  }
}

