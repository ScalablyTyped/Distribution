package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.firestoreProtoApiMod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteResult extends js.Object {
  var transformResults: js.UndefOr[js.Array[Value]] = js.undefined
  var updateTime: js.UndefOr[Timestamp] = js.undefined
}

object WriteResult {
  @scala.inline
  def apply(transformResults: js.Array[Value] = null, updateTime: Timestamp = null): WriteResult = {
    val __obj = js.Dynamic.literal()
    if (transformResults != null) __obj.updateDynamic("transformResults")(transformResults.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteResult]
  }
}

