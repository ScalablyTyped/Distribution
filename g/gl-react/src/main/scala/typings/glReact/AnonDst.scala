package typings.glReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDst extends js.Object {
  def dst(): Unit
  def src(): Unit
}

object AnonDst {
  @scala.inline
  def apply(dst: () => Unit, src: () => Unit): AnonDst = {
    val __obj = js.Dynamic.literal(dst = js.Any.fromFunction0(dst), src = js.Any.fromFunction0(src))
  
    __obj.asInstanceOf[AnonDst]
  }
}

