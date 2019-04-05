package typings
package atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceObjectParent extends js.Object {
  var Promise: js.UndefOr[stdLib.PromiseConstructor] = js.undefined
  def request(
    reqOpts: atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions,
    callback: atGoogleDashCloudCommonLib.buildSrcUtilMod.BodyResponseCallback
  ): scala.Unit
  def requestStream(reqOpts: atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions): requestLib.requestMod.requestNs.Request
}

object ServiceObjectParent {
  @scala.inline
  def apply(
    request: (atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions, atGoogleDashCloudCommonLib.buildSrcUtilMod.BodyResponseCallback) => scala.Unit,
    requestStream: atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions => requestLib.requestMod.requestNs.Request,
    Promise: stdLib.PromiseConstructor = null
  ): ServiceObjectParent = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction2(request), requestStream = js.Any.fromFunction1(requestStream))
    if (Promise != null) __obj.updateDynamic("Promise")(Promise)
    __obj.asInstanceOf[ServiceObjectParent]
  }
}

