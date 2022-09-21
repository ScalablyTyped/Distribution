package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListRoutinesResponse extends StObject {
  
  /**
    * A token to request the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Routines in the requested dataset. Unless read_mask is set in the request, only the following fields are populated: etag, project_id, dataset_id, routine_id, routine_type, creation_time, last_modified_time, and language.
    */
  var routines: js.UndefOr[js.Array[SchemaRoutine]] = js.undefined
}
object SchemaListRoutinesResponse {
  
  inline def apply(): SchemaListRoutinesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRoutinesResponse]
  }
  
  extension [Self <: SchemaListRoutinesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRoutines(value: js.Array[SchemaRoutine]): Self = StObject.set(x, "routines", value.asInstanceOf[js.Any])
    
    inline def setRoutinesUndefined: Self = StObject.set(x, "routines", js.undefined)
    
    inline def setRoutinesVarargs(value: SchemaRoutine*): Self = StObject.set(x, "routines", js.Array(value*))
  }
}
