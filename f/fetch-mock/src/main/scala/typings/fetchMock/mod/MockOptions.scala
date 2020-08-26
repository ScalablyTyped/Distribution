package typings.fetchMock.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mock options object
  */
@js.native
trait MockOptions extends js.Object {
  /**
    * body to match
    */
  var body: js.UndefOr[String | js.Object] = js.native
  /**
    * A function for arbitrary matching
    */
  var functionMatcher: js.UndefOr[MockMatcherFunction] = js.native
  /**
    * key/value map of headers to match
    */
  var headers: js.UndefOr[StringDictionary[String | Double]] = js.native
  /**
    * Automatically sets a content-length header on each response.
    * @default true
    */
  var includeContentLength: js.UndefOr[Boolean] = js.native
  /**
    * as specified above
    */
  var matcher: js.UndefOr[MockMatcher] = js.native
  /**
    * http method to match
    */
  var method: js.UndefOr[String] = js.native
  /**
    * A unique string naming the route. Used to subsequently retrieve
    * references to the calls, grouped by name.
    * @default matcher.toString()
    *
    * Note: If a non-unique name is provided no error will be thrown
    *  (because names are optional, auto-generated ones may legitimately
    *  clash)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * This option allows for existing routes in a mock to be overwritten.
    * It’s also possible to define multiple routes with ‘the same’ matcher.
    * Default behaviour is to error
    */
  var overwriteRoutes: js.UndefOr[Boolean] = js.native
  /**
    * key/value map of express style path params to match
    */
  var params: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * key/value map of query strings to match, in any order
    */
  var query: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * integer, n, limiting the number of times the matcher can be used.
    * If the route has already been called n times the route will be
    * ignored and the call to fetch() will fall through to be handled by
    * any other routes defined (which may eventually result in an error
    * if nothing matches it).
    */
  var repeat: js.UndefOr[Double] = js.native
  /**
    * as specified above
    */
  var response: js.UndefOr[MockResponse | MockResponseFunction] = js.native
  /**
    * Convert objects into JSON before delivering as stub responses. Can
    * be useful to set to false globally if e.g. dealing with a lot of
    * array buffers. If true, will also add content-type: application/json
    * header.
    * @default true
    */
  var sendAsJson: js.UndefOr[Boolean] = js.native
}

object MockOptions {
  @scala.inline
  def apply(): MockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockOptions]
  }
  @scala.inline
  implicit class MockOptionsOps[Self <: MockOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: String | js.Object): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setFunctionMatcher(value: (/* url */ String, /* opts */ MockRequest) => Boolean): Self = this.set("functionMatcher", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFunctionMatcher: Self = this.set("functionMatcher", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[String | Double]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setIncludeContentLength(value: Boolean): Self = this.set("includeContentLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeContentLength: Self = this.set("includeContentLength", js.undefined)
    @scala.inline
    def setMatcherFunction2(value: (/* url */ String, /* opts */ MockRequest) => Boolean): Self = this.set("matcher", js.Any.fromFunction2(value))
    @scala.inline
    def setMatcher(value: MockMatcher): Self = this.set("matcher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatcher: Self = this.set("matcher", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOverwriteRoutes(value: Boolean): Self = this.set("overwriteRoutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverwriteRoutes: Self = this.set("overwriteRoutes", js.undefined)
    @scala.inline
    def setParams(value: StringDictionary[String]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setQuery(value: StringDictionary[String]): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setRepeat(value: Double): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    @scala.inline
    def setResponseFunction2(value: (/* url */ String, /* opts */ MockRequest) => MockResponse): Self = this.set("response", js.Any.fromFunction2(value))
    @scala.inline
    def setResponse(value: MockResponse | MockResponseFunction): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setSendAsJson(value: Boolean): Self = this.set("sendAsJson", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendAsJson: Self = this.set("sendAsJson", js.undefined)
  }
  
}

