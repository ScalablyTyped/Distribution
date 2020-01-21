package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CourseWork extends js.Object {
  var alternateLink: js.UndefOr[String] = js.undefined
  var assigneeMode: js.UndefOr[String] = js.undefined
  var assignment: js.UndefOr[Assignment] = js.undefined
  var associatedWithDeveloper: js.UndefOr[Boolean] = js.undefined
  var courseId: js.UndefOr[String] = js.undefined
  var creationTime: js.UndefOr[String] = js.undefined
  var creatorUserId: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var dueDate: js.UndefOr[Date] = js.undefined
  var dueTime: js.UndefOr[TimeOfDay] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var individualStudentsOptions: js.UndefOr[IndividualStudentsOptions] = js.undefined
  var materials: js.UndefOr[js.Array[Material]] = js.undefined
  var maxPoints: js.UndefOr[Double] = js.undefined
  var multipleChoiceQuestion: js.UndefOr[MultipleChoiceQuestion] = js.undefined
  var scheduledTime: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var submissionModificationMode: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var updateTime: js.UndefOr[String] = js.undefined
  var workType: js.UndefOr[String] = js.undefined
}

object CourseWork {
  @scala.inline
  def apply(
    alternateLink: String = null,
    assigneeMode: String = null,
    assignment: Assignment = null,
    associatedWithDeveloper: js.UndefOr[Boolean] = js.undefined,
    courseId: String = null,
    creationTime: String = null,
    creatorUserId: String = null,
    description: String = null,
    dueDate: Date = null,
    dueTime: TimeOfDay = null,
    id: String = null,
    individualStudentsOptions: IndividualStudentsOptions = null,
    materials: js.Array[Material] = null,
    maxPoints: Int | Double = null,
    multipleChoiceQuestion: MultipleChoiceQuestion = null,
    scheduledTime: String = null,
    state: String = null,
    submissionModificationMode: String = null,
    title: String = null,
    updateTime: String = null,
    workType: String = null
  ): CourseWork = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink.asInstanceOf[js.Any])
    if (assigneeMode != null) __obj.updateDynamic("assigneeMode")(assigneeMode.asInstanceOf[js.Any])
    if (assignment != null) __obj.updateDynamic("assignment")(assignment.asInstanceOf[js.Any])
    if (!js.isUndefined(associatedWithDeveloper)) __obj.updateDynamic("associatedWithDeveloper")(associatedWithDeveloper.asInstanceOf[js.Any])
    if (courseId != null) __obj.updateDynamic("courseId")(courseId.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (creatorUserId != null) __obj.updateDynamic("creatorUserId")(creatorUserId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dueDate != null) __obj.updateDynamic("dueDate")(dueDate.asInstanceOf[js.Any])
    if (dueTime != null) __obj.updateDynamic("dueTime")(dueTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (individualStudentsOptions != null) __obj.updateDynamic("individualStudentsOptions")(individualStudentsOptions.asInstanceOf[js.Any])
    if (materials != null) __obj.updateDynamic("materials")(materials.asInstanceOf[js.Any])
    if (maxPoints != null) __obj.updateDynamic("maxPoints")(maxPoints.asInstanceOf[js.Any])
    if (multipleChoiceQuestion != null) __obj.updateDynamic("multipleChoiceQuestion")(multipleChoiceQuestion.asInstanceOf[js.Any])
    if (scheduledTime != null) __obj.updateDynamic("scheduledTime")(scheduledTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (submissionModificationMode != null) __obj.updateDynamic("submissionModificationMode")(submissionModificationMode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (workType != null) __obj.updateDynamic("workType")(workType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CourseWork]
  }
}

