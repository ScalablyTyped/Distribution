package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response from Firestore.ListCollectionIds.
  */
@js.native
trait Schema$ListCollectionIdsResponse extends js.Object {
  /**
    * The collection ids.
    */
  var collectionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A page token that may be used to continue the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListCollectionIdsResponse {
  @scala.inline
  def apply(collectionIds: js.Array[String] = null, nextPageToken: String = null): Schema$ListCollectionIdsResponse = {
    val __obj = js.Dynamic.literal()
    if (collectionIds != null) __obj.updateDynamic("collectionIds")(collectionIds.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListCollectionIdsResponse]
  }
}

