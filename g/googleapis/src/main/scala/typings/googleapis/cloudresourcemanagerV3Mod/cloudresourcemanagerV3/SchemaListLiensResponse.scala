package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListLiensResponse extends StObject {
  
  /**
    * A list of Liens.
    */
  var liens: js.UndefOr[js.Array[SchemaLien]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListLiensResponse {
  
  inline def apply(): SchemaListLiensResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListLiensResponse]
  }
  
  extension [Self <: SchemaListLiensResponse](x: Self) {
    
    inline def setLiens(value: js.Array[SchemaLien]): Self = StObject.set(x, "liens", value.asInstanceOf[js.Any])
    
    inline def setLiensUndefined: Self = StObject.set(x, "liens", js.undefined)
    
    inline def setLiensVarargs(value: SchemaLien*): Self = StObject.set(x, "liens", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
