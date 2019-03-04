package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxSettings extends js.Object {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  var cache: scala.Boolean
  var contentType: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AjaxSettings {
  @scala.inline
  def apply(
    cache: scala.Boolean,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    contentType: js.Any = null,
    data: js.Any = null,
    dataType: java.lang.String = null,
    `type`: java.lang.String = null
  ): AjaxSettings = {
    val __obj = js.Dynamic.literal(cache = cache)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AjaxSettings]
  }
}

