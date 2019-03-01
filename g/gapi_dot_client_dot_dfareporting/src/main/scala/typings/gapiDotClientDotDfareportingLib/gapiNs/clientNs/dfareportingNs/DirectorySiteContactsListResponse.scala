package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySiteContactsListResponse extends js.Object {
  /** Directory site contact collection */
  var directorySiteContacts: js.UndefOr[js.Array[DirectorySiteContact]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#directorySiteContactsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object DirectorySiteContactsListResponse {
  @scala.inline
  def apply(
    directorySiteContacts: js.Array[DirectorySiteContact] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): DirectorySiteContactsListResponse = {
    val __obj = js.Dynamic.literal()
    if (directorySiteContacts != null) __obj.updateDynamic("directorySiteContacts")(directorySiteContacts)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[DirectorySiteContactsListResponse]
  }
}

