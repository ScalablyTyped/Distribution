package typings
package freeDashStyleLib.freeDashStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Changes extends js.Object {
  def add(style: Container[_], index: scala.Double): scala.Unit
  def change(style: Container[_], oldIndex: scala.Double, newIndex: scala.Double): scala.Unit
  def remove(style: Container[_], index: scala.Double): scala.Unit
}

object Changes {
  @scala.inline
  def apply(
    add: (Container[_], scala.Double) => scala.Unit,
    change: (Container[_], scala.Double, scala.Double) => scala.Unit,
    remove: (Container[_], scala.Double) => scala.Unit
  ): Changes = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), change = js.Any.fromFunction3(change), remove = js.Any.fromFunction2(remove))
  
    __obj.asInstanceOf[Changes]
  }
}

