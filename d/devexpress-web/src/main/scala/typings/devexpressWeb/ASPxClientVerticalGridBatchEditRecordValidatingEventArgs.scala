package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordValidating event.
  */
trait ASPxClientVerticalGridBatchEditRecordValidatingEventArgs extends ASPxClientEventArgs {
  /**
    * Provides validation information on the record currently being validated.
    */
  var validationInfo: js.Any
  /**
    * Gets the processed record's visible index.
    */
  var visibleIndex: Double
}

object ASPxClientVerticalGridBatchEditRecordValidatingEventArgs {
  @scala.inline
  def apply(validationInfo: js.Any, visibleIndex: Double): ASPxClientVerticalGridBatchEditRecordValidatingEventArgs = {
    val __obj = js.Dynamic.literal(validationInfo = validationInfo.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridBatchEditRecordValidatingEventArgs]
  }
}

