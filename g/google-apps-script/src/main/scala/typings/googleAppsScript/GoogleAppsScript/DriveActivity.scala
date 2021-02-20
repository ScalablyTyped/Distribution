package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.DriveActivity.Collection.ActivityCollection
import typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.ConsolidationStrategy
import typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.QueryDriveActivityRequest
import typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.QueryDriveActivityResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveActivity extends StObject {
  
  var Activity: js.UndefOr[ActivityCollection] = js.native
  
  // Create a new instance of ConsolidationStrategy
  def newConsolidationStrategy(): ConsolidationStrategy = js.native
  
  // Create a new instance of Legacy
  def newLegacy(): js.Any = js.native
  
  // Create a new instance of NoConsolidation
  def newNoConsolidation(): js.Any = js.native
  
  // Create a new instance of QueryDriveActivityRequest
  def newQueryDriveActivityRequest(): QueryDriveActivityRequest = js.native
}
object DriveActivity {
  
  @scala.inline
  def apply(
    newConsolidationStrategy: () => ConsolidationStrategy,
    newLegacy: () => js.Any,
    newNoConsolidation: () => js.Any,
    newQueryDriveActivityRequest: () => QueryDriveActivityRequest
  ): DriveActivity = {
    val __obj = js.Dynamic.literal(newConsolidationStrategy = js.Any.fromFunction0(newConsolidationStrategy), newLegacy = js.Any.fromFunction0(newLegacy), newNoConsolidation = js.Any.fromFunction0(newNoConsolidation), newQueryDriveActivityRequest = js.Any.fromFunction0(newQueryDriveActivityRequest))
    __obj.asInstanceOf[DriveActivity]
  }
  
  object Collection {
    
    @js.native
    trait ActivityCollection extends StObject {
      
      // Query past activity in Google Drive.
      def query(resource: QueryDriveActivityRequest): QueryDriveActivityResponse = js.native
    }
    object ActivityCollection {
      
      @scala.inline
      def apply(query: QueryDriveActivityRequest => QueryDriveActivityResponse): ActivityCollection = {
        val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
        __obj.asInstanceOf[ActivityCollection]
      }
      
      @scala.inline
      implicit class ActivityCollectionMutableBuilder[Self <: ActivityCollection] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setQuery(value: QueryDriveActivityRequest => QueryDriveActivityResponse): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
      }
    }
  }
  
  @scala.inline
  implicit class DriveActivityMutableBuilder[Self <: DriveActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivity(value: ActivityCollection): Self = StObject.set(x, "Activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityUndefined: Self = StObject.set(x, "Activity", js.undefined)
    
    @scala.inline
    def setNewConsolidationStrategy(value: () => ConsolidationStrategy): Self = StObject.set(x, "newConsolidationStrategy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewLegacy(value: () => js.Any): Self = StObject.set(x, "newLegacy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewNoConsolidation(value: () => js.Any): Self = StObject.set(x, "newNoConsolidation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewQueryDriveActivityRequest(value: () => QueryDriveActivityRequest): Self = StObject.set(x, "newQueryDriveActivityRequest", js.Any.fromFunction0(value))
  }
  
  object Schema {
    
    @js.native
    trait Action extends StObject {
      
      var actor: js.UndefOr[Actor] = js.native
      
      var detail: js.UndefOr[ActionDetail] = js.native
      
      var target: js.UndefOr[Target] = js.native
      
      var timeRange: js.UndefOr[TimeRange] = js.native
      
      var timestamp: js.UndefOr[String] = js.native
    }
    object Action {
      
      @scala.inline
      def apply(): Action = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Action]
      }
      
      @scala.inline
      implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActor(value: Actor): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
        
        @scala.inline
        def setDetail(value: ActionDetail): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
        
        @scala.inline
        def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
        
        @scala.inline
        def setTimeRange(value: TimeRange): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeRangeUndefined: Self = StObject.set(x, "timeRange", js.undefined)
        
        @scala.inline
        def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      }
    }
    
    @js.native
    trait ActionDetail extends StObject {
      
      var comment: js.UndefOr[Comment] = js.native
      
      var create: js.UndefOr[Create] = js.native
      
      var delete: js.UndefOr[Delete] = js.native
      
      var dlpChange: js.UndefOr[DataLeakPreventionChange] = js.native
      
      var edit: js.UndefOr[js.Any] = js.native
      
      var move: js.UndefOr[Move] = js.native
      
      var permissionChange: js.UndefOr[PermissionChange] = js.native
      
      var reference: js.UndefOr[ApplicationReference] = js.native
      
      var rename: js.UndefOr[Rename] = js.native
      
      var restore: js.UndefOr[Restore] = js.native
      
      var settingsChange: js.UndefOr[SettingsChange] = js.native
    }
    object ActionDetail {
      
      @scala.inline
      def apply(): ActionDetail = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ActionDetail]
      }
      
      @scala.inline
      implicit class ActionDetailMutableBuilder[Self <: ActionDetail] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setComment(value: Comment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
        
        @scala.inline
        def setCreate(value: Create): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
        
        @scala.inline
        def setDelete(value: Delete): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
        
        @scala.inline
        def setDlpChange(value: DataLeakPreventionChange): Self = StObject.set(x, "dlpChange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDlpChangeUndefined: Self = StObject.set(x, "dlpChange", js.undefined)
        
        @scala.inline
        def setEdit(value: js.Any): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
        
        @scala.inline
        def setMove(value: Move): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
        
        @scala.inline
        def setPermissionChange(value: PermissionChange): Self = StObject.set(x, "permissionChange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPermissionChangeUndefined: Self = StObject.set(x, "permissionChange", js.undefined)
        
        @scala.inline
        def setReference(value: ApplicationReference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
        
        @scala.inline
        def setRename(value: Rename): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
        
        @scala.inline
        def setRestore(value: Restore): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
        
        @scala.inline
        def setSettingsChange(value: SettingsChange): Self = StObject.set(x, "settingsChange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSettingsChangeUndefined: Self = StObject.set(x, "settingsChange", js.undefined)
      }
    }
    
    @js.native
    trait Actor extends StObject {
      
      var administrator: js.UndefOr[String] = js.native
      
      var anonymous: js.UndefOr[String] = js.native
      
      var impersonation: js.UndefOr[Impersonation] = js.native
      
      var system: js.UndefOr[SystemEvent] = js.native
      
      var user: js.UndefOr[User] = js.native
    }
    object Actor {
      
      @scala.inline
      def apply(): Actor = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Actor]
      }
      
      @scala.inline
      implicit class ActorMutableBuilder[Self <: Actor] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdministrator(value: String): Self = StObject.set(x, "administrator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAdministratorUndefined: Self = StObject.set(x, "administrator", js.undefined)
        
        @scala.inline
        def setAnonymous(value: String): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
        
        @scala.inline
        def setImpersonation(value: Impersonation): Self = StObject.set(x, "impersonation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImpersonationUndefined: Self = StObject.set(x, "impersonation", js.undefined)
        
        @scala.inline
        def setSystem(value: SystemEvent): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
        
        @scala.inline
        def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      }
    }
    
    @js.native
    trait ApplicationReference extends StObject {
      
      var `type`: js.UndefOr[String] = js.native
    }
    object ApplicationReference {
      
      @scala.inline
      def apply(): ApplicationReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ApplicationReference]
      }
      
      @scala.inline
      implicit class ApplicationReferenceMutableBuilder[Self <: ApplicationReference] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait Assignment extends StObject {
      
      var subtype: js.UndefOr[String] = js.native
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
        def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
      }
    }
    
    @js.native
    trait Comment extends StObject {
      
      var assignment: js.UndefOr[Assignment] = js.native
      
      var mentionedUsers: js.UndefOr[js.Array[User]] = js.native
      
      var post: js.UndefOr[Post] = js.native
      
      var suggestion: js.UndefOr[Suggestion] = js.native
    }
    object Comment {
      
      @scala.inline
      def apply(): Comment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Comment]
      }
      
      @scala.inline
      implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAssignment(value: Assignment): Self = StObject.set(x, "assignment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAssignmentUndefined: Self = StObject.set(x, "assignment", js.undefined)
        
        @scala.inline
        def setMentionedUsers(value: js.Array[User]): Self = StObject.set(x, "mentionedUsers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMentionedUsersUndefined: Self = StObject.set(x, "mentionedUsers", js.undefined)
        
        @scala.inline
        def setMentionedUsersVarargs(value: User*): Self = StObject.set(x, "mentionedUsers", js.Array(value :_*))
        
        @scala.inline
        def setPost(value: Post): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
        
        @scala.inline
        def setSuggestion(value: Suggestion): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
      }
    }
    
    @js.native
    trait ConsolidationStrategy extends StObject {
      
      var legacy: js.UndefOr[js.Any] = js.native
      
      var none: js.UndefOr[js.Any] = js.native
    }
    object ConsolidationStrategy {
      
      @scala.inline
      def apply(): ConsolidationStrategy = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConsolidationStrategy]
      }
      
      @scala.inline
      implicit class ConsolidationStrategyMutableBuilder[Self <: ConsolidationStrategy] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLegacy(value: js.Any): Self = StObject.set(x, "legacy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLegacyUndefined: Self = StObject.set(x, "legacy", js.undefined)
        
        @scala.inline
        def setNone(value: js.Any): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
      }
    }
    
    @js.native
    trait Copy extends StObject {
      
      var originalObject: js.UndefOr[TargetReference] = js.native
    }
    object Copy {
      
      @scala.inline
      def apply(): Copy = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Copy]
      }
      
      @scala.inline
      implicit class CopyMutableBuilder[Self <: Copy] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOriginalObject(value: TargetReference): Self = StObject.set(x, "originalObject", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOriginalObjectUndefined: Self = StObject.set(x, "originalObject", js.undefined)
      }
    }
    
    @js.native
    trait Create extends StObject {
      
      var copy: js.UndefOr[Copy] = js.native
      
      var `new`: js.UndefOr[js.Any] = js.native
      
      var upload: js.UndefOr[js.Any] = js.native
    }
    object Create {
      
      @scala.inline
      def apply(): Create = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Create]
      }
      
      @scala.inline
      implicit class CreateMutableBuilder[Self <: Create] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCopy(value: Copy): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
        
        @scala.inline
        def setNew(value: js.Any): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNewUndefined: Self = StObject.set(x, "new", js.undefined)
        
        @scala.inline
        def setUpload(value: js.Any): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
      }
    }
    
    @js.native
    trait DataLeakPreventionChange extends StObject {
      
      var `type`: js.UndefOr[String] = js.native
    }
    object DataLeakPreventionChange {
      
      @scala.inline
      def apply(): DataLeakPreventionChange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DataLeakPreventionChange]
      }
      
      @scala.inline
      implicit class DataLeakPreventionChangeMutableBuilder[Self <: DataLeakPreventionChange] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait Delete extends StObject {
      
      var `type`: js.UndefOr[String] = js.native
    }
    object Delete {
      
      @scala.inline
      def apply(): Delete = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Delete]
      }
      
      @scala.inline
      implicit class DeleteMutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait Domain extends StObject {
      
      var legacyId: js.UndefOr[String] = js.native
      
      var name: js.UndefOr[String] = js.native
    }
    object Domain {
      
      @scala.inline
      def apply(): Domain = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Domain]
      }
      
      @scala.inline
      implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLegacyId(value: String): Self = StObject.set(x, "legacyId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLegacyIdUndefined: Self = StObject.set(x, "legacyId", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    @js.native
    trait DriveActivity extends StObject {
      
      var actions: js.UndefOr[js.Array[Action]] = js.native
      
      var actors: js.UndefOr[js.Array[Actor]] = js.native
      
      var primaryActionDetail: js.UndefOr[ActionDetail] = js.native
      
      var targets: js.UndefOr[js.Array[Target]] = js.native
      
      var timeRange: js.UndefOr[TimeRange] = js.native
      
      var timestamp: js.UndefOr[String] = js.native
    }
    object DriveActivity {
      
      @scala.inline
      def apply(): typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.DriveActivity = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.DriveActivity]
      }
      
      @scala.inline
      implicit class DriveActivityMutableBuilder[Self <: typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.DriveActivity] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
        
        @scala.inline
        def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
        
        @scala.inline
        def setActors(value: js.Array[Actor]): Self = StObject.set(x, "actors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActorsUndefined: Self = StObject.set(x, "actors", js.undefined)
        
        @scala.inline
        def setActorsVarargs(value: Actor*): Self = StObject.set(x, "actors", js.Array(value :_*))
        
        @scala.inline
        def setPrimaryActionDetail(value: ActionDetail): Self = StObject.set(x, "primaryActionDetail", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrimaryActionDetailUndefined: Self = StObject.set(x, "primaryActionDetail", js.undefined)
        
        @scala.inline
        def setTargets(value: js.Array[Target]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
        
        @scala.inline
        def setTargetsVarargs(value: Target*): Self = StObject.set(x, "targets", js.Array(value :_*))
        
        @scala.inline
        def setTimeRange(value: TimeRange): Self = StObject.set(x, "timeRange", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeRangeUndefined: Self = StObject.set(x, "timeRange", js.undefined)
        
        @scala.inline
        def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      }
    }
    
    @js.native
    trait DriveItem extends StObject {
      
      var file: js.UndefOr[js.Any] = js.native
      
      var folder: js.UndefOr[Folder] = js.native
      
      var mimeType: js.UndefOr[String] = js.native
      
      var name: js.UndefOr[String] = js.native
      
      var owner: js.UndefOr[Owner] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object DriveItem {
      
      @scala.inline
      def apply(): DriveItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DriveItem]
      }
      
      @scala.inline
      implicit class DriveItemMutableBuilder[Self <: DriveItem] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFile(value: js.Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
        
        @scala.inline
        def setFolder(value: Folder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
        
        @scala.inline
        def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setOwner(value: Owner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait DriveItemReference extends StObject {
      
      var file: js.UndefOr[js.Any] = js.native
      
      var folder: js.UndefOr[Folder] = js.native
      
      var name: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object DriveItemReference {
      
      @scala.inline
      def apply(): DriveItemReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DriveItemReference]
      }
      
      @scala.inline
      implicit class DriveItemReferenceMutableBuilder[Self <: DriveItemReference] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFile(value: js.Any): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
        
        @scala.inline
        def setFolder(value: Folder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait FileComment extends StObject {
      
      var legacyCommentId: js.UndefOr[String] = js.native
      
      var legacyDiscussionId: js.UndefOr[String] = js.native
      
      var linkToDiscussion: js.UndefOr[String] = js.native
      
      var parent: js.UndefOr[DriveItem] = js.native
    }
    object FileComment {
      
      @scala.inline
      def apply(): FileComment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FileComment]
      }
      
      @scala.inline
      implicit class FileCommentMutableBuilder[Self <: FileComment] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLegacyCommentId(value: String): Self = StObject.set(x, "legacyCommentId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLegacyCommentIdUndefined: Self = StObject.set(x, "legacyCommentId", js.undefined)
        
        @scala.inline
        def setLegacyDiscussionId(value: String): Self = StObject.set(x, "legacyDiscussionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLegacyDiscussionIdUndefined: Self = StObject.set(x, "legacyDiscussionId", js.undefined)
        
        @scala.inline
        def setLinkToDiscussion(value: String): Self = StObject.set(x, "linkToDiscussion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkToDiscussionUndefined: Self = StObject.set(x, "linkToDiscussion", js.undefined)
        
        @scala.inline
        def setParent(value: DriveItem): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      }
    }
    
    @js.native
    trait Folder extends StObject {
      
      var `type`: js.UndefOr[String] = js.native
    }
    object Folder {
      
      @scala.inline
      def apply(): Folder = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Folder]
      }
      
      @scala.inline
      implicit class FolderMutableBuilder[Self <: Folder] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait Group extends StObject {
      
      var email: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object Group {
      
      @scala.inline
      def apply(): Group = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Group]
      }
      
      @scala.inline
      implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait Impersonation extends StObject {
      
      var impersonatedUser: js.UndefOr[User] = js.native
    }
    object Impersonation {
      
      @scala.inline
      def apply(): Impersonation = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Impersonation]
      }
      
      @scala.inline
      implicit class ImpersonationMutableBuilder[Self <: Impersonation] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setImpersonatedUser(value: User): Self = StObject.set(x, "impersonatedUser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImpersonatedUserUndefined: Self = StObject.set(x, "impersonatedUser", js.undefined)
      }
    }
    
    @js.native
    trait KnownUser extends StObject {
      
      var isCurrentUser: js.UndefOr[Boolean] = js.native
      
      var personName: js.UndefOr[String] = js.native
    }
    object KnownUser {
      
      @scala.inline
      def apply(): KnownUser = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[KnownUser]
      }
      
      @scala.inline
      implicit class KnownUserMutableBuilder[Self <: KnownUser] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIsCurrentUser(value: Boolean): Self = StObject.set(x, "isCurrentUser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsCurrentUserUndefined: Self = StObject.set(x, "isCurrentUser", js.undefined)
        
        @scala.inline
        def setPersonName(value: String): Self = StObject.set(x, "personName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPersonNameUndefined: Self = StObject.set(x, "personName", js.undefined)
      }
    }
    
    @js.native
    trait Move extends StObject {
      
      var addedParents: js.UndefOr[js.Array[TargetReference]] = js.native
      
      var removedParents: js.UndefOr[js.Array[TargetReference]] = js.native
    }
    object Move {
      
      @scala.inline
      def apply(): Move = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Move]
      }
      
      @scala.inline
      implicit class MoveMutableBuilder[Self <: Move] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddedParents(value: js.Array[TargetReference]): Self = StObject.set(x, "addedParents", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddedParentsUndefined: Self = StObject.set(x, "addedParents", js.undefined)
        
        @scala.inline
        def setAddedParentsVarargs(value: TargetReference*): Self = StObject.set(x, "addedParents", js.Array(value :_*))
        
        @scala.inline
        def setRemovedParents(value: js.Array[TargetReference]): Self = StObject.set(x, "removedParents", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRemovedParentsUndefined: Self = StObject.set(x, "removedParents", js.undefined)
        
        @scala.inline
        def setRemovedParentsVarargs(value: TargetReference*): Self = StObject.set(x, "removedParents", js.Array(value :_*))
      }
    }
    
    @js.native
    trait Owner extends StObject {
      
      var domain: js.UndefOr[Domain] = js.native
      
      var teamDrive: js.UndefOr[TeamDriveReference] = js.native
      
      var user: js.UndefOr[User] = js.native
    }
    object Owner {
      
      @scala.inline
      def apply(): Owner = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Owner]
      }
      
      @scala.inline
      implicit class OwnerMutableBuilder[Self <: Owner] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDomain(value: Domain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        @scala.inline
        def setTeamDrive(value: TeamDriveReference): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
        
        @scala.inline
        def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      }
    }
    
    @js.native
    trait Permission extends StObject {
      
      var allowDiscovery: js.UndefOr[Boolean] = js.native
      
      var anyone: js.UndefOr[js.Any] = js.native
      
      var domain: js.UndefOr[Domain] = js.native
      
      var group: js.UndefOr[Group] = js.native
      
      var role: js.UndefOr[String] = js.native
      
      var user: js.UndefOr[User] = js.native
    }
    object Permission {
      
      @scala.inline
      def apply(): Permission = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Permission]
      }
      
      @scala.inline
      implicit class PermissionMutableBuilder[Self <: Permission] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowDiscovery(value: Boolean): Self = StObject.set(x, "allowDiscovery", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowDiscoveryUndefined: Self = StObject.set(x, "allowDiscovery", js.undefined)
        
        @scala.inline
        def setAnyone(value: js.Any): Self = StObject.set(x, "anyone", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnyoneUndefined: Self = StObject.set(x, "anyone", js.undefined)
        
        @scala.inline
        def setDomain(value: Domain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        @scala.inline
        def setGroup(value: Group): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
        
        @scala.inline
        def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        @scala.inline
        def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      }
    }
    
    @js.native
    trait PermissionChange extends StObject {
      
      var addedPermissions: js.UndefOr[js.Array[Permission]] = js.native
      
      var removedPermissions: js.UndefOr[js.Array[Permission]] = js.native
    }
    object PermissionChange {
      
      @scala.inline
      def apply(): PermissionChange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PermissionChange]
      }
      
      @scala.inline
      implicit class PermissionChangeMutableBuilder[Self <: PermissionChange] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddedPermissions(value: js.Array[Permission]): Self = StObject.set(x, "addedPermissions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddedPermissionsUndefined: Self = StObject.set(x, "addedPermissions", js.undefined)
        
        @scala.inline
        def setAddedPermissionsVarargs(value: Permission*): Self = StObject.set(x, "addedPermissions", js.Array(value :_*))
        
        @scala.inline
        def setRemovedPermissions(value: js.Array[Permission]): Self = StObject.set(x, "removedPermissions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRemovedPermissionsUndefined: Self = StObject.set(x, "removedPermissions", js.undefined)
        
        @scala.inline
        def setRemovedPermissionsVarargs(value: Permission*): Self = StObject.set(x, "removedPermissions", js.Array(value :_*))
      }
    }
    
    @js.native
    trait Post extends StObject {
      
      var subtype: js.UndefOr[String] = js.native
    }
    object Post {
      
      @scala.inline
      def apply(): Post = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Post]
      }
      
      @scala.inline
      implicit class PostMutableBuilder[Self <: Post] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
      }
    }
    
    @js.native
    trait QueryDriveActivityRequest extends StObject {
      
      var ancestorName: js.UndefOr[String] = js.native
      
      var consolidationStrategy: js.UndefOr[ConsolidationStrategy] = js.native
      
      var filter: js.UndefOr[String] = js.native
      
      var itemName: js.UndefOr[String] = js.native
      
      var pageSize: js.UndefOr[Double] = js.native
      
      var pageToken: js.UndefOr[String] = js.native
    }
    object QueryDriveActivityRequest {
      
      @scala.inline
      def apply(): QueryDriveActivityRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[QueryDriveActivityRequest]
      }
      
      @scala.inline
      implicit class QueryDriveActivityRequestMutableBuilder[Self <: QueryDriveActivityRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAncestorName(value: String): Self = StObject.set(x, "ancestorName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAncestorNameUndefined: Self = StObject.set(x, "ancestorName", js.undefined)
        
        @scala.inline
        def setConsolidationStrategy(value: ConsolidationStrategy): Self = StObject.set(x, "consolidationStrategy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConsolidationStrategyUndefined: Self = StObject.set(x, "consolidationStrategy", js.undefined)
        
        @scala.inline
        def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        
        @scala.inline
        def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemNameUndefined: Self = StObject.set(x, "itemName", js.undefined)
        
        @scala.inline
        def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
        
        @scala.inline
        def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      }
    }
    
    @js.native
    trait QueryDriveActivityResponse extends StObject {
      
      var activities: js.UndefOr[
            js.Array[typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.DriveActivity]
          ] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
    }
    object QueryDriveActivityResponse {
      
      @scala.inline
      def apply(): QueryDriveActivityResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[QueryDriveActivityResponse]
      }
      
      @scala.inline
      implicit class QueryDriveActivityResponseMutableBuilder[Self <: QueryDriveActivityResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActivities(value: js.Array[typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.DriveActivity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
        
        @scala.inline
        def setActivitiesVarargs(value: typings.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.DriveActivity*): Self = StObject.set(x, "activities", js.Array(value :_*))
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    @js.native
    trait Rename extends StObject {
      
      var newTitle: js.UndefOr[String] = js.native
      
      var oldTitle: js.UndefOr[String] = js.native
    }
    object Rename {
      
      @scala.inline
      def apply(): Rename = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Rename]
      }
      
      @scala.inline
      implicit class RenameMutableBuilder[Self <: Rename] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNewTitle(value: String): Self = StObject.set(x, "newTitle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNewTitleUndefined: Self = StObject.set(x, "newTitle", js.undefined)
        
        @scala.inline
        def setOldTitle(value: String): Self = StObject.set(x, "oldTitle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOldTitleUndefined: Self = StObject.set(x, "oldTitle", js.undefined)
      }
    }
    
    @js.native
    trait Restore extends StObject {
      
      var `type`: js.UndefOr[String] = js.native
    }
    object Restore {
      
      @scala.inline
      def apply(): Restore = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Restore]
      }
      
      @scala.inline
      implicit class RestoreMutableBuilder[Self <: Restore] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait RestrictionChange extends StObject {
      
      var feature: js.UndefOr[String] = js.native
      
      var newRestriction: js.UndefOr[String] = js.native
    }
    object RestrictionChange {
      
      @scala.inline
      def apply(): RestrictionChange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RestrictionChange]
      }
      
      @scala.inline
      implicit class RestrictionChangeMutableBuilder[Self <: RestrictionChange] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
        
        @scala.inline
        def setNewRestriction(value: String): Self = StObject.set(x, "newRestriction", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNewRestrictionUndefined: Self = StObject.set(x, "newRestriction", js.undefined)
      }
    }
    
    @js.native
    trait SettingsChange extends StObject {
      
      var restrictionChanges: js.UndefOr[js.Array[RestrictionChange]] = js.native
    }
    object SettingsChange {
      
      @scala.inline
      def apply(): SettingsChange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SettingsChange]
      }
      
      @scala.inline
      implicit class SettingsChangeMutableBuilder[Self <: SettingsChange] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRestrictionChanges(value: js.Array[RestrictionChange]): Self = StObject.set(x, "restrictionChanges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRestrictionChangesUndefined: Self = StObject.set(x, "restrictionChanges", js.undefined)
        
        @scala.inline
        def setRestrictionChangesVarargs(value: RestrictionChange*): Self = StObject.set(x, "restrictionChanges", js.Array(value :_*))
      }
    }
    
    @js.native
    trait Suggestion extends StObject {
      
      var subtype: js.UndefOr[String] = js.native
    }
    object Suggestion {
      
      @scala.inline
      def apply(): Suggestion = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Suggestion]
      }
      
      @scala.inline
      implicit class SuggestionMutableBuilder[Self <: Suggestion] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
      }
    }
    
    @js.native
    trait SystemEvent extends StObject {
      
      var `type`: js.UndefOr[String] = js.native
    }
    object SystemEvent {
      
      @scala.inline
      def apply(): SystemEvent = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SystemEvent]
      }
      
      @scala.inline
      implicit class SystemEventMutableBuilder[Self <: SystemEvent] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait Target extends StObject {
      
      var driveItem: js.UndefOr[DriveItem] = js.native
      
      var fileComment: js.UndefOr[js.Any] = js.native
      
      var teamDrive: js.UndefOr[TeamDrive] = js.native
    }
    object Target {
      
      @scala.inline
      def apply(): Target = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Target]
      }
      
      @scala.inline
      implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDriveItem(value: DriveItem): Self = StObject.set(x, "driveItem", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDriveItemUndefined: Self = StObject.set(x, "driveItem", js.undefined)
        
        @scala.inline
        def setFileComment(value: js.Any): Self = StObject.set(x, "fileComment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFileCommentUndefined: Self = StObject.set(x, "fileComment", js.undefined)
        
        @scala.inline
        def setTeamDrive(value: TeamDrive): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
      }
    }
    
    @js.native
    trait TargetReference extends StObject {
      
      var driveItem: js.UndefOr[DriveItemReference] = js.native
      
      var teamDrive: js.UndefOr[TeamDriveReference] = js.native
    }
    object TargetReference {
      
      @scala.inline
      def apply(): TargetReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TargetReference]
      }
      
      @scala.inline
      implicit class TargetReferenceMutableBuilder[Self <: TargetReference] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDriveItem(value: DriveItemReference): Self = StObject.set(x, "driveItem", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDriveItemUndefined: Self = StObject.set(x, "driveItem", js.undefined)
        
        @scala.inline
        def setTeamDrive(value: TeamDriveReference): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
      }
    }
    
    @js.native
    trait TeamDrive extends StObject {
      
      var name: js.UndefOr[String] = js.native
      
      var root: js.UndefOr[DriveItem] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object TeamDrive {
      
      @scala.inline
      def apply(): TeamDrive = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TeamDrive]
      }
      
      @scala.inline
      implicit class TeamDriveMutableBuilder[Self <: TeamDrive] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setRoot(value: DriveItem): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait TeamDriveReference extends StObject {
      
      var name: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object TeamDriveReference {
      
      @scala.inline
      def apply(): TeamDriveReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TeamDriveReference]
      }
      
      @scala.inline
      implicit class TeamDriveReferenceMutableBuilder[Self <: TeamDriveReference] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait TimeRange extends StObject {
      
      var endTime: js.UndefOr[String] = js.native
      
      var startTime: js.UndefOr[String] = js.native
    }
    object TimeRange {
      
      @scala.inline
      def apply(): TimeRange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TimeRange]
      }
      
      @scala.inline
      implicit class TimeRangeMutableBuilder[Self <: TimeRange] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
        
        @scala.inline
        def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      }
    }
    
    @js.native
    trait User extends StObject {
      
      var deletedUser: js.UndefOr[js.Any] = js.native
      
      var knownUser: js.UndefOr[KnownUser] = js.native
      
      var unknownUser: js.UndefOr[js.Any] = js.native
    }
    object User {
      
      @scala.inline
      def apply(): User = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[User]
      }
      
      @scala.inline
      implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDeletedUser(value: js.Any): Self = StObject.set(x, "deletedUser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeletedUserUndefined: Self = StObject.set(x, "deletedUser", js.undefined)
        
        @scala.inline
        def setKnownUser(value: KnownUser): Self = StObject.set(x, "knownUser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKnownUserUndefined: Self = StObject.set(x, "knownUser", js.undefined)
        
        @scala.inline
        def setUnknownUser(value: js.Any): Self = StObject.set(x, "unknownUser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnknownUserUndefined: Self = StObject.set(x, "unknownUser", js.undefined)
      }
    }
  }
}
