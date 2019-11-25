package typings.fetchDashMock.fetchDashMockMod

import org.scalablytyped.runtime.StringDictionary
import typings.fetchDashMock.fetchDashMockStrings.GET
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockOptionsMethodGet extends MockOptions {
  @JSName("method")
  var method_MockOptionsMethodGet: js.UndefOr[GET] = js.undefined
}

object MockOptionsMethodGet {
  @scala.inline
  def apply(
    body: String | js.Object = null,
    functionMatcher: (/* url */ String, /* opts */ MockRequest) => Boolean = null,
    headers: StringDictionary[String | Double] = null,
    includeContentLength: js.UndefOr[Boolean] = js.undefined,
    matcher: MockMatcher = null,
    method: GET = null,
    name: String = null,
    overwriteRoutes: js.UndefOr[Boolean] = js.undefined,
    params: StringDictionary[String] = null,
    query: StringDictionary[String] = null,
    repeat: Int | Double = null,
    response: MockResponse | MockResponseFunction = null,
    sendAsJson: js.UndefOr[Boolean] = js.undefined
  ): MockOptionsMethodGet = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (functionMatcher != null) __obj.updateDynamic("functionMatcher")(js.Any.fromFunction2(functionMatcher))
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(includeContentLength)) __obj.updateDynamic("includeContentLength")(includeContentLength.asInstanceOf[js.Any])
    if (matcher != null) __obj.updateDynamic("matcher")(matcher.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(overwriteRoutes)) __obj.updateDynamic("overwriteRoutes")(overwriteRoutes.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (!js.isUndefined(sendAsJson)) __obj.updateDynamic("sendAsJson")(sendAsJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockOptionsMethodGet]
  }
}

