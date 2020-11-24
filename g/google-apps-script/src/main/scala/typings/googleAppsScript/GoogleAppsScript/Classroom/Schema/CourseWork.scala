package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CourseWork extends js.Object {
  
  var alternateLink: js.UndefOr[String] = js.native
  
  var assigneeMode: js.UndefOr[String] = js.native
  
  var assignment: js.UndefOr[Assignment] = js.native
  
  var associatedWithDeveloper: js.UndefOr[Boolean] = js.native
  
  var courseId: js.UndefOr[String] = js.native
  
  var creationTime: js.UndefOr[String] = js.native
  
  var creatorUserId: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var dueDate: js.UndefOr[Date] = js.native
  
  var dueTime: js.UndefOr[TimeOfDay] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var individualStudentsOptions: js.UndefOr[IndividualStudentsOptions] = js.native
  
  var materials: js.UndefOr[js.Array[Material]] = js.native
  
  var maxPoints: js.UndefOr[Double] = js.native
  
  var multipleChoiceQuestion: js.UndefOr[MultipleChoiceQuestion] = js.native
  
  var scheduledTime: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[String] = js.native
  
  var submissionModificationMode: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var topicId: js.UndefOr[String] = js.native
  
  var updateTime: js.UndefOr[String] = js.native
  
  var workType: js.UndefOr[String] = js.native
}
object CourseWork {
  
  @scala.inline
  def apply(): CourseWork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CourseWork]
  }
  
  @scala.inline
  implicit class CourseWorkOps[Self <: CourseWork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlternateLink(value: String): Self = this.set("alternateLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternateLink: Self = this.set("alternateLink", js.undefined)
    
    @scala.inline
    def setAssigneeMode(value: String): Self = this.set("assigneeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssigneeMode: Self = this.set("assigneeMode", js.undefined)
    
    @scala.inline
    def setAssignment(value: Assignment): Self = this.set("assignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignment: Self = this.set("assignment", js.undefined)
    
    @scala.inline
    def setAssociatedWithDeveloper(value: Boolean): Self = this.set("associatedWithDeveloper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedWithDeveloper: Self = this.set("associatedWithDeveloper", js.undefined)
    
    @scala.inline
    def setCourseId(value: String): Self = this.set("courseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCourseId: Self = this.set("courseId", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setCreatorUserId(value: String): Self = this.set("creatorUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatorUserId: Self = this.set("creatorUserId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDueDate(value: Date): Self = this.set("dueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDueDate: Self = this.set("dueDate", js.undefined)
    
    @scala.inline
    def setDueTime(value: TimeOfDay): Self = this.set("dueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDueTime: Self = this.set("dueTime", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIndividualStudentsOptions(value: IndividualStudentsOptions): Self = this.set("individualStudentsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndividualStudentsOptions: Self = this.set("individualStudentsOptions", js.undefined)
    
    @scala.inline
    def setMaterialsVarargs(value: Material*): Self = this.set("materials", js.Array(value :_*))
    
    @scala.inline
    def setMaterials(value: js.Array[Material]): Self = this.set("materials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterials: Self = this.set("materials", js.undefined)
    
    @scala.inline
    def setMaxPoints(value: Double): Self = this.set("maxPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPoints: Self = this.set("maxPoints", js.undefined)
    
    @scala.inline
    def setMultipleChoiceQuestion(value: MultipleChoiceQuestion): Self = this.set("multipleChoiceQuestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleChoiceQuestion: Self = this.set("multipleChoiceQuestion", js.undefined)
    
    @scala.inline
    def setScheduledTime(value: String): Self = this.set("scheduledTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledTime: Self = this.set("scheduledTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setSubmissionModificationMode(value: String): Self = this.set("submissionModificationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmissionModificationMode: Self = this.set("submissionModificationMode", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTopicId(value: String): Self = this.set("topicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicId: Self = this.set("topicId", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setWorkType(value: String): Self = this.set("workType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkType: Self = this.set("workType", js.undefined)
  }
}
