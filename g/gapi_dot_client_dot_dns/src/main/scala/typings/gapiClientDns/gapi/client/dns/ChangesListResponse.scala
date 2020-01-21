package typings.gapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesListResponse extends js.Object {
  /** The requested changes. */
  var changes: js.UndefOr[js.Array[Change]] = js.undefined
  /** Type of resource. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The presence of this field indicates that there exist more results following your last page of results in pagination order. To fetch them, make another
    * list request using this value as your pagination token.
    *
    * In this way you can retrieve the complete contents of even very large collections one page at a time. However, if the contents of the collection change
    * between the first and last paginated list request, the set of all elements returned will be an inconsistent view of the collection. There is no way to
    * retrieve a "snapshot" of collections larger than the maximum page size.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ChangesListResponse {
  @scala.inline
  def apply(changes: js.Array[Change] = null, kind: String = null, nextPageToken: String = null): ChangesListResponse = {
    val __obj = js.Dynamic.literal()
    if (changes != null) __obj.updateDynamic("changes")(changes.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangesListResponse]
  }
}

