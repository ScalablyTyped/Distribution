package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response when listing student submissions.
  */
@js.native
trait SchemaListStudentSubmissionsResponse extends StObject {
  
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Student work that matches the request.
    */
  var studentSubmissions: js.UndefOr[js.Array[SchemaStudentSubmission]] = js.native
}
object SchemaListStudentSubmissionsResponse {
  
  @scala.inline
  def apply(): SchemaListStudentSubmissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListStudentSubmissionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListStudentSubmissionsResponseMutableBuilder[Self <: SchemaListStudentSubmissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setStudentSubmissions(value: js.Array[SchemaStudentSubmission]): Self = StObject.set(x, "studentSubmissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudentSubmissionsUndefined: Self = StObject.set(x, "studentSubmissions", js.undefined)
    
    @scala.inline
    def setStudentSubmissionsVarargs(value: SchemaStudentSubmission*): Self = StObject.set(x, "studentSubmissions", js.Array(value :_*))
  }
}
