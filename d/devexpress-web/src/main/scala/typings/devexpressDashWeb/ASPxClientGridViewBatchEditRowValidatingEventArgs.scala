package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BatchEditRowValidating event.
  */
trait ASPxClientGridViewBatchEditRowValidatingEventArgs extends ASPxClientEventArgs {
  /**
    * Provides validation information of a row currently being validated.
    * Value: An object that is a hashtable containing validation information.
    */
  var validationInfo: js.Object
  /**
    * Gets the processed row's visible index.
    * Value: An integer value that specifies the processed row's visible index.
    */
  var visibleIndex: Double
}

object ASPxClientGridViewBatchEditRowValidatingEventArgs {
  @scala.inline
  def apply(validationInfo: js.Object, visibleIndex: Double): ASPxClientGridViewBatchEditRowValidatingEventArgs = {
    val __obj = js.Dynamic.literal(validationInfo = validationInfo, visibleIndex = visibleIndex)
  
    __obj.asInstanceOf[ASPxClientGridViewBatchEditRowValidatingEventArgs]
  }
}

