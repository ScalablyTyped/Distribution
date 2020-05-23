package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientVerticalGrid.BatchEditRecordValidating event.
  */
@JSGlobal("ASPxClientVerticalGridBatchEditRecordValidatingEventArgs")
@js.native
class ASPxClientVerticalGridBatchEditRecordValidatingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientVerticalGridBatchEditRecordValidatingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientVerticalGridBatchEditRecordValidatingEventArgs class.
    * @param visibleIndex An integer value that specifies the processed record's visible index.
    * @param validationInfo An object containing validation information.
    */
  def this(visibleIndex: Double, validationInfo: js.Any) = this()
  /**
    * Provides validation information on the record currently being validated.
    */
  /* CompleteClass */
  override var validationInfo: js.Any = js.native
  /**
    * Gets the processed record's visible index.
    */
  /* CompleteClass */
  override var visibleIndex: Double = js.native
}

