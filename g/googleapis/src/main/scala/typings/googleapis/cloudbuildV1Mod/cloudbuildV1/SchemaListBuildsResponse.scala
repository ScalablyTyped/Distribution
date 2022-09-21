package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListBuildsResponse extends StObject {
  
  /**
    * Builds will be sorted by `create_time`, descending.
    */
  var builds: js.UndefOr[js.Array[SchemaBuild]] = js.undefined
  
  /**
    * Token to receive the next page of results. This will be absent if the end of the response list has been reached.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListBuildsResponse {
  
  inline def apply(): SchemaListBuildsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBuildsResponse]
  }
  
  extension [Self <: SchemaListBuildsResponse](x: Self) {
    
    inline def setBuilds(value: js.Array[SchemaBuild]): Self = StObject.set(x, "builds", value.asInstanceOf[js.Any])
    
    inline def setBuildsUndefined: Self = StObject.set(x, "builds", js.undefined)
    
    inline def setBuildsVarargs(value: SchemaBuild*): Self = StObject.set(x, "builds", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
