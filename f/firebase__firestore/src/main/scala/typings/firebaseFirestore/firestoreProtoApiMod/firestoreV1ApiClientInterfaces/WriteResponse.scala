package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.firestoreProtoApiMod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteResponse extends js.Object {
  var commitTime: js.UndefOr[Timestamp] = js.undefined
  var streamId: js.UndefOr[String] = js.undefined
  var streamToken: js.UndefOr[String] = js.undefined
  var writeResults: js.UndefOr[js.Array[WriteResult]] = js.undefined
}

object WriteResponse {
  @scala.inline
  def apply(
    commitTime: Timestamp = null,
    streamId: String = null,
    streamToken: String = null,
    writeResults: js.Array[WriteResult] = null
  ): WriteResponse = {
    val __obj = js.Dynamic.literal()
    if (commitTime != null) __obj.updateDynamic("commitTime")(commitTime.asInstanceOf[js.Any])
    if (streamId != null) __obj.updateDynamic("streamId")(streamId.asInstanceOf[js.Any])
    if (streamToken != null) __obj.updateDynamic("streamToken")(streamToken.asInstanceOf[js.Any])
    if (writeResults != null) __obj.updateDynamic("writeResults")(writeResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteResponse]
  }
}

