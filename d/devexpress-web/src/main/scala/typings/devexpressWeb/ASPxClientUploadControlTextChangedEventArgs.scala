package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientUploadControl.TextChanged client event that allows you to respond to an end-user changing an edit box's text.
  */
@JSGlobal("ASPxClientUploadControlTextChangedEventArgs")
@js.native
class ASPxClientUploadControlTextChangedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientUploadControlTextChangedEventArgs class.
    * @param inputIndex An integer value that specifies the file input element's index within the ASPxUploadControl.UploadedFiles collection.
    */
  def this(inputIndex: Double) = this()
  /**
    * Gets the index of a <strong>file input element</strong> within the ASPxUploadControl.
    */
  var inputIndex: Double = js.native
}

