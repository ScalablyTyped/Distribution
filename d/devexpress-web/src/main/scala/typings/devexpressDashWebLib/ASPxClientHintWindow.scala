package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxHint's window.
  */
trait ASPxClientHintWindow extends js.Object {
  def SetContent(html: js.Object, options: ASPxClientHintOptions): scala.Unit
  def SetContentLoading(): scala.Unit
  /**
    * Forces the ASPxClientHint's window to recalculate its position.
    */
  def UpdatePosition(): scala.Unit
}

object ASPxClientHintWindow {
  @scala.inline
  def apply(
    SetContent: js.Function2[js.Object, ASPxClientHintOptions, scala.Unit],
    SetContentLoading: js.Function0[scala.Unit],
    UpdatePosition: js.Function0[scala.Unit]
  ): ASPxClientHintWindow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SetContent")(SetContent)
    __obj.updateDynamic("SetContentLoading")(SetContentLoading)
    __obj.updateDynamic("UpdatePosition")(UpdatePosition)
    __obj.asInstanceOf[ASPxClientHintWindow]
  }
}

