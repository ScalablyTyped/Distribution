package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridViewBatchEditChangesCancelingEventArgs extends CancelEventArgs {
  
  val deletedValues: js.Any = js.native
  
  val insertedValues: js.Any = js.native
  
  val updatedValues: js.Any = js.native
}
object GridViewBatchEditChangesCancelingEventArgs {
  
  @scala.inline
  def apply(
    cancel: Boolean,
    deletedValues: js.Any,
    insertedValues: js.Any,
    sender: Control,
    updatedValues: js.Any
  ): GridViewBatchEditChangesCancelingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], deletedValues = deletedValues.asInstanceOf[js.Any], insertedValues = insertedValues.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], updatedValues = updatedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridViewBatchEditChangesCancelingEventArgs]
  }
  
  @scala.inline
  implicit class GridViewBatchEditChangesCancelingEventArgsMutableBuilder[Self <: GridViewBatchEditChangesCancelingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletedValues(value: js.Any): Self = StObject.set(x, "deletedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedValues(value: js.Any): Self = StObject.set(x, "insertedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedValues(value: js.Any): Self = StObject.set(x, "updatedValues", value.asInstanceOf[js.Any])
  }
}
