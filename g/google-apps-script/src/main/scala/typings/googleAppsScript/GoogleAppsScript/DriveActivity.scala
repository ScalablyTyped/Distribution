package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.DriveActivity.Collection.ActivityCollection
import typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.ConsolidationStrategy
import typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.QueryDriveActivityRequest
import typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.QueryDriveActivityResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriveActivity extends StObject {
  
  var Activity: js.UndefOr[ActivityCollection] = js.undefined
  
  // Create a new instance of ConsolidationStrategy
  def newConsolidationStrategy(): ConsolidationStrategy
  
  // Create a new instance of Legacy
  def newLegacy(): Any
  
  // Create a new instance of NoConsolidation
  def newNoConsolidation(): Any
  
  // Create a new instance of QueryDriveActivityRequest
  def newQueryDriveActivityRequest(): QueryDriveActivityRequest
}
object DriveActivity {
  
  inline def apply(
    newConsolidationStrategy: () => ConsolidationStrategy,
    newLegacy: () => Any,
    newNoConsolidation: () => Any,
    newQueryDriveActivityRequest: () => QueryDriveActivityRequest
  ): DriveActivity = {
    val __obj = js.Dynamic.literal(newConsolidationStrategy = js.Any.fromFunction0(newConsolidationStrategy), newLegacy = js.Any.fromFunction0(newLegacy), newNoConsolidation = js.Any.fromFunction0(newNoConsolidation), newQueryDriveActivityRequest = js.Any.fromFunction0(newQueryDriveActivityRequest))
    __obj.asInstanceOf[DriveActivity]
  }
  
  object Collection {
    
    trait ActivityCollection extends StObject {
      
      // Query past activity in Google Drive.
      def query(resource: QueryDriveActivityRequest): QueryDriveActivityResponse
    }
    object ActivityCollection {
      
      inline def apply(query: QueryDriveActivityRequest => QueryDriveActivityResponse): ActivityCollection = {
        val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
        __obj.asInstanceOf[ActivityCollection]
      }
      
      extension [Self <: ActivityCollection](x: Self) {
        
        inline def setQuery(value: QueryDriveActivityRequest => QueryDriveActivityResponse): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
      }
    }
  }
  
  extension [Self <: DriveActivity](x: Self) {
    
    inline def setActivity(value: ActivityCollection): Self = StObject.set(x, "Activity", value.asInstanceOf[js.Any])
    
    inline def setActivityUndefined: Self = StObject.set(x, "Activity", js.undefined)
    
    inline def setNewConsolidationStrategy(value: () => ConsolidationStrategy): Self = StObject.set(x, "newConsolidationStrategy", js.Any.fromFunction0(value))
    
    inline def setNewLegacy(value: () => Any): Self = StObject.set(x, "newLegacy", js.Any.fromFunction0(value))
    
    inline def setNewNoConsolidation(value: () => Any): Self = StObject.set(x, "newNoConsolidation", js.Any.fromFunction0(value))
    
    inline def setNewQueryDriveActivityRequest(value: () => QueryDriveActivityRequest): Self = StObject.set(x, "newQueryDriveActivityRequest", js.Any.fromFunction0(value))
  }
  
  object Schema {
    
    trait Action extends StObject {
      
      var actor: js.UndefOr[Actor] = js.undefined
      
      var detail: js.UndefOr[ActionDetail] = js.undefined
      
      var target: js.UndefOr[Target] = js.undefined
      
      var timeRange: js.UndefOr[TimeRange] = js.undefined
      
      var timestamp: js.UndefOr[String] = js.undefined
    }
    object Action {
      
      inline def apply(): Action = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Action]
      }
      
      extension [Self <: Action](x: Self) {
        
        inline def setActor(value: Actor): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
        
        inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
        
        inline def setDetail(value: ActionDetail): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
        
        inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
        
        inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
        
        inline def setTimeRange(value: TimeRange): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
        
        inline def setTimeRangeUndefined: Self = StObject.set(x, "timeRange", js.undefined)
        
        inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
        
        inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      }
    }
    
    trait ActionDetail extends StObject {
      
      var comment: js.UndefOr[Comment] = js.undefined
      
      var create: js.UndefOr[Create] = js.undefined
      
      var delete: js.UndefOr[Delete] = js.undefined
      
      var dlpChange: js.UndefOr[DataLeakPreventionChange] = js.undefined
      
      var edit: js.UndefOr[Any] = js.undefined
      
      var move: js.UndefOr[Move] = js.undefined
      
      var permissionChange: js.UndefOr[PermissionChange] = js.undefined
      
      var reference: js.UndefOr[ApplicationReference] = js.undefined
      
      var rename: js.UndefOr[Rename] = js.undefined
      
      var restore: js.UndefOr[Restore] = js.undefined
      
      var settingsChange: js.UndefOr[SettingsChange] = js.undefined
    }
    object ActionDetail {
      
      inline def apply(): ActionDetail = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActionDetail]
      }
      
      extension [Self <: ActionDetail](x: Self) {
        
        inline def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
        
        inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
        
        inline def setCreate(value: Create): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
        
        inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
        
        inline def setDelete(value: Delete): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
        
        inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
        
        inline def setDlpChange(value: DataLeakPreventionChange): Self = StObject.set(x, "dlpChange", value.asInstanceOf[js.Any])
        
        inline def setDlpChangeUndefined: Self = StObject.set(x, "dlpChange", js.undefined)
        
        inline def setEdit(value: Any): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
        
        inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
        
        inline def setMove(value: Move): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
        
        inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
        
        inline def setPermissionChange(value: PermissionChange): Self = StObject.set(x, "permissionChange", value.asInstanceOf[js.Any])
        
        inline def setPermissionChangeUndefined: Self = StObject.set(x, "permissionChange", js.undefined)
        
        inline def setReference(value: ApplicationReference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
        
        inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
        
        inline def setRename(value: Rename): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
        
        inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
        
        inline def setRestore(value: Restore): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
        
        inline def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
        
        inline def setSettingsChange(value: SettingsChange): Self = StObject.set(x, "settingsChange", value.asInstanceOf[js.Any])
        
        inline def setSettingsChangeUndefined: Self = StObject.set(x, "settingsChange", js.undefined)
      }
    }
    
    trait Actor extends StObject {
      
      var administrator: js.UndefOr[String] = js.undefined
      
      var anonymous: js.UndefOr[String] = js.undefined
      
      var impersonation: js.UndefOr[Impersonation] = js.undefined
      
      var system: js.UndefOr[SystemEvent] = js.undefined
      
      var user: js.UndefOr[User] = js.undefined
    }
    object Actor {
      
      inline def apply(): Actor = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Actor]
      }
      
      extension [Self <: Actor](x: Self) {
        
        inline def setAdministrator(value: String): Self = StObject.set(x, "administrator", value.asInstanceOf[js.Any])
        
        inline def setAdministratorUndefined: Self = StObject.set(x, "administrator", js.undefined)
        
        inline def setAnonymous(value: String): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
        
        inline def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
        
        inline def setImpersonation(value: Impersonation): Self = StObject.set(x, "impersonation", value.asInstanceOf[js.Any])
        
        inline def setImpersonationUndefined: Self = StObject.set(x, "impersonation", js.undefined)
        
        inline def setSystem(value: SystemEvent): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
        
        inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
        
        inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      }
    }
    
    trait ApplicationReference extends StObject {
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object ApplicationReference {
      
      inline def apply(): ApplicationReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ApplicationReference]
      }
      
      extension [Self <: ApplicationReference](x: Self) {
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait Assignment extends StObject {
      
      var subtype: js.UndefOr[String] = js.undefined
    }
    object Assignment {
      
      inline def apply(): Assignment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Assignment]
      }
      
      extension [Self <: Assignment](x: Self) {
        
        inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
        
        inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
      }
    }
    
    trait Comment extends StObject {
      
      var assignment: js.UndefOr[Assignment] = js.undefined
      
      var mentionedUsers: js.UndefOr[js.Array[User]] = js.undefined
      
      var post: js.UndefOr[Post] = js.undefined
      
      var suggestion: js.UndefOr[Suggestion] = js.undefined
    }
    object Comment {
      
      inline def apply(): Comment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Comment]
      }
      
      extension [Self <: Comment](x: Self) {
        
        inline def setAssignment(value: Assignment): Self = StObject.set(x, "assignment", value.asInstanceOf[js.Any])
        
        inline def setAssignmentUndefined: Self = StObject.set(x, "assignment", js.undefined)
        
        inline def setMentionedUsers(value: js.Array[User]): Self = StObject.set(x, "mentionedUsers", value.asInstanceOf[js.Any])
        
        inline def setMentionedUsersUndefined: Self = StObject.set(x, "mentionedUsers", js.undefined)
        
        inline def setMentionedUsersVarargs(value: User*): Self = StObject.set(x, "mentionedUsers", js.Array(value*))
        
        inline def setPost(value: Post): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
        
        inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
        
        inline def setSuggestion(value: Suggestion): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
        
        inline def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
      }
    }
    
    trait ConsolidationStrategy extends StObject {
      
      var legacy: js.UndefOr[Any] = js.undefined
      
      var none: js.UndefOr[Any] = js.undefined
    }
    object ConsolidationStrategy {
      
      inline def apply(): ConsolidationStrategy = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConsolidationStrategy]
      }
      
      extension [Self <: ConsolidationStrategy](x: Self) {
        
        inline def setLegacy(value: Any): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
        
        inline def setLegacyUndefined: Self = StObject.set(x, "legacy", js.undefined)
        
        inline def setNone(value: Any): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
        
        inline def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
      }
    }
    
    trait Copy extends StObject {
      
      var originalObject: js.UndefOr[TargetReference] = js.undefined
    }
    object Copy {
      
      inline def apply(): Copy = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Copy]
      }
      
      extension [Self <: Copy](x: Self) {
        
        inline def setOriginalObject(value: TargetReference): Self = StObject.set(x, "originalObject", value.asInstanceOf[js.Any])
        
        inline def setOriginalObjectUndefined: Self = StObject.set(x, "originalObject", js.undefined)
      }
    }
    
    trait Create extends StObject {
      
      var copy: js.UndefOr[Copy] = js.undefined
      
      var `new`: js.UndefOr[Any] = js.undefined
      
      var upload: js.UndefOr[Any] = js.undefined
    }
    object Create {
      
      inline def apply(): Create = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Create]
      }
      
      extension [Self <: Create](x: Self) {
        
        inline def setCopy(value: Copy): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
        
        inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
        
        inline def setNew(value: Any): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
        
        inline def setNewUndefined: Self = StObject.set(x, "new", js.undefined)
        
        inline def setUpload(value: Any): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
        
        inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
      }
    }
    
    trait DataLeakPreventionChange extends StObject {
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object DataLeakPreventionChange {
      
      inline def apply(): DataLeakPreventionChange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DataLeakPreventionChange]
      }
      
      extension [Self <: DataLeakPreventionChange](x: Self) {
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait Delete extends StObject {
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Delete {
      
      inline def apply(): Delete = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Delete]
      }
      
      extension [Self <: Delete](x: Self) {
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait Domain extends StObject {
      
      var legacyId: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
    }
    object Domain {
      
      inline def apply(): Domain = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Domain]
      }
      
      extension [Self <: Domain](x: Self) {
        
        inline def setLegacyId(value: String): Self = StObject.set(x, "legacyId", value.asInstanceOf[js.Any])
        
        inline def setLegacyIdUndefined: Self = StObject.set(x, "legacyId", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait DriveActivity extends StObject {
      
      var actions: js.UndefOr[js.Array[Action]] = js.undefined
      
      var actors: js.UndefOr[js.Array[Actor]] = js.undefined
      
      var primaryActionDetail: js.UndefOr[ActionDetail] = js.undefined
      
      var targets: js.UndefOr[js.Array[Target]] = js.undefined
      
      var timeRange: js.UndefOr[TimeRange] = js.undefined
      
      var timestamp: js.UndefOr[String] = js.undefined
    }
    object DriveActivity {
      
      inline def apply(): typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.DriveActivity = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.DriveActivity]
      }
      
      extension [Self <: typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.DriveActivity](x: Self) {
        
        inline def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
        
        inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
        
        inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value*))
        
        inline def setActors(value: js.Array[Actor]): Self = StObject.set(x, "actors", value.asInstanceOf[js.Any])
        
        inline def setActorsUndefined: Self = StObject.set(x, "actors", js.undefined)
        
        inline def setActorsVarargs(value: Actor*): Self = StObject.set(x, "actors", js.Array(value*))
        
        inline def setPrimaryActionDetail(value: ActionDetail): Self = StObject.set(x, "primaryActionDetail", value.asInstanceOf[js.Any])
        
        inline def setPrimaryActionDetailUndefined: Self = StObject.set(x, "primaryActionDetail", js.undefined)
        
        inline def setTargets(value: js.Array[Target]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
        
        inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
        
        inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "targets", js.Array(value*))
        
        inline def setTimeRange(value: TimeRange): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
        
        inline def setTimeRangeUndefined: Self = StObject.set(x, "timeRange", js.undefined)
        
        inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
        
        inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      }
    }
    
    trait DriveItem extends StObject {
      
      var file: js.UndefOr[Any] = js.undefined
      
      var folder: js.UndefOr[Folder] = js.undefined
      
      var mimeType: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var owner: js.UndefOr[Owner] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object DriveItem {
      
      inline def apply(): DriveItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DriveItem]
      }
      
      extension [Self <: DriveItem](x: Self) {
        
        inline def setFile(value: Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
        
        inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
        
        inline def setFolder(value: Folder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
        
        inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
        
        inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
        
        inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setOwner(value: Owner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
        
        inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait DriveItemReference extends StObject {
      
      var file: js.UndefOr[Any] = js.undefined
      
      var folder: js.UndefOr[Folder] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object DriveItemReference {
      
      inline def apply(): DriveItemReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DriveItemReference]
      }
      
      extension [Self <: DriveItemReference](x: Self) {
        
        inline def setFile(value: Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
        
        inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
        
        inline def setFolder(value: Folder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
        
        inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait FileComment extends StObject {
      
      var legacyCommentId: js.UndefOr[String] = js.undefined
      
      var legacyDiscussionId: js.UndefOr[String] = js.undefined
      
      var linkToDiscussion: js.UndefOr[String] = js.undefined
      
      var parent: js.UndefOr[DriveItem] = js.undefined
    }
    object FileComment {
      
      inline def apply(): FileComment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FileComment]
      }
      
      extension [Self <: FileComment](x: Self) {
        
        inline def setLegacyCommentId(value: String): Self = StObject.set(x, "legacyCommentId", value.asInstanceOf[js.Any])
        
        inline def setLegacyCommentIdUndefined: Self = StObject.set(x, "legacyCommentId", js.undefined)
        
        inline def setLegacyDiscussionId(value: String): Self = StObject.set(x, "legacyDiscussionId", value.asInstanceOf[js.Any])
        
        inline def setLegacyDiscussionIdUndefined: Self = StObject.set(x, "legacyDiscussionId", js.undefined)
        
        inline def setLinkToDiscussion(value: String): Self = StObject.set(x, "linkToDiscussion", value.asInstanceOf[js.Any])
        
        inline def setLinkToDiscussionUndefined: Self = StObject.set(x, "linkToDiscussion", js.undefined)
        
        inline def setParent(value: DriveItem): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      }
    }
    
    trait Folder extends StObject {
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Folder {
      
      inline def apply(): Folder = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Folder]
      }
      
      extension [Self <: Folder](x: Self) {
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait Group extends StObject {
      
      var email: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object Group {
      
      inline def apply(): Group = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Group]
      }
      
      extension [Self <: Group](x: Self) {
        
        inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait Impersonation extends StObject {
      
      var impersonatedUser: js.UndefOr[User] = js.undefined
    }
    object Impersonation {
      
      inline def apply(): Impersonation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Impersonation]
      }
      
      extension [Self <: Impersonation](x: Self) {
        
        inline def setImpersonatedUser(value: User): Self = StObject.set(x, "impersonatedUser", value.asInstanceOf[js.Any])
        
        inline def setImpersonatedUserUndefined: Self = StObject.set(x, "impersonatedUser", js.undefined)
      }
    }
    
    trait KnownUser extends StObject {
      
      var isCurrentUser: js.UndefOr[Boolean] = js.undefined
      
      var personName: js.UndefOr[String] = js.undefined
    }
    object KnownUser {
      
      inline def apply(): KnownUser = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[KnownUser]
      }
      
      extension [Self <: KnownUser](x: Self) {
        
        inline def setIsCurrentUser(value: Boolean): Self = StObject.set(x, "isCurrentUser", value.asInstanceOf[js.Any])
        
        inline def setIsCurrentUserUndefined: Self = StObject.set(x, "isCurrentUser", js.undefined)
        
        inline def setPersonName(value: String): Self = StObject.set(x, "personName", value.asInstanceOf[js.Any])
        
        inline def setPersonNameUndefined: Self = StObject.set(x, "personName", js.undefined)
      }
    }
    
    trait Move extends StObject {
      
      var addedParents: js.UndefOr[js.Array[TargetReference]] = js.undefined
      
      var removedParents: js.UndefOr[js.Array[TargetReference]] = js.undefined
    }
    object Move {
      
      inline def apply(): Move = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Move]
      }
      
      extension [Self <: Move](x: Self) {
        
        inline def setAddedParents(value: js.Array[TargetReference]): Self = StObject.set(x, "addedParents", value.asInstanceOf[js.Any])
        
        inline def setAddedParentsUndefined: Self = StObject.set(x, "addedParents", js.undefined)
        
        inline def setAddedParentsVarargs(value: TargetReference*): Self = StObject.set(x, "addedParents", js.Array(value*))
        
        inline def setRemovedParents(value: js.Array[TargetReference]): Self = StObject.set(x, "removedParents", value.asInstanceOf[js.Any])
        
        inline def setRemovedParentsUndefined: Self = StObject.set(x, "removedParents", js.undefined)
        
        inline def setRemovedParentsVarargs(value: TargetReference*): Self = StObject.set(x, "removedParents", js.Array(value*))
      }
    }
    
    trait Owner extends StObject {
      
      var domain: js.UndefOr[Domain] = js.undefined
      
      var teamDrive: js.UndefOr[TeamDriveReference] = js.undefined
      
      var user: js.UndefOr[User] = js.undefined
    }
    object Owner {
      
      inline def apply(): Owner = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Owner]
      }
      
      extension [Self <: Owner](x: Self) {
        
        inline def setDomain(value: Domain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        inline def setTeamDrive(value: TeamDriveReference): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
        
        inline def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
        
        inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      }
    }
    
    trait Permission extends StObject {
      
      var allowDiscovery: js.UndefOr[Boolean] = js.undefined
      
      var anyone: js.UndefOr[Any] = js.undefined
      
      var domain: js.UndefOr[Domain] = js.undefined
      
      var group: js.UndefOr[Group] = js.undefined
      
      var role: js.UndefOr[String] = js.undefined
      
      var user: js.UndefOr[User] = js.undefined
    }
    object Permission {
      
      inline def apply(): Permission = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Permission]
      }
      
      extension [Self <: Permission](x: Self) {
        
        inline def setAllowDiscovery(value: Boolean): Self = StObject.set(x, "allowDiscovery", value.asInstanceOf[js.Any])
        
        inline def setAllowDiscoveryUndefined: Self = StObject.set(x, "allowDiscovery", js.undefined)
        
        inline def setAnyone(value: Any): Self = StObject.set(x, "anyone", value.asInstanceOf[js.Any])
        
        inline def setAnyoneUndefined: Self = StObject.set(x, "anyone", js.undefined)
        
        inline def setDomain(value: Domain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        inline def setGroup(value: Group): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
        
        inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
        
        inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      }
    }
    
    trait PermissionChange extends StObject {
      
      var addedPermissions: js.UndefOr[js.Array[Permission]] = js.undefined
      
      var removedPermissions: js.UndefOr[js.Array[Permission]] = js.undefined
    }
    object PermissionChange {
      
      inline def apply(): PermissionChange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PermissionChange]
      }
      
      extension [Self <: PermissionChange](x: Self) {
        
        inline def setAddedPermissions(value: js.Array[Permission]): Self = StObject.set(x, "addedPermissions", value.asInstanceOf[js.Any])
        
        inline def setAddedPermissionsUndefined: Self = StObject.set(x, "addedPermissions", js.undefined)
        
        inline def setAddedPermissionsVarargs(value: Permission*): Self = StObject.set(x, "addedPermissions", js.Array(value*))
        
        inline def setRemovedPermissions(value: js.Array[Permission]): Self = StObject.set(x, "removedPermissions", value.asInstanceOf[js.Any])
        
        inline def setRemovedPermissionsUndefined: Self = StObject.set(x, "removedPermissions", js.undefined)
        
        inline def setRemovedPermissionsVarargs(value: Permission*): Self = StObject.set(x, "removedPermissions", js.Array(value*))
      }
    }
    
    trait Post extends StObject {
      
      var subtype: js.UndefOr[String] = js.undefined
    }
    object Post {
      
      inline def apply(): Post = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Post]
      }
      
      extension [Self <: Post](x: Self) {
        
        inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
        
        inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
      }
    }
    
    trait QueryDriveActivityRequest extends StObject {
      
      var ancestorName: js.UndefOr[String] = js.undefined
      
      var consolidationStrategy: js.UndefOr[ConsolidationStrategy] = js.undefined
      
      var filter: js.UndefOr[String] = js.undefined
      
      var itemName: js.UndefOr[String] = js.undefined
      
      var pageSize: js.UndefOr[Double] = js.undefined
      
      var pageToken: js.UndefOr[String] = js.undefined
    }
    object QueryDriveActivityRequest {
      
      inline def apply(): QueryDriveActivityRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[QueryDriveActivityRequest]
      }
      
      extension [Self <: QueryDriveActivityRequest](x: Self) {
        
        inline def setAncestorName(value: String): Self = StObject.set(x, "ancestorName", value.asInstanceOf[js.Any])
        
        inline def setAncestorNameUndefined: Self = StObject.set(x, "ancestorName", js.undefined)
        
        inline def setConsolidationStrategy(value: ConsolidationStrategy): Self = StObject.set(x, "consolidationStrategy", value.asInstanceOf[js.Any])
        
        inline def setConsolidationStrategyUndefined: Self = StObject.set(x, "consolidationStrategy", js.undefined)
        
        inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        inline def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
        
        inline def setItemNameUndefined: Self = StObject.set(x, "itemName", js.undefined)
        
        inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      }
    }
    
    trait QueryDriveActivityResponse extends StObject {
      
      var activities: js.UndefOr[
            js.Array[typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.DriveActivity]
          ] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object QueryDriveActivityResponse {
      
      inline def apply(): QueryDriveActivityResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[QueryDriveActivityResponse]
      }
      
      extension [Self <: QueryDriveActivityResponse](x: Self) {
        
        inline def setActivities(value: js.Array[typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.DriveActivity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
        
        inline def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
        
        inline def setActivitiesVarargs(value: typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.DriveActivity*): Self = StObject.set(x, "activities", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait Rename extends StObject {
      
      var newTitle: js.UndefOr[String] = js.undefined
      
      var oldTitle: js.UndefOr[String] = js.undefined
    }
    object Rename {
      
      inline def apply(): Rename = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Rename]
      }
      
      extension [Self <: Rename](x: Self) {
        
        inline def setNewTitle(value: String): Self = StObject.set(x, "newTitle", value.asInstanceOf[js.Any])
        
        inline def setNewTitleUndefined: Self = StObject.set(x, "newTitle", js.undefined)
        
        inline def setOldTitle(value: String): Self = StObject.set(x, "oldTitle", value.asInstanceOf[js.Any])
        
        inline def setOldTitleUndefined: Self = StObject.set(x, "oldTitle", js.undefined)
      }
    }
    
    trait Restore extends StObject {
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Restore {
      
      inline def apply(): Restore = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Restore]
      }
      
      extension [Self <: Restore](x: Self) {
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait RestrictionChange extends StObject {
      
      var feature: js.UndefOr[String] = js.undefined
      
      var newRestriction: js.UndefOr[String] = js.undefined
    }
    object RestrictionChange {
      
      inline def apply(): RestrictionChange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RestrictionChange]
      }
      
      extension [Self <: RestrictionChange](x: Self) {
        
        inline def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
        
        inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
        
        inline def setNewRestriction(value: String): Self = StObject.set(x, "newRestriction", value.asInstanceOf[js.Any])
        
        inline def setNewRestrictionUndefined: Self = StObject.set(x, "newRestriction", js.undefined)
      }
    }
    
    trait SettingsChange extends StObject {
      
      var restrictionChanges: js.UndefOr[js.Array[RestrictionChange]] = js.undefined
    }
    object SettingsChange {
      
      inline def apply(): SettingsChange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SettingsChange]
      }
      
      extension [Self <: SettingsChange](x: Self) {
        
        inline def setRestrictionChanges(value: js.Array[RestrictionChange]): Self = StObject.set(x, "restrictionChanges", value.asInstanceOf[js.Any])
        
        inline def setRestrictionChangesUndefined: Self = StObject.set(x, "restrictionChanges", js.undefined)
        
        inline def setRestrictionChangesVarargs(value: RestrictionChange*): Self = StObject.set(x, "restrictionChanges", js.Array(value*))
      }
    }
    
    trait Suggestion extends StObject {
      
      var subtype: js.UndefOr[String] = js.undefined
    }
    object Suggestion {
      
      inline def apply(): Suggestion = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Suggestion]
      }
      
      extension [Self <: Suggestion](x: Self) {
        
        inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
        
        inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
      }
    }
    
    trait SystemEvent extends StObject {
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object SystemEvent {
      
      inline def apply(): SystemEvent = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SystemEvent]
      }
      
      extension [Self <: SystemEvent](x: Self) {
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait Target extends StObject {
      
      var driveItem: js.UndefOr[DriveItem] = js.undefined
      
      var fileComment: js.UndefOr[Any] = js.undefined
      
      var teamDrive: js.UndefOr[TeamDrive] = js.undefined
    }
    object Target {
      
      inline def apply(): Target = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Target]
      }
      
      extension [Self <: Target](x: Self) {
        
        inline def setDriveItem(value: DriveItem): Self = StObject.set(x, "driveItem", value.asInstanceOf[js.Any])
        
        inline def setDriveItemUndefined: Self = StObject.set(x, "driveItem", js.undefined)
        
        inline def setFileComment(value: Any): Self = StObject.set(x, "fileComment", value.asInstanceOf[js.Any])
        
        inline def setFileCommentUndefined: Self = StObject.set(x, "fileComment", js.undefined)
        
        inline def setTeamDrive(value: TeamDrive): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
        
        inline def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
      }
    }
    
    trait TargetReference extends StObject {
      
      var driveItem: js.UndefOr[DriveItemReference] = js.undefined
      
      var teamDrive: js.UndefOr[TeamDriveReference] = js.undefined
    }
    object TargetReference {
      
      inline def apply(): TargetReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TargetReference]
      }
      
      extension [Self <: TargetReference](x: Self) {
        
        inline def setDriveItem(value: DriveItemReference): Self = StObject.set(x, "driveItem", value.asInstanceOf[js.Any])
        
        inline def setDriveItemUndefined: Self = StObject.set(x, "driveItem", js.undefined)
        
        inline def setTeamDrive(value: TeamDriveReference): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
        
        inline def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
      }
    }
    
    trait TeamDrive extends StObject {
      
      var name: js.UndefOr[String] = js.undefined
      
      var root: js.UndefOr[DriveItem] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object TeamDrive {
      
      inline def apply(): TeamDrive = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TeamDrive]
      }
      
      extension [Self <: TeamDrive](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setRoot(value: DriveItem): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
        
        inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait TeamDriveReference extends StObject {
      
      var name: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object TeamDriveReference {
      
      inline def apply(): TeamDriveReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TeamDriveReference]
      }
      
      extension [Self <: TeamDriveReference](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait TimeRange extends StObject {
      
      var endTime: js.UndefOr[String] = js.undefined
      
      var startTime: js.UndefOr[String] = js.undefined
    }
    object TimeRange {
      
      inline def apply(): TimeRange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TimeRange]
      }
      
      extension [Self <: TimeRange](x: Self) {
        
        inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
        
        inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
        
        inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      }
    }
    
    trait User extends StObject {
      
      var deletedUser: js.UndefOr[Any] = js.undefined
      
      var knownUser: js.UndefOr[KnownUser] = js.undefined
      
      var unknownUser: js.UndefOr[Any] = js.undefined
    }
    object User {
      
      inline def apply(): User = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[User]
      }
      
      extension [Self <: User](x: Self) {
        
        inline def setDeletedUser(value: Any): Self = StObject.set(x, "deletedUser", value.asInstanceOf[js.Any])
        
        inline def setDeletedUserUndefined: Self = StObject.set(x, "deletedUser", js.undefined)
        
        inline def setKnownUser(value: KnownUser): Self = StObject.set(x, "knownUser", value.asInstanceOf[js.Any])
        
        inline def setKnownUserUndefined: Self = StObject.set(x, "knownUser", js.undefined)
        
        inline def setUnknownUser(value: Any): Self = StObject.set(x, "unknownUser", value.asInstanceOf[js.Any])
        
        inline def setUnknownUserUndefined: Self = StObject.set(x, "unknownUser", js.undefined)
      }
    }
  }
}
