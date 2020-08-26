package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for an event that occurs before a spelling check is started. Represents the client-side equivalent of the BeforeCheckEventArgs class.
  */
@js.native
trait ASPxClientSpellCheckerBeforeCheckEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the programmatic identifier assigned to the control which is going to be checked.
    */
  var controlId: String = js.native
}

object ASPxClientSpellCheckerBeforeCheckEventArgs {
  @scala.inline
  def apply(cancel: Boolean, controlId: String): ASPxClientSpellCheckerBeforeCheckEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], controlId = controlId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpellCheckerBeforeCheckEventArgs]
  }
  @scala.inline
  implicit class ASPxClientSpellCheckerBeforeCheckEventArgsOps[Self <: ASPxClientSpellCheckerBeforeCheckEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setControlId(value: String): Self = this.set("controlId", value.asInstanceOf[js.Any])
  }
  
}

