package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsShown extends js.Object {
  var isShown: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object IsShown {
  @scala.inline
  def apply(isShown: js.UndefOr[Boolean] = js.undefined, text: String = null): IsShown = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isShown)) __obj.updateDynamic("isShown")(isShown.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsShown]
  }
}

