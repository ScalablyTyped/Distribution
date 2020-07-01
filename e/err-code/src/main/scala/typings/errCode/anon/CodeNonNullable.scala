package typings.errCode.anon

import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeNonNullable extends js.Object {
  var code: NonNullable[String]
}

object CodeNonNullable {
  @scala.inline
  def apply(code: NonNullable[String]): CodeNonNullable = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeNonNullable]
  }
}

