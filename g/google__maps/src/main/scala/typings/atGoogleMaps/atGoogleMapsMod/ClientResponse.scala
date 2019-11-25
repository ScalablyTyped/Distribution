package typings.atGoogleMaps.atGoogleMapsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientResponse[T] extends js.Object {
  /** The HTTP headers. */
  var headers: StringDictionary[String]
  /** Deserialized JSON object for the API response. */
  var json: T
  /** The HTTP status. */
  var status: Double
}

object ClientResponse {
  @scala.inline
  def apply[T](headers: StringDictionary[String], json: T, status: Double): ClientResponse[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientResponse[T]]
  }
}

