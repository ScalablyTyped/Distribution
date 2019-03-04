package typings
package doubleclickDashGptLib.googletagNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandArray extends js.Object {
  def push(f: js.Function0[scala.Unit]): scala.Double
}

object CommandArray {
  @scala.inline
  def apply(push: js.Function1[js.Function0[scala.Unit], scala.Double]): CommandArray = {
    val __obj = js.Dynamic.literal(push = push)
  
    __obj.asInstanceOf[CommandArray]
  }
}

