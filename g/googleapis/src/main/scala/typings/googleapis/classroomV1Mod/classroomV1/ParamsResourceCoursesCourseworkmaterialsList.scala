package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCoursesCourseworkmaterialsList
  extends StObject
     with StandardParameters {
  
  /**
    * Identifier of the course. This identifier can be either the Classroom-assigned identifier or an alias.
    */
  var courseId: js.UndefOr[String] = js.undefined
  
  /**
    * Restriction on the work status to return. Only course work material that matches is returned. If unspecified, items with a work status of `PUBLISHED` is returned.
    */
  var courseWorkMaterialStates: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional filtering for course work material with at least one Drive material whose ID matches the provided string. If `material_link` is also specified, course work material must have materials matching both filters.
    */
  var materialDriveId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional filtering for course work material with at least one link material whose URL partially matches the provided string.
    */
  var materialLink: js.UndefOr[String] = js.undefined
  
  /**
    * Optional sort ordering for results. A comma-separated list of fields with an optional sort direction keyword. Supported field is `updateTime`. Supported direction keywords are `asc` and `desc`. If not specified, `updateTime desc` is the default behavior. Examples: `updateTime asc`, `updateTime`
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of items to return. Zero or unspecified indicates that the server may assign a maximum. The server may return fewer than the specified number of results.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * nextPageToken value returned from a previous list call, indicating that the subsequent page of results should be returned. The list request must be otherwise identical to the one that resulted in this token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceCoursesCourseworkmaterialsList {
  
  inline def apply(): ParamsResourceCoursesCourseworkmaterialsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCoursesCourseworkmaterialsList]
  }
  
  extension [Self <: ParamsResourceCoursesCourseworkmaterialsList](x: Self) {
    
    inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    inline def setCourseWorkMaterialStates(value: js.Array[String]): Self = StObject.set(x, "courseWorkMaterialStates", value.asInstanceOf[js.Any])
    
    inline def setCourseWorkMaterialStatesUndefined: Self = StObject.set(x, "courseWorkMaterialStates", js.undefined)
    
    inline def setCourseWorkMaterialStatesVarargs(value: String*): Self = StObject.set(x, "courseWorkMaterialStates", js.Array(value*))
    
    inline def setMaterialDriveId(value: String): Self = StObject.set(x, "materialDriveId", value.asInstanceOf[js.Any])
    
    inline def setMaterialDriveIdUndefined: Self = StObject.set(x, "materialDriveId", js.undefined)
    
    inline def setMaterialLink(value: String): Self = StObject.set(x, "materialLink", value.asInstanceOf[js.Any])
    
    inline def setMaterialLinkUndefined: Self = StObject.set(x, "materialLink", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
