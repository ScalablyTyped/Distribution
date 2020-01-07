package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for google.bigtable.admin.v2.BigtableTableAdmin.ListTables
  */
@js.native
trait Schema$ListTablesResponse extends js.Object {
  /**
    * Set if not all tables could be returned in a single response. Pass this
    * value to `page_token` in another request to get the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The tables present in the requested instance.
    */
  var tables: js.UndefOr[js.Array[Schema$Table]] = js.native
}

object Schema$ListTablesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, tables: js.Array[Schema$Table] = null): Schema$ListTablesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListTablesResponse]
  }
}

