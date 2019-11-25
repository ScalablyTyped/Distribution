package typings.fetchDashMock.fetchDashMockMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
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
  var body: js.UndefOr[String | js.Object] = js.undefined
  /**
    * Set the response headers.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * The URL the response should be from (to imitate followed redirects
    *  - will set redirected: true on the response)
    */
  var redirectUrl: js.UndefOr[String] = js.undefined
  /**
    * Set the response status
    * @default 200
    */
  var status: js.UndefOr[Double] = js.undefined
  /**
    * If this property is present then a Promise rejected with the value
    * of throws is returned
    */
  var throws: js.UndefOr[Error] = js.undefined
}

object MockResponseObject {
  @scala.inline
  def apply(
    body: String | js.Object = null,
    headers: StringDictionary[String] = null,
    redirectUrl: String = null,
    status: Int | Double = null,
    throws: Error = null
  ): MockResponseObject = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (redirectUrl != null) __obj.updateDynamic("redirectUrl")(redirectUrl.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (throws != null) __obj.updateDynamic("throws")(throws.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockResponseObject]
  }
}

