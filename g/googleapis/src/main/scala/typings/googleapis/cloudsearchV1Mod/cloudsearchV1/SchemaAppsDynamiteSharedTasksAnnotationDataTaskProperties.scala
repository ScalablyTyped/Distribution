package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedTasksAnnotationDataTaskProperties extends StObject {
  
  /**
    * Obfuscated user ID of new assignee. Not set if the task doesn't have an assignee.
    */
  var assignee: js.UndefOr[SchemaUserId] = js.undefined
  
  /**
    * Whether the task is marked as completed.
    */
  var completed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the task is marked as deleted.
    */
  var deleted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The description of the task. If Task original description's length is greater than 1024, then Task BE sends the truncated description to Dynamite Integration Server.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set if the task has a date but no time. Source of truth in Tasks BE: http://shortn/_wyT7eB4Ixv
    */
  var startDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * Set if the task has both a date and a time. Source of truth in Tasks BE: http://shortn/_u6cr0F5ttE
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The title of the task.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedTasksAnnotationDataTaskProperties {
  
  inline def apply(): SchemaAppsDynamiteSharedTasksAnnotationDataTaskProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedTasksAnnotationDataTaskProperties]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedTasksAnnotationDataTaskProperties](x: Self) {
    
    inline def setAssignee(value: SchemaUserId): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    inline def setAssigneeUndefined: Self = StObject.set(x, "assignee", js.undefined)
    
    inline def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setCompletedNull: Self = StObject.set(x, "completed", null)
    
    inline def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedNull: Self = StObject.set(x, "deleted", null)
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setStartDate(value: SchemaDate): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
