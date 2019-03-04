package typings
package expressDashRedisDashCacheLib.expressDashRedisDashCacheMod.expressRedisCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var body: java.lang.String
  var expire: scala.Double
  var touched: scala.Double
  var `type`: java.lang.String
}

object Entry {
  @scala.inline
  def apply(body: java.lang.String, expire: scala.Double, touched: scala.Double, `type`: java.lang.String): Entry = {
    val __obj = js.Dynamic.literal(body = body, expire = expire, touched = touched)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Entry]
  }
}

