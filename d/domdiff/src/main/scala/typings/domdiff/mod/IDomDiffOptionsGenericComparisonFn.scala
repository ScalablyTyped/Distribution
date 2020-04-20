package typings.domdiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDomDiffOptionsGenericComparisonFn extends js.Object {
  /**
    * A callback to compare between two generic objects, each could be a node or anything. returns `true` to indicate they are the same
    */
  def compare[T1, T2](currentNode: T1, futureNode: T2): Boolean
}

object IDomDiffOptionsGenericComparisonFn {
  @scala.inline
  def apply(compare: (js.Any, js.Any) => Boolean): IDomDiffOptionsGenericComparisonFn = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare))
    __obj.asInstanceOf[IDomDiffOptionsGenericComparisonFn]
  }
}

