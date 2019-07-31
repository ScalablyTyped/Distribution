package typings.atGoogleDashCloudCommon

import typings.request.requestMod.Response
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcUtilMod {
  type AbortableDuplex = Duplexify with Abortable
  type BodyResponseCallback = js.Function3[
    /* err */ Error | ApiError | Null, 
    /* body */ js.UndefOr[ResponseBody], 
    /* res */ js.UndefOr[Response], 
    Unit
  ]
  type OnAuthenticatedCallback = js.Function2[/* err */ Error | Null, /* reqOpts */ js.UndefOr[DecorateRequestOptions], Unit]
  type ResponseBody = js.Any
}
