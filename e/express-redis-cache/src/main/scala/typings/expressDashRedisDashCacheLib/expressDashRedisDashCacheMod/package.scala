package typings
package expressDashRedisDashCacheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashRedisDashCacheMod {
  type ExpirationConfig = org.scalablytyped.runtime.StringDictionary[scala.Double]
  type ExpirationPolicy = js.Function2[
    /* req */ expressLib.expressMod.Request, 
    /* res */ expressLib.expressMod.Response, 
    scala.Double
  ]
  type ExpireOption = scala.Double | ExpirationConfig
}
