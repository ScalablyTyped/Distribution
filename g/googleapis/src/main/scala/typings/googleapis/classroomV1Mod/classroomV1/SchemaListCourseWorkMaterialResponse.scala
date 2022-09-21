package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCourseWorkMaterialResponse extends StObject {
  
  /**
    * Course work material items that match the request.
    */
  var courseWorkMaterial: js.UndefOr[js.Array[SchemaCourseWorkMaterial]] = js.undefined
  
  /**
    * Token identifying the next page of results to return. If empty, no further results are available.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListCourseWorkMaterialResponse {
  
  inline def apply(): SchemaListCourseWorkMaterialResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCourseWorkMaterialResponse]
  }
  
  extension [Self <: SchemaListCourseWorkMaterialResponse](x: Self) {
    
    inline def setCourseWorkMaterial(value: js.Array[SchemaCourseWorkMaterial]): Self = StObject.set(x, "courseWorkMaterial", value.asInstanceOf[js.Any])
    
    inline def setCourseWorkMaterialUndefined: Self = StObject.set(x, "courseWorkMaterial", js.undefined)
    
    inline def setCourseWorkMaterialVarargs(value: SchemaCourseWorkMaterial*): Self = StObject.set(x, "courseWorkMaterial", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
