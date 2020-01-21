package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides base data for the client-side events.
  */
@JSGlobal("BootstrapUIWidgetEventArgsBase")
@js.native
class BootstrapUIWidgetEventArgsBase protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the BootstrapUIWidgetEventArgsBase class with the specified widget and its container.
    * @param component The widget instance.
    * @param element The widget's container.
    */
  def this(component: js.Any, element: js.Any) = this()
  /**
    * The widget instance.
    */
  var component: js.Any = js.native
  /**
    * The widget's container.
    */
  var element: js.Any = js.native
}

