package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.FriendlyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProjectList extends StObject {
  
  /**
    * A hash of the page of results
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
    * Projects to which you have at least READ access.
    */
  var projects: js.UndefOr[js.Array[FriendlyName] | Null] = js.undefined
  
  /**
    * The total number of projects in the list.
    */
  var totalItems: js.UndefOr[Double | Null] = js.undefined
}
object SchemaProjectList {
  
  inline def apply(): SchemaProjectList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectList]
  }
  
  extension [Self <: SchemaProjectList](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProjects(value: js.Array[FriendlyName]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsNull: Self = StObject.set(x, "projects", null)
    
    inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    inline def setProjectsVarargs(value: FriendlyName*): Self = StObject.set(x, "projects", js.Array(value*))
    
    inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsNull: Self = StObject.set(x, "totalItems", null)
    
    inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
