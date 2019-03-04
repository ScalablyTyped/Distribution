package typings
package gaxiosLib.buildSrcCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaxiosResponse[T] extends js.Object {
  var config: GaxiosOptions
  var data: T
  var headers: Headers
  var status: scala.Double
  var statusText: java.lang.String
}

object GaxiosResponse {
  @scala.inline
  def apply[T](
    config: GaxiosOptions,
    data: T,
    headers: Headers,
    status: scala.Double,
    statusText: java.lang.String
  ): GaxiosResponse[T] = {
    val __obj = js.Dynamic.literal(config = config, data = data.asInstanceOf[js.Any], headers = headers, status = status, statusText = statusText)
  
    __obj.asInstanceOf[GaxiosResponse[T]]
  }
}

