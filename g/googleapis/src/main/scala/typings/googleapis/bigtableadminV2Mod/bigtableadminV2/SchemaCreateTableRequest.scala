package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for google.bigtable.admin.v2.BigtableTableAdmin.CreateTable
  */
@js.native
trait SchemaCreateTableRequest extends js.Object {
  /**
    * The optional list of row keys that will be used to initially split the
    * table into several tablets (tablets are similar to HBase regions). Given
    * two split keys, `s1` and `s2`, three tablets will be created, spanning
    * the key ranges: `[, s1), [s1, s2), [s2, )`.  Example:  * Row keys :=
    * `[&quot;a&quot;, &quot;apple&quot;, &quot;custom&quot;,
    * &quot;customer_1&quot;, &quot;customer_2&quot;,` `&quot;other&quot;,
    * &quot;zz&quot;]` * initial_split_keys := `[&quot;apple&quot;,
    * &quot;customer_1&quot;, &quot;customer_2&quot;, &quot;other&quot;]` * Key
    * assignment:     - Tablet 1 `[, apple)                =&gt;
    * {&quot;a&quot;}.`     - Tablet 2 `[apple, customer_1)      =&gt;
    * {&quot;apple&quot;, &quot;custom&quot;}.`     - Tablet 3 `[customer_1,
    * customer_2) =&gt; {&quot;customer_1&quot;}.`     - Tablet 4 `[customer_2,
    * other)      =&gt; {&quot;customer_2&quot;}.`     - Tablet 5 `[other, )
    * =&gt; {&quot;other&quot;, &quot;zz&quot;}.`
    */
  var initialSplits: js.UndefOr[js.Array[SchemaSplit]] = js.native
  /**
    * The Table to create.
    */
  var table: js.UndefOr[SchemaTable] = js.native
  /**
    * The name by which the new table should be referred to within the parent
    * instance, e.g., `foobar` rather than `&lt;parent&gt;/tables/foobar`.
    */
  var tableId: js.UndefOr[String] = js.native
}

object SchemaCreateTableRequest {
  @scala.inline
  def apply(initialSplits: js.Array[SchemaSplit] = null, table: SchemaTable = null, tableId: String = null): SchemaCreateTableRequest = {
    val __obj = js.Dynamic.literal()
    if (initialSplits != null) __obj.updateDynamic("initialSplits")(initialSplits.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (tableId != null) __obj.updateDynamic("tableId")(tableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateTableRequest]
  }
}

