package typings.glDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dst extends js.Object {
  def dst(): Unit
  def src(): Unit
}

object Anon_Dst {
  @scala.inline
  def apply(dst: () => Unit, src: () => Unit): Anon_Dst = {
    val __obj = js.Dynamic.literal(dst = js.Any.fromFunction0(dst), src = js.Any.fromFunction0(src))
  
    __obj.asInstanceOf[Anon_Dst]
  }
}

