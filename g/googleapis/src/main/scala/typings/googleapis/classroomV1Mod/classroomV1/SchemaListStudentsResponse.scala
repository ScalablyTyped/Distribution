package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListStudentsResponse extends StObject {
  
  /**
    * Token identifying the next page of results to return. If empty, no further results are available.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Students who match the list request.
    */
  var students: js.UndefOr[js.Array[SchemaStudent]] = js.undefined
}
object SchemaListStudentsResponse {
  
  inline def apply(): SchemaListStudentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListStudentsResponse]
  }
  
  extension [Self <: SchemaListStudentsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setStudents(value: js.Array[SchemaStudent]): Self = StObject.set(x, "students", value.asInstanceOf[js.Any])
    
    inline def setStudentsUndefined: Self = StObject.set(x, "students", js.undefined)
    
    inline def setStudentsVarargs(value: SchemaStudent*): Self = StObject.set(x, "students", js.Array(value*))
  }
}
