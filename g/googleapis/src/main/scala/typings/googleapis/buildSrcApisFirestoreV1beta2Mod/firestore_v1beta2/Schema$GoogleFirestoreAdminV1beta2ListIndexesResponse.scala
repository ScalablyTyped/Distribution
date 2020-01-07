package typings.googleapis.buildSrcApisFirestoreV1beta2Mod.firestore_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for FirestoreAdmin.ListIndexes.
  */
@js.native
trait Schema$GoogleFirestoreAdminV1beta2ListIndexesResponse extends js.Object {
  /**
    * The requested indexes.
    */
  var indexes: js.UndefOr[js.Array[Schema$GoogleFirestoreAdminV1beta2Index]] = js.native
  /**
    * A page token that may be used to request another page of results. If
    * blank, this is the last page.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$GoogleFirestoreAdminV1beta2ListIndexesResponse {
  @scala.inline
  def apply(indexes: js.Array[Schema$GoogleFirestoreAdminV1beta2Index] = null, nextPageToken: String = null): Schema$GoogleFirestoreAdminV1beta2ListIndexesResponse = {
    val __obj = js.Dynamic.literal()
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleFirestoreAdminV1beta2ListIndexesResponse]
  }
}

