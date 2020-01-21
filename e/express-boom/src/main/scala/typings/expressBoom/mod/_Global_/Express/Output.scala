package typings.expressBoom.mod._Global_.Express

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  /**
    * headers - an object containing any HTTP headers where each key is a header name and
    * value is the header content. (Limited value type to string
    * https://github.com/hapijs/boom/issues/151 )
    */
  var headers: StringDictionary[String]
  /**
    * payload - the formatted object used as the response payload (stringified).
    * Can be directly manipulated but any changes will be lost if reformat() is called.
    * Any content allowed and by default includes the following content:
    */
  var payload: Payload
  /** statusCode - the HTTP status code (typically 4xx or 5xx). */
  var statusCode: Double
}

object Output {
  @scala.inline
  def apply(headers: StringDictionary[String], payload: Payload, statusCode: Double): Output = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Output]
  }
}

