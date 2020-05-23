package typings.ethersprojectBytes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hexable extends js.Object {
  def toHexString(): String
}

object Hexable {
  @scala.inline
  def apply(toHexString: () => String): Hexable = {
    val __obj = js.Dynamic.literal(toHexString = js.Any.fromFunction0(toHexString))
    __obj.asInstanceOf[Hexable]
  }
}

