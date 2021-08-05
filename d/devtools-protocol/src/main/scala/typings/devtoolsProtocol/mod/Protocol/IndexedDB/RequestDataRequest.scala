package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestDataRequest extends StObject {
  
  /**
    * Database name.
    */
  var databaseName: String
  
  /**
    * Index name, empty string for object store data requests.
    */
  var indexName: String
  
  /**
    * Key range.
    */
  var keyRange: js.UndefOr[KeyRange] = js.undefined
  
  /**
    * Object store name.
    */
  var objectStoreName: String
  
  /**
    * Number of records to fetch.
    */
  var pageSize: integer
  
  /**
    * Security origin.
    */
  var securityOrigin: String
  
  /**
    * Number of records to skip.
    */
  var skipCount: integer
}
object RequestDataRequest {
  
  inline def apply(
    databaseName: String,
    indexName: String,
    objectStoreName: String,
    pageSize: integer,
    securityOrigin: String,
    skipCount: integer
  ): RequestDataRequest = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any], objectStoreName = objectStoreName.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any], skipCount = skipCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDataRequest]
  }
  
  extension [Self <: RequestDataRequest](x: Self) {
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    inline def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setKeyRange(value: KeyRange): Self = StObject.set(x, "keyRange", value.asInstanceOf[js.Any])
    
    inline def setKeyRangeUndefined: Self = StObject.set(x, "keyRange", js.undefined)
    
    inline def setObjectStoreName(value: String): Self = StObject.set(x, "objectStoreName", value.asInstanceOf[js.Any])
    
    inline def setPageSize(value: integer): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
    
    inline def setSkipCount(value: integer): Self = StObject.set(x, "skipCount", value.asInstanceOf[js.Any])
  }
}
