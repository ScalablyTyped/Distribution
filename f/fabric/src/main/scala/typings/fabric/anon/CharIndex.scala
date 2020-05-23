package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharIndex extends js.Object {
  var charIndex: Double
  var lineIndex: Double
}

object CharIndex {
  @scala.inline
  def apply(charIndex: Double, lineIndex: Double): CharIndex = {
    val __obj = js.Dynamic.literal(charIndex = charIndex.asInstanceOf[js.Any], lineIndex = lineIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharIndex]
  }
}

