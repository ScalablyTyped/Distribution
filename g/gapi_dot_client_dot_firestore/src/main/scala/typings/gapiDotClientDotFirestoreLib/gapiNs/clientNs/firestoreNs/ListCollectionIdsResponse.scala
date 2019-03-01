package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCollectionIdsResponse extends js.Object {
  /** The collection ids. */
  var collectionIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A page token that may be used to continue the list. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListCollectionIdsResponse {
  @scala.inline
  def apply(collectionIds: js.Array[java.lang.String] = null, nextPageToken: java.lang.String = null): ListCollectionIdsResponse = {
    val __obj = js.Dynamic.literal()
    if (collectionIds != null) __obj.updateDynamic("collectionIds")(collectionIds)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListCollectionIdsResponse]
  }
}

