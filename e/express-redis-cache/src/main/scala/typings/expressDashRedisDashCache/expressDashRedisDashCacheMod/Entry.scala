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
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
}

