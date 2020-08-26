package typings.formik.fieldArrayMod

import typings.formik.typesMod.FormikProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined formik.formik/dist/FieldArray.ArrayHelpers & {  form :formik.formik/dist/types.FormikProps<any>,   name :string} */
@js.native
trait FieldArrayRenderProps extends js.Object {
  var form: FormikProps[_] = js.native
  var name: String = js.native
  /** Curried fn to insert an element at a given index into the array */
  def handleInsert(index: Double, value: js.Any): js.Function0[Unit] = js.native
  /** Imperatively move an element in an array to another index */
  def handleMove(from: Double, to: Double): js.Function0[Unit] = js.native
  /** Curried fn to remove a value from the end of the array */
  def handlePop(): js.Function0[Unit] = js.native
  /** Curried fn to add a value to the end of an array */
  def handlePush(obj: js.Any): js.Function0[Unit] = js.native
  /** Curried fn to remove an element at an index of an array */
  def handleRemove(index: Double): js.Function0[Unit] = js.native
  /** Curried fn to replace an element at a given index into the array */
  def handleReplace(index: Double, value: js.Any): js.Function0[Unit] = js.native
  /** Curried fn to swap two values in an array */
  def handleSwap(indexA: Double, indexB: Double): js.Function0[Unit] = js.native
  /** Curried fn to add an element to the beginning of an array */
  def handleUnshift(value: js.Any): js.Function0[Unit] = js.native
  /** Imperatively insert an element at a given index into the array */
  def insert(index: Double, value: js.Any): Unit = js.native
  /** Imperatively move an element in an array to another index */
  def move(from: Double, to: Double): Unit = js.native
  /** Imperatively remove and return value from the end of the array */
  def pop[T](): js.UndefOr[T] = js.native
  /** Imperatively add a value to the end of an array */
  def push(obj: js.Any): Unit = js.native
  /** Imperatively remove and element at an index of an array */
  def remove[T](index: Double): js.UndefOr[T] = js.native
  /** Imperatively replace a value at an index of an array  */
  def replace(index: Double, value: js.Any): Unit = js.native
  /** Imperatively swap two values in an array */
  def swap(indexA: Double, indexB: Double): Unit = js.native
  /** Imperatively add an element to the beginning of an array and return its length */
  def unshift(value: js.Any): Double = js.native
}

object FieldArrayRenderProps {
  @scala.inline
  def apply(
    form: FormikProps[_],
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
    name: String,
    pop: () => js.UndefOr[js.Any],
    push: js.Any => Unit,
    remove: Double => js.UndefOr[js.Any],
    replace: (Double, js.Any) => Unit,
    swap: (Double, Double) => Unit,
    unshift: js.Any => Double
  ): FieldArrayRenderProps = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], handleInsert = js.Any.fromFunction2(handleInsert), handleMove = js.Any.fromFunction2(handleMove), handlePop = js.Any.fromFunction0(handlePop), handlePush = js.Any.fromFunction1(handlePush), handleRemove = js.Any.fromFunction1(handleRemove), handleReplace = js.Any.fromFunction2(handleReplace), handleSwap = js.Any.fromFunction2(handleSwap), handleUnshift = js.Any.fromFunction1(handleUnshift), insert = js.Any.fromFunction2(insert), move = js.Any.fromFunction2(move), name = name.asInstanceOf[js.Any], pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), remove = js.Any.fromFunction1(remove), replace = js.Any.fromFunction2(replace), swap = js.Any.fromFunction2(swap), unshift = js.Any.fromFunction1(unshift))
    __obj.asInstanceOf[FieldArrayRenderProps]
  }
  @scala.inline
  implicit class FieldArrayRenderPropsOps[Self <: FieldArrayRenderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForm(value: FormikProps[_]): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandleInsert(value: (Double, js.Any) => js.Function0[Unit]): Self = this.set("handleInsert", js.Any.fromFunction2(value))
    @scala.inline
    def setHandleMove(value: (Double, Double) => js.Function0[Unit]): Self = this.set("handleMove", js.Any.fromFunction2(value))
    @scala.inline
    def setHandlePop(value: () => js.Function0[Unit]): Self = this.set("handlePop", js.Any.fromFunction0(value))
    @scala.inline
    def setHandlePush(value: js.Any => js.Function0[Unit]): Self = this.set("handlePush", js.Any.fromFunction1(value))
    @scala.inline
    def setHandleRemove(value: Double => js.Function0[Unit]): Self = this.set("handleRemove", js.Any.fromFunction1(value))
    @scala.inline
    def setHandleReplace(value: (Double, js.Any) => js.Function0[Unit]): Self = this.set("handleReplace", js.Any.fromFunction2(value))
    @scala.inline
    def setHandleSwap(value: (Double, Double) => js.Function0[Unit]): Self = this.set("handleSwap", js.Any.fromFunction2(value))
    @scala.inline
    def setHandleUnshift(value: js.Any => js.Function0[Unit]): Self = this.set("handleUnshift", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: (Double, js.Any) => Unit): Self = this.set("insert", js.Any.fromFunction2(value))
    @scala.inline
    def setMove(value: (Double, Double) => Unit): Self = this.set("move", js.Any.fromFunction2(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPop(value: () => js.UndefOr[js.Any]): Self = this.set("pop", js.Any.fromFunction0(value))
    @scala.inline
    def setPush(value: js.Any => Unit): Self = this.set("push", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: Double => js.UndefOr[js.Any]): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setReplace(value: (Double, js.Any) => Unit): Self = this.set("replace", js.Any.fromFunction2(value))
    @scala.inline
    def setSwap(value: (Double, Double) => Unit): Self = this.set("swap", js.Any.fromFunction2(value))
    @scala.inline
    def setUnshift(value: js.Any => Double): Self = this.set("unshift", js.Any.fromFunction1(value))
  }
  
}

