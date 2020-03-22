package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShow extends js.Object {
  var hide: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Double] = js.undefined
}

object AnonShow {
  @scala.inline
  def apply(hide: Int | Double = null, show: Int | Double = null): AnonShow = {
    val __obj = js.Dynamic.literal()
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShow]
  }
}

