package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxHint's window.
  */
trait ASPxClientHintWindow extends js.Object {
  def SetContent(html: js.Object, options: ASPxClientHintOptions): Unit
  def SetContentLoading(): Unit
  /**
    * Forces the ASPxClientHint's window to recalculate its position.
    */
  def UpdatePosition(): Unit
}

object ASPxClientHintWindow {
  @scala.inline
  def apply(
    SetContent: (js.Object, ASPxClientHintOptions) => Unit,
    SetContentLoading: () => Unit,
    UpdatePosition: () => Unit
  ): ASPxClientHintWindow = {
    val __obj = js.Dynamic.literal(SetContent = js.Any.fromFunction2(SetContent), SetContentLoading = js.Any.fromFunction0(SetContentLoading), UpdatePosition = js.Any.fromFunction0(UpdatePosition))
  
    __obj.asInstanceOf[ASPxClientHintWindow]
  }
}

