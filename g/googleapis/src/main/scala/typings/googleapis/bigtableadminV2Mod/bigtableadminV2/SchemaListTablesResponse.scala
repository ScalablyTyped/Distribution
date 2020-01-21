package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for google.bigtable.admin.v2.BigtableTableAdmin.ListTables
  */
@js.native
trait SchemaListTablesResponse extends js.Object {
  /**
    * Set if not all tables could be returned in a single response. Pass this
    * value to `page_token` in another request to get the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The tables present in the requested instance.
    */
  var tables: js.UndefOr[js.Array[SchemaTable]] = js.native
}

object SchemaListTablesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, tables: js.Array[SchemaTable] = null): SchemaListTablesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (tables != null) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListTablesResponse]
  }
}

