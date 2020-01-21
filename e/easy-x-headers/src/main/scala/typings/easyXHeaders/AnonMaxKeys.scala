package typings.easyXHeaders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxKeys extends js.Object {
  var maxKeys: js.UndefOr[Double] = js.undefined
}

object AnonMaxKeys {
  @scala.inline
  def apply(maxKeys: Int | Double = null): AnonMaxKeys = {
    val __obj = js.Dynamic.literal()
    if (maxKeys != null) __obj.updateDynamic("maxKeys")(maxKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxKeys]
  }
}

