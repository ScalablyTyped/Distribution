package typings
package fetchDashMockLib.fetchDashMockMod.fetchMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchMockStatic extends js.Object {
  /**
           * Returns a Boolean indicating whether fetch was called and a route
           * was matched (or a specific route if matcherName is passed).
           * @param [matcherName] either the name of a route or equal to
           * matcher.toString() for any unnamed route
           */
  def called(): scala.Boolean = js.native
  /**
           * Returns a Boolean indicating whether fetch was called and a route
           * was matched (or a specific route if matcherName is passed).
           * @param [matcherName] either the name of a route or equal to
           * matcher.toString() for any unnamed route
           */
  def called(matcherName: java.lang.String): scala.Boolean = js.native
  /**
           * Returns all calls to fetch matching matcherName.
           */
  def calls(): js.Array[MockCall] = js.native
  /**
           * Returns all calls to fetch matching matcherName.
           */
  def calls(matcherName: java.lang.String): js.Array[MockCall] = js.native
  /**
           * Returns all calls to fetch, grouped by whether fetch-mock matched
           * them or not.
           */
  @JSName("calls")
  def calls_MatchedRoutes(): MatchedRoutes = js.native
  /**
           * Chainable method that defines how to respond to calls to fetch that
           * don't match any of the defined mocks. It accepts the same types of
           * response as a normal call to .mock(matcher, response). It can also
           * take an arbitrary function to completely customise behaviour of
           * unmatched calls. If .catch() is called without any parameters then
           * every unmatched call will receive a 200 response.
           * @param [response] Configures the http response returned by the mock
           */
  def `catch`(): this.type = js.native
  /**
           * Chainable method that defines how to respond to calls to fetch that
           * don't match any of the defined mocks. It accepts the same types of
           * response as a normal call to .mock(matcher, response). It can also
           * take an arbitrary function to completely customise behaviour of
           * unmatched calls. If .catch() is called without any parameters then
           * every unmatched call will receive a 200 response.
           * @param [response] Configures the http response returned by the mock
           */
  def `catch`(response: MockResponse): this.type = js.native
  /**
           * Chainable method that defines how to respond to calls to fetch that
           * don't match any of the defined mocks. It accepts the same types of
           * response as a normal call to .mock(matcher, response). It can also
           * take an arbitrary function to completely customise behaviour of
           * unmatched calls. If .catch() is called without any parameters then
           * every unmatched call will receive a 200 response.
           * @param [response] Configures the http response returned by the mock
           */
  def `catch`(response: MockResponseFunction): this.type = js.native
  /**
           * Set some global config options, which include
           * sendAsJson [default `true`] - by default fetchMock will
           * convert objects to JSON before sending. This is overrideable
           * for each call but for some scenarios, e.g. when dealing with a
           * lot of array buffers, it can be useful to default to `false`
           */
  def configure(opts: js.Object): scala.Unit = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the
           *  DELETE method. Calls to .delete() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def delete(matcher: MockMatcher, reponse: MockResponse): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the
           *  DELETE method. Calls to .delete() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def delete(matcher: MockMatcher, reponse: MockResponseFunction): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the
           *  DELETE method. Calls to .delete() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def delete(matcher: MockMatcher, reponse: MockResponseFunction, options: MockOptionsMethodDelete): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the
           *  DELETE method. Calls to .delete() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def delete(matcher: MockMatcher, reponse: MockResponse, options: MockOptionsMethodDelete): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the
           *  DELETE method and limited to being called one time only. Calls to
           *  .deleteOnce() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def deleteOnce(matcher: MockMatcher, reponse: MockResponse): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the
           *  DELETE method and limited to being called one time only. Calls to
           *  .deleteOnce() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def deleteOnce(matcher: MockMatcher, reponse: MockResponseFunction): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the
           *  DELETE method and limited to being called one time only. Calls to
           *  .deleteOnce() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def deleteOnce(matcher: MockMatcher, reponse: MockResponseFunction, options: MockOptionsMethodDelete): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the
           *  DELETE method and limited to being called one time only. Calls to
           *  .deleteOnce() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def deleteOnce(matcher: MockMatcher, reponse: MockResponse, options: MockOptionsMethodDelete): this.type = js.native
  /**
           * Returns a Boolean indicating whether fetch was called the expected
           * number of times (or at least once if the route defines no expectation
           * is set) for every route (or for a specific route if matcherName is
           * passed).
           * @param [matcherName] either the name of a route or equal to
           * matcher.toString() for any unnamed route
           */
  def done(): scala.Boolean = js.native
  /**
           * Returns a Boolean indicating whether fetch was called the expected
           * number of times (or at least once if the route defines no expectation
           * is set) for every route (or for a specific route if matcherName is
           * passed).
           * @param [matcherName] either the name of a route or equal to
           * matcher.toString() for any unnamed route
           */
  def done(matcherName: java.lang.String): scala.Boolean = js.native
  /**
           * Returns a promise that resolves once all fetches handled by fetch-mock
           * have resolved.
           */
  def flush(): js.Promise[js.Array[MockResponse]] = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the GET
           *  method. Calls to .get() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def get(matcher: MockMatcher, reponse: MockResponse): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the GET
           *  method. Calls to .get() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def get(matcher: MockMatcher, reponse: MockResponseFunction): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the GET
           *  method. Calls to .get() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def get(matcher: MockMatcher, reponse: MockResponseFunction, options: MockOptionsMethodGet): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the GET
           *  method. Calls to .get() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def get(matcher: MockMatcher, reponse: MockResponse, options: MockOptionsMethodGet): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the GET
           *  method and limited to being called one time only. Calls to .getOnce()
           *  can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def getOnce(matcher: MockMatcher, reponse: MockResponse): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the GET
           *  method and limited to being called one time only. Calls to .getOnce()
           *  can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def getOnce(matcher: MockMatcher, reponse: MockResponseFunction): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the GET
           *  method and limited to being called one time only. Calls to .getOnce()
           *  can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def getOnce(matcher: MockMatcher, reponse: MockResponseFunction, options: MockOptionsMethodGet): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the GET
           *  method and limited to being called one time only. Calls to .getOnce()
           *  can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def getOnce(matcher: MockMatcher, reponse: MockResponse, options: MockOptionsMethodGet): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the HEAD
           *  method. Calls to .head() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def head(matcher: MockMatcher, reponse: MockResponse): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the HEAD
           *  method. Calls to .head() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def head(matcher: MockMatcher, reponse: MockResponseFunction): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the HEAD
           *  method. Calls to .head() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def head(matcher: MockMatcher, reponse: MockResponseFunction, options: MockOptionsMethodHead): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the HEAD
           *  method. Calls to .head() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def head(matcher: MockMatcher, reponse: MockResponse, options: MockOptionsMethodHead): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the HEAD
           *  method and limited to being called one time only. Calls to .headOnce()
           *  can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def headOnce(matcher: MockMatcher, reponse: MockResponse): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the HEAD
           *  method and limited to being called one time only. Calls to .headOnce()
           *  can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def headOnce(matcher: MockMatcher, reponse: MockResponseFunction): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the HEAD
           *  method and limited to being called one time only. Calls to .headOnce()
           *  can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def headOnce(matcher: MockMatcher, reponse: MockResponseFunction, options: MockOptionsMethodHead): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the HEAD
           *  method and limited to being called one time only. Calls to .headOnce()
           *  can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def headOnce(matcher: MockMatcher, reponse: MockResponse, options: MockOptionsMethodHead): this.type = js.native
  /**
           * Returns the arguments for the last matched call to fetch (or the
           * last call to specific route is matcherName is passed).
           * @param [matcherName] either the name of a route or equal to
           * matcher.toString() for any unnamed route
           */
  def lastCall(): MockCall = js.native
  /**
           * Returns the arguments for the last matched call to fetch (or the
           * last call to specific route is matcherName is passed).
           * @param [matcherName] either the name of a route or equal to
           * matcher.toString() for any unnamed route
           */
  def lastCall(matcherName: java.lang.String): MockCall = js.native
  /**
           * Returns the options for the last matched call to fetch (or the
           * last call to a specific route is matcherName is passed).
           * @param [matcherName] either the name of a route or equal to
           * matcher.toString() for any unnamed route
           */
  def lastOptions(): MockRequest = js.native
  /**
           * Returns the options for the last matched call to fetch (or the
           * last call to a specific route is matcherName is passed).
           * @param [matcherName] either the name of a route or equal to
           * matcher.toString() for any unnamed route
           */
  def lastOptions(matcherName: java.lang.String): MockRequest = js.native
  /**
           * Returns the url for the last matched call to fetch (or the last
           * call to specific route is matcherName is passed).
           * @param [matcherName] either the name of a route or equal to
           * matcher.toString() for any unnamed route
           */
  def lastUrl(): java.lang.String = js.native
  /**
           * Returns the url for the last matched call to fetch (or the last
           * call to specific route is matcherName is passed).
           * @param [matcherName] either the name of a route or equal to
           * matcher.toString() for any unnamed route
           */
  def lastUrl(matcherName: java.lang.String): java.lang.String = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Calls to .mock() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def mock(matcher: MockMatcher, response: MockResponse): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Calls to .mock() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def mock(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Calls to .mock() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def mock(matcher: MockMatcher, response: MockResponseFunction, options: MockOptions): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Calls to .mock() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def mock(matcher: MockMatcher, response: MockResponse, options: MockOptions): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Calls to .mock() can be chained.
           * @param options The route to mock
           */
  def mock(options: MockOptions): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() limited to being
           *  called one time only. Calls to .once() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Optional additional properties defining the route to mock
           */
  def once(matcher: MockMatcher, response: MockResponse): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() limited to being
           *  called one time only. Calls to .once() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Optional additional properties defining the route to mock
           */
  def once(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() limited to being
           *  called one time only. Calls to .once() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Optional additional properties defining the route to mock
           */
  def once(matcher: MockMatcher, response: MockResponseFunction, options: MockOptions): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() limited to being
           *  called one time only. Calls to .once() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Optional additional properties defining the route to mock
           */
  def once(matcher: MockMatcher, response: MockResponse, options: MockOptions): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the PATCH
           *  method. Calls to .patch() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def patch(matcher: MockMatcher, reponse: MockResponse): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the PATCH
           *  method. Calls to .patch() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def patch(matcher: MockMatcher, reponse: MockResponseFunction): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the PATCH
           *  method. Calls to .patch() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def patch(matcher: MockMatcher, reponse: MockResponseFunction, options: MockOptionsMethodHead): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the PATCH
           *  method. Calls to .patch() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def patch(matcher: MockMatcher, reponse: MockResponse, options: MockOptionsMethodHead): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the PATCH
           *  method and limited to being called one time only. Calls to .patchOnce()
           *  can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def patchOnce(matcher: MockMatcher, reponse: MockResponse): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the PATCH
           *  method and limited to being called one time only. Calls to .patchOnce()
           *  can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def patchOnce(matcher: MockMatcher, reponse: MockResponseFunction): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the PATCH
           *  method and limited to being called one time only. Calls to .patchOnce()
           *  can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def patchOnce(matcher: MockMatcher, reponse: MockResponseFunction, options: MockOptionsMethodHead): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the PATCH
           *  method and limited to being called one time only. Calls to .patchOnce()
           *  can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def patchOnce(matcher: MockMatcher, reponse: MockResponse, options: MockOptionsMethodHead): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the POST
           *  method. Calls to .post() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def post(matcher: MockMatcher, reponse: MockResponse): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the POST
           *  method. Calls to .post() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def post(matcher: MockMatcher, reponse: MockResponseFunction): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the POST
           *  method. Calls to .post() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def post(matcher: MockMatcher, reponse: MockResponseFunction, options: MockOptionsMethodPost): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the POST
           *  method. Calls to .post() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def post(matcher: MockMatcher, reponse: MockResponse, options: MockOptionsMethodPost): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the POST
           *  method and limited to being called one time only. Calls to .postOnce()
           *  can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def postOnce(matcher: MockMatcher, reponse: MockResponse): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the POST
           *  method and limited to being called one time only. Calls to .postOnce()
           *  can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def postOnce(matcher: MockMatcher, reponse: MockResponseFunction): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the POST
           *  method and limited to being called one time only. Calls to .postOnce()
           *  can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def postOnce(matcher: MockMatcher, reponse: MockResponseFunction, options: MockOptionsMethodPost): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the POST
           *  method and limited to being called one time only. Calls to .postOnce()
           *  can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def postOnce(matcher: MockMatcher, reponse: MockResponse, options: MockOptionsMethodPost): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the PUT
           *  method. Calls to .put() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def put(matcher: MockMatcher, reponse: MockResponse): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the PUT
           *  method. Calls to .put() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def put(matcher: MockMatcher, reponse: MockResponseFunction): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the PUT
           *  method. Calls to .put() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def put(matcher: MockMatcher, reponse: MockResponseFunction, options: MockOptionsMethodPut): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the PUT
           *  method. Calls to .put() can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def put(matcher: MockMatcher, reponse: MockResponse, options: MockOptionsMethodPut): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the PUT
           *  method and limited to being called one time only. Calls to .putOnce()
           *  can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def putOnce(matcher: MockMatcher, reponse: MockResponse): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the PUT
           *  method and limited to being called one time only. Calls to .putOnce()
           *  can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def putOnce(matcher: MockMatcher, reponse: MockResponseFunction): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the PUT
           *  method and limited to being called one time only. Calls to .putOnce()
           *  can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def putOnce(matcher: MockMatcher, reponse: MockResponseFunction, options: MockOptionsMethodPut): this.type = js.native
  /**
           * Replaces fetch() with a stub which records its calls, grouped by
           * route, and optionally returns a mocked Response object or passes the
           *  call through to fetch(). Shorthand for mock() restricted to the PUT
           *  method and limited to being called one time only. Calls to .putOnce()
           *  can be chained.
           * @param matcher Condition for selecting which requests to mock
           * @param response Configures the http response returned by the mock
           * @param [options] Additional properties defining the route to mock
           */
  def putOnce(matcher: MockMatcher, reponse: MockResponse, options: MockOptionsMethodPut): this.type = js.native
  /**
           * Chainable method that clears all data recorded for fetch()'s calls
           */
  def reset(): this.type = js.native
  /**
           * Chainable method that restores fetch() to its unstubbed state and
           * clears all data recorded for its calls.
           */
  def restore(): this.type = js.native
  /**
           * Returns a drop-in mock for fetch which can be passed to other mocking
           * libraries. It implements the full fetch-mock api and maintains its
           * own state independent of other instances, so tests can be run in
           * parallel.
           */
  def sandbox(): FetchMockSandbox = js.native
  /**
           * Chainable method that records the call history of unmatched calls,
           * but instead of responding with a stubbed response, the request is
           * passed through to native fetch() and is allowed to communicate
           * over the network. Similar to catch().
           */
  def spy(): this.type = js.native
  /**
           * Chainable method that records the call history of unmatched calls,
           * but instead of responding with a stubbed response, the request is
           * passed through to native fetch() and is allowed to communicate
           * over the network. Similar to catch().
           */
  def spy(response: MockResponse): this.type = js.native
  /**
           * Chainable method that records the call history of unmatched calls,
           * but instead of responding with a stubbed response, the request is
           * passed through to native fetch() and is allowed to communicate
           * over the network. Similar to catch().
           */
  def spy(response: MockResponseFunction): this.type = js.native
}

