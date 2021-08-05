package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for google.bigtable.admin.v2.BigtableTableAdmin.ListTables
  */
trait SchemaListTablesResponse extends StObject {
  
  /**
    * Set if not all tables could be returned in a single response. Pass this
    * value to `page_token` in another request to get the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The tables present in the requested instance.
    */
  var tables: js.UndefOr[js.Array[SchemaTable]] = js.undefined
}
object SchemaListTablesResponse {
  
  inline def apply(): SchemaListTablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTablesResponse]
  }
  
  extension [Self <: SchemaListTablesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTables(value: js.Array[SchemaTable]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    inline def setTablesVarargs(value: SchemaTable*): Self = StObject.set(x, "tables", js.Array(value :_*))
  }
}
