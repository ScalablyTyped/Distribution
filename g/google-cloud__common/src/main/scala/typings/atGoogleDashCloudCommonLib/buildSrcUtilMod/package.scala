package typings
package atGoogleDashCloudCommonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcUtilMod {
  type AbortableDuplex = duplexifyLib.duplexifyMod.duplexifyNs.Duplexify with Abortable
  type BodyResponseCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* body */ js.UndefOr[ResponseBody], 
    /* res */ js.UndefOr[requestLib.requestMod.requestNs.Response], 
    scala.Unit
  ]
  type OnAuthenticatedCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* reqOpts */ js.UndefOr[DecorateRequestOptions], 
    scala.Unit
  ]
  type ResponseBody = js.Any
}
