package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTeachersResponse extends StObject {
  
  /**
    * Token identifying the next page of results to return. If empty, no further results are available.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Teachers who match the list request.
    */
  var teachers: js.UndefOr[js.Array[SchemaTeacher]] = js.undefined
}
object SchemaListTeachersResponse {
  
  inline def apply(): SchemaListTeachersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTeachersResponse]
  }
  
  extension [Self <: SchemaListTeachersResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTeachers(value: js.Array[SchemaTeacher]): Self = StObject.set(x, "teachers", value.asInstanceOf[js.Any])
    
    inline def setTeachersUndefined: Self = StObject.set(x, "teachers", js.undefined)
    
    inline def setTeachersVarargs(value: SchemaTeacher*): Self = StObject.set(x, "teachers", js.Array(value*))
  }
}
