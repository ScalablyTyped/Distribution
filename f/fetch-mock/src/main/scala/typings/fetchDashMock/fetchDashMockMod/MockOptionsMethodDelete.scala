package typings.fetchDashMock.fetchDashMockMod

import org.scalablytyped.runtime.StringDictionary
import typings.fetchDashMock.fetchDashMockStrings.DELETE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockOptionsMethodDelete extends MockOptions {
  @JSName("method")
  var method_MockOptionsMethodDelete: js.UndefOr[DELETE] = js.undefined
}

object MockOptionsMethodDelete {
  @scala.inline
  def apply(
    body: String | js.Object = null,
    functionMatcher: (/* url */ String, /* opts */ MockRequest) => Boolean = null,
    headers: StringDictionary[String | Double] = null,
    includeContentLength: js.UndefOr[Boolean] = js.undefined,
    matcher: MockMatcher = null,
    method: DELETE = null,
    name: String = null,
    overwriteRoutes: js.UndefOr[Boolean] = js.undefined,
    params: StringDictionary[String] = null,
    query: StringDictionary[String] = null,
    repeat: Int | Double = null,
    response: MockResponse | MockResponseFunction = null,
    sendAsJson: js.UndefOr[Boolean] = js.undefined
  ): MockOptionsMethodDelete = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (functionMatcher != null) __obj.updateDynamic("functionMatcher")(js.Any.fromFunction2(functionMatcher))
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(includeContentLength)) __obj.updateDynamic("includeContentLength")(includeContentLength)
    if (matcher != null) __obj.updateDynamic("matcher")(matcher.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(overwriteRoutes)) __obj.updateDynamic("overwriteRoutes")(overwriteRoutes)
    if (params != null) __obj.updateDynamic("params")(params)
    if (query != null) __obj.updateDynamic("query")(query)
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (!js.isUndefined(sendAsJson)) __obj.updateDynamic("sendAsJson")(sendAsJson)
    __obj.asInstanceOf[MockOptionsMethodDelete]
  }
}

