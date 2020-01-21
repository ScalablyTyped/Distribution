package typings.dot.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends js.Object {
  def encodeHTML(): java.lang.String
}

object String {
  @scala.inline
  def apply(encodeHTML: () => java.lang.String): String = {
    val __obj = js.Dynamic.literal(encodeHTML = js.Any.fromFunction0(encodeHTML))
  
    __obj.asInstanceOf[String]
  }
}

