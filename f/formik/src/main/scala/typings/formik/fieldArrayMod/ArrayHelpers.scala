package typings.formik.fieldArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayHelpers extends js.Object {
  /** Curried fn to insert an element at a given index into the array */
  def handleInsert(index: Double, value: js.Any): js.Function0[Unit]
  /** Imperatively move an element in an array to another index */
  def handleMove(from: Double, to: Double): js.Function0[Unit]
  /** Curried fn to remove a value from the end of the array */
  def handlePop(): js.Function0[Unit]
  /** Curried fn to add a value to the end of an array */
  def handlePush(obj: js.Any): js.Function0[Unit]
  /** Curried fn to remove an element at an index of an array */
  def handleRemove(index: Double): js.Function0[Unit]
  /** Curried fn to replace an element at a given index into the array */
  def handleReplace(index: Double, value: js.Any): js.Function0[Unit]
  /** Curried fn to swap two values in an array */
  def handleSwap(indexA: Double, indexB: Double): js.Function0[Unit]
  /** Curried fn to add an element to the beginning of an array */
  def handleUnshift(value: js.Any): js.Function0[Unit]
  /** Imperatively insert an element at a given index into the array */
  def insert(index: Double, value: js.Any): Unit
  /** Imperatively move an element in an array to another index */
  def move(from: Double, to: Double): Unit
  /** Imperatively remove and return value from the end of the array */
  def pop[T](): js.UndefOr[T]
  /** Imperatively add a value to the end of an array */
  def push(obj: js.Any): Unit
  /** Imperatively remove and element at an index of an array */
  def remove[T](index: Double): js.UndefOr[T]
  /** Imperatively replace a value at an index of an array  */
  def replace(index: Double, value: js.Any): Unit
  /** Imperatively swap two values in an array */
  def swap(indexA: Double, indexB: Double): Unit
  /** Imperatively add an element to the beginning of an array and return its length */
  def unshift(value: js.Any): Double
}

object ArrayHelpers {
  @scala.inline
  def apply(
    handleInsert: (Double, js.Any) => js.Function0[Unit],
    handleMove: (Double, Double) => js.Function0[Unit],
    handlePop: () => js.Function0[Unit],
    handlePush: js.Any => js.Function0[Unit],
    handleRemove: Double => js.Function0[Unit],
    handleReplace: (Double, js.Any) => js.Function0[Unit],
    handleSwap: (Double, Double) => js.Function0[Unit],
    handleUnshift: js.Any => js.Function0[Unit],
    insert: (Double, js.Any) => Unit,
    move: (Double, Double) => Unit,
    pop: () => js.UndefOr[js.Any],
    push: js.Any => Unit,
    remove: Double => js.UndefOr[js.Any],
    replace: (Double, js.Any) => Unit,
    swap: (Double, Double) => Unit,
    unshift: js.Any => Double
  ): ArrayHelpers = {
    val __obj = js.Dynamic.literal(handleInsert = js.Any.fromFunction2(handleInsert), handleMove = js.Any.fromFunction2(handleMove), handlePop = js.Any.fromFunction0(handlePop), handlePush = js.Any.fromFunction1(handlePush), handleRemove = js.Any.fromFunction1(handleRemove), handleReplace = js.Any.fromFunction2(handleReplace), handleSwap = js.Any.fromFunction2(handleSwap), handleUnshift = js.Any.fromFunction1(handleUnshift), insert = js.Any.fromFunction2(insert), move = js.Any.fromFunction2(move), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), remove = js.Any.fromFunction1(remove), replace = js.Any.fromFunction2(replace), swap = js.Any.fromFunction2(swap), unshift = js.Any.fromFunction1(unshift))
    __obj.asInstanceOf[ArrayHelpers]
  }
}

