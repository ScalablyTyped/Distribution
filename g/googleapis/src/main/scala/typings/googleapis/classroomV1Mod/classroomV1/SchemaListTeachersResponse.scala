package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response when listing teachers.
  */
trait SchemaListTeachersResponse extends StObject {
  
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Teachers who match the list request.
    */
  var teachers: js.UndefOr[js.Array[SchemaTeacher]] = js.undefined
}
object SchemaListTeachersResponse {
  
  @scala.inline
  def apply(): SchemaListTeachersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTeachersResponse]
  }
  
  @scala.inline
  implicit class SchemaListTeachersResponseMutableBuilder[Self <: SchemaListTeachersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTeachers(value: js.Array[SchemaTeacher]): Self = StObject.set(x, "teachers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeachersUndefined: Self = StObject.set(x, "teachers", js.undefined)
    
    @scala.inline
    def setTeachersVarargs(value: SchemaTeacher*): Self = StObject.set(x, "teachers", js.Array(value :_*))
  }
}
