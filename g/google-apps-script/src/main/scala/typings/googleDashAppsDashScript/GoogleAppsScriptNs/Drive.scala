package typings.googleDashAppsDashScript.GoogleAppsScriptNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.CollectionNs.AboutCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.CollectionNs.AppsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.CollectionNs.ChangesCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.CollectionNs.ChannelsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.CollectionNs.ChildrenCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.CollectionNs.CommentsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.CollectionNs.DrivesCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.CollectionNs.FilesCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.CollectionNs.ParentsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.CollectionNs.PermissionsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.CollectionNs.PropertiesCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.CollectionNs.RealtimeCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.CollectionNs.RepliesCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.CollectionNs.RevisionsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.CollectionNs.TeamdrivesCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.Channel
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.ChildReference
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.Comment
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.CommentContext
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.CommentReply
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.DriveBackgroundImageFile
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.DriveCapabilities
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.DriveRestrictions
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.File
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.FileCapabilities
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.FileImageMediaMetadata
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.FileImageMediaMetadataLocation
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.FileIndexableText
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.FileLabels
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.FileThumbnail
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.FileVideoMediaMetadata
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.ParentReference
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.Permission
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.PermissionPermissionDetails
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.PermissionTeamDrivePermissionDetails
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.Property
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.Revision
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.TeamDrive
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.TeamDriveBackgroundImageFile
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.TeamDriveCapabilities
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.TeamDriveRestrictions
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.User
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.UserPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Drive extends js.Object {
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
  def newDrive(): typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.Drive
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

object Drive {
  @scala.inline
  def apply(
    newChannel: () => Channel,
    newChildReference: () => ChildReference,
    newComment: () => Comment,
    newCommentContext: () => CommentContext,
    newCommentReply: () => CommentReply,
    newDrive: () => typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.Drive,
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
  ): Drive = {
    val __obj = js.Dynamic.literal(newChannel = js.Any.fromFunction0(newChannel), newChildReference = js.Any.fromFunction0(newChildReference), newComment = js.Any.fromFunction0(newComment), newCommentContext = js.Any.fromFunction0(newCommentContext), newCommentReply = js.Any.fromFunction0(newCommentReply), newDrive = js.Any.fromFunction0(newDrive), newDriveBackgroundImageFile = js.Any.fromFunction0(newDriveBackgroundImageFile), newDriveCapabilities = js.Any.fromFunction0(newDriveCapabilities), newDriveRestrictions = js.Any.fromFunction0(newDriveRestrictions), newFile = js.Any.fromFunction0(newFile), newFileCapabilities = js.Any.fromFunction0(newFileCapabilities), newFileImageMediaMetadata = js.Any.fromFunction0(newFileImageMediaMetadata), newFileImageMediaMetadataLocation = js.Any.fromFunction0(newFileImageMediaMetadataLocation), newFileIndexableText = js.Any.fromFunction0(newFileIndexableText), newFileLabels = js.Any.fromFunction0(newFileLabels), newFileThumbnail = js.Any.fromFunction0(newFileThumbnail), newFileVideoMediaMetadata = js.Any.fromFunction0(newFileVideoMediaMetadata), newParentReference = js.Any.fromFunction0(newParentReference), newPermission = js.Any.fromFunction0(newPermission), newPermissionPermissionDetails = js.Any.fromFunction0(newPermissionPermissionDetails), newPermissionTeamDrivePermissionDetails = js.Any.fromFunction0(newPermissionTeamDrivePermissionDetails), newProperty = js.Any.fromFunction0(newProperty), newRevision = js.Any.fromFunction0(newRevision), newTeamDrive = js.Any.fromFunction0(newTeamDrive), newTeamDriveBackgroundImageFile = js.Any.fromFunction0(newTeamDriveBackgroundImageFile), newTeamDriveCapabilities = js.Any.fromFunction0(newTeamDriveCapabilities), newTeamDriveRestrictions = js.Any.fromFunction0(newTeamDriveRestrictions), newUser = js.Any.fromFunction0(newUser), newUserPicture = js.Any.fromFunction0(newUserPicture))
    if (About != null) __obj.updateDynamic("About")(About)
    if (Apps != null) __obj.updateDynamic("Apps")(Apps)
    if (Changes != null) __obj.updateDynamic("Changes")(Changes)
    if (Channels != null) __obj.updateDynamic("Channels")(Channels)
    if (Children != null) __obj.updateDynamic("Children")(Children)
    if (Comments != null) __obj.updateDynamic("Comments")(Comments)
    if (Drives != null) __obj.updateDynamic("Drives")(Drives)
    if (Files != null) __obj.updateDynamic("Files")(Files)
    if (Parents != null) __obj.updateDynamic("Parents")(Parents)
    if (Permissions != null) __obj.updateDynamic("Permissions")(Permissions)
    if (Properties != null) __obj.updateDynamic("Properties")(Properties)
    if (Realtime != null) __obj.updateDynamic("Realtime")(Realtime)
    if (Replies != null) __obj.updateDynamic("Replies")(Replies)
    if (Revisions != null) __obj.updateDynamic("Revisions")(Revisions)
    if (Teamdrives != null) __obj.updateDynamic("Teamdrives")(Teamdrives)
    __obj.asInstanceOf[Drive]
  }
}

