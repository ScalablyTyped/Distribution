package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for google.bigtable.admin.v2.BigtableTableAdmin.CreateTable
  */
trait SchemaCreateTableRequest extends StObject {
  
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
  var initialSplits: js.UndefOr[js.Array[SchemaSplit]] = js.undefined
  
  /**
    * The Table to create.
    */
  var table: js.UndefOr[SchemaTable] = js.undefined
  
  /**
    * The name by which the new table should be referred to within the parent
    * instance, e.g., `foobar` rather than `&lt;parent&gt;/tables/foobar`.
    */
  var tableId: js.UndefOr[String] = js.undefined
}
object SchemaCreateTableRequest {
  
  inline def apply(): SchemaCreateTableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateTableRequest]
  }
  
  extension [Self <: SchemaCreateTableRequest](x: Self) {
    
    inline def setInitialSplits(value: js.Array[SchemaSplit]): Self = StObject.set(x, "initialSplits", value.asInstanceOf[js.Any])
    
    inline def setInitialSplitsUndefined: Self = StObject.set(x, "initialSplits", js.undefined)
    
    inline def setInitialSplitsVarargs(value: SchemaSplit*): Self = StObject.set(x, "initialSplits", js.Array(value :_*))
    
    inline def setTable(value: SchemaTable): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
