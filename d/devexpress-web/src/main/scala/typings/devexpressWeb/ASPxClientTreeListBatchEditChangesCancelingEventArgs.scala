package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditChangesCanceling event.
  */
trait ASPxClientTreeListBatchEditChangesCancelingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets a hashtable that maintains information about deleted cells.
    */
  var deletedValues: js.Any
  
  /**
    * Gets a hashtable that maintains information about inserted cells.
    */
  var insertedValues: js.Any
  
  /**
    * Gets a hashtable that maintains information about updated cells.
    */
  var updatedValues: js.Any
}
object ASPxClientTreeListBatchEditChangesCancelingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, deletedValues: js.Any, insertedValues: js.Any, updatedValues: js.Any): ASPxClientTreeListBatchEditChangesCancelingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], deletedValues = deletedValues.asInstanceOf[js.Any], insertedValues = insertedValues.asInstanceOf[js.Any], updatedValues = updatedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditChangesCancelingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientTreeListBatchEditChangesCancelingEventArgsMutableBuilder[Self <: ASPxClientTreeListBatchEditChangesCancelingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletedValues(value: js.Any): Self = StObject.set(x, "deletedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedValues(value: js.Any): Self = StObject.set(x, "insertedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedValues(value: js.Any): Self = StObject.set(x, "updatedValues", value.asInstanceOf[js.Any])
  }
}
