package typings
package fpDashTsLib.es6TaskMod.es6HKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URI2HKT[A] extends js.Object {
  var Task: fpDashTsLib.es6TaskMod.Task[A]
}

object URI2HKT {
  @scala.inline
  def apply[A](Task: fpDashTsLib.es6TaskMod.Task[A]): URI2HKT[A] = {
    val __obj = js.Dynamic.literal(Task = Task)
  
    __obj.asInstanceOf[URI2HKT[A]]
  }
}

