package typings.expressDashRedisDashCache.expressDashRedisDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOptions extends js.Object {
  var expire: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AddOptions {
  @scala.inline
  def apply(expire: Int | Double = null, `type`: String = null): AddOptions = {
    val __obj = js.Dynamic.literal()
    if (expire != null) __obj.updateDynamic("expire")(expire.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AddOptions]
  }
}

