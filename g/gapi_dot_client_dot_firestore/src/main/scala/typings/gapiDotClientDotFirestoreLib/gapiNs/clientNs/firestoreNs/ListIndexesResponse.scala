package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIndexesResponse extends js.Object {
  /** The indexes. */
  var indexes: js.UndefOr[js.Array[Index]] = js.undefined
  /** The standard List next-page token. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListIndexesResponse {
  @scala.inline
  def apply(indexes: js.Array[Index] = null, nextPageToken: java.lang.String = null): ListIndexesResponse = {
    val __obj = js.Dynamic.literal()
    if (indexes != null) __obj.updateDynamic("indexes")(indexes)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListIndexesResponse]
  }
}

