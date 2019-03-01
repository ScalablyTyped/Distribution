package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientResponse[T] extends js.Object {
  /** The HTTP headers. */
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /** Deserialized JSON object for the API response. */
  var json: T
  /** The HTTP status. */
  var status: scala.Double
}

object ClientResponse {
  @scala.inline
  def apply[T](
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    json: T,
    status: scala.Double
  ): ClientResponse[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ClientResponse[T]]
  }
}

