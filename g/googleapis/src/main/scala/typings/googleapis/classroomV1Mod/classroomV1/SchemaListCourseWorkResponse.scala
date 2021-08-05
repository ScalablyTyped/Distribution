package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response when listing course work.
  */
trait SchemaListCourseWorkResponse extends StObject {
  
  /**
    * Course work items that match the request.
    */
  var courseWork: js.UndefOr[js.Array[SchemaCourseWork]] = js.undefined
  
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListCourseWorkResponse {
  
  inline def apply(): SchemaListCourseWorkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCourseWorkResponse]
  }
  
  extension [Self <: SchemaListCourseWorkResponse](x: Self) {
    
    inline def setCourseWork(value: js.Array[SchemaCourseWork]): Self = StObject.set(x, "courseWork", value.asInstanceOf[js.Any])
    
    inline def setCourseWorkUndefined: Self = StObject.set(x, "courseWork", js.undefined)
    
    inline def setCourseWorkVarargs(value: SchemaCourseWork*): Self = StObject.set(x, "courseWork", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
