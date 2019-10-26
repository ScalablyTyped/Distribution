package typings.googleapisDashCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcDiscoveryMod {
  import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
  import typings.googleapisDashCommon.buildSrcEndpointMod.Endpoint

  type EndpointCreator = js.Function2[/* options */ GlobalOptions, /* google */ js.Object, Endpoint]
}
