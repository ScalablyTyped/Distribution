package typings
package fetchDashMockLib.fetchDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fetchMockNs {
  /**
       * Inspection filter. Can be one of the following:
       * boolean:
       *   * true retrieves all calls matched by fetch.
       *     fetchMock.MATCHED is an alias for true and may be used to make tests
       *     more readable.
       *   * false retrieves all calls not matched by fetch (i.e. those handled
       *     by catch() or spy(). fetchMock.UNMATCHED is an alias for false and
       *     may be used to make tests more readable.
       * MockMatcher (routeIdentifier):
       *   All routes have an identifier:
       *    * If it’s a named route, the identifier is the route’s name
       *    * If the route is unnamed, the identifier is the matcher passed in to
       *      .mock()
       *   All calls that were handled by the route with the given identifier
       *   will be retrieved
       * MockMatcher (matcher):
       *   Any matcher compatible with the mocking api can be passed in to filter
       *   the calls arbitrarily.
       */
  type InspectionFilter = MockMatcher | scala.Boolean
  /**
       * Either an object compatible with the mocking api or a string specifying
       * a http method to filter by. This will be used to filter the list of
       * calls further.
       */
  type InspectionOptions = MockOptions | java.lang.String
  /**
       * Mock matcher. Can be one of following:
       * string: Either
       *   * an exact url to match e.g. 'http://www.site.com/page.html'
       *   * if the string begins with a `^`, the string following the `^` must
       *     begin the url e.g. '^http://www.site.com' would match
       *      'http://www.site.com' or 'http://www.site.com/page.html'
       *    * '*' to match any url
       * RegExp: A regular expression to test the url against
       * Function(url, opts): A function (returning a Boolean) that is passed the
       *  url and opts fetch() is called with (or, if fetch() was called with one,
       *  the Request instance)
       */
  type MockMatcher = java.lang.String | stdLib.RegExp | MockMatcherFunction
  /**
       * Mock matcher function
       */
  type MockMatcherFunction = js.Function2[/* url */ java.lang.String, /* opts */ MockRequest, scala.Boolean]
  type MockRequest = stdLib.Request | stdLib.RequestInit
  /**
       * Response: A Response instance - will be used unaltered
       * number: Creates a response with this status
       * string: Creates a 200 response with the string as the response body
       * object: As long as the object is not a MockResponseObject it is
       *  converted into a json string and returned as the body of a 200 response
       * If MockResponseObject was given then it's used to configure response
       * Function(url, opts): A function that is passed the url and opts fetch()
       *  is called with and that returns any of the responses listed above
       */
  type MockResponse = stdLib.Response | js.Promise[stdLib.Response] | scala.Double | js.Promise[scala.Double] | java.lang.String | js.Promise[java.lang.String] | js.Object | js.Promise[js.Object] | MockResponseObject | js.Promise[MockResponseObject]
  /**
       * Mock response function
       */
  type MockResponseFunction = js.Function2[/* url */ java.lang.String, /* opts */ MockRequest, MockResponse]
}
