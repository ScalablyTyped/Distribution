package typings.firebaseFirestore.equalityMatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMatcher[T] extends js.Object {
  var forType: js.Function
  def equalsFn(left: T, right: T): Boolean
}

object CustomMatcher {
  @scala.inline
  def apply[T](equalsFn: (T, T) => Boolean, forType: js.Function): CustomMatcher[T] = {
    val __obj = js.Dynamic.literal(equalsFn = js.Any.fromFunction2(equalsFn), forType = forType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMatcher[T]]
  }
}

