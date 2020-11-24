package typings.googleAppsScript.GoogleAppsScript.Classroom.Collection

import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.Courses.CourseWork.StudentSubmissionsCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.Announcement
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseAlias
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseWork
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListAnnouncementsResponse
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListCourseAliasesResponse
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListCourseWorkResponse
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListStudentSubmissionsResponse
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListStudentsResponse
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListTeachersResponse
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ModifyAnnouncementAssigneesRequest
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ModifyAttachmentsRequest
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ModifyCourseWorkAssigneesRequest
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.Student
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.StudentSubmission
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.Teacher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GoogleAppsScript.Classroom.Collection.Courses")
@js.native
object Courses extends js.Object {
  
  @js.native
  trait AliasesCollection extends js.Object {
    
    // Creates an alias for a course.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not permitted to create the
    // alias or for access errors.
    // * `NOT_FOUND` if the course does not exist.
    // * `ALREADY_EXISTS` if the alias already exists.
    // * `FAILED_PRECONDITION` if the alias requested does not make sense for the
    //   requesting user or course (for example, if a user not in a domain
    //   attempts to access a domain-scoped alias).
    def create(resource: CourseAlias, courseId: String): CourseAlias = js.native
    
    // Returns a list of aliases for a course.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
    // course or for access errors.
    // * `NOT_FOUND` if the course does not exist.
    def list(courseId: String): ListCourseAliasesResponse = js.native
    // Returns a list of aliases for a course.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
    // course or for access errors.
    // * `NOT_FOUND` if the course does not exist.
    def list(courseId: String, optionalArgs: js.Object): ListCourseAliasesResponse = js.native
    
    // Deletes an alias of a course.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not permitted to remove the
    // alias or for access errors.
    // * `NOT_FOUND` if the alias does not exist.
    // * `FAILED_PRECONDITION` if the alias requested does not make sense for the
    //   requesting user or course (for example, if a user not in a domain
    //   attempts to delete a domain-scoped alias).
    def remove(courseId: String, alias: String): Unit = js.native
  }
  
  @js.native
  trait AnnouncementsCollection extends js.Object {
    
    // Creates an announcement.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
    // requested course, create announcements in the requested course, share a
    // Drive attachment, or for access errors.
    // * `INVALID_ARGUMENT` if the request is malformed.
    // * `NOT_FOUND` if the requested course does not exist.
    // * `FAILED_PRECONDITION` for the following request error:
    //     * AttachmentNotVisible
    def create(resource: Announcement, courseId: String): Announcement = js.native
    
    // Returns an announcement.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
    // requested course or announcement, or for access errors.
    // * `INVALID_ARGUMENT` if the request is malformed.
    // * `NOT_FOUND` if the requested course or announcement does not exist.
    def get(courseId: String, id: String): Announcement = js.native
    
    // Returns a list of announcements that the requester is permitted to view.
    // Course students may only view `PUBLISHED` announcements. Course teachers
    // and domain administrators may view all announcements.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not permitted to access
    // the requested course or for access errors.
    // * `INVALID_ARGUMENT` if the request is malformed.
    // * `NOT_FOUND` if the requested course does not exist.
    def list(courseId: String): ListAnnouncementsResponse = js.native
    // Returns a list of announcements that the requester is permitted to view.
    // Course students may only view `PUBLISHED` announcements. Course teachers
    // and domain administrators may view all announcements.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not permitted to access
    // the requested course or for access errors.
    // * `INVALID_ARGUMENT` if the request is malformed.
    // * `NOT_FOUND` if the requested course does not exist.
    def list(courseId: String, optionalArgs: js.Object): ListAnnouncementsResponse = js.native
    
    // Modifies assignee mode and options of an announcement.
    // Only a teacher of the course that contains the announcement may
    // call this method.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
    // requested course or course work or for access errors.
    // * `INVALID_ARGUMENT` if the request is malformed.
    // * `NOT_FOUND` if the requested course or course work does not exist.
    def modifyAssignees(resource: ModifyAnnouncementAssigneesRequest, courseId: String, id: String): Announcement = js.native
    
    // Updates one or more fields of an announcement.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting developer project did not create
    // the corresponding announcement or for access errors.
    // * `INVALID_ARGUMENT` if the request is malformed.
    // * `FAILED_PRECONDITION` if the requested announcement has already been
    // deleted.
    // * `NOT_FOUND` if the requested course or announcement does not exist
    def patch(resource: Announcement, courseId: String, id: String): Announcement = js.native
    // Updates one or more fields of an announcement.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting developer project did not create
    // the corresponding announcement or for access errors.
    // * `INVALID_ARGUMENT` if the request is malformed.
    // * `FAILED_PRECONDITION` if the requested announcement has already been
    // deleted.
    // * `NOT_FOUND` if the requested course or announcement does not exist
    def patch(resource: Announcement, courseId: String, id: String, optionalArgs: js.Object): Announcement = js.native
    
    // Deletes an announcement.
    // This request must be made by the Developer Console project of the
    // [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
    // create the corresponding announcement item.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting developer project did not create
    // the corresponding announcement, if the requesting user is not permitted
    // to delete the requested course or for access errors.
    // * `FAILED_PRECONDITION` if the requested announcement has already been
    // deleted.
    // * `NOT_FOUND` if no course exists with the requested ID.
    def remove(courseId: String, id: String): Unit = js.native
  }
  
  @js.native
  object CourseWork extends js.Object {
    
    @js.native
    trait StudentSubmissionsCollection extends js.Object {
      
      // Returns a student submission.
      // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
      // requested course, course work, or student submission or for
      // access errors.
      // * `INVALID_ARGUMENT` if the request is malformed.
      // * `NOT_FOUND` if the requested course, course work, or student submission
      // does not exist.
      def get(courseId: String, courseWorkId: String, id: String): StudentSubmission = js.native
      
      // Returns a list of student submissions that the requester is permitted to
      // view, factoring in the OAuth scopes of the request.
      // `-` may be specified as the `course_work_id` to include student
      // submissions for multiple course work items.
      // Course students may only view their own work. Course teachers
      // and domain administrators may view all student submissions.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
      // requested course or course work, or for access errors.
      // * `INVALID_ARGUMENT` if the request is malformed.
      // * `NOT_FOUND` if the requested course does not exist.
      def list(courseId: String, courseWorkId: String): ListStudentSubmissionsResponse = js.native
      // Returns a list of student submissions that the requester is permitted to
      // view, factoring in the OAuth scopes of the request.
      // `-` may be specified as the `course_work_id` to include student
      // submissions for multiple course work items.
      // Course students may only view their own work. Course teachers
      // and domain administrators may view all student submissions.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
      // requested course or course work, or for access errors.
      // * `INVALID_ARGUMENT` if the request is malformed.
      // * `NOT_FOUND` if the requested course does not exist.
      def list(courseId: String, courseWorkId: String, optionalArgs: js.Object): ListStudentSubmissionsResponse = js.native
      
      // Modifies attachments of student submission.
      // Attachments may only be added to student submissions belonging to course
      // work objects with a `workType` of `ASSIGNMENT`.
      // This request must be made by the Developer Console project of the
      // [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
      // create the corresponding course work item.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
      // requested course or course work, if the user is not permitted to modify
      // attachments on the requested student submission, or for
      // access errors.
      // * `INVALID_ARGUMENT` if the request is malformed.
      // * `NOT_FOUND` if the requested course, course work, or student submission
      // does not exist.
      def modifyAttachments(resource: ModifyAttachmentsRequest, courseId: String, courseWorkId: String, id: String): StudentSubmission = js.native
      
      // Updates one or more fields of a student submission.
      // See google.StudentSubmission for details
      // of which fields may be updated and who may change them.
      // This request must be made by the Developer Console project of the
      // [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
      // create the corresponding course work item.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` if the requesting developer project did not create
      // the corresponding course work, if the user is not permitted to make the
      // requested modification to the student submission, or for
      // access errors.
      // * `INVALID_ARGUMENT` if the request is malformed.
      // * `NOT_FOUND` if the requested course, course work, or student submission
      // does not exist.
      def patch(resource: StudentSubmission, courseId: String, courseWorkId: String, id: String): StudentSubmission = js.native
      // Updates one or more fields of a student submission.
      // See google.StudentSubmission for details
      // of which fields may be updated and who may change them.
      // This request must be made by the Developer Console project of the
      // [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
      // create the corresponding course work item.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` if the requesting developer project did not create
      // the corresponding course work, if the user is not permitted to make the
      // requested modification to the student submission, or for
      // access errors.
      // * `INVALID_ARGUMENT` if the request is malformed.
      // * `NOT_FOUND` if the requested course, course work, or student submission
      // does not exist.
      def patch(
        resource: StudentSubmission,
        courseId: String,
        courseWorkId: String,
        id: String,
        optionalArgs: js.Object
      ): StudentSubmission = js.native
      
      // Reclaims a student submission on behalf of the student that owns it.
      // Reclaiming a student submission transfers ownership of attached Drive
      // files to the student and updates the submission state.
      // Only the student that owns the requested student submission may call this
      // method, and only for a student submission that has been turned in.
      // This request must be made by the Developer Console project of the
      // [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
      // create the corresponding course work item.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
      // requested course or course work, unsubmit the requested student submission,
      // or for access errors.
      // * `FAILED_PRECONDITION` if the student submission has not been turned in.
      // * `INVALID_ARGUMENT` if the request is malformed.
      // * `NOT_FOUND` if the requested course, course work, or student submission
      // does not exist.
      def reclaim(resource: js.Any, courseId: String, courseWorkId: String, id: String): Unit = js.native
      
      // Returns a student submission.
      // Returning a student submission transfers ownership of attached Drive
      // files to the student and may also update the submission state.
      // Unlike the Classroom application, returning a student submission does not
      // set assignedGrade to the draftGrade value.
      // Only a teacher of the course that contains the requested student submission
      // may call this method.
      // This request must be made by the Developer Console project of the
      // [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
      // create the corresponding course work item.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
      // requested course or course work, return the requested student submission,
      // or for access errors.
      // * `INVALID_ARGUMENT` if the request is malformed.
      // * `NOT_FOUND` if the requested course, course work, or student submission
      // does not exist.
      def `return`(resource: js.Any, courseId: String, courseWorkId: String, id: String): Unit = js.native
      
      // Turns in a student submission.
      // Turning in a student submission transfers ownership of attached Drive
      // files to the teacher and may also update the submission state.
      // This may only be called by the student that owns the specified student
      // submission.
      // This request must be made by the Developer Console project of the
      // [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
      // create the corresponding course work item.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
      // requested course or course work, turn in the requested student submission,
      // or for access errors.
      // * `INVALID_ARGUMENT` if the request is malformed.
      // * `NOT_FOUND` if the requested course, course work, or student submission
      // does not exist.
      def turnIn(resource: js.Any, courseId: String, courseWorkId: String, id: String): Unit = js.native
    }
  }
  
  @js.native
  trait CourseWorkCollection extends js.Object {
    
    var StudentSubmissions: js.UndefOr[StudentSubmissionsCollection] = js.native
    
    // Creates course work.
    // The resulting course work (and corresponding student submissions) are
    // associated with the Developer Console project of the
    // [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
    // make the request. Classroom API requests to modify course work and student
    // submissions must be made with an OAuth client ID from the associated
    // Developer Console project.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
    // requested course, create course work in the requested course, share a
    // Drive attachment, or for access errors.
    // * `INVALID_ARGUMENT` if the request is malformed.
    // * `NOT_FOUND` if the requested course does not exist.
    // * `FAILED_PRECONDITION` for the following request error:
    //     * AttachmentNotVisible
    def create(resource: CourseWork, courseId: String): CourseWork = js.native
    
    // Returns course work.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
    // requested course or course work, or for access errors.
    // * `INVALID_ARGUMENT` if the request is malformed.
    // * `NOT_FOUND` if the requested course or course work does not exist.
    def get(courseId: String, id: String): CourseWork = js.native
    
    // Returns a list of course work that the requester is permitted to view.
    // Course students may only view `PUBLISHED` course work. Course teachers
    // and domain administrators may view all course work.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not permitted to access
    // the requested course or for access errors.
    // * `INVALID_ARGUMENT` if the request is malformed.
    // * `NOT_FOUND` if the requested course does not exist.
    def list(courseId: String): ListCourseWorkResponse = js.native
    // Returns a list of course work that the requester is permitted to view.
    // Course students may only view `PUBLISHED` course work. Course teachers
    // and domain administrators may view all course work.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not permitted to access
    // the requested course or for access errors.
    // * `INVALID_ARGUMENT` if the request is malformed.
    // * `NOT_FOUND` if the requested course does not exist.
    def list(courseId: String, optionalArgs: js.Object): ListCourseWorkResponse = js.native
    
    // Modifies assignee mode and options of a coursework.
    // Only a teacher of the course that contains the coursework may
    // call this method.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
    // requested course or course work or for access errors.
    // * `INVALID_ARGUMENT` if the request is malformed.
    // * `NOT_FOUND` if the requested course or course work does not exist.
    def modifyAssignees(resource: ModifyCourseWorkAssigneesRequest, courseId: String, id: String): CourseWork = js.native
    
    // Updates one or more fields of a course work.
    // See google.CourseWork for details
    // of which fields may be updated and who may change them.
    // This request must be made by the Developer Console project of the
    // [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
    // create the corresponding course work item.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting developer project did not create
    // the corresponding course work, if the user is not permitted to make the
    // requested modification to the student submission, or for
    // access errors.
    // * `INVALID_ARGUMENT` if the request is malformed.
    // * `FAILED_PRECONDITION` if the requested course work has already been
    // deleted.
    // * `NOT_FOUND` if the requested course, course work, or student submission
    // does not exist.
    def patch(resource: CourseWork, courseId: String, id: String): CourseWork = js.native
    // Updates one or more fields of a course work.
    // See google.CourseWork for details
    // of which fields may be updated and who may change them.
    // This request must be made by the Developer Console project of the
    // [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
    // create the corresponding course work item.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting developer project did not create
    // the corresponding course work, if the user is not permitted to make the
    // requested modification to the student submission, or for
    // access errors.
    // * `INVALID_ARGUMENT` if the request is malformed.
    // * `FAILED_PRECONDITION` if the requested course work has already been
    // deleted.
    // * `NOT_FOUND` if the requested course, course work, or student submission
    // does not exist.
    def patch(resource: CourseWork, courseId: String, id: String, optionalArgs: js.Object): CourseWork = js.native
    
    // Deletes a course work.
    // This request must be made by the Developer Console project of the
    // [OAuth client ID](https://support.google.com/cloud/answer/6158849) used to
    // create the corresponding course work item.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting developer project did not create
    // the corresponding course work, if the requesting user is not permitted
    // to delete the requested course or for access errors.
    // * `FAILED_PRECONDITION` if the requested course work has already been
    // deleted.
    // * `NOT_FOUND` if no course exists with the requested ID.
    def remove(courseId: String, id: String): Unit = js.native
  }
  
  @js.native
  trait StudentsCollection extends js.Object {
    
    // Adds a user as a student of a course.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not permitted to create
    // students in this course or for access errors.
    // * `NOT_FOUND` if the requested course ID does not exist.
    // * `FAILED_PRECONDITION` if the requested user's account is disabled,
    // for the following request errors:
    //     * CourseMemberLimitReached
    //     * CourseNotModifiable
    //     * UserGroupsMembershipLimitReached
    // * `ALREADY_EXISTS` if the user is already a student or teacher in the
    // course.
    def create(resource: Student, courseId: String): Student = js.native
    // Adds a user as a student of a course.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not permitted to create
    // students in this course or for access errors.
    // * `NOT_FOUND` if the requested course ID does not exist.
    // * `FAILED_PRECONDITION` if the requested user's account is disabled,
    // for the following request errors:
    //     * CourseMemberLimitReached
    //     * CourseNotModifiable
    //     * UserGroupsMembershipLimitReached
    // * `ALREADY_EXISTS` if the user is already a student or teacher in the
    // course.
    def create(resource: Student, courseId: String, optionalArgs: js.Object): Student = js.native
    
    // Returns a student of a course.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not permitted to view
    // students of this course or for access errors.
    // * `NOT_FOUND` if no student of this course has the requested ID or if the
    // course does not exist.
    def get(courseId: String, userId: String): Student = js.native
    
    // Returns a list of students of this course that the requester
    // is permitted to view.
    // This method returns the following error codes:
    // * `NOT_FOUND` if the course does not exist.
    // * `PERMISSION_DENIED` for access errors.
    def list(courseId: String): ListStudentsResponse = js.native
    // Returns a list of students of this course that the requester
    // is permitted to view.
    // This method returns the following error codes:
    // * `NOT_FOUND` if the course does not exist.
    // * `PERMISSION_DENIED` for access errors.
    def list(courseId: String, optionalArgs: js.Object): ListStudentsResponse = js.native
    
    // Deletes a student of a course.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not permitted to delete
    // students of this course or for access errors.
    // * `NOT_FOUND` if no student of this course has the requested ID or if the
    // course does not exist.
    def remove(courseId: String, userId: String): Unit = js.native
  }
  
  @js.native
  trait TeachersCollection extends js.Object {
    
    // Creates a teacher of a course.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not  permitted to create
    // teachers in this course or for access errors.
    // * `NOT_FOUND` if the requested course ID does not exist.
    // * `FAILED_PRECONDITION` if the requested user's account is disabled,
    // for the following request errors:
    //     * CourseMemberLimitReached
    //     * CourseNotModifiable
    //     * CourseTeacherLimitReached
    //     * UserGroupsMembershipLimitReached
    // * `ALREADY_EXISTS` if the user is already a teacher or student in the
    // course.
    def create(resource: Teacher, courseId: String): Teacher = js.native
    
    // Returns a teacher of a course.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not permitted to view
    // teachers of this course or for access errors.
    // * `NOT_FOUND` if no teacher of this course has the requested ID or if the
    // course does not exist.
    def get(courseId: String, userId: String): Teacher = js.native
    
    // Returns a list of teachers of this course that the requester
    // is permitted to view.
    // This method returns the following error codes:
    // * `NOT_FOUND` if the course does not exist.
    // * `PERMISSION_DENIED` for access errors.
    def list(courseId: String): ListTeachersResponse = js.native
    // Returns a list of teachers of this course that the requester
    // is permitted to view.
    // This method returns the following error codes:
    // * `NOT_FOUND` if the course does not exist.
    // * `PERMISSION_DENIED` for access errors.
    def list(courseId: String, optionalArgs: js.Object): ListTeachersResponse = js.native
    
    // Deletes a teacher of a course.
    // This method returns the following error codes:
    // * `PERMISSION_DENIED` if the requesting user is not permitted to delete
    // teachers of this course or for access errors.
    // * `NOT_FOUND` if no teacher of this course has the requested ID or if the
    // course does not exist.
    // * `FAILED_PRECONDITION` if the requested ID belongs to the primary teacher
    // of this course.
    def remove(courseId: String, userId: String): Unit = js.native
  }
}
