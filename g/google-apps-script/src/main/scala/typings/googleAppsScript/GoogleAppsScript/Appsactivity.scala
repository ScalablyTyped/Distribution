package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Appsactivity.Collection.ActivitiesCollection
import typings.googleAppsScript.GoogleAppsScript.Appsactivity.Schema.ListActivitiesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Appsactivity extends StObject {
  
  var Activities: js.UndefOr[ActivitiesCollection] = js.native
}
object Appsactivity {
  
  @scala.inline
  def apply(): Appsactivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Appsactivity]
  }
  
  @scala.inline
  implicit class AppsactivityMutableBuilder[Self <: Appsactivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivities(value: ActivitiesCollection): Self = StObject.set(x, "Activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesUndefined: Self = StObject.set(x, "Activities", js.undefined)
  }
  
  object Collection {
    
    @js.native
    trait ActivitiesCollection extends StObject {
      
      // Returns a list of activities visible to the current logged in user. Visible activities are determined by the visiblity settings of the object that was acted on, e.g. Drive files a user can see. An activity is a record of past events. Multiple events may be merged if they are similar. A request is scoped to activities from a given Google service using the source parameter.
      def list(): ListActivitiesResponse = js.native
      // Returns a list of activities visible to the current logged in user. Visible activities are determined by the visiblity settings of the object that was acted on, e.g. Drive files a user can see. An activity is a record of past events. Multiple events may be merged if they are similar. A request is scoped to activities from a given Google service using the source parameter.
      def list(optionalArgs: js.Object): ListActivitiesResponse = js.native
    }
  }
  
  object Schema {
    
    @js.native
    trait Activity extends StObject {
      
      var combinedEvent: js.UndefOr[Event] = js.native
      
      var singleEvents: js.UndefOr[js.Array[Event]] = js.native
    }
    object Activity {
      
      @scala.inline
      def apply(): Activity = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Activity]
      }
      
      @scala.inline
      implicit class ActivityMutableBuilder[Self <: Activity] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCombinedEvent(value: Event): Self = StObject.set(x, "combinedEvent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCombinedEventUndefined: Self = StObject.set(x, "combinedEvent", js.undefined)
        
        @scala.inline
        def setSingleEvents(value: js.Array[Event]): Self = StObject.set(x, "singleEvents", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSingleEventsUndefined: Self = StObject.set(x, "singleEvents", js.undefined)
        
        @scala.inline
        def setSingleEventsVarargs(value: Event*): Self = StObject.set(x, "singleEvents", js.Array(value :_*))
      }
    }
    
    @js.native
    trait Event extends StObject {
      
      var additionalEventTypes: js.UndefOr[js.Array[String]] = js.native
      
      var eventTimeMillis: js.UndefOr[String] = js.native
      
      var fromUserDeletion: js.UndefOr[Boolean] = js.native
      
      var move: js.UndefOr[Move] = js.native
      
      var permissionChanges: js.UndefOr[js.Array[PermissionChange]] = js.native
      
      var primaryEventType: js.UndefOr[String] = js.native
      
      var rename: js.UndefOr[Rename] = js.native
      
      var target: js.UndefOr[Target] = js.native
      
      var user: js.UndefOr[User] = js.native
    }
    object Event {
      
      @scala.inline
      def apply(): Event = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Event]
      }
      
      @scala.inline
      implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdditionalEventTypes(value: js.Array[String]): Self = StObject.set(x, "additionalEventTypes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAdditionalEventTypesUndefined: Self = StObject.set(x, "additionalEventTypes", js.undefined)
        
        @scala.inline
        def setAdditionalEventTypesVarargs(value: String*): Self = StObject.set(x, "additionalEventTypes", js.Array(value :_*))
        
        @scala.inline
        def setEventTimeMillis(value: String): Self = StObject.set(x, "eventTimeMillis", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventTimeMillisUndefined: Self = StObject.set(x, "eventTimeMillis", js.undefined)
        
        @scala.inline
        def setFromUserDeletion(value: Boolean): Self = StObject.set(x, "fromUserDeletion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFromUserDeletionUndefined: Self = StObject.set(x, "fromUserDeletion", js.undefined)
        
        @scala.inline
        def setMove(value: Move): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
        
        @scala.inline
        def setPermissionChanges(value: js.Array[PermissionChange]): Self = StObject.set(x, "permissionChanges", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPermissionChangesUndefined: Self = StObject.set(x, "permissionChanges", js.undefined)
        
        @scala.inline
        def setPermissionChangesVarargs(value: PermissionChange*): Self = StObject.set(x, "permissionChanges", js.Array(value :_*))
        
        @scala.inline
        def setPrimaryEventType(value: String): Self = StObject.set(x, "primaryEventType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrimaryEventTypeUndefined: Self = StObject.set(x, "primaryEventType", js.undefined)
        
        @scala.inline
        def setRename(value: Rename): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
        
        @scala.inline
        def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
        
        @scala.inline
        def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      }
    }
    
    @js.native
    trait ListActivitiesResponse extends StObject {
      
      var activities: js.UndefOr[js.Array[Activity]] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
    }
    object ListActivitiesResponse {
      
      @scala.inline
      def apply(): ListActivitiesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListActivitiesResponse]
      }
      
      @scala.inline
      implicit class ListActivitiesResponseMutableBuilder[Self <: ListActivitiesResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActivities(value: js.Array[Activity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
        
        @scala.inline
        def setActivitiesVarargs(value: Activity*): Self = StObject.set(x, "activities", js.Array(value :_*))
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    @js.native
    trait Move extends StObject {
      
      var addedParents: js.UndefOr[js.Array[Parent]] = js.native
      
      var removedParents: js.UndefOr[js.Array[Parent]] = js.native
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
        def setAddedParents(value: js.Array[Parent]): Self = StObject.set(x, "addedParents", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddedParentsUndefined: Self = StObject.set(x, "addedParents", js.undefined)
        
        @scala.inline
        def setAddedParentsVarargs(value: Parent*): Self = StObject.set(x, "addedParents", js.Array(value :_*))
        
        @scala.inline
        def setRemovedParents(value: js.Array[Parent]): Self = StObject.set(x, "removedParents", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRemovedParentsUndefined: Self = StObject.set(x, "removedParents", js.undefined)
        
        @scala.inline
        def setRemovedParentsVarargs(value: Parent*): Self = StObject.set(x, "removedParents", js.Array(value :_*))
      }
    }
    
    @js.native
    trait Parent extends StObject {
      
      var id: js.UndefOr[String] = js.native
      
      var isRoot: js.UndefOr[Boolean] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object Parent {
      
      @scala.inline
      def apply(): Parent = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Parent]
      }
      
      @scala.inline
      implicit class ParentMutableBuilder[Self <: Parent] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setIsRoot(value: Boolean): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsRootUndefined: Self = StObject.set(x, "isRoot", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait Permission extends StObject {
      
      var name: js.UndefOr[String] = js.native
      
      var permissionId: js.UndefOr[String] = js.native
      
      var role: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
      
      var user: js.UndefOr[User] = js.native
      
      var withLink: js.UndefOr[Boolean] = js.native
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
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
        
        @scala.inline
        def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
        
        @scala.inline
        def setWithLink(value: Boolean): Self = StObject.set(x, "withLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWithLinkUndefined: Self = StObject.set(x, "withLink", js.undefined)
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
    trait Photo extends StObject {
      
      var url: js.UndefOr[String] = js.native
    }
    object Photo {
      
      @scala.inline
      def apply(): Photo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Photo]
      }
      
      @scala.inline
      implicit class PhotoMutableBuilder[Self <: Photo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
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
    trait Target extends StObject {
      
      var id: js.UndefOr[String] = js.native
      
      var mimeType: js.UndefOr[String] = js.native
      
      var name: js.UndefOr[String] = js.native
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
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    @js.native
    trait User extends StObject {
      
      var isDeleted: js.UndefOr[Boolean] = js.native
      
      var isMe: js.UndefOr[Boolean] = js.native
      
      var name: js.UndefOr[String] = js.native
      
      var permissionId: js.UndefOr[String] = js.native
      
      var photo: js.UndefOr[Photo] = js.native
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
        def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDeletedUndefined: Self = StObject.set(x, "isDeleted", js.undefined)
        
        @scala.inline
        def setIsMe(value: Boolean): Self = StObject.set(x, "isMe", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsMeUndefined: Self = StObject.set(x, "isMe", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        @scala.inline
        def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
        
        @scala.inline
        def setPhoto(value: Photo): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
      }
    }
  }
}
