package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Announcement created by a teacher for students of the course
  */
@js.native
trait SchemaAnnouncement extends StObject {
  
  /**
    * Absolute link to this announcement in the Classroom web UI. This is only
    * populated if `state` is `PUBLISHED`.  Read-only.
    */
  var alternateLink: js.UndefOr[String] = js.native
  
  /**
    * Assignee mode of the announcement. If unspecified, the default value is
    * `ALL_STUDENTS`.
    */
  var assigneeMode: js.UndefOr[String] = js.native
  
  /**
    * Identifier of the course.  Read-only.
    */
  var courseId: js.UndefOr[String] = js.native
  
  /**
    * Timestamp when this announcement was created.  Read-only.
    */
  var creationTime: js.UndefOr[String] = js.native
  
  /**
    * Identifier for the user that created the announcement.  Read-only.
    */
  var creatorUserId: js.UndefOr[String] = js.native
  
  /**
    * Classroom-assigned identifier of this announcement, unique per course.
    * Read-only.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifiers of students with access to the announcement. This field is
    * set only if `assigneeMode` is `INDIVIDUAL_STUDENTS`. If the
    * `assigneeMode` is `INDIVIDUAL_STUDENTS`, then only students specified in
    * this field will be able to see the announcement.
    */
  var individualStudentsOptions: js.UndefOr[SchemaIndividualStudentsOptions] = js.native
  
  /**
    * Additional materials.  Announcements must have no more than 20 material
    * items.
    */
  var materials: js.UndefOr[js.Array[SchemaMaterial]] = js.native
  
  /**
    * Optional timestamp when this announcement is scheduled to be published.
    */
  var scheduledTime: js.UndefOr[String] = js.native
  
  /**
    * Status of this announcement. If unspecified, the default state is
    * `DRAFT`.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Description of this announcement. The text must be a valid UTF-8 string
    * containing no more than 30,000 characters.
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * Timestamp of the most recent change to this announcement.  Read-only.
    */
  var updateTime: js.UndefOr[String] = js.native
}
object SchemaAnnouncement {
  
  @scala.inline
  def apply(): SchemaAnnouncement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnouncement]
  }
  
  @scala.inline
  implicit class SchemaAnnouncementMutableBuilder[Self <: SchemaAnnouncement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
    
    @scala.inline
    def setAssigneeMode(value: String): Self = StObject.set(x, "assigneeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigneeModeUndefined: Self = StObject.set(x, "assigneeMode", js.undefined)
    
    @scala.inline
    def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setCreatorUserId(value: String): Self = StObject.set(x, "creatorUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorUserIdUndefined: Self = StObject.set(x, "creatorUserId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIndividualStudentsOptions(value: SchemaIndividualStudentsOptions): Self = StObject.set(x, "individualStudentsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndividualStudentsOptionsUndefined: Self = StObject.set(x, "individualStudentsOptions", js.undefined)
    
    @scala.inline
    def setMaterials(value: js.Array[SchemaMaterial]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
    
    @scala.inline
    def setMaterialsVarargs(value: SchemaMaterial*): Self = StObject.set(x, "materials", js.Array(value :_*))
    
    @scala.inline
    def setScheduledTime(value: String): Self = StObject.set(x, "scheduledTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledTimeUndefined: Self = StObject.set(x, "scheduledTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
