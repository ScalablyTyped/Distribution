package typings.easyDashApiDashRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cookies extends js.Object {
  var cookies: js.UndefOr[js.Array[String]] = js.undefined
  var headers: js.UndefOr[js.Array[String]] = js.undefined
  var internal: js.UndefOr[Boolean] = js.undefined
  var jSend: js.UndefOr[Boolean] = js.undefined
  var opts: js.UndefOr[js.Object] = js.undefined
  var replyCookies: js.UndefOr[js.Array[String]] = js.undefined
  var url: String
}

object Anon_Cookies {
  @scala.inline
  def apply(
    url: String,
    cookies: js.Array[String] = null,
    headers: js.Array[String] = null,
    internal: js.UndefOr[Boolean] = js.undefined,
    jSend: js.UndefOr[Boolean] = js.undefined,
    opts: js.Object = null,
    replyCookies: js.Array[String] = null
  ): Anon_Cookies = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (cookies != null) __obj.updateDynamic("cookies")(cookies.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    if (!js.isUndefined(jSend)) __obj.updateDynamic("jSend")(jSend.asInstanceOf[js.Any])
    if (opts != null) __obj.updateDynamic("opts")(opts.asInstanceOf[js.Any])
    if (replyCookies != null) __obj.updateDynamic("replyCookies")(replyCookies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cookies]
  }
}

