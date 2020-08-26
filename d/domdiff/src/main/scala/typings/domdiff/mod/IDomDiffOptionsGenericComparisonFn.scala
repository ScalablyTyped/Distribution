package typings.domdiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDomDiffOptionsGenericComparisonFn extends js.Object {
  /**
    * A callback to compare between two generic objects, each could be a node or anything. returns `true` to indicate they are the same
    */
  def compare[T1, T2](currentNode: T1, futureNode: T2): Boolean = js.native
}

object IDomDiffOptionsGenericComparisonFn {
  @scala.inline
  def apply(compare: (js.Any, js.Any) => Boolean): IDomDiffOptionsGenericComparisonFn = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare))
    __obj.asInstanceOf[IDomDiffOptionsGenericComparisonFn]
  }
  @scala.inline
  implicit class IDomDiffOptionsGenericComparisonFnOps[Self <: IDomDiffOptionsGenericComparisonFn] (val x: Self) extends AnyVal {
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
    def setCompare(value: (js.Any, js.Any) => Boolean): Self = this.set("compare", js.Any.fromFunction2(value))
  }
  
}

