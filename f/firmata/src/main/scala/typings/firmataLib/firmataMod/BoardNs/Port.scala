package typings
package firmataLib.firmataMod.BoardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Port extends js.Object {
  var comName: java.lang.String
}

object Port {
  @scala.inline
  def apply(comName: java.lang.String): Port = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("comName")(comName)
    __obj.asInstanceOf[Port]
  }
}

