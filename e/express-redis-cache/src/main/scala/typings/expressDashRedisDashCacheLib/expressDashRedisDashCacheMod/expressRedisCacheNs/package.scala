package typings
package expressDashRedisDashCacheLib.expressDashRedisDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressRedisCacheNs {
  type ExpirationPolicy = js.Function2[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ expressLib.expressMod.eNs.Response, 
    scala.Double
  ]
  type ExpireOption = scala.Double | ExpirationConfig
}
