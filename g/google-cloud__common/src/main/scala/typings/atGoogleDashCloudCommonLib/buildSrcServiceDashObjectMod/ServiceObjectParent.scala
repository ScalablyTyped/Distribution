package typings
package atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceObjectParent extends js.Object {
  var Promise: js.UndefOr[stdLib.PromiseConstructor] = js.undefined
  var requestModule: js.UndefOr[
    atGoogleDashCloudCommonLib.Anon_Request with (requestLib.requestMod.requestNs.RequestAPI[
      requestLib.requestMod.requestNs.Request, 
      requestLib.requestMod.requestNs.CoreOptions, 
      requestLib.requestMod.requestNs.RequiredUriUrl
    ])
  ] = js.undefined
  def request(
    reqOpts: atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions,
    callback: atGoogleDashCloudCommonLib.buildSrcUtilMod.BodyResponseCallback
  ): scala.Unit
  def requestStream(reqOpts: atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions): requestLib.requestMod.requestNs.Request
}

object ServiceObjectParent {
  @scala.inline
  def apply(
    request: js.Function2[
      atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions, 
      atGoogleDashCloudCommonLib.buildSrcUtilMod.BodyResponseCallback, 
      scala.Unit
    ],
    requestStream: js.Function1[
      atGoogleDashCloudCommonLib.buildSrcUtilMod.DecorateRequestOptions, 
      requestLib.requestMod.requestNs.Request
    ],
    Promise: stdLib.PromiseConstructor = null,
    requestModule: atGoogleDashCloudCommonLib.Anon_Request with (requestLib.requestMod.requestNs.RequestAPI[
      requestLib.requestMod.requestNs.Request, 
      requestLib.requestMod.requestNs.CoreOptions, 
      requestLib.requestMod.requestNs.RequiredUriUrl
    ]) = null
  ): ServiceObjectParent = {
    val __obj = js.Dynamic.literal(request = request, requestStream = requestStream)
    if (Promise != null) __obj.updateDynamic("Promise")(Promise)
    if (requestModule != null) __obj.updateDynamic("requestModule")(requestModule)
    __obj.asInstanceOf[ServiceObjectParent]
  }
}

