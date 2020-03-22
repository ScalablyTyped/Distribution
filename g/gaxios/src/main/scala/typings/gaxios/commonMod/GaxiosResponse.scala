package typings.gaxios.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaxiosResponse[T] extends js.Object {
  var config: GaxiosOptions
  var data: T
  var headers: Headers
  var request: GaxiosXMLHttpRequest
  var status: Double
  var statusText: String
}

object GaxiosResponse {
  @scala.inline
  def apply[T](
    config: GaxiosOptions,
    data: T,
    headers: Headers,
    request: GaxiosXMLHttpRequest,
    status: Double,
    statusText: String
  ): GaxiosResponse[T] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GaxiosResponse[T]]
  }
}

