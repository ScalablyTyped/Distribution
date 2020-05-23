package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delay extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Delay {
  @scala.inline
  def apply(delay: js.UndefOr[Double] = js.undefined, name: String = null): Delay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
}

