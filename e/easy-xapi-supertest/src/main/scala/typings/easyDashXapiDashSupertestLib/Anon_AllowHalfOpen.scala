package typings
package easyDashXapiDashSupertestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowHalfOpen extends js.Object {
  var allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined
  var fd: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AllowHalfOpen {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined,
    fd: java.lang.String = null,
    `type`: java.lang.String = null
  ): Anon_AllowHalfOpen = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (fd != null) __obj.updateDynamic("fd")(fd)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AllowHalfOpen]
  }
}

