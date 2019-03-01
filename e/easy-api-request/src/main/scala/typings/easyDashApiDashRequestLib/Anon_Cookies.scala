package typings
package easyDashApiDashRequestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cookies extends js.Object {
  var cookies: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var headers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var internal: js.UndefOr[scala.Boolean] = js.undefined
  var jSend: js.UndefOr[scala.Boolean] = js.undefined
  var opts: js.UndefOr[js.Object] = js.undefined
  var replyCookies: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var url: java.lang.String
}

object Anon_Cookies {
  @scala.inline
  def apply(
    url: java.lang.String,
    cookies: js.Array[java.lang.String] = null,
    headers: js.Array[java.lang.String] = null,
    internal: js.UndefOr[scala.Boolean] = js.undefined,
    jSend: js.UndefOr[scala.Boolean] = js.undefined,
    opts: js.Object = null,
    replyCookies: js.Array[java.lang.String] = null
  ): Anon_Cookies = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (cookies != null) __obj.updateDynamic("cookies")(cookies)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal)
    if (!js.isUndefined(jSend)) __obj.updateDynamic("jSend")(jSend)
    if (opts != null) __obj.updateDynamic("opts")(opts)
    if (replyCookies != null) __obj.updateDynamic("replyCookies")(replyCookies)
    __obj.asInstanceOf[Anon_Cookies]
  }
}

