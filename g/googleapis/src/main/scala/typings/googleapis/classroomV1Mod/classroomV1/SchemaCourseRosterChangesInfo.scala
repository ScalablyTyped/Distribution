package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a `Feed` with a `feed_type` of `COURSE_ROSTER_CHANGES`.
  */
trait SchemaCourseRosterChangesInfo extends StObject {
  
  /**
    * The `course_id` of the course to subscribe to roster changes for.
    */
  var courseId: js.UndefOr[String] = js.undefined
}
object SchemaCourseRosterChangesInfo {
  
  inline def apply(): SchemaCourseRosterChangesInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCourseRosterChangesInfo]
  }
  
  extension [Self <: SchemaCourseRosterChangesInfo](x: Self) {
    
    inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
  }
}
