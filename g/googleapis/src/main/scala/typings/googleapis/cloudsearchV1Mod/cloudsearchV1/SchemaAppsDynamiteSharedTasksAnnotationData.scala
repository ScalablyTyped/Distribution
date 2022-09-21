package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedTasksAnnotationData extends StObject {
  
  var assigneeChange: js.UndefOr[SchemaAppsDynamiteSharedTasksAnnotationDataAssigneeChange] = js.undefined
  
  var completionChange: js.UndefOr[SchemaAppsDynamiteSharedTasksAnnotationDataCompletionChange] = js.undefined
  
  var creation: js.UndefOr[SchemaAppsDynamiteSharedTasksAnnotationDataCreation] = js.undefined
  
  var deletionChange: js.UndefOr[SchemaAppsDynamiteSharedTasksAnnotationDataDeletionChange] = js.undefined
  
  /**
    * ID of task. Will be used to create deep links to Tasks.
    */
  var taskId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Task properties after the update has been applied.
    */
  var taskProperties: js.UndefOr[SchemaAppsDynamiteSharedTasksAnnotationDataTaskProperties] = js.undefined
  
  var userDefinedMessage: js.UndefOr[SchemaAppsDynamiteSharedTasksAnnotationDataUserDefinedMessage] = js.undefined
}
object SchemaAppsDynamiteSharedTasksAnnotationData {
  
  inline def apply(): SchemaAppsDynamiteSharedTasksAnnotationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedTasksAnnotationData]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedTasksAnnotationData](x: Self) {
    
    inline def setAssigneeChange(value: SchemaAppsDynamiteSharedTasksAnnotationDataAssigneeChange): Self = StObject.set(x, "assigneeChange", value.asInstanceOf[js.Any])
    
    inline def setAssigneeChangeUndefined: Self = StObject.set(x, "assigneeChange", js.undefined)
    
    inline def setCompletionChange(value: SchemaAppsDynamiteSharedTasksAnnotationDataCompletionChange): Self = StObject.set(x, "completionChange", value.asInstanceOf[js.Any])
    
    inline def setCompletionChangeUndefined: Self = StObject.set(x, "completionChange", js.undefined)
    
    inline def setCreation(value: SchemaAppsDynamiteSharedTasksAnnotationDataCreation): Self = StObject.set(x, "creation", value.asInstanceOf[js.Any])
    
    inline def setCreationUndefined: Self = StObject.set(x, "creation", js.undefined)
    
    inline def setDeletionChange(value: SchemaAppsDynamiteSharedTasksAnnotationDataDeletionChange): Self = StObject.set(x, "deletionChange", value.asInstanceOf[js.Any])
    
    inline def setDeletionChangeUndefined: Self = StObject.set(x, "deletionChange", js.undefined)
    
    inline def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdNull: Self = StObject.set(x, "taskId", null)
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
    
    inline def setTaskProperties(value: SchemaAppsDynamiteSharedTasksAnnotationDataTaskProperties): Self = StObject.set(x, "taskProperties", value.asInstanceOf[js.Any])
    
    inline def setTaskPropertiesUndefined: Self = StObject.set(x, "taskProperties", js.undefined)
    
    inline def setUserDefinedMessage(value: SchemaAppsDynamiteSharedTasksAnnotationDataUserDefinedMessage): Self = StObject.set(x, "userDefinedMessage", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedMessageUndefined: Self = StObject.set(x, "userDefinedMessage", js.undefined)
  }
}
