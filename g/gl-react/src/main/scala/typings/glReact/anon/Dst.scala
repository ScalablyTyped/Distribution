package typings.glReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dst extends js.Object {
  def dst(): Unit
  def src(): Unit
}

object Dst {
  @scala.inline
  def apply(dst: () => Unit, src: () => Unit): Dst = {
    val __obj = js.Dynamic.literal(dst = js.Any.fromFunction0(dst), src = js.Any.fromFunction0(src))
    __obj.asInstanceOf[Dst]
  }
}

