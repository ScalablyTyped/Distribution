package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import typings.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typings.googleAppsScript.GoogleAppsScript.Base.Date
import typings.googleAppsScript.GoogleAppsScript.Drive.Collection.AboutCollection
import typings.googleAppsScript.GoogleAppsScript.Drive.Collection.AppsCollection
import typings.googleAppsScript.GoogleAppsScript.Drive.Collection.ChangesCollection
import typings.googleAppsScript.GoogleAppsScript.Drive.Collection.ChannelsCollection
import typings.googleAppsScript.GoogleAppsScript.Drive.Collection.ChildrenCollection
import typings.googleAppsScript.GoogleAppsScript.Drive.Collection.CommentsCollection
import typings.googleAppsScript.GoogleAppsScript.Drive.Collection.DrivesCollection
import typings.googleAppsScript.GoogleAppsScript.Drive.Collection.FilesCollection
import typings.googleAppsScript.GoogleAppsScript.Drive.Collection.ParentsCollection
import typings.googleAppsScript.GoogleAppsScript.Drive.Collection.PermissionsCollection
import typings.googleAppsScript.GoogleAppsScript.Drive.Collection.PropertiesCollection
import typings.googleAppsScript.GoogleAppsScript.Drive.Collection.RealtimeCollection
import typings.googleAppsScript.GoogleAppsScript.Drive.Collection.RepliesCollection
import typings.googleAppsScript.GoogleAppsScript.Drive.Collection.RevisionsCollection
import typings.googleAppsScript.GoogleAppsScript.Drive.Collection.TeamdrivesCollection
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.About
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.App
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.AppList
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Change
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.ChangeList
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Channel
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.ChildList
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.ChildReference
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Comment
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.CommentContext
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.CommentList
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.CommentReply
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.CommentReplyList
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.DriveBackgroundImageFile
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.DriveCapabilities
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.DriveList
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.DriveRestrictions
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.FileCapabilities
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.FileImageMediaMetadata
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.FileImageMediaMetadataLocation
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.FileIndexableText
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.FileLabels
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.FileList
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.FileThumbnail
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.FileVideoMediaMetadata
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.GeneratedIds
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.ParentList
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.ParentReference
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.PermissionId
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.PermissionList
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.PermissionPermissionDetails
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.PermissionTeamDrivePermissionDetails
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Property
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.PropertyList
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Revision
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.RevisionList
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.StartPageToken
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.TeamDrive
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.TeamDriveBackgroundImageFile
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.TeamDriveCapabilities
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.TeamDriveList
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.TeamDriveRestrictions
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User
import typings.googleAppsScript.GoogleAppsScript.Drive.Schema.UserPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Drive extends StObject {
  
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
  def newDrive(): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive
  
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
  
  inline def apply(
    newChannel: () => Channel,
    newChildReference: () => ChildReference,
    newComment: () => Comment,
    newCommentContext: () => CommentContext,
    newCommentReply: () => CommentReply,
    newDrive: () => typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive,
    newDriveBackgroundImageFile: () => DriveBackgroundImageFile,
    newDriveCapabilities: () => DriveCapabilities,
    newDriveRestrictions: () => DriveRestrictions,
    newFile: () => typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File,
    newFileCapabilities: () => FileCapabilities,
    newFileImageMediaMetadata: () => FileImageMediaMetadata,
    newFileImageMediaMetadataLocation: () => FileImageMediaMetadataLocation,
    newFileIndexableText: () => FileIndexableText,
    newFileLabels: () => FileLabels,
    newFileThumbnail: () => FileThumbnail,
    newFileVideoMediaMetadata: () => FileVideoMediaMetadata,
    newParentReference: () => ParentReference,
    newPermission: () => typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission,
    newPermissionPermissionDetails: () => PermissionPermissionDetails,
    newPermissionTeamDrivePermissionDetails: () => PermissionTeamDrivePermissionDetails,
    newProperty: () => Property,
    newRevision: () => Revision,
    newTeamDrive: () => TeamDrive,
    newTeamDriveBackgroundImageFile: () => TeamDriveBackgroundImageFile,
    newTeamDriveCapabilities: () => TeamDriveCapabilities,
    newTeamDriveRestrictions: () => TeamDriveRestrictions,
    newUser: () => typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User,
    newUserPicture: () => UserPicture
  ): Drive = {
    val __obj = js.Dynamic.literal(newChannel = js.Any.fromFunction0(newChannel), newChildReference = js.Any.fromFunction0(newChildReference), newComment = js.Any.fromFunction0(newComment), newCommentContext = js.Any.fromFunction0(newCommentContext), newCommentReply = js.Any.fromFunction0(newCommentReply), newDrive = js.Any.fromFunction0(newDrive), newDriveBackgroundImageFile = js.Any.fromFunction0(newDriveBackgroundImageFile), newDriveCapabilities = js.Any.fromFunction0(newDriveCapabilities), newDriveRestrictions = js.Any.fromFunction0(newDriveRestrictions), newFile = js.Any.fromFunction0(newFile), newFileCapabilities = js.Any.fromFunction0(newFileCapabilities), newFileImageMediaMetadata = js.Any.fromFunction0(newFileImageMediaMetadata), newFileImageMediaMetadataLocation = js.Any.fromFunction0(newFileImageMediaMetadataLocation), newFileIndexableText = js.Any.fromFunction0(newFileIndexableText), newFileLabels = js.Any.fromFunction0(newFileLabels), newFileThumbnail = js.Any.fromFunction0(newFileThumbnail), newFileVideoMediaMetadata = js.Any.fromFunction0(newFileVideoMediaMetadata), newParentReference = js.Any.fromFunction0(newParentReference), newPermission = js.Any.fromFunction0(newPermission), newPermissionPermissionDetails = js.Any.fromFunction0(newPermissionPermissionDetails), newPermissionTeamDrivePermissionDetails = js.Any.fromFunction0(newPermissionTeamDrivePermissionDetails), newProperty = js.Any.fromFunction0(newProperty), newRevision = js.Any.fromFunction0(newRevision), newTeamDrive = js.Any.fromFunction0(newTeamDrive), newTeamDriveBackgroundImageFile = js.Any.fromFunction0(newTeamDriveBackgroundImageFile), newTeamDriveCapabilities = js.Any.fromFunction0(newTeamDriveCapabilities), newTeamDriveRestrictions = js.Any.fromFunction0(newTeamDriveRestrictions), newUser = js.Any.fromFunction0(newUser), newUserPicture = js.Any.fromFunction0(newUserPicture))
    __obj.asInstanceOf[Drive]
  }
  
  @js.native
  sealed trait Access extends StObject
  /**
    * An enum representing classes of users who can access a file or folder, besides any individual
    * users who have been explicitly given access. These properties can be accessed from DriveApp.Access.
    *
    *     // Creates a folder that anyone on the Internet can read from and write to. (Domain
    *     // administrators can prohibit this setting for users of a G Suite domain.)
    *     var folder = DriveApp.createFolder('Shared Folder');
    *     folder.setSharing(DriveApp.Access.ANYONE, DriveApp.Permission.EDIT);
    */
  @JSGlobal("GoogleAppsScript.Drive.Access")
  @js.native
  object Access extends StObject {
    
    @js.native
    sealed trait ANYONE
      extends StObject
         with Access
    
    @js.native
    sealed trait ANYONE_WITH_LINK
      extends StObject
         with Access
    
    @js.native
    sealed trait DOMAIN
      extends StObject
         with Access
    
    @js.native
    sealed trait DOMAIN_WITH_LINK
      extends StObject
         with Access
    
    @js.native
    sealed trait PRIVATE
      extends StObject
         with Access
  }
  
  @js.native
  sealed trait Permission extends StObject
  /**
    * An enum representing the permissions granted to users who can access a file or folder, besides
    * any individual users who have been explicitly given access. These properties can be accessed from
    * DriveApp.Permission.
    *
    *     // Creates a folder that anyone on the Internet can read from and write to. (Domain
    *     // administrators can prohibit this setting for G Suite users.)
    *     var folder = DriveApp.createFolder('Shared Folder');
    *     folder.setSharing(DriveApp.Access.ANYONE, DriveApp.Permission.EDIT);
    */
  @JSGlobal("GoogleAppsScript.Drive.Permission")
  @js.native
  object Permission extends StObject {
    
    @js.native
    sealed trait COMMENT
      extends StObject
         with typings.googleAppsScript.GoogleAppsScript.Drive.Permission
    
    @js.native
    sealed trait EDIT
      extends StObject
         with typings.googleAppsScript.GoogleAppsScript.Drive.Permission
    
    @js.native
    sealed trait NONE
      extends StObject
         with typings.googleAppsScript.GoogleAppsScript.Drive.Permission
    
    @js.native
    sealed trait ORGANIZER
      extends StObject
         with typings.googleAppsScript.GoogleAppsScript.Drive.Permission
    
    @js.native
    sealed trait OWNER
      extends StObject
         with typings.googleAppsScript.GoogleAppsScript.Drive.Permission
    
    @js.native
    sealed trait VIEW
      extends StObject
         with typings.googleAppsScript.GoogleAppsScript.Drive.Permission
  }
  
  object Collection {
    
    @js.native
    trait AboutCollection extends StObject {
      
      // Gets the information about the current user along with Drive API settings
      def get(): About = js.native
      // Gets the information about the current user along with Drive API settings
      def get(optionalArgs: js.Object): About = js.native
    }
    
    @js.native
    trait AppsCollection extends StObject {
      
      // Gets a specific app.
      def get(appId: String): App = js.native
      
      // Lists a user's installed apps.
      def list(): AppList = js.native
      // Lists a user's installed apps.
      def list(optionalArgs: js.Object): AppList = js.native
    }
    
    @js.native
    trait ChangesCollection extends StObject {
      
      // Deprecated - Use changes.getStartPageToken and changes.list to retrieve recent changes.
      def get(changeId: String): Change = js.native
      // Deprecated - Use changes.getStartPageToken and changes.list to retrieve recent changes.
      def get(changeId: String, optionalArgs: js.Object): Change = js.native
      
      // Gets the starting pageToken for listing future changes.
      def getStartPageToken(): StartPageToken = js.native
      // Gets the starting pageToken for listing future changes.
      def getStartPageToken(optionalArgs: js.Object): StartPageToken = js.native
      
      // Lists the changes for a user or Team Drive.
      def list(): ChangeList = js.native
      // Lists the changes for a user or Team Drive.
      def list(optionalArgs: js.Object): ChangeList = js.native
      
      // Subscribe to changes for a user.
      def watch(resource: Channel): Channel = js.native
      // Subscribe to changes for a user.
      def watch(resource: Channel, optionalArgs: js.Object): Channel = js.native
    }
    
    trait ChannelsCollection extends StObject {
      
      // Stop watching resources through this channel
      def stop(resource: Channel): Unit
    }
    object ChannelsCollection {
      
      inline def apply(stop: Channel => Unit): ChannelsCollection = {
        val __obj = js.Dynamic.literal(stop = js.Any.fromFunction1(stop))
        __obj.asInstanceOf[ChannelsCollection]
      }
      
      extension [Self <: ChannelsCollection](x: Self) {
        
        inline def setStop(value: Channel => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait ChildrenCollection extends StObject {
      
      // Gets a specific child reference.
      def get(folderId: String, childId: String): ChildReference = js.native
      
      // Inserts a file into a folder.
      def insert(resource: ChildReference, folderId: String): ChildReference = js.native
      // Inserts a file into a folder.
      def insert(resource: ChildReference, folderId: String, optionalArgs: js.Object): ChildReference = js.native
      
      // Lists a folder's children.
      def list(folderId: String): ChildList = js.native
      // Lists a folder's children.
      def list(folderId: String, optionalArgs: js.Object): ChildList = js.native
      
      // Removes a child from a folder.
      def remove(folderId: String, childId: String): Unit = js.native
    }
    
    @js.native
    trait CommentsCollection extends StObject {
      
      // Gets a comment by ID.
      def get(fileId: String, commentId: String): Comment = js.native
      // Gets a comment by ID.
      def get(fileId: String, commentId: String, optionalArgs: js.Object): Comment = js.native
      
      // Creates a new comment on the given file.
      def insert(resource: Comment, fileId: String): Comment = js.native
      
      // Lists a file's comments.
      def list(fileId: String): CommentList = js.native
      // Lists a file's comments.
      def list(fileId: String, optionalArgs: js.Object): CommentList = js.native
      
      // Updates an existing comment. This method supports patch semantics.
      def patch(resource: Comment, fileId: String, commentId: String): Comment = js.native
      
      // Deletes a comment.
      def remove(fileId: String, commentId: String): Unit = js.native
      
      // Updates an existing comment.
      def update(resource: Comment, fileId: String, commentId: String): Comment = js.native
    }
    
    @js.native
    trait DrivesCollection extends StObject {
      
      // Gets a shared drive's metadata by ID.
      def get(driveId: String): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive = js.native
      // Gets a shared drive's metadata by ID.
      def get(driveId: String, optionalArgs: js.Object): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive = js.native
      
      // Hides a shared drive from the default view.
      def hide(driveId: String): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive = js.native
      
      // Creates a new shared drive.
      def insert(resource: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive, requestId: String): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive = js.native
      
      // Lists the user's shared drives.
      def list(): DriveList = js.native
      // Lists the user's shared drives.
      def list(optionalArgs: js.Object): DriveList = js.native
      
      // Permanently deletes a shared drive for which the user is an organizer. The shared drive cannot contain any untrashed items.
      def remove(driveId: String): Unit = js.native
      
      // Restores a shared drive to the default view.
      def unhide(driveId: String): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive = js.native
      
      // Updates the metadata for a shared drive.
      def update(resource: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive, driveId: String): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive = js.native
      // Updates the metadata for a shared drive.
      def update(
        resource: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive,
        driveId: String,
        optionalArgs: js.Object
      ): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive = js.native
    }
    
    @js.native
    trait FilesCollection extends StObject {
      
      // Creates a copy of the specified file.
      def copy(resource: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File, fileId: String): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File = js.native
      // Creates a copy of the specified file.
      def copy(
        resource: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File,
        fileId: String,
        optionalArgs: js.Object
      ): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File = js.native
      
      // Permanently deletes all of the user's trashed files.
      def emptyTrash(): Unit = js.native
      
      // Exports a Google Doc to the requested MIME type and returns the exported content. Please note that the exported content is limited to 10MB.
      def `export`(fileId: String, mimeType: String): Unit = js.native
      
      // Generates a set of file IDs which can be provided in insert requests.
      def generateIds(): GeneratedIds = js.native
      // Generates a set of file IDs which can be provided in insert requests.
      def generateIds(optionalArgs: js.Object): GeneratedIds = js.native
      
      // Gets a file's metadata by ID.
      def get(fileId: String): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File = js.native
      // Gets a file's metadata by ID.
      def get(fileId: String, optionalArgs: js.Object): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File = js.native
      
      // Insert a new file.
      def insert(resource: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File = js.native
      // Insert a new file.
      def insert(resource: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File, mediaData: js.Any): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File = js.native
      // Insert a new file.
      def insert(
        resource: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File,
        mediaData: js.Any,
        optionalArgs: js.Object
      ): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File = js.native
      
      // Lists the user's files.
      def list(): FileList = js.native
      // Lists the user's files.
      def list(optionalArgs: js.Object): FileList = js.native
      
      // Updates file metadata and/or content. This method supports patch semantics.
      def patch(resource: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File, fileId: String): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File = js.native
      // Updates file metadata and/or content. This method supports patch semantics.
      def patch(
        resource: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File,
        fileId: String,
        optionalArgs: js.Object
      ): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File = js.native
      
      // Permanently deletes a file by ID. Skips the trash. The currently authenticated user must own the file or be an organizer on the parent for Team Drive files.
      def remove(fileId: String): Unit = js.native
      // Permanently deletes a file by ID. Skips the trash. The currently authenticated user must own the file or be an organizer on the parent for Team Drive files.
      def remove(fileId: String, optionalArgs: js.Object): Unit = js.native
      
      // Set the file's updated time to the current server time.
      def touch(fileId: String): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File = js.native
      // Set the file's updated time to the current server time.
      def touch(fileId: String, optionalArgs: js.Object): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File = js.native
      
      // Moves a file to the trash. The currently authenticated user must own the file or be at least a fileOrganizer on the parent for Team Drive files.
      def trash(fileId: String): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File = js.native
      // Moves a file to the trash. The currently authenticated user must own the file or be at least a fileOrganizer on the parent for Team Drive files.
      def trash(fileId: String, optionalArgs: js.Object): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File = js.native
      
      // Restores a file from the trash.
      def untrash(fileId: String): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File = js.native
      // Restores a file from the trash.
      def untrash(fileId: String, optionalArgs: js.Object): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File = js.native
      
      // Updates file metadata and/or content.
      def update(resource: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File, fileId: String): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File = js.native
      // Updates file metadata and/or content.
      def update(
        resource: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File,
        fileId: String,
        mediaData: js.Any
      ): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File = js.native
      // Updates file metadata and/or content.
      def update(
        resource: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File,
        fileId: String,
        mediaData: js.Any,
        optionalArgs: js.Object
      ): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File = js.native
      
      // Subscribe to changes on a file
      def watch(resource: Channel, fileId: String): Channel = js.native
      // Subscribe to changes on a file
      def watch(resource: Channel, fileId: String, optionalArgs: js.Object): Channel = js.native
    }
    
    @js.native
    trait ParentsCollection extends StObject {
      
      // Gets a specific parent reference.
      def get(fileId: String, parentId: String): ParentReference = js.native
      
      // Adds a parent folder for a file.
      def insert(resource: ParentReference, fileId: String): ParentReference = js.native
      // Adds a parent folder for a file.
      def insert(resource: ParentReference, fileId: String, optionalArgs: js.Object): ParentReference = js.native
      
      // Lists a file's parents.
      def list(fileId: String): ParentList = js.native
      
      // Removes a parent from a file.
      def remove(fileId: String, parentId: String): Unit = js.native
    }
    
    @js.native
    trait PermissionsCollection extends StObject {
      
      // Gets a permission by ID.
      def get(fileId: String, permissionId: String): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission = js.native
      // Gets a permission by ID.
      def get(fileId: String, permissionId: String, optionalArgs: js.Object): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission = js.native
      
      // Returns the permission ID for an email address.
      def getIdForEmail(email: String): PermissionId = js.native
      
      // Inserts a permission for a file or Team Drive.
      def insert(resource: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission, fileId: String): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission = js.native
      // Inserts a permission for a file or Team Drive.
      def insert(
        resource: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission,
        fileId: String,
        optionalArgs: js.Object
      ): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission = js.native
      
      // Lists a file's or Team Drive's permissions.
      def list(fileId: String): PermissionList = js.native
      // Lists a file's or Team Drive's permissions.
      def list(fileId: String, optionalArgs: js.Object): PermissionList = js.native
      
      // Updates a permission using patch semantics.
      def patch(
        resource: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission,
        fileId: String,
        permissionId: String
      ): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission = js.native
      // Updates a permission using patch semantics.
      def patch(
        resource: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission,
        fileId: String,
        permissionId: String,
        optionalArgs: js.Object
      ): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission = js.native
      
      // Deletes a permission from a file or Team Drive.
      def remove(fileId: String, permissionId: String): Unit = js.native
      // Deletes a permission from a file or Team Drive.
      def remove(fileId: String, permissionId: String, optionalArgs: js.Object): Unit = js.native
      
      // Updates a permission.
      def update(
        resource: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission,
        fileId: String,
        permissionId: String
      ): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission = js.native
      // Updates a permission.
      def update(
        resource: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission,
        fileId: String,
        permissionId: String,
        optionalArgs: js.Object
      ): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission = js.native
    }
    
    @js.native
    trait PropertiesCollection extends StObject {
      
      // Gets a property by its key.
      def get(fileId: String, propertyKey: String): Property = js.native
      // Gets a property by its key.
      def get(fileId: String, propertyKey: String, optionalArgs: js.Object): Property = js.native
      
      // Adds a property to a file, or updates it if it already exists.
      def insert(resource: Property, fileId: String): Property = js.native
      
      // Lists a file's properties.
      def list(fileId: String): PropertyList = js.native
      
      // Updates a property.
      def patch(resource: Property, fileId: String, propertyKey: String): Property = js.native
      // Updates a property.
      def patch(resource: Property, fileId: String, propertyKey: String, optionalArgs: js.Object): Property = js.native
      
      // Deletes a property.
      def remove(fileId: String, propertyKey: String): Unit = js.native
      // Deletes a property.
      def remove(fileId: String, propertyKey: String, optionalArgs: js.Object): Unit = js.native
      
      // Updates a property.
      def update(resource: Property, fileId: String, propertyKey: String): Property = js.native
      // Updates a property.
      def update(resource: Property, fileId: String, propertyKey: String, optionalArgs: js.Object): Property = js.native
    }
    
    @js.native
    trait RealtimeCollection extends StObject {
      
      // Exports the contents of the Realtime API data model associated with this file as JSON.
      def get(fileId: String): Unit = js.native
      // Exports the contents of the Realtime API data model associated with this file as JSON.
      def get(fileId: String, optionalArgs: js.Object): Unit = js.native
      
      // Overwrites the Realtime API data model associated with this file with the provided JSON data model.
      def update(fileId: String): Unit = js.native
      // Overwrites the Realtime API data model associated with this file with the provided JSON data model.
      def update(fileId: String, mediaData: js.Any): Unit = js.native
      // Overwrites the Realtime API data model associated with this file with the provided JSON data model.
      def update(fileId: String, mediaData: js.Any, optionalArgs: js.Object): Unit = js.native
    }
    
    @js.native
    trait RepliesCollection extends StObject {
      
      // Gets a reply.
      def get(fileId: String, commentId: String, replyId: String): CommentReply = js.native
      // Gets a reply.
      def get(fileId: String, commentId: String, replyId: String, optionalArgs: js.Object): CommentReply = js.native
      
      // Creates a new reply to the given comment.
      def insert(resource: CommentReply, fileId: String, commentId: String): CommentReply = js.native
      
      // Lists all of the replies to a comment.
      def list(fileId: String, commentId: String): CommentReplyList = js.native
      // Lists all of the replies to a comment.
      def list(fileId: String, commentId: String, optionalArgs: js.Object): CommentReplyList = js.native
      
      // Updates an existing reply. This method supports patch semantics.
      def patch(resource: CommentReply, fileId: String, commentId: String, replyId: String): CommentReply = js.native
      
      // Deletes a reply.
      def remove(fileId: String, commentId: String, replyId: String): Unit = js.native
      
      // Updates an existing reply.
      def update(resource: CommentReply, fileId: String, commentId: String, replyId: String): CommentReply = js.native
    }
    
    @js.native
    trait RevisionsCollection extends StObject {
      
      // Gets a specific revision.
      def get(fileId: String, revisionId: String): Revision = js.native
      
      // Lists a file's revisions.
      def list(fileId: String): RevisionList = js.native
      // Lists a file's revisions.
      def list(fileId: String, optionalArgs: js.Object): RevisionList = js.native
      
      // Updates a revision. This method supports patch semantics.
      def patch(resource: Revision, fileId: String, revisionId: String): Revision = js.native
      
      // Permanently deletes a file version. You can only delete revisions for files with binary content, like images or videos. Revisions for other files, like Google Docs or Sheets, and the last remaining file version can't be deleted.
      def remove(fileId: String, revisionId: String): Unit = js.native
      
      // Updates a revision.
      def update(resource: Revision, fileId: String, revisionId: String): Revision = js.native
    }
    
    @js.native
    trait TeamdrivesCollection extends StObject {
      
      // Gets a Team Drive's metadata by ID.
      def get(teamDriveId: String): TeamDrive = js.native
      // Gets a Team Drive's metadata by ID.
      def get(teamDriveId: String, optionalArgs: js.Object): TeamDrive = js.native
      
      // Creates a new Team Drive.
      def insert(resource: TeamDrive, requestId: String): TeamDrive = js.native
      
      // Lists the user's Team Drives.
      def list(): TeamDriveList = js.native
      // Lists the user's Team Drives.
      def list(optionalArgs: js.Object): TeamDriveList = js.native
      
      // Permanently deletes a Team Drive for which the user is an organizer. The Team Drive cannot contain any untrashed items.
      def remove(teamDriveId: String): Unit = js.native
      
      // Updates a Team Drive's metadata
      def update(resource: TeamDrive, teamDriveId: String): TeamDrive = js.native
      // Updates a Team Drive's metadata
      def update(resource: TeamDrive, teamDriveId: String, optionalArgs: js.Object): TeamDrive = js.native
    }
  }
  
  /**
    * Allows scripts to create, find, and modify files and folders in Google Drive.
    *
    *     // Log the name of every file in the user's Drive.
    *     var files = DriveApp.getFiles();
    *     while (files.hasNext()) {
    *       var file = files.next();
    *       Logger.log(file.getName());
    *     }
    */
  @js.native
  trait DriveApp extends StObject {
    
    var Access: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Access */ js.Any = js.native
    
    var Permission: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Permission */ js.Any = js.native
    
    /**
      * Adds the given file to the root of the user's Drive.
      * This method does not move the file out of its existing parent folder;
      * a file can have more than one parent simultaneously.
      */
    def addFile(child: typings.googleAppsScript.GoogleAppsScript.Drive.File): Folder = js.native
    
    /**
      * Adds the given folder to the root of the user's Drive.
      * This method does not move the folder out of its existing parent folder;
      * a folder can have more than one parent simultaneously.
      */
    def addFolder(child: Folder): Folder = js.native
    
    /**
      * Resumes a file iteration using a continuation token from a previous iterator.
      * This method is useful if processing an iterator in one execution would exceed
      * the maximum execution time. Continuation tokens are generally valid for one week.
      */
    def continueFileIterator(continuationToken: String): FileIterator = js.native
    
    /**
      * Resumes a folder iteration using a continuation token from a previous iterator.
      * This method is useful if processing an iterator in one execution would exceed
      * the maximum execution time. Continuation tokens are generally valid for one week.
      */
    def continueFolderIterator(continuationToken: String): FolderIterator = js.native
    
    /** Creates a file in the root of the user's Drive from a given Blob of arbitrary data. */
    def createFile(blob: BlobSource): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    /**
      * Creates a text file in the root of the user's Drive with the given name
      * and contents. Throws an exception if content is larger than 50 MB.
      */
    def createFile(name: String, content: String): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    /**
      * Creates a file in the root of the user's Drive with the given name, contents, and MIME type.
      * Throws an exception if content is larger than 10MB.
      */
    def createFile(name: String, content: String, mimeType: String): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    /** Creates a folder in the root of the user's Drive with the given name. */
    def createFolder(name: String): Folder = js.native
    
    /**
      * Gets the file with the given ID.
      * Throws a scripting exception if the file does not exist or
      * the user does not have permission to access it.
      */
    def getFileById(id: String): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    /** Gets a collection of all files in the user's Drive. */
    def getFiles(): FileIterator = js.native
    
    /** Gets a collection of all files in the user's Drive that have the given name. */
    def getFilesByName(name: String): FileIterator = js.native
    
    /** Gets a collection of all files in the user's Drive that have the given MIME type. */
    def getFilesByType(mimeType: String): FileIterator = js.native
    
    /**
      * Gets the folder with the given ID. Throws a scripting exception if the folder
      * does not exist or the user does not have permission to access it.
      */
    def getFolderById(id: String): Folder = js.native
    
    /** Gets a collection of all folders in the user's Drive. */
    def getFolders(): FolderIterator = js.native
    
    /** Gets a collection of all folders in the user's Drive that have the given name. */
    def getFoldersByName(name: String): FolderIterator = js.native
    
    /** Gets the folder at the root of the user's Drive. */
    def getRootFolder(): Folder = js.native
    
    /** Gets the number of bytes the user is allowed to store in Drive. */
    def getStorageLimit(): Integer = js.native
    
    /** Gets the number of bytes the user is currently storing in Drive. */
    def getStorageUsed(): Integer = js.native
    
    /** Gets a collection of all the files in the trash of the user's Drive. */
    def getTrashedFiles(): FileIterator = js.native
    
    /** Gets a collection of all the folders in the trash of the user's Drive. */
    def getTrashedFolders(): FolderIterator = js.native
    
    /**
      * Removes the given file from the root of the user's Drive.
      * This method does not delete the file, but if a file is removed from all
      * of its parents, it cannot be seen in Drive except by searching for it
      * or using the "All items" view.
      */
    def removeFile(child: typings.googleAppsScript.GoogleAppsScript.Drive.File): Folder = js.native
    
    /**
      * Removes the given folder from the root of the user's Drive.
      * This method does not delete the folder or its contents, but if a folder
      * is removed from all of its parents, it cannot be seen in Drive except
      * by searching for it or using the "All items" view.
      */
    def removeFolder(child: Folder): Folder = js.native
    
    /**
      * Gets a collection of all files in the user's Drive that match the given search criteria.
      * The search criteria are detailed the Google Drive SDK documentation.
      * Note that the params argument is a query string that may contain string values,
      * so take care to escape quotation marks correctly
      * (for example "title contains 'Gulliver\\'s Travels'" or 'title contains "Gulliver\'s Travels"').
      */
    def searchFiles(params: String): FileIterator = js.native
    
    /**
      * Gets a collection of all folders in the user's Drive that match the given search criteria.
      * The search criteria are detailed the Google Drive SDK documentation.
      * Note that the params argument is a query string that may contain string values,
      * so take care to escape quotation marks correctly
      * (for example "title contains 'Gulliver\\'s Travels'" or 'title contains "Gulliver\'s Travels"').
      */
    def searchFolders(params: String): FolderIterator = js.native
  }
  
  extension [Self <: Drive](x: Self) {
    
    inline def setAbout(value: AboutCollection): Self = StObject.set(x, "About", value.asInstanceOf[js.Any])
    
    inline def setAboutUndefined: Self = StObject.set(x, "About", js.undefined)
    
    inline def setApps(value: AppsCollection): Self = StObject.set(x, "Apps", value.asInstanceOf[js.Any])
    
    inline def setAppsUndefined: Self = StObject.set(x, "Apps", js.undefined)
    
    inline def setChanges(value: ChangesCollection): Self = StObject.set(x, "Changes", value.asInstanceOf[js.Any])
    
    inline def setChangesUndefined: Self = StObject.set(x, "Changes", js.undefined)
    
    inline def setChannels(value: ChannelsCollection): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    inline def setChildren(value: ChildrenCollection): Self = StObject.set(x, "Children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "Children", js.undefined)
    
    inline def setComments(value: CommentsCollection): Self = StObject.set(x, "Comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "Comments", js.undefined)
    
    inline def setDrives(value: DrivesCollection): Self = StObject.set(x, "Drives", value.asInstanceOf[js.Any])
    
    inline def setDrivesUndefined: Self = StObject.set(x, "Drives", js.undefined)
    
    inline def setFiles(value: FilesCollection): Self = StObject.set(x, "Files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "Files", js.undefined)
    
    inline def setNewChannel(value: () => Channel): Self = StObject.set(x, "newChannel", js.Any.fromFunction0(value))
    
    inline def setNewChildReference(value: () => ChildReference): Self = StObject.set(x, "newChildReference", js.Any.fromFunction0(value))
    
    inline def setNewComment(value: () => Comment): Self = StObject.set(x, "newComment", js.Any.fromFunction0(value))
    
    inline def setNewCommentContext(value: () => CommentContext): Self = StObject.set(x, "newCommentContext", js.Any.fromFunction0(value))
    
    inline def setNewCommentReply(value: () => CommentReply): Self = StObject.set(x, "newCommentReply", js.Any.fromFunction0(value))
    
    inline def setNewDrive(value: () => typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive): Self = StObject.set(x, "newDrive", js.Any.fromFunction0(value))
    
    inline def setNewDriveBackgroundImageFile(value: () => DriveBackgroundImageFile): Self = StObject.set(x, "newDriveBackgroundImageFile", js.Any.fromFunction0(value))
    
    inline def setNewDriveCapabilities(value: () => DriveCapabilities): Self = StObject.set(x, "newDriveCapabilities", js.Any.fromFunction0(value))
    
    inline def setNewDriveRestrictions(value: () => DriveRestrictions): Self = StObject.set(x, "newDriveRestrictions", js.Any.fromFunction0(value))
    
    inline def setNewFile(value: () => typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File): Self = StObject.set(x, "newFile", js.Any.fromFunction0(value))
    
    inline def setNewFileCapabilities(value: () => FileCapabilities): Self = StObject.set(x, "newFileCapabilities", js.Any.fromFunction0(value))
    
    inline def setNewFileImageMediaMetadata(value: () => FileImageMediaMetadata): Self = StObject.set(x, "newFileImageMediaMetadata", js.Any.fromFunction0(value))
    
    inline def setNewFileImageMediaMetadataLocation(value: () => FileImageMediaMetadataLocation): Self = StObject.set(x, "newFileImageMediaMetadataLocation", js.Any.fromFunction0(value))
    
    inline def setNewFileIndexableText(value: () => FileIndexableText): Self = StObject.set(x, "newFileIndexableText", js.Any.fromFunction0(value))
    
    inline def setNewFileLabels(value: () => FileLabels): Self = StObject.set(x, "newFileLabels", js.Any.fromFunction0(value))
    
    inline def setNewFileThumbnail(value: () => FileThumbnail): Self = StObject.set(x, "newFileThumbnail", js.Any.fromFunction0(value))
    
    inline def setNewFileVideoMediaMetadata(value: () => FileVideoMediaMetadata): Self = StObject.set(x, "newFileVideoMediaMetadata", js.Any.fromFunction0(value))
    
    inline def setNewParentReference(value: () => ParentReference): Self = StObject.set(x, "newParentReference", js.Any.fromFunction0(value))
    
    inline def setNewPermission(value: () => typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission): Self = StObject.set(x, "newPermission", js.Any.fromFunction0(value))
    
    inline def setNewPermissionPermissionDetails(value: () => PermissionPermissionDetails): Self = StObject.set(x, "newPermissionPermissionDetails", js.Any.fromFunction0(value))
    
    inline def setNewPermissionTeamDrivePermissionDetails(value: () => PermissionTeamDrivePermissionDetails): Self = StObject.set(x, "newPermissionTeamDrivePermissionDetails", js.Any.fromFunction0(value))
    
    inline def setNewProperty(value: () => Property): Self = StObject.set(x, "newProperty", js.Any.fromFunction0(value))
    
    inline def setNewRevision(value: () => Revision): Self = StObject.set(x, "newRevision", js.Any.fromFunction0(value))
    
    inline def setNewTeamDrive(value: () => TeamDrive): Self = StObject.set(x, "newTeamDrive", js.Any.fromFunction0(value))
    
    inline def setNewTeamDriveBackgroundImageFile(value: () => TeamDriveBackgroundImageFile): Self = StObject.set(x, "newTeamDriveBackgroundImageFile", js.Any.fromFunction0(value))
    
    inline def setNewTeamDriveCapabilities(value: () => TeamDriveCapabilities): Self = StObject.set(x, "newTeamDriveCapabilities", js.Any.fromFunction0(value))
    
    inline def setNewTeamDriveRestrictions(value: () => TeamDriveRestrictions): Self = StObject.set(x, "newTeamDriveRestrictions", js.Any.fromFunction0(value))
    
    inline def setNewUser(value: () => typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User): Self = StObject.set(x, "newUser", js.Any.fromFunction0(value))
    
    inline def setNewUserPicture(value: () => UserPicture): Self = StObject.set(x, "newUserPicture", js.Any.fromFunction0(value))
    
    inline def setParents(value: ParentsCollection): Self = StObject.set(x, "Parents", value.asInstanceOf[js.Any])
    
    inline def setParentsUndefined: Self = StObject.set(x, "Parents", js.undefined)
    
    inline def setPermissions(value: PermissionsCollection): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setProperties(value: PropertiesCollection): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    inline def setRealtime(value: RealtimeCollection): Self = StObject.set(x, "Realtime", value.asInstanceOf[js.Any])
    
    inline def setRealtimeUndefined: Self = StObject.set(x, "Realtime", js.undefined)
    
    inline def setReplies(value: RepliesCollection): Self = StObject.set(x, "Replies", value.asInstanceOf[js.Any])
    
    inline def setRepliesUndefined: Self = StObject.set(x, "Replies", js.undefined)
    
    inline def setRevisions(value: RevisionsCollection): Self = StObject.set(x, "Revisions", value.asInstanceOf[js.Any])
    
    inline def setRevisionsUndefined: Self = StObject.set(x, "Revisions", js.undefined)
    
    inline def setTeamdrives(value: TeamdrivesCollection): Self = StObject.set(x, "Teamdrives", value.asInstanceOf[js.Any])
    
    inline def setTeamdrivesUndefined: Self = StObject.set(x, "Teamdrives", js.undefined)
  }
  
  /**
    * A file in Google Drive. Files can be accessed or created from DriveApp.
    *
    *     // Trash every untitled spreadsheet that hasn't been updated in a week.
    *     var files = DriveApp.getFilesByName('Untitled spreadsheet');
    *     while (files.hasNext()) {
    *       var file = files.next();
    *       if (new Date() - file.getLastUpdated() > 7 * 24 * 60 * 60 * 1000) {
    *         file.setTrashed(true);
    *       }
    *     }
    */
  @js.native
  trait File extends StObject {
    
    def addCommenter(emailAddress: String): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    def addCommenter(user: typings.googleAppsScript.GoogleAppsScript.Base.User): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    def addCommenters(emailAddresses: js.Array[String]): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    def addEditor(emailAddress: String): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    def addEditor(user: typings.googleAppsScript.GoogleAppsScript.Base.User): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    def addEditors(emailAddresses: js.Array[String]): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    def addViewer(emailAddress: String): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    def addViewer(user: typings.googleAppsScript.GoogleAppsScript.Base.User): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    def addViewers(emailAddresses: js.Array[String]): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    def getAccess(email: String): typings.googleAppsScript.GoogleAppsScript.Drive.Permission = js.native
    def getAccess(user: typings.googleAppsScript.GoogleAppsScript.Base.User): typings.googleAppsScript.GoogleAppsScript.Drive.Permission = js.native
    
    def getAs(contentType: String): Blob = js.native
    
    def getBlob(): Blob = js.native
    
    def getDateCreated(): Date = js.native
    
    def getDescription(): String = js.native
    
    def getDownloadUrl(): String = js.native
    
    def getEditors(): js.Array[typings.googleAppsScript.GoogleAppsScript.Drive.User] = js.native
    
    def getId(): String = js.native
    
    def getLastUpdated(): Date = js.native
    
    def getMimeType(): String = js.native
    
    def getName(): String = js.native
    
    def getOwner(): typings.googleAppsScript.GoogleAppsScript.Drive.User = js.native
    
    def getParents(): FolderIterator = js.native
    
    def getSharingAccess(): Access = js.native
    
    def getSharingPermission(): typings.googleAppsScript.GoogleAppsScript.Drive.Permission = js.native
    
    def getSize(): Integer = js.native
    
    def getThumbnail(): Blob = js.native
    
    def getUrl(): String = js.native
    
    def getViewers(): js.Array[typings.googleAppsScript.GoogleAppsScript.Drive.User] = js.native
    
    def isShareableByEditors(): Boolean = js.native
    
    def isStarred(): Boolean = js.native
    
    def isTrashed(): Boolean = js.native
    
    def makeCopy(): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    def makeCopy(destination: Folder): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    def makeCopy(name: String): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    def makeCopy(name: String, destination: Folder): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    def removeCommenter(emailAddress: String): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    def removeCommenter(user: typings.googleAppsScript.GoogleAppsScript.Base.User): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    def removeEditor(emailAddress: String): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    def removeEditor(user: typings.googleAppsScript.GoogleAppsScript.Base.User): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    def removeViewer(emailAddress: String): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    def removeViewer(user: typings.googleAppsScript.GoogleAppsScript.Base.User): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    def revokePermissions(user: String): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    def revokePermissions(user: typings.googleAppsScript.GoogleAppsScript.Base.User): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    def setContent(content: String): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    def setDescription(description: String): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    def setName(name: String): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    def setOwner(emailAddress: String): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    def setOwner(user: typings.googleAppsScript.GoogleAppsScript.Base.User): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    def setShareableByEditors(shareable: Boolean): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    def setSharing(accessType: Access, permissionType: typings.googleAppsScript.GoogleAppsScript.Drive.Permission): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    def setStarred(starred: Boolean): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    def setTrashed(trashed: Boolean): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
  }
  
  /**
    * An iterator that allows scripts to iterate over a potentially large collection of files. File
    * iterators can be acccessed from DriveApp or a Folder.
    *
    *     // Log the name of every file in the user's Drive.
    *     var files = DriveApp.getFiles();
    *     while (files.hasNext()) {
    *       var file = files.next();
    *       Logger.log(file.getName());
    *     }
    */
  trait FileIterator extends StObject {
    
    /**
      * Gets a token that can be used to resume this iteration at a later time.
      * This method is useful if processing an iterator in one execution would
      * exceed the maximum execution time. Continuation tokens are generally valid for one week.
      */
    def getContinuationToken(): String
    
    /** Determines whether calling next() will return an item. */
    def hasNext(): Boolean
    
    /**
      * Gets the next item in the collection of files or folders.
      * Throws an exception if no items remain.
      */
    def next(): typings.googleAppsScript.GoogleAppsScript.Drive.File
  }
  object FileIterator {
    
    inline def apply(
      getContinuationToken: () => String,
      hasNext: () => Boolean,
      next: () => typings.googleAppsScript.GoogleAppsScript.Drive.File
    ): FileIterator = {
      val __obj = js.Dynamic.literal(getContinuationToken = js.Any.fromFunction0(getContinuationToken), hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[FileIterator]
    }
    
    extension [Self <: FileIterator](x: Self) {
      
      inline def setGetContinuationToken(value: () => String): Self = StObject.set(x, "getContinuationToken", js.Any.fromFunction0(value))
      
      inline def setHasNext(value: () => Boolean): Self = StObject.set(x, "hasNext", js.Any.fromFunction0(value))
      
      inline def setNext(value: () => typings.googleAppsScript.GoogleAppsScript.Drive.File): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * A folder in Google Drive. Folders can be accessed or created from DriveApp.
    *
    *     // Log the name of every folder in the user's Drive.
    *     var folders = DriveApp.getFolders();
    *     while (folders.hasNext()) {
    *       var folder = folders.next();
    *       Logger.log(folder.getName());
    *     }
    */
  @js.native
  trait Folder extends StObject {
    
    def addEditor(emailAddress: String): Folder = js.native
    def addEditor(user: typings.googleAppsScript.GoogleAppsScript.Base.User): Folder = js.native
    
    def addEditors(emailAddresses: js.Array[String]): Folder = js.native
    
    def addFile(child: typings.googleAppsScript.GoogleAppsScript.Drive.File): Folder = js.native
    
    def addFolder(child: Folder): Folder = js.native
    
    def addViewer(emailAddress: String): Folder = js.native
    def addViewer(user: typings.googleAppsScript.GoogleAppsScript.Base.User): Folder = js.native
    
    def addViewers(emailAddresses: js.Array[String]): Folder = js.native
    
    def createFile(blob: BlobSource): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    def createFile(name: String, content: String): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    def createFile(name: String, content: String, mimeType: String): typings.googleAppsScript.GoogleAppsScript.Drive.File = js.native
    
    def createFolder(name: String): Folder = js.native
    
    def getAccess(email: String): typings.googleAppsScript.GoogleAppsScript.Drive.Permission = js.native
    def getAccess(user: typings.googleAppsScript.GoogleAppsScript.Base.User): typings.googleAppsScript.GoogleAppsScript.Drive.Permission = js.native
    
    def getDateCreated(): Date = js.native
    
    def getDescription(): String | Null = js.native
    
    def getEditors(): js.Array[typings.googleAppsScript.GoogleAppsScript.Drive.User] = js.native
    
    def getFiles(): FileIterator = js.native
    
    def getFilesByName(name: String): FileIterator = js.native
    
    def getFilesByType(mimeType: String): FileIterator = js.native
    
    def getFolders(): FolderIterator = js.native
    
    def getFoldersByName(name: String): FolderIterator = js.native
    
    def getId(): String = js.native
    
    def getLastUpdated(): Date = js.native
    
    def getName(): String = js.native
    
    def getOwner(): typings.googleAppsScript.GoogleAppsScript.Drive.User = js.native
    
    def getParents(): FolderIterator = js.native
    
    def getSharingAccess(): Access = js.native
    
    def getSharingPermission(): typings.googleAppsScript.GoogleAppsScript.Drive.Permission = js.native
    
    def getSize(): Integer = js.native
    
    def getUrl(): String = js.native
    
    def getViewers(): js.Array[typings.googleAppsScript.GoogleAppsScript.Drive.User] = js.native
    
    def isShareableByEditors(): Boolean = js.native
    
    def isStarred(): Boolean = js.native
    
    def isTrashed(): Boolean = js.native
    
    def removeEditor(emailAddress: String): Folder = js.native
    def removeEditor(user: typings.googleAppsScript.GoogleAppsScript.Base.User): Folder = js.native
    
    def removeFile(child: typings.googleAppsScript.GoogleAppsScript.Drive.File): Folder = js.native
    
    def removeFolder(child: Folder): Folder = js.native
    
    def removeViewer(emailAddress: String): Folder = js.native
    def removeViewer(user: typings.googleAppsScript.GoogleAppsScript.Base.User): Folder = js.native
    
    def revokePermissions(user: String): Folder = js.native
    def revokePermissions(user: typings.googleAppsScript.GoogleAppsScript.Base.User): Folder = js.native
    
    def searchFiles(params: String): FileIterator = js.native
    
    def searchFolders(params: String): FolderIterator = js.native
    
    def setDescription(description: String): Folder = js.native
    
    def setName(name: String): Folder = js.native
    
    def setOwner(emailAddress: String): Folder = js.native
    def setOwner(user: typings.googleAppsScript.GoogleAppsScript.Base.User): Folder = js.native
    
    def setShareableByEditors(shareable: Boolean): Folder = js.native
    
    def setSharing(accessType: Access, permissionType: typings.googleAppsScript.GoogleAppsScript.Drive.Permission): Folder = js.native
    
    def setStarred(starred: Boolean): Folder = js.native
    
    def setTrashed(trashed: Boolean): Folder = js.native
  }
  
  /**
    * An object that allows scripts to iterate over a potentially large collection of folders. Folder
    * iterators can be acccessed from DriveApp, a File, or a Folder.
    *
    *     // Log the name of every folder in the user's Drive.
    *     var folders = DriveApp.getFolders();
    *     while (folders.hasNext()) {
    *       var folder = folders.next();
    *       Logger.log(folder.getName());
    *     }
    */
  trait FolderIterator extends StObject {
    
    def getContinuationToken(): String
    
    def hasNext(): Boolean
    
    def next(): Folder
  }
  object FolderIterator {
    
    inline def apply(getContinuationToken: () => String, hasNext: () => Boolean, next: () => Folder): FolderIterator = {
      val __obj = js.Dynamic.literal(getContinuationToken = js.Any.fromFunction0(getContinuationToken), hasNext = js.Any.fromFunction0(hasNext), next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[FolderIterator]
    }
    
    extension [Self <: FolderIterator](x: Self) {
      
      inline def setGetContinuationToken(value: () => String): Self = StObject.set(x, "getContinuationToken", js.Any.fromFunction0(value))
      
      inline def setHasNext(value: () => Boolean): Self = StObject.set(x, "hasNext", js.Any.fromFunction0(value))
      
      inline def setNext(value: () => Folder): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
  
  object Schema {
    
    trait About extends StObject {
      
      var additionalRoleInfo: js.UndefOr[js.Array[AboutAdditionalRoleInfo]] = js.undefined
      
      var canCreateDrives: js.UndefOr[Boolean] = js.undefined
      
      var canCreateTeamDrives: js.UndefOr[Boolean] = js.undefined
      
      var domainSharingPolicy: js.UndefOr[String] = js.undefined
      
      var driveThemes: js.UndefOr[js.Array[AboutDriveThemes]] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var exportFormats: js.UndefOr[js.Array[AboutExportFormats]] = js.undefined
      
      var features: js.UndefOr[js.Array[AboutFeatures]] = js.undefined
      
      var folderColorPalette: js.UndefOr[js.Array[String]] = js.undefined
      
      var importFormats: js.UndefOr[js.Array[AboutImportFormats]] = js.undefined
      
      var isCurrentAppInstalled: js.UndefOr[Boolean] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var languageCode: js.UndefOr[String] = js.undefined
      
      var largestChangeId: js.UndefOr[String] = js.undefined
      
      var maxUploadSizes: js.UndefOr[js.Array[AboutMaxUploadSizes]] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var permissionId: js.UndefOr[String] = js.undefined
      
      var quotaBytesByService: js.UndefOr[js.Array[AboutQuotaBytesByService]] = js.undefined
      
      var quotaBytesTotal: js.UndefOr[String] = js.undefined
      
      var quotaBytesUsed: js.UndefOr[String] = js.undefined
      
      var quotaBytesUsedAggregate: js.UndefOr[String] = js.undefined
      
      var quotaBytesUsedInTrash: js.UndefOr[String] = js.undefined
      
      var quotaType: js.UndefOr[String] = js.undefined
      
      var remainingChangeIds: js.UndefOr[String] = js.undefined
      
      var rootFolderId: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
      
      var teamDriveThemes: js.UndefOr[js.Array[AboutTeamDriveThemes]] = js.undefined
      
      var user: js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User] = js.undefined
    }
    object About {
      
      inline def apply(): About = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[About]
      }
      
      extension [Self <: About](x: Self) {
        
        inline def setAdditionalRoleInfo(value: js.Array[AboutAdditionalRoleInfo]): Self = StObject.set(x, "additionalRoleInfo", value.asInstanceOf[js.Any])
        
        inline def setAdditionalRoleInfoUndefined: Self = StObject.set(x, "additionalRoleInfo", js.undefined)
        
        inline def setAdditionalRoleInfoVarargs(value: AboutAdditionalRoleInfo*): Self = StObject.set(x, "additionalRoleInfo", js.Array(value :_*))
        
        inline def setCanCreateDrives(value: Boolean): Self = StObject.set(x, "canCreateDrives", value.asInstanceOf[js.Any])
        
        inline def setCanCreateDrivesUndefined: Self = StObject.set(x, "canCreateDrives", js.undefined)
        
        inline def setCanCreateTeamDrives(value: Boolean): Self = StObject.set(x, "canCreateTeamDrives", value.asInstanceOf[js.Any])
        
        inline def setCanCreateTeamDrivesUndefined: Self = StObject.set(x, "canCreateTeamDrives", js.undefined)
        
        inline def setDomainSharingPolicy(value: String): Self = StObject.set(x, "domainSharingPolicy", value.asInstanceOf[js.Any])
        
        inline def setDomainSharingPolicyUndefined: Self = StObject.set(x, "domainSharingPolicy", js.undefined)
        
        inline def setDriveThemes(value: js.Array[AboutDriveThemes]): Self = StObject.set(x, "driveThemes", value.asInstanceOf[js.Any])
        
        inline def setDriveThemesUndefined: Self = StObject.set(x, "driveThemes", js.undefined)
        
        inline def setDriveThemesVarargs(value: AboutDriveThemes*): Self = StObject.set(x, "driveThemes", js.Array(value :_*))
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setExportFormats(value: js.Array[AboutExportFormats]): Self = StObject.set(x, "exportFormats", value.asInstanceOf[js.Any])
        
        inline def setExportFormatsUndefined: Self = StObject.set(x, "exportFormats", js.undefined)
        
        inline def setExportFormatsVarargs(value: AboutExportFormats*): Self = StObject.set(x, "exportFormats", js.Array(value :_*))
        
        inline def setFeatures(value: js.Array[AboutFeatures]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
        
        inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
        
        inline def setFeaturesVarargs(value: AboutFeatures*): Self = StObject.set(x, "features", js.Array(value :_*))
        
        inline def setFolderColorPalette(value: js.Array[String]): Self = StObject.set(x, "folderColorPalette", value.asInstanceOf[js.Any])
        
        inline def setFolderColorPaletteUndefined: Self = StObject.set(x, "folderColorPalette", js.undefined)
        
        inline def setFolderColorPaletteVarargs(value: String*): Self = StObject.set(x, "folderColorPalette", js.Array(value :_*))
        
        inline def setImportFormats(value: js.Array[AboutImportFormats]): Self = StObject.set(x, "importFormats", value.asInstanceOf[js.Any])
        
        inline def setImportFormatsUndefined: Self = StObject.set(x, "importFormats", js.undefined)
        
        inline def setImportFormatsVarargs(value: AboutImportFormats*): Self = StObject.set(x, "importFormats", js.Array(value :_*))
        
        inline def setIsCurrentAppInstalled(value: Boolean): Self = StObject.set(x, "isCurrentAppInstalled", value.asInstanceOf[js.Any])
        
        inline def setIsCurrentAppInstalledUndefined: Self = StObject.set(x, "isCurrentAppInstalled", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
        
        inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
        
        inline def setLargestChangeId(value: String): Self = StObject.set(x, "largestChangeId", value.asInstanceOf[js.Any])
        
        inline def setLargestChangeIdUndefined: Self = StObject.set(x, "largestChangeId", js.undefined)
        
        inline def setMaxUploadSizes(value: js.Array[AboutMaxUploadSizes]): Self = StObject.set(x, "maxUploadSizes", value.asInstanceOf[js.Any])
        
        inline def setMaxUploadSizesUndefined: Self = StObject.set(x, "maxUploadSizes", js.undefined)
        
        inline def setMaxUploadSizesVarargs(value: AboutMaxUploadSizes*): Self = StObject.set(x, "maxUploadSizes", js.Array(value :_*))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
        
        inline def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
        
        inline def setQuotaBytesByService(value: js.Array[AboutQuotaBytesByService]): Self = StObject.set(x, "quotaBytesByService", value.asInstanceOf[js.Any])
        
        inline def setQuotaBytesByServiceUndefined: Self = StObject.set(x, "quotaBytesByService", js.undefined)
        
        inline def setQuotaBytesByServiceVarargs(value: AboutQuotaBytesByService*): Self = StObject.set(x, "quotaBytesByService", js.Array(value :_*))
        
        inline def setQuotaBytesTotal(value: String): Self = StObject.set(x, "quotaBytesTotal", value.asInstanceOf[js.Any])
        
        inline def setQuotaBytesTotalUndefined: Self = StObject.set(x, "quotaBytesTotal", js.undefined)
        
        inline def setQuotaBytesUsed(value: String): Self = StObject.set(x, "quotaBytesUsed", value.asInstanceOf[js.Any])
        
        inline def setQuotaBytesUsedAggregate(value: String): Self = StObject.set(x, "quotaBytesUsedAggregate", value.asInstanceOf[js.Any])
        
        inline def setQuotaBytesUsedAggregateUndefined: Self = StObject.set(x, "quotaBytesUsedAggregate", js.undefined)
        
        inline def setQuotaBytesUsedInTrash(value: String): Self = StObject.set(x, "quotaBytesUsedInTrash", value.asInstanceOf[js.Any])
        
        inline def setQuotaBytesUsedInTrashUndefined: Self = StObject.set(x, "quotaBytesUsedInTrash", js.undefined)
        
        inline def setQuotaBytesUsedUndefined: Self = StObject.set(x, "quotaBytesUsed", js.undefined)
        
        inline def setQuotaType(value: String): Self = StObject.set(x, "quotaType", value.asInstanceOf[js.Any])
        
        inline def setQuotaTypeUndefined: Self = StObject.set(x, "quotaType", js.undefined)
        
        inline def setRemainingChangeIds(value: String): Self = StObject.set(x, "remainingChangeIds", value.asInstanceOf[js.Any])
        
        inline def setRemainingChangeIdsUndefined: Self = StObject.set(x, "remainingChangeIds", js.undefined)
        
        inline def setRootFolderId(value: String): Self = StObject.set(x, "rootFolderId", value.asInstanceOf[js.Any])
        
        inline def setRootFolderIdUndefined: Self = StObject.set(x, "rootFolderId", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
        
        inline def setTeamDriveThemes(value: js.Array[AboutTeamDriveThemes]): Self = StObject.set(x, "teamDriveThemes", value.asInstanceOf[js.Any])
        
        inline def setTeamDriveThemesUndefined: Self = StObject.set(x, "teamDriveThemes", js.undefined)
        
        inline def setTeamDriveThemesVarargs(value: AboutTeamDriveThemes*): Self = StObject.set(x, "teamDriveThemes", js.Array(value :_*))
        
        inline def setUser(value: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      }
    }
    
    trait AboutAdditionalRoleInfo extends StObject {
      
      var roleSets: js.UndefOr[js.Array[AboutAdditionalRoleInfoRoleSets]] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object AboutAdditionalRoleInfo {
      
      inline def apply(): AboutAdditionalRoleInfo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AboutAdditionalRoleInfo]
      }
      
      extension [Self <: AboutAdditionalRoleInfo](x: Self) {
        
        inline def setRoleSets(value: js.Array[AboutAdditionalRoleInfoRoleSets]): Self = StObject.set(x, "roleSets", value.asInstanceOf[js.Any])
        
        inline def setRoleSetsUndefined: Self = StObject.set(x, "roleSets", js.undefined)
        
        inline def setRoleSetsVarargs(value: AboutAdditionalRoleInfoRoleSets*): Self = StObject.set(x, "roleSets", js.Array(value :_*))
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait AboutAdditionalRoleInfoRoleSets extends StObject {
      
      var additionalRoles: js.UndefOr[js.Array[String]] = js.undefined
      
      var primaryRole: js.UndefOr[String] = js.undefined
    }
    object AboutAdditionalRoleInfoRoleSets {
      
      inline def apply(): AboutAdditionalRoleInfoRoleSets = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AboutAdditionalRoleInfoRoleSets]
      }
      
      extension [Self <: AboutAdditionalRoleInfoRoleSets](x: Self) {
        
        inline def setAdditionalRoles(value: js.Array[String]): Self = StObject.set(x, "additionalRoles", value.asInstanceOf[js.Any])
        
        inline def setAdditionalRolesUndefined: Self = StObject.set(x, "additionalRoles", js.undefined)
        
        inline def setAdditionalRolesVarargs(value: String*): Self = StObject.set(x, "additionalRoles", js.Array(value :_*))
        
        inline def setPrimaryRole(value: String): Self = StObject.set(x, "primaryRole", value.asInstanceOf[js.Any])
        
        inline def setPrimaryRoleUndefined: Self = StObject.set(x, "primaryRole", js.undefined)
      }
    }
    
    trait AboutDriveThemes extends StObject {
      
      var backgroundImageLink: js.UndefOr[String] = js.undefined
      
      var colorRgb: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
    }
    object AboutDriveThemes {
      
      inline def apply(): AboutDriveThemes = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AboutDriveThemes]
      }
      
      extension [Self <: AboutDriveThemes](x: Self) {
        
        inline def setBackgroundImageLink(value: String): Self = StObject.set(x, "backgroundImageLink", value.asInstanceOf[js.Any])
        
        inline def setBackgroundImageLinkUndefined: Self = StObject.set(x, "backgroundImageLink", js.undefined)
        
        inline def setColorRgb(value: String): Self = StObject.set(x, "colorRgb", value.asInstanceOf[js.Any])
        
        inline def setColorRgbUndefined: Self = StObject.set(x, "colorRgb", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      }
    }
    
    trait AboutExportFormats extends StObject {
      
      var source: js.UndefOr[String] = js.undefined
      
      var targets: js.UndefOr[js.Array[String]] = js.undefined
    }
    object AboutExportFormats {
      
      inline def apply(): AboutExportFormats = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AboutExportFormats]
      }
      
      extension [Self <: AboutExportFormats](x: Self) {
        
        inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
        
        inline def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
        
        inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
        
        inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value :_*))
      }
    }
    
    trait AboutFeatures extends StObject {
      
      var featureName: js.UndefOr[String] = js.undefined
      
      var featureRate: js.UndefOr[Double] = js.undefined
    }
    object AboutFeatures {
      
      inline def apply(): AboutFeatures = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AboutFeatures]
      }
      
      extension [Self <: AboutFeatures](x: Self) {
        
        inline def setFeatureName(value: String): Self = StObject.set(x, "featureName", value.asInstanceOf[js.Any])
        
        inline def setFeatureNameUndefined: Self = StObject.set(x, "featureName", js.undefined)
        
        inline def setFeatureRate(value: Double): Self = StObject.set(x, "featureRate", value.asInstanceOf[js.Any])
        
        inline def setFeatureRateUndefined: Self = StObject.set(x, "featureRate", js.undefined)
      }
    }
    
    trait AboutImportFormats extends StObject {
      
      var source: js.UndefOr[String] = js.undefined
      
      var targets: js.UndefOr[js.Array[String]] = js.undefined
    }
    object AboutImportFormats {
      
      inline def apply(): AboutImportFormats = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AboutImportFormats]
      }
      
      extension [Self <: AboutImportFormats](x: Self) {
        
        inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
        
        inline def setTargets(value: js.Array[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
        
        inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
        
        inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value :_*))
      }
    }
    
    trait AboutMaxUploadSizes extends StObject {
      
      var size: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object AboutMaxUploadSizes {
      
      inline def apply(): AboutMaxUploadSizes = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AboutMaxUploadSizes]
      }
      
      extension [Self <: AboutMaxUploadSizes](x: Self) {
        
        inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait AboutQuotaBytesByService extends StObject {
      
      var bytesUsed: js.UndefOr[String] = js.undefined
      
      var serviceName: js.UndefOr[String] = js.undefined
    }
    object AboutQuotaBytesByService {
      
      inline def apply(): AboutQuotaBytesByService = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AboutQuotaBytesByService]
      }
      
      extension [Self <: AboutQuotaBytesByService](x: Self) {
        
        inline def setBytesUsed(value: String): Self = StObject.set(x, "bytesUsed", value.asInstanceOf[js.Any])
        
        inline def setBytesUsedUndefined: Self = StObject.set(x, "bytesUsed", js.undefined)
        
        inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
        
        inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
      }
    }
    
    trait AboutTeamDriveThemes extends StObject {
      
      var backgroundImageLink: js.UndefOr[String] = js.undefined
      
      var colorRgb: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
    }
    object AboutTeamDriveThemes {
      
      inline def apply(): AboutTeamDriveThemes = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AboutTeamDriveThemes]
      }
      
      extension [Self <: AboutTeamDriveThemes](x: Self) {
        
        inline def setBackgroundImageLink(value: String): Self = StObject.set(x, "backgroundImageLink", value.asInstanceOf[js.Any])
        
        inline def setBackgroundImageLinkUndefined: Self = StObject.set(x, "backgroundImageLink", js.undefined)
        
        inline def setColorRgb(value: String): Self = StObject.set(x, "colorRgb", value.asInstanceOf[js.Any])
        
        inline def setColorRgbUndefined: Self = StObject.set(x, "colorRgb", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      }
    }
    
    trait App extends StObject {
      
      var authorized: js.UndefOr[Boolean] = js.undefined
      
      var createInFolderTemplate: js.UndefOr[String] = js.undefined
      
      var createUrl: js.UndefOr[String] = js.undefined
      
      var hasDriveWideScope: js.UndefOr[Boolean] = js.undefined
      
      var icons: js.UndefOr[js.Array[AppIcons]] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var installed: js.UndefOr[Boolean] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var longDescription: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var objectType: js.UndefOr[String] = js.undefined
      
      var openUrlTemplate: js.UndefOr[String] = js.undefined
      
      var primaryFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
      
      var primaryMimeTypes: js.UndefOr[js.Array[String]] = js.undefined
      
      var productId: js.UndefOr[String] = js.undefined
      
      var productUrl: js.UndefOr[String] = js.undefined
      
      var secondaryFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
      
      var secondaryMimeTypes: js.UndefOr[js.Array[String]] = js.undefined
      
      var shortDescription: js.UndefOr[String] = js.undefined
      
      var supportsCreate: js.UndefOr[Boolean] = js.undefined
      
      var supportsImport: js.UndefOr[Boolean] = js.undefined
      
      var supportsMultiOpen: js.UndefOr[Boolean] = js.undefined
      
      var supportsOfflineCreate: js.UndefOr[Boolean] = js.undefined
      
      var useByDefault: js.UndefOr[Boolean] = js.undefined
    }
    object App {
      
      inline def apply(): App = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[App]
      }
      
      extension [Self <: App](x: Self) {
        
        inline def setAuthorized(value: Boolean): Self = StObject.set(x, "authorized", value.asInstanceOf[js.Any])
        
        inline def setAuthorizedUndefined: Self = StObject.set(x, "authorized", js.undefined)
        
        inline def setCreateInFolderTemplate(value: String): Self = StObject.set(x, "createInFolderTemplate", value.asInstanceOf[js.Any])
        
        inline def setCreateInFolderTemplateUndefined: Self = StObject.set(x, "createInFolderTemplate", js.undefined)
        
        inline def setCreateUrl(value: String): Self = StObject.set(x, "createUrl", value.asInstanceOf[js.Any])
        
        inline def setCreateUrlUndefined: Self = StObject.set(x, "createUrl", js.undefined)
        
        inline def setHasDriveWideScope(value: Boolean): Self = StObject.set(x, "hasDriveWideScope", value.asInstanceOf[js.Any])
        
        inline def setHasDriveWideScopeUndefined: Self = StObject.set(x, "hasDriveWideScope", js.undefined)
        
        inline def setIcons(value: js.Array[AppIcons]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
        
        inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
        
        inline def setIconsVarargs(value: AppIcons*): Self = StObject.set(x, "icons", js.Array(value :_*))
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setInstalled(value: Boolean): Self = StObject.set(x, "installed", value.asInstanceOf[js.Any])
        
        inline def setInstalledUndefined: Self = StObject.set(x, "installed", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLongDescription(value: String): Self = StObject.set(x, "longDescription", value.asInstanceOf[js.Any])
        
        inline def setLongDescriptionUndefined: Self = StObject.set(x, "longDescription", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
        
        inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
        
        inline def setOpenUrlTemplate(value: String): Self = StObject.set(x, "openUrlTemplate", value.asInstanceOf[js.Any])
        
        inline def setOpenUrlTemplateUndefined: Self = StObject.set(x, "openUrlTemplate", js.undefined)
        
        inline def setPrimaryFileExtensions(value: js.Array[String]): Self = StObject.set(x, "primaryFileExtensions", value.asInstanceOf[js.Any])
        
        inline def setPrimaryFileExtensionsUndefined: Self = StObject.set(x, "primaryFileExtensions", js.undefined)
        
        inline def setPrimaryFileExtensionsVarargs(value: String*): Self = StObject.set(x, "primaryFileExtensions", js.Array(value :_*))
        
        inline def setPrimaryMimeTypes(value: js.Array[String]): Self = StObject.set(x, "primaryMimeTypes", value.asInstanceOf[js.Any])
        
        inline def setPrimaryMimeTypesUndefined: Self = StObject.set(x, "primaryMimeTypes", js.undefined)
        
        inline def setPrimaryMimeTypesVarargs(value: String*): Self = StObject.set(x, "primaryMimeTypes", js.Array(value :_*))
        
        inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
        
        inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
        
        inline def setProductUrl(value: String): Self = StObject.set(x, "productUrl", value.asInstanceOf[js.Any])
        
        inline def setProductUrlUndefined: Self = StObject.set(x, "productUrl", js.undefined)
        
        inline def setSecondaryFileExtensions(value: js.Array[String]): Self = StObject.set(x, "secondaryFileExtensions", value.asInstanceOf[js.Any])
        
        inline def setSecondaryFileExtensionsUndefined: Self = StObject.set(x, "secondaryFileExtensions", js.undefined)
        
        inline def setSecondaryFileExtensionsVarargs(value: String*): Self = StObject.set(x, "secondaryFileExtensions", js.Array(value :_*))
        
        inline def setSecondaryMimeTypes(value: js.Array[String]): Self = StObject.set(x, "secondaryMimeTypes", value.asInstanceOf[js.Any])
        
        inline def setSecondaryMimeTypesUndefined: Self = StObject.set(x, "secondaryMimeTypes", js.undefined)
        
        inline def setSecondaryMimeTypesVarargs(value: String*): Self = StObject.set(x, "secondaryMimeTypes", js.Array(value :_*))
        
        inline def setShortDescription(value: String): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
        
        inline def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
        
        inline def setSupportsCreate(value: Boolean): Self = StObject.set(x, "supportsCreate", value.asInstanceOf[js.Any])
        
        inline def setSupportsCreateUndefined: Self = StObject.set(x, "supportsCreate", js.undefined)
        
        inline def setSupportsImport(value: Boolean): Self = StObject.set(x, "supportsImport", value.asInstanceOf[js.Any])
        
        inline def setSupportsImportUndefined: Self = StObject.set(x, "supportsImport", js.undefined)
        
        inline def setSupportsMultiOpen(value: Boolean): Self = StObject.set(x, "supportsMultiOpen", value.asInstanceOf[js.Any])
        
        inline def setSupportsMultiOpenUndefined: Self = StObject.set(x, "supportsMultiOpen", js.undefined)
        
        inline def setSupportsOfflineCreate(value: Boolean): Self = StObject.set(x, "supportsOfflineCreate", value.asInstanceOf[js.Any])
        
        inline def setSupportsOfflineCreateUndefined: Self = StObject.set(x, "supportsOfflineCreate", js.undefined)
        
        inline def setUseByDefault(value: Boolean): Self = StObject.set(x, "useByDefault", value.asInstanceOf[js.Any])
        
        inline def setUseByDefaultUndefined: Self = StObject.set(x, "useByDefault", js.undefined)
      }
    }
    
    trait AppIcons extends StObject {
      
      var category: js.UndefOr[String] = js.undefined
      
      var iconUrl: js.UndefOr[String] = js.undefined
      
      var size: js.UndefOr[Double] = js.undefined
    }
    object AppIcons {
      
      inline def apply(): AppIcons = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AppIcons]
      }
      
      extension [Self <: AppIcons](x: Self) {
        
        inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
        
        inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
        
        inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
        
        inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      }
    }
    
    trait AppList extends StObject {
      
      var defaultAppIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[App]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
    }
    object AppList {
      
      inline def apply(): AppList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AppList]
      }
      
      extension [Self <: AppList](x: Self) {
        
        inline def setDefaultAppIds(value: js.Array[String]): Self = StObject.set(x, "defaultAppIds", value.asInstanceOf[js.Any])
        
        inline def setDefaultAppIdsUndefined: Self = StObject.set(x, "defaultAppIds", js.undefined)
        
        inline def setDefaultAppIdsVarargs(value: String*): Self = StObject.set(x, "defaultAppIds", js.Array(value :_*))
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[App]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: App*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
      }
    }
    
    trait Change extends StObject {
      
      var deleted: js.UndefOr[Boolean] = js.undefined
      
      var drive: js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive] = js.undefined
      
      var driveId: js.UndefOr[String] = js.undefined
      
      var file: js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File] = js.undefined
      
      var fileId: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var modificationDate: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
      
      var teamDrive: js.UndefOr[TeamDrive] = js.undefined
      
      var teamDriveId: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Change {
      
      inline def apply(): Change = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Change]
      }
      
      extension [Self <: Change](x: Self) {
        
        inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
        
        inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
        
        inline def setDrive(value: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive): Self = StObject.set(x, "drive", value.asInstanceOf[js.Any])
        
        inline def setDriveId(value: String): Self = StObject.set(x, "driveId", value.asInstanceOf[js.Any])
        
        inline def setDriveIdUndefined: Self = StObject.set(x, "driveId", js.undefined)
        
        inline def setDriveUndefined: Self = StObject.set(x, "drive", js.undefined)
        
        inline def setFile(value: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
        
        inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
        
        inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
        
        inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setModificationDate(value: String): Self = StObject.set(x, "modificationDate", value.asInstanceOf[js.Any])
        
        inline def setModificationDateUndefined: Self = StObject.set(x, "modificationDate", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
        
        inline def setTeamDrive(value: TeamDrive): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
        
        inline def setTeamDriveId(value: String): Self = StObject.set(x, "teamDriveId", value.asInstanceOf[js.Any])
        
        inline def setTeamDriveIdUndefined: Self = StObject.set(x, "teamDriveId", js.undefined)
        
        inline def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait ChangeList extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[Change]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var largestChangeId: js.UndefOr[String] = js.undefined
      
      var newStartPageToken: js.UndefOr[String] = js.undefined
      
      var nextLink: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
    }
    object ChangeList {
      
      inline def apply(): ChangeList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChangeList]
      }
      
      extension [Self <: ChangeList](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[Change]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Change*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLargestChangeId(value: String): Self = StObject.set(x, "largestChangeId", value.asInstanceOf[js.Any])
        
        inline def setLargestChangeIdUndefined: Self = StObject.set(x, "largestChangeId", js.undefined)
        
        inline def setNewStartPageToken(value: String): Self = StObject.set(x, "newStartPageToken", value.asInstanceOf[js.Any])
        
        inline def setNewStartPageTokenUndefined: Self = StObject.set(x, "newStartPageToken", js.undefined)
        
        inline def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
        
        inline def setNextLinkUndefined: Self = StObject.set(x, "nextLink", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
      }
    }
    
    trait Channel extends StObject {
      
      var address: js.UndefOr[String] = js.undefined
      
      var expiration: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var params: js.UndefOr[js.Object] = js.undefined
      
      var payload: js.UndefOr[Boolean] = js.undefined
      
      var resourceId: js.UndefOr[String] = js.undefined
      
      var resourceUri: js.UndefOr[String] = js.undefined
      
      var token: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Channel {
      
      inline def apply(): Channel = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Channel]
      }
      
      extension [Self <: Channel](x: Self) {
        
        inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
        
        inline def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
        
        inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        inline def setPayload(value: Boolean): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
        
        inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
        
        inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
        
        inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
        
        inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
        
        inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
        
        inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait ChildList extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[ChildReference]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextLink: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
    }
    object ChildList {
      
      inline def apply(): ChildList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChildList]
      }
      
      extension [Self <: ChildList](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[ChildReference]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: ChildReference*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
        
        inline def setNextLinkUndefined: Self = StObject.set(x, "nextLink", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
      }
    }
    
    trait ChildReference extends StObject {
      
      var childLink: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
    }
    object ChildReference {
      
      inline def apply(): ChildReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChildReference]
      }
      
      extension [Self <: ChildReference](x: Self) {
        
        inline def setChildLink(value: String): Self = StObject.set(x, "childLink", value.asInstanceOf[js.Any])
        
        inline def setChildLinkUndefined: Self = StObject.set(x, "childLink", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
      }
    }
    
    trait Comment extends StObject {
      
      var anchor: js.UndefOr[String] = js.undefined
      
      var author: js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User] = js.undefined
      
      var commentId: js.UndefOr[String] = js.undefined
      
      var content: js.UndefOr[String] = js.undefined
      
      var context: js.UndefOr[CommentContext] = js.undefined
      
      var createdDate: js.UndefOr[String] = js.undefined
      
      var deleted: js.UndefOr[Boolean] = js.undefined
      
      var fileId: js.UndefOr[String] = js.undefined
      
      var fileTitle: js.UndefOr[String] = js.undefined
      
      var htmlContent: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var modifiedDate: js.UndefOr[String] = js.undefined
      
      var replies: js.UndefOr[js.Array[CommentReply]] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
      
      var status: js.UndefOr[String] = js.undefined
    }
    object Comment {
      
      inline def apply(): Comment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Comment]
      }
      
      extension [Self <: Comment](x: Self) {
        
        inline def setAnchor(value: String): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
        
        inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
        
        inline def setAuthor(value: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
        
        inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
        
        inline def setCommentId(value: String): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
        
        inline def setCommentIdUndefined: Self = StObject.set(x, "commentId", js.undefined)
        
        inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setContext(value: CommentContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
        
        inline def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
        
        inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
        
        inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
        
        inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
        
        inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
        
        inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
        
        inline def setFileTitle(value: String): Self = StObject.set(x, "fileTitle", value.asInstanceOf[js.Any])
        
        inline def setFileTitleUndefined: Self = StObject.set(x, "fileTitle", js.undefined)
        
        inline def setHtmlContent(value: String): Self = StObject.set(x, "htmlContent", value.asInstanceOf[js.Any])
        
        inline def setHtmlContentUndefined: Self = StObject.set(x, "htmlContent", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setModifiedDate(value: String): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
        
        inline def setModifiedDateUndefined: Self = StObject.set(x, "modifiedDate", js.undefined)
        
        inline def setReplies(value: js.Array[CommentReply]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
        
        inline def setRepliesUndefined: Self = StObject.set(x, "replies", js.undefined)
        
        inline def setRepliesVarargs(value: CommentReply*): Self = StObject.set(x, "replies", js.Array(value :_*))
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
        
        inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    trait CommentContext extends StObject {
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object CommentContext {
      
      inline def apply(): CommentContext = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CommentContext]
      }
      
      extension [Self <: CommentContext](x: Self) {
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait CommentList extends StObject {
      
      var items: js.UndefOr[js.Array[Comment]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextLink: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
    }
    object CommentList {
      
      inline def apply(): CommentList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CommentList]
      }
      
      extension [Self <: CommentList](x: Self) {
        
        inline def setItems(value: js.Array[Comment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Comment*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
        
        inline def setNextLinkUndefined: Self = StObject.set(x, "nextLink", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
      }
    }
    
    trait CommentReply extends StObject {
      
      var author: js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User] = js.undefined
      
      var content: js.UndefOr[String] = js.undefined
      
      var createdDate: js.UndefOr[String] = js.undefined
      
      var deleted: js.UndefOr[Boolean] = js.undefined
      
      var htmlContent: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var modifiedDate: js.UndefOr[String] = js.undefined
      
      var replyId: js.UndefOr[String] = js.undefined
      
      var verb: js.UndefOr[String] = js.undefined
    }
    object CommentReply {
      
      inline def apply(): CommentReply = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CommentReply]
      }
      
      extension [Self <: CommentReply](x: Self) {
        
        inline def setAuthor(value: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
        
        inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
        
        inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
        
        inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
        
        inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
        
        inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
        
        inline def setHtmlContent(value: String): Self = StObject.set(x, "htmlContent", value.asInstanceOf[js.Any])
        
        inline def setHtmlContentUndefined: Self = StObject.set(x, "htmlContent", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setModifiedDate(value: String): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
        
        inline def setModifiedDateUndefined: Self = StObject.set(x, "modifiedDate", js.undefined)
        
        inline def setReplyId(value: String): Self = StObject.set(x, "replyId", value.asInstanceOf[js.Any])
        
        inline def setReplyIdUndefined: Self = StObject.set(x, "replyId", js.undefined)
        
        inline def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
        
        inline def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
      }
    }
    
    trait CommentReplyList extends StObject {
      
      var items: js.UndefOr[js.Array[CommentReply]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextLink: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
    }
    object CommentReplyList {
      
      inline def apply(): CommentReplyList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CommentReplyList]
      }
      
      extension [Self <: CommentReplyList](x: Self) {
        
        inline def setItems(value: js.Array[CommentReply]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: CommentReply*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
        
        inline def setNextLinkUndefined: Self = StObject.set(x, "nextLink", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
      }
    }
    
    trait Drive extends StObject {
      
      var backgroundImageFile: js.UndefOr[DriveBackgroundImageFile] = js.undefined
      
      var backgroundImageLink: js.UndefOr[String] = js.undefined
      
      var capabilities: js.UndefOr[DriveCapabilities] = js.undefined
      
      var colorRgb: js.UndefOr[String] = js.undefined
      
      var createdDate: js.UndefOr[String] = js.undefined
      
      var hidden: js.UndefOr[Boolean] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var restrictions: js.UndefOr[DriveRestrictions] = js.undefined
      
      var themeId: js.UndefOr[String] = js.undefined
    }
    object Drive {
      
      inline def apply(): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive]
      }
      
      extension [Self <: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive](x: Self) {
        
        inline def setBackgroundImageFile(value: DriveBackgroundImageFile): Self = StObject.set(x, "backgroundImageFile", value.asInstanceOf[js.Any])
        
        inline def setBackgroundImageFileUndefined: Self = StObject.set(x, "backgroundImageFile", js.undefined)
        
        inline def setBackgroundImageLink(value: String): Self = StObject.set(x, "backgroundImageLink", value.asInstanceOf[js.Any])
        
        inline def setBackgroundImageLinkUndefined: Self = StObject.set(x, "backgroundImageLink", js.undefined)
        
        inline def setCapabilities(value: DriveCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
        
        inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
        
        inline def setColorRgb(value: String): Self = StObject.set(x, "colorRgb", value.asInstanceOf[js.Any])
        
        inline def setColorRgbUndefined: Self = StObject.set(x, "colorRgb", js.undefined)
        
        inline def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
        
        inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
        
        inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
        
        inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setRestrictions(value: DriveRestrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
        
        inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
        
        inline def setThemeId(value: String): Self = StObject.set(x, "themeId", value.asInstanceOf[js.Any])
        
        inline def setThemeIdUndefined: Self = StObject.set(x, "themeId", js.undefined)
      }
    }
    
    trait DriveBackgroundImageFile extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var width: js.UndefOr[Double] = js.undefined
      
      var xCoordinate: js.UndefOr[Double] = js.undefined
      
      var yCoordinate: js.UndefOr[Double] = js.undefined
    }
    object DriveBackgroundImageFile {
      
      inline def apply(): DriveBackgroundImageFile = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DriveBackgroundImageFile]
      }
      
      extension [Self <: DriveBackgroundImageFile](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        inline def setXCoordinate(value: Double): Self = StObject.set(x, "xCoordinate", value.asInstanceOf[js.Any])
        
        inline def setXCoordinateUndefined: Self = StObject.set(x, "xCoordinate", js.undefined)
        
        inline def setYCoordinate(value: Double): Self = StObject.set(x, "yCoordinate", value.asInstanceOf[js.Any])
        
        inline def setYCoordinateUndefined: Self = StObject.set(x, "yCoordinate", js.undefined)
      }
    }
    
    trait DriveCapabilities extends StObject {
      
      var canAddChildren: js.UndefOr[Boolean] = js.undefined
      
      var canChangeCopyRequiresWriterPermissionRestriction: js.UndefOr[Boolean] = js.undefined
      
      var canChangeDomainUsersOnlyRestriction: js.UndefOr[Boolean] = js.undefined
      
      var canChangeDriveBackground: js.UndefOr[Boolean] = js.undefined
      
      var canChangeDriveMembersOnlyRestriction: js.UndefOr[Boolean] = js.undefined
      
      var canComment: js.UndefOr[Boolean] = js.undefined
      
      var canCopy: js.UndefOr[Boolean] = js.undefined
      
      var canDeleteChildren: js.UndefOr[Boolean] = js.undefined
      
      var canDeleteDrive: js.UndefOr[Boolean] = js.undefined
      
      var canDownload: js.UndefOr[Boolean] = js.undefined
      
      var canEdit: js.UndefOr[Boolean] = js.undefined
      
      var canListChildren: js.UndefOr[Boolean] = js.undefined
      
      var canManageMembers: js.UndefOr[Boolean] = js.undefined
      
      var canReadRevisions: js.UndefOr[Boolean] = js.undefined
      
      var canRename: js.UndefOr[Boolean] = js.undefined
      
      var canRenameDrive: js.UndefOr[Boolean] = js.undefined
      
      var canShare: js.UndefOr[Boolean] = js.undefined
      
      var canTrashChildren: js.UndefOr[Boolean] = js.undefined
    }
    object DriveCapabilities {
      
      inline def apply(): DriveCapabilities = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DriveCapabilities]
      }
      
      extension [Self <: DriveCapabilities](x: Self) {
        
        inline def setCanAddChildren(value: Boolean): Self = StObject.set(x, "canAddChildren", value.asInstanceOf[js.Any])
        
        inline def setCanAddChildrenUndefined: Self = StObject.set(x, "canAddChildren", js.undefined)
        
        inline def setCanChangeCopyRequiresWriterPermissionRestriction(value: Boolean): Self = StObject.set(x, "canChangeCopyRequiresWriterPermissionRestriction", value.asInstanceOf[js.Any])
        
        inline def setCanChangeCopyRequiresWriterPermissionRestrictionUndefined: Self = StObject.set(x, "canChangeCopyRequiresWriterPermissionRestriction", js.undefined)
        
        inline def setCanChangeDomainUsersOnlyRestriction(value: Boolean): Self = StObject.set(x, "canChangeDomainUsersOnlyRestriction", value.asInstanceOf[js.Any])
        
        inline def setCanChangeDomainUsersOnlyRestrictionUndefined: Self = StObject.set(x, "canChangeDomainUsersOnlyRestriction", js.undefined)
        
        inline def setCanChangeDriveBackground(value: Boolean): Self = StObject.set(x, "canChangeDriveBackground", value.asInstanceOf[js.Any])
        
        inline def setCanChangeDriveBackgroundUndefined: Self = StObject.set(x, "canChangeDriveBackground", js.undefined)
        
        inline def setCanChangeDriveMembersOnlyRestriction(value: Boolean): Self = StObject.set(x, "canChangeDriveMembersOnlyRestriction", value.asInstanceOf[js.Any])
        
        inline def setCanChangeDriveMembersOnlyRestrictionUndefined: Self = StObject.set(x, "canChangeDriveMembersOnlyRestriction", js.undefined)
        
        inline def setCanComment(value: Boolean): Self = StObject.set(x, "canComment", value.asInstanceOf[js.Any])
        
        inline def setCanCommentUndefined: Self = StObject.set(x, "canComment", js.undefined)
        
        inline def setCanCopy(value: Boolean): Self = StObject.set(x, "canCopy", value.asInstanceOf[js.Any])
        
        inline def setCanCopyUndefined: Self = StObject.set(x, "canCopy", js.undefined)
        
        inline def setCanDeleteChildren(value: Boolean): Self = StObject.set(x, "canDeleteChildren", value.asInstanceOf[js.Any])
        
        inline def setCanDeleteChildrenUndefined: Self = StObject.set(x, "canDeleteChildren", js.undefined)
        
        inline def setCanDeleteDrive(value: Boolean): Self = StObject.set(x, "canDeleteDrive", value.asInstanceOf[js.Any])
        
        inline def setCanDeleteDriveUndefined: Self = StObject.set(x, "canDeleteDrive", js.undefined)
        
        inline def setCanDownload(value: Boolean): Self = StObject.set(x, "canDownload", value.asInstanceOf[js.Any])
        
        inline def setCanDownloadUndefined: Self = StObject.set(x, "canDownload", js.undefined)
        
        inline def setCanEdit(value: Boolean): Self = StObject.set(x, "canEdit", value.asInstanceOf[js.Any])
        
        inline def setCanEditUndefined: Self = StObject.set(x, "canEdit", js.undefined)
        
        inline def setCanListChildren(value: Boolean): Self = StObject.set(x, "canListChildren", value.asInstanceOf[js.Any])
        
        inline def setCanListChildrenUndefined: Self = StObject.set(x, "canListChildren", js.undefined)
        
        inline def setCanManageMembers(value: Boolean): Self = StObject.set(x, "canManageMembers", value.asInstanceOf[js.Any])
        
        inline def setCanManageMembersUndefined: Self = StObject.set(x, "canManageMembers", js.undefined)
        
        inline def setCanReadRevisions(value: Boolean): Self = StObject.set(x, "canReadRevisions", value.asInstanceOf[js.Any])
        
        inline def setCanReadRevisionsUndefined: Self = StObject.set(x, "canReadRevisions", js.undefined)
        
        inline def setCanRename(value: Boolean): Self = StObject.set(x, "canRename", value.asInstanceOf[js.Any])
        
        inline def setCanRenameDrive(value: Boolean): Self = StObject.set(x, "canRenameDrive", value.asInstanceOf[js.Any])
        
        inline def setCanRenameDriveUndefined: Self = StObject.set(x, "canRenameDrive", js.undefined)
        
        inline def setCanRenameUndefined: Self = StObject.set(x, "canRename", js.undefined)
        
        inline def setCanShare(value: Boolean): Self = StObject.set(x, "canShare", value.asInstanceOf[js.Any])
        
        inline def setCanShareUndefined: Self = StObject.set(x, "canShare", js.undefined)
        
        inline def setCanTrashChildren(value: Boolean): Self = StObject.set(x, "canTrashChildren", value.asInstanceOf[js.Any])
        
        inline def setCanTrashChildrenUndefined: Self = StObject.set(x, "canTrashChildren", js.undefined)
      }
    }
    
    trait DriveList extends StObject {
      
      var items: js.UndefOr[js.Array[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object DriveList {
      
      inline def apply(): DriveList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DriveList]
      }
      
      extension [Self <: DriveList](x: Self) {
        
        inline def setItems(value: js.Array[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Drive*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait DriveRestrictions extends StObject {
      
      var adminManagedRestrictions: js.UndefOr[Boolean] = js.undefined
      
      var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined
      
      var domainUsersOnly: js.UndefOr[Boolean] = js.undefined
      
      var driveMembersOnly: js.UndefOr[Boolean] = js.undefined
    }
    object DriveRestrictions {
      
      inline def apply(): DriveRestrictions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DriveRestrictions]
      }
      
      extension [Self <: DriveRestrictions](x: Self) {
        
        inline def setAdminManagedRestrictions(value: Boolean): Self = StObject.set(x, "adminManagedRestrictions", value.asInstanceOf[js.Any])
        
        inline def setAdminManagedRestrictionsUndefined: Self = StObject.set(x, "adminManagedRestrictions", js.undefined)
        
        inline def setCopyRequiresWriterPermission(value: Boolean): Self = StObject.set(x, "copyRequiresWriterPermission", value.asInstanceOf[js.Any])
        
        inline def setCopyRequiresWriterPermissionUndefined: Self = StObject.set(x, "copyRequiresWriterPermission", js.undefined)
        
        inline def setDomainUsersOnly(value: Boolean): Self = StObject.set(x, "domainUsersOnly", value.asInstanceOf[js.Any])
        
        inline def setDomainUsersOnlyUndefined: Self = StObject.set(x, "domainUsersOnly", js.undefined)
        
        inline def setDriveMembersOnly(value: Boolean): Self = StObject.set(x, "driveMembersOnly", value.asInstanceOf[js.Any])
        
        inline def setDriveMembersOnlyUndefined: Self = StObject.set(x, "driveMembersOnly", js.undefined)
      }
    }
    
    trait File extends StObject {
      
      var alternateLink: js.UndefOr[String] = js.undefined
      
      var appDataContents: js.UndefOr[Boolean] = js.undefined
      
      var canComment: js.UndefOr[Boolean] = js.undefined
      
      var canReadRevisions: js.UndefOr[Boolean] = js.undefined
      
      var capabilities: js.UndefOr[FileCapabilities] = js.undefined
      
      var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined
      
      var copyable: js.UndefOr[Boolean] = js.undefined
      
      var createdDate: js.UndefOr[String] = js.undefined
      
      var defaultOpenWithLink: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var downloadUrl: js.UndefOr[String] = js.undefined
      
      var driveId: js.UndefOr[String] = js.undefined
      
      var editable: js.UndefOr[Boolean] = js.undefined
      
      var embedLink: js.UndefOr[String] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var explicitlyTrashed: js.UndefOr[Boolean] = js.undefined
      
      var exportLinks: js.UndefOr[js.Object] = js.undefined
      
      var fileExtension: js.UndefOr[String] = js.undefined
      
      var fileSize: js.UndefOr[String] = js.undefined
      
      var folderColorRgb: js.UndefOr[String] = js.undefined
      
      var fullFileExtension: js.UndefOr[String] = js.undefined
      
      var hasAugmentedPermissions: js.UndefOr[Boolean] = js.undefined
      
      var hasThumbnail: js.UndefOr[Boolean] = js.undefined
      
      var headRevisionId: js.UndefOr[String] = js.undefined
      
      var iconLink: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var imageMediaMetadata: js.UndefOr[FileImageMediaMetadata] = js.undefined
      
      var indexableText: js.UndefOr[FileIndexableText] = js.undefined
      
      var isAppAuthorized: js.UndefOr[Boolean] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var labels: js.UndefOr[FileLabels] = js.undefined
      
      var lastModifyingUser: js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User] = js.undefined
      
      var lastModifyingUserName: js.UndefOr[String] = js.undefined
      
      var lastViewedByMeDate: js.UndefOr[String] = js.undefined
      
      var markedViewedByMeDate: js.UndefOr[String] = js.undefined
      
      var md5Checksum: js.UndefOr[String] = js.undefined
      
      var mimeType: js.UndefOr[String] = js.undefined
      
      var modifiedByMeDate: js.UndefOr[String] = js.undefined
      
      var modifiedDate: js.UndefOr[String] = js.undefined
      
      var openWithLinks: js.UndefOr[js.Object] = js.undefined
      
      var originalFilename: js.UndefOr[String] = js.undefined
      
      var ownedByMe: js.UndefOr[Boolean] = js.undefined
      
      var ownerNames: js.UndefOr[js.Array[String]] = js.undefined
      
      var owners: js.UndefOr[js.Array[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User]] = js.undefined
      
      var parents: js.UndefOr[js.Array[ParentReference]] = js.undefined
      
      var permissionIds: js.UndefOr[js.Array[String]] = js.undefined
      
      var permissions: js.UndefOr[js.Array[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission]] = js.undefined
      
      var properties: js.UndefOr[js.Array[Property]] = js.undefined
      
      var quotaBytesUsed: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
      
      var shareable: js.UndefOr[Boolean] = js.undefined
      
      var shared: js.UndefOr[Boolean] = js.undefined
      
      var sharedWithMeDate: js.UndefOr[String] = js.undefined
      
      var sharingUser: js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User] = js.undefined
      
      var spaces: js.UndefOr[js.Array[String]] = js.undefined
      
      var teamDriveId: js.UndefOr[String] = js.undefined
      
      var thumbnail: js.UndefOr[FileThumbnail] = js.undefined
      
      var thumbnailLink: js.UndefOr[String] = js.undefined
      
      var thumbnailVersion: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var trashedDate: js.UndefOr[String] = js.undefined
      
      var trashingUser: js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User] = js.undefined
      
      var userPermission: js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission] = js.undefined
      
      var version: js.UndefOr[String] = js.undefined
      
      var videoMediaMetadata: js.UndefOr[FileVideoMediaMetadata] = js.undefined
      
      var webContentLink: js.UndefOr[String] = js.undefined
      
      var webViewLink: js.UndefOr[String] = js.undefined
      
      var writersCanShare: js.UndefOr[Boolean] = js.undefined
    }
    object File {
      
      inline def apply(): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File]
      }
      
      extension [Self <: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File](x: Self) {
        
        inline def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
        
        inline def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
        
        inline def setAppDataContents(value: Boolean): Self = StObject.set(x, "appDataContents", value.asInstanceOf[js.Any])
        
        inline def setAppDataContentsUndefined: Self = StObject.set(x, "appDataContents", js.undefined)
        
        inline def setCanComment(value: Boolean): Self = StObject.set(x, "canComment", value.asInstanceOf[js.Any])
        
        inline def setCanCommentUndefined: Self = StObject.set(x, "canComment", js.undefined)
        
        inline def setCanReadRevisions(value: Boolean): Self = StObject.set(x, "canReadRevisions", value.asInstanceOf[js.Any])
        
        inline def setCanReadRevisionsUndefined: Self = StObject.set(x, "canReadRevisions", js.undefined)
        
        inline def setCapabilities(value: FileCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
        
        inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
        
        inline def setCopyRequiresWriterPermission(value: Boolean): Self = StObject.set(x, "copyRequiresWriterPermission", value.asInstanceOf[js.Any])
        
        inline def setCopyRequiresWriterPermissionUndefined: Self = StObject.set(x, "copyRequiresWriterPermission", js.undefined)
        
        inline def setCopyable(value: Boolean): Self = StObject.set(x, "copyable", value.asInstanceOf[js.Any])
        
        inline def setCopyableUndefined: Self = StObject.set(x, "copyable", js.undefined)
        
        inline def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
        
        inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
        
        inline def setDefaultOpenWithLink(value: String): Self = StObject.set(x, "defaultOpenWithLink", value.asInstanceOf[js.Any])
        
        inline def setDefaultOpenWithLinkUndefined: Self = StObject.set(x, "defaultOpenWithLink", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
        
        inline def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
        
        inline def setDriveId(value: String): Self = StObject.set(x, "driveId", value.asInstanceOf[js.Any])
        
        inline def setDriveIdUndefined: Self = StObject.set(x, "driveId", js.undefined)
        
        inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
        
        inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
        
        inline def setEmbedLink(value: String): Self = StObject.set(x, "embedLink", value.asInstanceOf[js.Any])
        
        inline def setEmbedLinkUndefined: Self = StObject.set(x, "embedLink", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setExplicitlyTrashed(value: Boolean): Self = StObject.set(x, "explicitlyTrashed", value.asInstanceOf[js.Any])
        
        inline def setExplicitlyTrashedUndefined: Self = StObject.set(x, "explicitlyTrashed", js.undefined)
        
        inline def setExportLinks(value: js.Object): Self = StObject.set(x, "exportLinks", value.asInstanceOf[js.Any])
        
        inline def setExportLinksUndefined: Self = StObject.set(x, "exportLinks", js.undefined)
        
        inline def setFileExtension(value: String): Self = StObject.set(x, "fileExtension", value.asInstanceOf[js.Any])
        
        inline def setFileExtensionUndefined: Self = StObject.set(x, "fileExtension", js.undefined)
        
        inline def setFileSize(value: String): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
        
        inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
        
        inline def setFolderColorRgb(value: String): Self = StObject.set(x, "folderColorRgb", value.asInstanceOf[js.Any])
        
        inline def setFolderColorRgbUndefined: Self = StObject.set(x, "folderColorRgb", js.undefined)
        
        inline def setFullFileExtension(value: String): Self = StObject.set(x, "fullFileExtension", value.asInstanceOf[js.Any])
        
        inline def setFullFileExtensionUndefined: Self = StObject.set(x, "fullFileExtension", js.undefined)
        
        inline def setHasAugmentedPermissions(value: Boolean): Self = StObject.set(x, "hasAugmentedPermissions", value.asInstanceOf[js.Any])
        
        inline def setHasAugmentedPermissionsUndefined: Self = StObject.set(x, "hasAugmentedPermissions", js.undefined)
        
        inline def setHasThumbnail(value: Boolean): Self = StObject.set(x, "hasThumbnail", value.asInstanceOf[js.Any])
        
        inline def setHasThumbnailUndefined: Self = StObject.set(x, "hasThumbnail", js.undefined)
        
        inline def setHeadRevisionId(value: String): Self = StObject.set(x, "headRevisionId", value.asInstanceOf[js.Any])
        
        inline def setHeadRevisionIdUndefined: Self = StObject.set(x, "headRevisionId", js.undefined)
        
        inline def setIconLink(value: String): Self = StObject.set(x, "iconLink", value.asInstanceOf[js.Any])
        
        inline def setIconLinkUndefined: Self = StObject.set(x, "iconLink", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setImageMediaMetadata(value: FileImageMediaMetadata): Self = StObject.set(x, "imageMediaMetadata", value.asInstanceOf[js.Any])
        
        inline def setImageMediaMetadataUndefined: Self = StObject.set(x, "imageMediaMetadata", js.undefined)
        
        inline def setIndexableText(value: FileIndexableText): Self = StObject.set(x, "indexableText", value.asInstanceOf[js.Any])
        
        inline def setIndexableTextUndefined: Self = StObject.set(x, "indexableText", js.undefined)
        
        inline def setIsAppAuthorized(value: Boolean): Self = StObject.set(x, "isAppAuthorized", value.asInstanceOf[js.Any])
        
        inline def setIsAppAuthorizedUndefined: Self = StObject.set(x, "isAppAuthorized", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLabels(value: FileLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        inline def setLastModifyingUser(value: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User): Self = StObject.set(x, "lastModifyingUser", value.asInstanceOf[js.Any])
        
        inline def setLastModifyingUserName(value: String): Self = StObject.set(x, "lastModifyingUserName", value.asInstanceOf[js.Any])
        
        inline def setLastModifyingUserNameUndefined: Self = StObject.set(x, "lastModifyingUserName", js.undefined)
        
        inline def setLastModifyingUserUndefined: Self = StObject.set(x, "lastModifyingUser", js.undefined)
        
        inline def setLastViewedByMeDate(value: String): Self = StObject.set(x, "lastViewedByMeDate", value.asInstanceOf[js.Any])
        
        inline def setLastViewedByMeDateUndefined: Self = StObject.set(x, "lastViewedByMeDate", js.undefined)
        
        inline def setMarkedViewedByMeDate(value: String): Self = StObject.set(x, "markedViewedByMeDate", value.asInstanceOf[js.Any])
        
        inline def setMarkedViewedByMeDateUndefined: Self = StObject.set(x, "markedViewedByMeDate", js.undefined)
        
        inline def setMd5Checksum(value: String): Self = StObject.set(x, "md5Checksum", value.asInstanceOf[js.Any])
        
        inline def setMd5ChecksumUndefined: Self = StObject.set(x, "md5Checksum", js.undefined)
        
        inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
        
        inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
        
        inline def setModifiedByMeDate(value: String): Self = StObject.set(x, "modifiedByMeDate", value.asInstanceOf[js.Any])
        
        inline def setModifiedByMeDateUndefined: Self = StObject.set(x, "modifiedByMeDate", js.undefined)
        
        inline def setModifiedDate(value: String): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
        
        inline def setModifiedDateUndefined: Self = StObject.set(x, "modifiedDate", js.undefined)
        
        inline def setOpenWithLinks(value: js.Object): Self = StObject.set(x, "openWithLinks", value.asInstanceOf[js.Any])
        
        inline def setOpenWithLinksUndefined: Self = StObject.set(x, "openWithLinks", js.undefined)
        
        inline def setOriginalFilename(value: String): Self = StObject.set(x, "originalFilename", value.asInstanceOf[js.Any])
        
        inline def setOriginalFilenameUndefined: Self = StObject.set(x, "originalFilename", js.undefined)
        
        inline def setOwnedByMe(value: Boolean): Self = StObject.set(x, "ownedByMe", value.asInstanceOf[js.Any])
        
        inline def setOwnedByMeUndefined: Self = StObject.set(x, "ownedByMe", js.undefined)
        
        inline def setOwnerNames(value: js.Array[String]): Self = StObject.set(x, "ownerNames", value.asInstanceOf[js.Any])
        
        inline def setOwnerNamesUndefined: Self = StObject.set(x, "ownerNames", js.undefined)
        
        inline def setOwnerNamesVarargs(value: String*): Self = StObject.set(x, "ownerNames", js.Array(value :_*))
        
        inline def setOwners(value: js.Array[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
        
        inline def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
        
        inline def setOwnersVarargs(value: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User*): Self = StObject.set(x, "owners", js.Array(value :_*))
        
        inline def setParents(value: js.Array[ParentReference]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
        
        inline def setParentsUndefined: Self = StObject.set(x, "parents", js.undefined)
        
        inline def setParentsVarargs(value: ParentReference*): Self = StObject.set(x, "parents", js.Array(value :_*))
        
        inline def setPermissionIds(value: js.Array[String]): Self = StObject.set(x, "permissionIds", value.asInstanceOf[js.Any])
        
        inline def setPermissionIdsUndefined: Self = StObject.set(x, "permissionIds", js.undefined)
        
        inline def setPermissionIdsVarargs(value: String*): Self = StObject.set(x, "permissionIds", js.Array(value :_*))
        
        inline def setPermissions(value: js.Array[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
        
        inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
        
        inline def setPermissionsVarargs(value: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
        
        inline def setProperties(value: js.Array[Property]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
        
        inline def setPropertiesVarargs(value: Property*): Self = StObject.set(x, "properties", js.Array(value :_*))
        
        inline def setQuotaBytesUsed(value: String): Self = StObject.set(x, "quotaBytesUsed", value.asInstanceOf[js.Any])
        
        inline def setQuotaBytesUsedUndefined: Self = StObject.set(x, "quotaBytesUsed", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
        
        inline def setShareable(value: Boolean): Self = StObject.set(x, "shareable", value.asInstanceOf[js.Any])
        
        inline def setShareableUndefined: Self = StObject.set(x, "shareable", js.undefined)
        
        inline def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
        
        inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
        
        inline def setSharedWithMeDate(value: String): Self = StObject.set(x, "sharedWithMeDate", value.asInstanceOf[js.Any])
        
        inline def setSharedWithMeDateUndefined: Self = StObject.set(x, "sharedWithMeDate", js.undefined)
        
        inline def setSharingUser(value: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User): Self = StObject.set(x, "sharingUser", value.asInstanceOf[js.Any])
        
        inline def setSharingUserUndefined: Self = StObject.set(x, "sharingUser", js.undefined)
        
        inline def setSpaces(value: js.Array[String]): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
        
        inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
        
        inline def setSpacesVarargs(value: String*): Self = StObject.set(x, "spaces", js.Array(value :_*))
        
        inline def setTeamDriveId(value: String): Self = StObject.set(x, "teamDriveId", value.asInstanceOf[js.Any])
        
        inline def setTeamDriveIdUndefined: Self = StObject.set(x, "teamDriveId", js.undefined)
        
        inline def setThumbnail(value: FileThumbnail): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
        
        inline def setThumbnailLink(value: String): Self = StObject.set(x, "thumbnailLink", value.asInstanceOf[js.Any])
        
        inline def setThumbnailLinkUndefined: Self = StObject.set(x, "thumbnailLink", js.undefined)
        
        inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
        
        inline def setThumbnailVersion(value: String): Self = StObject.set(x, "thumbnailVersion", value.asInstanceOf[js.Any])
        
        inline def setThumbnailVersionUndefined: Self = StObject.set(x, "thumbnailVersion", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setTrashedDate(value: String): Self = StObject.set(x, "trashedDate", value.asInstanceOf[js.Any])
        
        inline def setTrashedDateUndefined: Self = StObject.set(x, "trashedDate", js.undefined)
        
        inline def setTrashingUser(value: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User): Self = StObject.set(x, "trashingUser", value.asInstanceOf[js.Any])
        
        inline def setTrashingUserUndefined: Self = StObject.set(x, "trashingUser", js.undefined)
        
        inline def setUserPermission(value: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission): Self = StObject.set(x, "userPermission", value.asInstanceOf[js.Any])
        
        inline def setUserPermissionUndefined: Self = StObject.set(x, "userPermission", js.undefined)
        
        inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
        
        inline def setVideoMediaMetadata(value: FileVideoMediaMetadata): Self = StObject.set(x, "videoMediaMetadata", value.asInstanceOf[js.Any])
        
        inline def setVideoMediaMetadataUndefined: Self = StObject.set(x, "videoMediaMetadata", js.undefined)
        
        inline def setWebContentLink(value: String): Self = StObject.set(x, "webContentLink", value.asInstanceOf[js.Any])
        
        inline def setWebContentLinkUndefined: Self = StObject.set(x, "webContentLink", js.undefined)
        
        inline def setWebViewLink(value: String): Self = StObject.set(x, "webViewLink", value.asInstanceOf[js.Any])
        
        inline def setWebViewLinkUndefined: Self = StObject.set(x, "webViewLink", js.undefined)
        
        inline def setWritersCanShare(value: Boolean): Self = StObject.set(x, "writersCanShare", value.asInstanceOf[js.Any])
        
        inline def setWritersCanShareUndefined: Self = StObject.set(x, "writersCanShare", js.undefined)
      }
    }
    
    trait FileCapabilities extends StObject {
      
      var canAddChildren: js.UndefOr[Boolean] = js.undefined
      
      var canChangeCopyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined
      
      var canChangeRestrictedDownload: js.UndefOr[Boolean] = js.undefined
      
      var canComment: js.UndefOr[Boolean] = js.undefined
      
      var canCopy: js.UndefOr[Boolean] = js.undefined
      
      var canDelete: js.UndefOr[Boolean] = js.undefined
      
      var canDeleteChildren: js.UndefOr[Boolean] = js.undefined
      
      var canDownload: js.UndefOr[Boolean] = js.undefined
      
      var canEdit: js.UndefOr[Boolean] = js.undefined
      
      var canListChildren: js.UndefOr[Boolean] = js.undefined
      
      var canMoveChildrenOutOfDrive: js.UndefOr[Boolean] = js.undefined
      
      var canMoveChildrenOutOfTeamDrive: js.UndefOr[Boolean] = js.undefined
      
      var canMoveChildrenWithinDrive: js.UndefOr[Boolean] = js.undefined
      
      var canMoveChildrenWithinTeamDrive: js.UndefOr[Boolean] = js.undefined
      
      var canMoveItemIntoTeamDrive: js.UndefOr[Boolean] = js.undefined
      
      var canMoveItemOutOfDrive: js.UndefOr[Boolean] = js.undefined
      
      var canMoveItemOutOfTeamDrive: js.UndefOr[Boolean] = js.undefined
      
      var canMoveItemWithinDrive: js.UndefOr[Boolean] = js.undefined
      
      var canMoveItemWithinTeamDrive: js.UndefOr[Boolean] = js.undefined
      
      var canMoveTeamDriveItem: js.UndefOr[Boolean] = js.undefined
      
      var canReadDrive: js.UndefOr[Boolean] = js.undefined
      
      var canReadRevisions: js.UndefOr[Boolean] = js.undefined
      
      var canReadTeamDrive: js.UndefOr[Boolean] = js.undefined
      
      var canRemoveChildren: js.UndefOr[Boolean] = js.undefined
      
      var canRename: js.UndefOr[Boolean] = js.undefined
      
      var canShare: js.UndefOr[Boolean] = js.undefined
      
      var canTrash: js.UndefOr[Boolean] = js.undefined
      
      var canTrashChildren: js.UndefOr[Boolean] = js.undefined
      
      var canUntrash: js.UndefOr[Boolean] = js.undefined
    }
    object FileCapabilities {
      
      inline def apply(): FileCapabilities = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FileCapabilities]
      }
      
      extension [Self <: FileCapabilities](x: Self) {
        
        inline def setCanAddChildren(value: Boolean): Self = StObject.set(x, "canAddChildren", value.asInstanceOf[js.Any])
        
        inline def setCanAddChildrenUndefined: Self = StObject.set(x, "canAddChildren", js.undefined)
        
        inline def setCanChangeCopyRequiresWriterPermission(value: Boolean): Self = StObject.set(x, "canChangeCopyRequiresWriterPermission", value.asInstanceOf[js.Any])
        
        inline def setCanChangeCopyRequiresWriterPermissionUndefined: Self = StObject.set(x, "canChangeCopyRequiresWriterPermission", js.undefined)
        
        inline def setCanChangeRestrictedDownload(value: Boolean): Self = StObject.set(x, "canChangeRestrictedDownload", value.asInstanceOf[js.Any])
        
        inline def setCanChangeRestrictedDownloadUndefined: Self = StObject.set(x, "canChangeRestrictedDownload", js.undefined)
        
        inline def setCanComment(value: Boolean): Self = StObject.set(x, "canComment", value.asInstanceOf[js.Any])
        
        inline def setCanCommentUndefined: Self = StObject.set(x, "canComment", js.undefined)
        
        inline def setCanCopy(value: Boolean): Self = StObject.set(x, "canCopy", value.asInstanceOf[js.Any])
        
        inline def setCanCopyUndefined: Self = StObject.set(x, "canCopy", js.undefined)
        
        inline def setCanDelete(value: Boolean): Self = StObject.set(x, "canDelete", value.asInstanceOf[js.Any])
        
        inline def setCanDeleteChildren(value: Boolean): Self = StObject.set(x, "canDeleteChildren", value.asInstanceOf[js.Any])
        
        inline def setCanDeleteChildrenUndefined: Self = StObject.set(x, "canDeleteChildren", js.undefined)
        
        inline def setCanDeleteUndefined: Self = StObject.set(x, "canDelete", js.undefined)
        
        inline def setCanDownload(value: Boolean): Self = StObject.set(x, "canDownload", value.asInstanceOf[js.Any])
        
        inline def setCanDownloadUndefined: Self = StObject.set(x, "canDownload", js.undefined)
        
        inline def setCanEdit(value: Boolean): Self = StObject.set(x, "canEdit", value.asInstanceOf[js.Any])
        
        inline def setCanEditUndefined: Self = StObject.set(x, "canEdit", js.undefined)
        
        inline def setCanListChildren(value: Boolean): Self = StObject.set(x, "canListChildren", value.asInstanceOf[js.Any])
        
        inline def setCanListChildrenUndefined: Self = StObject.set(x, "canListChildren", js.undefined)
        
        inline def setCanMoveChildrenOutOfDrive(value: Boolean): Self = StObject.set(x, "canMoveChildrenOutOfDrive", value.asInstanceOf[js.Any])
        
        inline def setCanMoveChildrenOutOfDriveUndefined: Self = StObject.set(x, "canMoveChildrenOutOfDrive", js.undefined)
        
        inline def setCanMoveChildrenOutOfTeamDrive(value: Boolean): Self = StObject.set(x, "canMoveChildrenOutOfTeamDrive", value.asInstanceOf[js.Any])
        
        inline def setCanMoveChildrenOutOfTeamDriveUndefined: Self = StObject.set(x, "canMoveChildrenOutOfTeamDrive", js.undefined)
        
        inline def setCanMoveChildrenWithinDrive(value: Boolean): Self = StObject.set(x, "canMoveChildrenWithinDrive", value.asInstanceOf[js.Any])
        
        inline def setCanMoveChildrenWithinDriveUndefined: Self = StObject.set(x, "canMoveChildrenWithinDrive", js.undefined)
        
        inline def setCanMoveChildrenWithinTeamDrive(value: Boolean): Self = StObject.set(x, "canMoveChildrenWithinTeamDrive", value.asInstanceOf[js.Any])
        
        inline def setCanMoveChildrenWithinTeamDriveUndefined: Self = StObject.set(x, "canMoveChildrenWithinTeamDrive", js.undefined)
        
        inline def setCanMoveItemIntoTeamDrive(value: Boolean): Self = StObject.set(x, "canMoveItemIntoTeamDrive", value.asInstanceOf[js.Any])
        
        inline def setCanMoveItemIntoTeamDriveUndefined: Self = StObject.set(x, "canMoveItemIntoTeamDrive", js.undefined)
        
        inline def setCanMoveItemOutOfDrive(value: Boolean): Self = StObject.set(x, "canMoveItemOutOfDrive", value.asInstanceOf[js.Any])
        
        inline def setCanMoveItemOutOfDriveUndefined: Self = StObject.set(x, "canMoveItemOutOfDrive", js.undefined)
        
        inline def setCanMoveItemOutOfTeamDrive(value: Boolean): Self = StObject.set(x, "canMoveItemOutOfTeamDrive", value.asInstanceOf[js.Any])
        
        inline def setCanMoveItemOutOfTeamDriveUndefined: Self = StObject.set(x, "canMoveItemOutOfTeamDrive", js.undefined)
        
        inline def setCanMoveItemWithinDrive(value: Boolean): Self = StObject.set(x, "canMoveItemWithinDrive", value.asInstanceOf[js.Any])
        
        inline def setCanMoveItemWithinDriveUndefined: Self = StObject.set(x, "canMoveItemWithinDrive", js.undefined)
        
        inline def setCanMoveItemWithinTeamDrive(value: Boolean): Self = StObject.set(x, "canMoveItemWithinTeamDrive", value.asInstanceOf[js.Any])
        
        inline def setCanMoveItemWithinTeamDriveUndefined: Self = StObject.set(x, "canMoveItemWithinTeamDrive", js.undefined)
        
        inline def setCanMoveTeamDriveItem(value: Boolean): Self = StObject.set(x, "canMoveTeamDriveItem", value.asInstanceOf[js.Any])
        
        inline def setCanMoveTeamDriveItemUndefined: Self = StObject.set(x, "canMoveTeamDriveItem", js.undefined)
        
        inline def setCanReadDrive(value: Boolean): Self = StObject.set(x, "canReadDrive", value.asInstanceOf[js.Any])
        
        inline def setCanReadDriveUndefined: Self = StObject.set(x, "canReadDrive", js.undefined)
        
        inline def setCanReadRevisions(value: Boolean): Self = StObject.set(x, "canReadRevisions", value.asInstanceOf[js.Any])
        
        inline def setCanReadRevisionsUndefined: Self = StObject.set(x, "canReadRevisions", js.undefined)
        
        inline def setCanReadTeamDrive(value: Boolean): Self = StObject.set(x, "canReadTeamDrive", value.asInstanceOf[js.Any])
        
        inline def setCanReadTeamDriveUndefined: Self = StObject.set(x, "canReadTeamDrive", js.undefined)
        
        inline def setCanRemoveChildren(value: Boolean): Self = StObject.set(x, "canRemoveChildren", value.asInstanceOf[js.Any])
        
        inline def setCanRemoveChildrenUndefined: Self = StObject.set(x, "canRemoveChildren", js.undefined)
        
        inline def setCanRename(value: Boolean): Self = StObject.set(x, "canRename", value.asInstanceOf[js.Any])
        
        inline def setCanRenameUndefined: Self = StObject.set(x, "canRename", js.undefined)
        
        inline def setCanShare(value: Boolean): Self = StObject.set(x, "canShare", value.asInstanceOf[js.Any])
        
        inline def setCanShareUndefined: Self = StObject.set(x, "canShare", js.undefined)
        
        inline def setCanTrash(value: Boolean): Self = StObject.set(x, "canTrash", value.asInstanceOf[js.Any])
        
        inline def setCanTrashChildren(value: Boolean): Self = StObject.set(x, "canTrashChildren", value.asInstanceOf[js.Any])
        
        inline def setCanTrashChildrenUndefined: Self = StObject.set(x, "canTrashChildren", js.undefined)
        
        inline def setCanTrashUndefined: Self = StObject.set(x, "canTrash", js.undefined)
        
        inline def setCanUntrash(value: Boolean): Self = StObject.set(x, "canUntrash", value.asInstanceOf[js.Any])
        
        inline def setCanUntrashUndefined: Self = StObject.set(x, "canUntrash", js.undefined)
      }
    }
    
    trait FileImageMediaMetadata extends StObject {
      
      var aperture: js.UndefOr[Double] = js.undefined
      
      var cameraMake: js.UndefOr[String] = js.undefined
      
      var cameraModel: js.UndefOr[String] = js.undefined
      
      var colorSpace: js.UndefOr[String] = js.undefined
      
      var date: js.UndefOr[String] = js.undefined
      
      var exposureBias: js.UndefOr[Double] = js.undefined
      
      var exposureMode: js.UndefOr[String] = js.undefined
      
      var exposureTime: js.UndefOr[Double] = js.undefined
      
      var flashUsed: js.UndefOr[Boolean] = js.undefined
      
      var focalLength: js.UndefOr[Double] = js.undefined
      
      var height: js.UndefOr[Double] = js.undefined
      
      var isoSpeed: js.UndefOr[Double] = js.undefined
      
      var lens: js.UndefOr[String] = js.undefined
      
      var location: js.UndefOr[FileImageMediaMetadataLocation] = js.undefined
      
      var maxApertureValue: js.UndefOr[Double] = js.undefined
      
      var meteringMode: js.UndefOr[String] = js.undefined
      
      var rotation: js.UndefOr[Double] = js.undefined
      
      var sensor: js.UndefOr[String] = js.undefined
      
      var subjectDistance: js.UndefOr[Double] = js.undefined
      
      var whiteBalance: js.UndefOr[String] = js.undefined
      
      var width: js.UndefOr[Double] = js.undefined
    }
    object FileImageMediaMetadata {
      
      inline def apply(): FileImageMediaMetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FileImageMediaMetadata]
      }
      
      extension [Self <: FileImageMediaMetadata](x: Self) {
        
        inline def setAperture(value: Double): Self = StObject.set(x, "aperture", value.asInstanceOf[js.Any])
        
        inline def setApertureUndefined: Self = StObject.set(x, "aperture", js.undefined)
        
        inline def setCameraMake(value: String): Self = StObject.set(x, "cameraMake", value.asInstanceOf[js.Any])
        
        inline def setCameraMakeUndefined: Self = StObject.set(x, "cameraMake", js.undefined)
        
        inline def setCameraModel(value: String): Self = StObject.set(x, "cameraModel", value.asInstanceOf[js.Any])
        
        inline def setCameraModelUndefined: Self = StObject.set(x, "cameraModel", js.undefined)
        
        inline def setColorSpace(value: String): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
        
        inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
        
        inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
        
        inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
        
        inline def setExposureBias(value: Double): Self = StObject.set(x, "exposureBias", value.asInstanceOf[js.Any])
        
        inline def setExposureBiasUndefined: Self = StObject.set(x, "exposureBias", js.undefined)
        
        inline def setExposureMode(value: String): Self = StObject.set(x, "exposureMode", value.asInstanceOf[js.Any])
        
        inline def setExposureModeUndefined: Self = StObject.set(x, "exposureMode", js.undefined)
        
        inline def setExposureTime(value: Double): Self = StObject.set(x, "exposureTime", value.asInstanceOf[js.Any])
        
        inline def setExposureTimeUndefined: Self = StObject.set(x, "exposureTime", js.undefined)
        
        inline def setFlashUsed(value: Boolean): Self = StObject.set(x, "flashUsed", value.asInstanceOf[js.Any])
        
        inline def setFlashUsedUndefined: Self = StObject.set(x, "flashUsed", js.undefined)
        
        inline def setFocalLength(value: Double): Self = StObject.set(x, "focalLength", value.asInstanceOf[js.Any])
        
        inline def setFocalLengthUndefined: Self = StObject.set(x, "focalLength", js.undefined)
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setIsoSpeed(value: Double): Self = StObject.set(x, "isoSpeed", value.asInstanceOf[js.Any])
        
        inline def setIsoSpeedUndefined: Self = StObject.set(x, "isoSpeed", js.undefined)
        
        inline def setLens(value: String): Self = StObject.set(x, "lens", value.asInstanceOf[js.Any])
        
        inline def setLensUndefined: Self = StObject.set(x, "lens", js.undefined)
        
        inline def setLocation(value: FileImageMediaMetadataLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setMaxApertureValue(value: Double): Self = StObject.set(x, "maxApertureValue", value.asInstanceOf[js.Any])
        
        inline def setMaxApertureValueUndefined: Self = StObject.set(x, "maxApertureValue", js.undefined)
        
        inline def setMeteringMode(value: String): Self = StObject.set(x, "meteringMode", value.asInstanceOf[js.Any])
        
        inline def setMeteringModeUndefined: Self = StObject.set(x, "meteringMode", js.undefined)
        
        inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
        
        inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
        
        inline def setSensor(value: String): Self = StObject.set(x, "sensor", value.asInstanceOf[js.Any])
        
        inline def setSensorUndefined: Self = StObject.set(x, "sensor", js.undefined)
        
        inline def setSubjectDistance(value: Double): Self = StObject.set(x, "subjectDistance", value.asInstanceOf[js.Any])
        
        inline def setSubjectDistanceUndefined: Self = StObject.set(x, "subjectDistance", js.undefined)
        
        inline def setWhiteBalance(value: String): Self = StObject.set(x, "whiteBalance", value.asInstanceOf[js.Any])
        
        inline def setWhiteBalanceUndefined: Self = StObject.set(x, "whiteBalance", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait FileImageMediaMetadataLocation extends StObject {
      
      var altitude: js.UndefOr[Double] = js.undefined
      
      var latitude: js.UndefOr[Double] = js.undefined
      
      var longitude: js.UndefOr[Double] = js.undefined
    }
    object FileImageMediaMetadataLocation {
      
      inline def apply(): FileImageMediaMetadataLocation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FileImageMediaMetadataLocation]
      }
      
      extension [Self <: FileImageMediaMetadataLocation](x: Self) {
        
        inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
        
        inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
        
        inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
        
        inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
        
        inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
        
        inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      }
    }
    
    trait FileIndexableText extends StObject {
      
      var text: js.UndefOr[String] = js.undefined
    }
    object FileIndexableText {
      
      inline def apply(): FileIndexableText = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FileIndexableText]
      }
      
      extension [Self <: FileIndexableText](x: Self) {
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    trait FileLabels extends StObject {
      
      var hidden: js.UndefOr[Boolean] = js.undefined
      
      var modified: js.UndefOr[Boolean] = js.undefined
      
      var restricted: js.UndefOr[Boolean] = js.undefined
      
      var starred: js.UndefOr[Boolean] = js.undefined
      
      var trashed: js.UndefOr[Boolean] = js.undefined
      
      var viewed: js.UndefOr[Boolean] = js.undefined
    }
    object FileLabels {
      
      inline def apply(): FileLabels = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FileLabels]
      }
      
      extension [Self <: FileLabels](x: Self) {
        
        inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
        
        inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
        
        inline def setModified(value: Boolean): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
        
        inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
        
        inline def setRestricted(value: Boolean): Self = StObject.set(x, "restricted", value.asInstanceOf[js.Any])
        
        inline def setRestrictedUndefined: Self = StObject.set(x, "restricted", js.undefined)
        
        inline def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
        
        inline def setStarredUndefined: Self = StObject.set(x, "starred", js.undefined)
        
        inline def setTrashed(value: Boolean): Self = StObject.set(x, "trashed", value.asInstanceOf[js.Any])
        
        inline def setTrashedUndefined: Self = StObject.set(x, "trashed", js.undefined)
        
        inline def setViewed(value: Boolean): Self = StObject.set(x, "viewed", value.asInstanceOf[js.Any])
        
        inline def setViewedUndefined: Self = StObject.set(x, "viewed", js.undefined)
      }
    }
    
    trait FileList extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var incompleteSearch: js.UndefOr[Boolean] = js.undefined
      
      var items: js.UndefOr[js.Array[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextLink: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
    }
    object FileList {
      
      inline def apply(): FileList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FileList]
      }
      
      extension [Self <: FileList](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setIncompleteSearch(value: Boolean): Self = StObject.set(x, "incompleteSearch", value.asInstanceOf[js.Any])
        
        inline def setIncompleteSearchUndefined: Self = StObject.set(x, "incompleteSearch", js.undefined)
        
        inline def setItems(value: js.Array[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.File*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
        
        inline def setNextLinkUndefined: Self = StObject.set(x, "nextLink", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
      }
    }
    
    trait FileThumbnail extends StObject {
      
      var image: js.UndefOr[String] = js.undefined
      
      var mimeType: js.UndefOr[String] = js.undefined
    }
    object FileThumbnail {
      
      inline def apply(): FileThumbnail = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FileThumbnail]
      }
      
      extension [Self <: FileThumbnail](x: Self) {
        
        inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
        
        inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
        
        inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      }
    }
    
    trait FileVideoMediaMetadata extends StObject {
      
      var durationMillis: js.UndefOr[String] = js.undefined
      
      var height: js.UndefOr[Double] = js.undefined
      
      var width: js.UndefOr[Double] = js.undefined
    }
    object FileVideoMediaMetadata {
      
      inline def apply(): FileVideoMediaMetadata = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FileVideoMediaMetadata]
      }
      
      extension [Self <: FileVideoMediaMetadata](x: Self) {
        
        inline def setDurationMillis(value: String): Self = StObject.set(x, "durationMillis", value.asInstanceOf[js.Any])
        
        inline def setDurationMillisUndefined: Self = StObject.set(x, "durationMillis", js.undefined)
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait GeneratedIds extends StObject {
      
      var ids: js.UndefOr[js.Array[String]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var space: js.UndefOr[String] = js.undefined
    }
    object GeneratedIds {
      
      inline def apply(): GeneratedIds = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GeneratedIds]
      }
      
      extension [Self <: GeneratedIds](x: Self) {
        
        inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
        
        inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
        
        inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
        
        inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      }
    }
    
    trait ParentList extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[ParentReference]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
    }
    object ParentList {
      
      inline def apply(): ParentList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParentList]
      }
      
      extension [Self <: ParentList](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[ParentReference]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: ParentReference*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
      }
    }
    
    trait ParentReference extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var isRoot: js.UndefOr[Boolean] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var parentLink: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
    }
    object ParentReference {
      
      inline def apply(): ParentReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ParentReference]
      }
      
      extension [Self <: ParentReference](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setIsRoot(value: Boolean): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
        
        inline def setIsRootUndefined: Self = StObject.set(x, "isRoot", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setParentLink(value: String): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
        
        inline def setParentLinkUndefined: Self = StObject.set(x, "parentLink", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
      }
    }
    
    trait Permission extends StObject {
      
      var additionalRoles: js.UndefOr[js.Array[String]] = js.undefined
      
      var authKey: js.UndefOr[String] = js.undefined
      
      var deleted: js.UndefOr[Boolean] = js.undefined
      
      var domain: js.UndefOr[String] = js.undefined
      
      var emailAddress: js.UndefOr[String] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var expirationDate: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var permissionDetails: js.UndefOr[js.Array[PermissionPermissionDetails]] = js.undefined
      
      var photoLink: js.UndefOr[String] = js.undefined
      
      var role: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
      
      var teamDrivePermissionDetails: js.UndefOr[js.Array[PermissionTeamDrivePermissionDetails]] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
      
      var withLink: js.UndefOr[Boolean] = js.undefined
    }
    object Permission {
      
      inline def apply(): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission]
      }
      
      extension [Self <: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission](x: Self) {
        
        inline def setAdditionalRoles(value: js.Array[String]): Self = StObject.set(x, "additionalRoles", value.asInstanceOf[js.Any])
        
        inline def setAdditionalRolesUndefined: Self = StObject.set(x, "additionalRoles", js.undefined)
        
        inline def setAdditionalRolesVarargs(value: String*): Self = StObject.set(x, "additionalRoles", js.Array(value :_*))
        
        inline def setAuthKey(value: String): Self = StObject.set(x, "authKey", value.asInstanceOf[js.Any])
        
        inline def setAuthKeyUndefined: Self = StObject.set(x, "authKey", js.undefined)
        
        inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
        
        inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
        
        inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
        
        inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
        
        inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPermissionDetails(value: js.Array[PermissionPermissionDetails]): Self = StObject.set(x, "permissionDetails", value.asInstanceOf[js.Any])
        
        inline def setPermissionDetailsUndefined: Self = StObject.set(x, "permissionDetails", js.undefined)
        
        inline def setPermissionDetailsVarargs(value: PermissionPermissionDetails*): Self = StObject.set(x, "permissionDetails", js.Array(value :_*))
        
        inline def setPhotoLink(value: String): Self = StObject.set(x, "photoLink", value.asInstanceOf[js.Any])
        
        inline def setPhotoLinkUndefined: Self = StObject.set(x, "photoLink", js.undefined)
        
        inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
        
        inline def setTeamDrivePermissionDetails(value: js.Array[PermissionTeamDrivePermissionDetails]): Self = StObject.set(x, "teamDrivePermissionDetails", value.asInstanceOf[js.Any])
        
        inline def setTeamDrivePermissionDetailsUndefined: Self = StObject.set(x, "teamDrivePermissionDetails", js.undefined)
        
        inline def setTeamDrivePermissionDetailsVarargs(value: PermissionTeamDrivePermissionDetails*): Self = StObject.set(x, "teamDrivePermissionDetails", js.Array(value :_*))
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        
        inline def setWithLink(value: Boolean): Self = StObject.set(x, "withLink", value.asInstanceOf[js.Any])
        
        inline def setWithLinkUndefined: Self = StObject.set(x, "withLink", js.undefined)
      }
    }
    
    trait PermissionId extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
    }
    object PermissionId {
      
      inline def apply(): PermissionId = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PermissionId]
      }
      
      extension [Self <: PermissionId](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    trait PermissionList extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
    }
    object PermissionList {
      
      inline def apply(): PermissionList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PermissionList]
      }
      
      extension [Self <: PermissionList](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.Permission*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
      }
    }
    
    trait PermissionPermissionDetails extends StObject {
      
      var additionalRoles: js.UndefOr[js.Array[String]] = js.undefined
      
      var inherited: js.UndefOr[Boolean] = js.undefined
      
      var inheritedFrom: js.UndefOr[String] = js.undefined
      
      var permissionType: js.UndefOr[String] = js.undefined
      
      var role: js.UndefOr[String] = js.undefined
    }
    object PermissionPermissionDetails {
      
      inline def apply(): PermissionPermissionDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PermissionPermissionDetails]
      }
      
      extension [Self <: PermissionPermissionDetails](x: Self) {
        
        inline def setAdditionalRoles(value: js.Array[String]): Self = StObject.set(x, "additionalRoles", value.asInstanceOf[js.Any])
        
        inline def setAdditionalRolesUndefined: Self = StObject.set(x, "additionalRoles", js.undefined)
        
        inline def setAdditionalRolesVarargs(value: String*): Self = StObject.set(x, "additionalRoles", js.Array(value :_*))
        
        inline def setInherited(value: Boolean): Self = StObject.set(x, "inherited", value.asInstanceOf[js.Any])
        
        inline def setInheritedFrom(value: String): Self = StObject.set(x, "inheritedFrom", value.asInstanceOf[js.Any])
        
        inline def setInheritedFromUndefined: Self = StObject.set(x, "inheritedFrom", js.undefined)
        
        inline def setInheritedUndefined: Self = StObject.set(x, "inherited", js.undefined)
        
        inline def setPermissionType(value: String): Self = StObject.set(x, "permissionType", value.asInstanceOf[js.Any])
        
        inline def setPermissionTypeUndefined: Self = StObject.set(x, "permissionType", js.undefined)
        
        inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      }
    }
    
    trait PermissionTeamDrivePermissionDetails extends StObject {
      
      var additionalRoles: js.UndefOr[js.Array[String]] = js.undefined
      
      var inherited: js.UndefOr[Boolean] = js.undefined
      
      var inheritedFrom: js.UndefOr[String] = js.undefined
      
      var role: js.UndefOr[String] = js.undefined
      
      var teamDrivePermissionType: js.UndefOr[String] = js.undefined
    }
    object PermissionTeamDrivePermissionDetails {
      
      inline def apply(): PermissionTeamDrivePermissionDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PermissionTeamDrivePermissionDetails]
      }
      
      extension [Self <: PermissionTeamDrivePermissionDetails](x: Self) {
        
        inline def setAdditionalRoles(value: js.Array[String]): Self = StObject.set(x, "additionalRoles", value.asInstanceOf[js.Any])
        
        inline def setAdditionalRolesUndefined: Self = StObject.set(x, "additionalRoles", js.undefined)
        
        inline def setAdditionalRolesVarargs(value: String*): Self = StObject.set(x, "additionalRoles", js.Array(value :_*))
        
        inline def setInherited(value: Boolean): Self = StObject.set(x, "inherited", value.asInstanceOf[js.Any])
        
        inline def setInheritedFrom(value: String): Self = StObject.set(x, "inheritedFrom", value.asInstanceOf[js.Any])
        
        inline def setInheritedFromUndefined: Self = StObject.set(x, "inheritedFrom", js.undefined)
        
        inline def setInheritedUndefined: Self = StObject.set(x, "inherited", js.undefined)
        
        inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        inline def setTeamDrivePermissionType(value: String): Self = StObject.set(x, "teamDrivePermissionType", value.asInstanceOf[js.Any])
        
        inline def setTeamDrivePermissionTypeUndefined: Self = StObject.set(x, "teamDrivePermissionType", js.undefined)
      }
    }
    
    trait Property extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var key: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
      
      var visibility: js.UndefOr[String] = js.undefined
    }
    object Property {
      
      inline def apply(): Property = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Property]
      }
      
      extension [Self <: Property](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        
        inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
        
        inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      }
    }
    
    trait PropertyList extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[Property]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
    }
    object PropertyList {
      
      inline def apply(): PropertyList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PropertyList]
      }
      
      extension [Self <: PropertyList](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[Property]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Property*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
      }
    }
    
    trait Revision extends StObject {
      
      var downloadUrl: js.UndefOr[String] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var exportLinks: js.UndefOr[js.Object] = js.undefined
      
      var fileSize: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var lastModifyingUser: js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User] = js.undefined
      
      var lastModifyingUserName: js.UndefOr[String] = js.undefined
      
      var md5Checksum: js.UndefOr[String] = js.undefined
      
      var mimeType: js.UndefOr[String] = js.undefined
      
      var modifiedDate: js.UndefOr[String] = js.undefined
      
      var originalFilename: js.UndefOr[String] = js.undefined
      
      var pinned: js.UndefOr[Boolean] = js.undefined
      
      var publishAuto: js.UndefOr[Boolean] = js.undefined
      
      var published: js.UndefOr[Boolean] = js.undefined
      
      var publishedLink: js.UndefOr[String] = js.undefined
      
      var publishedOutsideDomain: js.UndefOr[Boolean] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
    }
    object Revision {
      
      inline def apply(): Revision = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Revision]
      }
      
      extension [Self <: Revision](x: Self) {
        
        inline def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
        
        inline def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setExportLinks(value: js.Object): Self = StObject.set(x, "exportLinks", value.asInstanceOf[js.Any])
        
        inline def setExportLinksUndefined: Self = StObject.set(x, "exportLinks", js.undefined)
        
        inline def setFileSize(value: String): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
        
        inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLastModifyingUser(value: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User): Self = StObject.set(x, "lastModifyingUser", value.asInstanceOf[js.Any])
        
        inline def setLastModifyingUserName(value: String): Self = StObject.set(x, "lastModifyingUserName", value.asInstanceOf[js.Any])
        
        inline def setLastModifyingUserNameUndefined: Self = StObject.set(x, "lastModifyingUserName", js.undefined)
        
        inline def setLastModifyingUserUndefined: Self = StObject.set(x, "lastModifyingUser", js.undefined)
        
        inline def setMd5Checksum(value: String): Self = StObject.set(x, "md5Checksum", value.asInstanceOf[js.Any])
        
        inline def setMd5ChecksumUndefined: Self = StObject.set(x, "md5Checksum", js.undefined)
        
        inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
        
        inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
        
        inline def setModifiedDate(value: String): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
        
        inline def setModifiedDateUndefined: Self = StObject.set(x, "modifiedDate", js.undefined)
        
        inline def setOriginalFilename(value: String): Self = StObject.set(x, "originalFilename", value.asInstanceOf[js.Any])
        
        inline def setOriginalFilenameUndefined: Self = StObject.set(x, "originalFilename", js.undefined)
        
        inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
        
        inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
        
        inline def setPublishAuto(value: Boolean): Self = StObject.set(x, "publishAuto", value.asInstanceOf[js.Any])
        
        inline def setPublishAutoUndefined: Self = StObject.set(x, "publishAuto", js.undefined)
        
        inline def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
        
        inline def setPublishedLink(value: String): Self = StObject.set(x, "publishedLink", value.asInstanceOf[js.Any])
        
        inline def setPublishedLinkUndefined: Self = StObject.set(x, "publishedLink", js.undefined)
        
        inline def setPublishedOutsideDomain(value: Boolean): Self = StObject.set(x, "publishedOutsideDomain", value.asInstanceOf[js.Any])
        
        inline def setPublishedOutsideDomainUndefined: Self = StObject.set(x, "publishedOutsideDomain", js.undefined)
        
        inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
      }
    }
    
    trait RevisionList extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[Revision]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
    }
    object RevisionList {
      
      inline def apply(): RevisionList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RevisionList]
      }
      
      extension [Self <: RevisionList](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[Revision]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Revision*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
      }
    }
    
    trait StartPageToken extends StObject {
      
      var kind: js.UndefOr[String] = js.undefined
      
      var startPageToken: js.UndefOr[String] = js.undefined
    }
    object StartPageToken {
      
      inline def apply(): StartPageToken = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StartPageToken]
      }
      
      extension [Self <: StartPageToken](x: Self) {
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setStartPageToken(value: String): Self = StObject.set(x, "startPageToken", value.asInstanceOf[js.Any])
        
        inline def setStartPageTokenUndefined: Self = StObject.set(x, "startPageToken", js.undefined)
      }
    }
    
    trait TeamDrive extends StObject {
      
      var backgroundImageFile: js.UndefOr[TeamDriveBackgroundImageFile] = js.undefined
      
      var backgroundImageLink: js.UndefOr[String] = js.undefined
      
      var capabilities: js.UndefOr[TeamDriveCapabilities] = js.undefined
      
      var colorRgb: js.UndefOr[String] = js.undefined
      
      var createdDate: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var restrictions: js.UndefOr[TeamDriveRestrictions] = js.undefined
      
      var themeId: js.UndefOr[String] = js.undefined
    }
    object TeamDrive {
      
      inline def apply(): TeamDrive = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TeamDrive]
      }
      
      extension [Self <: TeamDrive](x: Self) {
        
        inline def setBackgroundImageFile(value: TeamDriveBackgroundImageFile): Self = StObject.set(x, "backgroundImageFile", value.asInstanceOf[js.Any])
        
        inline def setBackgroundImageFileUndefined: Self = StObject.set(x, "backgroundImageFile", js.undefined)
        
        inline def setBackgroundImageLink(value: String): Self = StObject.set(x, "backgroundImageLink", value.asInstanceOf[js.Any])
        
        inline def setBackgroundImageLinkUndefined: Self = StObject.set(x, "backgroundImageLink", js.undefined)
        
        inline def setCapabilities(value: TeamDriveCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
        
        inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
        
        inline def setColorRgb(value: String): Self = StObject.set(x, "colorRgb", value.asInstanceOf[js.Any])
        
        inline def setColorRgbUndefined: Self = StObject.set(x, "colorRgb", js.undefined)
        
        inline def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
        
        inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setRestrictions(value: TeamDriveRestrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
        
        inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
        
        inline def setThemeId(value: String): Self = StObject.set(x, "themeId", value.asInstanceOf[js.Any])
        
        inline def setThemeIdUndefined: Self = StObject.set(x, "themeId", js.undefined)
      }
    }
    
    trait TeamDriveBackgroundImageFile extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var width: js.UndefOr[Double] = js.undefined
      
      var xCoordinate: js.UndefOr[Double] = js.undefined
      
      var yCoordinate: js.UndefOr[Double] = js.undefined
    }
    object TeamDriveBackgroundImageFile {
      
      inline def apply(): TeamDriveBackgroundImageFile = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TeamDriveBackgroundImageFile]
      }
      
      extension [Self <: TeamDriveBackgroundImageFile](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        inline def setXCoordinate(value: Double): Self = StObject.set(x, "xCoordinate", value.asInstanceOf[js.Any])
        
        inline def setXCoordinateUndefined: Self = StObject.set(x, "xCoordinate", js.undefined)
        
        inline def setYCoordinate(value: Double): Self = StObject.set(x, "yCoordinate", value.asInstanceOf[js.Any])
        
        inline def setYCoordinateUndefined: Self = StObject.set(x, "yCoordinate", js.undefined)
      }
    }
    
    trait TeamDriveCapabilities extends StObject {
      
      var canAddChildren: js.UndefOr[Boolean] = js.undefined
      
      var canChangeCopyRequiresWriterPermissionRestriction: js.UndefOr[Boolean] = js.undefined
      
      var canChangeDomainUsersOnlyRestriction: js.UndefOr[Boolean] = js.undefined
      
      var canChangeTeamDriveBackground: js.UndefOr[Boolean] = js.undefined
      
      var canChangeTeamMembersOnlyRestriction: js.UndefOr[Boolean] = js.undefined
      
      var canComment: js.UndefOr[Boolean] = js.undefined
      
      var canCopy: js.UndefOr[Boolean] = js.undefined
      
      var canDeleteChildren: js.UndefOr[Boolean] = js.undefined
      
      var canDeleteTeamDrive: js.UndefOr[Boolean] = js.undefined
      
      var canDownload: js.UndefOr[Boolean] = js.undefined
      
      var canEdit: js.UndefOr[Boolean] = js.undefined
      
      var canListChildren: js.UndefOr[Boolean] = js.undefined
      
      var canManageMembers: js.UndefOr[Boolean] = js.undefined
      
      var canReadRevisions: js.UndefOr[Boolean] = js.undefined
      
      var canRemoveChildren: js.UndefOr[Boolean] = js.undefined
      
      var canRename: js.UndefOr[Boolean] = js.undefined
      
      var canRenameTeamDrive: js.UndefOr[Boolean] = js.undefined
      
      var canShare: js.UndefOr[Boolean] = js.undefined
      
      var canTrashChildren: js.UndefOr[Boolean] = js.undefined
    }
    object TeamDriveCapabilities {
      
      inline def apply(): TeamDriveCapabilities = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TeamDriveCapabilities]
      }
      
      extension [Self <: TeamDriveCapabilities](x: Self) {
        
        inline def setCanAddChildren(value: Boolean): Self = StObject.set(x, "canAddChildren", value.asInstanceOf[js.Any])
        
        inline def setCanAddChildrenUndefined: Self = StObject.set(x, "canAddChildren", js.undefined)
        
        inline def setCanChangeCopyRequiresWriterPermissionRestriction(value: Boolean): Self = StObject.set(x, "canChangeCopyRequiresWriterPermissionRestriction", value.asInstanceOf[js.Any])
        
        inline def setCanChangeCopyRequiresWriterPermissionRestrictionUndefined: Self = StObject.set(x, "canChangeCopyRequiresWriterPermissionRestriction", js.undefined)
        
        inline def setCanChangeDomainUsersOnlyRestriction(value: Boolean): Self = StObject.set(x, "canChangeDomainUsersOnlyRestriction", value.asInstanceOf[js.Any])
        
        inline def setCanChangeDomainUsersOnlyRestrictionUndefined: Self = StObject.set(x, "canChangeDomainUsersOnlyRestriction", js.undefined)
        
        inline def setCanChangeTeamDriveBackground(value: Boolean): Self = StObject.set(x, "canChangeTeamDriveBackground", value.asInstanceOf[js.Any])
        
        inline def setCanChangeTeamDriveBackgroundUndefined: Self = StObject.set(x, "canChangeTeamDriveBackground", js.undefined)
        
        inline def setCanChangeTeamMembersOnlyRestriction(value: Boolean): Self = StObject.set(x, "canChangeTeamMembersOnlyRestriction", value.asInstanceOf[js.Any])
        
        inline def setCanChangeTeamMembersOnlyRestrictionUndefined: Self = StObject.set(x, "canChangeTeamMembersOnlyRestriction", js.undefined)
        
        inline def setCanComment(value: Boolean): Self = StObject.set(x, "canComment", value.asInstanceOf[js.Any])
        
        inline def setCanCommentUndefined: Self = StObject.set(x, "canComment", js.undefined)
        
        inline def setCanCopy(value: Boolean): Self = StObject.set(x, "canCopy", value.asInstanceOf[js.Any])
        
        inline def setCanCopyUndefined: Self = StObject.set(x, "canCopy", js.undefined)
        
        inline def setCanDeleteChildren(value: Boolean): Self = StObject.set(x, "canDeleteChildren", value.asInstanceOf[js.Any])
        
        inline def setCanDeleteChildrenUndefined: Self = StObject.set(x, "canDeleteChildren", js.undefined)
        
        inline def setCanDeleteTeamDrive(value: Boolean): Self = StObject.set(x, "canDeleteTeamDrive", value.asInstanceOf[js.Any])
        
        inline def setCanDeleteTeamDriveUndefined: Self = StObject.set(x, "canDeleteTeamDrive", js.undefined)
        
        inline def setCanDownload(value: Boolean): Self = StObject.set(x, "canDownload", value.asInstanceOf[js.Any])
        
        inline def setCanDownloadUndefined: Self = StObject.set(x, "canDownload", js.undefined)
        
        inline def setCanEdit(value: Boolean): Self = StObject.set(x, "canEdit", value.asInstanceOf[js.Any])
        
        inline def setCanEditUndefined: Self = StObject.set(x, "canEdit", js.undefined)
        
        inline def setCanListChildren(value: Boolean): Self = StObject.set(x, "canListChildren", value.asInstanceOf[js.Any])
        
        inline def setCanListChildrenUndefined: Self = StObject.set(x, "canListChildren", js.undefined)
        
        inline def setCanManageMembers(value: Boolean): Self = StObject.set(x, "canManageMembers", value.asInstanceOf[js.Any])
        
        inline def setCanManageMembersUndefined: Self = StObject.set(x, "canManageMembers", js.undefined)
        
        inline def setCanReadRevisions(value: Boolean): Self = StObject.set(x, "canReadRevisions", value.asInstanceOf[js.Any])
        
        inline def setCanReadRevisionsUndefined: Self = StObject.set(x, "canReadRevisions", js.undefined)
        
        inline def setCanRemoveChildren(value: Boolean): Self = StObject.set(x, "canRemoveChildren", value.asInstanceOf[js.Any])
        
        inline def setCanRemoveChildrenUndefined: Self = StObject.set(x, "canRemoveChildren", js.undefined)
        
        inline def setCanRename(value: Boolean): Self = StObject.set(x, "canRename", value.asInstanceOf[js.Any])
        
        inline def setCanRenameTeamDrive(value: Boolean): Self = StObject.set(x, "canRenameTeamDrive", value.asInstanceOf[js.Any])
        
        inline def setCanRenameTeamDriveUndefined: Self = StObject.set(x, "canRenameTeamDrive", js.undefined)
        
        inline def setCanRenameUndefined: Self = StObject.set(x, "canRename", js.undefined)
        
        inline def setCanShare(value: Boolean): Self = StObject.set(x, "canShare", value.asInstanceOf[js.Any])
        
        inline def setCanShareUndefined: Self = StObject.set(x, "canShare", js.undefined)
        
        inline def setCanTrashChildren(value: Boolean): Self = StObject.set(x, "canTrashChildren", value.asInstanceOf[js.Any])
        
        inline def setCanTrashChildrenUndefined: Self = StObject.set(x, "canTrashChildren", js.undefined)
      }
    }
    
    trait TeamDriveList extends StObject {
      
      var items: js.UndefOr[js.Array[TeamDrive]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object TeamDriveList {
      
      inline def apply(): TeamDriveList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TeamDriveList]
      }
      
      extension [Self <: TeamDriveList](x: Self) {
        
        inline def setItems(value: js.Array[TeamDrive]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: TeamDrive*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait TeamDriveRestrictions extends StObject {
      
      var adminManagedRestrictions: js.UndefOr[Boolean] = js.undefined
      
      var copyRequiresWriterPermission: js.UndefOr[Boolean] = js.undefined
      
      var domainUsersOnly: js.UndefOr[Boolean] = js.undefined
      
      var teamMembersOnly: js.UndefOr[Boolean] = js.undefined
    }
    object TeamDriveRestrictions {
      
      inline def apply(): TeamDriveRestrictions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TeamDriveRestrictions]
      }
      
      extension [Self <: TeamDriveRestrictions](x: Self) {
        
        inline def setAdminManagedRestrictions(value: Boolean): Self = StObject.set(x, "adminManagedRestrictions", value.asInstanceOf[js.Any])
        
        inline def setAdminManagedRestrictionsUndefined: Self = StObject.set(x, "adminManagedRestrictions", js.undefined)
        
        inline def setCopyRequiresWriterPermission(value: Boolean): Self = StObject.set(x, "copyRequiresWriterPermission", value.asInstanceOf[js.Any])
        
        inline def setCopyRequiresWriterPermissionUndefined: Self = StObject.set(x, "copyRequiresWriterPermission", js.undefined)
        
        inline def setDomainUsersOnly(value: Boolean): Self = StObject.set(x, "domainUsersOnly", value.asInstanceOf[js.Any])
        
        inline def setDomainUsersOnlyUndefined: Self = StObject.set(x, "domainUsersOnly", js.undefined)
        
        inline def setTeamMembersOnly(value: Boolean): Self = StObject.set(x, "teamMembersOnly", value.asInstanceOf[js.Any])
        
        inline def setTeamMembersOnlyUndefined: Self = StObject.set(x, "teamMembersOnly", js.undefined)
      }
    }
    
    trait User extends StObject {
      
      var displayName: js.UndefOr[String] = js.undefined
      
      var emailAddress: js.UndefOr[String] = js.undefined
      
      var isAuthenticatedUser: js.UndefOr[Boolean] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var permissionId: js.UndefOr[String] = js.undefined
      
      var picture: js.UndefOr[UserPicture] = js.undefined
    }
    object User {
      
      inline def apply(): typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User]
      }
      
      extension [Self <: typings.googleAppsScript.GoogleAppsScript.Drive.Schema.User](x: Self) {
        
        inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
        
        inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
        
        inline def setIsAuthenticatedUser(value: Boolean): Self = StObject.set(x, "isAuthenticatedUser", value.asInstanceOf[js.Any])
        
        inline def setIsAuthenticatedUserUndefined: Self = StObject.set(x, "isAuthenticatedUser", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
        
        inline def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
        
        inline def setPicture(value: UserPicture): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
        
        inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
      }
    }
    
    trait UserPicture extends StObject {
      
      var url: js.UndefOr[String] = js.undefined
    }
    object UserPicture {
      
      inline def apply(): UserPicture = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UserPicture]
      }
      
      extension [Self <: UserPicture](x: Self) {
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
  }
  
  /**
    * A user associated with a file in Google Drive. Users can be accessed from File.getEditors(), Folder.getViewers(), and other methods.
    *
    *     // Log the email address of all users who have edit access to a file.
    *     var file = DriveApp.getFileById('1234567890abcdefghijklmnopqrstuvwxyz');
    *     var editors = file.getEditors();
    *     for (var i = 0; i < editors.length; i++) {
    *       Logger.log(editors[i].getEmail());
    *     }
    */
  trait User extends StObject {
    
    /** Gets the domain name associated with the user's account. */
    def getDomain(): String
    
    /**
      * Gets the user's email address. The user's email address is only available
      * if the user has chosen to share the address from the Google+ account settings
      * page, or if the user belongs to the same domain as the user running the script
      * and the domain administrator has allowed all users within the domain to see
      * other users' email addresses.
      */
    def getEmail(): String
    
    /** Gets the user's name. This method returns null if the user's name is not available. */
    def getName(): String
    
    /** Gets the URL for the user's photo. This method returns null if the user's photo is not available. */
    def getPhotoUrl(): String
    
    /** @deprecated DO NOT USE */ def getUserLoginId(): String
  }
  object User {
    
    inline def apply(
      getDomain: () => String,
      getEmail: () => String,
      getName: () => String,
      getPhotoUrl: () => String,
      getUserLoginId: () => String
    ): typings.googleAppsScript.GoogleAppsScript.Drive.User = {
      val __obj = js.Dynamic.literal(getDomain = js.Any.fromFunction0(getDomain), getEmail = js.Any.fromFunction0(getEmail), getName = js.Any.fromFunction0(getName), getPhotoUrl = js.Any.fromFunction0(getPhotoUrl), getUserLoginId = js.Any.fromFunction0(getUserLoginId))
      __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.Drive.User]
    }
    
    extension [Self <: typings.googleAppsScript.GoogleAppsScript.Drive.User](x: Self) {
      
      inline def setGetDomain(value: () => String): Self = StObject.set(x, "getDomain", js.Any.fromFunction0(value))
      
      inline def setGetEmail(value: () => String): Self = StObject.set(x, "getEmail", js.Any.fromFunction0(value))
      
      inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      inline def setGetPhotoUrl(value: () => String): Self = StObject.set(x, "getPhotoUrl", js.Any.fromFunction0(value))
      
      inline def setGetUserLoginId(value: () => String): Self = StObject.set(x, "getUserLoginId", js.Any.fromFunction0(value))
    }
  }
}
