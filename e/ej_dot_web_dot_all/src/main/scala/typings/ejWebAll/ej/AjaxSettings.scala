package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxSettings extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var cache: Boolean
  var contentType: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataType: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AjaxSettings {
  @scala.inline
  def apply(
    cache: Boolean,
    async: js.UndefOr[Boolean] = js.undefined,
    contentType: js.Any = null,
    data: js.Any = null,
    dataType: String = null,
    `type`: String = null
  ): AjaxSettings = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxSettings]
  }
}

