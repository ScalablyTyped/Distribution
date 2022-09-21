package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedTasksAnnotationDataAssigneeChange extends StObject {
  
  /**
    * Obfuscated user ID of previous assignee. Not set if the task was originally not assigned.
    */
  var oldAssignee: js.UndefOr[SchemaUserId] = js.undefined
}
object SchemaAppsDynamiteSharedTasksAnnotationDataAssigneeChange {
  
  inline def apply(): SchemaAppsDynamiteSharedTasksAnnotationDataAssigneeChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedTasksAnnotationDataAssigneeChange]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedTasksAnnotationDataAssigneeChange](x: Self) {
    
    inline def setOldAssignee(value: SchemaUserId): Self = StObject.set(x, "oldAssignee", value.asInstanceOf[js.Any])
    
    inline def setOldAssigneeUndefined: Self = StObject.set(x, "oldAssignee", js.undefined)
  }
}
