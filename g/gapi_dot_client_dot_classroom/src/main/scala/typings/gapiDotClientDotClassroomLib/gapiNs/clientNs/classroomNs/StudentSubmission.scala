package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StudentSubmission extends js.Object {
  /**
               * Absolute link to the submission in the Classroom web UI.
               *
               * Read-only.
               */
  var alternateLink: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Optional grade. If unset, no grade was set.
               * This value must be non-negative. Decimal (i.e. non-integer) values are
               * allowed, but will be rounded to two decimal places.
               *
               * This may be modified only by course teachers.
               */
  var assignedGrade: js.UndefOr[scala.Double] = js.undefined
  /**
               * Submission content when course_work_type is ASSIGNMENT.
               *
               * Students can modify this content using
               * google.classroom.Work.ModifyAttachments.
               */
  var assignmentSubmission: js.UndefOr[AssignmentSubmission] = js.undefined
  /**
               * Whether this student submission is associated with the Developer Console
               * project making the request.
               *
               * See google.classroom.Work.CreateCourseWork for more
               * details.
               *
               * Read-only.
               */
  var associatedWithDeveloper: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Identifier of the course.
               *
               * Read-only.
               */
  var courseId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Identifier for the course work this corresponds to.
               *
               * Read-only.
               */
  var courseWorkId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Type of course work this submission is for.
               *
               * Read-only.
               */
  var courseWorkType: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Creation time of this submission.
               * This may be unset if the student has not accessed this item.
               *
               * Read-only.
               */
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Optional pending grade. If unset, no grade was set.
               * This value must be non-negative. Decimal (i.e. non-integer) values are
               * allowed, but will be rounded to two decimal places.
               *
               * This is only visible to and modifiable by course teachers.
               */
  var draftGrade: js.UndefOr[scala.Double] = js.undefined
  /**
               * Classroom-assigned Identifier for the student submission.
               * This is unique among submissions for the relevant course work.
               *
               * Read-only.
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Whether this submission is late.
               *
               * Read-only.
               */
  var late: js.UndefOr[scala.Boolean] = js.undefined
  /** Submission content when course_work_type is MULTIPLE_CHOICE_QUESTION. */
  var multipleChoiceSubmission: js.UndefOr[MultipleChoiceSubmission] = js.undefined
  /** Submission content when course_work_type is SHORT_ANSWER_QUESTION. */
  var shortAnswerSubmission: js.UndefOr[ShortAnswerSubmission] = js.undefined
  /**
               * State of this submission.
               *
               * Read-only.
               */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The history of the submission (includes state and grade histories).
               *
               * Read-only.
               */
  var submissionHistory: js.UndefOr[js.Array[SubmissionHistory]] = js.undefined
  /**
               * Last update time of this submission.
               * This may be unset if the student has not accessed this item.
               *
               * Read-only.
               */
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Identifier for the student that owns this submission.
               *
               * Read-only.
               */
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

