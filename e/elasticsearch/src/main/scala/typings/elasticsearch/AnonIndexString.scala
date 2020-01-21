package typings.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndexString extends js.Object {
  var index: String
}

object AnonIndexString {
  @scala.inline
  def apply(index: String): AnonIndexString = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIndexString]
  }
}

