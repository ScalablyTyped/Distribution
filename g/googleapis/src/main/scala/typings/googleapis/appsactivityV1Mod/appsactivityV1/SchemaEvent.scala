package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the changes associated with an action taken by a user.
  */
@js.native
trait SchemaEvent extends StObject {
  
  /**
    * Additional event types. Some events may have multiple types when multiple
    * actions are part of a single event. For example, creating a document,
    * renaming it, and sharing it may be part of a single file-creation event.
    */
  var additionalEventTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The time at which the event occurred formatted as Unix time in
    * milliseconds.
    */
  var eventTimeMillis: js.UndefOr[String] = js.native
  
  /**
    * Whether this event is caused by a user being deleted.
    */
  var fromUserDeletion: js.UndefOr[Boolean] = js.native
  
  /**
    * Extra information for move type events, such as changes in an
    * object&#39;s parents.
    */
  var move: js.UndefOr[SchemaMove] = js.native
  
  /**
    * Extra information for permissionChange type events, such as the user or
    * group the new permission applies to.
    */
  var permissionChanges: js.UndefOr[js.Array[SchemaPermissionChange]] = js.native
  
  /**
    * The main type of event that occurred.
    */
  var primaryEventType: js.UndefOr[String] = js.native
  
  /**
    * Extra information for rename type events, such as the old and new names.
    */
  var rename: js.UndefOr[SchemaRename] = js.native
  
  /**
    * Information specific to the Target object modified by the event.
    */
  var target: js.UndefOr[SchemaTarget] = js.native
  
  /**
    * Represents the user responsible for the event.
    */
  var user: js.UndefOr[SchemaUser] = js.native
}
object SchemaEvent {
  
  @scala.inline
  def apply(): SchemaEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEvent]
  }
  
  @scala.inline
  implicit class SchemaEventMutableBuilder[Self <: SchemaEvent] (val x: Self) extends AnyVal {
    
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
    def setMove(value: SchemaMove): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    @scala.inline
    def setPermissionChanges(value: js.Array[SchemaPermissionChange]): Self = StObject.set(x, "permissionChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionChangesUndefined: Self = StObject.set(x, "permissionChanges", js.undefined)
    
    @scala.inline
    def setPermissionChangesVarargs(value: SchemaPermissionChange*): Self = StObject.set(x, "permissionChanges", js.Array(value :_*))
    
    @scala.inline
    def setPrimaryEventType(value: String): Self = StObject.set(x, "primaryEventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryEventTypeUndefined: Self = StObject.set(x, "primaryEventType", js.undefined)
    
    @scala.inline
    def setRename(value: SchemaRename): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
    
    @scala.inline
    def setTarget(value: SchemaTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setUser(value: SchemaUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
