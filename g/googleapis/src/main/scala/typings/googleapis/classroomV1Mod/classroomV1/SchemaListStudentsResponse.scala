package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response when listing students.
  */
@js.native
trait SchemaListStudentsResponse extends StObject {
  
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Students who match the list request.
    */
  var students: js.UndefOr[js.Array[SchemaStudent]] = js.native
}
object SchemaListStudentsResponse {
  
  @scala.inline
  def apply(): SchemaListStudentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListStudentsResponse]
  }
  
  @scala.inline
  implicit class SchemaListStudentsResponseMutableBuilder[Self <: SchemaListStudentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setStudents(value: js.Array[SchemaStudent]): Self = StObject.set(x, "students", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudentsUndefined: Self = StObject.set(x, "students", js.undefined)
    
    @scala.inline
    def setStudentsVarargs(value: SchemaStudent*): Self = StObject.set(x, "students", js.Array(value :_*))
  }
}
