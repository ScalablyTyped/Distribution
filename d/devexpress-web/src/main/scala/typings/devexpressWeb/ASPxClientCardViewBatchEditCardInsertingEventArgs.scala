package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientCardView.BatchEditCardInserting event.
  */
@JSGlobal("ASPxClientCardViewBatchEditCardInsertingEventArgs")
@js.native
class ASPxClientCardViewBatchEditCardInsertingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewBatchEditCardInsertingEventArgs class.
    * @param visibleIndex An integer value that specifies the processed card visible index.
    */
  def this(visibleIndex: Double) = this()
  /**
    * Gets the processed card visible index.
    */
  var visibleIndex: Double = js.native
}

