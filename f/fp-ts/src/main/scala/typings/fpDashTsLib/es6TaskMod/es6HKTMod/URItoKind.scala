package typings
package fpDashTsLib.es6TaskMod.es6HKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URItoKind[A] extends js.Object {
  var Task: fpDashTsLib.es6TaskMod.Task[A]
}

object URItoKind {
  @scala.inline
  def apply[A](Task: fpDashTsLib.es6TaskMod.Task[A]): URItoKind[A] = {
    val __obj = js.Dynamic.literal(Task = Task)
  
    __obj.asInstanceOf[URItoKind[A]]
  }
}

