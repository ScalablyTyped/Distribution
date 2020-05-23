package typings.expressRedisCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOptions extends js.Object {
  var expire: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AddOptions {
  @scala.inline
  def apply(expire: js.UndefOr[Double] = js.undefined, `type`: String = null): AddOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expire)) __obj.updateDynamic("expire")(expire.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOptions]
  }
}

