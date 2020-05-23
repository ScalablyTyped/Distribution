package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  var icon: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Icon {
  @scala.inline
  def apply(icon: String = null, text: String = null): Icon = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
}

