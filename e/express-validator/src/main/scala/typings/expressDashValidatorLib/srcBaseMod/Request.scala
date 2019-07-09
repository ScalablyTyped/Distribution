package typings
package expressDashValidatorLib.srcBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request
  extends /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var body: js.UndefOr[js.Any] = js.undefined
  var cookies: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var headers: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var params: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var query: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

object Request {
  @scala.inline
  def apply(
    StringDictionary: /* k */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    body: js.Any = null,
    cookies: stdLib.Record[java.lang.String, _] = null,
    headers: stdLib.Record[java.lang.String, _] = null,
    params: stdLib.Record[java.lang.String, _] = null,
    query: stdLib.Record[java.lang.String, _] = null
  ): Request = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (body != null) __obj.updateDynamic("body")(body)
    if (cookies != null) __obj.updateDynamic("cookies")(cookies)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (params != null) __obj.updateDynamic("params")(params)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Request]
  }
}

