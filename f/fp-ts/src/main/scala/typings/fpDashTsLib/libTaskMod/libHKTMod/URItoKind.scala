package typings
package fpDashTsLib.libTaskMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind[A] extends js.Object {
  var Task: fpDashTsLib.libTaskMod.Task[A]
}

object URItoKind {
  @scala.inline
  def apply[A](Task: fpDashTsLib.libTaskMod.Task[A]): URItoKind[A] = {
    val __obj = js.Dynamic.literal(Task = Task)
  
    __obj.asInstanceOf[URItoKind[A]]
  }
}

