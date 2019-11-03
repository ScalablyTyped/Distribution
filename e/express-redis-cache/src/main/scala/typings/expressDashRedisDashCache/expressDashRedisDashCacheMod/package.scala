package typings.expressDashRedisDashCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashRedisDashCacheMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.express.expressMod.Request
  import typings.express.expressMod.Response
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary

  type ExpirationConfig = StringDictionary[Double]
  type ExpirationPolicy = js.Function2[/* req */ Request[ParamsDictionary], /* res */ Response, Double]
  type ExpireOption = Double | ExpirationConfig
}
