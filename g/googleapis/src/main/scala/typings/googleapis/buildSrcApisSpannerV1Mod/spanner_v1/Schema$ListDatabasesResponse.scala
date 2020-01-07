package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for ListDatabases.
  */
@js.native
trait Schema$ListDatabasesResponse extends js.Object {
  /**
    * Databases that matched the request.
    */
  var databases: js.UndefOr[js.Array[Schema$Database]] = js.native
  /**
    * `next_page_token` can be sent in a subsequent ListDatabases call to fetch
    * more of the matching databases.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListDatabasesResponse {
  @scala.inline
  def apply(databases: js.Array[Schema$Database] = null, nextPageToken: String = null): Schema$ListDatabasesResponse = {
    val __obj = js.Dynamic.literal()
    if (databases != null) __obj.updateDynamic("databases")(databases.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListDatabasesResponse]
  }
}

