package typings.gaxios.buildSrcCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaxiosResponse[T] extends js.Object {
  var config: GaxiosOptions
  var data: T
  var headers: Headers
  var status: Double
  var statusText: String
}

object GaxiosResponse {
  @scala.inline
  def apply[T](config: GaxiosOptions, data: T, headers: Headers, status: Double, statusText: String): GaxiosResponse[T] = {
    val __obj = js.Dynamic.literal(config = config, data = data.asInstanceOf[js.Any], headers = headers, status = status, statusText = statusText)
  
    __obj.asInstanceOf[GaxiosResponse[T]]
  }
}

