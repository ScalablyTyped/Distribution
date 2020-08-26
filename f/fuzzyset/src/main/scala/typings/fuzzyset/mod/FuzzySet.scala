package typings.fuzzyset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FuzzySet extends js.Object {
  def add(value: String): Boolean = js.native
  def get(candidate: String): js.Array[js.Tuple2[Double, String]] = js.native
  def isEmpty(): Boolean = js.native
  def length(): Double = js.native
  def values(): js.Array[String] = js.native
}

object FuzzySet {
  @scala.inline
  def apply(
    add: String => Boolean,
    get: String => js.Array[js.Tuple2[Double, String]],
    isEmpty: () => Boolean,
    length: () => Double,
    values: () => js.Array[String]
  ): FuzzySet = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), get = js.Any.fromFunction1(get), isEmpty = js.Any.fromFunction0(isEmpty), length = js.Any.fromFunction0(length), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[FuzzySet]
  }
  @scala.inline
  implicit class FuzzySetOps[Self <: FuzzySet] (val x: Self) extends AnyVal {
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
    def setAdd(value: String => Boolean): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: String => js.Array[js.Tuple2[Double, String]]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    @scala.inline
    def setLength(value: () => Double): Self = this.set("length", js.Any.fromFunction0(value))
    @scala.inline
    def setValues(value: () => js.Array[String]): Self = this.set("values", js.Any.fromFunction0(value))
  }
  
}

