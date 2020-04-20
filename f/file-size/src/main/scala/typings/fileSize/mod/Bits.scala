package typings.fileSize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bits extends js.Object {
  var fixed: String
  var result: Double
}

object Bits {
  @scala.inline
  def apply(fixed: String, result: Double): Bits = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bits]
  }
}

