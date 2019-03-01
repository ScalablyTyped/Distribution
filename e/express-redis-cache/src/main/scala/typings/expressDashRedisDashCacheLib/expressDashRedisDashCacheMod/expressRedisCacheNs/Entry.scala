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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("expire")(expire)
    __obj.updateDynamic("touched")(touched)
    __obj.asInstanceOf[Entry]
  }
}

