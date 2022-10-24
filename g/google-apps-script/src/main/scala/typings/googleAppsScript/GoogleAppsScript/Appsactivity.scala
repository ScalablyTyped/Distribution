package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Appsactivity.Collection.ActivitiesCollection
import typings.googleAppsScript.GoogleAppsScript.Appsactivity.Schema.ListActivitiesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appsactivity extends StObject {
  
  var Activities: js.UndefOr[ActivitiesCollection] = js.undefined
}
object Appsactivity {
  
  inline def apply(): Appsactivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Appsactivity]
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
  
  extension [Self <: Appsactivity](x: Self) {
    
    inline def setActivities(value: ActivitiesCollection): Self = StObject.set(x, "Activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "Activities", js.undefined)
  }
  
  object Schema {
    
    trait Activity extends StObject {
      
      var combinedEvent: js.UndefOr[Event] = js.undefined
      
      var singleEvents: js.UndefOr[js.Array[Event]] = js.undefined
    }
    object Activity {
      
      inline def apply(): Activity = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Activity]
      }
      
      extension [Self <: Activity](x: Self) {
        
        inline def setCombinedEvent(value: Event): Self = StObject.set(x, "combinedEvent", value.asInstanceOf[js.Any])
        
        inline def setCombinedEventUndefined: Self = StObject.set(x, "combinedEvent", js.undefined)
        
        inline def setSingleEvents(value: js.Array[Event]): Self = StObject.set(x, "singleEvents", value.asInstanceOf[js.Any])
        
        inline def setSingleEventsUndefined: Self = StObject.set(x, "singleEvents", js.undefined)
        
        inline def setSingleEventsVarargs(value: Event*): Self = StObject.set(x, "singleEvents", js.Array(value*))
      }
    }
    
    trait Event extends StObject {
      
      var additionalEventTypes: js.UndefOr[js.Array[String]] = js.undefined
      
      var eventTimeMillis: js.UndefOr[String] = js.undefined
      
      var fromUserDeletion: js.UndefOr[Boolean] = js.undefined
      
      var move: js.UndefOr[Move] = js.undefined
      
      var permissionChanges: js.UndefOr[js.Array[PermissionChange]] = js.undefined
      
      var primaryEventType: js.UndefOr[String] = js.undefined
      
      var rename: js.UndefOr[Rename] = js.undefined
      
      var target: js.UndefOr[Target] = js.undefined
      
      var user: js.UndefOr[User] = js.undefined
    }
    object Event {
      
      inline def apply(): Event = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Event]
      }
      
      extension [Self <: Event](x: Self) {
        
        inline def setAdditionalEventTypes(value: js.Array[String]): Self = StObject.set(x, "additionalEventTypes", value.asInstanceOf[js.Any])
        
        inline def setAdditionalEventTypesUndefined: Self = StObject.set(x, "additionalEventTypes", js.undefined)
        
        inline def setAdditionalEventTypesVarargs(value: String*): Self = StObject.set(x, "additionalEventTypes", js.Array(value*))
        
        inline def setEventTimeMillis(value: String): Self = StObject.set(x, "eventTimeMillis", value.asInstanceOf[js.Any])
        
        inline def setEventTimeMillisUndefined: Self = StObject.set(x, "eventTimeMillis", js.undefined)
        
        inline def setFromUserDeletion(value: Boolean): Self = StObject.set(x, "fromUserDeletion", value.asInstanceOf[js.Any])
        
        inline def setFromUserDeletionUndefined: Self = StObject.set(x, "fromUserDeletion", js.undefined)
        
        inline def setMove(value: Move): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
        
        inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
        
        inline def setPermissionChanges(value: js.Array[PermissionChange]): Self = StObject.set(x, "permissionChanges", value.asInstanceOf[js.Any])
        
        inline def setPermissionChangesUndefined: Self = StObject.set(x, "permissionChanges", js.undefined)
        
        inline def setPermissionChangesVarargs(value: PermissionChange*): Self = StObject.set(x, "permissionChanges", js.Array(value*))
        
        inline def setPrimaryEventType(value: String): Self = StObject.set(x, "primaryEventType", value.asInstanceOf[js.Any])
        
        inline def setPrimaryEventTypeUndefined: Self = StObject.set(x, "primaryEventType", js.undefined)
        
        inline def setRename(value: Rename): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
        
        inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
        
        inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
        
        inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      }
    }
    
    trait ListActivitiesResponse extends StObject {
      
      var activities: js.UndefOr[js.Array[Activity]] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object ListActivitiesResponse {
      
      inline def apply(): ListActivitiesResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListActivitiesResponse]
      }
      
      extension [Self <: ListActivitiesResponse](x: Self) {
        
        inline def setActivities(value: js.Array[Activity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
        
        inline def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
        
        inline def setActivitiesVarargs(value: Activity*): Self = StObject.set(x, "activities", js.Array(value*))
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait Move extends StObject {
      
      var addedParents: js.UndefOr[js.Array[Parent]] = js.undefined
      
      var removedParents: js.UndefOr[js.Array[Parent]] = js.undefined
    }
    object Move {
      
      inline def apply(): Move = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Move]
      }
      
      extension [Self <: Move](x: Self) {
        
        inline def setAddedParents(value: js.Array[Parent]): Self = StObject.set(x, "addedParents", value.asInstanceOf[js.Any])
        
        inline def setAddedParentsUndefined: Self = StObject.set(x, "addedParents", js.undefined)
        
        inline def setAddedParentsVarargs(value: Parent*): Self = StObject.set(x, "addedParents", js.Array(value*))
        
        inline def setRemovedParents(value: js.Array[Parent]): Self = StObject.set(x, "removedParents", value.asInstanceOf[js.Any])
        
        inline def setRemovedParentsUndefined: Self = StObject.set(x, "removedParents", js.undefined)
        
        inline def setRemovedParentsVarargs(value: Parent*): Self = StObject.set(x, "removedParents", js.Array(value*))
      }
    }
    
    trait Parent extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var isRoot: js.UndefOr[Boolean] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object Parent {
      
      inline def apply(): Parent = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Parent]
      }
      
      extension [Self <: Parent](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setIsRoot(value: Boolean): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
        
        inline def setIsRootUndefined: Self = StObject.set(x, "isRoot", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait Permission extends StObject {
      
      var name: js.UndefOr[String] = js.undefined
      
      var permissionId: js.UndefOr[String] = js.undefined
      
      var role: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var user: js.UndefOr[User] = js.undefined
      
      var withLink: js.UndefOr[Boolean] = js.undefined
    }
    object Permission {
      
      inline def apply(): Permission = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Permission]
      }
      
      extension [Self <: Permission](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
        
        inline def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
        
        inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
        
        inline def setWithLink(value: Boolean): Self = StObject.set(x, "withLink", value.asInstanceOf[js.Any])
        
        inline def setWithLinkUndefined: Self = StObject.set(x, "withLink", js.undefined)
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
    
    trait Photo extends StObject {
      
      var url: js.UndefOr[String] = js.undefined
    }
    object Photo {
      
      inline def apply(): Photo = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Photo]
      }
      
      extension [Self <: Photo](x: Self) {
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
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
    
    trait Target extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var mimeType: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
    }
    object Target {
      
      inline def apply(): Target = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Target]
      }
      
      extension [Self <: Target](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
        
        inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait User extends StObject {
      
      var isDeleted: js.UndefOr[Boolean] = js.undefined
      
      var isMe: js.UndefOr[Boolean] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var permissionId: js.UndefOr[String] = js.undefined
      
      var photo: js.UndefOr[Photo] = js.undefined
    }
    object User {
      
      inline def apply(): User = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[User]
      }
      
      extension [Self <: User](x: Self) {
        
        inline def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
        
        inline def setIsDeletedUndefined: Self = StObject.set(x, "isDeleted", js.undefined)
        
        inline def setIsMe(value: Boolean): Self = StObject.set(x, "isMe", value.asInstanceOf[js.Any])
        
        inline def setIsMeUndefined: Self = StObject.set(x, "isMe", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
        
        inline def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
        
        inline def setPhoto(value: Photo): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
        
        inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
      }
    }
  }
}
