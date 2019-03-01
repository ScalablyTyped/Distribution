package typings
package extsprintfLib.extsprintfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream extends js.Object {
  def write(str: java.lang.String): scala.Unit
}

object Stream {
  @scala.inline
  def apply(write: js.Function1[java.lang.String, scala.Unit]): Stream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[Stream]
  }
}

