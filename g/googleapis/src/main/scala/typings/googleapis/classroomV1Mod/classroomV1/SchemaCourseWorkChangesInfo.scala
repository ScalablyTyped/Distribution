package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a `Feed` with a `feed_type` of `COURSE_WORK_CHANGES`.
  */
trait SchemaCourseWorkChangesInfo extends StObject {
  
  /**
    * The `course_id` of the course to subscribe to work changes for.
    */
  var courseId: js.UndefOr[String] = js.undefined
}
object SchemaCourseWorkChangesInfo {
  
  inline def apply(): SchemaCourseWorkChangesInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCourseWorkChangesInfo]
  }
  
  extension [Self <: SchemaCourseWorkChangesInfo](x: Self) {
    
    inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
  }
}
