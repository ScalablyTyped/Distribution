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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[GaxiosResponse[T]]
  }
}

