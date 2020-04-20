package typings.freeStyle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Changes extends js.Object {
  def add(style: Container[_], index: Double): Unit
  def change(style: Container[_], oldIndex: Double, newIndex: Double): Unit
  def remove(style: Container[_], index: Double): Unit
}

object Changes {
  @scala.inline
  def apply(
    add: (Container[_], Double) => Unit,
    change: (Container[_], Double, Double) => Unit,
    remove: (Container[_], Double) => Unit
  ): Changes = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), change = js.Any.fromFunction3(change), remove = js.Any.fromFunction2(remove))
    __obj.asInstanceOf[Changes]
  }
}

