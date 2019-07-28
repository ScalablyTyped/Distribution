package typings.easyDashXDashHeaders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxKeys extends js.Object {
  var maxKeys: js.UndefOr[Double] = js.undefined
}

object Anon_MaxKeys {
  @scala.inline
  def apply(maxKeys: Int | Double = null): Anon_MaxKeys = {
    val __obj = js.Dynamic.literal()
    if (maxKeys != null) __obj.updateDynamic("maxKeys")(maxKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxKeys]
  }
}

