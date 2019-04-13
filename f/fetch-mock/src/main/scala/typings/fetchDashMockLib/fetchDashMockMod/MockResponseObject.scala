package typings
package fetchDashMockLib.fetchDashMockMod

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

object MockResponseObject {
  @scala.inline
  def apply(
    body: java.lang.String | js.Object = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    redirectUrl: java.lang.String = null,
    status: scala.Int | scala.Double = null,
    throws: stdLib.Error = null
  ): MockResponseObject = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (redirectUrl != null) __obj.updateDynamic("redirectUrl")(redirectUrl)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (throws != null) __obj.updateDynamic("throws")(throws)
    __obj.asInstanceOf[MockResponseObject]
  }
}

