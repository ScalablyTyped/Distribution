package typings.eqJs.eq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EqjsKeyValuePair extends js.Object {
  var key: String
  var value: Double
}

object EqjsKeyValuePair {
  @scala.inline
  def apply(key: String, value: Double): EqjsKeyValuePair = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqjsKeyValuePair]
  }
}

