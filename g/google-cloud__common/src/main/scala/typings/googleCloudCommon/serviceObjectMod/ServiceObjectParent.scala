package typings.googleCloudCommon.serviceObjectMod

import typings.googleCloudCommon.utilMod.BodyResponseCallback
import typings.googleCloudCommon.utilMod.DecorateRequestOptions
import typings.std.PromiseConstructor
import typings.teenyRequest.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceObjectParent extends js.Object {
  var Promise: js.UndefOr[PromiseConstructor] = js.undefined
  def request(reqOpts: DecorateRequestOptions, callback: BodyResponseCallback): Unit
  def requestStream(reqOpts: DecorateRequestOptions): Request
}

object ServiceObjectParent {
  @scala.inline
  def apply(
    request: (DecorateRequestOptions, BodyResponseCallback) => Unit,
    requestStream: DecorateRequestOptions => Request,
    Promise: PromiseConstructor = null
  ): ServiceObjectParent = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction2(request), requestStream = js.Any.fromFunction1(requestStream))
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceObjectParent]
  }
}

