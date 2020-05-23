package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Show extends js.Object {
  var hide: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Double] = js.undefined
}

object Show {
  @scala.inline
  def apply(hide: js.UndefOr[Double] = js.undefined, show: js.UndefOr[Double] = js.undefined): Show = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Show]
  }
}

