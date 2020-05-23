package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enabled extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var texts: js.UndefOr[Fix] = js.undefined
}

object Enabled {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, texts: Fix = null): Enabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
}

