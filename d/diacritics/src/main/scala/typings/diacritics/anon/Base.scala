package typings.diacritics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  var base: String
  var chars: String
}

object Base {
  @scala.inline
  def apply(base: String, chars: String): Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], chars = chars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}

