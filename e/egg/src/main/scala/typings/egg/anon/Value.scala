package typings.egg.anon

import typings.egg.eggStrings.DENY
import typings.egg.eggStrings.SAMEORIGIN
import typings.egg.eggStrings.`ALLOW-FROM`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var enable: Boolean
  var value: SAMEORIGIN | DENY | `ALLOW-FROM`
}

object Value {
  @scala.inline
  def apply(enable: Boolean, value: SAMEORIGIN | DENY | `ALLOW-FROM`): Value = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

