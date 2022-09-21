package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDropRowRangeRequest extends StObject {
  
  /**
    * Delete all rows in the table. Setting this to false is a no-op.
    */
  var deleteAllDataFromTable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Delete all rows that start with this row key prefix. Prefix cannot be zero length.
    */
  var rowKeyPrefix: js.UndefOr[String | Null] = js.undefined
}
object SchemaDropRowRangeRequest {
  
  inline def apply(): SchemaDropRowRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDropRowRangeRequest]
  }
  
  extension [Self <: SchemaDropRowRangeRequest](x: Self) {
    
    inline def setDeleteAllDataFromTable(value: Boolean): Self = StObject.set(x, "deleteAllDataFromTable", value.asInstanceOf[js.Any])
    
    inline def setDeleteAllDataFromTableNull: Self = StObject.set(x, "deleteAllDataFromTable", null)
    
    inline def setDeleteAllDataFromTableUndefined: Self = StObject.set(x, "deleteAllDataFromTable", js.undefined)
    
    inline def setRowKeyPrefix(value: String): Self = StObject.set(x, "rowKeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setRowKeyPrefixNull: Self = StObject.set(x, "rowKeyPrefix", null)
    
    inline def setRowKeyPrefixUndefined: Self = StObject.set(x, "rowKeyPrefix", js.undefined)
  }
}
