package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.firestoreProtoApiMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteRequest extends js.Object {
  var labels: js.UndefOr[ApiClientObjectMap[String]] = js.undefined
  var streamId: js.UndefOr[String] = js.undefined
  var streamToken: js.UndefOr[String] = js.undefined
  var writes: js.UndefOr[js.Array[Write]] = js.undefined
}

object WriteRequest {
  @scala.inline
  def apply(
    labels: ApiClientObjectMap[String] = null,
    streamId: String = null,
    streamToken: String = null,
    writes: js.Array[Write] = null
  ): WriteRequest = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (streamId != null) __obj.updateDynamic("streamId")(streamId.asInstanceOf[js.Any])
    if (streamToken != null) __obj.updateDynamic("streamToken")(streamToken.asInstanceOf[js.Any])
    if (writes != null) __obj.updateDynamic("writes")(writes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteRequest]
  }
}

