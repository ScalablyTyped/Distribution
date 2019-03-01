package typings
package fetchDashMockLib.fetchDashMockMod.fetchMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockOptionsMethodHead extends MockOptions {
  @JSName("method")
  var method_MockOptionsMethodHead: js.UndefOr[fetchDashMockLib.fetchDashMockLibStrings.HEAD] = js.undefined
}

object MockOptionsMethodHead {
  @scala.inline
  def apply(
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    includeContentLength: js.UndefOr[scala.Boolean] = js.undefined,
    matcher: MockMatcher = null,
    method: fetchDashMockLib.fetchDashMockLibStrings.HEAD = null,
    name: java.lang.String = null,
    overwriteRoutes: js.UndefOr[scala.Boolean] = js.undefined,
    query: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    repeat: scala.Int | scala.Double = null,
    response: MockResponse | MockResponseFunction = null,
    sendAsJson: js.UndefOr[scala.Boolean] = js.undefined
  ): MockOptionsMethodHead = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(includeContentLength)) __obj.updateDynamic("includeContentLength")(includeContentLength)
    if (matcher != null) __obj.updateDynamic("matcher")(matcher.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(overwriteRoutes)) __obj.updateDynamic("overwriteRoutes")(overwriteRoutes)
    if (query != null) __obj.updateDynamic("query")(query)
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (!js.isUndefined(sendAsJson)) __obj.updateDynamic("sendAsJson")(sendAsJson)
    __obj.asInstanceOf[MockOptionsMethodHead]
  }
}

