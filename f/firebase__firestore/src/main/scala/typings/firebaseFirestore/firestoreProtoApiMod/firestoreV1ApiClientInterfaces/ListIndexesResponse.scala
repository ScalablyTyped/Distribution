package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIndexesResponse extends js.Object {
  var indexes: js.UndefOr[js.Array[Index]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListIndexesResponse {
  @scala.inline
  def apply(indexes: js.Array[Index] = null, nextPageToken: String = null): ListIndexesResponse = {
    val __obj = js.Dynamic.literal()
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIndexesResponse]
  }
}

