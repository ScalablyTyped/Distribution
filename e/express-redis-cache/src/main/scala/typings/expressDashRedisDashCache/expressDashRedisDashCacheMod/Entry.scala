package typings.expressDashRedisDashCache.expressDashRedisDashCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var body: String
  var expire: Double
  var touched: Double
  var `type`: String
}

object Entry {
  @scala.inline
  def apply(body: String, expire: Double, touched: Double, `type`: String): Entry = {
    val __obj = js.Dynamic.literal(body = body, expire = expire, touched = touched)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Entry]
  }
}

