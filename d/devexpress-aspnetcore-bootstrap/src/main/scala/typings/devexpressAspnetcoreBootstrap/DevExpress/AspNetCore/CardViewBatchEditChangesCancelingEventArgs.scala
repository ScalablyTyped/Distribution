package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardViewBatchEditChangesCancelingEventArgs
  extends StObject
     with CancelEventArgs {
  
  val deletedValues: js.Any
  
  val insertedValues: js.Any
  
  val updatedValues: js.Any
}
object CardViewBatchEditChangesCancelingEventArgs {
  
  inline def apply(
    cancel: Boolean,
    deletedValues: js.Any,
    insertedValues: js.Any,
    sender: Control,
    updatedValues: js.Any
  ): CardViewBatchEditChangesCancelingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], deletedValues = deletedValues.asInstanceOf[js.Any], insertedValues = insertedValues.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], updatedValues = updatedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewBatchEditChangesCancelingEventArgs]
  }
  
  extension [Self <: CardViewBatchEditChangesCancelingEventArgs](x: Self) {
    
    inline def setDeletedValues(value: js.Any): Self = StObject.set(x, "deletedValues", value.asInstanceOf[js.Any])
    
    inline def setInsertedValues(value: js.Any): Self = StObject.set(x, "insertedValues", value.asInstanceOf[js.Any])
    
    inline def setUpdatedValues(value: js.Any): Self = StObject.set(x, "updatedValues", value.asInstanceOf[js.Any])
  }
}
