package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDatabasesResponse extends js.Object {
  /** Databases that matched the request. */
  var databases: js.UndefOr[js.Array[Database]] = js.undefined
  /**
    * `next_page_token` can be sent in a subsequent
    * ListDatabases call to fetch more
    * of the matching databases.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListDatabasesResponse {
  @scala.inline
  def apply(databases: js.Array[Database] = null, nextPageToken: java.lang.String = null): ListDatabasesResponse = {
    val __obj = js.Dynamic.literal()
    if (databases != null) __obj.updateDynamic("databases")(databases)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListDatabasesResponse]
  }
}

