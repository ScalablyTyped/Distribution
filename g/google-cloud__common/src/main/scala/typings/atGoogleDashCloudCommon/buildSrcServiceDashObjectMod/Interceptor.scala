package typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod

import typings.atGoogleDashCloudCommon.buildSrcUtilMod.DecorateRequestOptions
import typings.teenyDashRequest.teenyDashRequestMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interceptor extends js.Object {
  def request(opts: Options): DecorateRequestOptions
}

object Interceptor {
  @scala.inline
  def apply(request: Options => DecorateRequestOptions): Interceptor = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
  
    __obj.asInstanceOf[Interceptor]
  }
}

