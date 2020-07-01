package typings.googleSpreadsheet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Insert extends js.Object {
  var insert: Boolean
  var raw: Boolean
}

object Insert {
  @scala.inline
  def apply(insert: Boolean, raw: Boolean): Insert = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Insert]
  }
}

