package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCharIndex extends js.Object {
  var charIndex: Double
  var lineIndex: Double
}

object AnonCharIndex {
  @scala.inline
  def apply(charIndex: Double, lineIndex: Double): AnonCharIndex = {
    val __obj = js.Dynamic.literal(charIndex = charIndex.asInstanceOf[js.Any], lineIndex = lineIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCharIndex]
  }
}

