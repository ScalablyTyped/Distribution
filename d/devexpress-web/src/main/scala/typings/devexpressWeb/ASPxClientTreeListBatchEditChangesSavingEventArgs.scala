package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientTreeList.BatchEditChangesSaving event.
  */
trait ASPxClientTreeListBatchEditChangesSavingEventArgs extends ASPxClientCancelEventArgs {
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

object ASPxClientTreeListBatchEditChangesSavingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, deletedValues: js.Any, insertedValues: js.Any, updatedValues: js.Any): ASPxClientTreeListBatchEditChangesSavingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], deletedValues = deletedValues.asInstanceOf[js.Any], insertedValues = insertedValues.asInstanceOf[js.Any], updatedValues = updatedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientTreeListBatchEditChangesSavingEventArgs]
  }
}

