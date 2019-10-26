package typings.googleapisDashCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcApiMod {
  import typings.gaxios.buildSrcCommonMod.GaxiosResponse
  import typings.googleapisDashCommon.buildSrcEndpointMod.Endpoint
  import typings.std.Error

  type APIEndpoint = Endpoint with js.Any
  type BodyResponseCallback[T] = js.Function2[/* err */ Error | Null, /* res */ js.UndefOr[GaxiosResponse[T] | Null], Unit]
}
