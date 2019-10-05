package typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema

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
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink)
    if (assigneeMode != null) __obj.updateDynamic("assigneeMode")(assigneeMode)
    if (assignment != null) __obj.updateDynamic("assignment")(assignment)
    if (!js.isUndefined(associatedWithDeveloper)) __obj.updateDynamic("associatedWithDeveloper")(associatedWithDeveloper)
    if (courseId != null) __obj.updateDynamic("courseId")(courseId)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (creatorUserId != null) __obj.updateDynamic("creatorUserId")(creatorUserId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (dueDate != null) __obj.updateDynamic("dueDate")(dueDate)
    if (dueTime != null) __obj.updateDynamic("dueTime")(dueTime)
    if (id != null) __obj.updateDynamic("id")(id)
    if (individualStudentsOptions != null) __obj.updateDynamic("individualStudentsOptions")(individualStudentsOptions)
    if (materials != null) __obj.updateDynamic("materials")(materials)
    if (maxPoints != null) __obj.updateDynamic("maxPoints")(maxPoints.asInstanceOf[js.Any])
    if (multipleChoiceQuestion != null) __obj.updateDynamic("multipleChoiceQuestion")(multipleChoiceQuestion)
    if (scheduledTime != null) __obj.updateDynamic("scheduledTime")(scheduledTime)
    if (state != null) __obj.updateDynamic("state")(state)
    if (submissionModificationMode != null) __obj.updateDynamic("submissionModificationMode")(submissionModificationMode)
    if (title != null) __obj.updateDynamic("title")(title)
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime)
    if (workType != null) __obj.updateDynamic("workType")(workType)
    __obj.asInstanceOf[CourseWork]
  }
}

