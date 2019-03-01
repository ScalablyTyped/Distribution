package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditRecordValidating event.
  */
trait ASPxClientVerticalGridBatchEditRecordValidatingEventArgs extends ASPxClientEventArgs {
  /**
    * Provides validation information on the record currently being validated.
    * Value: An object that is a hashtable containing validation information.
    */
  var validationInfo: js.Object
  /**
    * Gets the processed record's visible index.
    * Value: An integer value that specifies the processed record's visible index.
    */
  var visibleIndex: scala.Double
}

object ASPxClientVerticalGridBatchEditRecordValidatingEventArgs {
  @scala.inline
  def apply(validationInfo: js.Object, visibleIndex: scala.Double): ASPxClientVerticalGridBatchEditRecordValidatingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("validationInfo")(validationInfo)
    __obj.updateDynamic("visibleIndex")(visibleIndex)
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditRecordValidatingEventArgs]
  }
}

