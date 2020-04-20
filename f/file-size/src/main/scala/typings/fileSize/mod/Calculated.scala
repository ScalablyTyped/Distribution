package typings.fileSize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calculated extends js.Object {
  var bits: Bits
  var fixed: String
  var magnitude: Double
  var result: Double
  var suffix: String
}

object Calculated {
  @scala.inline
  def apply(bits: Bits, fixed: String, magnitude: Double, result: Double, suffix: String): Calculated = {
    val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], magnitude = magnitude.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calculated]
  }
}

