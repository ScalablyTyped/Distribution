package typings.googleDashAppsDashScript.GoogleAppsScript

import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Collection.AboutCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Collection.AppsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Collection.ChangesCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Collection.ChannelsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Collection.ChildrenCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Collection.CommentsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Collection.DrivesCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Collection.FilesCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Collection.ParentsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Collection.PermissionsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Collection.PropertiesCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Collection.RealtimeCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Collection.RepliesCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Collection.RevisionsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Collection.TeamdrivesCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Channel
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.ChildReference
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Comment
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.CommentContext
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.CommentReply
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.DriveBackgroundImageFile
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.DriveCapabilities
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.DriveRestrictions
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.File
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.FileCapabilities
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.FileImageMediaMetadata
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.FileImageMediaMetadataLocation
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.FileIndexableText
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.FileLabels
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.FileThumbnail
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.FileVideoMediaMetadata
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.ParentReference
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Permission
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.PermissionPermissionDetails
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.PermissionTeamDrivePermissionDetails
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Property
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Revision
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.TeamDrive
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.TeamDriveBackgroundImageFile
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.TeamDriveCapabilities
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.TeamDriveRestrictions
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.User
import typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.UserPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Drive")
trait Drive_ extends js.Object {
  var About: js.UndefOr[AboutCollection] = js.undefined
  var Apps: js.UndefOr[AppsCollection] = js.undefined
  var Changes: js.UndefOr[ChangesCollection] = js.undefined
  var Channels: js.UndefOr[ChannelsCollection] = js.undefined
  var Children: js.UndefOr[ChildrenCollection] = js.undefined
  var Comments: js.UndefOr[CommentsCollection] = js.undefined
  var Drives: js.UndefOr[DrivesCollection] = js.undefined
  var Files: js.UndefOr[FilesCollection] = js.undefined
  var Parents: js.UndefOr[ParentsCollection] = js.undefined
  var Permissions: js.UndefOr[PermissionsCollection] = js.undefined
  var Properties: js.UndefOr[PropertiesCollection] = js.undefined
  var Realtime: js.UndefOr[RealtimeCollection] = js.undefined
  var Replies: js.UndefOr[RepliesCollection] = js.undefined
  var Revisions: js.UndefOr[RevisionsCollection] = js.undefined
  var Teamdrives: js.UndefOr[TeamdrivesCollection] = js.undefined
  // Create a new instance of Channel
  def newChannel(): Channel
  // Create a new instance of ChildReference
  def newChildReference(): ChildReference
  // Create a new instance of Comment
  def newComment(): Comment
  // Create a new instance of CommentContext
  def newCommentContext(): CommentContext
  // Create a new instance of CommentReply
  def newCommentReply(): CommentReply
  // Create a new instance of Drive
  def newDrive(): typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Drive
  // Create a new instance of DriveBackgroundImageFile
  def newDriveBackgroundImageFile(): DriveBackgroundImageFile
  // Create a new instance of DriveCapabilities
  def newDriveCapabilities(): DriveCapabilities
  // Create a new instance of DriveRestrictions
  def newDriveRestrictions(): DriveRestrictions
  // Create a new instance of File
  def newFile(): File
  // Create a new instance of FileCapabilities
  def newFileCapabilities(): FileCapabilities
  // Create a new instance of FileImageMediaMetadata
  def newFileImageMediaMetadata(): FileImageMediaMetadata
  // Create a new instance of FileImageMediaMetadataLocation
  def newFileImageMediaMetadataLocation(): FileImageMediaMetadataLocation
  // Create a new instance of FileIndexableText
  def newFileIndexableText(): FileIndexableText
  // Create a new instance of FileLabels
  def newFileLabels(): FileLabels
  // Create a new instance of FileThumbnail
  def newFileThumbnail(): FileThumbnail
  // Create a new instance of FileVideoMediaMetadata
  def newFileVideoMediaMetadata(): FileVideoMediaMetadata
  // Create a new instance of ParentReference
  def newParentReference(): ParentReference
  // Create a new instance of Permission
  def newPermission(): Permission
  // Create a new instance of PermissionPermissionDetails
  def newPermissionPermissionDetails(): PermissionPermissionDetails
  // Create a new instance of PermissionTeamDrivePermissionDetails
  def newPermissionTeamDrivePermissionDetails(): PermissionTeamDrivePermissionDetails
  // Create a new instance of Property
  def newProperty(): Property
  // Create a new instance of Revision
  def newRevision(): Revision
  // Create a new instance of TeamDrive
  def newTeamDrive(): TeamDrive
  // Create a new instance of TeamDriveBackgroundImageFile
  def newTeamDriveBackgroundImageFile(): TeamDriveBackgroundImageFile
  // Create a new instance of TeamDriveCapabilities
  def newTeamDriveCapabilities(): TeamDriveCapabilities
  // Create a new instance of TeamDriveRestrictions
  def newTeamDriveRestrictions(): TeamDriveRestrictions
  // Create a new instance of User
  def newUser(): User
  // Create a new instance of UserPicture
  def newUserPicture(): UserPicture
}

object Drive_ {
  @scala.inline
  def apply(
    newChannel: () => Channel,
    newChildReference: () => ChildReference,
    newComment: () => Comment,
    newCommentContext: () => CommentContext,
    newCommentReply: () => CommentReply,
    newDrive: () => typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema.Drive,
    newDriveBackgroundImageFile: () => DriveBackgroundImageFile,
    newDriveCapabilities: () => DriveCapabilities,
    newDriveRestrictions: () => DriveRestrictions,
    newFile: () => File,
    newFileCapabilities: () => FileCapabilities,
    newFileImageMediaMetadata: () => FileImageMediaMetadata,
    newFileImageMediaMetadataLocation: () => FileImageMediaMetadataLocation,
    newFileIndexableText: () => FileIndexableText,
    newFileLabels: () => FileLabels,
    newFileThumbnail: () => FileThumbnail,
    newFileVideoMediaMetadata: () => FileVideoMediaMetadata,
    newParentReference: () => ParentReference,
    newPermission: () => Permission,
    newPermissionPermissionDetails: () => PermissionPermissionDetails,
    newPermissionTeamDrivePermissionDetails: () => PermissionTeamDrivePermissionDetails,
    newProperty: () => Property,
    newRevision: () => Revision,
    newTeamDrive: () => TeamDrive,
    newTeamDriveBackgroundImageFile: () => TeamDriveBackgroundImageFile,
    newTeamDriveCapabilities: () => TeamDriveCapabilities,
    newTeamDriveRestrictions: () => TeamDriveRestrictions,
    newUser: () => User,
    newUserPicture: () => UserPicture,
    About: AboutCollection = null,
    Apps: AppsCollection = null,
    Changes: ChangesCollection = null,
    Channels: ChannelsCollection = null,
    Children: ChildrenCollection = null,
    Comments: CommentsCollection = null,
    Drives: DrivesCollection = null,
    Files: FilesCollection = null,
    Parents: ParentsCollection = null,
    Permissions: PermissionsCollection = null,
    Properties: PropertiesCollection = null,
    Realtime: RealtimeCollection = null,
    Replies: RepliesCollection = null,
    Revisions: RevisionsCollection = null,
    Teamdrives: TeamdrivesCollection = null
  ): Drive_ = {
    val __obj = js.Dynamic.literal(newChannel = js.Any.fromFunction0(newChannel), newChildReference = js.Any.fromFunction0(newChildReference), newComment = js.Any.fromFunction0(newComment), newCommentContext = js.Any.fromFunction0(newCommentContext), newCommentReply = js.Any.fromFunction0(newCommentReply), newDrive = js.Any.fromFunction0(newDrive), newDriveBackgroundImageFile = js.Any.fromFunction0(newDriveBackgroundImageFile), newDriveCapabilities = js.Any.fromFunction0(newDriveCapabilities), newDriveRestrictions = js.Any.fromFunction0(newDriveRestrictions), newFile = js.Any.fromFunction0(newFile), newFileCapabilities = js.Any.fromFunction0(newFileCapabilities), newFileImageMediaMetadata = js.Any.fromFunction0(newFileImageMediaMetadata), newFileImageMediaMetadataLocation = js.Any.fromFunction0(newFileImageMediaMetadataLocation), newFileIndexableText = js.Any.fromFunction0(newFileIndexableText), newFileLabels = js.Any.fromFunction0(newFileLabels), newFileThumbnail = js.Any.fromFunction0(newFileThumbnail), newFileVideoMediaMetadata = js.Any.fromFunction0(newFileVideoMediaMetadata), newParentReference = js.Any.fromFunction0(newParentReference), newPermission = js.Any.fromFunction0(newPermission), newPermissionPermissionDetails = js.Any.fromFunction0(newPermissionPermissionDetails), newPermissionTeamDrivePermissionDetails = js.Any.fromFunction0(newPermissionTeamDrivePermissionDetails), newProperty = js.Any.fromFunction0(newProperty), newRevision = js.Any.fromFunction0(newRevision), newTeamDrive = js.Any.fromFunction0(newTeamDrive), newTeamDriveBackgroundImageFile = js.Any.fromFunction0(newTeamDriveBackgroundImageFile), newTeamDriveCapabilities = js.Any.fromFunction0(newTeamDriveCapabilities), newTeamDriveRestrictions = js.Any.fromFunction0(newTeamDriveRestrictions), newUser = js.Any.fromFunction0(newUser), newUserPicture = js.Any.fromFunction0(newUserPicture))
    if (About != null) __obj.updateDynamic("About")(About.asInstanceOf[js.Any])
    if (Apps != null) __obj.updateDynamic("Apps")(Apps.asInstanceOf[js.Any])
    if (Changes != null) __obj.updateDynamic("Changes")(Changes.asInstanceOf[js.Any])
    if (Channels != null) __obj.updateDynamic("Channels")(Channels.asInstanceOf[js.Any])
    if (Children != null) __obj.updateDynamic("Children")(Children.asInstanceOf[js.Any])
    if (Comments != null) __obj.updateDynamic("Comments")(Comments.asInstanceOf[js.Any])
    if (Drives != null) __obj.updateDynamic("Drives")(Drives.asInstanceOf[js.Any])
    if (Files != null) __obj.updateDynamic("Files")(Files.asInstanceOf[js.Any])
    if (Parents != null) __obj.updateDynamic("Parents")(Parents.asInstanceOf[js.Any])
    if (Permissions != null) __obj.updateDynamic("Permissions")(Permissions.asInstanceOf[js.Any])
    if (Properties != null) __obj.updateDynamic("Properties")(Properties.asInstanceOf[js.Any])
    if (Realtime != null) __obj.updateDynamic("Realtime")(Realtime.asInstanceOf[js.Any])
    if (Replies != null) __obj.updateDynamic("Replies")(Replies.asInstanceOf[js.Any])
    if (Revisions != null) __obj.updateDynamic("Revisions")(Revisions.asInstanceOf[js.Any])
    if (Teamdrives != null) __obj.updateDynamic("Teamdrives")(Teamdrives.asInstanceOf[js.Any])
    __obj.asInstanceOf[Drive_]
  }
}

