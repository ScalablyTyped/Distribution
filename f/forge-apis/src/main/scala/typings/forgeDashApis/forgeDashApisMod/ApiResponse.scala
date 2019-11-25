package typings.forgeDashApis.forgeDashApisMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiResponse extends js.Object {
  var body: js.Any
  var headers: StringDictionary[String]
  var statusCode: Double
}

object ApiResponse {
  @scala.inline
  def apply(body: js.Any, headers: StringDictionary[String], statusCode: Double): ApiResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApiResponse]
  }
}

