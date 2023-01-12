package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridViewBatchEditChangesSavingEventArgs
  extends StObject
     with CancelEventArgs {
  
  val deletedValues: Any
  
  val insertedValues: Any
  
  val updatedValues: Any
}
object GridViewBatchEditChangesSavingEventArgs {
  
  inline def apply(cancel: Boolean, deletedValues: Any, insertedValues: Any, sender: Control, updatedValues: Any): GridViewBatchEditChangesSavingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], deletedValues = deletedValues.asInstanceOf[js.Any], insertedValues = insertedValues.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], updatedValues = updatedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewBatchEditChangesSavingEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridViewBatchEditChangesSavingEventArgs] (val x: Self) extends AnyVal {
    
    inline def setDeletedValues(value: Any): Self = StObject.set(x, "deletedValues", value.asInstanceOf[js.Any])
    
    inline def setInsertedValues(value: Any): Self = StObject.set(x, "insertedValues", value.asInstanceOf[js.Any])
    
    inline def setUpdatedValues(value: Any): Self = StObject.set(x, "updatedValues", value.asInstanceOf[js.Any])
  }
}
