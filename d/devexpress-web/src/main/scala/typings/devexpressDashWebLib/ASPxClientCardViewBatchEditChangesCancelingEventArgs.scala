package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditChangesCanceling event.
  */
trait ASPxClientCardViewBatchEditChangesCancelingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets a hashtable that maintains information about deleted cells.
    * Value: A hashtable that stores information about deleted cells.
    */
  var deletedValues: js.Object
  /**
    * Gets a hashtable that maintains information about inserted cells.
    * Value: A hashtable that stores information about inserted cells.
    */
  var insertedValues: js.Object
  /**
    * Gets a hashtable that maintains information about updated cells.
    * Value: A hashtable that stores information about updated cells.
    */
  var updatedValues: js.Object
}

object ASPxClientCardViewBatchEditChangesCancelingEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    deletedValues: js.Object,
    insertedValues: js.Object,
    updatedValues: js.Object
  ): ASPxClientCardViewBatchEditChangesCancelingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, deletedValues = deletedValues, insertedValues = insertedValues, updatedValues = updatedValues)
  
    __obj.asInstanceOf[ASPxClientCardViewBatchEditChangesCancelingEventArgs]
  }
}

