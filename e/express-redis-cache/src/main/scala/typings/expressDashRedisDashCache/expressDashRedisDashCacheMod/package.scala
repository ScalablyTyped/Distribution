package typings.expressDashRedisDashCache

import org.scalablytyped.runtime.StringDictionary
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashRedisDashCacheMod {
  type ExpirationConfig = StringDictionary[Double]
  type ExpirationPolicy = js.Function2[/* req */ Request, /* res */ Response, Double]
  type ExpireOption = Double | ExpirationConfig
}
