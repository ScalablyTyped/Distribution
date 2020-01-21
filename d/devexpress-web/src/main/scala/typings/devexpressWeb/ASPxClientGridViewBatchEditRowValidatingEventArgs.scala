package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientGridView.BatchEditRowValidating event.
  */
@JSGlobal("ASPxClientGridViewBatchEditRowValidatingEventArgs")
@js.native
class ASPxClientGridViewBatchEditRowValidatingEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewBatchEditRowValidatingEventArgs class.
    * @param visibleIndex An integer value that specifies the row's visible index.
    * @param validationInfo An object that provides the row's validation info.
    * @param key An object that is the row's key.
    */
  def this(visibleIndex: Double, validationInfo: js.Any, key: js.Any) = this()
  /**
    * Gets the row's key.
    */
  var key: js.Any = js.native
  /**
    * Provides validation information of a row currently being validated.
    */
  var validationInfo: js.Any = js.native
  /**
    * Gets the processed row's visible index.
    */
  var visibleIndex: Double = js.native
}

