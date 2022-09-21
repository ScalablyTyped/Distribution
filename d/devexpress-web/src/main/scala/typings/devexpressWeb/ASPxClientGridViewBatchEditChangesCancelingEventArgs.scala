package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.BatchEditChangesCanceling event.
  */
trait ASPxClientGridViewBatchEditChangesCancelingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets a hashtable that maintains information about deleted cells.
    */
  var deletedValues: Any
  
  /**
    * Gets a hashtable that maintains information about inserted cells.
    */
  var insertedValues: Any
  
  /**
    * Gets a hashtable that maintains information about updated cells.
    */
  var updatedValues: Any
}
object ASPxClientGridViewBatchEditChangesCancelingEventArgs {
  
  inline def apply(cancel: Boolean, deletedValues: Any, insertedValues: Any, updatedValues: Any): ASPxClientGridViewBatchEditChangesCancelingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], deletedValues = deletedValues.asInstanceOf[js.Any], insertedValues = insertedValues.asInstanceOf[js.Any], updatedValues = updatedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditChangesCancelingEventArgs]
  }
  
  extension [Self <: ASPxClientGridViewBatchEditChangesCancelingEventArgs](x: Self) {
    
    inline def setDeletedValues(value: Any): Self = StObject.set(x, "deletedValues", value.asInstanceOf[js.Any])
    
    inline def setInsertedValues(value: Any): Self = StObject.set(x, "insertedValues", value.asInstanceOf[js.Any])
    
    inline def setUpdatedValues(value: Any): Self = StObject.set(x, "updatedValues", value.asInstanceOf[js.Any])
  }
}
