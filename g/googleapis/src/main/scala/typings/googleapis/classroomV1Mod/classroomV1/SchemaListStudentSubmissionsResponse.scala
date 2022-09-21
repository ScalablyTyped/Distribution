package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListStudentSubmissionsResponse extends StObject {
  
  /**
    * Token identifying the next page of results to return. If empty, no further results are available.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Student work that matches the request.
    */
  var studentSubmissions: js.UndefOr[js.Array[SchemaStudentSubmission]] = js.undefined
}
object SchemaListStudentSubmissionsResponse {
  
  inline def apply(): SchemaListStudentSubmissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListStudentSubmissionsResponse]
  }
  
  extension [Self <: SchemaListStudentSubmissionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setStudentSubmissions(value: js.Array[SchemaStudentSubmission]): Self = StObject.set(x, "studentSubmissions", value.asInstanceOf[js.Any])
    
    inline def setStudentSubmissionsUndefined: Self = StObject.set(x, "studentSubmissions", js.undefined)
    
    inline def setStudentSubmissionsVarargs(value: SchemaStudentSubmission*): Self = StObject.set(x, "studentSubmissions", js.Array(value*))
  }
}
