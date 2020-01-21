package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ActionExpanding event.
  */
@JSGlobal("ASPxClientFloatingActionButtonActionExpandingEventArgs")
@js.native
class ASPxClientFloatingActionButtonActionExpandingEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new object of the ASPxClientFloatingActionButtonActionExpandingEventArgs type with the specified settings.
    * @param contextName Specifies the FAB action's context name.
    */
  def this(contextName: String) = this()
  /**
    * Specifies the FAB action's context name.
    */
  var contextName: String = js.native
}

