package typings.fetchDashMock.fetchDashMockMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mock options object
  */
trait MockOptions extends js.Object {
  /**
    * body to match
    */
  var body: js.UndefOr[String | js.Object] = js.undefined
  /**
    * A function for arbitrary matching
    */
  var functionMatcher: js.UndefOr[MockMatcherFunction] = js.undefined
  /**
    * key/value map of headers to match
    */
  var headers: js.UndefOr[StringDictionary[String | Double]] = js.undefined
  /**
    * Automatically sets a content-length header on each response.
    * @default true
    */
  var includeContentLength: js.UndefOr[Boolean] = js.undefined
  /**
    * as specified above
    */
  var matcher: js.UndefOr[MockMatcher] = js.undefined
  /**
    * http method to match
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * A unique string naming the route. Used to subsequently retrieve
    * references to the calls, grouped by name.
    * @default matcher.toString()
    *
    * Note: If a non-unique name is provided no error will be thrown
    *  (because names are optional, auto-generated ones may legitimately
    *  clash)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * This option allows for existing routes in a mock to be overwritten.
    * It’s also possible to define multiple routes with ‘the same’ matcher.
    * Default behaviour is to error
    */
  var overwriteRoutes: js.UndefOr[Boolean] = js.undefined
  /**
    * key/value map of express style path params to match
    */
  var params: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * key/value map of query strings to match, in any order
    */
  var query: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * integer, n, limiting the number of times the matcher can be used.
    * If the route has already been called n times the route will be
    * ignored and the call to fetch() will fall through to be handled by
    * any other routes defined (which may eventually result in an error
    * if nothing matches it).
    */
  var repeat: js.UndefOr[Double] = js.undefined
  /**
    * as specified above
    */
  var response: js.UndefOr[MockResponse | MockResponseFunction] = js.undefined
  /**
    * Convert objects into JSON before delivering as stub responses. Can
    * be useful to set to false globally if e.g. dealing with a lot of
    * array buffers. If true, will also add content-type: application/json
    * header.
    * @default true
    */
  var sendAsJson: js.UndefOr[Boolean] = js.undefined
}

object MockOptions {
  @scala.inline
  def apply(
    body: String | js.Object = null,
    functionMatcher: (/* url */ String, /* opts */ MockRequest) => Boolean = null,
    headers: StringDictionary[String | Double] = null,
    includeContentLength: js.UndefOr[Boolean] = js.undefined,
    matcher: MockMatcher = null,
    method: String = null,
    name: String = null,
    overwriteRoutes: js.UndefOr[Boolean] = js.undefined,
    params: StringDictionary[String] = null,
    query: StringDictionary[String] = null,
    repeat: Int | Double = null,
    response: MockResponse | MockResponseFunction = null,
    sendAsJson: js.UndefOr[Boolean] = js.undefined
  ): MockOptions = {
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
    __obj.asInstanceOf[MockOptions]
  }
}

