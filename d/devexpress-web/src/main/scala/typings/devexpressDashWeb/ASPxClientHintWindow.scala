package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxHint's window.
  */
@JSGlobal("ASPxClientHintWindow")
@js.native
class ASPxClientHintWindow () extends js.Object {
  /**
    * Sets the hint's content.
    * @param html An object that specifies the hint content.
    * @param options An  object that specifies the hint's options.
    */
  def SetContent(html: js.Any, options: ASPxClientHintOptions): Unit = js.native
  /**
    * Set the hint's loading animation
    */
  def SetContentLoading(): Unit = js.native
  /**
    * Forces the ASPxClientHint's window to recalculate its position.
    */
  def UpdatePosition(): Unit = js.native
}

