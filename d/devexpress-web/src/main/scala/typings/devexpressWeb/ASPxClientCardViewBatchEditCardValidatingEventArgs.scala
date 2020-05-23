package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.BatchEditCardValidating event.
  */
trait ASPxClientCardViewBatchEditCardValidatingEventArgs extends ASPxClientEventArgs {
  /**
    * Provides validation information of a card currently being validated.
    */
  var validationInfo: js.Any
  /**
    * Gets the processed card's visible index.
    */
  var visibleIndex: Double
}

object ASPxClientCardViewBatchEditCardValidatingEventArgs {
  @scala.inline
  def apply(validationInfo: js.Any, visibleIndex: Double): ASPxClientCardViewBatchEditCardValidatingEventArgs = {
    val __obj = js.Dynamic.literal(validationInfo = validationInfo.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewBatchEditCardValidatingEventArgs]
  }
}

