package typings.globule.globuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OneMapping extends js.Object {
  var dest: String
  var src: js.Array[String]
}

object OneMapping {
  @scala.inline
  def apply(dest: String, src: js.Array[String]): OneMapping = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OneMapping]
  }
}

