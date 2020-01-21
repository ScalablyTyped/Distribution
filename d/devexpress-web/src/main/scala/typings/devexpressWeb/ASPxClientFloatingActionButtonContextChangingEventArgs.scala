package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFloatingActionButton.ContextChanging event.
  */
@JSGlobal("ASPxClientFloatingActionButtonContextChangingEventArgs")
@js.native
class ASPxClientFloatingActionButtonContextChangingEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFloatingActionButtonContextChangingEventArgs class.
    * @param action An ASPxClientFABAction object that is the floating action button's action.
    */
  def this(action: ASPxClientFABAction) = this()
  /**
    * Returns the action related to the event.
    */
  var action: ASPxClientFABAction = js.native
}

