package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientErrorResponse extends js.Object {
  var body: java.lang.String | nodeLib.Buffer
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var status: scala.Double
}

object ClientErrorResponse {
  @scala.inline
  def apply(
    body: java.lang.String | nodeLib.Buffer,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    status: scala.Double
  ): ClientErrorResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers, status = status)
  
    __obj.asInstanceOf[ClientErrorResponse]
  }
}

