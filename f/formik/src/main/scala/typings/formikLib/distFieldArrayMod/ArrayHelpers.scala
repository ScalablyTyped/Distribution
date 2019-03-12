package typings
package formikLib.distFieldArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayHelpers extends js.Object {
  def handleInsert(index: scala.Double, value: js.Any): js.Function0[scala.Unit]
  def handleMove(from: scala.Double, to: scala.Double): js.Function0[scala.Unit]
  def handlePop(): js.Function0[scala.Unit]
  def handlePush(obj: js.Any): js.Function0[scala.Unit]
  def handleRemove(index: scala.Double): js.Function0[scala.Unit]
  def handleReplace(index: scala.Double, value: js.Any): js.Function0[scala.Unit]
  def handleSwap(indexA: scala.Double, indexB: scala.Double): js.Function0[scala.Unit]
  def handleUnshift(value: js.Any): js.Function0[scala.Unit]
  def insert(index: scala.Double, value: js.Any): scala.Unit
  def move(from: scala.Double, to: scala.Double): scala.Unit
  def pop[T](): js.UndefOr[T]
  def push(obj: js.Any): scala.Unit
  def remove[T](index: scala.Double): js.UndefOr[T]
  def replace(index: scala.Double, value: js.Any): scala.Unit
  def swap(indexA: scala.Double, indexB: scala.Double): scala.Unit
  def unshift(value: js.Any): scala.Double
}

object ArrayHelpers {
  @scala.inline
  def apply(
    handleInsert: (scala.Double, js.Any) => js.Function0[scala.Unit],
    handleMove: (scala.Double, scala.Double) => js.Function0[scala.Unit],
    handlePop: () => js.Function0[scala.Unit],
    handlePush: js.Any => js.Function0[scala.Unit],
    handleRemove: scala.Double => js.Function0[scala.Unit],
    handleReplace: (scala.Double, js.Any) => js.Function0[scala.Unit],
    handleSwap: (scala.Double, scala.Double) => js.Function0[scala.Unit],
    handleUnshift: js.Any => js.Function0[scala.Unit],
    insert: (scala.Double, js.Any) => scala.Unit,
    move: (scala.Double, scala.Double) => scala.Unit,
    pop: () => js.UndefOr[js.Any],
    push: js.Any => scala.Unit,
    remove: scala.Double => js.UndefOr[js.Any],
    replace: (scala.Double, js.Any) => scala.Unit,
    swap: (scala.Double, scala.Double) => scala.Unit,
    unshift: js.Any => scala.Double
  ): ArrayHelpers = {
    val __obj = js.Dynamic.literal(handleInsert = js.Any.fromFunction2(handleInsert), handleMove = js.Any.fromFunction2(handleMove), handlePop = js.Any.fromFunction0(handlePop), handlePush = js.Any.fromFunction1(handlePush), handleRemove = js.Any.fromFunction1(handleRemove), handleReplace = js.Any.fromFunction2(handleReplace), handleSwap = js.Any.fromFunction2(handleSwap), handleUnshift = js.Any.fromFunction1(handleUnshift), insert = js.Any.fromFunction2(insert), move = js.Any.fromFunction2(move), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), remove = js.Any.fromFunction1(remove), replace = js.Any.fromFunction2(replace), swap = js.Any.fromFunction2(swap), unshift = js.Any.fromFunction1(unshift))
  
    __obj.asInstanceOf[ArrayHelpers]
  }
}

