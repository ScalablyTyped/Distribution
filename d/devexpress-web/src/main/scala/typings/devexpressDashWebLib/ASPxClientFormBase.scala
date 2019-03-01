package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides base functionality for the ASPxClientScheduler's forms.
  */
trait ASPxClientFormBase extends js.Object {
  /**
    * Occurs when the form has been closed.
    */
  var FormClosed: ASPxClientEvent[ASPxClientEventHandler[ASPxClientFormBase]]
  /**
    * Closes the form.
    */
  def Close(): scala.Unit
  /**
    * Sets the visibility state of the specified form element.
    * @param element An object specifying the element whose visibility state should be changed.
    * @param isVisible true to display the element; false to hide the element.
    */
  def SetVisibleCore(element: js.Object, isVisible: scala.Boolean): scala.Unit
}

object ASPxClientFormBase {
  @scala.inline
  def apply(
    Close: js.Function0[scala.Unit],
    FormClosed: ASPxClientEvent[ASPxClientEventHandler[ASPxClientFormBase]],
    SetVisibleCore: js.Function2[js.Object, scala.Boolean, scala.Unit]
  ): ASPxClientFormBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Close")(Close)
    __obj.updateDynamic("FormClosed")(FormClosed)
    __obj.updateDynamic("SetVisibleCore")(SetVisibleCore)
    __obj.asInstanceOf[ASPxClientFormBase]
  }
}

