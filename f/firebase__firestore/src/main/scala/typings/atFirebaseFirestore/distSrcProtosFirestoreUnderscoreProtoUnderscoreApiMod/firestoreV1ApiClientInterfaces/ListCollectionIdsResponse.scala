package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCollectionIdsResponse extends js.Object {
  var collectionIds: js.UndefOr[js.Array[String]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListCollectionIdsResponse {
  @scala.inline
  def apply(collectionIds: js.Array[String] = null, nextPageToken: String = null): ListCollectionIdsResponse = {
    val __obj = js.Dynamic.literal()
    if (collectionIds != null) __obj.updateDynamic("collectionIds")(collectionIds.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCollectionIdsResponse]
  }
}

