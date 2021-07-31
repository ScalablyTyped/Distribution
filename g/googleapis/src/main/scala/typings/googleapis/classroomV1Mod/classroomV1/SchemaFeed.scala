package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A class of notifications that an application can register to receive. For
  * example: &quot;all roster changes for a domain&quot;.
  */
trait SchemaFeed extends StObject {
  
  /**
    * Information about a `Feed` with a `feed_type` of `COURSE_ROSTER_CHANGES`.
    * This field must be specified if `feed_type` is `COURSE_ROSTER_CHANGES`.
    */
  var courseRosterChangesInfo: js.UndefOr[SchemaCourseRosterChangesInfo] = js.undefined
  
  /**
    * Information about a `Feed` with a `feed_type` of `COURSE_WORK_CHANGES`.
    * This field must be specified if `feed_type` is `COURSE_WORK_CHANGES`.
    */
  var courseWorkChangesInfo: js.UndefOr[SchemaCourseWorkChangesInfo] = js.undefined
  
  /**
    * The type of feed.
    */
  var feedType: js.UndefOr[String] = js.undefined
}
object SchemaFeed {
  
  @scala.inline
  def apply(): SchemaFeed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeed]
  }
  
  @scala.inline
  implicit class SchemaFeedMutableBuilder[Self <: SchemaFeed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCourseRosterChangesInfo(value: SchemaCourseRosterChangesInfo): Self = StObject.set(x, "courseRosterChangesInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseRosterChangesInfoUndefined: Self = StObject.set(x, "courseRosterChangesInfo", js.undefined)
    
    @scala.inline
    def setCourseWorkChangesInfo(value: SchemaCourseWorkChangesInfo): Self = StObject.set(x, "courseWorkChangesInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseWorkChangesInfoUndefined: Self = StObject.set(x, "courseWorkChangesInfo", js.undefined)
    
    @scala.inline
    def setFeedType(value: String): Self = StObject.set(x, "feedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedTypeUndefined: Self = StObject.set(x, "feedType", js.undefined)
  }
}
