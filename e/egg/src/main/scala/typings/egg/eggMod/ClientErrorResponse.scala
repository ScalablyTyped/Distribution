package typings.egg.eggMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientErrorResponse extends js.Object {
  var body: String | Buffer
  var headers: StringDictionary[String]
  var status: Double
}

object ClientErrorResponse {
  @scala.inline
  def apply(body: String | Buffer, headers: StringDictionary[String], status: Double): ClientErrorResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers, status = status)
  
    __obj.asInstanceOf[ClientErrorResponse]
  }
}

