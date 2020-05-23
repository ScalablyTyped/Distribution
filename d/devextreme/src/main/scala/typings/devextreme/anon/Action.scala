package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var action: js.UndefOr[js.Function2[/* itemElement */ dxElement, /* itemData */ js.Any, _]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Action {
  @scala.inline
  def apply(action: (/* itemElement */ dxElement, /* itemData */ js.Any) => _ = null, text: String = null): Action = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction2(action))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

