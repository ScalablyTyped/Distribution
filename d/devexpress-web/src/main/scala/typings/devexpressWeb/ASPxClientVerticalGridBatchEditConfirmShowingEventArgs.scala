package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditConfirmShowing event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditConfirmShowingEventArgs")
@js.native
class ASPxClientVerticalGridBatchEditConfirmShowingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditConfirmShowingEventArgs class.
    * @param requestTriggerID A string value specifying the client identifier of an object that initiates a request.
    */
  def this(requestTriggerID: String) = this()
  /**
    * Gets the client identifier of an object that initiates a send request.
    */
  var requestTriggerID: String = js.native
}

