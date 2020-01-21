package typings.expressValidator.baseMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request
  extends /* k */ StringDictionary[js.Any] {
  var body: js.UndefOr[js.Any] = js.undefined
  var cookies: js.UndefOr[Record[String, _]] = js.undefined
  var headers: js.UndefOr[Record[String, _]] = js.undefined
  var params: js.UndefOr[Record[String, _]] = js.undefined
  var query: js.UndefOr[Record[String, _]] = js.undefined
}

object Request {
  @scala.inline
  def apply(
    StringDictionary: /* k */ StringDictionary[js.Any] = null,
    body: js.Any = null,
    cookies: Record[String, _] = null,
    headers: Record[String, _] = null,
    params: Record[String, _] = null,
    query: Record[String, _] = null
  ): Request = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cookies != null) __obj.updateDynamic("cookies")(cookies.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

