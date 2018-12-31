package typings
package fetchDashMockLib.fetchDashMockMod.fetchMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mock response object
  */
trait MockResponseObject extends js.Object {
  /**
    * Set the response body
    */
  var body: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
    * Set the response headers.
    */
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * The URL the response should be from (to imitate followed redirects
    *  - will set redirected: true on the response)
    */
  var redirectUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set the response status
    * @default 200
    */
  var status: js.UndefOr[scala.Double] = js.undefined
  /**
    * If this property is present then a Promise rejected with the value
    * of throws is returned
    */
  var throws: js.UndefOr[stdLib.Error] = js.undefined
}

