package typings
package atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interceptor extends js.Object {
  def request(opts: requestLib.requestMod.requestNs.Options): atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions
}

object Interceptor {
  @scala.inline
  def apply(
    request: js.Function1[
      requestLib.requestMod.requestNs.Options, 
      atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions
    ]
  ): Interceptor = {
    val __obj = js.Dynamic.literal(request = request)
  
    __obj.asInstanceOf[Interceptor]
  }
}

