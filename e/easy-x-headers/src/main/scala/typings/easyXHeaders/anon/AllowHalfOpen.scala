package typings.easyXHeaders.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowHalfOpen extends js.Object {
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  var fd: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AllowHalfOpen {
  @scala.inline
  def apply(allowHalfOpen: js.UndefOr[Boolean] = js.undefined, fd: String = null, `type`: String = null): AllowHalfOpen = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.get.asInstanceOf[js.Any])
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowHalfOpen]
  }
}

