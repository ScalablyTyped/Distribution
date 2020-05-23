package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxHint's window.
  */
trait ASPxClientHintWindow extends js.Object {
  /**
    * Sets the hint's content.
    * @param html An object that specifies the hint content.
    * @param options An  object that specifies the hint's options.
    */
  def SetContent(html: js.Any, options: ASPxClientHintOptions): Unit
  /**
    * Set the hint's loading animation
    */
  def SetContentLoading(): Unit
  /**
    * Forces the ASPxClientHint's window to recalculate its position.
    */
  def UpdatePosition(): Unit
}

object ASPxClientHintWindow {
  @scala.inline
  def apply(
    SetContent: (js.Any, ASPxClientHintOptions) => Unit,
    SetContentLoading: () => Unit,
    UpdatePosition: () => Unit
  ): ASPxClientHintWindow = {
    val __obj = js.Dynamic.literal(SetContent = js.Any.fromFunction2(SetContent), SetContentLoading = js.Any.fromFunction0(SetContentLoading), UpdatePosition = js.Any.fromFunction0(UpdatePosition))
    __obj.asInstanceOf[ASPxClientHintWindow]
  }
}

