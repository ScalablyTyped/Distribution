package typings.googleapis.buildSrcApisFirestoreV1beta2Mod.firestore_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for FirestoreAdmin.ListFields.
  */
@js.native
trait Schema$GoogleFirestoreAdminV1beta2ListFieldsResponse extends js.Object {
  /**
    * The requested fields.
    */
  var fields: js.UndefOr[js.Array[Schema$GoogleFirestoreAdminV1beta2Field]] = js.native
  /**
    * A page token that may be used to request another page of results. If
    * blank, this is the last page.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$GoogleFirestoreAdminV1beta2ListFieldsResponse {
  @scala.inline
  def apply(fields: js.Array[Schema$GoogleFirestoreAdminV1beta2Field] = null, nextPageToken: String = null): Schema$GoogleFirestoreAdminV1beta2ListFieldsResponse = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleFirestoreAdminV1beta2ListFieldsResponse]
  }
}

