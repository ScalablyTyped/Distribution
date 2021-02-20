package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.Courses.AliasesCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.Courses.AnnouncementsCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.Courses.CourseWork.StudentSubmissionsCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.Courses.CourseWorkCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.Courses.StudentsCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.Courses.TeachersCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.CoursesCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.InvitationsCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.RegistrationsCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.UserProfiles.GuardianInvitationsCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.UserProfiles.GuardiansCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Collection.UserProfilesCollection
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.Announcement
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.Assignment
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.AssignmentSubmission
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.Attachment
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.CloudPubsubTopic
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.Course
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseAlias
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseMaterial
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseMaterialSet
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseRosterChangesInfo
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseWork
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.CourseWorkChangesInfo
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.Date
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.DriveFile
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.DriveFolder
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.Feed
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.Form
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.GlobalPermission
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.GradeHistory
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.Guardian
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.GuardianInvitation
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.IndividualStudentsOptions
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.Invitation
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.Link
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListAnnouncementsResponse
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListCourseAliasesResponse
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListCourseWorkResponse
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListCoursesResponse
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListGuardianInvitationsResponse
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListGuardiansResponse
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListInvitationsResponse
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListStudentSubmissionsResponse
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListStudentsResponse
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ListTeachersResponse
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.Material
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ModifyAnnouncementAssigneesRequest
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ModifyAttachmentsRequest
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ModifyCourseWorkAssigneesRequest
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ModifyIndividualStudentsOptions
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.MultipleChoiceQuestion
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.MultipleChoiceSubmission
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.Name
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.Registration
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.SharedDriveFile
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.ShortAnswerSubmission
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.StateHistory
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.Student
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.StudentSubmission
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.SubmissionHistory
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.Teacher
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.TimeOfDay
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.UserProfile
import typings.googleAppsScript.GoogleAppsScript.Classroom.Schema.YouTubeVideo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Classroom extends StObject {
  
  var Courses: js.UndefOr[CoursesCollection] = js.native
  
  var Invitations: js.UndefOr[InvitationsCollection] = js.native
  
  var Registrations: js.UndefOr[RegistrationsCollection] = js.native
  
  var UserProfiles: js.UndefOr[UserProfilesCollection] = js.native
  
  // Create a new instance of Announcement
  def newAnnouncement(): Announcement = js.native
  
  // Create a new instance of Assignment
  def newAssignment(): Assignment = js.native
  
  // Create a new instance of AssignmentSubmission
  def newAssignmentSubmission(): AssignmentSubmission = js.native
  
  // Create a new instance of Attachment
  def newAttachment(): Attachment = js.native
  
  // Create a new instance of CloudPubsubTopic
  def newCloudPubsubTopic(): CloudPubsubTopic = js.native
  
  // Create a new instance of Course
  def newCourse(): Course = js.native
  
  // Create a new instance of CourseAlias
  def newCourseAlias(): CourseAlias = js.native
  
  // Create a new instance of CourseMaterial
  def newCourseMaterial(): CourseMaterial = js.native
  
  // Create a new instance of CourseMaterialSet
  def newCourseMaterialSet(): CourseMaterialSet = js.native
  
  // Create a new instance of CourseRosterChangesInfo
  def newCourseRosterChangesInfo(): CourseRosterChangesInfo = js.native
  
  // Create a new instance of CourseWork
  def newCourseWork(): CourseWork = js.native
  
  // Create a new instance of CourseWorkChangesInfo
  def newCourseWorkChangesInfo(): CourseWorkChangesInfo = js.native
  
  // Create a new instance of Date
  def newDate(): Date = js.native
  
  // Create a new instance of DriveFile
  def newDriveFile(): DriveFile = js.native
  
  // Create a new instance of DriveFolder
  def newDriveFolder(): DriveFolder = js.native
  
  // Create a new instance of Feed
  def newFeed(): Feed = js.native
  
  // Create a new instance of Form
  def newForm(): Form = js.native
  
  // Create a new instance of GlobalPermission
  def newGlobalPermission(): GlobalPermission = js.native
  
  // Create a new instance of GradeHistory
  def newGradeHistory(): GradeHistory = js.native
  
  // Create a new instance of GuardianInvitation
  def newGuardianInvitation(): GuardianInvitation = js.native
  
  // Create a new instance of IndividualStudentsOptions
  def newIndividualStudentsOptions(): IndividualStudentsOptions = js.native
  
  // Create a new instance of Invitation
  def newInvitation(): Invitation = js.native
  
  // Create a new instance of Link
  def newLink(): Link = js.native
  
  // Create a new instance of Material
  def newMaterial(): Material = js.native
  
  // Create a new instance of ModifyAnnouncementAssigneesRequest
  def newModifyAnnouncementAssigneesRequest(): ModifyAnnouncementAssigneesRequest = js.native
  
  // Create a new instance of ModifyAttachmentsRequest
  def newModifyAttachmentsRequest(): ModifyAttachmentsRequest = js.native
  
  // Create a new instance of ModifyCourseWorkAssigneesRequest
  def newModifyCourseWorkAssigneesRequest(): ModifyCourseWorkAssigneesRequest = js.native
  
  // Create a new instance of ModifyIndividualStudentsOptions
  def newModifyIndividualStudentsOptions(): ModifyIndividualStudentsOptions = js.native
  
  // Create a new instance of MultipleChoiceQuestion
  def newMultipleChoiceQuestion(): MultipleChoiceQuestion = js.native
  
  // Create a new instance of MultipleChoiceSubmission
  def newMultipleChoiceSubmission(): MultipleChoiceSubmission = js.native
  
  // Create a new instance of Name
  def newName(): Name = js.native
  
  // Create a new instance of ReclaimStudentSubmissionRequest
  def newReclaimStudentSubmissionRequest(): js.Any = js.native
  
  // Create a new instance of Registration
  def newRegistration(): Registration = js.native
  
  // Create a new instance of ReturnStudentSubmissionRequest
  def newReturnStudentSubmissionRequest(): js.Any = js.native
  
  // Create a new instance of SharedDriveFile
  def newSharedDriveFile(): SharedDriveFile = js.native
  
  // Create a new instance of ShortAnswerSubmission
  def newShortAnswerSubmission(): ShortAnswerSubmission = js.native
  
  // Create a new instance of StateHistory
  def newStateHistory(): StateHistory = js.native
  
  // Create a new instance of Student
  def newStudent(): Student = js.native
  
  // Create a new instance of StudentSubmission
  def newStudentSubmission(): StudentSubmission = js.native
  
  // Create a new instance of SubmissionHistory
  def newSubmissionHistory(): SubmissionHistory = js.native
  
  // Create a new instance of Teacher
  def newTeacher(): Teacher = js.native
  
  // Create a new instance of TimeOfDay
  def newTimeOfDay(): TimeOfDay = js.native
  
  // Create a new instance of TurnInStudentSubmissionRequest
  def newTurnInStudentSubmissionRequest(): js.Any = js.native
  
  // Create a new instance of UserProfile
  def newUserProfile(): UserProfile = js.native
  
  // Create a new instance of YouTubeVideo
  def newYouTubeVideo(): YouTubeVideo = js.native
}
object Classroom {
  
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
    newYouTubeVideo: () => YouTubeVideo
  ): Classroom = {
    val __obj = js.Dynamic.literal(newAnnouncement = js.Any.fromFunction0(newAnnouncement), newAssignment = js.Any.fromFunction0(newAssignment), newAssignmentSubmission = js.Any.fromFunction0(newAssignmentSubmission), newAttachment = js.Any.fromFunction0(newAttachment), newCloudPubsubTopic = js.Any.fromFunction0(newCloudPubsubTopic), newCourse = js.Any.fromFunction0(newCourse), newCourseAlias = js.Any.fromFunction0(newCourseAlias), newCourseMaterial = js.Any.fromFunction0(newCourseMaterial), newCourseMaterialSet = js.Any.fromFunction0(newCourseMaterialSet), newCourseRosterChangesInfo = js.Any.fromFunction0(newCourseRosterChangesInfo), newCourseWork = js.Any.fromFunction0(newCourseWork), newCourseWorkChangesInfo = js.Any.fromFunction0(newCourseWorkChangesInfo), newDate = js.Any.fromFunction0(newDate), newDriveFile = js.Any.fromFunction0(newDriveFile), newDriveFolder = js.Any.fromFunction0(newDriveFolder), newFeed = js.Any.fromFunction0(newFeed), newForm = js.Any.fromFunction0(newForm), newGlobalPermission = js.Any.fromFunction0(newGlobalPermission), newGradeHistory = js.Any.fromFunction0(newGradeHistory), newGuardianInvitation = js.Any.fromFunction0(newGuardianInvitation), newIndividualStudentsOptions = js.Any.fromFunction0(newIndividualStudentsOptions), newInvitation = js.Any.fromFunction0(newInvitation), newLink = js.Any.fromFunction0(newLink), newMaterial = js.Any.fromFunction0(newMaterial), newModifyAnnouncementAssigneesRequest = js.Any.fromFunction0(newModifyAnnouncementAssigneesRequest), newModifyAttachmentsRequest = js.Any.fromFunction0(newModifyAttachmentsRequest), newModifyCourseWorkAssigneesRequest = js.Any.fromFunction0(newModifyCourseWorkAssigneesRequest), newModifyIndividualStudentsOptions = js.Any.fromFunction0(newModifyIndividualStudentsOptions), newMultipleChoiceQuestion = js.Any.fromFunction0(newMultipleChoiceQuestion), newMultipleChoiceSubmission = js.Any.fromFunction0(newMultipleChoiceSubmission), newName = js.Any.fromFunction0(newName), newReclaimStudentSubmissionRequest = js.Any.fromFunction0(newReclaimStudentSubmissionRequest), newRegistration = js.Any.fromFunction0(newRegistration), newReturnStudentSubmissionRequest = js.Any.fromFunction0(newReturnStudentSubmissionRequest), newSharedDriveFile = js.Any.fromFunction0(newSharedDriveFile), newShortAnswerSubmission = js.Any.fromFunction0(newShortAnswerSubmission), newStateHistory = js.Any.fromFunction0(newStateHistory), newStudent = js.Any.fromFunction0(newStudent), newStudentSubmission = js.Any.fromFunction0(newStudentSubmission), newSubmissionHistory = js.Any.fromFunction0(newSubmissionHistory), newTeacher = js.Any.fromFunction0(newTeacher), newTimeOfDay = js.Any.fromFunction0(newTimeOfDay), newTurnInStudentSubmissionRequest = js.Any.fromFunction0(newTurnInStudentSubmissionRequest), newUserProfile = js.Any.fromFunction0(newUserProfile), newYouTubeVideo = js.Any.fromFunction0(newYouTubeVideo))
    __obj.asInstanceOf[Classroom]
  }
  
  @scala.inline
  implicit class ClassroomMutableBuilder[Self <: Classroom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCourses(value: CoursesCollection): Self = StObject.set(x, "Courses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoursesUndefined: Self = StObject.set(x, "Courses", js.undefined)
    
    @scala.inline
    def setInvitations(value: InvitationsCollection): Self = StObject.set(x, "Invitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitationsUndefined: Self = StObject.set(x, "Invitations", js.undefined)
    
    @scala.inline
    def setNewAnnouncement(value: () => Announcement): Self = StObject.set(x, "newAnnouncement", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAssignment(value: () => Assignment): Self = StObject.set(x, "newAssignment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAssignmentSubmission(value: () => AssignmentSubmission): Self = StObject.set(x, "newAssignmentSubmission", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAttachment(value: () => Attachment): Self = StObject.set(x, "newAttachment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCloudPubsubTopic(value: () => CloudPubsubTopic): Self = StObject.set(x, "newCloudPubsubTopic", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCourse(value: () => Course): Self = StObject.set(x, "newCourse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCourseAlias(value: () => CourseAlias): Self = StObject.set(x, "newCourseAlias", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCourseMaterial(value: () => CourseMaterial): Self = StObject.set(x, "newCourseMaterial", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCourseMaterialSet(value: () => CourseMaterialSet): Self = StObject.set(x, "newCourseMaterialSet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCourseRosterChangesInfo(value: () => CourseRosterChangesInfo): Self = StObject.set(x, "newCourseRosterChangesInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCourseWork(value: () => CourseWork): Self = StObject.set(x, "newCourseWork", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCourseWorkChangesInfo(value: () => CourseWorkChangesInfo): Self = StObject.set(x, "newCourseWorkChangesInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDate(value: () => Date): Self = StObject.set(x, "newDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDriveFile(value: () => DriveFile): Self = StObject.set(x, "newDriveFile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDriveFolder(value: () => DriveFolder): Self = StObject.set(x, "newDriveFolder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFeed(value: () => Feed): Self = StObject.set(x, "newFeed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewForm(value: () => Form): Self = StObject.set(x, "newForm", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGlobalPermission(value: () => GlobalPermission): Self = StObject.set(x, "newGlobalPermission", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGradeHistory(value: () => GradeHistory): Self = StObject.set(x, "newGradeHistory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGuardianInvitation(value: () => GuardianInvitation): Self = StObject.set(x, "newGuardianInvitation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewIndividualStudentsOptions(value: () => IndividualStudentsOptions): Self = StObject.set(x, "newIndividualStudentsOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewInvitation(value: () => Invitation): Self = StObject.set(x, "newInvitation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewLink(value: () => Link): Self = StObject.set(x, "newLink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewMaterial(value: () => Material): Self = StObject.set(x, "newMaterial", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewModifyAnnouncementAssigneesRequest(value: () => ModifyAnnouncementAssigneesRequest): Self = StObject.set(x, "newModifyAnnouncementAssigneesRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewModifyAttachmentsRequest(value: () => ModifyAttachmentsRequest): Self = StObject.set(x, "newModifyAttachmentsRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewModifyCourseWorkAssigneesRequest(value: () => ModifyCourseWorkAssigneesRequest): Self = StObject.set(x, "newModifyCourseWorkAssigneesRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewModifyIndividualStudentsOptions(value: () => ModifyIndividualStudentsOptions): Self = StObject.set(x, "newModifyIndividualStudentsOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewMultipleChoiceQuestion(value: () => MultipleChoiceQuestion): Self = StObject.set(x, "newMultipleChoiceQuestion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewMultipleChoiceSubmission(value: () => MultipleChoiceSubmission): Self = StObject.set(x, "newMultipleChoiceSubmission", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewName(value: () => Name): Self = StObject.set(x, "newName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewReclaimStudentSubmissionRequest(value: () => js.Any): Self = StObject.set(x, "newReclaimStudentSubmissionRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRegistration(value: () => Registration): Self = StObject.set(x, "newRegistration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewReturnStudentSubmissionRequest(value: () => js.Any): Self = StObject.set(x, "newReturnStudentSubmissionRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSharedDriveFile(value: () => SharedDriveFile): Self = StObject.set(x, "newSharedDriveFile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewShortAnswerSubmission(value: () => ShortAnswerSubmission): Self = StObject.set(x, "newShortAnswerSubmission", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewStateHistory(value: () => StateHistory): Self = StObject.set(x, "newStateHistory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewStudent(value: () => Student): Self = StObject.set(x, "newStudent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewStudentSubmission(value: () => StudentSubmission): Self = StObject.set(x, "newStudentSubmission", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewSubmissionHistory(value: () => SubmissionHistory): Self = StObject.set(x, "newSubmissionHistory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTeacher(value: () => Teacher): Self = StObject.set(x, "newTeacher", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTimeOfDay(value: () => TimeOfDay): Self = StObject.set(x, "newTimeOfDay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTurnInStudentSubmissionRequest(value: () => js.Any): Self = StObject.set(x, "newTurnInStudentSubmissionRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUserProfile(value: () => UserProfile): Self = StObject.set(x, "newUserProfile", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewYouTubeVideo(value: () => YouTubeVideo): Self = StObject.set(x, "newYouTubeVideo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegistrations(value: RegistrationsCollection): Self = StObject.set(x, "Registrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationsUndefined: Self = StObject.set(x, "Registrations", js.undefined)
    
    @scala.inline
    def setUserProfiles(value: UserProfilesCollection): Self = StObject.set(x, "UserProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfilesUndefined: Self = StObject.set(x, "UserProfiles", js.undefined)
  }
  
  object Collection {
    
    object Courses {
      
      @js.native
      trait AliasesCollection extends StObject {
        
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
      trait AnnouncementsCollection extends StObject {
        
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
      
      object CourseWork {
        
        @js.native
        trait StudentSubmissionsCollection extends StObject {
          
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
      trait CourseWorkCollection extends StObject {
        
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
      trait StudentsCollection extends StObject {
        
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
      trait TeachersCollection extends StObject {
        
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
    
    @js.native
    trait CoursesCollection extends StObject {
      
      var Aliases: js.UndefOr[AliasesCollection] = js.native
      
      var Announcements: js.UndefOr[AnnouncementsCollection] = js.native
      
      var CourseWork: js.UndefOr[CourseWorkCollection] = js.native
      
      var Students: js.UndefOr[StudentsCollection] = js.native
      
      var Teachers: js.UndefOr[TeachersCollection] = js.native
      
      // Creates a course.
      // The user specified in `ownerId` is the owner of the created course
      // and added as a teacher.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` if the requesting user is not permitted to create
      // courses or for access errors.
      // * `NOT_FOUND` if the primary teacher is not a valid user.
      // * `FAILED_PRECONDITION` if the course owner's account is disabled or for
      // the following request errors:
      //     * UserGroupsMembershipLimitReached
      // * `ALREADY_EXISTS` if an alias was specified in the `id` and
      // already exists.
      def create(resource: Course): Course = js.native
      
      // Returns a course.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` if the requesting user is not permitted to access the
      // requested course or for access errors.
      // * `NOT_FOUND` if no course exists with the requested ID.
      def get(id: String): Course = js.native
      
      // Returns a list of courses that the requesting user is permitted to view,
      // restricted to those that match the request. Returned courses are ordered by
      // creation time, with the most recently created coming first.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` for access errors.
      // * `INVALID_ARGUMENT` if the query argument is malformed.
      // * `NOT_FOUND` if any users specified in the query arguments do not exist.
      def list(): ListCoursesResponse = js.native
      // Returns a list of courses that the requesting user is permitted to view,
      // restricted to those that match the request. Returned courses are ordered by
      // creation time, with the most recently created coming first.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` for access errors.
      // * `INVALID_ARGUMENT` if the query argument is malformed.
      // * `NOT_FOUND` if any users specified in the query arguments do not exist.
      def list(optionalArgs: js.Object): ListCoursesResponse = js.native
      
      // Updates one or more fields in a course.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` if the requesting user is not permitted to modify the
      // requested course or for access errors.
      // * `NOT_FOUND` if no course exists with the requested ID.
      // * `INVALID_ARGUMENT` if invalid fields are specified in the update mask or
      // if no update mask is supplied.
      // * `FAILED_PRECONDITION` for the following request errors:
      //     * CourseNotModifiable
      def patch(resource: Course, id: String): Course = js.native
      // Updates one or more fields in a course.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` if the requesting user is not permitted to modify the
      // requested course or for access errors.
      // * `NOT_FOUND` if no course exists with the requested ID.
      // * `INVALID_ARGUMENT` if invalid fields are specified in the update mask or
      // if no update mask is supplied.
      // * `FAILED_PRECONDITION` for the following request errors:
      //     * CourseNotModifiable
      def patch(resource: Course, id: String, optionalArgs: js.Object): Course = js.native
      
      // Deletes a course.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` if the requesting user is not permitted to delete the
      // requested course or for access errors.
      // * `NOT_FOUND` if no course exists with the requested ID.
      def remove(id: String): Unit = js.native
      
      // Updates a course.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` if the requesting user is not permitted to modify the
      // requested course or for access errors.
      // * `NOT_FOUND` if no course exists with the requested ID.
      // * `FAILED_PRECONDITION` for the following request errors:
      //     * CourseNotModifiable
      def update(resource: Course, id: String): Course = js.native
    }
    
    @js.native
    trait InvitationsCollection extends StObject {
      
      // Accepts an invitation, removing it and adding the invited user to the
      // teachers or students (as appropriate) of the specified course. Only the
      // invited user may accept an invitation.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` if the requesting user is not permitted to accept the
      // requested invitation or for access errors.
      // * `FAILED_PRECONDITION` for the following request errors:
      //     * CourseMemberLimitReached
      //     * CourseNotModifiable
      //     * CourseTeacherLimitReached
      //     * UserGroupsMembershipLimitReached
      // * `NOT_FOUND` if no invitation exists with the requested ID.
      def accept(id: String): Unit = js.native
      
      // Creates an invitation. Only one invitation for a user and course may exist
      // at a time. Delete and re-create an invitation to make changes.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` if the requesting user is not permitted to create
      // invitations for this course or for access errors.
      // * `NOT_FOUND` if the course or the user does not exist.
      // * `FAILED_PRECONDITION` if the requested user's account is disabled or if
      // the user already has this role or a role with greater permissions.
      // * `ALREADY_EXISTS` if an invitation for the specified user and course
      // already exists.
      def create(resource: Invitation): Invitation = js.native
      
      // Returns an invitation.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` if the requesting user is not permitted to view the
      // requested invitation or for access errors.
      // * `NOT_FOUND` if no invitation exists with the requested ID.
      def get(id: String): Invitation = js.native
      
      // Returns a list of invitations that the requesting user is permitted to
      // view, restricted to those that match the list request.
      // *Note:* At least one of `user_id` or `course_id` must be supplied. Both
      // fields can be supplied.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` for access errors.
      def list(): ListInvitationsResponse = js.native
      // Returns a list of invitations that the requesting user is permitted to
      // view, restricted to those that match the list request.
      // *Note:* At least one of `user_id` or `course_id` must be supplied. Both
      // fields can be supplied.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` for access errors.
      def list(optionalArgs: js.Object): ListInvitationsResponse = js.native
      
      // Deletes an invitation.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` if the requesting user is not permitted to delete the
      // requested invitation or for access errors.
      // * `NOT_FOUND` if no invitation exists with the requested ID.
      def remove(id: String): Unit = js.native
    }
    
    @js.native
    trait RegistrationsCollection extends StObject {
      
      // Creates a `Registration`, causing Classroom to start sending notifications
      // from the provided `feed` to the destination provided in `cloudPubSubTopic`.
      // Returns the created `Registration`. Currently, this will be the same as
      // the argument, but with server-assigned fields such as `expiry_time` and
      // `id` filled in.
      // Note that any value specified for the `expiry_time` or `id` fields will be
      // ignored.
      // While Classroom may validate the `cloudPubSubTopic` and return errors on a
      // best effort basis, it is the caller's responsibility to ensure that it
      // exists and that Classroom has permission to publish to it.
      // This method may return the following error codes:
      // * `PERMISSION_DENIED` if:
      //     * the authenticated user does not have permission to receive
      //       notifications from the requested field; or
      //     * the credential provided does not include the appropriate scope for
      //       the requested feed.
      //     * another access error is encountered.
      // * `INVALID_ARGUMENT` if:
      //     * no `cloudPubsubTopic` is specified, or the specified
      //       `cloudPubsubTopic` is not valid; or
      //     * no `feed` is specified, or the specified `feed` is not valid.
      // * `NOT_FOUND` if:
      //     * the specified `feed` cannot be located, or the requesting user does
      //       not have permission to determine whether or not it exists; or
      //     * the specified `cloudPubsubTopic` cannot be located, or Classroom has
      //       not been granted permission to publish to it.
      def create(resource: Registration): Registration = js.native
      
      // Deletes a `Registration`, causing Classroom to stop sending notifications
      // for that `Registration`.
      def remove(registrationId: String): Unit = js.native
    }
    object RegistrationsCollection {
      
      @scala.inline
      def apply(create: Registration => Registration, remove: String => Unit): RegistrationsCollection = {
        val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), remove = js.Any.fromFunction1(remove))
        __obj.asInstanceOf[RegistrationsCollection]
      }
      
      @scala.inline
      implicit class RegistrationsCollectionMutableBuilder[Self <: RegistrationsCollection] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreate(value: Registration => Registration): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      }
    }
    
    object UserProfiles {
      
      @js.native
      trait GuardianInvitationsCollection extends StObject {
        
        // Creates a guardian invitation, and sends an email to the guardian asking
        // them to confirm that they are the student's guardian.
        // Once the guardian accepts the invitation, their `state` will change to
        // `COMPLETED` and they will start receiving guardian notifications. A
        // `Guardian` resource will also be created to represent the active guardian.
        // The request object must have the `student_id` and
        // `invited_email_address` fields set. Failing to set these fields, or
        // setting any other fields in the request, will result in an error.
        // This method returns the following error codes:
        // * `PERMISSION_DENIED` if the current user does not have permission to
        //   manage guardians, if the guardian in question has already rejected
        //   too many requests for that student, if guardians are not enabled for the
        //   domain in question, or for other access errors.
        // * `RESOURCE_EXHAUSTED` if the student or guardian has exceeded the guardian
        //   link limit.
        // * `INVALID_ARGUMENT` if the guardian email address is not valid (for
        //   example, if it is too long), or if the format of the student ID provided
        //   cannot be recognized (it is not an email address, nor a `user_id` from
        //   this API). This error will also be returned if read-only fields are set,
        //   or if the `state` field is set to to a value other than `PENDING`.
        // * `NOT_FOUND` if the student ID provided is a valid student ID, but
        //   Classroom has no record of that student.
        // * `ALREADY_EXISTS` if there is already a pending guardian invitation for
        //   the student and `invited_email_address` provided, or if the provided
        //   `invited_email_address` matches the Google account of an existing
        //   `Guardian` for this user.
        def create(resource: GuardianInvitation, studentId: String): GuardianInvitation = js.native
        
        // Returns a specific guardian invitation.
        // This method returns the following error codes:
        // * `PERMISSION_DENIED` if the requesting user is not permitted to view
        //   guardian invitations for the student identified by the `student_id`, if
        //   guardians are not enabled for the domain in question, or for other
        //   access errors.
        // * `INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot
        //   be recognized (it is not an email address, nor a `student_id` from the
        //   API, nor the literal string `me`).
        // * `NOT_FOUND` if Classroom cannot find any record of the given student or
        //   `invitation_id`. May also be returned if the student exists, but the
        //   requesting user does not have access to see that student.
        def get(studentId: String, invitationId: String): GuardianInvitation = js.native
        
        // Returns a list of guardian invitations that the requesting user is
        // permitted to view, filtered by the parameters provided.
        // This method returns the following error codes:
        // * `PERMISSION_DENIED` if a `student_id` is specified, and the requesting
        //   user is not permitted to view guardian invitations for that student, if
        //   `"-"` is specified as the `student_id` and the user is not a domain
        //   administrator, if guardians are not enabled for the domain in question,
        //   or for other access errors.
        // * `INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot
        //   be recognized (it is not an email address, nor a `student_id` from the
        //   API, nor the literal string `me`). May also be returned if an invalid
        //   `page_token` or `state` is provided.
        // * `NOT_FOUND` if a `student_id` is specified, and its format can be
        //   recognized, but Classroom has no record of that student.
        def list(studentId: String): ListGuardianInvitationsResponse = js.native
        // Returns a list of guardian invitations that the requesting user is
        // permitted to view, filtered by the parameters provided.
        // This method returns the following error codes:
        // * `PERMISSION_DENIED` if a `student_id` is specified, and the requesting
        //   user is not permitted to view guardian invitations for that student, if
        //   `"-"` is specified as the `student_id` and the user is not a domain
        //   administrator, if guardians are not enabled for the domain in question,
        //   or for other access errors.
        // * `INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot
        //   be recognized (it is not an email address, nor a `student_id` from the
        //   API, nor the literal string `me`). May also be returned if an invalid
        //   `page_token` or `state` is provided.
        // * `NOT_FOUND` if a `student_id` is specified, and its format can be
        //   recognized, but Classroom has no record of that student.
        def list(studentId: String, optionalArgs: js.Object): ListGuardianInvitationsResponse = js.native
        
        // Modifies a guardian invitation.
        // Currently, the only valid modification is to change the `state` from
        // `PENDING` to `COMPLETE`. This has the effect of withdrawing the invitation.
        // This method returns the following error codes:
        // * `PERMISSION_DENIED` if the current user does not have permission to
        //   manage guardians, if guardians are not enabled for the domain in question
        //   or for other access errors.
        // * `FAILED_PRECONDITION` if the guardian link is not in the `PENDING` state.
        // * `INVALID_ARGUMENT` if the format of the student ID provided
        //   cannot be recognized (it is not an email address, nor a `user_id` from
        //   this API), or if the passed `GuardianInvitation` has a `state` other than
        //   `COMPLETE`, or if it modifies fields other than `state`.
        // * `NOT_FOUND` if the student ID provided is a valid student ID, but
        //   Classroom has no record of that student, or if the `id` field does not
        //   refer to a guardian invitation known to Classroom.
        def patch(resource: GuardianInvitation, studentId: String, invitationId: String): GuardianInvitation = js.native
        // Modifies a guardian invitation.
        // Currently, the only valid modification is to change the `state` from
        // `PENDING` to `COMPLETE`. This has the effect of withdrawing the invitation.
        // This method returns the following error codes:
        // * `PERMISSION_DENIED` if the current user does not have permission to
        //   manage guardians, if guardians are not enabled for the domain in question
        //   or for other access errors.
        // * `FAILED_PRECONDITION` if the guardian link is not in the `PENDING` state.
        // * `INVALID_ARGUMENT` if the format of the student ID provided
        //   cannot be recognized (it is not an email address, nor a `user_id` from
        //   this API), or if the passed `GuardianInvitation` has a `state` other than
        //   `COMPLETE`, or if it modifies fields other than `state`.
        // * `NOT_FOUND` if the student ID provided is a valid student ID, but
        //   Classroom has no record of that student, or if the `id` field does not
        //   refer to a guardian invitation known to Classroom.
        def patch(resource: GuardianInvitation, studentId: String, invitationId: String, optionalArgs: js.Object): GuardianInvitation = js.native
      }
      
      @js.native
      trait GuardiansCollection extends StObject {
        
        // Returns a specific guardian.
        // This method returns the following error codes:
        // * `PERMISSION_DENIED` if no user that matches the provided `student_id`
        //   is visible to the requesting user, if the requesting user is not
        //   permitted to view guardian information for the student identified by the
        //   `student_id`, if guardians are not enabled for the domain in question,
        //   or for other access errors.
        // * `INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot
        //   be recognized (it is not an email address, nor a `student_id` from the
        //   API, nor the literal string `me`).
        // * `NOT_FOUND` if the requesting user is permitted to view guardians for
        //   the requested `student_id`, but no `Guardian` record exists for that
        //   student that matches the provided `guardian_id`.
        def get(studentId: String, guardianId: String): Guardian = js.native
        
        // Returns a list of guardians that the requesting user is permitted to
        // view, restricted to those that match the request.
        // To list guardians for any student that the requesting user may view
        // guardians for, use the literal character `-` for the student ID.
        // This method returns the following error codes:
        // * `PERMISSION_DENIED` if a `student_id` is specified, and the requesting
        //   user is not permitted to view guardian information for that student, if
        //   `"-"` is specified as the `student_id` and the user is not a domain
        //   administrator, if guardians are not enabled for the domain in question,
        //   if the `invited_email_address` filter is set by a user who is not a
        //   domain administrator, or for other access errors.
        // * `INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot
        //   be recognized (it is not an email address, nor a `student_id` from the
        //   API, nor the literal string `me`). May also be returned if an invalid
        //   `page_token` is provided.
        // * `NOT_FOUND` if a `student_id` is specified, and its format can be
        //   recognized, but Classroom has no record of that student.
        def list(studentId: String): ListGuardiansResponse = js.native
        // Returns a list of guardians that the requesting user is permitted to
        // view, restricted to those that match the request.
        // To list guardians for any student that the requesting user may view
        // guardians for, use the literal character `-` for the student ID.
        // This method returns the following error codes:
        // * `PERMISSION_DENIED` if a `student_id` is specified, and the requesting
        //   user is not permitted to view guardian information for that student, if
        //   `"-"` is specified as the `student_id` and the user is not a domain
        //   administrator, if guardians are not enabled for the domain in question,
        //   if the `invited_email_address` filter is set by a user who is not a
        //   domain administrator, or for other access errors.
        // * `INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot
        //   be recognized (it is not an email address, nor a `student_id` from the
        //   API, nor the literal string `me`). May also be returned if an invalid
        //   `page_token` is provided.
        // * `NOT_FOUND` if a `student_id` is specified, and its format can be
        //   recognized, but Classroom has no record of that student.
        def list(studentId: String, optionalArgs: js.Object): ListGuardiansResponse = js.native
        
        // Deletes a guardian.
        // The guardian will no longer receive guardian notifications and the guardian
        // will no longer be accessible via the API.
        // This method returns the following error codes:
        // * `PERMISSION_DENIED` if no user that matches the provided `student_id`
        //   is visible to the requesting user, if the requesting user is not
        //   permitted to manage guardians for the student identified by the
        //   `student_id`, if guardians are not enabled for the domain in question,
        //   or for other access errors.
        // * `INVALID_ARGUMENT` if a `student_id` is specified, but its format cannot
        //   be recognized (it is not an email address, nor a `student_id` from the
        //   API).
        // * `NOT_FOUND` if the requesting user is permitted to modify guardians for
        //   the requested `student_id`, but no `Guardian` record exists for that
        //   student with the provided `guardian_id`.
        def remove(studentId: String, guardianId: String): Unit = js.native
      }
    }
    
    @js.native
    trait UserProfilesCollection extends StObject {
      
      var GuardianInvitations: js.UndefOr[GuardianInvitationsCollection] = js.native
      
      var Guardians: js.UndefOr[GuardiansCollection] = js.native
      
      // Returns a user profile.
      // This method returns the following error codes:
      // * `PERMISSION_DENIED` if the requesting user is not permitted to access
      // this user profile, if no profile exists with the requested ID, or for
      // access errors.
      def get(userId: String): UserProfile = js.native
    }
    object UserProfilesCollection {
      
      @scala.inline
      def apply(get: String => UserProfile): UserProfilesCollection = {
        val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
        __obj.asInstanceOf[UserProfilesCollection]
      }
      
      @scala.inline
      implicit class UserProfilesCollectionMutableBuilder[Self <: UserProfilesCollection] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGet(value: String => UserProfile): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGuardianInvitations(value: GuardianInvitationsCollection): Self = StObject.set(x, "GuardianInvitations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGuardianInvitationsUndefined: Self = StObject.set(x, "GuardianInvitations", js.undefined)
        
        @scala.inline
        def setGuardians(value: GuardiansCollection): Self = StObject.set(x, "Guardians", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGuardiansUndefined: Self = StObject.set(x, "Guardians", js.undefined)
      }
    }
  }
  
  object Schema {
    
    @js.native
    trait Announcement extends StObject {
      
      var alternateLink: js.UndefOr[String] = js.native
      
      var assigneeMode: js.UndefOr[String] = js.native
      
      var courseId: js.UndefOr[String] = js.native
      
      var creationTime: js.UndefOr[String] = js.native
      
      var creatorUserId: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var individualStudentsOptions: js.UndefOr[IndividualStudentsOptions] = js.native
      
      var materials: js.UndefOr[js.Array[Material]] = js.native
      
      var scheduledTime: js.UndefOr[String] = js.native
      
      var state: js.UndefOr[String] = js.native
      
      var text: js.UndefOr[String] = js.native
      
      var updateTime: js.UndefOr[String] = js.native
    }
    object Announcement {
      
      @scala.inline
      def apply(): Announcement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Announcement]
      }
      
      @scala.inline
      implicit class AnnouncementMutableBuilder[Self <: Announcement] (val x: Self) extends AnyVal {
        
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
        def setIndividualStudentsOptions(value: IndividualStudentsOptions): Self = StObject.set(x, "individualStudentsOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndividualStudentsOptionsUndefined: Self = StObject.set(x, "individualStudentsOptions", js.undefined)
        
        @scala.inline
        def setMaterials(value: js.Array[Material]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
        
        @scala.inline
        def setMaterialsVarargs(value: Material*): Self = StObject.set(x, "materials", js.Array(value :_*))
        
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
    
    @js.native
    trait Assignment extends StObject {
      
      var studentWorkFolder: js.UndefOr[DriveFolder] = js.native
    }
    object Assignment {
      
      @scala.inline
      def apply(): Assignment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Assignment]
      }
      
      @scala.inline
      implicit class AssignmentMutableBuilder[Self <: Assignment] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setStudentWorkFolder(value: DriveFolder): Self = StObject.set(x, "studentWorkFolder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStudentWorkFolderUndefined: Self = StObject.set(x, "studentWorkFolder", js.undefined)
      }
    }
    
    @js.native
    trait AssignmentSubmission extends StObject {
      
      var attachments: js.UndefOr[js.Array[Attachment]] = js.native
    }
    object AssignmentSubmission {
      
      @scala.inline
      def apply(): AssignmentSubmission = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AssignmentSubmission]
      }
      
      @scala.inline
      implicit class AssignmentSubmissionMutableBuilder[Self <: AssignmentSubmission] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
        
        @scala.inline
        def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
      }
    }
    
    @js.native
    trait Attachment extends StObject {
      
      var driveFile: js.UndefOr[DriveFile] = js.native
      
      var form: js.UndefOr[Form] = js.native
      
      var link: js.UndefOr[Link] = js.native
      
      var youTubeVideo: js.UndefOr[YouTubeVideo] = js.native
    }
    object Attachment {
      
      @scala.inline
      def apply(): Attachment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Attachment]
      }
      
      @scala.inline
      implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDriveFile(value: DriveFile): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDriveFileUndefined: Self = StObject.set(x, "driveFile", js.undefined)
        
        @scala.inline
        def setForm(value: Form): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
        
        @scala.inline
        def setLink(value: Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        @scala.inline
        def setYouTubeVideo(value: YouTubeVideo): Self = StObject.set(x, "youTubeVideo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYouTubeVideoUndefined: Self = StObject.set(x, "youTubeVideo", js.undefined)
      }
    }
    
    @js.native
    trait CloudPubsubTopic extends StObject {
      
      var topicName: js.UndefOr[String] = js.native
    }
    object CloudPubsubTopic {
      
      @scala.inline
      def apply(): CloudPubsubTopic = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CloudPubsubTopic]
      }
      
      @scala.inline
      implicit class CloudPubsubTopicMutableBuilder[Self <: CloudPubsubTopic] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTopicNameUndefined: Self = StObject.set(x, "topicName", js.undefined)
      }
    }
    
    @js.native
    trait Course extends StObject {
      
      var alternateLink: js.UndefOr[String] = js.native
      
      var calendarId: js.UndefOr[String] = js.native
      
      var courseGroupEmail: js.UndefOr[String] = js.native
      
      var courseMaterialSets: js.UndefOr[js.Array[CourseMaterialSet]] = js.native
      
      var courseState: js.UndefOr[String] = js.native
      
      var creationTime: js.UndefOr[String] = js.native
      
      var description: js.UndefOr[String] = js.native
      
      var descriptionHeading: js.UndefOr[String] = js.native
      
      var enrollmentCode: js.UndefOr[String] = js.native
      
      var guardiansEnabled: js.UndefOr[Boolean] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var name: js.UndefOr[String] = js.native
      
      var ownerId: js.UndefOr[String] = js.native
      
      var room: js.UndefOr[String] = js.native
      
      var section: js.UndefOr[String] = js.native
      
      var teacherFolder: js.UndefOr[DriveFolder] = js.native
      
      var teacherGroupEmail: js.UndefOr[String] = js.native
      
      var updateTime: js.UndefOr[String] = js.native
    }
    object Course {
      
      @scala.inline
      def apply(): Course = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Course]
      }
      
      @scala.inline
      implicit class CourseMutableBuilder[Self <: Course] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
        
        @scala.inline
        def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCalendarIdUndefined: Self = StObject.set(x, "calendarId", js.undefined)
        
        @scala.inline
        def setCourseGroupEmail(value: String): Self = StObject.set(x, "courseGroupEmail", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCourseGroupEmailUndefined: Self = StObject.set(x, "courseGroupEmail", js.undefined)
        
        @scala.inline
        def setCourseMaterialSets(value: js.Array[CourseMaterialSet]): Self = StObject.set(x, "courseMaterialSets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCourseMaterialSetsUndefined: Self = StObject.set(x, "courseMaterialSets", js.undefined)
        
        @scala.inline
        def setCourseMaterialSetsVarargs(value: CourseMaterialSet*): Self = StObject.set(x, "courseMaterialSets", js.Array(value :_*))
        
        @scala.inline
        def setCourseState(value: String): Self = StObject.set(x, "courseState", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCourseStateUndefined: Self = StObject.set(x, "courseState", js.undefined)
        
        @scala.inline
        def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionHeading(value: String): Self = StObject.set(x, "descriptionHeading", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionHeadingUndefined: Self = StObject.set(x, "descriptionHeading", js.undefined)
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setEnrollmentCode(value: String): Self = StObject.set(x, "enrollmentCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnrollmentCodeUndefined: Self = StObject.set(x, "enrollmentCode", js.undefined)
        
        @scala.inline
        def setGuardiansEnabled(value: Boolean): Self = StObject.set(x, "guardiansEnabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGuardiansEnabledUndefined: Self = StObject.set(x, "guardiansEnabled", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
        
        @scala.inline
        def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRoomUndefined: Self = StObject.set(x, "room", js.undefined)
        
        @scala.inline
        def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
        
        @scala.inline
        def setTeacherFolder(value: DriveFolder): Self = StObject.set(x, "teacherFolder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTeacherFolderUndefined: Self = StObject.set(x, "teacherFolder", js.undefined)
        
        @scala.inline
        def setTeacherGroupEmail(value: String): Self = StObject.set(x, "teacherGroupEmail", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTeacherGroupEmailUndefined: Self = StObject.set(x, "teacherGroupEmail", js.undefined)
        
        @scala.inline
        def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
      }
    }
    
    @js.native
    trait CourseAlias extends StObject {
      
      var alias: js.UndefOr[String] = js.native
    }
    object CourseAlias {
      
      @scala.inline
      def apply(): CourseAlias = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CourseAlias]
      }
      
      @scala.inline
      implicit class CourseAliasMutableBuilder[Self <: CourseAlias] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      }
    }
    
    @js.native
    trait CourseMaterial extends StObject {
      
      var driveFile: js.UndefOr[DriveFile] = js.native
      
      var form: js.UndefOr[Form] = js.native
      
      var link: js.UndefOr[Link] = js.native
      
      var youTubeVideo: js.UndefOr[YouTubeVideo] = js.native
    }
    object CourseMaterial {
      
      @scala.inline
      def apply(): CourseMaterial = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CourseMaterial]
      }
      
      @scala.inline
      implicit class CourseMaterialMutableBuilder[Self <: CourseMaterial] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDriveFile(value: DriveFile): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDriveFileUndefined: Self = StObject.set(x, "driveFile", js.undefined)
        
        @scala.inline
        def setForm(value: Form): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
        
        @scala.inline
        def setLink(value: Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        @scala.inline
        def setYouTubeVideo(value: YouTubeVideo): Self = StObject.set(x, "youTubeVideo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYouTubeVideoUndefined: Self = StObject.set(x, "youTubeVideo", js.undefined)
      }
    }
    
    @js.native
    trait CourseMaterialSet extends StObject {
      
      var materials: js.UndefOr[js.Array[CourseMaterial]] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object CourseMaterialSet {
      
      @scala.inline
      def apply(): CourseMaterialSet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CourseMaterialSet]
      }
      
      @scala.inline
      implicit class CourseMaterialSetMutableBuilder[Self <: CourseMaterialSet] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMaterials(value: js.Array[CourseMaterial]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
        
        @scala.inline
        def setMaterialsVarargs(value: CourseMaterial*): Self = StObject.set(x, "materials", js.Array(value :_*))
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait CourseRosterChangesInfo extends StObject {
      
      var courseId: js.UndefOr[String] = js.native
    }
    object CourseRosterChangesInfo {
      
      @scala.inline
      def apply(): CourseRosterChangesInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CourseRosterChangesInfo]
      }
      
      @scala.inline
      implicit class CourseRosterChangesInfoMutableBuilder[Self <: CourseRosterChangesInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
      }
    }
    
    @js.native
    trait CourseWork extends StObject {
      
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
      implicit class CourseWorkMutableBuilder[Self <: CourseWork] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
        
        @scala.inline
        def setAssigneeMode(value: String): Self = StObject.set(x, "assigneeMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAssigneeModeUndefined: Self = StObject.set(x, "assigneeMode", js.undefined)
        
        @scala.inline
        def setAssignment(value: Assignment): Self = StObject.set(x, "assignment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAssignmentUndefined: Self = StObject.set(x, "assignment", js.undefined)
        
        @scala.inline
        def setAssociatedWithDeveloper(value: Boolean): Self = StObject.set(x, "associatedWithDeveloper", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAssociatedWithDeveloperUndefined: Self = StObject.set(x, "associatedWithDeveloper", js.undefined)
        
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
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setDueDate(value: Date): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
        
        @scala.inline
        def setDueTime(value: TimeOfDay): Self = StObject.set(x, "dueTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDueTimeUndefined: Self = StObject.set(x, "dueTime", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setIndividualStudentsOptions(value: IndividualStudentsOptions): Self = StObject.set(x, "individualStudentsOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndividualStudentsOptionsUndefined: Self = StObject.set(x, "individualStudentsOptions", js.undefined)
        
        @scala.inline
        def setMaterials(value: js.Array[Material]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
        
        @scala.inline
        def setMaterialsVarargs(value: Material*): Self = StObject.set(x, "materials", js.Array(value :_*))
        
        @scala.inline
        def setMaxPoints(value: Double): Self = StObject.set(x, "maxPoints", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxPointsUndefined: Self = StObject.set(x, "maxPoints", js.undefined)
        
        @scala.inline
        def setMultipleChoiceQuestion(value: MultipleChoiceQuestion): Self = StObject.set(x, "multipleChoiceQuestion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMultipleChoiceQuestionUndefined: Self = StObject.set(x, "multipleChoiceQuestion", js.undefined)
        
        @scala.inline
        def setScheduledTime(value: String): Self = StObject.set(x, "scheduledTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScheduledTimeUndefined: Self = StObject.set(x, "scheduledTime", js.undefined)
        
        @scala.inline
        def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
        
        @scala.inline
        def setSubmissionModificationMode(value: String): Self = StObject.set(x, "submissionModificationMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubmissionModificationModeUndefined: Self = StObject.set(x, "submissionModificationMode", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setTopicId(value: String): Self = StObject.set(x, "topicId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTopicIdUndefined: Self = StObject.set(x, "topicId", js.undefined)
        
        @scala.inline
        def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
        
        @scala.inline
        def setWorkType(value: String): Self = StObject.set(x, "workType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWorkTypeUndefined: Self = StObject.set(x, "workType", js.undefined)
      }
    }
    
    @js.native
    trait CourseWorkChangesInfo extends StObject {
      
      var courseId: js.UndefOr[String] = js.native
    }
    object CourseWorkChangesInfo {
      
      @scala.inline
      def apply(): CourseWorkChangesInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CourseWorkChangesInfo]
      }
      
      @scala.inline
      implicit class CourseWorkChangesInfoMutableBuilder[Self <: CourseWorkChangesInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
      }
    }
    
    @js.native
    trait Date extends StObject {
      
      var day: js.UndefOr[Double] = js.native
      
      var month: js.UndefOr[Double] = js.native
      
      var year: js.UndefOr[Double] = js.native
    }
    object Date {
      
      @scala.inline
      def apply(): Date = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Date]
      }
      
      @scala.inline
      implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
        
        @scala.inline
        def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
        
        @scala.inline
        def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
      }
    }
    
    @js.native
    trait DriveFile extends StObject {
      
      var alternateLink: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var thumbnailUrl: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object DriveFile {
      
      @scala.inline
      def apply(): DriveFile = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DriveFile]
      }
      
      @scala.inline
      implicit class DriveFileMutableBuilder[Self <: DriveFile] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait DriveFolder extends StObject {
      
      var alternateLink: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object DriveFolder {
      
      @scala.inline
      def apply(): DriveFolder = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DriveFolder]
      }
      
      @scala.inline
      implicit class DriveFolderMutableBuilder[Self <: DriveFolder] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait Feed extends StObject {
      
      var courseRosterChangesInfo: js.UndefOr[CourseRosterChangesInfo] = js.native
      
      var courseWorkChangesInfo: js.UndefOr[CourseWorkChangesInfo] = js.native
      
      var feedType: js.UndefOr[String] = js.native
    }
    object Feed {
      
      @scala.inline
      def apply(): Feed = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Feed]
      }
      
      @scala.inline
      implicit class FeedMutableBuilder[Self <: Feed] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCourseRosterChangesInfo(value: CourseRosterChangesInfo): Self = StObject.set(x, "courseRosterChangesInfo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCourseRosterChangesInfoUndefined: Self = StObject.set(x, "courseRosterChangesInfo", js.undefined)
        
        @scala.inline
        def setCourseWorkChangesInfo(value: CourseWorkChangesInfo): Self = StObject.set(x, "courseWorkChangesInfo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCourseWorkChangesInfoUndefined: Self = StObject.set(x, "courseWorkChangesInfo", js.undefined)
        
        @scala.inline
        def setFeedType(value: String): Self = StObject.set(x, "feedType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeedTypeUndefined: Self = StObject.set(x, "feedType", js.undefined)
      }
    }
    
    @js.native
    trait Form extends StObject {
      
      var formUrl: js.UndefOr[String] = js.native
      
      var responseUrl: js.UndefOr[String] = js.native
      
      var thumbnailUrl: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object Form {
      
      @scala.inline
      def apply(): Form = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Form]
      }
      
      @scala.inline
      implicit class FormMutableBuilder[Self <: Form] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFormUrl(value: String): Self = StObject.set(x, "formUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormUrlUndefined: Self = StObject.set(x, "formUrl", js.undefined)
        
        @scala.inline
        def setResponseUrl(value: String): Self = StObject.set(x, "responseUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseUrlUndefined: Self = StObject.set(x, "responseUrl", js.undefined)
        
        @scala.inline
        def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait GlobalPermission extends StObject {
      
      var permission: js.UndefOr[String] = js.native
    }
    object GlobalPermission {
      
      @scala.inline
      def apply(): GlobalPermission = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GlobalPermission]
      }
      
      @scala.inline
      implicit class GlobalPermissionMutableBuilder[Self <: GlobalPermission] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
      }
    }
    
    @js.native
    trait GradeHistory extends StObject {
      
      var actorUserId: js.UndefOr[String] = js.native
      
      var gradeChangeType: js.UndefOr[String] = js.native
      
      var gradeTimestamp: js.UndefOr[String] = js.native
      
      var maxPoints: js.UndefOr[Double] = js.native
      
      var pointsEarned: js.UndefOr[Double] = js.native
    }
    object GradeHistory {
      
      @scala.inline
      def apply(): GradeHistory = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GradeHistory]
      }
      
      @scala.inline
      implicit class GradeHistoryMutableBuilder[Self <: GradeHistory] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActorUserId(value: String): Self = StObject.set(x, "actorUserId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActorUserIdUndefined: Self = StObject.set(x, "actorUserId", js.undefined)
        
        @scala.inline
        def setGradeChangeType(value: String): Self = StObject.set(x, "gradeChangeType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGradeChangeTypeUndefined: Self = StObject.set(x, "gradeChangeType", js.undefined)
        
        @scala.inline
        def setGradeTimestamp(value: String): Self = StObject.set(x, "gradeTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGradeTimestampUndefined: Self = StObject.set(x, "gradeTimestamp", js.undefined)
        
        @scala.inline
        def setMaxPoints(value: Double): Self = StObject.set(x, "maxPoints", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxPointsUndefined: Self = StObject.set(x, "maxPoints", js.undefined)
        
        @scala.inline
        def setPointsEarned(value: Double): Self = StObject.set(x, "pointsEarned", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPointsEarnedUndefined: Self = StObject.set(x, "pointsEarned", js.undefined)
      }
    }
    
    @js.native
    trait Guardian extends StObject {
      
      var guardianId: js.UndefOr[String] = js.native
      
      var guardianProfile: js.UndefOr[UserProfile] = js.native
      
      var invitedEmailAddress: js.UndefOr[String] = js.native
      
      var studentId: js.UndefOr[String] = js.native
    }
    object Guardian {
      
      @scala.inline
      def apply(): Guardian = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Guardian]
      }
      
      @scala.inline
      implicit class GuardianMutableBuilder[Self <: Guardian] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGuardianId(value: String): Self = StObject.set(x, "guardianId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGuardianIdUndefined: Self = StObject.set(x, "guardianId", js.undefined)
        
        @scala.inline
        def setGuardianProfile(value: UserProfile): Self = StObject.set(x, "guardianProfile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGuardianProfileUndefined: Self = StObject.set(x, "guardianProfile", js.undefined)
        
        @scala.inline
        def setInvitedEmailAddress(value: String): Self = StObject.set(x, "invitedEmailAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInvitedEmailAddressUndefined: Self = StObject.set(x, "invitedEmailAddress", js.undefined)
        
        @scala.inline
        def setStudentId(value: String): Self = StObject.set(x, "studentId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStudentIdUndefined: Self = StObject.set(x, "studentId", js.undefined)
      }
    }
    
    @js.native
    trait GuardianInvitation extends StObject {
      
      var creationTime: js.UndefOr[String] = js.native
      
      var invitationId: js.UndefOr[String] = js.native
      
      var invitedEmailAddress: js.UndefOr[String] = js.native
      
      var state: js.UndefOr[String] = js.native
      
      var studentId: js.UndefOr[String] = js.native
    }
    object GuardianInvitation {
      
      @scala.inline
      def apply(): GuardianInvitation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GuardianInvitation]
      }
      
      @scala.inline
      implicit class GuardianInvitationMutableBuilder[Self <: GuardianInvitation] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
        
        @scala.inline
        def setInvitationId(value: String): Self = StObject.set(x, "invitationId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInvitationIdUndefined: Self = StObject.set(x, "invitationId", js.undefined)
        
        @scala.inline
        def setInvitedEmailAddress(value: String): Self = StObject.set(x, "invitedEmailAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInvitedEmailAddressUndefined: Self = StObject.set(x, "invitedEmailAddress", js.undefined)
        
        @scala.inline
        def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
        
        @scala.inline
        def setStudentId(value: String): Self = StObject.set(x, "studentId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStudentIdUndefined: Self = StObject.set(x, "studentId", js.undefined)
      }
    }
    
    @js.native
    trait IndividualStudentsOptions extends StObject {
      
      var studentIds: js.UndefOr[js.Array[String]] = js.native
    }
    object IndividualStudentsOptions {
      
      @scala.inline
      def apply(): IndividualStudentsOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IndividualStudentsOptions]
      }
      
      @scala.inline
      implicit class IndividualStudentsOptionsMutableBuilder[Self <: IndividualStudentsOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setStudentIds(value: js.Array[String]): Self = StObject.set(x, "studentIds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStudentIdsUndefined: Self = StObject.set(x, "studentIds", js.undefined)
        
        @scala.inline
        def setStudentIdsVarargs(value: String*): Self = StObject.set(x, "studentIds", js.Array(value :_*))
      }
    }
    
    @js.native
    trait Invitation extends StObject {
      
      var courseId: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var role: js.UndefOr[String] = js.native
      
      var userId: js.UndefOr[String] = js.native
    }
    object Invitation {
      
      @scala.inline
      def apply(): Invitation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Invitation]
      }
      
      @scala.inline
      implicit class InvitationMutableBuilder[Self <: Invitation] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        @scala.inline
        def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    @js.native
    trait Link extends StObject {
      
      var thumbnailUrl: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
      
      var url: js.UndefOr[String] = js.native
    }
    object Link {
      
      @scala.inline
      def apply(): Link = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Link]
      }
      
      @scala.inline
      implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    @js.native
    trait ListAnnouncementsResponse extends StObject {
      
      var announcements: js.UndefOr[js.Array[Announcement]] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
    }
    object ListAnnouncementsResponse {
      
      @scala.inline
      def apply(): ListAnnouncementsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListAnnouncementsResponse]
      }
      
      @scala.inline
      implicit class ListAnnouncementsResponseMutableBuilder[Self <: ListAnnouncementsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnnouncements(value: js.Array[Announcement]): Self = StObject.set(x, "announcements", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnnouncementsUndefined: Self = StObject.set(x, "announcements", js.undefined)
        
        @scala.inline
        def setAnnouncementsVarargs(value: Announcement*): Self = StObject.set(x, "announcements", js.Array(value :_*))
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    @js.native
    trait ListCourseAliasesResponse extends StObject {
      
      var aliases: js.UndefOr[js.Array[CourseAlias]] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
    }
    object ListCourseAliasesResponse {
      
      @scala.inline
      def apply(): ListCourseAliasesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListCourseAliasesResponse]
      }
      
      @scala.inline
      implicit class ListCourseAliasesResponseMutableBuilder[Self <: ListCourseAliasesResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAliases(value: js.Array[CourseAlias]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
        
        @scala.inline
        def setAliasesVarargs(value: CourseAlias*): Self = StObject.set(x, "aliases", js.Array(value :_*))
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    @js.native
    trait ListCourseWorkResponse extends StObject {
      
      var courseWork: js.UndefOr[js.Array[CourseWork]] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
    }
    object ListCourseWorkResponse {
      
      @scala.inline
      def apply(): ListCourseWorkResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListCourseWorkResponse]
      }
      
      @scala.inline
      implicit class ListCourseWorkResponseMutableBuilder[Self <: ListCourseWorkResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCourseWork(value: js.Array[CourseWork]): Self = StObject.set(x, "courseWork", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCourseWorkUndefined: Self = StObject.set(x, "courseWork", js.undefined)
        
        @scala.inline
        def setCourseWorkVarargs(value: CourseWork*): Self = StObject.set(x, "courseWork", js.Array(value :_*))
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    @js.native
    trait ListCoursesResponse extends StObject {
      
      var courses: js.UndefOr[js.Array[Course]] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
    }
    object ListCoursesResponse {
      
      @scala.inline
      def apply(): ListCoursesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListCoursesResponse]
      }
      
      @scala.inline
      implicit class ListCoursesResponseMutableBuilder[Self <: ListCoursesResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCourses(value: js.Array[Course]): Self = StObject.set(x, "courses", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCoursesUndefined: Self = StObject.set(x, "courses", js.undefined)
        
        @scala.inline
        def setCoursesVarargs(value: Course*): Self = StObject.set(x, "courses", js.Array(value :_*))
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    @js.native
    trait ListGuardianInvitationsResponse extends StObject {
      
      var guardianInvitations: js.UndefOr[js.Array[GuardianInvitation]] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
    }
    object ListGuardianInvitationsResponse {
      
      @scala.inline
      def apply(): ListGuardianInvitationsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListGuardianInvitationsResponse]
      }
      
      @scala.inline
      implicit class ListGuardianInvitationsResponseMutableBuilder[Self <: ListGuardianInvitationsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGuardianInvitations(value: js.Array[GuardianInvitation]): Self = StObject.set(x, "guardianInvitations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGuardianInvitationsUndefined: Self = StObject.set(x, "guardianInvitations", js.undefined)
        
        @scala.inline
        def setGuardianInvitationsVarargs(value: GuardianInvitation*): Self = StObject.set(x, "guardianInvitations", js.Array(value :_*))
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    @js.native
    trait ListGuardiansResponse extends StObject {
      
      var guardians: js.UndefOr[js.Array[Guardian]] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
    }
    object ListGuardiansResponse {
      
      @scala.inline
      def apply(): ListGuardiansResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListGuardiansResponse]
      }
      
      @scala.inline
      implicit class ListGuardiansResponseMutableBuilder[Self <: ListGuardiansResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGuardians(value: js.Array[Guardian]): Self = StObject.set(x, "guardians", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGuardiansUndefined: Self = StObject.set(x, "guardians", js.undefined)
        
        @scala.inline
        def setGuardiansVarargs(value: Guardian*): Self = StObject.set(x, "guardians", js.Array(value :_*))
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    @js.native
    trait ListInvitationsResponse extends StObject {
      
      var invitations: js.UndefOr[js.Array[Invitation]] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
    }
    object ListInvitationsResponse {
      
      @scala.inline
      def apply(): ListInvitationsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListInvitationsResponse]
      }
      
      @scala.inline
      implicit class ListInvitationsResponseMutableBuilder[Self <: ListInvitationsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInvitations(value: js.Array[Invitation]): Self = StObject.set(x, "invitations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInvitationsUndefined: Self = StObject.set(x, "invitations", js.undefined)
        
        @scala.inline
        def setInvitationsVarargs(value: Invitation*): Self = StObject.set(x, "invitations", js.Array(value :_*))
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    @js.native
    trait ListStudentSubmissionsResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.native
      
      var studentSubmissions: js.UndefOr[js.Array[StudentSubmission]] = js.native
    }
    object ListStudentSubmissionsResponse {
      
      @scala.inline
      def apply(): ListStudentSubmissionsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListStudentSubmissionsResponse]
      }
      
      @scala.inline
      implicit class ListStudentSubmissionsResponseMutableBuilder[Self <: ListStudentSubmissionsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setStudentSubmissions(value: js.Array[StudentSubmission]): Self = StObject.set(x, "studentSubmissions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStudentSubmissionsUndefined: Self = StObject.set(x, "studentSubmissions", js.undefined)
        
        @scala.inline
        def setStudentSubmissionsVarargs(value: StudentSubmission*): Self = StObject.set(x, "studentSubmissions", js.Array(value :_*))
      }
    }
    
    @js.native
    trait ListStudentsResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.native
      
      var students: js.UndefOr[js.Array[Student]] = js.native
    }
    object ListStudentsResponse {
      
      @scala.inline
      def apply(): ListStudentsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListStudentsResponse]
      }
      
      @scala.inline
      implicit class ListStudentsResponseMutableBuilder[Self <: ListStudentsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setStudents(value: js.Array[Student]): Self = StObject.set(x, "students", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStudentsUndefined: Self = StObject.set(x, "students", js.undefined)
        
        @scala.inline
        def setStudentsVarargs(value: Student*): Self = StObject.set(x, "students", js.Array(value :_*))
      }
    }
    
    @js.native
    trait ListTeachersResponse extends StObject {
      
      var nextPageToken: js.UndefOr[String] = js.native
      
      var teachers: js.UndefOr[js.Array[Teacher]] = js.native
    }
    object ListTeachersResponse {
      
      @scala.inline
      def apply(): ListTeachersResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListTeachersResponse]
      }
      
      @scala.inline
      implicit class ListTeachersResponseMutableBuilder[Self <: ListTeachersResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setTeachers(value: js.Array[Teacher]): Self = StObject.set(x, "teachers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTeachersUndefined: Self = StObject.set(x, "teachers", js.undefined)
        
        @scala.inline
        def setTeachersVarargs(value: Teacher*): Self = StObject.set(x, "teachers", js.Array(value :_*))
      }
    }
    
    @js.native
    trait Material extends StObject {
      
      var driveFile: js.UndefOr[SharedDriveFile] = js.native
      
      var form: js.UndefOr[Form] = js.native
      
      var link: js.UndefOr[Link] = js.native
      
      var youtubeVideo: js.UndefOr[YouTubeVideo] = js.native
    }
    object Material {
      
      @scala.inline
      def apply(): Material = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Material]
      }
      
      @scala.inline
      implicit class MaterialMutableBuilder[Self <: Material] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDriveFile(value: SharedDriveFile): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDriveFileUndefined: Self = StObject.set(x, "driveFile", js.undefined)
        
        @scala.inline
        def setForm(value: Form): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
        
        @scala.inline
        def setLink(value: Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        @scala.inline
        def setYoutubeVideo(value: YouTubeVideo): Self = StObject.set(x, "youtubeVideo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYoutubeVideoUndefined: Self = StObject.set(x, "youtubeVideo", js.undefined)
      }
    }
    
    @js.native
    trait ModifyAnnouncementAssigneesRequest extends StObject {
      
      var assigneeMode: js.UndefOr[String] = js.native
      
      var modifyIndividualStudentsOptions: js.UndefOr[ModifyIndividualStudentsOptions] = js.native
    }
    object ModifyAnnouncementAssigneesRequest {
      
      @scala.inline
      def apply(): ModifyAnnouncementAssigneesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModifyAnnouncementAssigneesRequest]
      }
      
      @scala.inline
      implicit class ModifyAnnouncementAssigneesRequestMutableBuilder[Self <: ModifyAnnouncementAssigneesRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAssigneeMode(value: String): Self = StObject.set(x, "assigneeMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAssigneeModeUndefined: Self = StObject.set(x, "assigneeMode", js.undefined)
        
        @scala.inline
        def setModifyIndividualStudentsOptions(value: ModifyIndividualStudentsOptions): Self = StObject.set(x, "modifyIndividualStudentsOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModifyIndividualStudentsOptionsUndefined: Self = StObject.set(x, "modifyIndividualStudentsOptions", js.undefined)
      }
    }
    
    @js.native
    trait ModifyAttachmentsRequest extends StObject {
      
      var addAttachments: js.UndefOr[js.Array[Attachment]] = js.native
    }
    object ModifyAttachmentsRequest {
      
      @scala.inline
      def apply(): ModifyAttachmentsRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModifyAttachmentsRequest]
      }
      
      @scala.inline
      implicit class ModifyAttachmentsRequestMutableBuilder[Self <: ModifyAttachmentsRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddAttachments(value: js.Array[Attachment]): Self = StObject.set(x, "addAttachments", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddAttachmentsUndefined: Self = StObject.set(x, "addAttachments", js.undefined)
        
        @scala.inline
        def setAddAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "addAttachments", js.Array(value :_*))
      }
    }
    
    @js.native
    trait ModifyCourseWorkAssigneesRequest extends StObject {
      
      var assigneeMode: js.UndefOr[String] = js.native
      
      var modifyIndividualStudentsOptions: js.UndefOr[ModifyIndividualStudentsOptions] = js.native
    }
    object ModifyCourseWorkAssigneesRequest {
      
      @scala.inline
      def apply(): ModifyCourseWorkAssigneesRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModifyCourseWorkAssigneesRequest]
      }
      
      @scala.inline
      implicit class ModifyCourseWorkAssigneesRequestMutableBuilder[Self <: ModifyCourseWorkAssigneesRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAssigneeMode(value: String): Self = StObject.set(x, "assigneeMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAssigneeModeUndefined: Self = StObject.set(x, "assigneeMode", js.undefined)
        
        @scala.inline
        def setModifyIndividualStudentsOptions(value: ModifyIndividualStudentsOptions): Self = StObject.set(x, "modifyIndividualStudentsOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModifyIndividualStudentsOptionsUndefined: Self = StObject.set(x, "modifyIndividualStudentsOptions", js.undefined)
      }
    }
    
    @js.native
    trait ModifyIndividualStudentsOptions extends StObject {
      
      var addStudentIds: js.UndefOr[js.Array[String]] = js.native
      
      var removeStudentIds: js.UndefOr[js.Array[String]] = js.native
    }
    object ModifyIndividualStudentsOptions {
      
      @scala.inline
      def apply(): ModifyIndividualStudentsOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModifyIndividualStudentsOptions]
      }
      
      @scala.inline
      implicit class ModifyIndividualStudentsOptionsMutableBuilder[Self <: ModifyIndividualStudentsOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddStudentIds(value: js.Array[String]): Self = StObject.set(x, "addStudentIds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddStudentIdsUndefined: Self = StObject.set(x, "addStudentIds", js.undefined)
        
        @scala.inline
        def setAddStudentIdsVarargs(value: String*): Self = StObject.set(x, "addStudentIds", js.Array(value :_*))
        
        @scala.inline
        def setRemoveStudentIds(value: js.Array[String]): Self = StObject.set(x, "removeStudentIds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRemoveStudentIdsUndefined: Self = StObject.set(x, "removeStudentIds", js.undefined)
        
        @scala.inline
        def setRemoveStudentIdsVarargs(value: String*): Self = StObject.set(x, "removeStudentIds", js.Array(value :_*))
      }
    }
    
    @js.native
    trait MultipleChoiceQuestion extends StObject {
      
      var choices: js.UndefOr[js.Array[String]] = js.native
    }
    object MultipleChoiceQuestion {
      
      @scala.inline
      def apply(): MultipleChoiceQuestion = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MultipleChoiceQuestion]
      }
      
      @scala.inline
      implicit class MultipleChoiceQuestionMutableBuilder[Self <: MultipleChoiceQuestion] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChoices(value: js.Array[String]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
        
        @scala.inline
        def setChoicesVarargs(value: String*): Self = StObject.set(x, "choices", js.Array(value :_*))
      }
    }
    
    @js.native
    trait MultipleChoiceSubmission extends StObject {
      
      var answer: js.UndefOr[String] = js.native
    }
    object MultipleChoiceSubmission {
      
      @scala.inline
      def apply(): MultipleChoiceSubmission = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MultipleChoiceSubmission]
      }
      
      @scala.inline
      implicit class MultipleChoiceSubmissionMutableBuilder[Self <: MultipleChoiceSubmission] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnswer(value: String): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
      }
    }
    
    @js.native
    trait Name extends StObject {
      
      var familyName: js.UndefOr[String] = js.native
      
      var fullName: js.UndefOr[String] = js.native
      
      var givenName: js.UndefOr[String] = js.native
    }
    object Name {
      
      @scala.inline
      def apply(): Name = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Name]
      }
      
      @scala.inline
      implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
        
        @scala.inline
        def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
        
        @scala.inline
        def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
      }
    }
    
    @js.native
    trait Registration extends StObject {
      
      var cloudPubsubTopic: js.UndefOr[CloudPubsubTopic] = js.native
      
      var expiryTime: js.UndefOr[String] = js.native
      
      var feed: js.UndefOr[Feed] = js.native
      
      var registrationId: js.UndefOr[String] = js.native
    }
    object Registration {
      
      @scala.inline
      def apply(): Registration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Registration]
      }
      
      @scala.inline
      implicit class RegistrationMutableBuilder[Self <: Registration] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCloudPubsubTopic(value: CloudPubsubTopic): Self = StObject.set(x, "cloudPubsubTopic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCloudPubsubTopicUndefined: Self = StObject.set(x, "cloudPubsubTopic", js.undefined)
        
        @scala.inline
        def setExpiryTime(value: String): Self = StObject.set(x, "expiryTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpiryTimeUndefined: Self = StObject.set(x, "expiryTime", js.undefined)
        
        @scala.inline
        def setFeed(value: Feed): Self = StObject.set(x, "feed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeedUndefined: Self = StObject.set(x, "feed", js.undefined)
        
        @scala.inline
        def setRegistrationId(value: String): Self = StObject.set(x, "registrationId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegistrationIdUndefined: Self = StObject.set(x, "registrationId", js.undefined)
      }
    }
    
    @js.native
    trait SharedDriveFile extends StObject {
      
      var driveFile: js.UndefOr[DriveFile] = js.native
      
      var shareMode: js.UndefOr[String] = js.native
    }
    object SharedDriveFile {
      
      @scala.inline
      def apply(): SharedDriveFile = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SharedDriveFile]
      }
      
      @scala.inline
      implicit class SharedDriveFileMutableBuilder[Self <: SharedDriveFile] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDriveFile(value: DriveFile): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDriveFileUndefined: Self = StObject.set(x, "driveFile", js.undefined)
        
        @scala.inline
        def setShareMode(value: String): Self = StObject.set(x, "shareMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShareModeUndefined: Self = StObject.set(x, "shareMode", js.undefined)
      }
    }
    
    @js.native
    trait ShortAnswerSubmission extends StObject {
      
      var answer: js.UndefOr[String] = js.native
    }
    object ShortAnswerSubmission {
      
      @scala.inline
      def apply(): ShortAnswerSubmission = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ShortAnswerSubmission]
      }
      
      @scala.inline
      implicit class ShortAnswerSubmissionMutableBuilder[Self <: ShortAnswerSubmission] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnswer(value: String): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
      }
    }
    
    @js.native
    trait StateHistory extends StObject {
      
      var actorUserId: js.UndefOr[String] = js.native
      
      var state: js.UndefOr[String] = js.native
      
      var stateTimestamp: js.UndefOr[String] = js.native
    }
    object StateHistory {
      
      @scala.inline
      def apply(): StateHistory = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StateHistory]
      }
      
      @scala.inline
      implicit class StateHistoryMutableBuilder[Self <: StateHistory] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActorUserId(value: String): Self = StObject.set(x, "actorUserId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActorUserIdUndefined: Self = StObject.set(x, "actorUserId", js.undefined)
        
        @scala.inline
        def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateTimestamp(value: String): Self = StObject.set(x, "stateTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateTimestampUndefined: Self = StObject.set(x, "stateTimestamp", js.undefined)
        
        @scala.inline
        def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      }
    }
    
    @js.native
    trait Student extends StObject {
      
      var courseId: js.UndefOr[String] = js.native
      
      var profile: js.UndefOr[UserProfile] = js.native
      
      var studentWorkFolder: js.UndefOr[DriveFolder] = js.native
      
      var userId: js.UndefOr[String] = js.native
    }
    object Student {
      
      @scala.inline
      def apply(): Student = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Student]
      }
      
      @scala.inline
      implicit class StudentMutableBuilder[Self <: Student] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
        
        @scala.inline
        def setProfile(value: UserProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
        
        @scala.inline
        def setStudentWorkFolder(value: DriveFolder): Self = StObject.set(x, "studentWorkFolder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStudentWorkFolderUndefined: Self = StObject.set(x, "studentWorkFolder", js.undefined)
        
        @scala.inline
        def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    @js.native
    trait StudentSubmission extends StObject {
      
      var alternateLink: js.UndefOr[String] = js.native
      
      var assignedGrade: js.UndefOr[Double] = js.native
      
      var assignmentSubmission: js.UndefOr[AssignmentSubmission] = js.native
      
      var associatedWithDeveloper: js.UndefOr[Boolean] = js.native
      
      var courseId: js.UndefOr[String] = js.native
      
      var courseWorkId: js.UndefOr[String] = js.native
      
      var courseWorkType: js.UndefOr[String] = js.native
      
      var creationTime: js.UndefOr[String] = js.native
      
      var draftGrade: js.UndefOr[Double] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var late: js.UndefOr[Boolean] = js.native
      
      var multipleChoiceSubmission: js.UndefOr[MultipleChoiceSubmission] = js.native
      
      var shortAnswerSubmission: js.UndefOr[ShortAnswerSubmission] = js.native
      
      var state: js.UndefOr[String] = js.native
      
      var submissionHistory: js.UndefOr[js.Array[SubmissionHistory]] = js.native
      
      var updateTime: js.UndefOr[String] = js.native
      
      var userId: js.UndefOr[String] = js.native
    }
    object StudentSubmission {
      
      @scala.inline
      def apply(): StudentSubmission = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StudentSubmission]
      }
      
      @scala.inline
      implicit class StudentSubmissionMutableBuilder[Self <: StudentSubmission] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
        
        @scala.inline
        def setAssignedGrade(value: Double): Self = StObject.set(x, "assignedGrade", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAssignedGradeUndefined: Self = StObject.set(x, "assignedGrade", js.undefined)
        
        @scala.inline
        def setAssignmentSubmission(value: AssignmentSubmission): Self = StObject.set(x, "assignmentSubmission", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAssignmentSubmissionUndefined: Self = StObject.set(x, "assignmentSubmission", js.undefined)
        
        @scala.inline
        def setAssociatedWithDeveloper(value: Boolean): Self = StObject.set(x, "associatedWithDeveloper", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAssociatedWithDeveloperUndefined: Self = StObject.set(x, "associatedWithDeveloper", js.undefined)
        
        @scala.inline
        def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
        
        @scala.inline
        def setCourseWorkId(value: String): Self = StObject.set(x, "courseWorkId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCourseWorkIdUndefined: Self = StObject.set(x, "courseWorkId", js.undefined)
        
        @scala.inline
        def setCourseWorkType(value: String): Self = StObject.set(x, "courseWorkType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCourseWorkTypeUndefined: Self = StObject.set(x, "courseWorkType", js.undefined)
        
        @scala.inline
        def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
        
        @scala.inline
        def setDraftGrade(value: Double): Self = StObject.set(x, "draftGrade", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDraftGradeUndefined: Self = StObject.set(x, "draftGrade", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setLate(value: Boolean): Self = StObject.set(x, "late", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLateUndefined: Self = StObject.set(x, "late", js.undefined)
        
        @scala.inline
        def setMultipleChoiceSubmission(value: MultipleChoiceSubmission): Self = StObject.set(x, "multipleChoiceSubmission", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMultipleChoiceSubmissionUndefined: Self = StObject.set(x, "multipleChoiceSubmission", js.undefined)
        
        @scala.inline
        def setShortAnswerSubmission(value: ShortAnswerSubmission): Self = StObject.set(x, "shortAnswerSubmission", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShortAnswerSubmissionUndefined: Self = StObject.set(x, "shortAnswerSubmission", js.undefined)
        
        @scala.inline
        def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
        
        @scala.inline
        def setSubmissionHistory(value: js.Array[SubmissionHistory]): Self = StObject.set(x, "submissionHistory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubmissionHistoryUndefined: Self = StObject.set(x, "submissionHistory", js.undefined)
        
        @scala.inline
        def setSubmissionHistoryVarargs(value: SubmissionHistory*): Self = StObject.set(x, "submissionHistory", js.Array(value :_*))
        
        @scala.inline
        def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
        
        @scala.inline
        def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    @js.native
    trait SubmissionHistory extends StObject {
      
      var gradeHistory: js.UndefOr[GradeHistory] = js.native
      
      var stateHistory: js.UndefOr[StateHistory] = js.native
    }
    object SubmissionHistory {
      
      @scala.inline
      def apply(): SubmissionHistory = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubmissionHistory]
      }
      
      @scala.inline
      implicit class SubmissionHistoryMutableBuilder[Self <: SubmissionHistory] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGradeHistory(value: GradeHistory): Self = StObject.set(x, "gradeHistory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGradeHistoryUndefined: Self = StObject.set(x, "gradeHistory", js.undefined)
        
        @scala.inline
        def setStateHistory(value: StateHistory): Self = StObject.set(x, "stateHistory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateHistoryUndefined: Self = StObject.set(x, "stateHistory", js.undefined)
      }
    }
    
    @js.native
    trait Teacher extends StObject {
      
      var courseId: js.UndefOr[String] = js.native
      
      var profile: js.UndefOr[UserProfile] = js.native
      
      var userId: js.UndefOr[String] = js.native
    }
    object Teacher {
      
      @scala.inline
      def apply(): Teacher = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Teacher]
      }
      
      @scala.inline
      implicit class TeacherMutableBuilder[Self <: Teacher] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
        
        @scala.inline
        def setProfile(value: UserProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
        
        @scala.inline
        def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    @js.native
    trait TimeOfDay extends StObject {
      
      var hours: js.UndefOr[Double] = js.native
      
      var minutes: js.UndefOr[Double] = js.native
      
      var nanos: js.UndefOr[Double] = js.native
      
      var seconds: js.UndefOr[Double] = js.native
    }
    object TimeOfDay {
      
      @scala.inline
      def apply(): TimeOfDay = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TimeOfDay]
      }
      
      @scala.inline
      implicit class TimeOfDayMutableBuilder[Self <: TimeOfDay] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
        
        @scala.inline
        def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
        
        @scala.inline
        def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
        
        @scala.inline
        def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      }
    }
    
    @js.native
    trait UserProfile extends StObject {
      
      var emailAddress: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var name: js.UndefOr[Name] = js.native
      
      var permissions: js.UndefOr[js.Array[GlobalPermission]] = js.native
      
      var photoUrl: js.UndefOr[String] = js.native
      
      var verifiedTeacher: js.UndefOr[Boolean] = js.native
    }
    object UserProfile {
      
      @scala.inline
      def apply(): UserProfile = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UserProfile]
      }
      
      @scala.inline
      implicit class UserProfileMutableBuilder[Self <: UserProfile] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setPermissions(value: js.Array[GlobalPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
        
        @scala.inline
        def setPermissionsVarargs(value: GlobalPermission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
        
        @scala.inline
        def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
        
        @scala.inline
        def setVerifiedTeacher(value: Boolean): Self = StObject.set(x, "verifiedTeacher", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerifiedTeacherUndefined: Self = StObject.set(x, "verifiedTeacher", js.undefined)
      }
    }
    
    @js.native
    trait YouTubeVideo extends StObject {
      
      var alternateLink: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var thumbnailUrl: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object YouTubeVideo {
      
      @scala.inline
      def apply(): YouTubeVideo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[YouTubeVideo]
      }
      
      @scala.inline
      implicit class YouTubeVideoMutableBuilder[Self <: YouTubeVideo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
  }
}
