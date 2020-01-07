package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$BigtableOptions extends js.Object {
  /**
    * [Optional] List of column families to expose in the table schema along
    * with their types. This list restricts the column families that can be
    * referenced in queries and specifies their value types. You can use this
    * list to do type conversions - see the &#39;type&#39; field for more
    * details. If you leave this list empty, all column families are present in
    * the table schema and their values are read as BYTES. During a query only
    * the column families referenced in that query are read from Bigtable.
    */
  var columnFamilies: js.UndefOr[js.Array[Schema$BigtableColumnFamily]] = js.native
  /**
    * [Optional] If field is true, then the column families that are not
    * specified in columnFamilies list are not exposed in the table schema.
    * Otherwise, they are read with BYTES type values. The default value is
    * false.
    */
  var ignoreUnspecifiedColumnFamilies: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] If field is true, then the rowkey column families will be read
    * and converted to string. Otherwise they are read with BYTES type values
    * and users need to manually cast them with CAST if necessary. The default
    * value is false.
    */
  var readRowkeyAsString: js.UndefOr[Boolean] = js.native
}

object Schema$BigtableOptions {
  @scala.inline
  def apply(
    columnFamilies: js.Array[Schema$BigtableColumnFamily] = null,
    ignoreUnspecifiedColumnFamilies: js.UndefOr[Boolean] = js.undefined,
    readRowkeyAsString: js.UndefOr[Boolean] = js.undefined
  ): Schema$BigtableOptions = {
    val __obj = js.Dynamic.literal()
    if (columnFamilies != null) __obj.updateDynamic("columnFamilies")(columnFamilies.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnspecifiedColumnFamilies)) __obj.updateDynamic("ignoreUnspecifiedColumnFamilies")(ignoreUnspecifiedColumnFamilies.asInstanceOf[js.Any])
    if (!js.isUndefined(readRowkeyAsString)) __obj.updateDynamic("readRowkeyAsString")(readRowkeyAsString.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BigtableOptions]
  }
}

