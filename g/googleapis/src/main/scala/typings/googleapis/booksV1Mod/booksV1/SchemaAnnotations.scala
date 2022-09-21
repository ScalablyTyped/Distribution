package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnnotations extends StObject {
  
  /**
    * A list of annotations.
    */
  var items: js.UndefOr[js.Array[SchemaAnnotation]] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Token to pass in for pagination for the next page. This will not be present if this request does not have more results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total number of annotations found. This may be greater than the number of notes returned in this response if results have been paginated.
    */
  var totalItems: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAnnotations {
  
  inline def apply(): SchemaAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotations]
  }
  
  extension [Self <: SchemaAnnotations](x: Self) {
    
    inline def setItems(value: js.Array[SchemaAnnotation]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaAnnotation*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsNull: Self = StObject.set(x, "totalItems", null)
    
    inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
