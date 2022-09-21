package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.Clustering
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTableList extends StObject {
  
  /**
    * A hash of this page of results.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of list.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A token to request the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tables in the requested dataset.
    */
  var tables: js.UndefOr[js.Array[Clustering] | Null] = js.undefined
  
  /**
    * The total number of tables in the dataset.
    */
  var totalItems: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTableList {
  
  inline def apply(): SchemaTableList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableList]
  }
  
  extension [Self <: SchemaTableList](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTables(value: js.Array[Clustering]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesNull: Self = StObject.set(x, "tables", null)
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    inline def setTablesVarargs(value: Clustering*): Self = StObject.set(x, "tables", js.Array(value*))
    
    inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsNull: Self = StObject.set(x, "totalItems", null)
    
    inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
