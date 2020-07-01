package typings.errCode.anon

import typings.std.BigInt
import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  var code: NonNullable[BigInt]
}

object `1` {
  @scala.inline
  def apply(code: NonNullable[BigInt]): `1` = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

