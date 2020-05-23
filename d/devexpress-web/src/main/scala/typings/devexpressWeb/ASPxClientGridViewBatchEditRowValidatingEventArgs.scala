package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.BatchEditRowValidating event.
  */
trait ASPxClientGridViewBatchEditRowValidatingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the row's key.
    */
  var key: js.Any
  /**
    * Provides validation information of a row currently being validated.
    */
  var validationInfo: js.Any
  /**
    * Gets the processed row's visible index.
    */
  var visibleIndex: Double
}

object ASPxClientGridViewBatchEditRowValidatingEventArgs {
  @scala.inline
  def apply(key: js.Any, validationInfo: js.Any, visibleIndex: Double): ASPxClientGridViewBatchEditRowValidatingEventArgs = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], validationInfo = validationInfo.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewBatchEditRowValidatingEventArgs]
  }
}

