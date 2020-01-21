package typings.feathersjsExpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHtml extends js.Object {
  var html: js.UndefOr[js.Any] = js.undefined
  var json: js.UndefOr[js.Any] = js.undefined
  var logger: js.UndefOr[AnonError] = js.undefined
  var public: js.UndefOr[String] = js.undefined
}

object AnonHtml {
  @scala.inline
  def apply(html: js.Any = null, json: js.Any = null, logger: AnonError = null, public: String = null): AnonHtml = {
    val __obj = js.Dynamic.literal()
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (public != null) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHtml]
  }
}

