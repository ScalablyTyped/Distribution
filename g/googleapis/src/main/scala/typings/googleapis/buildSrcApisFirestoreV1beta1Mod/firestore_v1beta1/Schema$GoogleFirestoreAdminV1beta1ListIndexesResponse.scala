package typings.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for FirestoreAdmin.ListIndexes.
  */
@js.native
trait Schema$GoogleFirestoreAdminV1beta1ListIndexesResponse extends js.Object {
  /**
    * The indexes.
    */
  var indexes: js.UndefOr[js.Array[Schema$GoogleFirestoreAdminV1beta1Index]] = js.native
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$GoogleFirestoreAdminV1beta1ListIndexesResponse {
  @scala.inline
  def apply(indexes: js.Array[Schema$GoogleFirestoreAdminV1beta1Index] = null, nextPageToken: String = null): Schema$GoogleFirestoreAdminV1beta1ListIndexesResponse = {
    val __obj = js.Dynamic.literal()
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleFirestoreAdminV1beta1ListIndexesResponse]
  }
}

