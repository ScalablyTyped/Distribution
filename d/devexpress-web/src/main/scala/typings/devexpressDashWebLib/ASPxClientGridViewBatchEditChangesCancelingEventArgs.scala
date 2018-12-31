package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditChangesCanceling event.
  */
trait ASPxClientGridViewBatchEditChangesCancelingEventArgs extends ASPxClientCancelEventArgs {
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

