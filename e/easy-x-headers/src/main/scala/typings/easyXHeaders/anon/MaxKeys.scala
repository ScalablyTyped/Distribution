package typings.easyXHeaders.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxKeys extends js.Object {
  var maxKeys: js.UndefOr[Double] = js.undefined
}

object MaxKeys {
  @scala.inline
  def apply(maxKeys: js.UndefOr[Double] = js.undefined): MaxKeys = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxKeys)) __obj.updateDynamic("maxKeys")(maxKeys.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxKeys]
  }
}

