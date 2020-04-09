package typings.firebaseFirestore.remotePersistentStreamMod

import typings.firebaseFirestore.firestoreProtoApiMod.ApiClientObjectMap
import typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces.Write
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteRequest
  extends typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces.WriteRequest {
  var database: js.UndefOr[String] = js.undefined
}

object WriteRequest {
  @scala.inline
  def apply(
    database: String = null,
    labels: ApiClientObjectMap[String] = null,
    streamId: String = null,
    streamToken: String | Uint8Array = null,
    writes: js.Array[Write] = null
  ): WriteRequest = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (streamId != null) __obj.updateDynamic("streamId")(streamId.asInstanceOf[js.Any])
    if (streamToken != null) __obj.updateDynamic("streamToken")(streamToken.asInstanceOf[js.Any])
    if (writes != null) __obj.updateDynamic("writes")(writes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteRequest]
  }
}

