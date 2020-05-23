package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.error
import typings.fundamentalReact.fundamentalReactStrings.information
import typings.fundamentalReact.fundamentalReactStrings.success
import typings.fundamentalReact.fundamentalReactStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var state: js.UndefOr[error | warning | information | success] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object State {
  @scala.inline
  def apply(state: error | warning | information | success = null, text: String = null): State = {
    val __obj = js.Dynamic.literal()
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

