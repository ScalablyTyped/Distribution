package typings.googleDashAppsDashScript.GoogleAppsScript

import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Collection.CoursesCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Collection.InvitationsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Collection.RegistrationsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Collection.UserProfilesCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.Announcement
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.Assignment
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.AssignmentSubmission
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.Attachment
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.CloudPubsubTopic
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.Course
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.CourseAlias
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.CourseMaterial
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.CourseMaterialSet
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.CourseRosterChangesInfo
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.CourseWork
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.CourseWorkChangesInfo
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.Date
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.DriveFile
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.DriveFolder
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.Feed
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.Form
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.GlobalPermission
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.GradeHistory
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.GuardianInvitation
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.IndividualStudentsOptions
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.Invitation
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.Link
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.Material
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.ModifyAnnouncementAssigneesRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.ModifyAttachmentsRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.ModifyCourseWorkAssigneesRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.ModifyIndividualStudentsOptions
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.MultipleChoiceQuestion
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.MultipleChoiceSubmission
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.Name
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.Registration
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.SharedDriveFile
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.ShortAnswerSubmission
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.StateHistory
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.Student
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.StudentSubmission
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.SubmissionHistory
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.Teacher
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.TimeOfDay
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.UserProfile
import typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema.YouTubeVideo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Classroom")
trait Classroom_ extends js.Object {
  var Courses: js.UndefOr[CoursesCollection] = js.undefined
  var Invitations: js.UndefOr[InvitationsCollection] = js.undefined
  var Registrations: js.UndefOr[RegistrationsCollection] = js.undefined
  var UserProfiles: js.UndefOr[UserProfilesCollection] = js.undefined
  // Create a new instance of Announcement
  def newAnnouncement(): Announcement
  // Create a new instance of Assignment
  def newAssignment(): Assignment
  // Create a new instance of AssignmentSubmission
  def newAssignmentSubmission(): AssignmentSubmission
  // Create a new instance of Attachment
  def newAttachment(): Attachment
  // Create a new instance of CloudPubsubTopic
  def newCloudPubsubTopic(): CloudPubsubTopic
  // Create a new instance of Course
  def newCourse(): Course
  // Create a new instance of CourseAlias
  def newCourseAlias(): CourseAlias
  // Create a new instance of CourseMaterial
  def newCourseMaterial(): CourseMaterial
  // Create a new instance of CourseMaterialSet
  def newCourseMaterialSet(): CourseMaterialSet
  // Create a new instance of CourseRosterChangesInfo
  def newCourseRosterChangesInfo(): CourseRosterChangesInfo
  // Create a new instance of CourseWork
  def newCourseWork(): CourseWork
  // Create a new instance of CourseWorkChangesInfo
  def newCourseWorkChangesInfo(): CourseWorkChangesInfo
  // Create a new instance of Date
  def newDate(): Date
  // Create a new instance of DriveFile
  def newDriveFile(): DriveFile
  // Create a new instance of DriveFolder
  def newDriveFolder(): DriveFolder
  // Create a new instance of Feed
  def newFeed(): Feed
  // Create a new instance of Form
  def newForm(): Form
  // Create a new instance of GlobalPermission
  def newGlobalPermission(): GlobalPermission
  // Create a new instance of GradeHistory
  def newGradeHistory(): GradeHistory
  // Create a new instance of GuardianInvitation
  def newGuardianInvitation(): GuardianInvitation
  // Create a new instance of IndividualStudentsOptions
  def newIndividualStudentsOptions(): IndividualStudentsOptions
  // Create a new instance of Invitation
  def newInvitation(): Invitation
  // Create a new instance of Link
  def newLink(): Link
  // Create a new instance of Material
  def newMaterial(): Material
  // Create a new instance of ModifyAnnouncementAssigneesRequest
  def newModifyAnnouncementAssigneesRequest(): ModifyAnnouncementAssigneesRequest
  // Create a new instance of ModifyAttachmentsRequest
  def newModifyAttachmentsRequest(): ModifyAttachmentsRequest
  // Create a new instance of ModifyCourseWorkAssigneesRequest
  def newModifyCourseWorkAssigneesRequest(): ModifyCourseWorkAssigneesRequest
  // Create a new instance of ModifyIndividualStudentsOptions
  def newModifyIndividualStudentsOptions(): ModifyIndividualStudentsOptions
  // Create a new instance of MultipleChoiceQuestion
  def newMultipleChoiceQuestion(): MultipleChoiceQuestion
  // Create a new instance of MultipleChoiceSubmission
  def newMultipleChoiceSubmission(): MultipleChoiceSubmission
  // Create a new instance of Name
  def newName(): Name
  // Create a new instance of ReclaimStudentSubmissionRequest
  def newReclaimStudentSubmissionRequest(): js.Any
  // Create a new instance of Registration
  def newRegistration(): Registration
  // Create a new instance of ReturnStudentSubmissionRequest
  def newReturnStudentSubmissionRequest(): js.Any
  // Create a new instance of SharedDriveFile
  def newSharedDriveFile(): SharedDriveFile
  // Create a new instance of ShortAnswerSubmission
  def newShortAnswerSubmission(): ShortAnswerSubmission
  // Create a new instance of StateHistory
  def newStateHistory(): StateHistory
  // Create a new instance of Student
  def newStudent(): Student
  // Create a new instance of StudentSubmission
  def newStudentSubmission(): StudentSubmission
  // Create a new instance of SubmissionHistory
  def newSubmissionHistory(): SubmissionHistory
  // Create a new instance of Teacher
  def newTeacher(): Teacher
  // Create a new instance of TimeOfDay
  def newTimeOfDay(): TimeOfDay
  // Create a new instance of TurnInStudentSubmissionRequest
  def newTurnInStudentSubmissionRequest(): js.Any
  // Create a new instance of UserProfile
  def newUserProfile(): UserProfile
  // Create a new instance of YouTubeVideo
  def newYouTubeVideo(): YouTubeVideo
}

object Classroom_ {
  @scala.inline
  def apply(
    newAnnouncement: () => Announcement,
    newAssignment: () => Assignment,
    newAssignmentSubmission: () => AssignmentSubmission,
    newAttachment: () => Attachment,
    newCloudPubsubTopic: () => CloudPubsubTopic,
    newCourse: () => Course,
    newCourseAlias: () => CourseAlias,
    newCourseMaterial: () => CourseMaterial,
    newCourseMaterialSet: () => CourseMaterialSet,
    newCourseRosterChangesInfo: () => CourseRosterChangesInfo,
    newCourseWork: () => CourseWork,
    newCourseWorkChangesInfo: () => CourseWorkChangesInfo,
    newDate: () => Date,
    newDriveFile: () => DriveFile,
    newDriveFolder: () => DriveFolder,
    newFeed: () => Feed,
    newForm: () => Form,
    newGlobalPermission: () => GlobalPermission,
    newGradeHistory: () => GradeHistory,
    newGuardianInvitation: () => GuardianInvitation,
    newIndividualStudentsOptions: () => IndividualStudentsOptions,
    newInvitation: () => Invitation,
    newLink: () => Link,
    newMaterial: () => Material,
    newModifyAnnouncementAssigneesRequest: () => ModifyAnnouncementAssigneesRequest,
    newModifyAttachmentsRequest: () => ModifyAttachmentsRequest,
    newModifyCourseWorkAssigneesRequest: () => ModifyCourseWorkAssigneesRequest,
    newModifyIndividualStudentsOptions: () => ModifyIndividualStudentsOptions,
    newMultipleChoiceQuestion: () => MultipleChoiceQuestion,
    newMultipleChoiceSubmission: () => MultipleChoiceSubmission,
    newName: () => Name,
    newReclaimStudentSubmissionRequest: () => js.Any,
    newRegistration: () => Registration,
    newReturnStudentSubmissionRequest: () => js.Any,
    newSharedDriveFile: () => SharedDriveFile,
    newShortAnswerSubmission: () => ShortAnswerSubmission,
    newStateHistory: () => StateHistory,
    newStudent: () => Student,
    newStudentSubmission: () => StudentSubmission,
    newSubmissionHistory: () => SubmissionHistory,
    newTeacher: () => Teacher,
    newTimeOfDay: () => TimeOfDay,
    newTurnInStudentSubmissionRequest: () => js.Any,
    newUserProfile: () => UserProfile,
    newYouTubeVideo: () => YouTubeVideo,
    Courses: CoursesCollection = null,
    Invitations: InvitationsCollection = null,
    Registrations: RegistrationsCollection = null,
    UserProfiles: UserProfilesCollection = null
  ): Classroom_ = {
    val __obj = js.Dynamic.literal(newAnnouncement = js.Any.fromFunction0(newAnnouncement), newAssignment = js.Any.fromFunction0(newAssignment), newAssignmentSubmission = js.Any.fromFunction0(newAssignmentSubmission), newAttachment = js.Any.fromFunction0(newAttachment), newCloudPubsubTopic = js.Any.fromFunction0(newCloudPubsubTopic), newCourse = js.Any.fromFunction0(newCourse), newCourseAlias = js.Any.fromFunction0(newCourseAlias), newCourseMaterial = js.Any.fromFunction0(newCourseMaterial), newCourseMaterialSet = js.Any.fromFunction0(newCourseMaterialSet), newCourseRosterChangesInfo = js.Any.fromFunction0(newCourseRosterChangesInfo), newCourseWork = js.Any.fromFunction0(newCourseWork), newCourseWorkChangesInfo = js.Any.fromFunction0(newCourseWorkChangesInfo), newDate = js.Any.fromFunction0(newDate), newDriveFile = js.Any.fromFunction0(newDriveFile), newDriveFolder = js.Any.fromFunction0(newDriveFolder), newFeed = js.Any.fromFunction0(newFeed), newForm = js.Any.fromFunction0(newForm), newGlobalPermission = js.Any.fromFunction0(newGlobalPermission), newGradeHistory = js.Any.fromFunction0(newGradeHistory), newGuardianInvitation = js.Any.fromFunction0(newGuardianInvitation), newIndividualStudentsOptions = js.Any.fromFunction0(newIndividualStudentsOptions), newInvitation = js.Any.fromFunction0(newInvitation), newLink = js.Any.fromFunction0(newLink), newMaterial = js.Any.fromFunction0(newMaterial), newModifyAnnouncementAssigneesRequest = js.Any.fromFunction0(newModifyAnnouncementAssigneesRequest), newModifyAttachmentsRequest = js.Any.fromFunction0(newModifyAttachmentsRequest), newModifyCourseWorkAssigneesRequest = js.Any.fromFunction0(newModifyCourseWorkAssigneesRequest), newModifyIndividualStudentsOptions = js.Any.fromFunction0(newModifyIndividualStudentsOptions), newMultipleChoiceQuestion = js.Any.fromFunction0(newMultipleChoiceQuestion), newMultipleChoiceSubmission = js.Any.fromFunction0(newMultipleChoiceSubmission), newName = js.Any.fromFunction0(newName), newReclaimStudentSubmissionRequest = js.Any.fromFunction0(newReclaimStudentSubmissionRequest), newRegistration = js.Any.fromFunction0(newRegistration), newReturnStudentSubmissionRequest = js.Any.fromFunction0(newReturnStudentSubmissionRequest), newSharedDriveFile = js.Any.fromFunction0(newSharedDriveFile), newShortAnswerSubmission = js.Any.fromFunction0(newShortAnswerSubmission), newStateHistory = js.Any.fromFunction0(newStateHistory), newStudent = js.Any.fromFunction0(newStudent), newStudentSubmission = js.Any.fromFunction0(newStudentSubmission), newSubmissionHistory = js.Any.fromFunction0(newSubmissionHistory), newTeacher = js.Any.fromFunction0(newTeacher), newTimeOfDay = js.Any.fromFunction0(newTimeOfDay), newTurnInStudentSubmissionRequest = js.Any.fromFunction0(newTurnInStudentSubmissionRequest), newUserProfile = js.Any.fromFunction0(newUserProfile), newYouTubeVideo = js.Any.fromFunction0(newYouTubeVideo))
    if (Courses != null) __obj.updateDynamic("Courses")(Courses.asInstanceOf[js.Any])
    if (Invitations != null) __obj.updateDynamic("Invitations")(Invitations.asInstanceOf[js.Any])
    if (Registrations != null) __obj.updateDynamic("Registrations")(Registrations.asInstanceOf[js.Any])
    if (UserProfiles != null) __obj.updateDynamic("UserProfiles")(UserProfiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classroom_]
  }
}

