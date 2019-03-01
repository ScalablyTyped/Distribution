package typings
package fpDashTsLib.libTaskMod.libHKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT[A] extends js.Object {
  var Task: fpDashTsLib.libTaskMod.Task[A]
}

object URI2HKT {
  @scala.inline
  def apply[A](Task: fpDashTsLib.libTaskMod.Task[A]): URI2HKT[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Task")(Task)
    __obj.asInstanceOf[URI2HKT[A]]
  }
}

