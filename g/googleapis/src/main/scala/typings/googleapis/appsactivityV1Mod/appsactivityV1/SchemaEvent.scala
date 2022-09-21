package typings.googleapis.appsactivityV1Mod.appsactivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEvent extends StObject {
  
  /**
    * Additional event types. Some events may have multiple types when multiple actions are part of a single event. For example, creating a document, renaming it, and sharing it may be part of a single file-creation event.
    */
  var additionalEventTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The time at which the event occurred formatted as Unix time in milliseconds.
    */
  var eventTimeMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this event is caused by a user being deleted.
    */
  var fromUserDeletion: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Extra information for move type events, such as changes in an object&#39;s parents.
    */
  var move: js.UndefOr[SchemaMove] = js.undefined
  
  /**
    * Extra information for permissionChange type events, such as the user or group the new permission applies to.
    */
  var permissionChanges: js.UndefOr[js.Array[SchemaPermissionChange]] = js.undefined
  
  /**
    * The main type of event that occurred.
    */
  var primaryEventType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Extra information for rename type events, such as the old and new names.
    */
  var rename: js.UndefOr[SchemaRename] = js.undefined
  
  /**
    * Information specific to the Target object modified by the event.
    */
  var target: js.UndefOr[SchemaTarget] = js.undefined
  
  /**
    * Represents the user responsible for the event.
    */
  var user: js.UndefOr[SchemaUser] = js.undefined
}
object SchemaEvent {
  
  inline def apply(): SchemaEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEvent]
  }
  
  extension [Self <: SchemaEvent](x: Self) {
    
    inline def setAdditionalEventTypes(value: js.Array[String]): Self = StObject.set(x, "additionalEventTypes", value.asInstanceOf[js.Any])
    
    inline def setAdditionalEventTypesNull: Self = StObject.set(x, "additionalEventTypes", null)
    
    inline def setAdditionalEventTypesUndefined: Self = StObject.set(x, "additionalEventTypes", js.undefined)
    
    inline def setAdditionalEventTypesVarargs(value: String*): Self = StObject.set(x, "additionalEventTypes", js.Array(value*))
    
    inline def setEventTimeMillis(value: String): Self = StObject.set(x, "eventTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setEventTimeMillisNull: Self = StObject.set(x, "eventTimeMillis", null)
    
    inline def setEventTimeMillisUndefined: Self = StObject.set(x, "eventTimeMillis", js.undefined)
    
    inline def setFromUserDeletion(value: Boolean): Self = StObject.set(x, "fromUserDeletion", value.asInstanceOf[js.Any])
    
    inline def setFromUserDeletionNull: Self = StObject.set(x, "fromUserDeletion", null)
    
    inline def setFromUserDeletionUndefined: Self = StObject.set(x, "fromUserDeletion", js.undefined)
    
    inline def setMove(value: SchemaMove): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    inline def setPermissionChanges(value: js.Array[SchemaPermissionChange]): Self = StObject.set(x, "permissionChanges", value.asInstanceOf[js.Any])
    
    inline def setPermissionChangesUndefined: Self = StObject.set(x, "permissionChanges", js.undefined)
    
    inline def setPermissionChangesVarargs(value: SchemaPermissionChange*): Self = StObject.set(x, "permissionChanges", js.Array(value*))
    
    inline def setPrimaryEventType(value: String): Self = StObject.set(x, "primaryEventType", value.asInstanceOf[js.Any])
    
    inline def setPrimaryEventTypeNull: Self = StObject.set(x, "primaryEventType", null)
    
    inline def setPrimaryEventTypeUndefined: Self = StObject.set(x, "primaryEventType", js.undefined)
    
    inline def setRename(value: SchemaRename): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
    
    inline def setTarget(value: SchemaTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setUser(value: SchemaUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
