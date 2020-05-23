package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides base functionality for the ASPxClientScheduler's forms.
  */
@JSGlobal("ASPxClientFormBase")
@js.native
class ASPxClientFormBase ()
  extends typings.devexpressWeb.ASPxClientFormBase {
  /**
    * Occurs when the form has been closed.
    */
  /* CompleteClass */
  override var FormClosed: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientFormBase]] = js.native
  /**
    * Closes the form.
    */
  /* CompleteClass */
  override def Close(): Unit = js.native
  /**
    * Sets the visibility state of the specified form element.
    * @param element An object specifying the element whose visibility state should be changed.
    * @param isVisible true to display the element; false to hide the element.
    */
  /* CompleteClass */
  override def SetVisibleCore(element: js.Any, isVisible: Boolean): Unit = js.native
}

