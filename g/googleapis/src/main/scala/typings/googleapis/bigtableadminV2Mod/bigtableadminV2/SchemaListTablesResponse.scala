package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for google.bigtable.admin.v2.BigtableTableAdmin.ListTables
  */
@js.native
trait SchemaListTablesResponse extends StObject {
  
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
  def apply(): SchemaListTablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTablesResponse]
  }
  
  @scala.inline
  implicit class SchemaListTablesResponseMutableBuilder[Self <: SchemaListTablesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTables(value: js.Array[SchemaTable]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: SchemaTable*): Self = StObject.set(x, "tables", js.Array(value :_*))
  }
}
