package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a `Feed` with a `feed_type` of `COURSE_ROSTER_CHANGES`.
  */
@js.native
trait SchemaCourseRosterChangesInfo extends StObject {
  
  /**
    * The `course_id` of the course to subscribe to roster changes for.
    */
  var courseId: js.UndefOr[String] = js.native
}
object SchemaCourseRosterChangesInfo {
  
  @scala.inline
  def apply(): SchemaCourseRosterChangesInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCourseRosterChangesInfo]
  }
  
  @scala.inline
  implicit class SchemaCourseRosterChangesInfoMutableBuilder[Self <: SchemaCourseRosterChangesInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
  }
}
