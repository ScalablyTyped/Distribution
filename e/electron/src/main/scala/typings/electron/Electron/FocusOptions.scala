package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusOptions extends js.Object {
  /**
    * Make the receiver the active app even if another app is currently active.
    *
    * @platform darwin
    */
  var steal: Boolean
}

object FocusOptions {
  @scala.inline
  def apply(steal: Boolean): FocusOptions = {
    val __obj = js.Dynamic.literal(steal = steal.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusOptions]
  }
}

