package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.Clustering
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTableList extends StObject {
  
  /**
    * A hash of this page of results.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The type of list.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A token to request the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Tables in the requested dataset.
    */
  var tables: js.UndefOr[js.Array[Clustering]] = js.native
  
  /**
    * The total number of tables in the dataset.
    */
  var totalItems: js.UndefOr[Double] = js.native
}
object SchemaTableList {
  
  @scala.inline
  def apply(): SchemaTableList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableList]
  }
  
  @scala.inline
  implicit class SchemaTableListMutableBuilder[Self <: SchemaTableList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTables(value: js.Array[Clustering]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
    
    @scala.inline
    def setTablesVarargs(value: Clustering*): Self = StObject.set(x, "tables", js.Array(value :_*))
    
    @scala.inline
    def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
