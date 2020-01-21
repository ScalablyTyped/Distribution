package typings.firmata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Port extends js.Object {
  var comName: String
}

object Port {
  @scala.inline
  def apply(comName: String): Port = {
    val __obj = js.Dynamic.literal(comName = comName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Port]
  }
}

