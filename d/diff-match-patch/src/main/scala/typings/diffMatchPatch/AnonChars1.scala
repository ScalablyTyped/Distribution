package typings.diffMatchPatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChars1 extends js.Object {
  var chars1: String
  var chars2: String
  var lineArray: js.Array[String]
}

object AnonChars1 {
  @scala.inline
  def apply(chars1: String, chars2: String, lineArray: js.Array[String]): AnonChars1 = {
    val __obj = js.Dynamic.literal(chars1 = chars1.asInstanceOf[js.Any], chars2 = chars2.asInstanceOf[js.Any], lineArray = lineArray.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChars1]
  }
}

