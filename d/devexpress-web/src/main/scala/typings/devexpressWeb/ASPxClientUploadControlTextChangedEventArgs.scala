package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientUploadControl.TextChanged client event that allows you to respond to an end-user changing an edit box's text.
  */
trait ASPxClientUploadControlTextChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the index of a <strong>file input element</strong> within the ASPxUploadControl.
    */
  var inputIndex: Double
}

object ASPxClientUploadControlTextChangedEventArgs {
  @scala.inline
  def apply(inputIndex: Double): ASPxClientUploadControlTextChangedEventArgs = {
    val __obj = js.Dynamic.literal(inputIndex = inputIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlTextChangedEventArgs]
  }
}

