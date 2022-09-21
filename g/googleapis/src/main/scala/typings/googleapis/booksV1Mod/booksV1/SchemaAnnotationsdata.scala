package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnnotationsdata extends StObject {
  
  /**
    * A list of Annotation Data.
    */
  var items: js.UndefOr[js.Array[SchemaGeoAnnotationdata]] = js.undefined
  
  /**
    * Resource type
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Token to pass in for pagination for the next page. This will not be present if this request does not have more results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total number of volume annotations found.
    */
  var totalItems: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAnnotationsdata {
  
  inline def apply(): SchemaAnnotationsdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotationsdata]
  }
  
  extension [Self <: SchemaAnnotationsdata](x: Self) {
    
    inline def setItems(value: js.Array[SchemaGeoAnnotationdata]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaGeoAnnotationdata*): Self = StObject.set(x, "items", js.Array(value*))
    
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
