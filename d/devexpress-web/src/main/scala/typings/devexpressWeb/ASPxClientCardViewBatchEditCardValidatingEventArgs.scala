package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.BatchEditCardValidating event.
  */
@JSGlobal("ASPxClientCardViewBatchEditCardValidatingEventArgs")
@js.native
class ASPxClientCardViewBatchEditCardValidatingEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewBatchEditCardValidatingEventArgs class.
    * @param visibleIndex An integer value that specifies the processed card's visible index.
    * @param validationInfo An object containing validation information.
    */
  def this(visibleIndex: Double, validationInfo: js.Any) = this()
  /**
    * Provides validation information of a card currently being validated.
    */
  var validationInfo: js.Any = js.native
  /**
    * Gets the processed card's visible index.
    */
  var visibleIndex: Double = js.native
}

