package typings.ejDotWebDotAll.ej.Accordion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxSettings extends js.Object {
  /** It specifies, whether to enable or disable asynchronous request.
    */
  var async: js.UndefOr[Boolean] = js.undefined
  /** It specifies the page will be cached in the web browser.
    */
  var cache: js.UndefOr[Boolean] = js.undefined
  /** It specifies the type of data is send in the query string.
    */
  var contentType: js.UndefOr[String] = js.undefined
  /** It specifies the data as an object, will be passed in the query string.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** It specifies the type of data that you're expecting back from the response.
    */
  var dataType: js.UndefOr[String] = js.undefined
  /** It specifies the HTTP request type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object AjaxSettings {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    cache: js.UndefOr[Boolean] = js.undefined,
    contentType: String = null,
    data: js.Any = null,
    dataType: String = null,
    `type`: String = null
  ): AjaxSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AjaxSettings]
  }
}

