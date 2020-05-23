package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDropDownEdit.DropDownCommandButtonClick event.
  */
@JSGlobal("ASPxClientDropDownCommandEventArgs")
@js.native
/**
  * Initializes a new instance of the ASPxClientDropDownCommandEventArgs class.
  */
class ASPxClientDropDownCommandEventArgs ()
  extends typings.devexpressWeb.ASPxClientDropDownCommandEventArgs {
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets the name of the processed command in the ASPxClientDropDownEdit.DropDownCommandButtonClick event.
    */
  /* CompleteClass */
  override var commandName: String = js.native
}

