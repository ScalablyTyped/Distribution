package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListLunsResponse extends StObject {
  
  /**
    * The list of luns.
    */
  var luns: js.UndefOr[js.Array[SchemaLun]] = js.undefined
  
  /**
    * A token identifying a page of results from the server.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListLunsResponse {
  
  inline def apply(): SchemaListLunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListLunsResponse]
  }
  
  extension [Self <: SchemaListLunsResponse](x: Self) {
    
    inline def setLuns(value: js.Array[SchemaLun]): Self = StObject.set(x, "luns", value.asInstanceOf[js.Any])
    
    inline def setLunsUndefined: Self = StObject.set(x, "luns", js.undefined)
    
    inline def setLunsVarargs(value: SchemaLun*): Self = StObject.set(x, "luns", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
