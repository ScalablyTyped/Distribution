package typings.fetchMock.mod

import typings.fetchMock.anon.FallbackToNetwork
import typings.fetchMock.fetchMockBooleans.`false`
import typings.fetchMock.fetchMockBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchMockStatic extends js.Object {
  
  var MATCHED: `true` = js.native
  
  var UNMATCHED: `false` = js.native
  
  /**
    * Returns a Boolean indicating whether any calls to fetch matched the
    * given filter.
    * @param [filter] Allows filtering of calls to fetch based on various
    * criteria
    * @param [options] Either an object compatible with the mocking api or
    * a string specifying a http method to filter by. This will be used to
    * filter the list of calls further.
    */
  def called(): Boolean = js.native
  def called(filter: js.UndefOr[InspectionFilter], options: InspectionOptions): Boolean = js.native
  def called(filter: InspectionFilter): Boolean = js.native
  
  /**
    * Returns an array of all calls to fetch matching the given filters.
    * Each call is returned as a [url, options] array. If fetch was called
    * using a Request instance, this will be available as a request
    * property on this array.
    * @param [filter] Allows filtering of calls to fetch based on various
    * criteria
    * @param [options] Either an object compatible with the mocking api or
    * a string specifying a http method to filter by. This will be used to
    * filter the list of calls further.
    */
  def calls(): js.Array[MockCall] = js.native
  def calls(filter: js.UndefOr[InspectionFilter], options: InspectionOptions): js.Array[MockCall] = js.native
  def calls(filter: InspectionFilter): js.Array[MockCall] = js.native
  
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
  def `catch`(response: MockResponse): this.type = js.native
  def `catch`(response: MockResponseFunction): this.type = js.native
  
  var config: FallbackToNetwork = js.native
  
  /**
    * Replaces fetch() with a stub which records its calls, grouped by
    * route, and optionally returns a mocked Response object or passes the
    *  call through to fetch(). Shorthand for mock() restricted to the
    *  DELETE method. Calls to .delete() can be chained.
    * @param matcher Condition for selecting which requests to mock
    * @param response Configures the http response returned by the mock
    * @param [options] Additional properties defining the route to mock
    */
  def delete(matcher: MockMatcher, response: MockResponse): this.type = js.native
  def delete(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
  def delete(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodDelete): this.type = js.native
  def delete(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodDelete): this.type = js.native
  
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
  def deleteOnce(matcher: MockMatcher, response: MockResponse): this.type = js.native
  def deleteOnce(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
  def deleteOnce(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodDelete): this.type = js.native
  def deleteOnce(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodDelete): this.type = js.native
  
  /**
    * Returns a Boolean indicating whether fetch was called the expected
    * number of times (or has been called at least once if repeat is
    * undefined for the route).
    * @param [filter] Rule for matching calls to fetch.
    */
  def done(): Boolean = js.native
  def done(filter: InspectionFilter): Boolean = js.native
  
  /**
    * Returns a promise that resolves once all fetches handled by fetch-mock
    * have resolved.
    * @param [waitForBody] Wait for all body parsing methods(res.json(),
    * res.text(), etc.) to resolve too.
    */
  def flush(): js.Promise[js.Array[MockResponse]] = js.native
  def flush(waitForBody: Boolean): js.Promise[js.Array[MockResponse]] = js.native
  
  /**
    * Replaces fetch() with a stub which records its calls, grouped by
    * route, and optionally returns a mocked Response object or passes the
    *  call through to fetch(). Shorthand for mock() restricted to the GET
    *  method. Calls to .get() can be chained.
    * @param matcher Condition for selecting which requests to mock
    * @param response Configures the http response returned by the mock
    * @param [options] Additional properties defining the route to mock
    */
  def get(matcher: MockMatcher, response: MockResponse): this.type = js.native
  def get(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
  def get(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodGet): this.type = js.native
  def get(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodGet): this.type = js.native
  
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
  def getOnce(matcher: MockMatcher, response: MockResponse): this.type = js.native
  def getOnce(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
  def getOnce(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodGet): this.type = js.native
  def getOnce(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodGet): this.type = js.native
  
  /**
    * Replaces fetch() with a stub which records its calls, grouped by
    * route, and optionally returns a mocked Response object or passes the
    *  call through to fetch(). Shorthand for mock() restricted to the HEAD
    *  method. Calls to .head() can be chained.
    * @param matcher Condition for selecting which requests to mock
    * @param response Configures the http response returned by the mock
    * @param [options] Additional properties defining the route to mock
    */
  def head(matcher: MockMatcher, response: MockResponse): this.type = js.native
  def head(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
  def head(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodHead): this.type = js.native
  def head(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodHead): this.type = js.native
  
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
  def headOnce(matcher: MockMatcher, response: MockResponse): this.type = js.native
  def headOnce(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
  def headOnce(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodHead): this.type = js.native
  def headOnce(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodHead): this.type = js.native
  
  /**
    * Returns the arguments for the last call to fetch matching the given
    * filter.
    * @param [filter] Allows filtering of calls to fetch based on various
    * criteria
    * @param [options] Either an object compatible with the mocking api or
    * a string specifying a http method to filter by. This will be used to
    * filter the list of calls further.
    */
  def lastCall(): js.UndefOr[MockCall] = js.native
  def lastCall(filter: js.UndefOr[InspectionFilter], options: InspectionOptions): js.UndefOr[MockCall] = js.native
  def lastCall(filter: InspectionFilter): js.UndefOr[MockCall] = js.native
  
  /**
    * Returns the options for the call to fetch matching the given filter.
    * If fetch was last called using a Request instance, a set of options
    * inferred from the Request will be returned.
    * @param [filter] Allows filtering of calls to fetch based on various
    * criteria
    * @param [options] Either an object compatible with the mocking api or
    * a string specifying a http method to filter by. This will be used to
    * filter the list of calls further.
    */
  def lastOptions(): js.UndefOr[MockOptions] = js.native
  def lastOptions(filter: js.UndefOr[InspectionFilter], options: InspectionOptions): js.UndefOr[MockOptions] = js.native
  def lastOptions(filter: InspectionFilter): js.UndefOr[MockOptions] = js.native
  
  /**
    * Returns the url for the last call to fetch matching the given
    * filter. If fetch was last called using a Request instance, the url
    * will be extracted from this.
    * @param [filter] Allows filtering of calls to fetch based on various
    * criteria
    * @param [options] Either an object compatible with the mocking api or
    * a string specifying a http method to filter by. This will be used to
    * filter the list of calls further.
    */
  def lastUrl(): js.UndefOr[String] = js.native
  def lastUrl(filter: js.UndefOr[InspectionFilter], options: InspectionOptions): js.UndefOr[String] = js.native
  def lastUrl(filter: InspectionFilter): js.UndefOr[String] = js.native
  
  /**
    * Replaces fetch() with a stub which records its calls, grouped by
    * route, and optionally returns a mocked Response object or passes the
    *  call through to fetch(). Calls to .mock() can be chained.
    * @param matcher Condition for selecting which requests to mock
    * @param response Configures the http response returned by the mock
    * @param [options] Additional properties defining the route to mock
    */
  def mock(matcher: MockMatcher, response: MockResponse): this.type = js.native
  def mock(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
  def mock(matcher: MockMatcher, response: MockResponseFunction, options: MockOptions): this.type = js.native
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
  def once(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
  def once(matcher: MockMatcher, response: MockResponseFunction, options: MockOptions): this.type = js.native
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
  def patch(matcher: MockMatcher, response: MockResponse): this.type = js.native
  def patch(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
  def patch(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodHead): this.type = js.native
  def patch(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodHead): this.type = js.native
  
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
  def patchOnce(matcher: MockMatcher, response: MockResponse): this.type = js.native
  def patchOnce(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
  def patchOnce(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodHead): this.type = js.native
  def patchOnce(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodHead): this.type = js.native
  
  /**
    * Replaces fetch() with a stub which records its calls, grouped by
    * route, and optionally returns a mocked Response object or passes the
    *  call through to fetch(). Shorthand for mock() restricted to the POST
    *  method. Calls to .post() can be chained.
    * @param matcher Condition for selecting which requests to mock
    * @param response Configures the http response returned by the mock
    * @param [options] Additional properties defining the route to mock
    */
  def post(matcher: MockMatcher, response: MockResponse): this.type = js.native
  def post(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
  def post(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodPost): this.type = js.native
  def post(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodPost): this.type = js.native
  
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
  def postOnce(matcher: MockMatcher, response: MockResponse): this.type = js.native
  def postOnce(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
  def postOnce(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodPost): this.type = js.native
  def postOnce(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodPost): this.type = js.native
  
  /**
    * Replaces fetch() with a stub which records its calls, grouped by
    * route, and optionally returns a mocked Response object or passes the
    *  call through to fetch(). Shorthand for mock() restricted to the PUT
    *  method. Calls to .put() can be chained.
    * @param matcher Condition for selecting which requests to mock
    * @param response Configures the http response returned by the mock
    * @param [options] Additional properties defining the route to mock
    */
  def put(matcher: MockMatcher, response: MockResponse): this.type = js.native
  def put(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
  def put(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodPut): this.type = js.native
  def put(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodPut): this.type = js.native
  
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
  def putOnce(matcher: MockMatcher, response: MockResponse): this.type = js.native
  def putOnce(matcher: MockMatcher, response: MockResponseFunction): this.type = js.native
  def putOnce(matcher: MockMatcher, response: MockResponseFunction, options: MockOptionsMethodPut): this.type = js.native
  def putOnce(matcher: MockMatcher, response: MockResponse, options: MockOptionsMethodPut): this.type = js.native
  
  /**
    * Restores fetch() to its unstubbed state and clears all data recorded
    * for its calls. reset() is an alias for restore().
    */
  def reset(): this.type = js.native
  
  /**
    * Removes mocking behaviour without resetting call history.
    */
  def resetBehavior(): this.type = js.native
  
  /**
    * Clears all data recorded for fetch()’s calls. It will not restore
    * fetch to its default implementation.
    */
  def resetHistory(): this.type = js.native
  
  /**
    * Restores fetch() to its unstubbed state and clears all data recorded
    * for its calls. reset() is an alias for restore().
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
  def spy(response: MockResponse): this.type = js.native
  def spy(response: MockResponseFunction): this.type = js.native
}
